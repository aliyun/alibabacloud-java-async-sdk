// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetConsumerListResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsumerListResponseBody</p>
 */
public class GetConsumerListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("ConsumerList")
    private ConsumerList consumerList;

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

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private GetConsumerListResponseBody(Builder builder) {
        this.code = builder.code;
        this.consumerList = builder.consumerList;
        this.currentPage = builder.currentPage;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsumerListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return consumerList
     */
    public ConsumerList getConsumerList() {
        return this.consumerList;
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer code; 
        private ConsumerList consumerList; 
        private Integer currentPage; 
        private String message; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long total; 

        /**
         * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The consumer groups.</p>
         */
        public Builder consumerList(ConsumerList consumerList) {
            this.consumerList = consumerList;
            return this;
        }

        /**
         * <p>The number of the page to return. Pages start from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>808F042B-CB9A-4FBC-9009-00E7DDB6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public GetConsumerListResponseBody build() {
            return new GetConsumerListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConsumerListResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerListResponseBody</p>
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

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
     * {@link GetConsumerListResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerListResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagVO")
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
    /**
     * 
     * {@link GetConsumerListResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerListResponseBody</p>
     */
    public static class ConsumerVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutomaticallyCreatedGroup")
        private Boolean automaticallyCreatedGroup;

        @com.aliyun.core.annotation.NameInMap("ConsumerId")
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private ConsumerVO(Builder builder) {
            this.automaticallyCreatedGroup = builder.automaticallyCreatedGroup;
            this.consumerId = builder.consumerId;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.remark = builder.remark;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerVO create() {
            return builder().build();
        }

        /**
         * @return automaticallyCreatedGroup
         */
        public Boolean getAutomaticallyCreatedGroup() {
            return this.automaticallyCreatedGroup;
        }

        /**
         * @return consumerId
         */
        public String getConsumerId() {
            return this.consumerId;
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
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Boolean automaticallyCreatedGroup; 
            private String consumerId; 
            private String instanceId; 
            private String regionId; 
            private String remark; 
            private Tags tags; 

            /**
             * <p>Indicates that the consumer group was automatically created by the system.</p>
             */
            public Builder automaticallyCreatedGroup(Boolean automaticallyCreatedGroup) {
                this.automaticallyCreatedGroup = automaticallyCreatedGroup;
                return this;
            }

            /**
             * <p>The consumer group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>kafka-test</p>
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alikafka_post-cn-v0h18sav****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the region where the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public ConsumerVO build() {
                return new ConsumerVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetConsumerListResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerListResponseBody</p>
     */
    public static class ConsumerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumerVO")
        private java.util.List < ConsumerVO> consumerVO;

        private ConsumerList(Builder builder) {
            this.consumerVO = builder.consumerVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerList create() {
            return builder().build();
        }

        /**
         * @return consumerVO
         */
        public java.util.List < ConsumerVO> getConsumerVO() {
            return this.consumerVO;
        }

        public static final class Builder {
            private java.util.List < ConsumerVO> consumerVO; 

            /**
             * ConsumerVO.
             */
            public Builder consumerVO(java.util.List < ConsumerVO> consumerVO) {
                this.consumerVO = consumerVO;
                return this;
            }

            public ConsumerList build() {
                return new ConsumerList(this);
            } 

        } 

    }
}
