// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link GetTopicListResponseBody} extends {@link TeaModel}
 *
 * <p>GetTopicListResponseBody</p>
 */
public class GetTopicListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TopicList")
    private TopicList topicList;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private GetTopicListResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.topicList = builder.topicList;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTopicListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return topicList
     */
    public TopicList getTopicList() {
        return this.topicList;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer code; 
        private Integer currentPage; 
        private String message; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private TopicList topicList; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(GetTopicListResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.message = model.message;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.topicList = model.topicList;
            this.total = model.total;
        } 

        /**
         * <p>The response code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C0D3DC5B-5C37-47AD-9F22-1F559880****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TopicList.
         */
        public Builder topicList(TopicList topicList) {
            this.topicList = topicList;
            return this;
        }

        /**
         * <p>The total number of topics.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetTopicListResponseBody build() {
            return new GetTopicListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTopicListResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicListResponseBody</p>
     */
    public static class TagVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagVO(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagVO create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(TagVO model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagVO build() {
                return new TagVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicListResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicListResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagVO")
        private java.util.List<TagVO> tagVO;

        private Tags(Builder builder) {
            this.tagVO = builder.tagVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagVO
         */
        public java.util.List<TagVO> getTagVO() {
            return this.tagVO;
        }

        public static final class Builder {
            private java.util.List<TagVO> tagVO; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagVO = model.tagVO;
            } 

            /**
             * TagVO.
             */
            public Builder tagVO(java.util.List<TagVO> tagVO) {
                this.tagVO = tagVO;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicListResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicListResponseBody</p>
     */
    public static class TopicVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoCreate")
        private Boolean autoCreate;

        @com.aliyun.core.annotation.NameInMap("CompactTopic")
        private Boolean compactTopic;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LocalTopic")
        private Boolean localTopic;

        @com.aliyun.core.annotation.NameInMap("PartitionNum")
        private Integer partitionNum;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StatusName")
        private String statusName;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("TopicConfig")
        private String topicConfig;

        private TopicVO(Builder builder) {
            this.autoCreate = builder.autoCreate;
            this.compactTopic = builder.compactTopic;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.localTopic = builder.localTopic;
            this.partitionNum = builder.partitionNum;
            this.regionId = builder.regionId;
            this.remark = builder.remark;
            this.status = builder.status;
            this.statusName = builder.statusName;
            this.tags = builder.tags;
            this.topic = builder.topic;
            this.topicConfig = builder.topicConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicVO create() {
            return builder().build();
        }

        /**
         * @return autoCreate
         */
        public Boolean getAutoCreate() {
            return this.autoCreate;
        }

        /**
         * @return compactTopic
         */
        public Boolean getCompactTopic() {
            return this.compactTopic;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return localTopic
         */
        public Boolean getLocalTopic() {
            return this.localTopic;
        }

        /**
         * @return partitionNum
         */
        public Integer getPartitionNum() {
            return this.partitionNum;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusName
         */
        public String getStatusName() {
            return this.statusName;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return topicConfig
         */
        public String getTopicConfig() {
            return this.topicConfig;
        }

        public static final class Builder {
            private Boolean autoCreate; 
            private Boolean compactTopic; 
            private Long createTime; 
            private String instanceId; 
            private Boolean localTopic; 
            private Integer partitionNum; 
            private String regionId; 
            private String remark; 
            private Integer status; 
            private String statusName; 
            private Tags tags; 
            private String topic; 
            private String topicConfig; 

            private Builder() {
            } 

            private Builder(TopicVO model) {
                this.autoCreate = model.autoCreate;
                this.compactTopic = model.compactTopic;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.localTopic = model.localTopic;
                this.partitionNum = model.partitionNum;
                this.regionId = model.regionId;
                this.remark = model.remark;
                this.status = model.status;
                this.statusName = model.statusName;
                this.tags = model.tags;
                this.topic = model.topic;
                this.topicConfig = model.topicConfig;
            } 

            /**
             * AutoCreate.
             */
            public Builder autoCreate(Boolean autoCreate) {
                this.autoCreate = autoCreate;
                return this;
            }

            /**
             * CompactTopic.
             */
            public Builder compactTopic(Boolean compactTopic) {
                this.compactTopic = compactTopic;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LocalTopic.
             */
            public Builder localTopic(Boolean localTopic) {
                this.localTopic = localTopic;
                return this;
            }

            /**
             * PartitionNum.
             */
            public Builder partitionNum(Integer partitionNum) {
                this.partitionNum = partitionNum;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * StatusName.
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * TopicConfig.
             */
            public Builder topicConfig(String topicConfig) {
                this.topicConfig = topicConfig;
                return this;
            }

            public TopicVO build() {
                return new TopicVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicListResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicListResponseBody</p>
     */
    public static class TopicList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TopicVO")
        private java.util.List<TopicVO> topicVO;

        private TopicList(Builder builder) {
            this.topicVO = builder.topicVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicList create() {
            return builder().build();
        }

        /**
         * @return topicVO
         */
        public java.util.List<TopicVO> getTopicVO() {
            return this.topicVO;
        }

        public static final class Builder {
            private java.util.List<TopicVO> topicVO; 

            private Builder() {
            } 

            private Builder(TopicList model) {
                this.topicVO = model.topicVO;
            } 

            /**
             * TopicVO.
             */
            public Builder topicVO(java.util.List<TopicVO> topicVO) {
                this.topicVO = topicVO;
                return this;
            }

            public TopicList build() {
                return new TopicList(this);
            } 

        } 

    }
}
