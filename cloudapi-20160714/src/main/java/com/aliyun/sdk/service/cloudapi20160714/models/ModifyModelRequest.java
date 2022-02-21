// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyModelRequest} extends {@link RequestModel}
 *
 * <p>ModifyModelRequest</p>
 */
public class ModifyModelRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("ModelName")
    @Validation(required = true)
    private String modelName;

    @Query
    @NameInMap("NewModelName")
    private String newModelName;

    @Query
    @NameInMap("Schema")
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

        private Builder(ModifyModelRequest response) {
            super(response);
            this.description = response.description;
            this.groupId = response.groupId;
            this.modelName = response.modelName;
            this.newModelName = response.newModelName;
            this.schema = response.schema;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * ModelName.
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * NewModelName.
         */
        public Builder newModelName(String newModelName) {
            this.putQueryParameter("NewModelName", newModelName);
            this.newModelName = newModelName;
            return this;
        }

        /**
         * Schema.
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
