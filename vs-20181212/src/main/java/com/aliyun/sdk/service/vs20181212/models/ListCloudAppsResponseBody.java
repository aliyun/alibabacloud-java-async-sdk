// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link ListCloudAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudAppsResponseBody</p>
 */
public class ListCloudAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudApps")
    private java.util.List<CloudApps> cloudApps;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCloudAppsResponseBody(Builder builder) {
        this.cloudApps = builder.cloudApps;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudAppsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudApps
     */
    public java.util.List<CloudApps> getCloudApps() {
        return this.cloudApps;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CloudApps> cloudApps; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCloudAppsResponseBody model) {
            this.cloudApps = model.cloudApps;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>List of cloud application information.</p>
         */
        public Builder cloudApps(java.util.List<CloudApps> cloudApps) {
            this.cloudApps = cloudApps;
            return this;
        }

        /**
         * <p>Page number of the query list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Number of rows per page for paged queries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of matching cloud application entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCloudAppsResponseBody build() {
            return new ListCloudAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAppsResponseBody</p>
     */
    public static class CloudApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PkgFormat")
        private String pkgFormat;

        @com.aliyun.core.annotation.NameInMap("PkgType")
        private String pkgType;

        @com.aliyun.core.annotation.NameInMap("StablePatchId")
        private String stablePatchId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusDescription")
        private String statusDescription;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UploadTime")
        private String uploadTime;

        private CloudApps(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appVersion = builder.appVersion;
            this.description = builder.description;
            this.pkgFormat = builder.pkgFormat;
            this.pkgType = builder.pkgType;
            this.stablePatchId = builder.stablePatchId;
            this.status = builder.status;
            this.statusDescription = builder.statusDescription;
            this.updateTime = builder.updateTime;
            this.uploadTime = builder.uploadTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudApps create() {
            return builder().build();
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return pkgFormat
         */
        public String getPkgFormat() {
            return this.pkgFormat;
        }

        /**
         * @return pkgType
         */
        public String getPkgType() {
            return this.pkgType;
        }

        /**
         * @return stablePatchId
         */
        public String getStablePatchId() {
            return this.stablePatchId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusDescription
         */
        public String getStatusDescription() {
            return this.statusDescription;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return uploadTime
         */
        public String getUploadTime() {
            return this.uploadTime;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String appVersion; 
            private String description; 
            private String pkgFormat; 
            private String pkgType; 
            private String stablePatchId; 
            private String status; 
            private String statusDescription; 
            private String updateTime; 
            private String uploadTime; 

            private Builder() {
            } 

            private Builder(CloudApps model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.appVersion = model.appVersion;
                this.description = model.description;
                this.pkgFormat = model.pkgFormat;
                this.pkgType = model.pkgType;
                this.stablePatchId = model.stablePatchId;
                this.status = model.status;
                this.statusDescription = model.statusDescription;
                this.updateTime = model.updateTime;
                this.uploadTime = model.uploadTime;
            } 

            /**
             * <p>Application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>Application name.</p>
             * 
             * <strong>example:</strong>
             * <p>com.aaa.bbb</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>Application version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.5.0</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>Application description.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Package format.</p>
             * 
             * <strong>example:</strong>
             * <p>apk</p>
             */
            public Builder pkgFormat(String pkgFormat) {
                this.pkgFormat = pkgFormat;
                return this;
            }

            /**
             * <p>Package type: android/win.</p>
             * 
             * <strong>example:</strong>
             * <p>android</p>
             */
            public Builder pkgType(String pkgType) {
                this.pkgType = pkgType;
                return this;
            }

            /**
             * <p>Stable patch package ID.</p>
             * 
             * <strong>example:</strong>
             * <p>patch-7bdf679812484df08a956b73e0b3bdf6</p>
             */
            public Builder stablePatchId(String stablePatchId) {
                this.stablePatchId = stablePatchId;
                return this;
            }

            /**
             * <p>The application upload status. Valid values:</p>
             * <ol>
             * <li><p>Created</p>
             * </li>
             * <li><p>Doing</p>
             * </li>
             * <li><p>Success: The desired state.</p>
             * </li>
             * <li><p>Failed: The desired state.</p>
             * </li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Status description.</p>
             * 
             * <strong>example:</strong>
             * <p>upload success</p>
             */
            public Builder statusDescription(String statusDescription) {
                this.statusDescription = statusDescription;
                return this;
            }

            /**
             * <p>Latest status update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-28T14:48:34+08:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>Application upload time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-28T14:28:14+08:00</p>
             */
            public Builder uploadTime(String uploadTime) {
                this.uploadTime = uploadTime;
                return this;
            }

            public CloudApps build() {
                return new CloudApps(this);
            } 

        } 

    }
}
