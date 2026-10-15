// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
         * <p>The template build status. Valid values:</p>
         * <ul>
         * <li>waiting: Waiting to build.</li>
         * <li>building: Building in progress.</li>
         * <li>ready: Build succeeded.</li>
         * <li>error: Build failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ready</p>
         */
        public Builder buildStatus(String buildStatus) {
            this.buildStatus = buildStatus;
            return this;
        }

        /**
         * <p>The template category. Valid values:</p>
         * <ul>
         * <li>builtin: Built-in system template.</li>
         * <li>custom: User-created custom template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The container image configuration of the template.</p>
         */
        public Builder containerConfiguration(ContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }

        /**
         * <p>The CPU specification of the sandbox instance, in cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * <p>The creation time in UTC, in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-20T08:30:00Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The log delivery configuration of the template.</p>
         */
        public Builder logConfiguration(LogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        /**
         * <p>The memory specification of the sandbox instance, in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder memoryMB(Integer memoryMB) {
            this.memoryMB = memoryMB;
            return this;
        }

        /**
         * <p>The list of template names, including the template name and all its aliases.</p>
         */
        public Builder names(java.util.List<String> names) {
            this.names = names;
            return this;
        }

        /**
         * <p>The network configuration of the template.</p>
         */
        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * <p>Indicates whether the template is public to all teams.</p>
         */
        public Builder _public(Boolean _public) {
            this._public = _public;
            return this;
        }

        /**
         * <p>The Alibaba Cloud resource group ID to which the team belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-****</p>
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * <p>The desensitized description of the reason why the template build failed. This value is empty when the build succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to pull source image: invalid authentication credentials</p>
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * <p>The list of template tags. Each tag points to a specific build.</p>
         */
        public Builder tags(java.util.List<E2BTemplateTag> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The ID of the team to which the resource belongs, in UUID format.</p>
         * 
         * <strong>example:</strong>
         * <p>5f4a2c18-****</p>
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The team name.</p>
         * 
         * <strong>example:</strong>
         * <p>sandbox-dev</p>
         */
        public Builder teamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        /**
         * <p>The team plan specification. Valid values:</p>
         * <ul>
         * <li>eco: economy.</li>
         * <li>std: standard.</li>
         * <li>pro: professional.</li>
         * <li>ent: enterprise.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>std</p>
         */
        public Builder teamPlan(String teamPlan) {
            this.teamPlan = teamPlan;
            return this;
        }

        /**
         * <p>The sandbox template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tm-8f3a2c7b5e14d806</p>
         */
        public Builder templateID(String templateID) {
            this.templateID = templateID;
            return this;
        }

        /**
         * <p>The last update time in UTC, in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-21T09:15:30Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The user ID of the resource creator, in UUID format.</p>
         * 
         * <strong>example:</strong>
         * <p>9c1d4e72-****</p>
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
