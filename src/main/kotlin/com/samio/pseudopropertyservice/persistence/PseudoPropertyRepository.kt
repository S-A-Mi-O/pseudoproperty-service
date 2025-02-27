package com.samio.pseudopropertyservice.persistence

import com.samio.core.persistence.abstraction.EntityRepository
import com.samio.pseudopropertyservice.model.PseudoProperty
import java.util.*

@Suppress("unused")
interface PseudoPropertyRepository : EntityRepository<PseudoProperty, UUID>

