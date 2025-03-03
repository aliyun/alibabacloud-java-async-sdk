// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link LineageEntity} extends {@link TeaModel}
 *
 * <p>LineageEntity</p>
 */
public class LineageEntity extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.Map<String, ?> attributes;

    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("QualifiedName")
    private String qualifiedName;

    private LineageEntity(Builder builder) {
        this.attributes = builder.attributes;
        this.entityType = builder.entityType;
        this.name = builder.name;
        this.qualifiedName = builder.qualifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LineageEntity create() {
        return builder().build();
    }

    /**
     * @return attributes
     */
    public java.util.Map<String, ?> getAttributes() {
        return this.attributes;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public static final class Builder {
        private java.util.Map<String, ?> attributes; 
        private String entityType; 
        private String name; 
        private String qualifiedName; 

        /**
         * Attributes.
         */
        public Builder attributes(java.util.Map<String, ?> attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * QualifiedName.
         */
        public Builder qualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }

        public LineageEntity build() {
            return new LineageEntity(this);
        } 

    } 

}
