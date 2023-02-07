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
         * code
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success
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
            private String spec; 
            private String spnType; 

            /**
             * CommodityName.
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * ContractDiscountRate.
             */
            public Builder contractDiscountRate(String contractDiscountRate) {
                this.contractDiscountRate = contractDiscountRate;
                return this;
            }

            /**
             * Cycle.
             */
            public Builder cycle(String cycle) {
                this.cycle = cycle;
                return this;
            }

            /**
             * DiscountRate.
             */
            public Builder discountRate(String discountRate) {
                this.discountRate = discountRate;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * PayMode.
             */
            public Builder payMode(String payMode) {
                this.payMode = payMode;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * SpnType.
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
             * hostId
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * Items.
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
