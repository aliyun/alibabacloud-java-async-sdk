// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateModelResponseBody</p>
 */
public class CreateModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("ModelId")
    private String modelId;

    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("ModelRef")
    private String modelRef;

    @com.aliyun.core.annotation.NameInMap("ModifiedTime")
    private String modifiedTime;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    private CreateModelResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.modelId = builder.modelId;
        this.modelName = builder.modelName;
        this.modelRef = builder.modelRef;
        this.modifiedTime = builder.modifiedTime;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelResponseBody create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
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
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelRef
     */
    public String getModelRef() {
        return this.modelRef;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    public static final class Builder {
        private String createdTime; 
        private String description; 
        private String groupId; 
        private String modelId; 
        private String modelName; 
        private String modelRef; 
        private String modifiedTime; 
        private String regionId; 
        private String requestId; 
        private String schema; 

        /**
         * The time when the model was created.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * The description of the created model.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The ID of the API group to which the created model belongs.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the created model.
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * The name of the created model.
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * The URI of the created model.
         */
        public Builder modelRef(String modelRef) {
            this.modelRef = modelRef;
            return this;
        }

        /**
         * The time when the model is last modified.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * The region to which the created model belongs.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The definition of the created model.
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        public CreateModelResponseBody build() {
            return new CreateModelResponseBody(this);
        } 

    } 

}
