// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link InquiryPriceRefundInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>InquiryPriceRefundInstanceResponseBody</p>
 */
public class InquiryPriceRefundInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private InquiryPriceRefundInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InquiryPriceRefundInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description of the execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>UUID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public InquiryPriceRefundInstanceResponseBody build() {
            return new InquiryPriceRefundInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InquiryPriceRefundInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>InquiryPriceRefundInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RefundAmount")
        private Double refundAmount;

        private Data(Builder builder) {
            this.currency = builder.currency;
            this.hostId = builder.hostId;
            this.instanceId = builder.instanceId;
            this.refundAmount = builder.refundAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return refundAmount
         */
        public Double getRefundAmount() {
            return this.refundAmount;
        }

        public static final class Builder {
            private String currency; 
            private String hostId; 
            private String instanceId; 
            private Double refundAmount; 

            /**
             * <p>The currency.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY. CNY: Chinese Yuan. USD: United States dollar. JPY: Japanese Yen.</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The site of the execution host.</p>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1etb69sqxgl4*******</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The refundable amount.</p>
             * 
             * <strong>example:</strong>
             * <p>12.34</p>
             */
            public Builder refundAmount(Double refundAmount) {
                this.refundAmount = refundAmount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
