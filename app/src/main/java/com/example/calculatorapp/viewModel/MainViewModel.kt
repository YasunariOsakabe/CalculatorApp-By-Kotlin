package com.example.calculatorapp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//ViewModel()を継承することで、画面回転やライフサイクルの変化に対応しつつ、データを保持・管理することが可能になる。
class MainViewModel: ViewModel() {
    // MutableLiveData オブジェクトの宣言
    private val _counter = MutableLiveData<Int>()
    // 外部から読み取り専用にするために LiveData 型で公開
    val counter: LiveData<Int> get() = _counter
}