package com.samio.pseudopropertyservice.model

import com.samio.core.application.validation.type.ValueType
import com.samio.core.controller.abstraction.util.TypeDescriptor
import com.samio.core.model.abstraction.BaseEntity
import com.samio.core.model.abstraction.IPseudoProperty
import io.hypersistence.utils.hibernate.type.json.JsonType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.validation.constraints.NotBlank
import org.hibernate.annotations.Type
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass

@Suppress("unused")
@Entity
class PseudoProperty(
    @NotBlank
    @Column(name = "entity_simple_name", nullable = false)
    override var entitySimpleName: String = "",

    @NotBlank
    @Column(name = "key", nullable = false)
    override var key: String = "",

    @Type(JsonType::class)
    @Column(
        name = "type_descriptor",
        columnDefinition = "jsonb",
        nullable = false
    )
    override var typeDescriptor: TypeDescriptor = TypeDescriptor.PrimitiveDescriptor(
        category = "PRIMITIVE",
        type = ValueType.STRING,
        isNullable = true
    )
) : BaseEntity(), IPseudoProperty
