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
 * {@link GetConsumerListResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsumerListResponseBody</p>
 */
public class GetConsumerListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("ConsumerList")
    private ConsumerList consumerList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(GetConsumerListResponseBody model) {
            this.code = model.code;
            this.consumerList = model.consumerList;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

    /**
     * 
     * {@link GetConsumerListResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerListResponseBody</p>
     */
    public static class ConsumerVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumerId")
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private ConsumerVO(Builder builder) {
            this.consumerId = builder.consumerId;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
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

        public static final class Builder {
            private String consumerId; 
            private String instanceId; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(ConsumerVO model) {
                this.consumerId = model.consumerId;
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
            } 

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
        private java.util.List<ConsumerVO> consumerVO;

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
        public java.util.List<ConsumerVO> getConsumerVO() {
            return this.consumerVO;
        }

        public static final class Builder {
            private java.util.List<ConsumerVO> consumerVO; 

            private Builder() {
            } 

            private Builder(ConsumerList model) {
                this.consumerVO = model.consumerVO;
            } 

            /**
             * ConsumerVO.
             */
            public Builder consumerVO(java.util.List<ConsumerVO> consumerVO) {
                this.consumerVO = consumerVO;
                return this;
            }

            public ConsumerList build() {
                return new ConsumerList(this);
            } 

        } 

    }
}
