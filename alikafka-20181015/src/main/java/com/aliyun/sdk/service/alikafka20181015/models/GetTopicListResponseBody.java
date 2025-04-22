// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20181015.models;

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

    /**
     * 
     * {@link GetTopicListResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicListResponseBody</p>
     */
    public static class TopicVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StatusName")
        private String statusName;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private TopicVO(Builder builder) {
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.remark = builder.remark;
            this.status = builder.status;
            this.statusName = builder.statusName;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicVO create() {
            return builder().build();
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
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private Long createTime; 
            private String instanceId; 
            private String regionId; 
            private String remark; 
            private Integer status; 
            private String statusName; 
            private String topic; 

            private Builder() {
            } 

            private Builder(TopicVO model) {
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
                this.remark = model.remark;
                this.status = model.status;
                this.statusName = model.statusName;
                this.topic = model.topic;
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
