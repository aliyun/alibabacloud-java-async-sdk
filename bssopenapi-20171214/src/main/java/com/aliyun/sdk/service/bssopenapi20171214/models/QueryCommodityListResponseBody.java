// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCommodityListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCommodityListResponseBody</p>
 */
public class QueryCommodityListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The HTTP status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the information about the service was queried.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCommodityListResponseBody build() {
            return new QueryCommodityListResponseBody(this);
        } 

    } 

    public static class CommodityList extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("CommodityName")
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
             * The payment type. Valid values: POSTPAY (pay-as-you-go) and PREPAY (subscription).
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The code of the service, which is the same as that on the Billing Management page.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The name of the service.
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
    public static class Data extends TeaModel {
        @NameInMap("CommodityList")
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
             * The information about the service.
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
