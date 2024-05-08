// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyModelRequest} extends {@link RequestModel}
 *
 * <p>ModifyModelRequest</p>
 */
public class ModifyModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewModelName")
    private String newModelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    private ModifyModelRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.modelName = builder.modelName;
        this.newModelName = builder.newModelName;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return newModelName
     */
    public String getNewModelName() {
        return this.newModelName;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    public static final class Builder extends Request.Builder<ModifyModelRequest, Builder> {
        private String description; 
        private String groupId; 
        private String modelName; 
        private String newModelName; 
        private String schema; 

        private Builder() {
            super();
        } 

        private Builder(ModifyModelRequest request) {
            super(request);
            this.description = request.description;
            this.groupId = request.groupId;
            this.modelName = request.modelName;
            this.newModelName = request.newModelName;
            this.schema = request.schema;
        } 

        /**
         * The description of the new model definition.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the API group to which the model belongs.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The name of the model.
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * The new name of the model.
         */
        public Builder newModelName(String newModelName) {
            this.putQueryParameter("NewModelName", newModelName);
            this.newModelName = newModelName;
            return this;
        }

        /**
         * The new definition of the model.
         */
        public Builder schema(String schema) {
            this.putQueryParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        @Override
        public ModifyModelRequest build() {
            return new ModifyModelRequest(this);
        } 

    } 

}
