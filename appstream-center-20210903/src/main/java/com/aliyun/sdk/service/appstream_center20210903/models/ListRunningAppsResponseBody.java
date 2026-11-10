// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210903.models;

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
 * {@link ListRunningAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRunningAppsResponseBody</p>
 */
public class ListRunningAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunningCloudApps")
    private java.util.List<RunningCloudApps> runningCloudApps;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<RunningCloudApps> getRunningCloudApps() {
        return this.runningCloudApps;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RunningCloudApps> runningCloudApps; 

        private Builder() {
        } 

        private Builder(ListRunningAppsResponseBody model) {
            this.requestId = model.requestId;
            this.runningCloudApps = model.runningCloudApps;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2DC3521C-3820-5EA5-9A9A-00BB7AF4E8E5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of running cloud applications.</p>
         */
        public Builder runningCloudApps(java.util.List<RunningCloudApps> runningCloudApps) {
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

            private Builder() {
            } 

            private Builder(RunningCloudApps model) {
                this.appId = model.appId;
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.appInstanceId = model.appInstanceId;
                this.appName = model.appName;
                this.appVersion = model.appVersion;
                this.appVersionName = model.appVersionName;
                this.duration = model.duration;
                this.iconUrl = model.iconUrl;
                this.osType = model.osType;
                this.regionId = model.regionId;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-dln05y44ze6esfl8x</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The app instance group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-dk8p95irk9xs5xi6a</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The application instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ai-gc1gemx6vpa6vlync</p>
             */
            public Builder appInstanceId(String appInstanceId) {
                this.appInstanceId = appInstanceId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>alihealth-keeper</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The application version.</p>
             * 
             * <strong>example:</strong>
             * <p>11.1</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>The application version name.</p>
             * 
             * <strong>example:</strong>
             * <p>test1.0</p>
             */
            public Builder appVersionName(String appVersionName) {
                this.appVersionName = appVersionName;
                return this;
            }

            /**
             * <p>The running duration of the cloud application instance. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>87</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The URL of the application icon.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://app-icon-shanghai.oss-cn-shanghai.aliyuncs.com/tenant/187465/18_bf1.jpg">https://app-icon-shanghai.oss-cn-shanghai.aliyuncs.com/tenant/187465/18_bf1.jpg</a></p>
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * <p>The operating system type of the instance platform.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The region ID of the cloud application.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The start time. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1642748400</p>
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
