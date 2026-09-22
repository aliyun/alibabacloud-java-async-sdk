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
 * {@link ListPublishedAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublishedAppsResponseBody</p>
 */
public class ListPublishedAppsResponseBody extends TeaModel {
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

    private ListPublishedAppsResponseBody(Builder builder) {
        this.apps = builder.apps;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublishedAppsResponseBody create() {
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

        private Builder(ListPublishedAppsResponseBody model) {
            this.apps = model.apps;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of application records on the current page. Each record corresponds to a deployed application in a published delivery group. The list is sorted by the creation time of the delivery group in descending order. An empty list is returned if no results match or the requested page exceeds the result range.</p>
         */
        public Builder apps(java.util.List<Apps> apps) {
            this.apps = apps;
            return this;
        }

        /**
         * <p>The page number specified in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records per page specified in this request. This value does not represent the actual number of records returned on the current page. The actual number may be less than this value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records that match all filter conditions. Records are counted on a per-delivery-group-plus-application basis. If the same application appears in multiple published delivery groups, each combination is counted separately. This value does not represent the number of records returned on the current page. The value is <code>0</code> if no results match.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPublishedAppsResponseBody build() {
            return new ListPublishedAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPublishedAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedAppsResponseBody</p>
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
             * <p>The URL of the application icon.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://app-center-icon-****.png">https://app-center-icon-****.png</a></p>
             */
            public Builder appIcon(String appIcon) {
                this.appIcon = appIcon;
                return this;
            }

            /**
             * <p>The application ID. Pass this value together with <code>AppInstanceGroupId</code> when you invoke the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to authorize users for this application.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-i87mycyn419nu****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The ID of the published delivery group to which this application belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-9ciijz60n4xsv****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The name of the published delivery group to which this application belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>OfficeApps</p>
             */
            public Builder appInstanceGroupName(String appInstanceGroupName) {
                this.appInstanceGroupName = appInstanceGroupName;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>OfficeApps</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The application version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>The application version name, which is the name assigned to this version when the application was published.</p>
             * 
             * <strong>example:</strong>
             * <p>Initial version</p>
             */
            public Builder appVersionName(String appVersionName) {
                this.appVersionName = appVersionName;
                return this;
            }

            /**
             * <p>The number of users authorized by application for this application within its delivery group. Only users authorized through <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> by application are counted. The value is <code>0</code> if no users have been authorized by application.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
