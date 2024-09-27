// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInstanceExtensionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceExtensionsResponseBody</p>
 */
public class ListInstanceExtensionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private ListInstanceExtensionsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceExtensionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7565770E-7C45-462D-BA4A-8A5396F2CAD1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListInstanceExtensionsResponseBody build() {
            return new ListInstanceExtensionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceExtensionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceExtensionsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentVersion")
        private String currentVersion;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExtensionId")
        private String extensionId;

        @com.aliyun.core.annotation.NameInMap("InstalledDatabases")
        private String installedDatabases;

        @com.aliyun.core.annotation.NameInMap("IsInstallNeedRestart")
        private Boolean isInstallNeedRestart;

        @com.aliyun.core.annotation.NameInMap("LatestVersion")
        private String latestVersion;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Items(Builder builder) {
            this.currentVersion = builder.currentVersion;
            this.description = builder.description;
            this.extensionId = builder.extensionId;
            this.installedDatabases = builder.installedDatabases;
            this.isInstallNeedRestart = builder.isInstallNeedRestart;
            this.latestVersion = builder.latestVersion;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extensionId
         */
        public String getExtensionId() {
            return this.extensionId;
        }

        /**
         * @return installedDatabases
         */
        public String getInstalledDatabases() {
            return this.installedDatabases;
        }

        /**
         * @return isInstallNeedRestart
         */
        public Boolean getIsInstallNeedRestart() {
            return this.isInstallNeedRestart;
        }

        /**
         * @return latestVersion
         */
        public String getLatestVersion() {
            return this.latestVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String currentVersion; 
            private String description; 
            private String extensionId; 
            private String installedDatabases; 
            private Boolean isInstallNeedRestart; 
            private String latestVersion; 
            private String name; 
            private String status; 

            /**
             * <p>The current version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * <p>The description of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>citext usage</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The extension ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder extensionId(String extensionId) {
                this.extensionId = extensionId;
                return this;
            }

            /**
             * <p>The names of the databases in which the extension is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder installedDatabases(String installedDatabases) {
                this.installedDatabases = installedDatabases;
                return this;
            }

            /**
             * <p>Indicates whether an instance restart is required after you install the extension for the extension to take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isInstallNeedRestart(Boolean isInstallNeedRestart) {
                this.isInstallNeedRestart = isInstallNeedRestart;
                return this;
            }

            /**
             * <p>The latest version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1</p>
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
                return this;
            }

            /**
             * <p>The name of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>citext</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>installed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
