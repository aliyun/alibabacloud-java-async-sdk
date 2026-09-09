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
 * {@link DescribeDeductLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeductLogsResponseBody</p>
 */
public class DescribeDeductLogsResponseBody extends TeaModel {
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

    private DescribeDeductLogsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeductLogsResponseBody create() {
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

        private Builder(DescribeDeductLogsResponseBody model) {
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The data list.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DF58589C-A06C-4224-8615-7797E6474FA3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDeductLogsResponseBody build() {
            return new DescribeDeductLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDeductLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeductLogsResponseBody</p>
     */
    public static class BillingCommodity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private BillingCommodity(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillingCommodity create() {
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

            private Builder(BillingCommodity model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * <p>The property code.</p>
             * 
             * <strong>example:</strong>
             * <p>snapshot</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The property name.</p>
             * 
             * <strong>example:</strong>
             * <p>云服务器ECS-快照</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public BillingCommodity build() {
                return new BillingCommodity(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDeductLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeductLogsResponseBody</p>
     */
    public static class BillingPriceField extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private BillingPriceField(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillingPriceField create() {
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

            private Builder(BillingPriceField model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * <p>The property code.</p>
             * 
             * <strong>example:</strong>
             * <p>Storage</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The property name.</p>
             * 
             * <strong>example:</strong>
             * <p>零折使用容量</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public BillingPriceField build() {
                return new BillingPriceField(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDeductLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeductLogsResponseBody</p>
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
             * <p>The property code.</p>
             * 
             * <strong>example:</strong>
             * <p>absolute</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The property name.</p>
             * 
             * <strong>example:</strong>
             * <p>总量恒定型</p>
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
     * {@link DescribeDeductLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeductLogsResponseBody</p>
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
             * <p>The property code.</p>
             * 
             * <strong>example:</strong>
             * <p>ossbag</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The property name.</p>
             * 
             * <strong>example:</strong>
             * <p>对象存储OSS资源包(包月)</p>
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
     * {@link DescribeDeductLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeductLogsResponseBody</p>
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
             * <p>The commitment cycle code.</p>
             * 
             * <strong>example:</strong>
             * <p>hour</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The commitment cycle name.</p>
             * 
             * <strong>example:</strong>
             * <p>小时</p>
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
     * {@link DescribeDeductLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeductLogsResponseBody</p>
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
             * <p>The property code.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The property name.</p>
             * 
             * <strong>example:</strong>
             * <p>对象存储</p>
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
     * {@link DescribeDeductLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeductLogsResponseBody</p>
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
             * <p>The property code.</p>
             * 
             * <strong>example:</strong>
             * <p>FPT_ossbag********</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The property name.</p>
             * 
             * <strong>example:</strong>
             * <p>标准存储包</p>
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
     * {@link DescribeDeductLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeductLogsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("BillingCommodity")
        private BillingCommodity billingCommodity;

        @com.aliyun.core.annotation.NameInMap("BillingCommodityCode")
        private String billingCommodityCode;

        @com.aliyun.core.annotation.NameInMap("BillingCommodityName")
        private String billingCommodityName;

        @com.aliyun.core.annotation.NameInMap("BillingEndTime")
        private Long billingEndTime;

        @com.aliyun.core.annotation.NameInMap("BillingInstanceId")
        private String billingInstanceId;

        @com.aliyun.core.annotation.NameInMap("BillingPriceField")
        private BillingPriceField billingPriceField;

        @com.aliyun.core.annotation.NameInMap("BillingPriceFieldCode")
        private String billingPriceFieldCode;

        @com.aliyun.core.annotation.NameInMap("BillingPriceFieldName")
        private String billingPriceFieldName;

        @com.aliyun.core.annotation.NameInMap("BillingStartTime")
        private Long billingStartTime;

        @com.aliyun.core.annotation.NameInMap("CapacityAfterDeductViewUnit")
        private String capacityAfterDeductViewUnit;

        @com.aliyun.core.annotation.NameInMap("CapacityAfterDeductViewValue")
        private String capacityAfterDeductViewValue;

        @com.aliyun.core.annotation.NameInMap("CapacityBeforeDeductViewUnit")
        private String capacityBeforeDeductViewUnit;

        @com.aliyun.core.annotation.NameInMap("CapacityBeforeDeductViewValue")
        private String capacityBeforeDeductViewValue;

        @com.aliyun.core.annotation.NameInMap("CapacityDeductedViewUnit")
        private String capacityDeductedViewUnit;

        @com.aliyun.core.annotation.NameInMap("CapacityDeductedViewValue")
        private String capacityDeductedViewValue;

        @com.aliyun.core.annotation.NameInMap("CapacityType")
        private CapacityType capacityType;

        @com.aliyun.core.annotation.NameInMap("CapacityTypeCode")
        private String capacityTypeCode;

        @com.aliyun.core.annotation.NameInMap("CapacityTypeName")
        private String capacityTypeName;

        @com.aliyun.core.annotation.NameInMap("Commodity")
        private Commodity commodity;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CommodityName")
        private String commodityName;

        @com.aliyun.core.annotation.NameInMap("CycleType")
        private CycleType cycleType;

        @com.aliyun.core.annotation.NameInMap("CycleTypeCode")
        private String cycleTypeCode;

        @com.aliyun.core.annotation.NameInMap("CycleTypeName")
        private String cycleTypeName;

        @com.aliyun.core.annotation.NameInMap("DeductTime")
        private Long deductTime;

        @com.aliyun.core.annotation.NameInMap("Factor")
        private String factor;

        @com.aliyun.core.annotation.NameInMap("InstanceBelongAccountId")
        private Long instanceBelongAccountId;

        @com.aliyun.core.annotation.NameInMap("InstanceBelongAccountName")
        private String instanceBelongAccountName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MeasureAfterDeductViewUnit")
        private String measureAfterDeductViewUnit;

        @com.aliyun.core.annotation.NameInMap("MeasureAfterDeductViewValue")
        private String measureAfterDeductViewValue;

        @com.aliyun.core.annotation.NameInMap("MeasureBeforeDeductViewUnit")
        private String measureBeforeDeductViewUnit;

        @com.aliyun.core.annotation.NameInMap("MeasureBeforeDeductViewValue")
        private String measureBeforeDeductViewValue;

        @com.aliyun.core.annotation.NameInMap("MeasureDeductedViewUnit")
        private String measureDeductedViewUnit;

        @com.aliyun.core.annotation.NameInMap("MeasureDeductedViewValue")
        private String measureDeductedViewValue;

        @com.aliyun.core.annotation.NameInMap("Product")
        private Product product;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("RelationAccountId")
        private Long relationAccountId;

        @com.aliyun.core.annotation.NameInMap("RelationAccountName")
        private String relationAccountName;

        @com.aliyun.core.annotation.NameInMap("Template")
        private Template template;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.billingCommodity = builder.billingCommodity;
            this.billingCommodityCode = builder.billingCommodityCode;
            this.billingCommodityName = builder.billingCommodityName;
            this.billingEndTime = builder.billingEndTime;
            this.billingInstanceId = builder.billingInstanceId;
            this.billingPriceField = builder.billingPriceField;
            this.billingPriceFieldCode = builder.billingPriceFieldCode;
            this.billingPriceFieldName = builder.billingPriceFieldName;
            this.billingStartTime = builder.billingStartTime;
            this.capacityAfterDeductViewUnit = builder.capacityAfterDeductViewUnit;
            this.capacityAfterDeductViewValue = builder.capacityAfterDeductViewValue;
            this.capacityBeforeDeductViewUnit = builder.capacityBeforeDeductViewUnit;
            this.capacityBeforeDeductViewValue = builder.capacityBeforeDeductViewValue;
            this.capacityDeductedViewUnit = builder.capacityDeductedViewUnit;
            this.capacityDeductedViewValue = builder.capacityDeductedViewValue;
            this.capacityType = builder.capacityType;
            this.capacityTypeCode = builder.capacityTypeCode;
            this.capacityTypeName = builder.capacityTypeName;
            this.commodity = builder.commodity;
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.cycleType = builder.cycleType;
            this.cycleTypeCode = builder.cycleTypeCode;
            this.cycleTypeName = builder.cycleTypeName;
            this.deductTime = builder.deductTime;
            this.factor = builder.factor;
            this.instanceBelongAccountId = builder.instanceBelongAccountId;
            this.instanceBelongAccountName = builder.instanceBelongAccountName;
            this.instanceId = builder.instanceId;
            this.measureAfterDeductViewUnit = builder.measureAfterDeductViewUnit;
            this.measureAfterDeductViewValue = builder.measureAfterDeductViewValue;
            this.measureBeforeDeductViewUnit = builder.measureBeforeDeductViewUnit;
            this.measureBeforeDeductViewValue = builder.measureBeforeDeductViewValue;
            this.measureDeductedViewUnit = builder.measureDeductedViewUnit;
            this.measureDeductedViewValue = builder.measureDeductedViewValue;
            this.product = builder.product;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.relationAccountId = builder.relationAccountId;
            this.relationAccountName = builder.relationAccountName;
            this.template = builder.template;
            this.templateCode = builder.templateCode;
            this.templateName = builder.templateName;
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
         * @return billingCommodity
         */
        public BillingCommodity getBillingCommodity() {
            return this.billingCommodity;
        }

        /**
         * @return billingCommodityCode
         */
        public String getBillingCommodityCode() {
            return this.billingCommodityCode;
        }

        /**
         * @return billingCommodityName
         */
        public String getBillingCommodityName() {
            return this.billingCommodityName;
        }

        /**
         * @return billingEndTime
         */
        public Long getBillingEndTime() {
            return this.billingEndTime;
        }

        /**
         * @return billingInstanceId
         */
        public String getBillingInstanceId() {
            return this.billingInstanceId;
        }

        /**
         * @return billingPriceField
         */
        public BillingPriceField getBillingPriceField() {
            return this.billingPriceField;
        }

        /**
         * @return billingPriceFieldCode
         */
        public String getBillingPriceFieldCode() {
            return this.billingPriceFieldCode;
        }

        /**
         * @return billingPriceFieldName
         */
        public String getBillingPriceFieldName() {
            return this.billingPriceFieldName;
        }

        /**
         * @return billingStartTime
         */
        public Long getBillingStartTime() {
            return this.billingStartTime;
        }

        /**
         * @return capacityAfterDeductViewUnit
         */
        public String getCapacityAfterDeductViewUnit() {
            return this.capacityAfterDeductViewUnit;
        }

        /**
         * @return capacityAfterDeductViewValue
         */
        public String getCapacityAfterDeductViewValue() {
            return this.capacityAfterDeductViewValue;
        }

        /**
         * @return capacityBeforeDeductViewUnit
         */
        public String getCapacityBeforeDeductViewUnit() {
            return this.capacityBeforeDeductViewUnit;
        }

        /**
         * @return capacityBeforeDeductViewValue
         */
        public String getCapacityBeforeDeductViewValue() {
            return this.capacityBeforeDeductViewValue;
        }

        /**
         * @return capacityDeductedViewUnit
         */
        public String getCapacityDeductedViewUnit() {
            return this.capacityDeductedViewUnit;
        }

        /**
         * @return capacityDeductedViewValue
         */
        public String getCapacityDeductedViewValue() {
            return this.capacityDeductedViewValue;
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
         * @return capacityTypeName
         */
        public String getCapacityTypeName() {
            return this.capacityTypeName;
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
         * @return deductTime
         */
        public Long getDeductTime() {
            return this.deductTime;
        }

        /**
         * @return factor
         */
        public String getFactor() {
            return this.factor;
        }

        /**
         * @return instanceBelongAccountId
         */
        public Long getInstanceBelongAccountId() {
            return this.instanceBelongAccountId;
        }

        /**
         * @return instanceBelongAccountName
         */
        public String getInstanceBelongAccountName() {
            return this.instanceBelongAccountName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return measureAfterDeductViewUnit
         */
        public String getMeasureAfterDeductViewUnit() {
            return this.measureAfterDeductViewUnit;
        }

        /**
         * @return measureAfterDeductViewValue
         */
        public String getMeasureAfterDeductViewValue() {
            return this.measureAfterDeductViewValue;
        }

        /**
         * @return measureBeforeDeductViewUnit
         */
        public String getMeasureBeforeDeductViewUnit() {
            return this.measureBeforeDeductViewUnit;
        }

        /**
         * @return measureBeforeDeductViewValue
         */
        public String getMeasureBeforeDeductViewValue() {
            return this.measureBeforeDeductViewValue;
        }

        /**
         * @return measureDeductedViewUnit
         */
        public String getMeasureDeductedViewUnit() {
            return this.measureDeductedViewUnit;
        }

        /**
         * @return measureDeductedViewValue
         */
        public String getMeasureDeductedViewValue() {
            return this.measureDeductedViewValue;
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
         * @return relationAccountId
         */
        public Long getRelationAccountId() {
            return this.relationAccountId;
        }

        /**
         * @return relationAccountName
         */
        public String getRelationAccountName() {
            return this.relationAccountName;
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

        public static final class Builder {
            private Long accountId; 
            private String accountName; 
            private BillingCommodity billingCommodity; 
            private String billingCommodityCode; 
            private String billingCommodityName; 
            private Long billingEndTime; 
            private String billingInstanceId; 
            private BillingPriceField billingPriceField; 
            private String billingPriceFieldCode; 
            private String billingPriceFieldName; 
            private Long billingStartTime; 
            private String capacityAfterDeductViewUnit; 
            private String capacityAfterDeductViewValue; 
            private String capacityBeforeDeductViewUnit; 
            private String capacityBeforeDeductViewValue; 
            private String capacityDeductedViewUnit; 
            private String capacityDeductedViewValue; 
            private CapacityType capacityType; 
            private String capacityTypeCode; 
            private String capacityTypeName; 
            private Commodity commodity; 
            private String commodityCode; 
            private String commodityName; 
            private CycleType cycleType; 
            private String cycleTypeCode; 
            private String cycleTypeName; 
            private Long deductTime; 
            private String factor; 
            private Long instanceBelongAccountId; 
            private String instanceBelongAccountName; 
            private String instanceId; 
            private String measureAfterDeductViewUnit; 
            private String measureAfterDeductViewValue; 
            private String measureBeforeDeductViewUnit; 
            private String measureBeforeDeductViewValue; 
            private String measureDeductedViewUnit; 
            private String measureDeductedViewValue; 
            private Product product; 
            private String productCode; 
            private String productName; 
            private Long relationAccountId; 
            private String relationAccountName; 
            private Template template; 
            private String templateCode; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.billingCommodity = model.billingCommodity;
                this.billingCommodityCode = model.billingCommodityCode;
                this.billingCommodityName = model.billingCommodityName;
                this.billingEndTime = model.billingEndTime;
                this.billingInstanceId = model.billingInstanceId;
                this.billingPriceField = model.billingPriceField;
                this.billingPriceFieldCode = model.billingPriceFieldCode;
                this.billingPriceFieldName = model.billingPriceFieldName;
                this.billingStartTime = model.billingStartTime;
                this.capacityAfterDeductViewUnit = model.capacityAfterDeductViewUnit;
                this.capacityAfterDeductViewValue = model.capacityAfterDeductViewValue;
                this.capacityBeforeDeductViewUnit = model.capacityBeforeDeductViewUnit;
                this.capacityBeforeDeductViewValue = model.capacityBeforeDeductViewValue;
                this.capacityDeductedViewUnit = model.capacityDeductedViewUnit;
                this.capacityDeductedViewValue = model.capacityDeductedViewValue;
                this.capacityType = model.capacityType;
                this.capacityTypeCode = model.capacityTypeCode;
                this.capacityTypeName = model.capacityTypeName;
                this.commodity = model.commodity;
                this.commodityCode = model.commodityCode;
                this.commodityName = model.commodityName;
                this.cycleType = model.cycleType;
                this.cycleTypeCode = model.cycleTypeCode;
                this.cycleTypeName = model.cycleTypeName;
                this.deductTime = model.deductTime;
                this.factor = model.factor;
                this.instanceBelongAccountId = model.instanceBelongAccountId;
                this.instanceBelongAccountName = model.instanceBelongAccountName;
                this.instanceId = model.instanceId;
                this.measureAfterDeductViewUnit = model.measureAfterDeductViewUnit;
                this.measureAfterDeductViewValue = model.measureAfterDeductViewValue;
                this.measureBeforeDeductViewUnit = model.measureBeforeDeductViewUnit;
                this.measureBeforeDeductViewValue = model.measureBeforeDeductViewValue;
                this.measureDeductedViewUnit = model.measureDeductedViewUnit;
                this.measureDeductedViewValue = model.measureDeductedViewValue;
                this.product = model.product;
                this.productCode = model.productCode;
                this.productName = model.productName;
                this.relationAccountId = model.relationAccountId;
                this.relationAccountName = model.relationAccountName;
                this.template = model.template;
                this.templateCode = model.templateCode;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1929817951466001</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The account name.</p>
             * 
             * <strong>example:</strong>
             * <p>icloudtest</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The deducted commodity.</p>
             */
            public Builder billingCommodity(BillingCommodity billingCommodity) {
                this.billingCommodity = billingCommodity;
                return this;
            }

            /**
             * <p>The deducted commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>snapshot</p>
             */
            public Builder billingCommodityCode(String billingCommodityCode) {
                this.billingCommodityCode = billingCommodityCode;
                return this;
            }

            /**
             * <p>The deducted commodity name.</p>
             * 
             * <strong>example:</strong>
             * <p>云服务器ECS-快照</p>
             */
            public Builder billingCommodityName(String billingCommodityName) {
                this.billingCommodityName = billingCommodityName;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>1679036400000</p>
             */
            public Builder billingEndTime(Long billingEndTime) {
                this.billingEndTime = billingEndTime;
                return this;
            }

            /**
             * <p>The deduction instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder billingInstanceId(String billingInstanceId) {
                this.billingInstanceId = billingInstanceId;
                return this;
            }

            /**
             * <p>The deduction billable item.</p>
             */
            public Builder billingPriceField(BillingPriceField billingPriceField) {
                this.billingPriceField = billingPriceField;
                return this;
            }

            /**
             * <p>The deduction billable item code.</p>
             * 
             * <strong>example:</strong>
             * <p>Storage</p>
             */
            public Builder billingPriceFieldCode(String billingPriceFieldCode) {
                this.billingPriceFieldCode = billingPriceFieldCode;
                return this;
            }

            /**
             * <p>The deduction billable item name.</p>
             * 
             * <strong>example:</strong>
             * <p>零折使用容量</p>
             */
            public Builder billingPriceFieldName(String billingPriceFieldName) {
                this.billingPriceFieldName = billingPriceFieldName;
                return this;
            }

            /**
             * <p>The effective period.</p>
             * 
             * <strong>example:</strong>
             * <p>1679032800000</p>
             */
            public Builder billingStartTime(Long billingStartTime) {
                this.billingStartTime = billingStartTime;
                return this;
            }

            /**
             * <p>The display unit of the capacity after deduction.</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder capacityAfterDeductViewUnit(String capacityAfterDeductViewUnit) {
                this.capacityAfterDeductViewUnit = capacityAfterDeductViewUnit;
                return this;
            }

            /**
             * <p>The display value of the capacity after deduction.</p>
             * 
             * <strong>example:</strong>
             * <p>23.896484</p>
             */
            public Builder capacityAfterDeductViewValue(String capacityAfterDeductViewValue) {
                this.capacityAfterDeductViewValue = capacityAfterDeductViewValue;
                return this;
            }

            /**
             * <p>The display unit of the capacity before deduction.</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder capacityBeforeDeductViewUnit(String capacityBeforeDeductViewUnit) {
                this.capacityBeforeDeductViewUnit = capacityBeforeDeductViewUnit;
                return this;
            }

            /**
             * <p>The display value of the capacity before deduction.</p>
             * 
             * <strong>example:</strong>
             * <p>40.000000</p>
             */
            public Builder capacityBeforeDeductViewValue(String capacityBeforeDeductViewValue) {
                this.capacityBeforeDeductViewValue = capacityBeforeDeductViewValue;
                return this;
            }

            /**
             * <p>The display unit of the deducted capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder capacityDeductedViewUnit(String capacityDeductedViewUnit) {
                this.capacityDeductedViewUnit = capacityDeductedViewUnit;
                return this;
            }

            /**
             * <p>The display value of the deducted capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>16.103515</p>
             */
            public Builder capacityDeductedViewValue(String capacityDeductedViewValue) {
                this.capacityDeductedViewValue = capacityDeductedViewValue;
                return this;
            }

            /**
             * <p>The capacity type.</p>
             */
            public Builder capacityType(CapacityType capacityType) {
                this.capacityType = capacityType;
                return this;
            }

            /**
             * <p>The capacity type code.</p>
             * 
             * <strong>example:</strong>
             * <p>absolute</p>
             */
            public Builder capacityTypeCode(String capacityTypeCode) {
                this.capacityTypeCode = capacityTypeCode;
                return this;
            }

            /**
             * <p>The capacity type name.</p>
             * 
             * <strong>example:</strong>
             * <p>总量恒定型</p>
             */
            public Builder capacityTypeName(String capacityTypeName) {
                this.capacityTypeName = capacityTypeName;
                return this;
            }

            /**
             * <p>The commodity.</p>
             */
            public Builder commodity(Commodity commodity) {
                this.commodity = commodity;
                return this;
            }

            /**
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>ossbag</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The commodity name.</p>
             * 
             * <strong>example:</strong>
             * <p>对象存储OSS资源包(包月)</p>
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * <p>The commitment cycle.</p>
             */
            public Builder cycleType(CycleType cycleType) {
                this.cycleType = cycleType;
                return this;
            }

            /**
             * <p>The commitment cycle code.</p>
             * 
             * <strong>example:</strong>
             * <p>hour</p>
             */
            public Builder cycleTypeCode(String cycleTypeCode) {
                this.cycleTypeCode = cycleTypeCode;
                return this;
            }

            /**
             * <p>The commitment cycle name.</p>
             * 
             * <strong>example:</strong>
             * <p>小时</p>
             */
            public Builder cycleTypeName(String cycleTypeName) {
                this.cycleTypeName = cycleTypeName;
                return this;
            }

            /**
             * <p>The deduction time.</p>
             * 
             * <strong>example:</strong>
             * <p>1679039572000</p>
             */
            public Builder deductTime(Long deductTime) {
                this.deductTime = deductTime;
                return this;
            }

            /**
             * <p>The deduction factor.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder factor(String factor) {
                this.factor = factor;
                return this;
            }

            /**
             * <p>The ID of the account to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1990699401005016</p>
             */
            public Builder instanceBelongAccountId(Long instanceBelongAccountId) {
                this.instanceBelongAccountId = instanceBelongAccountId;
                return this;
            }

            /**
             * <p>The name of the account to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>icloudtest</p>
             */
            public Builder instanceBelongAccountName(String instanceBelongAccountName) {
                this.instanceBelongAccountName = instanceBelongAccountName;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>OSSBAG-cn-****s</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The display unit of the metering amount after deduction.</p>
             * 
             * <strong>example:</strong>
             * <p>Byte</p>
             */
            public Builder measureAfterDeductViewUnit(String measureAfterDeductViewUnit) {
                this.measureAfterDeductViewUnit = measureAfterDeductViewUnit;
                return this;
            }

            /**
             * <p>The display value of the metering amount after deduction.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder measureAfterDeductViewValue(String measureAfterDeductViewValue) {
                this.measureAfterDeductViewValue = measureAfterDeductViewValue;
                return this;
            }

            /**
             * <p>The display unit of the metering amount before deduction.</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder measureBeforeDeductViewUnit(String measureBeforeDeductViewUnit) {
                this.measureBeforeDeductViewUnit = measureBeforeDeductViewUnit;
                return this;
            }

            /**
             * <p>The display value of the metering amount before deduction.</p>
             * 
             * <strong>example:</strong>
             * <p>16.103515</p>
             */
            public Builder measureBeforeDeductViewValue(String measureBeforeDeductViewValue) {
                this.measureBeforeDeductViewValue = measureBeforeDeductViewValue;
                return this;
            }

            /**
             * <p>The display unit of the deducted metering amount.</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder measureDeductedViewUnit(String measureDeductedViewUnit) {
                this.measureDeductedViewUnit = measureDeductedViewUnit;
                return this;
            }

            /**
             * <p>The display value of the deducted metering amount.</p>
             * 
             * <strong>example:</strong>
             * <p>16.103515</p>
             */
            public Builder measureDeductedViewValue(String measureDeductedViewValue) {
                this.measureDeductedViewValue = measureDeductedViewValue;
                return this;
            }

            /**
             * <p>The product.</p>
             */
            public Builder product(Product product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The product code.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The product name.</p>
             * 
             * <strong>example:</strong>
             * <p>对象存储</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The deduction account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1990699401005016</p>
             */
            public Builder relationAccountId(Long relationAccountId) {
                this.relationAccountId = relationAccountId;
                return this;
            }

            /**
             * <p>The deduction account name.</p>
             * 
             * <strong>example:</strong>
             * <p>icloudtest</p>
             */
            public Builder relationAccountName(String relationAccountName) {
                this.relationAccountName = relationAccountName;
                return this;
            }

            /**
             * <p>The template.</p>
             */
            public Builder template(Template template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The template code.</p>
             * 
             * <strong>example:</strong>
             * <p>FPT_ossbag********</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>标准存储包</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
