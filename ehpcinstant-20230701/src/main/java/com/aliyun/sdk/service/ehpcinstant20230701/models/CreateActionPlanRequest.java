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
 * {@link CreateActionPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateActionPlanRequest</p>
 */
public class CreateActionPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionPlanName")
    private String actionPlanName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationSpec")
    private String allocationSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesiredCapacity")
    private Double desiredCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrologScript")
    private String prologScript;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List<Regions> regions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Script")
    private String script;

    private CreateActionPlanRequest(Builder builder) {
        super(builder);
        this.actionPlanName = builder.actionPlanName;
        this.allocationSpec = builder.allocationSpec;
        this.appId = builder.appId;
        this.desiredCapacity = builder.desiredCapacity;
        this.level = builder.level;
        this.prologScript = builder.prologScript;
        this.regions = builder.regions;
        this.resourceType = builder.resourceType;
        this.resources = builder.resources;
        this.script = builder.script;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateActionPlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return desiredCapacity
     */
    public Double getDesiredCapacity() {
        return this.desiredCapacity;
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
     * @return script
     */
    public String getScript() {
        return this.script;
    }

    public static final class Builder extends Request.Builder<CreateActionPlanRequest, Builder> {
        private String actionPlanName; 
        private String allocationSpec; 
        private String appId; 
        private Double desiredCapacity; 
        private String level; 
        private String prologScript; 
        private java.util.List<Regions> regions; 
        private String resourceType; 
        private java.util.List<Resources> resources; 
        private String script; 

        private Builder() {
            super();
        } 

        private Builder(CreateActionPlanRequest request) {
            super(request);
            this.actionPlanName = request.actionPlanName;
            this.allocationSpec = request.allocationSpec;
            this.appId = request.appId;
            this.desiredCapacity = request.desiredCapacity;
            this.level = request.level;
            this.prologScript = request.prologScript;
            this.regions = request.regions;
            this.resourceType = request.resourceType;
            this.resources = request.resources;
            this.script = request.script;
        } 

        /**
         * <p>The name of the execution plan.</p>
         * 
         * <strong>example:</strong>
         * <p>TestActionPlan</p>
         */
        public Builder actionPlanName(String actionPlanName) {
            this.putQueryParameter("ActionPlanName", actionPlanName);
            this.actionPlanName = actionPlanName;
            return this;
        }

        /**
         * <p>The type of the resource.</p>
         * <ul>
         * <li>Standard</li>
         * <li>Dedicated: You must enable a whitelist for use.</li>
         * <li>Economic: You must enable a whitelist for use.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder allocationSpec(String allocationSpec) {
            this.putQueryParameter("AllocationSpec", allocationSpec);
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
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The expected scale of resources for the execution plan. If the ResourceType parameter is set to VcpuCapacity, the execution plan is expected to have 10000 vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder desiredCapacity(Double desiredCapacity) {
            this.putQueryParameter("DesiredCapacity", desiredCapacity);
            this.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * <p>The computing power level. This value is valid only when the resource type is Economic. The following disk categories are supported:</p>
         * <ul>
         * <li>General</li>
         * <li>Performance</li>
         * </ul>
         * <p>Default value: General</p>
         * 
         * <strong>example:</strong>
         * <p>General</p>
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
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
            this.putQueryParameter("PrologScript", prologScript);
            this.prologScript = prologScript;
            return this;
        }

        /**
         * <p>The list of resource configurations in the region where the execution plan runs.</p>
         */
        public Builder regions(java.util.List<Regions> regions) {
            String regionsShrink = shrink(regions, "Regions", "json");
            this.putQueryParameter("Regions", regionsShrink);
            this.regions = regions;
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
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The list of resource configurations of the execution plan runtime environment. You can configure 1 to 10 resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            String resourcesShrink = shrink(resources, "Resources", "json");
            this.putQueryParameter("Resources", resourcesShrink);
            this.resources = resources;
            return this;
        }

        /**
         * <p>The running-job script. Base64 encoding is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bHMgLWFsCmxzIC1hbGggfCB3YyAtbA==</p>
         */
        public Builder script(String script) {
            this.putQueryParameter("Script", script);
            this.script = script;
            return this;
        }

        @Override
        public CreateActionPlanRequest build() {
            return new CreateActionPlanRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateActionPlanRequest} extends {@link TeaModel}
     *
     * <p>CreateActionPlanRequest</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private java.util.List<String> securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List<String> securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        private Regions(Builder builder) {
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
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
         * @return securityGroupId
         */
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
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
            private java.util.List<String> securityGroupId; 
            private java.util.List<String> securityGroupIds; 
            private java.util.List<String> vSwitchIds; 

            private Builder() {
            } 

            private Builder(Regions model) {
                this.regionId = model.regionId;
                this.securityGroupId = model.securityGroupId;
                this.securityGroupIds = model.securityGroupIds;
                this.vSwitchIds = model.vSwitchIds;
            } 

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The list of security groups available for the execution plan in the region. You can have 0 to 5 security groups.</p>
             */
            public Builder securityGroupId(java.util.List<String> securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SecurityGroupIds.
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The list of VSwitches available for the execution plan in the region. Supports 0 to 5 VSwitches.</p>
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
     * {@link CreateActionPlanRequest} extends {@link TeaModel}
     *
     * <p>CreateActionPlanRequest</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cores")
        private Double cores;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Double memory;

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
        public Double getCores() {
            return this.cores;
        }

        /**
         * @return memory
         */
        public Double getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Double cores; 
            private Double memory; 

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
             * <p>2</p>
             */
            public Builder cores(Double cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The memory size of the running environment. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder memory(Double memory) {
                this.memory = memory;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
