// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryResourcePackageInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryResourcePackageInstancesResponseBody</p>
 */
public class QueryResourcePackageInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private QueryResourcePackageInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryResourcePackageInstancesResponseBody create() {
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
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private Integer page; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * The status code returned.
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
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * The total number of returned entries.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public QueryResourcePackageInstancesResponseBody build() {
            return new QueryResourcePackageInstancesResponseBody(this);
        } 

    } 

    public static class ApplicableProducts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Product")
        private java.util.List < String > product;

        private ApplicableProducts(Builder builder) {
            this.product = builder.product;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicableProducts create() {
            return builder().build();
        }

        /**
         * @return product
         */
        public java.util.List < String > getProduct() {
            return this.product;
        }

        public static final class Builder {
            private java.util.List < String > product; 

            /**
             * Product.
             */
            public Builder product(java.util.List < String > product) {
                this.product = product;
                return this;
            }

            public ApplicableProducts build() {
                return new ApplicableProducts(this);
            } 

        } 

    }
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicableProducts")
        private ApplicableProducts applicableProducts;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("DeductType")
        private String deductType;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("ExpiryTime")
        private String expiryTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RemainingAmount")
        private String remainingAmount;

        @com.aliyun.core.annotation.NameInMap("RemainingAmountUnit")
        private String remainingAmountUnit;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalAmount")
        private String totalAmount;

        @com.aliyun.core.annotation.NameInMap("TotalAmountUnit")
        private String totalAmountUnit;

        private Instance(Builder builder) {
            this.applicableProducts = builder.applicableProducts;
            this.commodityCode = builder.commodityCode;
            this.deductType = builder.deductType;
            this.effectiveTime = builder.effectiveTime;
            this.expiryTime = builder.expiryTime;
            this.instanceId = builder.instanceId;
            this.packageType = builder.packageType;
            this.region = builder.region;
            this.remainingAmount = builder.remainingAmount;
            this.remainingAmountUnit = builder.remainingAmountUnit;
            this.remark = builder.remark;
            this.status = builder.status;
            this.totalAmount = builder.totalAmount;
            this.totalAmountUnit = builder.totalAmountUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return applicableProducts
         */
        public ApplicableProducts getApplicableProducts() {
            return this.applicableProducts;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return deductType
         */
        public String getDeductType() {
            return this.deductType;
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return expiryTime
         */
        public String getExpiryTime() {
            return this.expiryTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return remainingAmount
         */
        public String getRemainingAmount() {
            return this.remainingAmount;
        }

        /**
         * @return remainingAmountUnit
         */
        public String getRemainingAmountUnit() {
            return this.remainingAmountUnit;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalAmount
         */
        public String getTotalAmount() {
            return this.totalAmount;
        }

        /**
         * @return totalAmountUnit
         */
        public String getTotalAmountUnit() {
            return this.totalAmountUnit;
        }

        public static final class Builder {
            private ApplicableProducts applicableProducts; 
            private String commodityCode; 
            private String deductType; 
            private String effectiveTime; 
            private String expiryTime; 
            private String instanceId; 
            private String packageType; 
            private String region; 
            private String remainingAmount; 
            private String remainingAmountUnit; 
            private String remark; 
            private String status; 
            private String totalAmount; 
            private String totalAmountUnit; 

            /**
             * The services to which the resource plan is applicable.
             */
            public Builder applicableProducts(ApplicableProducts applicableProducts) {
                this.applicableProducts = applicableProducts;
                return this;
            }

            /**
             * The commodity code.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The deduction type. Example: Absolute.
             */
            public Builder deductType(String deductType) {
                this.deductType = deductType;
                return this;
            }

            /**
             * The time when the resource plan took effect.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * The time when the resource plan expired.
             */
            public Builder expiryTime(String expiryTime) {
                this.expiryTime = expiryTime;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the resource plan.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
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
             * The remaining quota.
             */
            public Builder remainingAmount(String remainingAmount) {
                this.remainingAmount = remainingAmount;
                return this;
            }

            /**
             * The unit of the remaining quota.
             */
            public Builder remainingAmountUnit(String remainingAmountUnit) {
                this.remainingAmountUnit = remainingAmountUnit;
                return this;
            }

            /**
             * The remarks on the resource plan. The remarks must be made in Chinese.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The status of the resource plan. Valid values:
             * <p>
             * 
             * *   Available
             * *   Expired
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The total quota of the resource plan.
             */
            public Builder totalAmount(String totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * The unit of the total quota.
             */
            public Builder totalAmountUnit(String totalAmountUnit) {
                this.totalAmountUnit = totalAmountUnit;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private java.util.List < Instance> instance;

        private Instances(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private Instances instances;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private String pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private String totalCount;

        private Data(Builder builder) {
            this.hostId = builder.hostId;
            this.instances = builder.instances;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
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
         * @return instances
         */
        public Instances getInstances() {
            return this.instances;
        }

        /**
         * @return pageNum
         */
        public String getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String hostId; 
            private Instances instances; 
            private String pageNum; 
            private String pageSize; 
            private String totalCount; 

            /**
             * The ID of the host.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * The details of the instances.
             */
            public Builder instances(Instances instances) {
                this.instances = instances;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder pageNum(String pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of returned entries.
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
