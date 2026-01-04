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
 * {@link ListTopicsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTopicsResponseBody</p>
 */
public class ListTopicsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private List list;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTopicsResponseBody(Builder builder) {
        this.list = builder.list;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTopicsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public List getList() {
        return this.list;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private List list; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListTopicsResponseBody model) {
            this.list = model.list;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * List.
         */
        public Builder list(List list) {
            this.list = list;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTopicsResponseBody build() {
            return new ListTopicsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTopicsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTopicsResponseBody</p>
     */
    public static class Topic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("EnableSchemaRegistry")
        private String enableSchemaRegistry;

        @com.aliyun.core.annotation.NameInMap("ExpandMode")
        private String expandMode;

        @com.aliyun.core.annotation.NameInMap("Lifecycle")
        private Integer lifecycle;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("RecordSchema")
        private String recordSchema;

        @com.aliyun.core.annotation.NameInMap("RecordType")
        private String recordType;

        @com.aliyun.core.annotation.NameInMap("ShardCount")
        private Integer shardCount;

        @com.aliyun.core.annotation.NameInMap("Storage")
        private Long storage;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Topic(Builder builder) {
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.enableSchemaRegistry = builder.enableSchemaRegistry;
            this.expandMode = builder.expandMode;
            this.lifecycle = builder.lifecycle;
            this.projectName = builder.projectName;
            this.recordSchema = builder.recordSchema;
            this.recordType = builder.recordType;
            this.shardCount = builder.shardCount;
            this.storage = builder.storage;
            this.topicName = builder.topicName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Topic create() {
            return builder().build();
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
        public Long getCreateTime() {
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
        public String getEnableSchemaRegistry() {
            return this.enableSchemaRegistry;
        }

        /**
         * @return expandMode
         */
        public String getExpandMode() {
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
         * @return storage
         */
        public Long getStorage() {
            return this.storage;
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
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String comment; 
            private Long createTime; 
            private String creator; 
            private String enableSchemaRegistry; 
            private String expandMode; 
            private Integer lifecycle; 
            private String projectName; 
            private String recordSchema; 
            private String recordType; 
            private Integer shardCount; 
            private Long storage; 
            private String topicName; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Topic model) {
                this.comment = model.comment;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.enableSchemaRegistry = model.enableSchemaRegistry;
                this.expandMode = model.expandMode;
                this.lifecycle = model.lifecycle;
                this.projectName = model.projectName;
                this.recordSchema = model.recordSchema;
                this.recordType = model.recordType;
                this.shardCount = model.shardCount;
                this.storage = model.storage;
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
            public Builder createTime(Long createTime) {
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
            public Builder enableSchemaRegistry(String enableSchemaRegistry) {
                this.enableSchemaRegistry = enableSchemaRegistry;
                return this;
            }

            /**
             * ExpandMode.
             */
            public Builder expandMode(String expandMode) {
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
             * TopicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Topic build() {
                return new Topic(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTopicsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTopicsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Topic")
        private java.util.List<Topic> topic;

        private List(Builder builder) {
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return topic
         */
        public java.util.List<Topic> getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private java.util.List<Topic> topic; 

            private Builder() {
            } 

            private Builder(List model) {
                this.topic = model.topic;
            } 

            /**
             * Topic.
             */
            public Builder topic(java.util.List<Topic> topic) {
                this.topic = topic;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
