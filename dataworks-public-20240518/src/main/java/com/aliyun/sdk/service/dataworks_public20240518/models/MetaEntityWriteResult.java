// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link MetaEntityWriteResult} extends {@link TeaModel}
 *
 * <p>MetaEntityWriteResult</p>
 */
public class MetaEntityWriteResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private MetaEntityWriteResult(Builder builder) {
        this.entityType = builder.entityType;
        this.errorMessage = builder.errorMessage;
        this.id = builder.id;
        this.name = builder.name;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetaEntityWriteResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String entityType; 
        private String errorMessage; 
        private String id; 
        private String name; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(MetaEntityWriteResult model) {
            this.entityType = model.entityType;
            this.errorMessage = model.errorMessage;
            this.id = model.id;
            this.name = model.name;
            this.success = model.success;
        } 

        /**
         * <p>The entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_entity-demo</p>
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>The error message if the operation fails for the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameters are invalid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_entity-demo:entity_01</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The entity name.</p>
         * 
         * <strong>example:</strong>
         * <p>entity_01</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Indicates whether the operation succeeded for the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public MetaEntityWriteResult build() {
            return new MetaEntityWriteResult(this);
        } 

    } 

}
