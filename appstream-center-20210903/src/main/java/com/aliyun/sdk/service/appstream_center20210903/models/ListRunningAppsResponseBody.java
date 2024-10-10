// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210903.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRunningAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRunningAppsResponseBody</p>
 */
public class ListRunningAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunningCloudApps")
    private java.util.List < RunningCloudApps> runningCloudApps;

    private ListRunningAppsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.runningCloudApps = builder.runningCloudApps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRunningAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runningCloudApps
     */
    public java.util.List < RunningCloudApps> getRunningCloudApps() {
        return this.runningCloudApps;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RunningCloudApps> runningCloudApps; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2DC3521C-3820-5EA5-9A9A-00BB7AF4E8E5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RunningCloudApps.
         */
        public Builder runningCloudApps(java.util.List < RunningCloudApps> runningCloudApps) {
            this.runningCloudApps = runningCloudApps;
            return this;
        }

        public ListRunningAppsResponseBody build() {
            return new ListRunningAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRunningAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRunningAppsResponseBody</p>
     */
    public static class RunningCloudApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceId")
        private String appInstanceId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("AppVersionName")
        private String appVersionName;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private String iconUrl;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private RunningCloudApps(Builder builder) {
            this.appId = builder.appId;
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceId = builder.appInstanceId;
            this.appName = builder.appName;
            this.appVersion = builder.appVersion;
            this.appVersionName = builder.appVersionName;
            this.duration = builder.duration;
            this.iconUrl = builder.iconUrl;
            this.osType = builder.osType;
            this.regionId = builder.regionId;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunningCloudApps create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return appInstanceId
         */
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return appVersionName
         */
        public String getAppVersionName() {
            return this.appVersionName;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String appId; 
            private String appInstanceGroupId; 
            private String appInstanceId; 
            private String appName; 
            private String appVersion; 
            private String appVersionName; 
            private Long duration; 
            private String iconUrl; 
            private String osType; 
            private String regionId; 
            private String startTime; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppInstanceGroupId.
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * AppInstanceId.
             */
            public Builder appInstanceId(String appInstanceId) {
                this.appInstanceId = appInstanceId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * AppVersionName.
             */
            public Builder appVersionName(String appVersionName) {
                this.appVersionName = appVersionName;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * IconUrl.
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * OsType.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public RunningCloudApps build() {
                return new RunningCloudApps(this);
            } 

        } 

    }
}
