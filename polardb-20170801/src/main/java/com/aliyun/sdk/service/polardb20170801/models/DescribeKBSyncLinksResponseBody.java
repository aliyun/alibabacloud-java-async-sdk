// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeKBSyncLinksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKBSyncLinksResponseBody</p>
 */
public class DescribeKBSyncLinksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeKBSyncLinksResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKBSyncLinksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeKBSyncLinksResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of synchronization links.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the current results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records per page in the current results.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>EB07CFF0-D8A4-5C76-AED7-D00E26FC2***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of synchronization links that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeKBSyncLinksResponseBody build() {
            return new DescribeKBSyncLinksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKBSyncLinksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKBSyncLinksResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ImPlatform")
        private String imPlatform;

        @com.aliyun.core.annotation.NameInMap("LinkId")
        private String linkId;

        @com.aliyun.core.annotation.NameInMap("LinkName")
        private String linkName;

        @com.aliyun.core.annotation.NameInMap("SourceDir")
        private String sourceDir;

        @com.aliyun.core.annotation.NameInMap("SyncIntervalMinutes")
        private Integer syncIntervalMinutes;

        @com.aliyun.core.annotation.NameInMap("SyncStatus")
        private String syncStatus;

        private Items(Builder builder) {
            this.clientId = builder.clientId;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.imPlatform = builder.imPlatform;
            this.linkId = builder.linkId;
            this.linkName = builder.linkName;
            this.sourceDir = builder.sourceDir;
            this.syncIntervalMinutes = builder.syncIntervalMinutes;
            this.syncStatus = builder.syncStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return imPlatform
         */
        public String getImPlatform() {
            return this.imPlatform;
        }

        /**
         * @return linkId
         */
        public String getLinkId() {
            return this.linkId;
        }

        /**
         * @return linkName
         */
        public String getLinkName() {
            return this.linkName;
        }

        /**
         * @return sourceDir
         */
        public String getSourceDir() {
            return this.sourceDir;
        }

        /**
         * @return syncIntervalMinutes
         */
        public Integer getSyncIntervalMinutes() {
            return this.syncIntervalMinutes;
        }

        /**
         * @return syncStatus
         */
        public String getSyncStatus() {
            return this.syncStatus;
        }

        public static final class Builder {
            private String clientId; 
            private String creationTime; 
            private String description; 
            private String imPlatform; 
            private String linkId; 
            private String linkName; 
            private String sourceDir; 
            private Integer syncIntervalMinutes; 
            private String syncStatus; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.clientId = model.clientId;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.imPlatform = model.imPlatform;
                this.linkId = model.linkId;
                this.linkName = model.linkName;
                this.sourceDir = model.sourceDir;
                this.syncIntervalMinutes = model.syncIntervalMinutes;
                this.syncStatus = model.syncStatus;
            } 

            /**
             * <p>The client ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cli_xxxxxxbe8</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-11T09:55:19Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the synchronization link.</p>
             * 
             * <strong>example:</strong>
             * <p>testDesc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The source channel of the synchronization link.</p>
             * 
             * <strong>example:</strong>
             * <p>FEISHU</p>
             */
            public Builder imPlatform(String imPlatform) {
                this.imPlatform = imPlatform;
                return this;
            }

            /**
             * <p>The synchronization link ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pkbl-xxxxx</p>
             */
            public Builder linkId(String linkId) {
                this.linkId = linkId;
                return this;
            }

            /**
             * <p>The link name.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder linkName(String linkName) {
                this.linkName = linkName;
                return this;
            }

            /**
             * <p>The source directory address for synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.feishu.cn/wiki/space/xxxxxx">https://example.feishu.cn/wiki/space/xxxxxx</a></p>
             */
            public Builder sourceDir(String sourceDir) {
                this.sourceDir = sourceDir;
                return this;
            }

            /**
             * <p>The synchronization interval. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder syncIntervalMinutes(Integer syncIntervalMinutes) {
                this.syncIntervalMinutes = syncIntervalMinutes;
                return this;
            }

            /**
             * <p>The synchronization status. Valid values:</p>
             * <ul>
             * <li>CREATING</li>
             * <li>RUNNING</li>
             * <li>PAUSED</li>
             * <li>DELETING</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder syncStatus(String syncStatus) {
                this.syncStatus = syncStatus;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
