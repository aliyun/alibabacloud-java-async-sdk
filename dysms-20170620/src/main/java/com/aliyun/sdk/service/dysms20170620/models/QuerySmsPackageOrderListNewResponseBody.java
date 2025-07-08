// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QuerySmsPackageOrderListNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsPackageOrderListNewResponseBody</p>
 */
public class QuerySmsPackageOrderListNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private List list;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QuerySmsPackageOrderListNewResponseBody(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsPackageOrderListNewResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private List list; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QuerySmsPackageOrderListNewResponseBody model) {
            this.list = model.list;
            this.requestId = model.requestId;
        } 

        /**
         * List.
         */
        public Builder list(List list) {
            this.list = list;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QuerySmsPackageOrderListNewResponseBody build() {
            return new QuerySmsPackageOrderListNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsPackageOrderListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsPackageOrderListNewResponseBody</p>
     */
    public static class SmsPackageOrderResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectDate")
        private String effectDate;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PayPrice")
        private String payPrice;

        @com.aliyun.core.annotation.NameInMap("State")
        private Integer state;

        private SmsPackageOrderResponse(Builder builder) {
            this.effectDate = builder.effectDate;
            this.expireDate = builder.expireDate;
            this.name = builder.name;
            this.payPrice = builder.payPrice;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsPackageOrderResponse create() {
            return builder().build();
        }

        /**
         * @return effectDate
         */
        public String getEffectDate() {
            return this.effectDate;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return payPrice
         */
        public String getPayPrice() {
            return this.payPrice;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        public static final class Builder {
            private String effectDate; 
            private String expireDate; 
            private String name; 
            private String payPrice; 
            private Integer state; 

            private Builder() {
            } 

            private Builder(SmsPackageOrderResponse model) {
                this.effectDate = model.effectDate;
                this.expireDate = model.expireDate;
                this.name = model.name;
                this.payPrice = model.payPrice;
                this.state = model.state;
            } 

            /**
             * EffectDate.
             */
            public Builder effectDate(String effectDate) {
                this.effectDate = effectDate;
                return this;
            }

            /**
             * ExpireDate.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PayPrice.
             */
            public Builder payPrice(String payPrice) {
                this.payPrice = payPrice;
                return this;
            }

            /**
             * State.
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            public SmsPackageOrderResponse build() {
                return new SmsPackageOrderResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsPackageOrderListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsPackageOrderListNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SmsPackageOrderResponse")
        private java.util.List<SmsPackageOrderResponse> smsPackageOrderResponse;

        private List(Builder builder) {
            this.smsPackageOrderResponse = builder.smsPackageOrderResponse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return smsPackageOrderResponse
         */
        public java.util.List<SmsPackageOrderResponse> getSmsPackageOrderResponse() {
            return this.smsPackageOrderResponse;
        }

        public static final class Builder {
            private java.util.List<SmsPackageOrderResponse> smsPackageOrderResponse; 

            private Builder() {
            } 

            private Builder(List model) {
                this.smsPackageOrderResponse = model.smsPackageOrderResponse;
            } 

            /**
             * SmsPackageOrderResponse.
             */
            public Builder smsPackageOrderResponse(java.util.List<SmsPackageOrderResponse> smsPackageOrderResponse) {
                this.smsPackageOrderResponse = smsPackageOrderResponse;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
