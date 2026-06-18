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
    @com.aliyun.core.annotation.NameInMap("aliases")
    private java.util.List<String> aliases;

    @com.aliyun.core.annotation.NameInMap("buildStatus")
    private String buildStatus;

    @com.aliyun.core.annotation.NameInMap("builds")
    private E2BTemplateBuild builds;

    @com.aliyun.core.annotation.NameInMap("cpuCount")
    private Integer cpuCount;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

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

    @com.aliyun.core.annotation.NameInMap("spawnCount")
    private String spawnCount;

    @com.aliyun.core.annotation.NameInMap("statusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<E2BTemplateTag> tags;

    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("userID")
    private String userID;

    private E2BTemplate(Builder builder) {
        this.aliases = builder.aliases;
        this.buildStatus = builder.buildStatus;
        this.builds = builder.builds;
        this.cpuCount = builder.cpuCount;
        this.createdAt = builder.createdAt;
        this.lastSpawnedAt = builder.lastSpawnedAt;
        this.logConfiguration = builder.logConfiguration;
        this.memoryMB = builder.memoryMB;
        this.names = builder.names;
        this._public = builder._public;
        this.spawnCount = builder.spawnCount;
        this.statusReason = builder.statusReason;
        this.tags = builder.tags;
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
     * @return builds
     */
    public E2BTemplateBuild getBuilds() {
        return this.builds;
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
     * @return spawnCount
     */
    public String getSpawnCount() {
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
        private E2BTemplateBuild builds; 
        private Integer cpuCount; 
        private String createdAt; 
        private String lastSpawnedAt; 
        private LogConfiguration logConfiguration; 
        private Integer memoryMB; 
        private java.util.List<String> names; 
        private Boolean _public; 
        private String spawnCount; 
        private String statusReason; 
        private java.util.List<E2BTemplateTag> tags; 
        private String templateID; 
        private String updatedAt; 
        private String userID; 

        private Builder() {
        } 

        private Builder(E2BTemplate model) {
            this.aliases = model.aliases;
            this.buildStatus = model.buildStatus;
            this.builds = model.builds;
            this.cpuCount = model.cpuCount;
            this.createdAt = model.createdAt;
            this.lastSpawnedAt = model.lastSpawnedAt;
            this.logConfiguration = model.logConfiguration;
            this.memoryMB = model.memoryMB;
            this.names = model.names;
            this._public = model._public;
            this.spawnCount = model.spawnCount;
            this.statusReason = model.statusReason;
            this.tags = model.tags;
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
         * builds.
         */
        public Builder builds(E2BTemplateBuild builds) {
            this.builds = builds;
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
         * spawnCount.
         */
        public Builder spawnCount(String spawnCount) {
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

        public E2BTemplate build() {
            return new E2BTemplate(this);
        } 

    } 

}
