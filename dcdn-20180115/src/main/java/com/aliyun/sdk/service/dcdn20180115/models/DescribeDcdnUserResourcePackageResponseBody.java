// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The detailed information about resource plans. The returned information is displayed in the format that is specified by the ResourcePackageInfo parameter.
         */
        public Builder resourcePackageInfos(ResourcePackageInfos resourcePackageInfos) {
            this.resourcePackageInfos = resourcePackageInfos;
            return this;
        }

        public DescribeDcdnUserResourcePackageResponseBody build() {
            return new DescribeDcdnUserResourcePackageResponseBody(this);
        } 

    } 

    public static class ResourcePackageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CurrCapacity")
        private String currCapacity;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InitCapacity")
        private String initCapacity;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private ResourcePackageInfo(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.currCapacity = builder.currCapacity;
            this.displayName = builder.displayName;
            this.endTime = builder.endTime;
            this.initCapacity = builder.initCapacity;
            this.instanceId = builder.instanceId;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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
            private String displayName; 
            private String endTime; 
            private String initCapacity; 
            private String instanceId; 
            private String startTime; 
            private String status; 
            private String templateName; 

            /**
             * The commodity code of the resource plan.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The remaining quota of the resource plan.
             * <p>
             * 
             * *   The unit for traffic: bytes.
             * *   The unit for requests: count.
             */
            public Builder currCapacity(String currCapacity) {
                this.currCapacity = currCapacity;
                return this;
            }

            /**
             * The name of the resource plan.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The expiration time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The total quota of the resource plan.
             * <p>
             * 
             * *   The unit for traffic: bytes.
             * *   The unit for requests: count.
             */
            public Builder initCapacity(String initCapacity) {
                this.initCapacity = initCapacity;
                return this;
            }

            /**
             * The ID of the resource plan.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The validation time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the resource plan. Valid values:
             * <p>
             * 
             * *   **valid**: valid
             * *   **closed**: expired
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the template.
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
    public static class ResourcePackageInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourcePackageInfo")
        private java.util.List < ResourcePackageInfo> resourcePackageInfo;

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
        public java.util.List < ResourcePackageInfo> getResourcePackageInfo() {
            return this.resourcePackageInfo;
        }

        public static final class Builder {
            private java.util.List < ResourcePackageInfo> resourcePackageInfo; 

            /**
             * ResourcePackageInfo.
             */
            public Builder resourcePackageInfo(java.util.List < ResourcePackageInfo> resourcePackageInfo) {
                this.resourcePackageInfo = resourcePackageInfo;
                return this;
            }

            public ResourcePackageInfos build() {
                return new ResourcePackageInfos(this);
            } 

        } 

    }
}
