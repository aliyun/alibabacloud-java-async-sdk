// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodUserResourcePackageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodUserResourcePackageResponseBody</p>
 */
public class DescribeVodUserResourcePackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourcePackageInfos")
    private ResourcePackageInfos resourcePackageInfos;

    private DescribeVodUserResourcePackageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourcePackageInfos = builder.resourcePackageInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodUserResourcePackageResponseBody create() {
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

        private Builder(DescribeVodUserResourcePackageResponseBody model) {
            this.requestId = model.requestId;
            this.resourcePackageInfos = model.resourcePackageInfos;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourcePackageInfos.
         */
        public Builder resourcePackageInfos(ResourcePackageInfos resourcePackageInfos) {
            this.resourcePackageInfos = resourcePackageInfos;
            return this;
        }

        public DescribeVodUserResourcePackageResponseBody build() {
            return new DescribeVodUserResourcePackageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodUserResourcePackageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodUserResourcePackageResponseBody</p>
     */
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

        private ResourcePackageInfo(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.currCapacity = builder.currCapacity;
            this.displayName = builder.displayName;
            this.endTime = builder.endTime;
            this.initCapacity = builder.initCapacity;
            this.instanceId = builder.instanceId;
            this.startTime = builder.startTime;
            this.status = builder.status;
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

        public static final class Builder {
            private String commodityCode; 
            private String currCapacity; 
            private String displayName; 
            private String endTime; 
            private String initCapacity; 
            private String instanceId; 
            private String startTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(ResourcePackageInfo model) {
                this.commodityCode = model.commodityCode;
                this.currCapacity = model.currCapacity;
                this.displayName = model.displayName;
                this.endTime = model.endTime;
                this.initCapacity = model.initCapacity;
                this.instanceId = model.instanceId;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CurrCapacity.
             */
            public Builder currCapacity(String currCapacity) {
                this.currCapacity = currCapacity;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InitCapacity.
             */
            public Builder initCapacity(String initCapacity) {
                this.initCapacity = initCapacity;
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
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResourcePackageInfo build() {
                return new ResourcePackageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodUserResourcePackageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodUserResourcePackageResponseBody</p>
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
