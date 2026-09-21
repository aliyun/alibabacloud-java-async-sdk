// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeUserResourcePackageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserResourcePackageResponseBody</p>
 */
public class DescribeUserResourcePackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourcePackageInfos")
    private java.util.List<ResourcePackageInfos> resourcePackageInfos;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeUserResourcePackageResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resourcePackageInfos = builder.resourcePackageInfos;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserResourcePackageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return resourcePackageInfos
     */
    public java.util.List<ResourcePackageInfos> getResourcePackageInfos() {
        return this.resourcePackageInfos;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<ResourcePackageInfos> resourcePackageInfos; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeUserResourcePackageResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resourcePackageInfos = model.resourcePackageInfos;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The array of ResourcePackageInfo objects.</p>
         */
        public Builder resourcePackageInfos(java.util.List<ResourcePackageInfos> resourcePackageInfos) {
            this.resourcePackageInfos = resourcePackageInfos;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeUserResourcePackageResponseBody build() {
            return new DescribeUserResourcePackageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserResourcePackageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserResourcePackageResponseBody</p>
     */
    public static class ResourcePackageInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CurrCapacity")
        private String currCapacity;

        @com.aliyun.core.annotation.NameInMap("CurrCapacityBaseUnit")
        private String currCapacityBaseUnit;

        @com.aliyun.core.annotation.NameInMap("CurrCapacityShowUnit")
        private String currCapacityShowUnit;

        @com.aliyun.core.annotation.NameInMap("CurrCapacityShowValue")
        private String currCapacityShowValue;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InitCapacity")
        private String initCapacity;

        @com.aliyun.core.annotation.NameInMap("InitCapacityBaseUnit")
        private String initCapacityBaseUnit;

        @com.aliyun.core.annotation.NameInMap("InitCapacityShowUnit")
        private String initCapacityShowUnit;

        @com.aliyun.core.annotation.NameInMap("InitCapacityShowValue")
        private String initCapacityShowValue;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private ResourcePackageInfos(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.currCapacity = builder.currCapacity;
            this.currCapacityBaseUnit = builder.currCapacityBaseUnit;
            this.currCapacityShowUnit = builder.currCapacityShowUnit;
            this.currCapacityShowValue = builder.currCapacityShowValue;
            this.displayName = builder.displayName;
            this.endTime = builder.endTime;
            this.initCapacity = builder.initCapacity;
            this.initCapacityBaseUnit = builder.initCapacityBaseUnit;
            this.initCapacityShowUnit = builder.initCapacityShowUnit;
            this.initCapacityShowValue = builder.initCapacityShowValue;
            this.instanceId = builder.instanceId;
            this.region = builder.region;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePackageInfos create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return currCapacity
         */
        public String getCurrCapacity() {
            return this.currCapacity;
        }

        /**
         * @return currCapacityBaseUnit
         */
        public String getCurrCapacityBaseUnit() {
            return this.currCapacityBaseUnit;
        }

        /**
         * @return currCapacityShowUnit
         */
        public String getCurrCapacityShowUnit() {
            return this.currCapacityShowUnit;
        }

        /**
         * @return currCapacityShowValue
         */
        public String getCurrCapacityShowValue() {
            return this.currCapacityShowValue;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return initCapacity
         */
        public String getInitCapacity() {
            return this.initCapacity;
        }

        /**
         * @return initCapacityBaseUnit
         */
        public String getInitCapacityBaseUnit() {
            return this.initCapacityBaseUnit;
        }

        /**
         * @return initCapacityShowUnit
         */
        public String getInitCapacityShowUnit() {
            return this.initCapacityShowUnit;
        }

        /**
         * @return initCapacityShowValue
         */
        public String getInitCapacityShowValue() {
            return this.initCapacityShowValue;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String commodityCode; 
            private String currCapacity; 
            private String currCapacityBaseUnit; 
            private String currCapacityShowUnit; 
            private String currCapacityShowValue; 
            private String displayName; 
            private String endTime; 
            private String initCapacity; 
            private String initCapacityBaseUnit; 
            private String initCapacityShowUnit; 
            private String initCapacityShowValue; 
            private String instanceId; 
            private String region; 
            private String startTime; 
            private String status; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(ResourcePackageInfos model) {
                this.commodityCode = model.commodityCode;
                this.currCapacity = model.currCapacity;
                this.currCapacityBaseUnit = model.currCapacityBaseUnit;
                this.currCapacityShowUnit = model.currCapacityShowUnit;
                this.currCapacityShowValue = model.currCapacityShowValue;
                this.displayName = model.displayName;
                this.endTime = model.endTime;
                this.initCapacity = model.initCapacity;
                this.initCapacityBaseUnit = model.initCapacityBaseUnit;
                this.initCapacityShowUnit = model.initCapacityShowUnit;
                this.initCapacityShowValue = model.initCapacityShowValue;
                this.instanceId = model.instanceId;
                this.region = model.region;
                this.startTime = model.startTime;
                this.status = model.status;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The commodity code of the resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>dcdnpaybag</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The current remaining capacity of the instance.</p>
             * <ul>
             * <li><p>Unit for traffic plans: Byte.</p>
             * </li>
             * <li><p>Unit for request plans: count.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>53661095687</p>
             */
            public Builder currCapacity(String currCapacity) {
                this.currCapacity = currCapacity;
                return this;
            }

            /**
             * <p>The base unit of the current remaining capacity of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Byte</p>
             */
            public Builder currCapacityBaseUnit(String currCapacityBaseUnit) {
                this.currCapacityBaseUnit = currCapacityBaseUnit;
                return this;
            }

            /**
             * <p>The display unit of the current remaining capacity of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder currCapacityShowUnit(String currCapacityShowUnit) {
                this.currCapacityShowUnit = currCapacityShowUnit;
                return this;
            }

            /**
             * <p>The display value of the current remaining capacity of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>49.975789</p>
             */
            public Builder currCapacityShowValue(String currCapacityShowValue) {
                this.currCapacityShowValue = currCapacityShowValue;
                return this;
            }

            /**
             * <p>The name of the resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>Data Transfer Plan in Asia Pacific 1</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The expiration time in UTC. Format: YYYY-MM-DDTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-02T15:59:59Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The total capacity of the resource plan.</p>
             * <ul>
             * <li><p>Unit for traffic plans: Byte.</p>
             * </li>
             * <li><p>Unit for request plans: count.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>107374182400</p>
             */
            public Builder initCapacity(String initCapacity) {
                this.initCapacity = initCapacity;
                return this;
            }

            /**
             * <p>The base unit of the total capacity of the resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>Byte</p>
             */
            public Builder initCapacityBaseUnit(String initCapacityBaseUnit) {
                this.initCapacityBaseUnit = initCapacityBaseUnit;
                return this;
            }

            /**
             * <p>The display unit of the total capacity of the resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder initCapacityShowUnit(String initCapacityShowUnit) {
                this.initCapacityShowUnit = initCapacityShowUnit;
                return this;
            }

            /**
             * <p>The display value of the total capacity of the resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>100.000000</p>
             */
            public Builder initCapacityShowValue(String initCapacityShowValue) {
                this.initCapacityShowValue = initCapacityShowValue;
                return this;
            }

            /**
             * <p>The instance ID of the resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>_ResourcePack-cn-</strong></strong></p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The effective period in UTC. Format: YYYY-MM-DDTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-20T16:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>valid</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>FPT_dcdnpaybag_deadlineAcc_****</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public ResourcePackageInfos build() {
                return new ResourcePackageInfos(this);
            } 

        } 

    }
}
