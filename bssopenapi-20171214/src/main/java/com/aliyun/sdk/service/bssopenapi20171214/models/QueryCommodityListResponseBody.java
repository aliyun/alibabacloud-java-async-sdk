// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryCommodityListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCommodityListResponseBody</p>
 */
public class QueryCommodityListResponseBody extends TeaModel {
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

    private QueryCommodityListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCommodityListResponseBody create() {
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
         * <p>NotApplicable</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CC706AAC-75A6-55B5-9AB7-7D171C6C7655</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the information about the service was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCommodityListResponseBody build() {
            return new QueryCommodityListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCommodityListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCommodityListResponseBody</p>
     */
    public static class CommodityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CommodityName")
        private String commodityName;

        private CommodityList(Builder builder) {
            this.chargeType = builder.chargeType;
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommodityList create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        public static final class Builder {
            private String chargeType; 
            private String commodityCode; 
            private String commodityName; 

            /**
             * <p>The payment type. Valid values: POSTPAY (pay-as-you-go) and PREPAY (subscription).</p>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The code of the service, which is the same as that on the Billing Management page.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS (Pay-As-You-Go)</p>
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            public CommodityList build() {
                return new CommodityList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCommodityListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCommodityListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityList")
        private java.util.List < CommodityList> commodityList;

        private Data(Builder builder) {
            this.commodityList = builder.commodityList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return commodityList
         */
        public java.util.List < CommodityList> getCommodityList() {
            return this.commodityList;
        }

        public static final class Builder {
            private java.util.List < CommodityList> commodityList; 

            /**
             * <p>The information about the service.</p>
             */
            public Builder commodityList(java.util.List < CommodityList> commodityList) {
                this.commodityList = commodityList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
