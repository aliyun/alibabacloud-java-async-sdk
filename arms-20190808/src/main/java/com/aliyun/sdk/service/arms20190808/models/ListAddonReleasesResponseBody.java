// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAddonReleasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAddonReleasesResponseBody</p>
 */
public class ListAddonReleasesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListAddonReleasesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAddonReleasesResponseBody create() {
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
         * Status code: 200 indicates success.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned struct.
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAddonReleasesResponseBody build() {
            return new ListAddonReleasesResponseBody(this);
        } 

    } 

    public static class Conditions extends TeaModel {
        @NameInMap("FirstTransitionTime")
        private String firstTransitionTime;

        @NameInMap("LastTransitionTime")
        private String lastTransitionTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
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
             * First transition time.
             */
            public Builder firstTransitionTime(String firstTransitionTime) {
                this.firstTransitionTime = firstTransitionTime;
                return this;
            }

            /**
             * Last transition time.
             */
            public Builder lastTransitionTime(String lastTransitionTime) {
                this.lastTransitionTime = lastTransitionTime;
                return this;
            }

            /**
             * Details.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Reason of failure.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Condition status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Condition type.
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
    public static class Releases extends TeaModel {
        @NameInMap("AddonName")
        private String addonName;

        @NameInMap("AlertRuleCount")
        private Long alertRuleCount;

        @NameInMap("Conditions")
        private java.util.List < Conditions> conditions;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DashboardCount")
        private Long dashboardCount;

        @NameInMap("EnvironmentId")
        private String environmentId;

        @NameInMap("ExporterCount")
        private Long exporterCount;

        @NameInMap("HaveConfig")
        private Boolean haveConfig;

        @NameInMap("InstallUserId")
        private String installUserId;

        @NameInMap("Language")
        private String language;

        @NameInMap("Managed")
        private Boolean managed;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ReleaseId")
        private String releaseId;

        @NameInMap("ReleaseName")
        private String releaseName;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("Version")
        private String version;

        private Releases(Builder builder) {
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
             * Name of Addon.
             */
            public Builder addonName(String addonName) {
                this.addonName = addonName;
                return this;
            }

            /**
             * Number of alarm groups.
             */
            public Builder alertRuleCount(Long alertRuleCount) {
                this.alertRuleCount = alertRuleCount;
                return this;
            }

            /**
             * Condition list.
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * Created time.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Number of dashboard.
             */
            public Builder dashboardCount(Long dashboardCount) {
                this.dashboardCount = dashboardCount;
                return this;
            }

            /**
             * Environment instance ID.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * Number of Exporter.
             */
            public Builder exporterCount(Long exporterCount) {
                this.exporterCount = exporterCount;
                return this;
            }

            /**
             * Whether there is configuration.
             */
            public Builder haveConfig(Boolean haveConfig) {
                this.haveConfig = haveConfig;
                return this;
            }

            /**
             * User ID of the installation.
             */
            public Builder installUserId(String installUserId) {
                this.installUserId = installUserId;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Managed.
             */
            public Builder managed(Boolean managed) {
                this.managed = managed;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Release ID.
             */
            public Builder releaseId(String releaseId) {
                this.releaseId = releaseId;
                return this;
            }

            /**
             * Name of Release.
             */
            public Builder releaseName(String releaseName) {
                this.releaseName = releaseName;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * Status of Release.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Update time.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * User ID.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Version of Addon.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Releases build() {
                return new Releases(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Releases")
        private java.util.List < Releases> releases;

        @NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.releases = builder.releases;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return releases
         */
        public java.util.List < Releases> getReleases() {
            return this.releases;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Releases> releases; 
            private Long total; 

            /**
             * Release list.
             */
            public Builder releases(java.util.List < Releases> releases) {
                this.releases = releases;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
