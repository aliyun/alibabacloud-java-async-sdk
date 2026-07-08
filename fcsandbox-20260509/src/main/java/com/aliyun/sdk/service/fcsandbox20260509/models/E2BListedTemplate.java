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
 * {@link E2BListedTemplate} extends {@link TeaModel}
 *
 * <p>E2BListedTemplate</p>
 */
public class E2BListedTemplate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aliases")
    private java.util.List<String> aliases;

    @com.aliyun.core.annotation.NameInMap("buildStatus")
    private String buildStatus;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("cpuCount")
    private Integer cpuCount;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("lastSpawnedAt")
    private String lastSpawnedAt;

    @com.aliyun.core.annotation.NameInMap("logConfiguration")
    private LogConfiguration logConfiguration;

    @com.aliyun.core.annotation.NameInMap("memoryMB")
    private Integer memoryMB;

    @com.aliyun.core.annotation.NameInMap("names")
    private java.util.List<String> names;

    @com.aliyun.core.annotation.NameInMap("public")
    private Boolean _public;

    @com.aliyun.core.annotation.NameInMap("resourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("spawnCount")
    private Integer spawnCount;

    @com.aliyun.core.annotation.NameInMap("statusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<E2BTemplateTag> tags;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("teamName")
    private String teamName;

    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("userID")
    private String userID;

    private E2BListedTemplate(Builder builder) {
        this.aliases = builder.aliases;
        this.buildStatus = builder.buildStatus;
        this.category = builder.category;
        this.cpuCount = builder.cpuCount;
        this.createdAt = builder.createdAt;
        this.functionName = builder.functionName;
        this.lastSpawnedAt = builder.lastSpawnedAt;
        this.logConfiguration = builder.logConfiguration;
        this.memoryMB = builder.memoryMB;
        this.names = builder.names;
        this._public = builder._public;
        this.resourceGroupID = builder.resourceGroupID;
        this.spawnCount = builder.spawnCount;
        this.statusReason = builder.statusReason;
        this.tags = builder.tags;
        this.teamID = builder.teamID;
        this.teamName = builder.teamName;
        this.templateID = builder.templateID;
        this.updatedAt = builder.updatedAt;
        this.userID = builder.userID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static E2BListedTemplate create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliases
     */
    public java.util.List<String> getAliases() {
        return this.aliases;
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
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return lastSpawnedAt
     */
    public String getLastSpawnedAt() {
        return this.lastSpawnedAt;
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
     * @return spawnCount
     */
    public Integer getSpawnCount() {
        return this.spawnCount;
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
        private java.util.List<String> aliases; 
        private String buildStatus; 
        private String category; 
        private Integer cpuCount; 
        private String createdAt; 
        private String functionName; 
        private String lastSpawnedAt; 
        private LogConfiguration logConfiguration; 
        private Integer memoryMB; 
        private java.util.List<String> names; 
        private Boolean _public; 
        private String resourceGroupID; 
        private Integer spawnCount; 
        private String statusReason; 
        private java.util.List<E2BTemplateTag> tags; 
        private String teamID; 
        private String teamName; 
        private String templateID; 
        private String updatedAt; 
        private String userID; 

        private Builder() {
        } 

        private Builder(E2BListedTemplate model) {
            this.aliases = model.aliases;
            this.buildStatus = model.buildStatus;
            this.category = model.category;
            this.cpuCount = model.cpuCount;
            this.createdAt = model.createdAt;
            this.functionName = model.functionName;
            this.lastSpawnedAt = model.lastSpawnedAt;
            this.logConfiguration = model.logConfiguration;
            this.memoryMB = model.memoryMB;
            this.names = model.names;
            this._public = model._public;
            this.resourceGroupID = model.resourceGroupID;
            this.spawnCount = model.spawnCount;
            this.statusReason = model.statusReason;
            this.tags = model.tags;
            this.teamID = model.teamID;
            this.teamName = model.teamName;
            this.templateID = model.templateID;
            this.updatedAt = model.updatedAt;
            this.userID = model.userID;
        } 

        /**
         * aliases.
         */
        public Builder aliases(java.util.List<String> aliases) {
            this.aliases = aliases;
            return this;
        }

        /**
         * buildStatus.
         */
        public Builder buildStatus(String buildStatus) {
            this.buildStatus = buildStatus;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * cpuCount.
         */
        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * lastSpawnedAt.
         */
        public Builder lastSpawnedAt(String lastSpawnedAt) {
            this.lastSpawnedAt = lastSpawnedAt;
            return this;
        }

        /**
         * logConfiguration.
         */
        public Builder logConfiguration(LogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        /**
         * memoryMB.
         */
        public Builder memoryMB(Integer memoryMB) {
            this.memoryMB = memoryMB;
            return this;
        }

        /**
         * names.
         */
        public Builder names(java.util.List<String> names) {
            this.names = names;
            return this;
        }

        /**
         * public.
         */
        public Builder _public(Boolean _public) {
            this._public = _public;
            return this;
        }

        /**
         * resourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * spawnCount.
         */
        public Builder spawnCount(Integer spawnCount) {
            this.spawnCount = spawnCount;
            return this;
        }

        /**
         * statusReason.
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List<E2BTemplateTag> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * teamID.
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * teamName.
         */
        public Builder teamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        /**
         * templateID.
         */
        public Builder templateID(String templateID) {
            this.templateID = templateID;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * userID.
         */
        public Builder userID(String userID) {
            this.userID = userID;
            return this;
        }

        public E2BListedTemplate build() {
            return new E2BListedTemplate(this);
        } 

    } 

}
