// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuerySavingsPlansDiscountResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySavingsPlansDiscountResponseBody</p>
 */
public class QuerySavingsPlansDiscountResponseBody extends TeaModel {
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
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>PARAM_ERROR</p>
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
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>This API is not applicable for caller.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySavingsPlansDiscountResponseBody build() {
            return new QuerySavingsPlansDiscountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySavingsPlansDiscountResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySavingsPlansDiscountResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityName")
        private String commodityName;

        @com.aliyun.core.annotation.NameInMap("ContractDiscountRate")
        private String contractDiscountRate;

        @com.aliyun.core.annotation.NameInMap("Cycle")
        private String cycle;

        @com.aliyun.core.annotation.NameInMap("DiscountRate")
        private String discountRate;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("PayMode")
        private String payMode;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RegionCode")
        private String regionCode;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("SpnType")
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
             * <p>The details of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>Pay-as-you-go Elastic Compute Service (ECS) instance</p>
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * <p>The contracted discount.</p>
             * 
             * <strong>example:</strong>
             * <p>0.85</p>
             */
            public Builder contractDiscountRate(String contractDiscountRate) {
                this.contractDiscountRate = contractDiscountRate;
                return this;
            }

            /**
             * <p>The cycle based on which queries were performed.</p>
             * 
             * <strong>example:</strong>
             * <p>1:Year</p>
             */
            public Builder cycle(String cycle) {
                this.cycle = cycle;
                return this;
            }

            /**
             * <p>The discount provided by the official website.</p>
             * 
             * <strong>example:</strong>
             * <p>0.85</p>
             */
            public Builder discountRate(String discountRate) {
                this.discountRate = discountRate;
                return this;
            }

            /**
             * <p>The name of the pricing module.</p>
             * 
             * <strong>example:</strong>
             * <p>Instance</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The payment mode. Valid values:</p>
             * <ul>
             * <li>total: all upfront</li>
             * <li>half: half upfront</li>
             * <li>zero: no upfront</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>total</p>
             */
            public Builder payMode(String payMode) {
                this.payMode = payMode;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou-na62-a01</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/26231.html">DescribeDBInstanceAttribute</a> operation to query the region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionCode(String regionCode) {
                this.regionCode = regionCode;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g6</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The type of the savings plan.</p>
             * 
             * <strong>example:</strong>
             * <p>universal</p>
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
    /**
     * 
     * {@link QuerySavingsPlansDiscountResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySavingsPlansDiscountResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("Items")
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
             * <p>The IP address of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>100.104.180.109</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>The information about the discounts on saving plans.</p>
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
