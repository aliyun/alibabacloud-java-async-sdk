// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The time when the model was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-29T09:33:01Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The description of the created model.</p>
         * 
         * <strong>example:</strong>
         * <p>Model Description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the API group to which the created model belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>30e792398d6c4569b04c0e53a3494381</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the created model.</p>
         * 
         * <strong>example:</strong>
         * <p>766c0b9538a04bdf974953b5576783ba</p>
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>The name of the created model.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The URI of the created model.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://apigateway.aliyun.com/models/30e792398d6c4569b04c0e53a3494381/766c0b9538a04bdf974953b5576783ba">https://apigateway.aliyun.com/models/30e792398d6c4569b04c0e53a3494381/766c0b9538a04bdf974953b5576783ba</a></p>
         */
        public Builder modelRef(String modelRef) {
            this.modelRef = modelRef;
            return this;
        }

        /**
         * <p>The time when the model is last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-29T09:33:01Z</p>
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * <p>The region to which the created model belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4173F95B-360C-460C-9F6C-4A960B904411</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The definition of the created model.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;id&quot;:{&quot;format&quot;:&quot;int64&quot;,&quot;maximum&quot;:100,&quot;exclusiveMaximum&quot;:true,&quot;type&quot;:&quot;integer&quot;},&quot;name&quot;:{&quot;maxLength&quot;:10,&quot;type&quot;:&quot;string&quot;}}}</p>
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
