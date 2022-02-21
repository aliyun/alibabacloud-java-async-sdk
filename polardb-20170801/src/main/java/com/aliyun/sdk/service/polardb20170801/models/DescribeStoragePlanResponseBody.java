// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStoragePlanResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStoragePlanResponseBody</p>
 */
public class DescribeStoragePlanResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
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

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
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
        private java.util.List < Items> items; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalRecordCount; 

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeStoragePlanResponseBody build() {
            return new DescribeStoragePlanResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AliUid")
        private String aliUid;

        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("EndTimes")
        private String endTimes;

        @NameInMap("InitCapaCityViewUnit")
        private String initCapaCityViewUnit;

        @NameInMap("InitCapacityViewValue")
        private String initCapacityViewValue;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("PeriodCapaCityViewUnit")
        private String periodCapaCityViewUnit;

        @NameInMap("PeriodCapacityViewValue")
        private String periodCapacityViewValue;

        @NameInMap("PeriodTime")
        private String periodTime;

        @NameInMap("ProdCode")
        private String prodCode;

        @NameInMap("PurchaseTimes")
        private String purchaseTimes;

        @NameInMap("StartTimes")
        private String startTimes;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("TemplateName")
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

            /**
             * AliUid
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * 商品代码
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * 结束时间
             */
            public Builder endTimes(String endTimes) {
                this.endTimes = endTimes;
                return this;
            }

            /**
             * 容量单位
             */
            public Builder initCapaCityViewUnit(String initCapaCityViewUnit) {
                this.initCapaCityViewUnit = initCapaCityViewUnit;
                return this;
            }

            /**
             * 总量
             */
            public Builder initCapacityViewValue(String initCapacityViewValue) {
                this.initCapacityViewValue = initCapacityViewValue;
                return this;
            }

            /**
             * 资源实例ID
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 周期容量单位
             */
            public Builder periodCapaCityViewUnit(String periodCapaCityViewUnit) {
                this.periodCapaCityViewUnit = periodCapaCityViewUnit;
                return this;
            }

            /**
             * 周期容量
             */
            public Builder periodCapacityViewValue(String periodCapacityViewValue) {
                this.periodCapacityViewValue = periodCapacityViewValue;
                return this;
            }

            /**
             * 周期时长
             */
            public Builder periodTime(String periodTime) {
                this.periodTime = periodTime;
                return this;
            }

            /**
             * 产品Code
             */
            public Builder prodCode(String prodCode) {
                this.prodCode = prodCode;
                return this;
            }

            /**
             * 购买时间
             */
            public Builder purchaseTimes(String purchaseTimes) {
                this.purchaseTimes = purchaseTimes;
                return this;
            }

            /**
             * 开始时间
             */
            public Builder startTimes(String startTimes) {
                this.startTimes = startTimes;
                return this;
            }

            /**
             * 状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 存储包类型
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * 资源包类型
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
