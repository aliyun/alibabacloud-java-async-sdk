// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeAppsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppsResponseBody</p>
 */
public class DescribeAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeAppsResponseBody(Builder builder) {
        this.data = builder.data;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAppsResponseBody build() {
            return new DescribeAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AndroidAppVersion")
        private String androidAppVersion;

        @com.aliyun.core.annotation.NameInMap("ApkSize")
        private String apkSize;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private Integer appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BizRegionId")
        private String bizRegionId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private String iconUrl;

        @com.aliyun.core.annotation.NameInMap("InstallationStatus")
        private String installationStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceGroupList")
        private java.util.List<String> instanceGroupList;

        @com.aliyun.core.annotation.NameInMap("MD5")
        private String mD5;

        @com.aliyun.core.annotation.NameInMap("PackageName")
        private String packageName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.androidAppVersion = builder.androidAppVersion;
            this.apkSize = builder.apkSize;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.bizRegionId = builder.bizRegionId;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.iconUrl = builder.iconUrl;
            this.installationStatus = builder.installationStatus;
            this.instanceGroupList = builder.instanceGroupList;
            this.mD5 = builder.mD5;
            this.packageName = builder.packageName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return androidAppVersion
         */
        public String getAndroidAppVersion() {
            return this.androidAppVersion;
        }

        /**
         * @return apkSize
         */
        public String getApkSize() {
            return this.apkSize;
        }

        /**
         * @return appId
         */
        public Integer getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return bizRegionId
         */
        public String getBizRegionId() {
            return this.bizRegionId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return installationStatus
         */
        public String getInstallationStatus() {
            return this.installationStatus;
        }

        /**
         * @return instanceGroupList
         */
        public java.util.List<String> getInstanceGroupList() {
            return this.instanceGroupList;
        }

        /**
         * @return mD5
         */
        public String getMD5() {
            return this.mD5;
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String androidAppVersion; 
            private String apkSize; 
            private Integer appId; 
            private String appName; 
            private String bizRegionId; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private String iconUrl; 
            private String installationStatus; 
            private java.util.List<String> instanceGroupList; 
            private String mD5; 
            private String packageName; 
            private String status; 

            /**
             * AndroidAppVersion.
             */
            public Builder androidAppVersion(String androidAppVersion) {
                this.androidAppVersion = androidAppVersion;
                return this;
            }

            /**
             * ApkSize.
             */
            public Builder apkSize(String apkSize) {
                this.apkSize = apkSize;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(Integer appId) {
                this.appId = appId;
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
             * BizRegionId.
             */
            public Builder bizRegionId(String bizRegionId) {
                this.bizRegionId = bizRegionId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * InstallationStatus.
             */
            public Builder installationStatus(String installationStatus) {
                this.installationStatus = installationStatus;
                return this;
            }

            /**
             * InstanceGroupList.
             */
            public Builder instanceGroupList(java.util.List<String> instanceGroupList) {
                this.instanceGroupList = instanceGroupList;
                return this;
            }

            /**
             * MD5.
             */
            public Builder mD5(String mD5) {
                this.mD5 = mD5;
                return this;
            }

            /**
             * PackageName.
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
