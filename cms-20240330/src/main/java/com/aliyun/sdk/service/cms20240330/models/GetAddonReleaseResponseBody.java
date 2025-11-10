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
 * {@link GetAddonReleaseResponseBody} extends {@link TeaModel}
 *
 * <p>GetAddonReleaseResponseBody</p>
 */
public class GetAddonReleaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("release")
    private Release release;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetAddonReleaseResponseBody(Builder builder) {
        this.config = builder.config;
        this.release = builder.release;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAddonReleaseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return release
     */
    public Release getRelease() {
        return this.release;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String config; 
        private Release release; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAddonReleaseResponseBody model) {
            this.config = model.config;
            this.release = model.release;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Component configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;install&quot;:{&quot;mode&quot;:&quot;auto-install&quot;,&quot;listenPort&quot;:&quot;9400&quot;},&quot;discoverMode&quot;:&quot;instances&quot;,&quot;discover&quot;:{&quot;instances&quot;:&quot;worker-k8s-for-cs-c126d87c76218487e83ab322017f11b44&quot;},&quot;scrapeInterval&quot;:&quot;15&quot;,&quot;enableSecuritecs-nodeyGroupInjection&quot;:&quot;true&quot;,&quot;metricTags&quot;:&quot;&quot;}</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>Detailed information.</p>
         */
        public Builder release(Release release) {
            this.release = release;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAddonReleaseResponseBody build() {
            return new GetAddonReleaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAddonReleaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetAddonReleaseResponseBody</p>
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
             * <p>First transition time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-04T16:10:22+08:00</p>
             */
            public Builder firstTransitionTime(String firstTransitionTime) {
                this.firstTransitionTime = firstTransitionTime;
                return this;
            }

            /**
             * <p>Last transition time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-04T16:10:22+08:00</p>
             */
            public Builder lastTransitionTime(String lastTransitionTime) {
                this.lastTransitionTime = lastTransitionTime;
                return this;
            }

            /**
             * <p>Details.</p>
             * 
             * <strong>example:</strong>
             * <p>The addon loaded successfully</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Phase status.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Phase type.</p>
             * 
             * <strong>example:</strong>
             * <p>Loaded</p>
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
     * {@link GetAddonReleaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetAddonReleaseResponseBody</p>
     */
    public static class Release extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("addonName")
        private String addonName;

        @com.aliyun.core.annotation.NameInMap("alertRuleCount")
        private Long alertRuleCount;

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

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Release(Builder builder) {
            this.addonName = builder.addonName;
            this.alertRuleCount = builder.alertRuleCount;
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
            this.parentAddonReleaseId = builder.parentAddonReleaseId;
            this.policyId = builder.policyId;
            this.regionId = builder.regionId;
            this.releaseId = builder.releaseId;
            this.releaseName = builder.releaseName;
            this.scene = builder.scene;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
            this.version = builder.version;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Release create() {
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
            private String parentAddonReleaseId; 
            private String policyId; 
            private String regionId; 
            private String releaseId; 
            private String releaseName; 
            private String scene; 
            private String status; 
            private String updateTime; 
            private String userId; 
            private String version; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Release model) {
                this.addonName = model.addonName;
                this.alertRuleCount = model.alertRuleCount;
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
                this.parentAddonReleaseId = model.parentAddonReleaseId;
                this.policyId = model.policyId;
                this.regionId = model.regionId;
                this.releaseId = model.releaseId;
                this.releaseName = model.releaseName;
                this.scene = model.scene;
                this.status = model.status;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
                this.version = model.version;
                this.workspace = model.workspace;
            } 

            /**
             * <p>Addon component name.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-gpu</p>
             */
            public Builder addonName(String addonName) {
                this.addonName = addonName;
                return this;
            }

            /**
             * <p>Number of alert rules.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder alertRuleCount(Long alertRuleCount) {
                this.alertRuleCount = alertRuleCount;
                return this;
            }

            /**
             * <p>Installation phase information.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>Component configuration information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;install&quot;:{&quot;mode&quot;:&quot;auto-install&quot;,&quot;listenPort&quot;:&quot;9400&quot;},&quot;discoverMode&quot;:&quot;instances&quot;,&quot;discover&quot;:{&quot;instances&quot;:&quot;worker-k8s-for-cs-c126d87c76218487e83ab322017f11b44&quot;},&quot;scrapeInterval&quot;:&quot;15&quot;,&quot;enableSecuritecs-nodeyGroupInjection&quot;:&quot;true&quot;,&quot;metricTags&quot;:&quot;&quot;}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>Connection time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-04T16:10:12+08:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Number of dashboards.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder dashboardCount(Long dashboardCount) {
                this.dashboardCount = dashboardCount;
                return this;
            }

            /**
             * <p>Entity details.</p>
             */
            public Builder entityRules(EntityGroupBase entityRules) {
                this.entityRules = entityRules;
                return this;
            }

            /**
             * <p>Environment type.</p>
             * 
             * <strong>example:</strong>
             * <p>CS</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>Environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>policy-xxxxxxxxxxx</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>Number of plugins.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder exporterCount(Long exporterCount) {
                this.exporterCount = exporterCount;
                return this;
            }

            /**
             * <p>Whether there is a configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder haveConfig(Boolean haveConfig) {
                this.haveConfig = haveConfig;
                return this;
            }

            /**
             * <p>User ID for connection.</p>
             * 
             * <strong>example:</strong>
             * <p>1707xxxxxxxxxxxx</p>
             */
            public Builder installUserId(String installUserId) {
                this.installUserId = installUserId;
                return this;
            }

            /**
             * <p>Language.</p>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>Whether it is a managed component.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder managed(Boolean managed) {
                this.managed = managed;
                return this;
            }

            /**
             * <p>Parent AddonRelease ID.</p>
             * 
             * <strong>example:</strong>
             * <p>policy-xxxxxxxxxxxxx</p>
             */
            public Builder parentAddonReleaseId(String parentAddonReleaseId) {
                this.parentAddonReleaseId = parentAddonReleaseId;
                return this;
            }

            /**
             * <p>Policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>policy-xxxxxxxxxxxxx</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Release ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7339d808-66f9-4d40-83fa-xxxxxxxxxxx</p>
             */
            public Builder releaseId(String releaseId) {
                this.releaseId = releaseId;
                return this;
            }

            /**
             * <p>The name of the Release.</p>
             * 
             * <strong>example:</strong>
             * <p>test-gpu-integration-name</p>
             */
            public Builder releaseName(String releaseName) {
                this.releaseName = releaseName;
                return this;
            }

            /**
             * <p>Component scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>container</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>Component status.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-04T16:10:12+08:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>Owner user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1707xxxxxxxxxxxx</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Component version.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.2</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>Workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Release build() {
                return new Release(this);
            } 

        } 

    }
}
