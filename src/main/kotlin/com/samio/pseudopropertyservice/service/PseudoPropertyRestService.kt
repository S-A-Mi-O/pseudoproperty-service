package com.samio.pseudopropertyservice.service

import com.samio.core.service.abstraction.RestServiceTemplate
import com.samio.core.service.annotation.RestServiceFor
import com.samio.pseudopropertyservice.model.PseudoProperty
import jakarta.transaction.Transactional
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.stereotype.Service

@Transactional
@Service
@RestServiceFor(PseudoProperty::class)
class PseudoPropertyRestService(
) : RestServiceTemplate<PseudoProperty>()