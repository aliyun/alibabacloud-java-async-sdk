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

        public CreateKBSyncLinkResponseBody build() {
            return new CreateKBSyncLinkResponseBody(this);
        } 

    } 

}
