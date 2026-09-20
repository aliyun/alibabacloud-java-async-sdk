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
         * <p>The properties of the entity, including:</p>
         * <ul>
         * <li><strong>entityType</strong>: The type of the entity. Examples: maxcompute-table and emr-table.</li>
         * <li><strong>name</strong>: the name of the entity.</li>
         * <li><strong>projectName</strong>: the name of the MaxCompute project.</li>
         * </ul>
         */
        public Builder entityContent(java.util.Map<String, ?> entityContent) {
            this.entityContent = entityContent;
            return this;
        }

        /**
         * <p>The unique identifier of the entity. Example: maxcompute-table.projectA.tableB.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute_table.563f0357118d05ef145d6bddf2966cc23e86ca8f2f013f915e565afdf09f7a23</p>
         */
        public Builder qualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
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
