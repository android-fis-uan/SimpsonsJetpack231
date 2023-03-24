package co.edu.uan.android.simpsonsjetpack0323

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CharacterListViewModel() : ViewModel() {

    val simpsonsCharacters = arrayListOf<String>("Lisa","Bart","Homer")
    var selectedCharacter: Int = 0
    var currentCharacter = MutableLiveData<String>("Lisa")


    fun loadCharacters() {
        simpsonsCharacters.add("Lisa")
        simpsonsCharacters.add("Bart")
    }

    fun nextCharacter() {
        selectedCharacter ++
        if(selectedCharacter>=simpsonsCharacters.size)
            selectedCharacter = 0
        currentCharacter.value = simpsonsCharacters[selectedCharacter]
    }
}