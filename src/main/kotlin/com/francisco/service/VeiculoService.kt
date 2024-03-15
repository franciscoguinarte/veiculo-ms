package com.francisco.service

import com.francisco.model.Veiculo
import com.francisco.persistence.VeiculoRepository
import jakarta.inject.Singleton

@Singleton
class VeiculoService(
    private val veiculoRepository: VeiculoRepository
) {

    fun create(veiculo: Veiculo): Veiculo{
        return veiculoRepository.save(veiculo);
    }

    fun findById(id: Long): Veiculo{
        return veiculoRepository.findById(id).get();
    }
}