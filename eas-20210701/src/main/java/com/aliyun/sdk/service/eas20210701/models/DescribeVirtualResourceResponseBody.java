// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DescribeVirtualResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVirtualResourceResponseBody</p>
 */
public class DescribeVirtualResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DisableSpotProtectionPeriod")
    private Boolean disableSpotProtectionPeriod;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    @com.aliyun.core.annotation.NameInMap("ServiceCount")
    private Integer serviceCount;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("VirtualResourceId")
    private String virtualResourceId;

    @com.aliyun.core.annotation.NameInMap("VirtualResourceName")
    private String virtualResourceName;

    private DescribeVirtualResourceResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.disableSpotProtectionPeriod = builder.disableSpotProtectionPeriod;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.serviceCount = builder.serviceCount;
        this.updateTime = builder.updateTime;
        this.virtualResourceId = builder.virtualResourceId;
        this.virtualResourceName = builder.virtualResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVirtualResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return disableSpotProtectionPeriod
     */
    public Boolean getDisableSpotProtectionPeriod() {
        return this.disableSpotProtectionPeriod;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    /**
     * @return serviceCount
     */
    public Integer getServiceCount() {
        return this.serviceCount;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return virtualResourceId
     */
    public String getVirtualResourceId() {
        return this.virtualResourceId;
    }

    /**
     * @return virtualResourceName
     */
    public String getVirtualResourceName() {
        return this.virtualResourceName;
    }

    public static final class Builder {
        private String createTime; 
        private Boolean disableSpotProtectionPeriod; 
        private String requestId; 
        private java.util.List<Resources> resources; 
        private Integer serviceCount; 
        private String updateTime; 
        private String virtualResourceId; 
        private String virtualResourceName; 

        private Builder() {
        } 

        private Builder(DescribeVirtualResourceResponseBody model) {
            this.createTime = model.createTime;
            this.disableSpotProtectionPeriod = model.disableSpotProtectionPeriod;
            this.requestId = model.requestId;
            this.resources = model.resources;
            this.serviceCount = model.serviceCount;
            this.updateTime = model.updateTime;
            this.virtualResourceId = model.virtualResourceId;
            this.virtualResourceName = model.virtualResourceName;
        } 

        /**
         * <p>The time when the virtual resource group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-16T17:52:49Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Indicates whether the retention period of preemptible instances was disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disableSpotProtectionPeriod(Boolean disableSpotProtectionPeriod) {
            this.disableSpotProtectionPeriod = disableSpotProtectionPeriod;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of resources in the virtual resource group.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>The number of deployed services.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceCount(Integer serviceCount) {
            this.serviceCount = serviceCount;
            return this;
        }

        /**
         * <p>The time when the virtual resource group was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-16T19:52:49Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The ID of the virtual resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-vr-npovr28onap1xxxxxx</p>
         */
        public Builder virtualResourceId(String virtualResourceId) {
            this.virtualResourceId = virtualResourceId;
            return this;
        }

        /**
         * <p>The name of the virtual resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>MyVirtualResource</p>
         */
        public Builder virtualResourceName(String virtualResourceName) {
            this.virtualResourceName = virtualResourceName;
            return this;
        }

        public DescribeVirtualResourceResponseBody build() {
            return new DescribeVirtualResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVirtualResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualResourceResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("QuotaId")
        private String quotaId;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        private Resources(Builder builder) {
            this.instanceType = builder.instanceType;
            this.priority = builder.priority;
            this.quotaId = builder.quotaId;
            this.region = builder.region;
            this.resourceId = builder.resourceId;
            this.spotPriceLimit = builder.spotPriceLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return quotaId
         */
        public String getQuotaId() {
            return this.quotaId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public static final class Builder {
            private String instanceType; 
            private Integer priority; 
            private String quotaId; 
            private String region; 
            private String resourceId; 
            private Float spotPriceLimit; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.instanceType = model.instanceType;
                this.priority = model.priority;
                this.quotaId = model.quotaId;
                this.region = model.region;
                this.resourceId = model.resourceId;
                this.spotPriceLimit = model.spotPriceLimit;
            } 

            /**
             * <p>The instance type of the public resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.s6-c1m2.xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The priority of resource scheduling. A greater number specifies a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The instance type of the public resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>quota185lqxxxxxx</p>
             */
            public Builder quotaId(String quotaId) {
                this.quotaId = quotaId;
                return this;
            }

            /**
             * <p>The region where the resource resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The ID of the dedicated resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>eas-r-g55ieatgg3buxxxxxx</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The maximum price of preemptible instances in a public resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>10.05</p>
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
