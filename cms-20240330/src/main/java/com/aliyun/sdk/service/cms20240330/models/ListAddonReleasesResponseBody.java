// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListAddonReleasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAddonReleasesResponseBody</p>
 */
public class ListAddonReleasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("releases")
    private java.util.List<Releases> releases;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListAddonReleasesResponseBody(Builder builder) {
        this.releases = builder.releases;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAddonReleasesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return releases
     */
    public java.util.List<Releases> getReleases() {
        return this.releases;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<Releases> releases; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListAddonReleasesResponseBody model) {
            this.releases = model.releases;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * releases.
         */
        public Builder releases(java.util.List<Releases> releases) {
            this.releases = releases;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListAddonReleasesResponseBody build() {
            return new ListAddonReleasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAddonReleasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAddonReleasesResponseBody</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("firstTransitionTime")
        private String firstTransitionTime;

        @com.aliyun.core.annotation.NameInMap("lastTransitionTime")
        private String lastTransitionTime;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Conditions(Builder builder) {
            this.firstTransitionTime = builder.firstTransitionTime;
            this.lastTransitionTime = builder.lastTransitionTime;
            this.message = builder.message;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return firstTransitionTime
         */
        public String getFirstTransitionTime() {
            return this.firstTransitionTime;
        }

        /**
         * @return lastTransitionTime
         */
        public String getLastTransitionTime() {
            return this.lastTransitionTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String firstTransitionTime; 
            private String lastTransitionTime; 
            private String message; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.firstTransitionTime = model.firstTransitionTime;
                this.lastTransitionTime = model.lastTransitionTime;
                this.message = model.message;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * firstTransitionTime.
             */
            public Builder firstTransitionTime(String firstTransitionTime) {
                this.firstTransitionTime = firstTransitionTime;
                return this;
            }

            /**
             * lastTransitionTime.
             */
            public Builder lastTransitionTime(String lastTransitionTime) {
                this.lastTransitionTime = lastTransitionTime;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAddonReleasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAddonReleasesResponseBody</p>
     */
    public static class SubAddonRelease extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ready")
        private Integer ready;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private SubAddonRelease(Builder builder) {
            this.ready = builder.ready;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubAddonRelease create() {
            return builder().build();
        }

        /**
         * @return ready
         */
        public Integer getReady() {
            return this.ready;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer ready; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(SubAddonRelease model) {
                this.ready = model.ready;
                this.total = model.total;
            } 

            /**
             * ready.
             */
            public Builder ready(Integer ready) {
                this.ready = ready;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public SubAddonRelease build() {
                return new SubAddonRelease(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAddonReleasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAddonReleasesResponseBody</p>
     */
    public static class Releases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("addonName")
        private String addonName;

        @com.aliyun.core.annotation.NameInMap("alertRuleCount")
        private Long alertRuleCount;

        @com.aliyun.core.annotation.NameInMap("apiVersion")
        private String apiVersion;

        @com.aliyun.core.annotation.NameInMap("conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("dashboardCount")
        private Long dashboardCount;

        @com.aliyun.core.annotation.NameInMap("entityRules")
        private EntityGroupBase entityRules;

        @com.aliyun.core.annotation.NameInMap("envType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("exporterCount")
        private Long exporterCount;

        @com.aliyun.core.annotation.NameInMap("haveConfig")
        private Boolean haveConfig;

        @com.aliyun.core.annotation.NameInMap("installUserId")
        private String installUserId;

        @com.aliyun.core.annotation.NameInMap("language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("managed")
        private Boolean managed;

        @com.aliyun.core.annotation.NameInMap("nextVersion")
        private String nextVersion;

        @com.aliyun.core.annotation.NameInMap("parentAddonReleaseId")
        private String parentAddonReleaseId;

        @com.aliyun.core.annotation.NameInMap("policyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("releaseId")
        private String releaseId;

        @com.aliyun.core.annotation.NameInMap("releaseName")
        private String releaseName;

        @com.aliyun.core.annotation.NameInMap("scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subAddonRelease")
        private SubAddonRelease subAddonRelease;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Releases(Builder builder) {
            this.addonName = builder.addonName;
            this.alertRuleCount = builder.alertRuleCount;
            this.apiVersion = builder.apiVersion;
            this.conditions = builder.conditions;
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.dashboardCount = builder.dashboardCount;
            this.entityRules = builder.entityRules;
            this.envType = builder.envType;
            this.environmentId = builder.environmentId;
            this.exporterCount = builder.exporterCount;
            this.haveConfig = builder.haveConfig;
            this.installUserId = builder.installUserId;
            this.language = builder.language;
            this.managed = builder.managed;
            this.nextVersion = builder.nextVersion;
            this.parentAddonReleaseId = builder.parentAddonReleaseId;
            this.policyId = builder.policyId;
            this.regionId = builder.regionId;
            this.releaseId = builder.releaseId;
            this.releaseName = builder.releaseName;
            this.scene = builder.scene;
            this.status = builder.status;
            this.subAddonRelease = builder.subAddonRelease;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
            this.version = builder.version;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Releases create() {
            return builder().build();
        }

        /**
         * @return addonName
         */
        public String getAddonName() {
            return this.addonName;
        }

        /**
         * @return alertRuleCount
         */
        public Long getAlertRuleCount() {
            return this.alertRuleCount;
        }

        /**
         * @return apiVersion
         */
        public String getApiVersion() {
            return this.apiVersion;
        }

        /**
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dashboardCount
         */
        public Long getDashboardCount() {
            return this.dashboardCount;
        }

        /**
         * @return entityRules
         */
        public EntityGroupBase getEntityRules() {
            return this.entityRules;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return exporterCount
         */
        public Long getExporterCount() {
            return this.exporterCount;
        }

        /**
         * @return haveConfig
         */
        public Boolean getHaveConfig() {
            return this.haveConfig;
        }

        /**
         * @return installUserId
         */
        public String getInstallUserId() {
            return this.installUserId;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return managed
         */
        public Boolean getManaged() {
            return this.managed;
        }

        /**
         * @return nextVersion
         */
        public String getNextVersion() {
            return this.nextVersion;
        }

        /**
         * @return parentAddonReleaseId
         */
        public String getParentAddonReleaseId() {
            return this.parentAddonReleaseId;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return releaseId
         */
        public String getReleaseId() {
            return this.releaseId;
        }

        /**
         * @return releaseName
         */
        public String getReleaseName() {
            return this.releaseName;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subAddonRelease
         */
        public SubAddonRelease getSubAddonRelease() {
            return this.subAddonRelease;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String addonName; 
            private Long alertRuleCount; 
            private String apiVersion; 
            private java.util.List<Conditions> conditions; 
            private String config; 
            private String createTime; 
            private Long dashboardCount; 
            private EntityGroupBase entityRules; 
            private String envType; 
            private String environmentId; 
            private Long exporterCount; 
            private Boolean haveConfig; 
            private String installUserId; 
            private String language; 
            private Boolean managed; 
            private String nextVersion; 
            private String parentAddonReleaseId; 
            private String policyId; 
            private String regionId; 
            private String releaseId; 
            private String releaseName; 
            private String scene; 
            private String status; 
            private SubAddonRelease subAddonRelease; 
            private String updateTime; 
            private String userId; 
            private String version; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Releases model) {
                this.addonName = model.addonName;
                this.alertRuleCount = model.alertRuleCount;
                this.apiVersion = model.apiVersion;
                this.conditions = model.conditions;
                this.config = model.config;
                this.createTime = model.createTime;
                this.dashboardCount = model.dashboardCount;
                this.entityRules = model.entityRules;
                this.envType = model.envType;
                this.environmentId = model.environmentId;
                this.exporterCount = model.exporterCount;
                this.haveConfig = model.haveConfig;
                this.installUserId = model.installUserId;
                this.language = model.language;
                this.managed = model.managed;
                this.nextVersion = model.nextVersion;
                this.parentAddonReleaseId = model.parentAddonReleaseId;
                this.policyId = model.policyId;
                this.regionId = model.regionId;
                this.releaseId = model.releaseId;
                this.releaseName = model.releaseName;
                this.scene = model.scene;
                this.status = model.status;
                this.subAddonRelease = model.subAddonRelease;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
                this.version = model.version;
                this.workspace = model.workspace;
            } 

            /**
             * addonName.
             */
            public Builder addonName(String addonName) {
                this.addonName = addonName;
                return this;
            }

            /**
             * alertRuleCount.
             */
            public Builder alertRuleCount(Long alertRuleCount) {
                this.alertRuleCount = alertRuleCount;
                return this;
            }

            /**
             * apiVersion.
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * conditions.
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * dashboardCount.
             */
            public Builder dashboardCount(Long dashboardCount) {
                this.dashboardCount = dashboardCount;
                return this;
            }

            /**
             * entityRules.
             */
            public Builder entityRules(EntityGroupBase entityRules) {
                this.entityRules = entityRules;
                return this;
            }

            /**
             * envType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * environmentId.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * exporterCount.
             */
            public Builder exporterCount(Long exporterCount) {
                this.exporterCount = exporterCount;
                return this;
            }

            /**
             * haveConfig.
             */
            public Builder haveConfig(Boolean haveConfig) {
                this.haveConfig = haveConfig;
                return this;
            }

            /**
             * installUserId.
             */
            public Builder installUserId(String installUserId) {
                this.installUserId = installUserId;
                return this;
            }

            /**
             * language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * managed.
             */
            public Builder managed(Boolean managed) {
                this.managed = managed;
                return this;
            }

            /**
             * nextVersion.
             */
            public Builder nextVersion(String nextVersion) {
                this.nextVersion = nextVersion;
                return this;
            }

            /**
             * parentAddonReleaseId.
             */
            public Builder parentAddonReleaseId(String parentAddonReleaseId) {
                this.parentAddonReleaseId = parentAddonReleaseId;
                return this;
            }

            /**
             * policyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Release ID。</p>
             * 
             * <strong>example:</strong>
             * <p>7339d808-66f9-4d40-83fa-xxxxxxxxxxx</p>
             */
            public Builder releaseId(String releaseId) {
                this.releaseId = releaseId;
                return this;
            }

            /**
             * releaseName.
             */
            public Builder releaseName(String releaseName) {
                this.releaseName = releaseName;
                return this;
            }

            /**
             * scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * subAddonRelease.
             */
            public Builder subAddonRelease(SubAddonRelease subAddonRelease) {
                this.subAddonRelease = subAddonRelease;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Releases build() {
                return new Releases(this);
            } 

        } 

    }
}
