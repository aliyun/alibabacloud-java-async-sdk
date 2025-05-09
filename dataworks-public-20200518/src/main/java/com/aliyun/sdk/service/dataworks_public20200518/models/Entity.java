// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link Entity} extends {@link TeaModel}
 *
 * <p>Entity</p>
 */
public class Entity extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EntityContent")
    private java.util.Map<String, ?> entityContent;

    @com.aliyun.core.annotation.NameInMap("QualifiedName")
    private String qualifiedName;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private Long tenantId;

    private Entity(Builder builder) {
        this.entityContent = builder.entityContent;
        this.qualifiedName = builder.qualifiedName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Entity create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityContent
     */
    public java.util.Map<String, ?> getEntityContent() {
        return this.entityContent;
    }

    /**
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder {
        private java.util.Map<String, ?> entityContent; 
        private String qualifiedName; 
        private Long tenantId; 

        private Builder() {
        } 

        private Builder(Entity model) {
            this.entityContent = model.entityContent;
            this.qualifiedName = model.qualifiedName;
            this.tenantId = model.tenantId;
        } 

        /**
         * EntityContent.
         */
        public Builder entityContent(java.util.Map<String, ?> entityContent) {
            this.entityContent = entityContent;
            return this;
        }

        /**
         * QualifiedName.
         */
        public Builder qualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Entity build() {
            return new Entity(this);
        } 

    } 

}
