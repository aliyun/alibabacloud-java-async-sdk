// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
         * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result of the operation.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E9C9DA3D-10FE-472E-9EEF-2D0A3E41****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
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
             * <p>The first transition time.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-01-31T14:32:19Z</p>
             */
            public Builder firstTransitionTime(String firstTransitionTime) {
                this.firstTransitionTime = firstTransitionTime;
                return this;
            }

            /**
             * <p>The last transition time.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-01-31T14:32:19Z</p>
             */
            public Builder lastTransitionTime(String lastTransitionTime) {
                this.lastTransitionTime = lastTransitionTime;
                return this;
            }

            /**
             * <p>The detailed information.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The reason for the failure.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The status of the phase.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the phase.</p>
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
     * {@link ListAddonReleasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAddonReleasesResponseBody</p>
     */
    public static class Releases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddonName")
        private String addonName;

        @com.aliyun.core.annotation.NameInMap("AlertRuleCount")
        private Long alertRuleCount;

        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

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

        @com.aliyun.core.annotation.NameInMap("NextVersion")
        private String nextVersion;

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

        private Releases(Builder builder) {
            this.addonName = builder.addonName;
            this.alertRuleCount = builder.alertRuleCount;
            this.conditions = builder.conditions;
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.dashboardCount = builder.dashboardCount;
            this.environmentId = builder.environmentId;
            this.exporterCount = builder.exporterCount;
            this.haveConfig = builder.haveConfig;
            this.installUserId = builder.installUserId;
            this.language = builder.language;
            this.managed = builder.managed;
            this.nextVersion = builder.nextVersion;
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
            private java.util.List<Conditions> conditions; 
            private String config; 
            private String createTime; 
            private Long dashboardCount; 
            private String environmentId; 
            private Long exporterCount; 
            private Boolean haveConfig; 
            private String installUserId; 
            private String language; 
            private Boolean managed; 
            private String nextVersion; 
            private String regionId; 
            private String releaseId; 
            private String releaseName; 
            private String scene; 
            private String status; 
            private String updateTime; 
            private String userId; 
            private String version; 

            /**
             * <p>The name of the add-on.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder addonName(String addonName) {
                this.addonName = addonName;
                return this;
            }

            /**
             * <p>The number of alert rules.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alertRuleCount(Long alertRuleCount) {
                this.alertRuleCount = alertRuleCount;
                return this;
            }

            /**
             * <p>The installation phase.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The time when the add-on was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-09-22T16:56:29+08:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The number of dashboards.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dashboardCount(Long dashboardCount) {
                this.dashboardCount = dashboardCount;
                return this;
            }

            /**
             * <p>The environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>env-xxxx</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>The number of exporters.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder exporterCount(Long exporterCount) {
                this.exporterCount = exporterCount;
                return this;
            }

            /**
             * <p>Indicates whether the configuration is available.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder haveConfig(Boolean haveConfig) {
                this.haveConfig = haveConfig;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1268790592387</p>
             */
            public Builder installUserId(String installUserId) {
                this.installUserId = installUserId;
                return this;
            }

            /**
             * <p>The language.</p>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
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
             * NextVersion.
             */
            public Builder nextVersion(String nextVersion) {
                this.nextVersion = nextVersion;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-heyuan</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The release ID after installation.</p>
             * 
             * <strong>example:</strong>
             * <p>be29c093-3fd6-4fb6-9430-797030cc183a</p>
             */
            public Builder releaseId(String releaseId) {
                this.releaseId = releaseId;
                return this;
            }

            /**
             * <p>The name of the release.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql-1695372983039</p>
             */
            public Builder releaseName(String releaseName) {
                this.releaseName = releaseName;
                return this;
            }

            /**
             * <p>The scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>database</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the add-on was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-09-22T16:56:29+08:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The version of the add-on.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.1</p>
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
    /**
     * 
     * {@link ListAddonReleasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAddonReleasesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Releases")
        private java.util.List<Releases> releases;

        @com.aliyun.core.annotation.NameInMap("Total")
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
        public java.util.List<Releases> getReleases() {
            return this.releases;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Releases> releases; 
            private Long total; 

            /**
             * <p>The queried add-ons.</p>
             */
            public Builder releases(java.util.List<Releases> releases) {
                this.releases = releases;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
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
