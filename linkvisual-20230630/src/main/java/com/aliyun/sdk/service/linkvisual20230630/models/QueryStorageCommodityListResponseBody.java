// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryStorageCommodityListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryStorageCommodityListResponseBody</p>
 */
public class QueryStorageCommodityListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryStorageCommodityListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStorageCommodityListResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private java.util.List < Data> data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public QueryStorageCommodityListResponseBody build() {
            return new QueryStorageCommodityListResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("CommodityName")
        private String commodityName;

        @NameInMap("Lifecycle")
        private Integer lifecycle;

        @NameInMap("Months")
        private Integer months;

        @NameInMap("Price")
        private String price;

        @NameInMap("RecordType")
        private Integer recordType;

        @NameInMap("Specification")
        private String specification;

        private Data(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.lifecycle = builder.lifecycle;
            this.months = builder.months;
            this.price = builder.price;
            this.recordType = builder.recordType;
            this.specification = builder.specification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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

        /**
         * @return lifecycle
         */
        public Integer getLifecycle() {
            return this.lifecycle;
        }

        /**
         * @return months
         */
        public Integer getMonths() {
            return this.months;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return recordType
         */
        public Integer getRecordType() {
            return this.recordType;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        public static final class Builder {
            private String commodityCode; 
            private String commodityName; 
            private Integer lifecycle; 
            private Integer months; 
            private String price; 
            private Integer recordType; 
            private String specification; 

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CommodityName.
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * Lifecycle.
             */
            public Builder lifecycle(Integer lifecycle) {
                this.lifecycle = lifecycle;
                return this;
            }

            /**
             * Months.
             */
            public Builder months(Integer months) {
                this.months = months;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * RecordType.
             */
            public Builder recordType(Integer recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * Specification.
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
