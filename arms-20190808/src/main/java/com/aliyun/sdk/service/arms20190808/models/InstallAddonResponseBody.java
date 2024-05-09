// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallAddonResponseBody} extends {@link TeaModel}
 *
 * <p>InstallAddonResponseBody</p>
 */
public class InstallAddonResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private InstallAddonResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallAddonResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code. The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values: true and false.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public InstallAddonResponseBody build() {
            return new InstallAddonResponseBody(this);
        } 

    } 

    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirstTransitionTime")
        private String firstTransitionTime;

        @com.aliyun.core.annotation.NameInMap("LastTransitionTime")
        private String lastTransitionTime;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Conditions(Builder builder) {
            this.firstTransitionTime = builder.firstTransitionTime;
            this.lastTransitionTime = builder.lastTransitionTime;
            this.message = builder.message;
            this.reason = builder.reason;
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
         * @return reason
         */
        public String getReason() {
            return this.reason;
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
            private String reason; 
            private String status; 
            private String type; 

            /**
             * The first transition time.
             */
            public Builder firstTransitionTime(String firstTransitionTime) {
                this.firstTransitionTime = firstTransitionTime;
                return this;
            }

            /**
             * The last transition time.
             */
            public Builder lastTransitionTime(String lastTransitionTime) {
                this.lastTransitionTime = lastTransitionTime;
                return this;
            }

            /**
             * The detailed information.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The reason for the failure.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The status of the phase.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the phase.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddonName")
        private String addonName;

        @com.aliyun.core.annotation.NameInMap("AlertRuleCount")
        private Long alertRuleCount;

        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List < Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DashboardCount")
        private Long dashboardCount;

        @com.aliyun.core.annotation.NameInMap("EnvironmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("ExporterCount")
        private Long exporterCount;

        @com.aliyun.core.annotation.NameInMap("HaveConfig")
        private Boolean haveConfig;

        @com.aliyun.core.annotation.NameInMap("InstallUserId")
        private String installUserId;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Managed")
        private Boolean managed;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReleaseId")
        private String releaseId;

        @com.aliyun.core.annotation.NameInMap("ReleaseName")
        private String releaseName;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.addonName = builder.addonName;
            this.alertRuleCount = builder.alertRuleCount;
            this.conditions = builder.conditions;
            this.createTime = builder.createTime;
            this.dashboardCount = builder.dashboardCount;
            this.environmentId = builder.environmentId;
            this.exporterCount = builder.exporterCount;
            this.haveConfig = builder.haveConfig;
            this.installUserId = builder.installUserId;
            this.language = builder.language;
            this.managed = builder.managed;
            this.regionId = builder.regionId;
            this.releaseId = builder.releaseId;
            this.releaseName = builder.releaseName;
            this.scene = builder.scene;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
        public java.util.List < Conditions> getConditions() {
            return this.conditions;
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

        public static final class Builder {
            private String addonName; 
            private Long alertRuleCount; 
            private java.util.List < Conditions> conditions; 
            private String createTime; 
            private Long dashboardCount; 
            private String environmentId; 
            private Long exporterCount; 
            private Boolean haveConfig; 
            private String installUserId; 
            private String language; 
            private Boolean managed; 
            private String regionId; 
            private String releaseId; 
            private String releaseName; 
            private String scene; 
            private String status; 
            private String updateTime; 
            private String userId; 
            private String version; 

            /**
             * The name of the add-on.
             */
            public Builder addonName(String addonName) {
                this.addonName = addonName;
                return this;
            }

            /**
             * The number of alert rules.
             */
            public Builder alertRuleCount(Long alertRuleCount) {
                this.alertRuleCount = alertRuleCount;
                return this;
            }

            /**
             * The installation phase.
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * The time when the add-on was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The number of dashboards.
             */
            public Builder dashboardCount(Long dashboardCount) {
                this.dashboardCount = dashboardCount;
                return this;
            }

            /**
             * The environment ID.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * The number of exporters.
             */
            public Builder exporterCount(Long exporterCount) {
                this.exporterCount = exporterCount;
                return this;
            }

            /**
             * Indicates whether the configuration is available.
             */
            public Builder haveConfig(Boolean haveConfig) {
                this.haveConfig = haveConfig;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder installUserId(String installUserId) {
                this.installUserId = installUserId;
                return this;
            }

            /**
             * The language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Whether or not it is a managed component.
             */
            public Builder managed(Boolean managed) {
                this.managed = managed;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The release ID after installation.
             */
            public Builder releaseId(String releaseId) {
                this.releaseId = releaseId;
                return this;
            }

            /**
             * The name of the release.
             */
            public Builder releaseName(String releaseName) {
                this.releaseName = releaseName;
                return this;
            }

            /**
             * The scenario.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * The status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the add-on was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The version of the add-on.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
