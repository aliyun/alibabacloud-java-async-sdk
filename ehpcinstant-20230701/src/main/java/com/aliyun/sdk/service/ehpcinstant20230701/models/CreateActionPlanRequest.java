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
         * ActionPlanName.
         */
        public Builder actionPlanName(String actionPlanName) {
            this.putQueryParameter("ActionPlanName", actionPlanName);
            this.actionPlanName = actionPlanName;
            return this;
        }

        /**
         * AllocationSpec.
         */
        public Builder allocationSpec(String allocationSpec) {
            this.putQueryParameter("AllocationSpec", allocationSpec);
            this.allocationSpec = allocationSpec;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * DesiredCapacity.
         */
        public Builder desiredCapacity(Double desiredCapacity) {
            this.putQueryParameter("DesiredCapacity", desiredCapacity);
            this.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * PrologScript.
         */
        public Builder prologScript(String prologScript) {
            this.putQueryParameter("PrologScript", prologScript);
            this.prologScript = prologScript;
            return this;
        }

        /**
         * Regions.
         */
        public Builder regions(java.util.List<Regions> regions) {
            String regionsShrink = shrink(regions, "Regions", "json");
            this.putQueryParameter("Regions", regionsShrink);
            this.regions = regions;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Resources.
         */
        public Builder resources(java.util.List<Resources> resources) {
            String resourcesShrink = shrink(resources, "Resources", "json");
            this.putQueryParameter("Resources", resourcesShrink);
            this.resources = resources;
            return this;
        }

        /**
         * Script.
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SecurityGroupId.
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
             * VSwitchIds.
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
             * Cores.
             */
            public Builder cores(Double cores) {
                this.cores = cores;
                return this;
            }

            /**
             * Memory.
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
