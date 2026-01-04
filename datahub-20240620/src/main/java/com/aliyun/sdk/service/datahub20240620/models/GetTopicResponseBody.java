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
 * {@link GetTopicResponseBody} extends {@link TeaModel}
 *
 * <p>GetTopicResponseBody</p>
 */
public class GetTopicResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("EnableSchemaRegistry")
    private Boolean enableSchemaRegistry;

    @com.aliyun.core.annotation.NameInMap("ExpandMode")
    private Boolean expandMode;

    @com.aliyun.core.annotation.NameInMap("Lifecycle")
    private Integer lifecycle;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RecordSchema")
    private String recordSchema;

    @com.aliyun.core.annotation.NameInMap("RecordType")
    private String recordType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShardCount")
    private Integer shardCount;

    @com.aliyun.core.annotation.NameInMap("Storage")
    private Long storage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TopicName")
    private String topicName;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetTopicResponseBody(Builder builder) {
        this.comment = builder.comment;
        this.createTime = builder.createTime;
        this.creator = builder.creator;
        this.enableSchemaRegistry = builder.enableSchemaRegistry;
        this.expandMode = builder.expandMode;
        this.lifecycle = builder.lifecycle;
        this.projectName = builder.projectName;
        this.recordSchema = builder.recordSchema;
        this.recordType = builder.recordType;
        this.requestId = builder.requestId;
        this.shardCount = builder.shardCount;
        this.storage = builder.storage;
        this.success = builder.success;
        this.topicName = builder.topicName;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTopicResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shardCount
     */
    public Integer getShardCount() {
        return this.shardCount;
    }

    /**
     * @return storage
     */
    public Long getStorage() {
        return this.storage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String comment; 
        private String createTime; 
        private String creator; 
        private Boolean enableSchemaRegistry; 
        private Boolean expandMode; 
        private Integer lifecycle; 
        private String projectName; 
        private String recordSchema; 
        private String recordType; 
        private String requestId; 
        private Integer shardCount; 
        private Long storage; 
        private Boolean success; 
        private String topicName; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetTopicResponseBody model) {
            this.comment = model.comment;
            this.createTime = model.createTime;
            this.creator = model.creator;
            this.enableSchemaRegistry = model.enableSchemaRegistry;
            this.expandMode = model.expandMode;
            this.lifecycle = model.lifecycle;
            this.projectName = model.projectName;
            this.recordSchema = model.recordSchema;
            this.recordType = model.recordType;
            this.requestId = model.requestId;
            this.shardCount = model.shardCount;
            this.storage = model.storage;
            this.success = model.success;
            this.topicName = model.topicName;
            this.updateTime = model.updateTime;
        } 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * EnableSchemaRegistry.
         */
        public Builder enableSchemaRegistry(Boolean enableSchemaRegistry) {
            this.enableSchemaRegistry = enableSchemaRegistry;
            return this;
        }

        /**
         * ExpandMode.
         */
        public Builder expandMode(Boolean expandMode) {
            this.expandMode = expandMode;
            return this;
        }

        /**
         * Lifecycle.
         */
        public Builder lifecycle(Integer lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * RecordSchema.
         */
        public Builder recordSchema(String recordSchema) {
            this.recordSchema = recordSchema;
            return this;
        }

        /**
         * RecordType.
         */
        public Builder recordType(String recordType) {
            this.recordType = recordType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShardCount.
         */
        public Builder shardCount(Integer shardCount) {
            this.shardCount = shardCount;
            return this;
        }

        /**
         * Storage.
         */
        public Builder storage(Long storage) {
            this.storage = storage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TopicName.
         */
        public Builder topicName(String topicName) {
            this.topicName = topicName;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetTopicResponseBody build() {
            return new GetTopicResponseBody(this);
        } 

    } 

}
