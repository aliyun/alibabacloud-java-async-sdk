// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConsumerListResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsumerListResponseBody</p>
 */
public class GetConsumerListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ConsumerList")
    private ConsumerList consumerList;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetConsumerListResponseBody(Builder builder) {
        this.code = builder.code;
        this.consumerList = builder.consumerList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private Integer code; 
        private ConsumerList consumerList; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * ConsumerList.
         */
        public Builder consumerList(ConsumerList consumerList) {
            this.consumerList = consumerList;
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

        public GetConsumerListResponseBody build() {
            return new GetConsumerListResponseBody(this);
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
    public static class ConsumerVO extends TeaModel {
        @NameInMap("ConsumerId")
        private String consumerId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Tags")
        private Tags tags;

        private ConsumerVO(Builder builder) {
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
            private String consumerId; 
            private String instanceId; 
            private String regionId; 
            private String remark; 
            private Tags tags; 

            /**
             * ConsumerId.
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
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
             * Tags.
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
    public static class ConsumerList extends TeaModel {
        @NameInMap("ConsumerVO")
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
