// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link DescribeFrInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFrInstancesResponseBody</p>
 */
public class DescribeFrInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeFrInstancesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFrInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Data> data; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeFrInstancesResponseBody model) {
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeFrInstancesResponseBody build() {
            return new DescribeFrInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFrInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFrInstancesResponseBody</p>
     */
    public static class AutoPurchase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlreadyAutoPurchase")
        private Boolean alreadyAutoPurchase;

        @com.aliyun.core.annotation.NameInMap("SettingAutoPurchase")
        private Boolean settingAutoPurchase;

        @com.aliyun.core.annotation.NameInMap("SupportAutoPurchase")
        private Boolean supportAutoPurchase;

        private AutoPurchase(Builder builder) {
            this.alreadyAutoPurchase = builder.alreadyAutoPurchase;
            this.settingAutoPurchase = builder.settingAutoPurchase;
            this.supportAutoPurchase = builder.supportAutoPurchase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoPurchase create() {
            return builder().build();
        }

        /**
         * @return alreadyAutoPurchase
         */
        public Boolean getAlreadyAutoPurchase() {
            return this.alreadyAutoPurchase;
        }

        /**
         * @return settingAutoPurchase
         */
        public Boolean getSettingAutoPurchase() {
            return this.settingAutoPurchase;
        }

        /**
         * @return supportAutoPurchase
         */
        public Boolean getSupportAutoPurchase() {
            return this.supportAutoPurchase;
        }

        public static final class Builder {
            private Boolean alreadyAutoPurchase; 
            private Boolean settingAutoPurchase; 
            private Boolean supportAutoPurchase; 

            private Builder() {
            } 

            private Builder(AutoPurchase model) {
                this.alreadyAutoPurchase = model.alreadyAutoPurchase;
                this.settingAutoPurchase = model.settingAutoPurchase;
                this.supportAutoPurchase = model.supportAutoPurchase;
            } 

            /**
             * AlreadyAutoPurchase.
             */
            public Builder alreadyAutoPurchase(Boolean alreadyAutoPurchase) {
                this.alreadyAutoPurchase = alreadyAutoPurchase;
                return this;
            }

            /**
             * SettingAutoPurchase.
             */
            public Builder settingAutoPurchase(Boolean settingAutoPurchase) {
                this.settingAutoPurchase = settingAutoPurchase;
                return this;
            }

            /**
             * SupportAutoPurchase.
             */
            public Builder supportAutoPurchase(Boolean supportAutoPurchase) {
                this.supportAutoPurchase = supportAutoPurchase;
                return this;
            }

            public AutoPurchase build() {
                return new AutoPurchase(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFrInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFrInstancesResponseBody</p>
     */
    public static class CapacityType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private CapacityType(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityType create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(CapacityType model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CapacityType build() {
                return new CapacityType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFrInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFrInstancesResponseBody</p>
     */
    public static class Commodity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Commodity(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commodity create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(Commodity model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Commodity build() {
                return new Commodity(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFrInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFrInstancesResponseBody</p>
     */
    public static class CycleType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private CycleType(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CycleType create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(CycleType model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CycleType build() {
                return new CycleType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFrInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFrInstancesResponseBody</p>
     */
    public static class DeductRegions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DeductRegions(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeductRegions create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(DeductRegions model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DeductRegions build() {
                return new DeductRegions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFrInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFrInstancesResponseBody</p>
     */
    public static class Product extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Product(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Product create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(Product model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Product build() {
                return new Product(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFrInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFrInstancesResponseBody</p>
     */
    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Status(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(Status model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFrInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFrInstancesResponseBody</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Template(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(Template model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFrInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFrInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AutoPurchase")
        private AutoPurchase autoPurchase;

        @com.aliyun.core.annotation.NameInMap("CapacitiyTypeName")
        private String capacitiyTypeName;

        @com.aliyun.core.annotation.NameInMap("CapacityType")
        private CapacityType capacityType;

        @com.aliyun.core.annotation.NameInMap("CapacityTypeCode")
        private String capacityTypeCode;

        @com.aliyun.core.annotation.NameInMap("Commodity")
        private Commodity commodity;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CommodityName")
        private String commodityName;

        @com.aliyun.core.annotation.NameInMap("CurrCapacityBaseUnit")
        private String currCapacityBaseUnit;

        @com.aliyun.core.annotation.NameInMap("CurrCapacityBaseValue")
        private String currCapacityBaseValue;

        @com.aliyun.core.annotation.NameInMap("CurrCapacityViewUnit")
        private String currCapacityViewUnit;

        @com.aliyun.core.annotation.NameInMap("CurrCapacityViewValue")
        private String currCapacityViewValue;

        @com.aliyun.core.annotation.NameInMap("CycleType")
        private CycleType cycleType;

        @com.aliyun.core.annotation.NameInMap("CycleTypeCode")
        private String cycleTypeCode;

        @com.aliyun.core.annotation.NameInMap("CycleTypeName")
        private String cycleTypeName;

        @com.aliyun.core.annotation.NameInMap("DeductRegions")
        private java.util.List<DeductRegions> deductRegions;

        @com.aliyun.core.annotation.NameInMap("EnableDeductRule")
        private Boolean enableDeductRule;

        @com.aliyun.core.annotation.NameInMap("EnableExchange")
        private Boolean enableExchange;

        @com.aliyun.core.annotation.NameInMap("EnableRenew")
        private Boolean enableRenew;

        @com.aliyun.core.annotation.NameInMap("EnableUpgrade")
        private Boolean enableUpgrade;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("ExchangeCommodityCode")
        private String exchangeCommodityCode;

        @com.aliyun.core.annotation.NameInMap("InitCapacityBaseUnit")
        private String initCapacityBaseUnit;

        @com.aliyun.core.annotation.NameInMap("InitCapacityBaseValue")
        private String initCapacityBaseValue;

        @com.aliyun.core.annotation.NameInMap("InitCapacityViewUnit")
        private String initCapacityViewUnit;

        @com.aliyun.core.annotation.NameInMap("InitCapacityViewValue")
        private String initCapacityViewValue;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PeriodCapacityViewUnit")
        private String periodCapacityViewUnit;

        @com.aliyun.core.annotation.NameInMap("PeriodCapacityViewValue")
        private String periodCapacityViewValue;

        @com.aliyun.core.annotation.NameInMap("PeriodTime")
        private String periodTime;

        @com.aliyun.core.annotation.NameInMap("Product")
        private Product product;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("PurchaseTime")
        private Long purchaseTime;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Status status;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("StatusName")
        private String statusName;

        @com.aliyun.core.annotation.NameInMap("Template")
        private Template template;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("periodCapacityBaseUnit")
        private String periodCapacityBaseUnit;

        @com.aliyun.core.annotation.NameInMap("periodCapacityBaseValue")
        private String periodCapacityBaseValue;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.autoPurchase = builder.autoPurchase;
            this.capacitiyTypeName = builder.capacitiyTypeName;
            this.capacityType = builder.capacityType;
            this.capacityTypeCode = builder.capacityTypeCode;
            this.commodity = builder.commodity;
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.currCapacityBaseUnit = builder.currCapacityBaseUnit;
            this.currCapacityBaseValue = builder.currCapacityBaseValue;
            this.currCapacityViewUnit = builder.currCapacityViewUnit;
            this.currCapacityViewValue = builder.currCapacityViewValue;
            this.cycleType = builder.cycleType;
            this.cycleTypeCode = builder.cycleTypeCode;
            this.cycleTypeName = builder.cycleTypeName;
            this.deductRegions = builder.deductRegions;
            this.enableDeductRule = builder.enableDeductRule;
            this.enableExchange = builder.enableExchange;
            this.enableRenew = builder.enableRenew;
            this.enableUpgrade = builder.enableUpgrade;
            this.endTime = builder.endTime;
            this.exchangeCommodityCode = builder.exchangeCommodityCode;
            this.initCapacityBaseUnit = builder.initCapacityBaseUnit;
            this.initCapacityBaseValue = builder.initCapacityBaseValue;
            this.initCapacityViewUnit = builder.initCapacityViewUnit;
            this.initCapacityViewValue = builder.initCapacityViewValue;
            this.instanceId = builder.instanceId;
            this.periodCapacityViewUnit = builder.periodCapacityViewUnit;
            this.periodCapacityViewValue = builder.periodCapacityViewValue;
            this.periodTime = builder.periodTime;
            this.product = builder.product;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.purchaseTime = builder.purchaseTime;
            this.region = builder.region;
            this.regionName = builder.regionName;
            this.spec = builder.spec;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusCode = builder.statusCode;
            this.statusName = builder.statusName;
            this.template = builder.template;
            this.templateCode = builder.templateCode;
            this.templateName = builder.templateName;
            this.periodCapacityBaseUnit = builder.periodCapacityBaseUnit;
            this.periodCapacityBaseValue = builder.periodCapacityBaseValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return autoPurchase
         */
        public AutoPurchase getAutoPurchase() {
            return this.autoPurchase;
        }

        /**
         * @return capacitiyTypeName
         */
        public String getCapacitiyTypeName() {
            return this.capacitiyTypeName;
        }

        /**
         * @return capacityType
         */
        public CapacityType getCapacityType() {
            return this.capacityType;
        }

        /**
         * @return capacityTypeCode
         */
        public String getCapacityTypeCode() {
            return this.capacityTypeCode;
        }

        /**
         * @return commodity
         */
        public Commodity getCommodity() {
            return this.commodity;
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
         * @return currCapacityBaseUnit
         */
        public String getCurrCapacityBaseUnit() {
            return this.currCapacityBaseUnit;
        }

        /**
         * @return currCapacityBaseValue
         */
        public String getCurrCapacityBaseValue() {
            return this.currCapacityBaseValue;
        }

        /**
         * @return currCapacityViewUnit
         */
        public String getCurrCapacityViewUnit() {
            return this.currCapacityViewUnit;
        }

        /**
         * @return currCapacityViewValue
         */
        public String getCurrCapacityViewValue() {
            return this.currCapacityViewValue;
        }

        /**
         * @return cycleType
         */
        public CycleType getCycleType() {
            return this.cycleType;
        }

        /**
         * @return cycleTypeCode
         */
        public String getCycleTypeCode() {
            return this.cycleTypeCode;
        }

        /**
         * @return cycleTypeName
         */
        public String getCycleTypeName() {
            return this.cycleTypeName;
        }

        /**
         * @return deductRegions
         */
        public java.util.List<DeductRegions> getDeductRegions() {
            return this.deductRegions;
        }

        /**
         * @return enableDeductRule
         */
        public Boolean getEnableDeductRule() {
            return this.enableDeductRule;
        }

        /**
         * @return enableExchange
         */
        public Boolean getEnableExchange() {
            return this.enableExchange;
        }

        /**
         * @return enableRenew
         */
        public Boolean getEnableRenew() {
            return this.enableRenew;
        }

        /**
         * @return enableUpgrade
         */
        public Boolean getEnableUpgrade() {
            return this.enableUpgrade;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return exchangeCommodityCode
         */
        public String getExchangeCommodityCode() {
            return this.exchangeCommodityCode;
        }

        /**
         * @return initCapacityBaseUnit
         */
        public String getInitCapacityBaseUnit() {
            return this.initCapacityBaseUnit;
        }

        /**
         * @return initCapacityBaseValue
         */
        public String getInitCapacityBaseValue() {
            return this.initCapacityBaseValue;
        }

        /**
         * @return initCapacityViewUnit
         */
        public String getInitCapacityViewUnit() {
            return this.initCapacityViewUnit;
        }

        /**
         * @return initCapacityViewValue
         */
        public String getInitCapacityViewValue() {
            return this.initCapacityViewValue;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return periodCapacityViewUnit
         */
        public String getPeriodCapacityViewUnit() {
            return this.periodCapacityViewUnit;
        }

        /**
         * @return periodCapacityViewValue
         */
        public String getPeriodCapacityViewValue() {
            return this.periodCapacityViewValue;
        }

        /**
         * @return periodTime
         */
        public String getPeriodTime() {
            return this.periodTime;
        }

        /**
         * @return product
         */
        public Product getProduct() {
            return this.product;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return purchaseTime
         */
        public Long getPurchaseTime() {
            return this.purchaseTime;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Status getStatus() {
            return this.status;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return statusName
         */
        public String getStatusName() {
            return this.statusName;
        }

        /**
         * @return template
         */
        public Template getTemplate() {
            return this.template;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return periodCapacityBaseUnit
         */
        public String getPeriodCapacityBaseUnit() {
            return this.periodCapacityBaseUnit;
        }

        /**
         * @return periodCapacityBaseValue
         */
        public String getPeriodCapacityBaseValue() {
            return this.periodCapacityBaseValue;
        }

        public static final class Builder {
            private Long accountId; 
            private String accountName; 
            private AutoPurchase autoPurchase; 
            private String capacitiyTypeName; 
            private CapacityType capacityType; 
            private String capacityTypeCode; 
            private Commodity commodity; 
            private String commodityCode; 
            private String commodityName; 
            private String currCapacityBaseUnit; 
            private String currCapacityBaseValue; 
            private String currCapacityViewUnit; 
            private String currCapacityViewValue; 
            private CycleType cycleType; 
            private String cycleTypeCode; 
            private String cycleTypeName; 
            private java.util.List<DeductRegions> deductRegions; 
            private Boolean enableDeductRule; 
            private Boolean enableExchange; 
            private Boolean enableRenew; 
            private Boolean enableUpgrade; 
            private Long endTime; 
            private String exchangeCommodityCode; 
            private String initCapacityBaseUnit; 
            private String initCapacityBaseValue; 
            private String initCapacityViewUnit; 
            private String initCapacityViewValue; 
            private String instanceId; 
            private String periodCapacityViewUnit; 
            private String periodCapacityViewValue; 
            private String periodTime; 
            private Product product; 
            private String productCode; 
            private String productName; 
            private Long purchaseTime; 
            private String region; 
            private String regionName; 
            private String spec; 
            private Long startTime; 
            private Status status; 
            private String statusCode; 
            private String statusName; 
            private Template template; 
            private String templateCode; 
            private String templateName; 
            private String periodCapacityBaseUnit; 
            private String periodCapacityBaseValue; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.autoPurchase = model.autoPurchase;
                this.capacitiyTypeName = model.capacitiyTypeName;
                this.capacityType = model.capacityType;
                this.capacityTypeCode = model.capacityTypeCode;
                this.commodity = model.commodity;
                this.commodityCode = model.commodityCode;
                this.commodityName = model.commodityName;
                this.currCapacityBaseUnit = model.currCapacityBaseUnit;
                this.currCapacityBaseValue = model.currCapacityBaseValue;
                this.currCapacityViewUnit = model.currCapacityViewUnit;
                this.currCapacityViewValue = model.currCapacityViewValue;
                this.cycleType = model.cycleType;
                this.cycleTypeCode = model.cycleTypeCode;
                this.cycleTypeName = model.cycleTypeName;
                this.deductRegions = model.deductRegions;
                this.enableDeductRule = model.enableDeductRule;
                this.enableExchange = model.enableExchange;
                this.enableRenew = model.enableRenew;
                this.enableUpgrade = model.enableUpgrade;
                this.endTime = model.endTime;
                this.exchangeCommodityCode = model.exchangeCommodityCode;
                this.initCapacityBaseUnit = model.initCapacityBaseUnit;
                this.initCapacityBaseValue = model.initCapacityBaseValue;
                this.initCapacityViewUnit = model.initCapacityViewUnit;
                this.initCapacityViewValue = model.initCapacityViewValue;
                this.instanceId = model.instanceId;
                this.periodCapacityViewUnit = model.periodCapacityViewUnit;
                this.periodCapacityViewValue = model.periodCapacityViewValue;
                this.periodTime = model.periodTime;
                this.product = model.product;
                this.productCode = model.productCode;
                this.productName = model.productName;
                this.purchaseTime = model.purchaseTime;
                this.region = model.region;
                this.regionName = model.regionName;
                this.spec = model.spec;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusCode = model.statusCode;
                this.statusName = model.statusName;
                this.template = model.template;
                this.templateCode = model.templateCode;
                this.templateName = model.templateName;
                this.periodCapacityBaseUnit = model.periodCapacityBaseUnit;
                this.periodCapacityBaseValue = model.periodCapacityBaseValue;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * AutoPurchase.
             */
            public Builder autoPurchase(AutoPurchase autoPurchase) {
                this.autoPurchase = autoPurchase;
                return this;
            }

            /**
             * CapacitiyTypeName.
             */
            public Builder capacitiyTypeName(String capacitiyTypeName) {
                this.capacitiyTypeName = capacitiyTypeName;
                return this;
            }

            /**
             * CapacityType.
             */
            public Builder capacityType(CapacityType capacityType) {
                this.capacityType = capacityType;
                return this;
            }

            /**
             * CapacityTypeCode.
             */
            public Builder capacityTypeCode(String capacityTypeCode) {
                this.capacityTypeCode = capacityTypeCode;
                return this;
            }

            /**
             * Commodity.
             */
            public Builder commodity(Commodity commodity) {
                this.commodity = commodity;
                return this;
            }

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
             * CurrCapacityBaseUnit.
             */
            public Builder currCapacityBaseUnit(String currCapacityBaseUnit) {
                this.currCapacityBaseUnit = currCapacityBaseUnit;
                return this;
            }

            /**
             * CurrCapacityBaseValue.
             */
            public Builder currCapacityBaseValue(String currCapacityBaseValue) {
                this.currCapacityBaseValue = currCapacityBaseValue;
                return this;
            }

            /**
             * CurrCapacityViewUnit.
             */
            public Builder currCapacityViewUnit(String currCapacityViewUnit) {
                this.currCapacityViewUnit = currCapacityViewUnit;
                return this;
            }

            /**
             * CurrCapacityViewValue.
             */
            public Builder currCapacityViewValue(String currCapacityViewValue) {
                this.currCapacityViewValue = currCapacityViewValue;
                return this;
            }

            /**
             * CycleType.
             */
            public Builder cycleType(CycleType cycleType) {
                this.cycleType = cycleType;
                return this;
            }

            /**
             * CycleTypeCode.
             */
            public Builder cycleTypeCode(String cycleTypeCode) {
                this.cycleTypeCode = cycleTypeCode;
                return this;
            }

            /**
             * CycleTypeName.
             */
            public Builder cycleTypeName(String cycleTypeName) {
                this.cycleTypeName = cycleTypeName;
                return this;
            }

            /**
             * DeductRegions.
             */
            public Builder deductRegions(java.util.List<DeductRegions> deductRegions) {
                this.deductRegions = deductRegions;
                return this;
            }

            /**
             * EnableDeductRule.
             */
            public Builder enableDeductRule(Boolean enableDeductRule) {
                this.enableDeductRule = enableDeductRule;
                return this;
            }

            /**
             * EnableExchange.
             */
            public Builder enableExchange(Boolean enableExchange) {
                this.enableExchange = enableExchange;
                return this;
            }

            /**
             * EnableRenew.
             */
            public Builder enableRenew(Boolean enableRenew) {
                this.enableRenew = enableRenew;
                return this;
            }

            /**
             * EnableUpgrade.
             */
            public Builder enableUpgrade(Boolean enableUpgrade) {
                this.enableUpgrade = enableUpgrade;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExchangeCommodityCode.
             */
            public Builder exchangeCommodityCode(String exchangeCommodityCode) {
                this.exchangeCommodityCode = exchangeCommodityCode;
                return this;
            }

            /**
             * InitCapacityBaseUnit.
             */
            public Builder initCapacityBaseUnit(String initCapacityBaseUnit) {
                this.initCapacityBaseUnit = initCapacityBaseUnit;
                return this;
            }

            /**
             * InitCapacityBaseValue.
             */
            public Builder initCapacityBaseValue(String initCapacityBaseValue) {
                this.initCapacityBaseValue = initCapacityBaseValue;
                return this;
            }

            /**
             * InitCapacityViewUnit.
             */
            public Builder initCapacityViewUnit(String initCapacityViewUnit) {
                this.initCapacityViewUnit = initCapacityViewUnit;
                return this;
            }

            /**
             * InitCapacityViewValue.
             */
            public Builder initCapacityViewValue(String initCapacityViewValue) {
                this.initCapacityViewValue = initCapacityViewValue;
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
             * PeriodCapacityViewUnit.
             */
            public Builder periodCapacityViewUnit(String periodCapacityViewUnit) {
                this.periodCapacityViewUnit = periodCapacityViewUnit;
                return this;
            }

            /**
             * PeriodCapacityViewValue.
             */
            public Builder periodCapacityViewValue(String periodCapacityViewValue) {
                this.periodCapacityViewValue = periodCapacityViewValue;
                return this;
            }

            /**
             * PeriodTime.
             */
            public Builder periodTime(String periodTime) {
                this.periodTime = periodTime;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(Product product) {
                this.product = product;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * PurchaseTime.
             */
            public Builder purchaseTime(Long purchaseTime) {
                this.purchaseTime = purchaseTime;
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
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
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
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            /**
             * StatusCode.
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * StatusName.
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(Template template) {
                this.template = template;
                return this;
            }

            /**
             * TemplateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * periodCapacityBaseUnit.
             */
            public Builder periodCapacityBaseUnit(String periodCapacityBaseUnit) {
                this.periodCapacityBaseUnit = periodCapacityBaseUnit;
                return this;
            }

            /**
             * periodCapacityBaseValue.
             */
            public Builder periodCapacityBaseValue(String periodCapacityBaseValue) {
                this.periodCapacityBaseValue = periodCapacityBaseValue;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
