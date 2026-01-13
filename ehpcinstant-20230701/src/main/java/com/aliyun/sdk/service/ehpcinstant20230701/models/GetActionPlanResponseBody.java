// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link GetActionPlanResponseBody} extends {@link TeaModel}
 *
 * <p>GetActionPlanResponseBody</p>
 */
public class GetActionPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActionPlanId")
    private String actionPlanId;

    @com.aliyun.core.annotation.NameInMap("ActionPlanName")
    private String actionPlanName;

    @com.aliyun.core.annotation.NameInMap("AllocationSpec")
    private String allocationSpec;

    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DesiredCapacity")
    private Float desiredCapacity;

    @com.aliyun.core.annotation.NameInMap("IntervalMinutes")
    private Integer intervalMinutes;

    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.NameInMap("PrologScript")
    private String prologScript;

    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List<Regions> regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TotalCapacity")
    private Float totalCapacity;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetActionPlanResponseBody(Builder builder) {
        this.actionPlanId = builder.actionPlanId;
        this.actionPlanName = builder.actionPlanName;
        this.allocationSpec = builder.allocationSpec;
        this.appId = builder.appId;
        this.createTime = builder.createTime;
        this.desiredCapacity = builder.desiredCapacity;
        this.intervalMinutes = builder.intervalMinutes;
        this.level = builder.level;
        this.prologScript = builder.prologScript;
        this.regions = builder.regions;
        this.requestId = builder.requestId;
        this.resourceType = builder.resourceType;
        this.resources = builder.resources;
        this.status = builder.status;
        this.totalCapacity = builder.totalCapacity;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetActionPlanResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionPlanId
     */
    public String getActionPlanId() {
        return this.actionPlanId;
    }

    /**
     * @return actionPlanName
     */
    public String getActionPlanName() {
        return this.actionPlanName;
    }

    /**
     * @return allocationSpec
     */
    public String getAllocationSpec() {
        return this.allocationSpec;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return desiredCapacity
     */
    public Float getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * @return intervalMinutes
     */
    public Integer getIntervalMinutes() {
        return this.intervalMinutes;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return prologScript
     */
    public String getPrologScript() {
        return this.prologScript;
    }

    /**
     * @return regions
     */
    public java.util.List<Regions> getRegions() {
        return this.regions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalCapacity
     */
    public Float getTotalCapacity() {
        return this.totalCapacity;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String actionPlanId; 
        private String actionPlanName; 
        private String allocationSpec; 
        private String appId; 
        private String createTime; 
        private Float desiredCapacity; 
        private Integer intervalMinutes; 
        private String level; 
        private String prologScript; 
        private java.util.List<Regions> regions; 
        private String requestId; 
        private String resourceType; 
        private java.util.List<Resources> resources; 
        private String status; 
        private Float totalCapacity; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetActionPlanResponseBody model) {
            this.actionPlanId = model.actionPlanId;
            this.actionPlanName = model.actionPlanName;
            this.allocationSpec = model.allocationSpec;
            this.appId = model.appId;
            this.createTime = model.createTime;
            this.desiredCapacity = model.desiredCapacity;
            this.intervalMinutes = model.intervalMinutes;
            this.level = model.level;
            this.prologScript = model.prologScript;
            this.regions = model.regions;
            this.requestId = model.requestId;
            this.resourceType = model.resourceType;
            this.resources = model.resources;
            this.status = model.status;
            this.totalCapacity = model.totalCapacity;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The ID of the execution plan.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-hz036ubmx2qmw93k****</p>
         */
        public Builder actionPlanId(String actionPlanId) {
            this.actionPlanId = actionPlanId;
            return this;
        }

        /**
         * <p>The name of the execution plan.</p>
         * 
         * <strong>example:</strong>
         * <p>TestActionPlan</p>
         */
        public Builder actionPlanName(String actionPlanName) {
            this.actionPlanName = actionPlanName;
            return this;
        }

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder allocationSpec(String allocationSpec) {
            this.allocationSpec = allocationSpec;
            return this;
        }

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>ci-vm-rYfypJKwlN9Y</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The time when the execution plan was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-10 18:28:05</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The expected scale of resources for the execution plan. If the ResourceType parameter is set to VcpuCapacity, the execution plan is expected to have 10000 vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder desiredCapacity(Float desiredCapacity) {
            this.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * IntervalMinutes.
         */
        public Builder intervalMinutes(Integer intervalMinutes) {
            this.intervalMinutes = intervalMinutes;
            return this;
        }

        /**
         * <p>The computing power level.</p>
         * 
         * <strong>example:</strong>
         * <p>General</p>
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }

        /**
         * <p>The pre-processing script. Base64 encoding is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bHMgLWFsCmxzIC1hbGggfCB3YyAtbA==</p>
         */
        public Builder prologScript(String prologScript) {
            this.prologScript = prologScript;
            return this;
        }

        /**
         * <p>The list of resource configurations in the region where the execution plan runs.</p>
         */
        public Builder regions(java.util.List<Regions> regions) {
            this.regions = regions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Target resource type: the capacity of vCPUs or the number of execution nodes. Valid values:</p>
         * <ul>
         * <li>VCpuCapacity</li>
         * <li>ExecutorCapacity</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VCpuCapacity</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The list of resource configurations of the execution plan runtime environment.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>The status of the execution plan. The possible values are as follows:</p>
         * <ul>
         * <li>Active Instant tasks are dynamically managed only when the execution plan is in the Active state.</li>
         * <li>Inactive Instant tasks are no longer managed by execution plans in the Inactive state.</li>
         * <li>Deleting You cannot modify the parameters of an execution plan in this state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The size of the resources currently managed by the execution plan.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalCapacity(Float totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }

        /**
         * <p>The time when the execution plan was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-10 18:28:05</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetActionPlanResponseBody build() {
            return new GetActionPlanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetActionPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetActionPlanResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List<String> securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        private Regions(Builder builder) {
            this.regionId = builder.regionId;
            this.securityGroupIds = builder.securityGroupIds;
            this.vSwitchIds = builder.vSwitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityGroupIds
         */
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public static final class Builder {
            private String regionId; 
            private java.util.List<String> securityGroupIds; 
            private java.util.List<String> vSwitchIds; 

            private Builder() {
            } 

            private Builder(Regions model) {
                this.regionId = model.regionId;
                this.securityGroupIds = model.securityGroupIds;
                this.vSwitchIds = model.vSwitchIds;
            } 

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The list of security groups available for the execution plan in the region.</p>
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The list of VSwitches available for the execution plan in the region.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetActionPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetActionPlanResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cores")
        private Float cores;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        private Resources(Builder builder) {
            this.cores = builder.cores;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return cores
         */
        public Float getCores() {
            return this.cores;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Float cores; 
            private Float memory; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.cores = model.cores;
                this.memory = model.memory;
            } 

            /**
             * <p>The number of CPUs in the running environment.</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder cores(Float cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The memory size of the running environment. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
