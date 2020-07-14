package kr.co.tjoeun.pizzastore_20200714_mh

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity  : AppCompatActivity() {

    abstract fun setValue()

    abstract fun setupEvents()
}