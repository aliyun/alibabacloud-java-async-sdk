// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeStoragePlanResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStoragePlanResponseBody</p>
 */
public class DescribeStoragePlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribeStoragePlanResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStoragePlanResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeStoragePlanResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of storage plans.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the Integer data type.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><p><strong>30</strong></p>
         * </li>
         * <li><p><strong>50</strong></p>
         * </li>
         * <li><p><strong>100</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D9384D30-5C9A-11EA-BFC0-F754D2Bxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeStoragePlanResponseBody build() {
            return new DescribeStoragePlanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStoragePlanResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStoragePlanResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("EndTimes")
        private String endTimes;

        @com.aliyun.core.annotation.NameInMap("InitCapaCityViewUnit")
        private String initCapaCityViewUnit;

        @com.aliyun.core.annotation.NameInMap("InitCapacityViewValue")
        private String initCapacityViewValue;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PeriodCapaCityViewUnit")
        private String periodCapaCityViewUnit;

        @com.aliyun.core.annotation.NameInMap("PeriodCapacityViewValue")
        private String periodCapacityViewValue;

        @com.aliyun.core.annotation.NameInMap("PeriodTime")
        private String periodTime;

        @com.aliyun.core.annotation.NameInMap("ProdCode")
        private String prodCode;

        @com.aliyun.core.annotation.NameInMap("PurchaseTimes")
        private String purchaseTimes;

        @com.aliyun.core.annotation.NameInMap("StartTimes")
        private String startTimes;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private Items(Builder builder) {
            this.aliUid = builder.aliUid;
            this.commodityCode = builder.commodityCode;
            this.endTimes = builder.endTimes;
            this.initCapaCityViewUnit = builder.initCapaCityViewUnit;
            this.initCapacityViewValue = builder.initCapacityViewValue;
            this.instanceId = builder.instanceId;
            this.periodCapaCityViewUnit = builder.periodCapaCityViewUnit;
            this.periodCapacityViewValue = builder.periodCapacityViewValue;
            this.periodTime = builder.periodTime;
            this.prodCode = builder.prodCode;
            this.purchaseTimes = builder.purchaseTimes;
            this.startTimes = builder.startTimes;
            this.status = builder.status;
            this.storageType = builder.storageType;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return endTimes
         */
        public String getEndTimes() {
            return this.endTimes;
        }

        /**
         * @return initCapaCityViewUnit
         */
        public String getInitCapaCityViewUnit() {
            return this.initCapaCityViewUnit;
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
         * @return periodCapaCityViewUnit
         */
        public String getPeriodCapaCityViewUnit() {
            return this.periodCapaCityViewUnit;
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
         * @return prodCode
         */
        public String getProdCode() {
            return this.prodCode;
        }

        /**
         * @return purchaseTimes
         */
        public String getPurchaseTimes() {
            return this.purchaseTimes;
        }

        /**
         * @return startTimes
         */
        public String getStartTimes() {
            return this.startTimes;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String aliUid; 
            private String commodityCode; 
            private String endTimes; 
            private String initCapaCityViewUnit; 
            private String initCapacityViewValue; 
            private String instanceId; 
            private String periodCapaCityViewUnit; 
            private String periodCapacityViewValue; 
            private String periodTime; 
            private String prodCode; 
            private String purchaseTimes; 
            private String startTimes; 
            private String status; 
            private String storageType; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.aliUid = model.aliUid;
                this.commodityCode = model.commodityCode;
                this.endTimes = model.endTimes;
                this.initCapaCityViewUnit = model.initCapaCityViewUnit;
                this.initCapacityViewValue = model.initCapacityViewValue;
                this.instanceId = model.instanceId;
                this.periodCapaCityViewUnit = model.periodCapaCityViewUnit;
                this.periodCapacityViewValue = model.periodCapacityViewValue;
                this.periodTime = model.periodTime;
                this.prodCode = model.prodCode;
                this.purchaseTimes = model.purchaseTimes;
                this.startTimes = model.startTimes;
                this.status = model.status;
                this.storageType = model.storageType;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>18170112322*****</p>
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>polardb_package</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The expiration time of the storage plan.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-23 00:00:00</p>
             */
            public Builder endTimes(String endTimes) {
                this.endTimes = endTimes;
                return this;
            }

            /**
             * <p>The capacity unit of the storage plan.</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder initCapaCityViewUnit(String initCapaCityViewUnit) {
                this.initCapaCityViewUnit = initCapaCityViewUnit;
                return this;
            }

            /**
             * <p>The total capacity of the storage plan.</p>
             * 
             * <strong>example:</strong>
             * <p>500.000</p>
             */
            public Builder initCapacityViewValue(String initCapacityViewValue) {
                this.initCapacityViewValue = initCapacityViewValue;
                return this;
            }

            /**
             * <p>The resource instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>500072****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The period capacity unit of the storage plan.</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder periodCapaCityViewUnit(String periodCapaCityViewUnit) {
                this.periodCapaCityViewUnit = periodCapaCityViewUnit;
                return this;
            }

            /**
             * <p>The period capacity of the storage plan. The period capacity gradually decreases as the storage plan is used.</p>
             * 
             * <strong>example:</strong>
             * <p>400.000</p>
             */
            public Builder periodCapacityViewValue(String periodCapacityViewValue) {
                this.periodCapacityViewValue = periodCapacityViewValue;
                return this;
            }

            /**
             * <p>The period duration. This indicates that the capacity of the storage plan is measured and consumed by the hour.</p>
             * 
             * <strong>example:</strong>
             * <p>hour</p>
             */
            public Builder periodTime(String periodTime) {
                this.periodTime = periodTime;
                return this;
            }

            /**
             * <p>The product name.</p>
             * 
             * <strong>example:</strong>
             * <p>polardb</p>
             */
            public Builder prodCode(String prodCode) {
                this.prodCode = prodCode;
                return this;
            }

            /**
             * <p>The purchase time of the storage plan.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-22 12:03:27</p>
             */
            public Builder purchaseTimes(String purchaseTimes) {
                this.purchaseTimes = purchaseTimes;
                return this;
            }

            /**
             * <p>The effective period of the storage plan.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-22 12:03:25</p>
             */
            public Builder startTimes(String startTimes) {
                this.startTimes = startTimes;
                return this;
            }

            /**
             * <p>The status of the storage plan. Valid values:</p>
             * <ul>
             * <li><p><strong>Valid</strong>: Valid.</p>
             * </li>
             * <li><p><strong>Invalid</strong>: Invalid.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Valid</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the storage plan. Valid values:</p>
             * <ul>
             * <li><p><strong>Overseas</strong>: Hong Kong (China) and regions outside China</p>
             * </li>
             * <li><p><strong>Mainland</strong>: the Chinese mainland</p>
             * </li>
             * <li><p><strong>Financial</strong>: Finance Cloud</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Overseas</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The type of the resource plan. Valid values:</p>
             * <ul>
             * <li><p><strong>FPT_polardb_package_absolute_1540888383</strong>: the Chinese mainland</p>
             * </li>
             * <li><p><strong>FPT_polardb_package_absolute_1540890081</strong>: Hong Kong (China) and regions outside China</p>
             * </li>
             * <li><p><strong>FPT_polardb_package_absolute_1567151499</strong>: Finance Cloud</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FPT_polardb_package_absolute_1540890081</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
