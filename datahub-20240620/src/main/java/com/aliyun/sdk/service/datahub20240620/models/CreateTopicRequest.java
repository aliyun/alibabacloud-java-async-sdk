// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datahub20240620.models;

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
 * {@link CreateTopicRequest} extends {@link RequestModel}
 *
 * <p>CreateTopicRequest</p>
 */
public class CreateTopicRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSchemaRegistry")
    private Boolean enableSchemaRegistry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpandMode")
    private Boolean expandMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lifecycle")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer lifecycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordSchema")
    private String recordSchema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer shardCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicName;

    private CreateTopicRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.enableSchemaRegistry = builder.enableSchemaRegistry;
        this.expandMode = builder.expandMode;
        this.lifecycle = builder.lifecycle;
        this.projectName = builder.projectName;
        this.recordSchema = builder.recordSchema;
        this.recordType = builder.recordType;
        this.shardCount = builder.shardCount;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTopicRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return enableSchemaRegistry
     */
    public Boolean getEnableSchemaRegistry() {
        return this.enableSchemaRegistry;
    }

    /**
     * @return expandMode
     */
    public Boolean getExpandMode() {
        return this.expandMode;
    }

    /**
     * @return lifecycle
     */
    public Integer getLifecycle() {
        return this.lifecycle;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return recordSchema
     */
    public String getRecordSchema() {
        return this.recordSchema;
    }

    /**
     * @return recordType
     */
    public String getRecordType() {
        return this.recordType;
    }

    /**
     * @return shardCount
     */
    public Integer getShardCount() {
        return this.shardCount;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder extends Request.Builder<CreateTopicRequest, Builder> {
        private String regionId; 
        private String comment; 
        private Boolean enableSchemaRegistry; 
        private Boolean expandMode; 
        private Integer lifecycle; 
        private String projectName; 
        private String recordSchema; 
        private String recordType; 
        private Integer shardCount; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(CreateTopicRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.enableSchemaRegistry = request.enableSchemaRegistry;
            this.expandMode = request.expandMode;
            this.lifecycle = request.lifecycle;
            this.projectName = request.projectName;
            this.recordSchema = request.recordSchema;
            this.recordType = request.recordType;
            this.shardCount = request.shardCount;
            this.topicName = request.topicName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * EnableSchemaRegistry.
         */
        public Builder enableSchemaRegistry(Boolean enableSchemaRegistry) {
            this.putQueryParameter("EnableSchemaRegistry", enableSchemaRegistry);
            this.enableSchemaRegistry = enableSchemaRegistry;
            return this;
        }

        /**
         * ExpandMode.
         */
        public Builder expandMode(Boolean expandMode) {
            this.putQueryParameter("ExpandMode", expandMode);
            this.expandMode = expandMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder lifecycle(Integer lifecycle) {
            this.putQueryParameter("Lifecycle", lifecycle);
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xiaowutest</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * RecordSchema.
         */
        public Builder recordSchema(String recordSchema) {
            this.putQueryParameter("RecordSchema", recordSchema);
            this.recordSchema = recordSchema;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TUPLE</p>
         */
        public Builder recordType(String recordType) {
            this.putQueryParameter("RecordType", recordType);
            this.recordType = recordType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder shardCount(Integer shardCount) {
            this.putQueryParameter("ShardCount", shardCount);
            this.shardCount = shardCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adsb_cat021</p>
         */
        public Builder topicName(String topicName) {
            this.putQueryParameter("TopicName", topicName);
            this.topicName = topicName;
            return this;
        }

        @Override
        public CreateTopicRequest build() {
            return new CreateTopicRequest(this);
        } 

    } 

}
