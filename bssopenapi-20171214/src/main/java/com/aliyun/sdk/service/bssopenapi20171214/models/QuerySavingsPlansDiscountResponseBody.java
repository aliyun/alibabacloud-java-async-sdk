// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySavingsPlansDiscountResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySavingsPlansDiscountResponseBody</p>
 */
public class QuerySavingsPlansDiscountResponseBody extends TeaModel {
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

    private QuerySavingsPlansDiscountResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySavingsPlansDiscountResponseBody create() {
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
         * The error code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySavingsPlansDiscountResponseBody build() {
            return new QuerySavingsPlansDiscountResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("CommodityName")
        private String commodityName;

        @NameInMap("ContractDiscountRate")
        private String contractDiscountRate;

        @NameInMap("Cycle")
        private String cycle;

        @NameInMap("DiscountRate")
        private String discountRate;

        @NameInMap("ModuleName")
        private String moduleName;

        @NameInMap("PayMode")
        private String payMode;

        @NameInMap("Region")
        private String region;

        @NameInMap("RegionCode")
        private String regionCode;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("SpnType")
        private String spnType;

        private Items(Builder builder) {
            this.commodityName = builder.commodityName;
            this.contractDiscountRate = builder.contractDiscountRate;
            this.cycle = builder.cycle;
            this.discountRate = builder.discountRate;
            this.moduleName = builder.moduleName;
            this.payMode = builder.payMode;
            this.region = builder.region;
            this.regionCode = builder.regionCode;
            this.spec = builder.spec;
            this.spnType = builder.spnType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        /**
         * @return contractDiscountRate
         */
        public String getContractDiscountRate() {
            return this.contractDiscountRate;
        }

        /**
         * @return cycle
         */
        public String getCycle() {
            return this.cycle;
        }

        /**
         * @return discountRate
         */
        public String getDiscountRate() {
            return this.discountRate;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return payMode
         */
        public String getPayMode() {
            return this.payMode;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return regionCode
         */
        public String getRegionCode() {
            return this.regionCode;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return spnType
         */
        public String getSpnType() {
            return this.spnType;
        }

        public static final class Builder {
            private String commodityName; 
            private String contractDiscountRate; 
            private String cycle; 
            private String discountRate; 
            private String moduleName; 
            private String payMode; 
            private String region; 
            private String regionCode; 
            private String spec; 
            private String spnType; 

            /**
             * The details of the service.
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * The contracted discount.
             */
            public Builder contractDiscountRate(String contractDiscountRate) {
                this.contractDiscountRate = contractDiscountRate;
                return this;
            }

            /**
             * The cycle based on which queries were performed.
             */
            public Builder cycle(String cycle) {
                this.cycle = cycle;
                return this;
            }

            /**
             * The discount provided by the official website.
             */
            public Builder discountRate(String discountRate) {
                this.discountRate = discountRate;
                return this;
            }

            /**
             * The name of the pricing module.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * The payment mode. Valid values:
             * <p>
             * 
             * *   total: all upfront
             * *   half: half upfront
             * *   zero: no upfront
             */
            public Builder payMode(String payMode) {
                this.payMode = payMode;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * RegionCode.
             */
            public Builder regionCode(String regionCode) {
                this.regionCode = regionCode;
                return this;
            }

            /**
             * The type of the resource.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * The type of the savings plan.
             */
            public Builder spnType(String spnType) {
                this.spnType = spnType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("HostId")
        private String hostId;

        @NameInMap("Items")
        private java.util.List < Items> items;

        private Data(Builder builder) {
            this.hostId = builder.hostId;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private String hostId; 
            private java.util.List < Items> items; 

            /**
             * The IP address of the request.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * The information about the discounts on saving plans.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
