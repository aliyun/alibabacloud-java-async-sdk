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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAppsResponseBody model) {
            this.data = model.data;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The objects that are returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uON****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CB95E410-FD1D-53C5-9F7D-93CC44D7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.androidAppVersion = model.androidAppVersion;
                this.apkSize = model.apkSize;
                this.appId = model.appId;
                this.appName = model.appName;
                this.bizRegionId = model.bizRegionId;
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.iconUrl = model.iconUrl;
                this.installationStatus = model.installationStatus;
                this.instanceGroupList = model.instanceGroupList;
                this.mD5 = model.mD5;
                this.packageName = model.packageName;
                this.status = model.status;
            } 

            /**
             * <p>The version of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder androidAppVersion(String androidAppVersion) {
                this.androidAppVersion = androidAppVersion;
                return this;
            }

            /**
             * <p>Apk size.</p>
             * 
             * <strong>example:</strong>
             * <p>10244893</p>
             */
            public Builder apkSize(String apkSize) {
                this.apkSize = apkSize;
                return this;
            }

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>10404</p>
             */
            public Builder appId(Integer appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>testapp</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>Region id.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder bizRegionId(String bizRegionId) {
                this.bizRegionId = bizRegionId;
                return this;
            }

            /**
             * <p>The description of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>default description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the application was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-11 17:45:03</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the application was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-11 17:45:03</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The icon URL of the application.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.png">https://test.png</a></p>
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * <p>The installation/uninstallation status of the application.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>INSTALLFAILED: The application failed to be installed.</li>
             * <li>UNINSTALLING: The application is being uninstalled.</li>
             * <li>INSTALLING: The application is being installed.</li>
             * <li>UNINSTALLED: The application is uninstalled.</li>
             * <li>INSTALLED: The application is installed.</li>
             * <li>UNINSTALLFAILED: The application failed to be uninstalled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INSTALLING</p>
             */
            public Builder installationStatus(String installationStatus) {
                this.installationStatus = installationStatus;
                return this;
            }

            /**
             * <p>The list of instance groups where the application is installed.</p>
             */
            public Builder instanceGroupList(java.util.List<String> instanceGroupList) {
                this.instanceGroupList = instanceGroupList;
                return this;
            }

            /**
             * <p>The value of MD5.</p>
             * 
             * <strong>example:</strong>
             * <p>THCIEH73KEK3334</p>
             */
            public Builder mD5(String mD5) {
                this.mD5 = mD5;
                return this;
            }

            /**
             * <p>The name of the application package.</p>
             * 
             * <strong>example:</strong>
             * <p>cn.rdstar.rdstarandroid</p>
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * <p>The status of the application.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>FAILED: The application failed to be created.</li>
             * <li>NORMAL: The application is available.</li>
             * <li>CREATING: The application is being created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
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
