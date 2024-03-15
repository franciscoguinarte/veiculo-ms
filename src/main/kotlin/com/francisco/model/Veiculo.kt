package com.francisco.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Veiculo (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id : Long,
    val modelo : String,
    val marca : String,
    val placa : String
)