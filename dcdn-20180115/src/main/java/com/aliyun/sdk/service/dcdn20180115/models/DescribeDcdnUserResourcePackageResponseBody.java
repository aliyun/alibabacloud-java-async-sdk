// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link DescribeDcdnUserResourcePackageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnUserResourcePackageResponseBody</p>
 */
public class DescribeDcdnUserResourcePackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourcePackageInfos")
    private ResourcePackageInfos resourcePackageInfos;

    private DescribeDcdnUserResourcePackageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourcePackageInfos = builder.resourcePackageInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserResourcePackageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public ResourcePackageInfos getResourcePackageInfos() {
        return this.resourcePackageInfos;
    }

    public static final class Builder {
        private String requestId; 
        private ResourcePackageInfos resourcePackageInfos; 

        private Builder() {
        } 

        private Builder(DescribeDcdnUserResourcePackageResponseBody model) {
            this.requestId = model.requestId;
            this.resourcePackageInfos = model.resourcePackageInfos;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>96ED3127-EC7A-57C5-AFA6-A689B24B2530</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The detailed information about resource plans. The returned information is displayed in the format that is specified by the ResourcePackageInfo parameter.</p>
         */
        public Builder resourcePackageInfos(ResourcePackageInfos resourcePackageInfos) {
            this.resourcePackageInfos = resourcePackageInfos;
            return this;
        }

        public DescribeDcdnUserResourcePackageResponseBody build() {
            return new DescribeDcdnUserResourcePackageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnUserResourcePackageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserResourcePackageResponseBody</p>
     */
    public static class ResourcePackageInfo extends TeaModel {
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

        private ResourcePackageInfo(Builder builder) {
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

        public static ResourcePackageInfo create() {
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

            private Builder(ResourcePackageInfo model) {
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
             * <p>The remaining quota of the resource plan.</p>
             * <ul>
             * <li>The unit for traffic: bytes.</li>
             * <li>The unit for requests: count.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10000000</p>
             */
            public Builder currCapacity(String currCapacity) {
                this.currCapacity = currCapacity;
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
             * CurrCapacityShowUnit.
             */
            public Builder currCapacityShowUnit(String currCapacityShowUnit) {
                this.currCapacityShowUnit = currCapacityShowUnit;
                return this;
            }

            /**
             * CurrCapacityShowValue.
             */
            public Builder currCapacityShowValue(String currCapacityShowValue) {
                this.currCapacityShowValue = currCapacityShowValue;
                return this;
            }

            /**
             * <p>The name of the resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTPS requests for static content</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The expiration time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-24T16:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The total quota of the resource plan.</p>
             * <ul>
             * <li>The unit for traffic: bytes.</li>
             * <li>The unit for requests: count.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10000000</p>
             */
            public Builder initCapacity(String initCapacity) {
                this.initCapacity = initCapacity;
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
             * InitCapacityShowUnit.
             */
            public Builder initCapacityShowUnit(String initCapacityShowUnit) {
                this.initCapacityShowUnit = initCapacityShowUnit;
                return this;
            }

            /**
             * InitCapacityShowValue.
             */
            public Builder initCapacityShowValue(String initCapacityShowValue) {
                this.initCapacityShowValue = initCapacityShowValue;
                return this;
            }

            /**
             * <p>The ID of the resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>CDNFLOWBAG-cn-7pp2bihrb01ii0</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * <p>The validation time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-24T04:09:22Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the resource plan. Valid values:</p>
             * <ul>
             * <li><strong>valid</strong>: valid</li>
             * <li><strong>closed</strong>: expired</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>valid</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>FPT_dcdnpaybag_deadlineAcc_1541151058</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public ResourcePackageInfo build() {
                return new ResourcePackageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDcdnUserResourcePackageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserResourcePackageResponseBody</p>
     */
    public static class ResourcePackageInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourcePackageInfo")
        private java.util.List<ResourcePackageInfo> resourcePackageInfo;

        private ResourcePackageInfos(Builder builder) {
            this.resourcePackageInfo = builder.resourcePackageInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePackageInfos create() {
            return builder().build();
        }

        /**
         * @return resourcePackageInfo
         */
        public java.util.List<ResourcePackageInfo> getResourcePackageInfo() {
            return this.resourcePackageInfo;
        }

        public static final class Builder {
            private java.util.List<ResourcePackageInfo> resourcePackageInfo; 

            private Builder() {
            } 

            private Builder(ResourcePackageInfos model) {
                this.resourcePackageInfo = model.resourcePackageInfo;
            } 

            /**
             * ResourcePackageInfo.
             */
            public Builder resourcePackageInfo(java.util.List<ResourcePackageInfo> resourcePackageInfo) {
                this.resourcePackageInfo = resourcePackageInfo;
                return this;
            }

            public ResourcePackageInfos build() {
                return new ResourcePackageInfos(this);
            } 

        } 

    }
}
