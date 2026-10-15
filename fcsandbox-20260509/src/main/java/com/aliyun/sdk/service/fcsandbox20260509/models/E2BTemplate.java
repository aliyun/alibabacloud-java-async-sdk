// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link E2BTemplate} extends {@link TeaModel}
 *
 * <p>E2BTemplate</p>
 */
public class E2BTemplate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("buildStatus")
    private String buildStatus;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("containerConfiguration")
    private ContainerConfiguration containerConfiguration;

    @com.aliyun.core.annotation.NameInMap("cpuCount")
    private Integer cpuCount;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("logConfiguration")
    private LogConfiguration logConfiguration;

    @com.aliyun.core.annotation.NameInMap("memoryMB")
    private Integer memoryMB;

    @com.aliyun.core.annotation.NameInMap("names")
    private java.util.List<String> names;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("public")
    private Boolean _public;

    @com.aliyun.core.annotation.NameInMap("resourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("statusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<E2BTemplateTag> tags;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("teamName")
    private String teamName;

    @com.aliyun.core.annotation.NameInMap("teamPlan")
    private String teamPlan;

    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("userID")
    private String userID;

    private E2BTemplate(Builder builder) {
        this.buildStatus = builder.buildStatus;
        this.category = builder.category;
        this.containerConfiguration = builder.containerConfiguration;
        this.cpuCount = builder.cpuCount;
        this.createdAt = builder.createdAt;
        this.logConfiguration = builder.logConfiguration;
        this.memoryMB = builder.memoryMB;
        this.names = builder.names;
        this.networkConfiguration = builder.networkConfiguration;
        this._public = builder._public;
        this.resourceGroupID = builder.resourceGroupID;
        this.statusReason = builder.statusReason;
        this.tags = builder.tags;
        this.teamID = builder.teamID;
        this.teamName = builder.teamName;
        this.teamPlan = builder.teamPlan;
        this.templateID = builder.templateID;
        this.updatedAt = builder.updatedAt;
        this.userID = builder.userID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static E2BTemplate create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildStatus
     */
    public String getBuildStatus() {
        return this.buildStatus;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return containerConfiguration
     */
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    /**
     * @return cpuCount
     */
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return logConfiguration
     */
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    /**
     * @return memoryMB
     */
    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    /**
     * @return names
     */
    public java.util.List<String> getNames() {
        return this.names;
    }

    /**
     * @return networkConfiguration
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * @return _public
     */
    public Boolean get_public() {
        return this._public;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return statusReason
     */
    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * @return tags
     */
    public java.util.List<E2BTemplateTag> getTags() {
        return this.tags;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return teamName
     */
    public String getTeamName() {
        return this.teamName;
    }

    /**
     * @return teamPlan
     */
    public String getTeamPlan() {
        return this.teamPlan;
    }

    /**
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return userID
     */
    public String getUserID() {
        return this.userID;
    }

    public static final class Builder {
        private String buildStatus; 
        private String category; 
        private ContainerConfiguration containerConfiguration; 
        private Integer cpuCount; 
        private String createdAt; 
        private LogConfiguration logConfiguration; 
        private Integer memoryMB; 
        private java.util.List<String> names; 
        private NetworkConfiguration networkConfiguration; 
        private Boolean _public; 
        private String resourceGroupID; 
        private String statusReason; 
        private java.util.List<E2BTemplateTag> tags; 
        private String teamID; 
        private String teamName; 
        private String teamPlan; 
        private String templateID; 
        private String updatedAt; 
        private String userID; 

        private Builder() {
        } 

        private Builder(E2BTemplate model) {
            this.buildStatus = model.buildStatus;
            this.category = model.category;
            this.containerConfiguration = model.containerConfiguration;
            this.cpuCount = model.cpuCount;
            this.createdAt = model.createdAt;
            this.logConfiguration = model.logConfiguration;
            this.memoryMB = model.memoryMB;
            this.names = model.names;
            this.networkConfiguration = model.networkConfiguration;
            this._public = model._public;
            this.resourceGroupID = model.resourceGroupID;
            this.statusReason = model.statusReason;
            this.tags = model.tags;
            this.teamID = model.teamID;
            this.teamName = model.teamName;
            this.teamPlan = model.teamPlan;
            this.templateID = model.templateID;
            this.updatedAt = model.updatedAt;
            this.userID = model.userID;
        } 

        /**
         * <p>The build status of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>ready</p>
         */
        public Builder buildStatus(String buildStatus) {
            this.buildStatus = buildStatus;
            return this;
        }

        /**
         * <p>The category of the template.</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The container image configuration of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;image&quot;:&quot;registry.cn-hangzhou.aliyuncs.com/demo/nginx:latest&quot;}</p>
         */
        public Builder containerConfiguration(ContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }

        /**
         * <p>The number of CPU cores configured for the template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The log service configuration of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;project&quot;:&quot;sandbox-project&quot;,&quot;logstore&quot;:&quot;sandbox-logstore&quot;}</p>
         */
        public Builder logConfiguration(LogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        /**
         * <p>The memory size configured for the template, in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder memoryMB(Integer memoryMB) {
            this.memoryMB = memoryMB;
            return this;
        }

        /**
         * <p>The list of template names.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;my-template&quot;]</p>
         */
        public Builder names(java.util.List<String> names) {
            this.names = names;
            return this;
        }

        /**
         * <p>The VPC configuration of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;vpcID&quot;:&quot;vpc-bp1example&quot;,&quot;securityGroupID&quot;:&quot;sg-bp1example&quot;,&quot;vswitchIDs&quot;:[&quot;vsw-bp1example&quot;]}</p>
         */
        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * <p>Indicates whether the template is publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder _public(Boolean _public) {
            this._public = _public;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the template belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmwxqyrgwabcd</p>
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * <p>The reason for the build status of the template.</p>
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * <p>The list of tags for the template.</p>
         */
        public Builder tags(java.util.List<E2BTemplateTag> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The unique identifier of the team to which the template belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>88a4c762-b0ce-4661-9413-578b2309e60f</p>
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The name of the team to which the template belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>my-team</p>
         */
        public Builder teamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        /**
         * <p>The plan of the team to which the template belongs.</p>
         */
        public Builder teamPlan(String teamPlan) {
            this.teamPlan = teamPlan;
            return this;
        }

        /**
         * <p>The unique identifier of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>your-template-id</p>
         */
        public Builder templateID(String templateID) {
            this.templateID = templateID;
            return this;
        }

        /**
         * <p>The time when the template was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The ID of the user who created the template.</p>
         */
        public Builder userID(String userID) {
            this.userID = userID;
            return this;
        }

        public E2BTemplate build() {
            return new E2BTemplate(this);
        } 

    } 

}
