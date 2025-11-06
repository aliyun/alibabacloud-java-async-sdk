// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link GetExchangeRateResponseBody} extends {@link TeaModel}
 *
 * <p>GetExchangeRateResponseBody</p>
 */
public class GetExchangeRateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetExchangeRateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExchangeRateResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetExchangeRateResponseBody model) {
            this.code = model.code;
            this.data = model.data;
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public GetExchangeRateResponseBody build() {
            return new GetExchangeRateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetExchangeRateResponseBody} extends {@link TeaModel}
     *
     * <p>GetExchangeRateResponseBody</p>
     */
    public static class ExchangeQuotaVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExchangeName")
        private String exchangeName;

        @com.aliyun.core.annotation.NameInMap("InQps")
        private Long inQps;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OutQps")
        private Long outQps;

        @com.aliyun.core.annotation.NameInMap("VhostName")
        private String vhostName;

        private ExchangeQuotaVO(Builder builder) {
            this.exchangeName = builder.exchangeName;
            this.inQps = builder.inQps;
            this.instanceId = builder.instanceId;
            this.outQps = builder.outQps;
            this.vhostName = builder.vhostName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExchangeQuotaVO create() {
            return builder().build();
        }

        /**
         * @return exchangeName
         */
        public String getExchangeName() {
            return this.exchangeName;
        }

        /**
         * @return inQps
         */
        public Long getInQps() {
            return this.inQps;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return outQps
         */
        public Long getOutQps() {
            return this.outQps;
        }

        /**
         * @return vhostName
         */
        public String getVhostName() {
            return this.vhostName;
        }

        public static final class Builder {
            private String exchangeName; 
            private Long inQps; 
            private String instanceId; 
            private Long outQps; 
            private String vhostName; 

            private Builder() {
            } 

            private Builder(ExchangeQuotaVO model) {
                this.exchangeName = model.exchangeName;
                this.inQps = model.inQps;
                this.instanceId = model.instanceId;
                this.outQps = model.outQps;
                this.vhostName = model.vhostName;
            } 

            /**
             * ExchangeName.
             */
            public Builder exchangeName(String exchangeName) {
                this.exchangeName = exchangeName;
                return this;
            }

            /**
             * InQps.
             */
            public Builder inQps(Long inQps) {
                this.inQps = inQps;
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
             * OutQps.
             */
            public Builder outQps(Long outQps) {
                this.outQps = outQps;
                return this;
            }

            /**
             * VhostName.
             */
            public Builder vhostName(String vhostName) {
                this.vhostName = vhostName;
                return this;
            }

            public ExchangeQuotaVO build() {
                return new ExchangeQuotaVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExchangeRateResponseBody} extends {@link TeaModel}
     *
     * <p>GetExchangeRateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExchangeQuotaVO")
        private java.util.List<ExchangeQuotaVO> exchangeQuotaVO;

        private Data(Builder builder) {
            this.exchangeQuotaVO = builder.exchangeQuotaVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return exchangeQuotaVO
         */
        public java.util.List<ExchangeQuotaVO> getExchangeQuotaVO() {
            return this.exchangeQuotaVO;
        }

        public static final class Builder {
            private java.util.List<ExchangeQuotaVO> exchangeQuotaVO; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.exchangeQuotaVO = model.exchangeQuotaVO;
            } 

            /**
             * ExchangeQuotaVO.
             */
            public Builder exchangeQuotaVO(java.util.List<ExchangeQuotaVO> exchangeQuotaVO) {
                this.exchangeQuotaVO = exchangeQuotaVO;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
