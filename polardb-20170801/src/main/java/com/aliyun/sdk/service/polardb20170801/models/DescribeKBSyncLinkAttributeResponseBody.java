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
 * {@link DescribeKBSyncLinkAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKBSyncLinkAttributeResponseBody</p>
 */
public class DescribeKBSyncLinkAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.NameInMap("Config")
    private Config config;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceDir")
    private String sourceDir;

    @com.aliyun.core.annotation.NameInMap("SyncIntervalMinutes")
    private Integer syncIntervalMinutes;

    @com.aliyun.core.annotation.NameInMap("SyncStatus")
    private String syncStatus;

    private DescribeKBSyncLinkAttributeResponseBody(Builder builder) {
        this.clientId = builder.clientId;
        this.config = builder.config;
        this.creationTime = builder.creationTime;
        this.description = builder.description;
        this.imPlatform = builder.imPlatform;
        this.linkId = builder.linkId;
        this.linkName = builder.linkName;
        this.requestId = builder.requestId;
        this.sourceDir = builder.sourceDir;
        this.syncIntervalMinutes = builder.syncIntervalMinutes;
        this.syncStatus = builder.syncStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKBSyncLinkAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private Config config; 
        private String creationTime; 
        private String description; 
        private String imPlatform; 
        private String linkId; 
        private String linkName; 
        private String requestId; 
        private String sourceDir; 
        private Integer syncIntervalMinutes; 
        private String syncStatus; 

        private Builder() {
        } 

        private Builder(DescribeKBSyncLinkAttributeResponseBody model) {
            this.clientId = model.clientId;
            this.config = model.config;
            this.creationTime = model.creationTime;
            this.description = model.description;
            this.imPlatform = model.imPlatform;
            this.linkId = model.linkId;
            this.linkName = model.linkName;
            this.requestId = model.requestId;
            this.sourceDir = model.sourceDir;
            this.syncIntervalMinutes = model.syncIntervalMinutes;
            this.syncStatus = model.syncStatus;
        } 

        /**
         * <p>The client ID of the source application.</p>
         * 
         * <strong>example:</strong>
         * <p>cli_a123456</p>
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The synchronization configuration whitelist returned based on the source type. For DINGTALK, UserId can be returned. For FEISHU, FeishuChatMemberStaleTtlSeconds can be returned.</p>
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The creation time of the synchronization link.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-22T12:00:00Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The description of the synchronization link.</p>
         * 
         * <strong>example:</strong>
         * <p>Synchronize Lark knowledge base documents</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The source channel of the synchronization link. Valid values: OSS, DINGTALK, FEISHU, and SHAREPOINT.</p>
         * 
         * <strong>example:</strong>
         * <p>FEISHU</p>
         */
        public Builder imPlatform(String imPlatform) {
            this.imPlatform = imPlatform;
            return this;
        }

        /**
         * <p>The unique identifier of the synchronization link.</p>
         * 
         * <strong>example:</strong>
         * <p>pkbl-123456</p>
         */
        public Builder linkId(String linkId) {
            this.linkId = linkId;
            return this;
        }

        /**
         * <p>The name of the synchronization link.</p>
         * 
         * <strong>example:</strong>
         * <p>feishu-doc-sync</p>
         */
        public Builder linkName(String linkName) {
            this.linkName = linkName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-1234567890ab</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The source directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/documents</p>
         */
        public Builder sourceDir(String sourceDir) {
            this.sourceDir = sourceDir;
            return this;
        }

        /**
         * <p>The automatic synchronization interval, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder syncIntervalMinutes(Integer syncIntervalMinutes) {
            this.syncIntervalMinutes = syncIntervalMinutes;
            return this;
        }

        /**
         * <p>The status of the synchronization link.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder syncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }

        public DescribeKBSyncLinkAttributeResponseBody build() {
            return new DescribeKBSyncLinkAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKBSyncLinkAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKBSyncLinkAttributeResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeishuChatMemberStaleTtlSeconds")
        @com.aliyun.core.annotation.Validation(maximum = 2147483647)
        private Integer feishuChatMemberStaleTtlSeconds;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Config(Builder builder) {
            this.feishuChatMemberStaleTtlSeconds = builder.feishuChatMemberStaleTtlSeconds;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return feishuChatMemberStaleTtlSeconds
         */
        public Integer getFeishuChatMemberStaleTtlSeconds() {
            return this.feishuChatMemberStaleTtlSeconds;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Integer feishuChatMemberStaleTtlSeconds; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.feishuChatMemberStaleTtlSeconds = model.feishuChatMemberStaleTtlSeconds;
                this.userId = model.userId;
            } 

            /**
             * <p>The validity period of the successful snapshot of Lark group members for fallback reuse, in seconds. This parameter is returned only for FEISHU synchronization links. A value of -1 indicates that the snapshot never expires. A value of 0 indicates that snapshot fallback reuse is disabled. A positive integer indicates the maximum age of the snapshot allowed for reuse. The valid value configured for the link is returned. If no value is configured, the default value -1 is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder feishuChatMemberStaleTtlSeconds(Integer feishuChatMemberStaleTtlSeconds) {
                this.feishuChatMemberStaleTtlSeconds = feishuChatMemberStaleTtlSeconds;
                return this;
            }

            /**
             * <p>The ID of the DingTalk user who performs the operation. This parameter is returned only for DINGTALK synchronization links.</p>
             * 
             * <strong>example:</strong>
             * <p>manager123</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
