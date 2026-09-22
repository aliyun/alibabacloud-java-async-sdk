// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListAuthorizedAppsByUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizedAppsByUserResponseBody</p>
 */
public class ListAuthorizedAppsByUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Apps")
    private java.util.List<Apps> apps;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAuthorizedAppsByUserResponseBody(Builder builder) {
        this.apps = builder.apps;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedAppsByUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apps
     */
    public java.util.List<Apps> getApps() {
        return this.apps;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Apps> apps; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAuthorizedAppsByUserResponseBody model) {
            this.apps = model.apps;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of applications authorized to the user. Each record corresponds to one application within one delivery group.</p>
         */
        public Builder apps(java.util.List<Apps> apps) {
            this.apps = apps;
            return this;
        }

        /**
         * <p>The page number of the returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of authorization records that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAuthorizedAppsByUserResponseBody build() {
            return new ListAuthorizedAppsByUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthorizedAppsByUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizedAppsByUserResponseBody</p>
     */
    public static class Apps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppIcon")
        private String appIcon;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupName")
        private String appInstanceGroupName;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("AppVersionName")
        private String appVersionName;

        @com.aliyun.core.annotation.NameInMap("AuthorizedUserCount")
        private Integer authorizedUserCount;

        private Apps(Builder builder) {
            this.appIcon = builder.appIcon;
            this.appId = builder.appId;
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceGroupName = builder.appInstanceGroupName;
            this.appName = builder.appName;
            this.appVersion = builder.appVersion;
            this.appVersionName = builder.appVersionName;
            this.authorizedUserCount = builder.authorizedUserCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Apps create() {
            return builder().build();
        }

        /**
         * @return appIcon
         */
        public String getAppIcon() {
            return this.appIcon;
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
         * @return appInstanceGroupName
         */
        public String getAppInstanceGroupName() {
            return this.appInstanceGroupName;
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
         * @return authorizedUserCount
         */
        public Integer getAuthorizedUserCount() {
            return this.authorizedUserCount;
        }

        public static final class Builder {
            private String appIcon; 
            private String appId; 
            private String appInstanceGroupId; 
            private String appInstanceGroupName; 
            private String appName; 
            private String appVersion; 
            private String appVersionName; 
            private Integer authorizedUserCount; 

            private Builder() {
            } 

            private Builder(Apps model) {
                this.appIcon = model.appIcon;
                this.appId = model.appId;
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.appInstanceGroupName = model.appInstanceGroupName;
                this.appName = model.appName;
                this.appVersion = model.appVersion;
                this.appVersionName = model.appVersionName;
                this.authorizedUserCount = model.authorizedUserCount;
            } 

            /**
             * <p>The URL of the application icon. This value is empty if the deployment details of the application cannot be obtained.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://app-center-icon-****.png">https://app-center-icon-****.png</a></p>
             */
            public Builder appIcon(String appIcon) {
                this.appIcon = appIcon;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-i87mycyn419nu****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The ID of the delivery group to which the application belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-9ciijz60n4xsv****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The name of the delivery group to which the application belongs. If the delivery group information cannot be obtained, the value is the same as AppInstanceGroupId.</p>
             * 
             * <strong>example:</strong>
             * <p>OfficeApp</p>
             */
            public Builder appInstanceGroupName(String appInstanceGroupName) {
                this.appInstanceGroupName = appInstanceGroupName;
                return this;
            }

            /**
             * <p>The application name. If the deployment details of the application cannot be obtained, the value is the same as AppId.</p>
             * 
             * <strong>example:</strong>
             * <p>OfficeApp</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The application version. This value is empty if the deployment details of the application cannot be obtained.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>The application version name. This value is empty if the deployment details of the application cannot be obtained.</p>
             * 
             * <strong>example:</strong>
             * <p>InitialVersion</p>
             */
            public Builder appVersionName(String appVersionName) {
                this.appVersionName = appVersionName;
                return this;
            }

            /**
             * <p>The number of authorized users for the application within its delivery group. This value is empty if the deployment details of the application cannot be obtained.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder authorizedUserCount(Integer authorizedUserCount) {
                this.authorizedUserCount = authorizedUserCount;
                return this;
            }

            public Apps build() {
                return new Apps(this);
            } 

        } 

    }
}
