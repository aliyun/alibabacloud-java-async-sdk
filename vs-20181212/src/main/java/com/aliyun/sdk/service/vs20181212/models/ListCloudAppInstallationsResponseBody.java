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
 * {@link ListCloudAppInstallationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudAppInstallationsResponseBody</p>
 */
public class ListCloudAppInstallationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstallationInfos")
    private java.util.List<InstallationInfos> installationInfos;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCloudAppInstallationsResponseBody(Builder builder) {
        this.installationInfos = builder.installationInfos;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudAppInstallationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return installationInfos
     */
    public java.util.List<InstallationInfos> getInstallationInfos() {
        return this.installationInfos;
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
        private java.util.List<InstallationInfos> installationInfos; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * InstallationInfos.
         */
        public Builder installationInfos(java.util.List<InstallationInfos> installationInfos) {
            this.installationInfos = installationInfos;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCloudAppInstallationsResponseBody build() {
            return new ListCloudAppInstallationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudAppInstallationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAppInstallationsResponseBody</p>
     */
    public static class InstallationInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("InstallationTime")
        private String installationTime;

        @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
        private String renderingInstanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusDescription")
        private String statusDescription;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private InstallationInfos(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appVersion = builder.appVersion;
            this.installationTime = builder.installationTime;
            this.renderingInstanceId = builder.renderingInstanceId;
            this.status = builder.status;
            this.statusDescription = builder.statusDescription;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstallationInfos create() {
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
         * @return installationTime
         */
        public String getInstallationTime() {
            return this.installationTime;
        }

        /**
         * @return renderingInstanceId
         */
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
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

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String appVersion; 
            private String installationTime; 
            private String renderingInstanceId; 
            private String status; 
            private String statusDescription; 
            private String updateTime; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
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
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * InstallationTime.
             */
            public Builder installationTime(String installationTime) {
                this.installationTime = installationTime;
                return this;
            }

            /**
             * RenderingInstanceId.
             */
            public Builder renderingInstanceId(String renderingInstanceId) {
                this.renderingInstanceId = renderingInstanceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusDescription.
             */
            public Builder statusDescription(String statusDescription) {
                this.statusDescription = statusDescription;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public InstallationInfos build() {
                return new InstallationInfos(this);
            } 

        } 

    }
}
