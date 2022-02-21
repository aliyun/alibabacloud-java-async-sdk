// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTopicListResponseBody} extends {@link TeaModel}
 *
 * <p>GetTopicListResponseBody</p>
 */
public class GetTopicListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TopicList")
    private TopicList topicList;

    @NameInMap("Total")
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

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TopicList.
         */
        public Builder topicList(TopicList topicList) {
            this.topicList = topicList;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetTopicListResponseBody build() {
            return new GetTopicListResponseBody(this);
        } 

    } 

    public static class TagVO extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
    public static class Tags extends TeaModel {
        @NameInMap("TagVO")
        private java.util.List < TagVO> tagVO;

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
        public java.util.List < TagVO> getTagVO() {
            return this.tagVO;
        }

        public static final class Builder {
            private java.util.List < TagVO> tagVO; 

            /**
             * TagVO.
             */
            public Builder tagVO(java.util.List < TagVO> tagVO) {
                this.tagVO = tagVO;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class TopicVO extends TeaModel {
        @NameInMap("CompactTopic")
        private Boolean compactTopic;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LocalTopic")
        private Boolean localTopic;

        @NameInMap("PartitionNum")
        private Integer partitionNum;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StatusName")
        private String statusName;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("Topic")
        private String topic;

        private TopicVO(Builder builder) {
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
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicVO create() {
            return builder().build();
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

        public static final class Builder {
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

            public TopicVO build() {
                return new TopicVO(this);
            } 

        } 

    }
    public static class TopicList extends TeaModel {
        @NameInMap("TopicVO")
        private java.util.List < TopicVO> topicVO;

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
        public java.util.List < TopicVO> getTopicVO() {
            return this.topicVO;
        }

        public static final class Builder {
            private java.util.List < TopicVO> topicVO; 

            /**
             * TopicVO.
             */
            public Builder topicVO(java.util.List < TopicVO> topicVO) {
                this.topicVO = topicVO;
                return this;
            }

            public TopicList build() {
                return new TopicList(this);
            } 

        } 

    }
}
