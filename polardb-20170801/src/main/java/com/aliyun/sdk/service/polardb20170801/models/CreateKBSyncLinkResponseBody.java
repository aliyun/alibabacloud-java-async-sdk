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
 * {@link CreateKBSyncLinkResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKBSyncLinkResponseBody</p>
 */
public class CreateKBSyncLinkResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceDir")
    private String sourceDir;

    @com.aliyun.core.annotation.NameInMap("SyncIntervalMinutes")
    private Integer syncIntervalMinutes;

    @com.aliyun.core.annotation.NameInMap("SyncStatus")
    private String syncStatus;

    private CreateKBSyncLinkResponseBody(Builder builder) {
        this.clientId = builder.clientId;
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

    public static CreateKBSyncLinkResponseBody create() {
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

        private Builder(CreateKBSyncLinkResponseBody model) {
            this.clientId = model.clientId;
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
         * <p>2026-08-14T05:58:42Z</p>
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
         * <p>The source channel of the synchronization link. Valid values:</p>
         * <ul>
         * <li>FEISHU </li>
         * <li>SHAREPOINT</li>
         * </ul>
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
         * <p>pkbl-xxxxxx</p>
         */
        public Builder linkId(String linkId) {
            this.linkId = linkId;
            return this;
        }

        /**
         * <p>The name of the synchronization link.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder linkName(String linkName) {
            this.linkName = linkName;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * <p>CREATING</p>
         */
        public Builder syncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }

        public CreateKBSyncLinkResponseBody build() {
            return new CreateKBSyncLinkResponseBody(this);
        } 

    } 

}
