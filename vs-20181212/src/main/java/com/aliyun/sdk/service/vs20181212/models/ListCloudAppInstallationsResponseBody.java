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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListCloudAppInstallationsResponseBody model) {
            this.installationInfos = model.installationInfos;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>List of installation records.</p>
         */
        public Builder installationInfos(java.util.List<InstallationInfos> installationInfos) {
            this.installationInfos = installationInfos;
            return this;
        }

        /**
         * <p>Page number of the returned list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Number of entries per page for paged queries.</p>
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
         * <p>Total number of installation records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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

        @com.aliyun.core.annotation.NameInMap("PatchId")
        private String patchId;

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
            this.patchId = builder.patchId;
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
         * @return patchId
         */
        public String getPatchId() {
            return this.patchId;
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
            private String patchId; 
            private String renderingInstanceId; 
            private String status; 
            private String statusDescription; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(InstallationInfos model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.appVersion = model.appVersion;
                this.installationTime = model.installationTime;
                this.patchId = model.patchId;
                this.renderingInstanceId = model.renderingInstanceId;
                this.status = model.status;
                this.statusDescription = model.statusDescription;
                this.updateTime = model.updateTime;
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
             * <p>Installation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-28T14:48:34+08:00</p>
             */
            public Builder installationTime(String installationTime) {
                this.installationTime = installationTime;
                return this;
            }

            /**
             * <p>Patch package ID.</p>
             * 
             * <strong>example:</strong>
             * <p>patch-7bdf679812484df08a956b73e0b3bdf6</p>
             */
            public Builder patchId(String patchId) {
                this.patchId = patchId;
                return this;
            }

            /**
             * <p>Cloud application service instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
             */
            public Builder renderingInstanceId(String renderingInstanceId) {
                this.renderingInstanceId = renderingInstanceId;
                return this;
            }

            /**
             * <p>Cloud application installation status. Valid values:</p>
             * <ol>
             * <li><p>Intermediate states: install-init, installing</p>
             * </li>
             * <li><p>Final states: installed, install-failed</p>
             * </li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>installed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Status description.</p>
             * 
             * <strong>example:</strong>
             * <p>install success</p>
             */
            public Builder statusDescription(String statusDescription) {
                this.statusDescription = statusDescription;
                return this;
            }

            /**
             * <p>Time when the status was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-28T14:50:04+08:00</p>
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
