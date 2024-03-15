package com.francisco.persistence

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface VeiculoRepository : JpaRepository<VeiculoRepository,Long>{
}