// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnUserResourcePackageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnUserResourcePackageResponseBody</p>
 */
public class DescribeCdnUserResourcePackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourcePackageInfos")
    private ResourcePackageInfos resourcePackageInfos;

    private DescribeCdnUserResourcePackageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourcePackageInfos = builder.resourcePackageInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnUserResourcePackageResponseBody create() {
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
         * The detailed information about resource plans. The returned information is displayed in an array of ResourcePackageInfo nodes.
         */
        public Builder resourcePackageInfos(ResourcePackageInfos resourcePackageInfos) {
            this.resourcePackageInfos = resourcePackageInfos;
            return this;
        }

        public DescribeCdnUserResourcePackageResponseBody build() {
            return new DescribeCdnUserResourcePackageResponseBody(this);
        } 

    } 

    public static class ResourcePackageInfo extends TeaModel {
        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("CurrCapacity")
        private String currCapacity;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InitCapacity")
        private String initCapacity;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TemplateName")
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
             * The ID of the resource plan.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The remaining quota of the resource plan.
             * <p>
             * 
             * *   For a data transfer plan, the quota is measured in bytes.
             * *   For a request resource plan, the quota is measured in the number of requests.
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
             * The expiration time.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The total quota of the resource plan.
             * <p>
             * 
             * *   For a data transfer plan, the quota is measured in bytes.
             * *   For a request resource plan, the quota is measured in the number of requests.
             */
            public Builder initCapacity(String initCapacity) {
                this.initCapacity = initCapacity;
                return this;
            }

            /**
             * The ID of the instance
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The effective time.
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
        @NameInMap("ResourcePackageInfo")
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
