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
 * {@link ListPublishedAppInstanceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublishedAppInstanceGroupResponseBody</p>
 */
public class ListPublishedAppInstanceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupModels")
    private java.util.List<AppInstanceGroupModels> appInstanceGroupModels;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListPublishedAppInstanceGroupResponseBody(Builder builder) {
        this.appInstanceGroupModels = builder.appInstanceGroupModels;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublishedAppInstanceGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupModels
     */
    public java.util.List<AppInstanceGroupModels> getAppInstanceGroupModels() {
        return this.appInstanceGroupModels;
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
        private java.util.List<AppInstanceGroupModels> appInstanceGroupModels; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListPublishedAppInstanceGroupResponseBody model) {
            this.appInstanceGroupModels = model.appInstanceGroupModels;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of published delivery groups on the current page, sorted by creation time from newest to oldest. An empty list is returned if no results match or if the requested page exceeds the result range.</p>
         */
        public Builder appInstanceGroupModels(java.util.List<AppInstanceGroupModels> appInstanceGroupModels) {
            this.appInstanceGroupModels = appInstanceGroupModels;
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
         * <p>The number of delivery groups per page specified in the request. Unit: delivery groups. This value does not represent the actual number of delivery groups returned on the current page. The actual number on the current page may be less than this value.</p>
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
         * <p>The total number of delivery groups that match all filter conditions. Unit: delivery groups. This value is not the number of delivery groups returned on the current page. Each delivery group is counted only once. The value is <code>0</code> if no results match.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPublishedAppInstanceGroupResponseBody build() {
            return new ListPublishedAppInstanceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPublishedAppInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedAppInstanceGroupResponseBody</p>
     */
    public static class Apps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppIcon")
        private String appIcon;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("AppVersionName")
        private String appVersionName;

        private Apps(Builder builder) {
            this.appIcon = builder.appIcon;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appVersion = builder.appVersion;
            this.appVersionName = builder.appVersionName;
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

        public static final class Builder {
            private String appIcon; 
            private String appId; 
            private String appName; 
            private String appVersion; 
            private String appVersionName; 

            private Builder() {
            } 

            private Builder(Apps model) {
                this.appIcon = model.appIcon;
                this.appId = model.appId;
                this.appName = model.appName;
                this.appVersion = model.appVersion;
                this.appVersionName = model.appVersionName;
            } 

            /**
             * <p>The application icon.</p>
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
             * <p>The application version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>The application version name.</p>
             * 
             * <strong>example:</strong>
             * <p>Initial version</p>
             */
            public Builder appVersionName(String appVersionName) {
                this.appVersionName = appVersionName;
                return this;
            }

            public Apps build() {
                return new Apps(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPublishedAppInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedAppInstanceGroupResponseBody</p>
     */
    public static class AppInstanceGroupModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCenterImageId")
        private String appCenterImageId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupName")
        private String appInstanceGroupName;

        @com.aliyun.core.annotation.NameInMap("AppInstanceType")
        private String appInstanceType;

        @com.aliyun.core.annotation.NameInMap("Apps")
        private java.util.List<Apps> apps;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AppInstanceGroupModels(Builder builder) {
            this.appCenterImageId = builder.appCenterImageId;
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceGroupName = builder.appInstanceGroupName;
            this.appInstanceType = builder.appInstanceType;
            this.apps = builder.apps;
            this.expiredTime = builder.expiredTime;
            this.gmtCreate = builder.gmtCreate;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInstanceGroupModels create() {
            return builder().build();
        }

        /**
         * @return appCenterImageId
         */
        public String getAppCenterImageId() {
            return this.appCenterImageId;
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
         * @return appInstanceType
         */
        public String getAppInstanceType() {
            return this.appInstanceType;
        }

        /**
         * @return apps
         */
        public java.util.List<Apps> getApps() {
            return this.apps;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appCenterImageId; 
            private String appInstanceGroupId; 
            private String appInstanceGroupName; 
            private String appInstanceType; 
            private java.util.List<Apps> apps; 
            private String expiredTime; 
            private String gmtCreate; 
            private String regionId; 
            private String status; 

            private Builder() {
            } 

            private Builder(AppInstanceGroupModels model) {
                this.appCenterImageId = model.appCenterImageId;
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.appInstanceGroupName = model.appInstanceGroupName;
                this.appInstanceType = model.appInstanceType;
                this.apps = model.apps;
                this.expiredTime = model.expiredTime;
                this.gmtCreate = model.gmtCreate;
                this.regionId = model.regionId;
                this.status = model.status;
            } 

            /**
             * <p>The application image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>img-8z4nztpaqvay4****</p>
             */
            public Builder appCenterImageId(String appCenterImageId) {
                this.appCenterImageId = appCenterImageId;
                return this;
            }

            /**
             * <p>The delivery group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-9ciijz60n4xsv****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The delivery group name.</p>
             * 
             * <strong>example:</strong>
             * <p>OfficeApps</p>
             */
            public Builder appInstanceGroupName(String appInstanceGroupName) {
                this.appInstanceGroupName = appInstanceGroupName;
                return this;
            }

            /**
             * <p>The delivery group specification type.</p>
             * 
             * <strong>example:</strong>
             * <p><strong>dynamic</strong></p>
             */
            public Builder appInstanceType(String appInstanceType) {
                this.appInstanceType = appInstanceType;
                return this;
            }

            /**
             * <p>The list of deployed applications in the delivery group image. The <code>AppId</code> and <code>AppName</code> parameters in the request only determine whether a delivery group is included in the results. They do not trim this list to only the matched applications.</p>
             */
            public Builder apps(java.util.List<Apps> apps) {
                this.apps = apps;
                return this;
            }

            /**
             * <p>The expiration time of the delivery group. For delivery groups sold as resources, this is the resource expiration time. For other delivery groups, this is the delivery group expiration time. The value is in ISO 8601 format with milliseconds and a time zone offset. The returned time zone offset is +00:00. Format: yyyy-MM-ddTHH:mm:ss.SSS+HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-27T16:00:00.000+00:00</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The creation time of the delivery group. The value is in ISO 8601 format with milliseconds and a time zone offset. The returned time zone offset is +00:00. Format: yyyy-MM-ddTHH:mm:ss.SSS+HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-26T15:06:16.000+00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The region ID of the delivery group.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The delivery group status. This operation returns delivery groups only in the following status:</p>
             * <ul>
             * <li><code>PUBLISHED</code>: Published and listed. The delivery group can appear in the query results of this operation. This status does not indicate that a specified user has been granted access permissions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUBLISHED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AppInstanceGroupModels build() {
                return new AppInstanceGroupModels(this);
            } 

        } 

    }
}
