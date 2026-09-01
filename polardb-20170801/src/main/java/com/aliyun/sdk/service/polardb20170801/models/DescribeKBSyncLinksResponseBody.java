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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeKBSyncLinksResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeKBSyncLinksResponseBody model) {
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
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
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * ImPlatform.
             */
            public Builder imPlatform(String imPlatform) {
                this.imPlatform = imPlatform;
                return this;
            }

            /**
             * LinkId.
             */
            public Builder linkId(String linkId) {
                this.linkId = linkId;
                return this;
            }

            /**
             * LinkName.
             */
            public Builder linkName(String linkName) {
                this.linkName = linkName;
                return this;
            }

            /**
             * SourceDir.
             */
            public Builder sourceDir(String sourceDir) {
                this.sourceDir = sourceDir;
                return this;
            }

            /**
             * SyncIntervalMinutes.
             */
            public Builder syncIntervalMinutes(Integer syncIntervalMinutes) {
                this.syncIntervalMinutes = syncIntervalMinutes;
                return this;
            }

            /**
             * SyncStatus.
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
