// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DataAgentApplication} extends {@link TeaModel}
 *
 * <p>DataAgentApplication</p>
 */
public class DataAgentApplication extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("ApplicationExtraInfo")
    private String applicationExtraInfo;

    @com.aliyun.core.annotation.NameInMap("CreatorName")
    private String creatorName;

    @com.aliyun.core.annotation.NameInMap("CreatorUid")
    private String creatorUid;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreated")
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("MainUid")
    private String mainUid;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DataAgentApplication(Builder builder) {
        this.agentId = builder.agentId;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.applicationExtraInfo = builder.applicationExtraInfo;
        this.creatorName = builder.creatorName;
        this.creatorUid = builder.creatorUid;
        this.description = builder.description;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.mainUid = builder.mainUid;
        this.region = builder.region;
        this.sessionId = builder.sessionId;
        this.status = builder.status;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataAgentApplication create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
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
     * @return applicationExtraInfo
     */
    public String getApplicationExtraInfo() {
        return this.applicationExtraInfo;
    }

    /**
     * @return creatorName
     */
    public String getCreatorName() {
        return this.creatorName;
    }

    /**
     * @return creatorUid
     */
    public String getCreatorUid() {
        return this.creatorUid;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return mainUid
     */
    public String getMainUid() {
        return this.mainUid;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String agentId; 
        private String appId; 
        private String appName; 
        private String applicationExtraInfo; 
        private String creatorName; 
        private String creatorUid; 
        private String description; 
        private String gmtCreated; 
        private String gmtModified; 
        private String mainUid; 
        private String region; 
        private String sessionId; 
        private String status; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(DataAgentApplication model) {
            this.agentId = model.agentId;
            this.appId = model.appId;
            this.appName = model.appName;
            this.applicationExtraInfo = model.applicationExtraInfo;
            this.creatorName = model.creatorName;
            this.creatorUid = model.creatorUid;
            this.description = model.description;
            this.gmtCreated = model.gmtCreated;
            this.gmtModified = model.gmtModified;
            this.mainUid = model.mainUid;
            this.region = model.region;
            this.sessionId = model.sessionId;
            this.status = model.status;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The ID of the currently associated Data Agent.</p>
         * 
         * <strong>example:</strong>
         * <p>avgwuxxxxxxxxhldt7el9</p>
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The stable identifier of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>ac6izw6xxxxxxxxxxx3ulya0d</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app-name</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The extension information of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder applicationExtraInfo(String applicationExtraInfo) {
            this.applicationExtraInfo = applicationExtraInfo;
            return this;
        }

        /**
         * <p>The name of the application creator.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        public Builder creatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }

        /**
         * <p>The UID of the application owner.</p>
         * 
         * <strong>example:</strong>
         * <p>30031588888885853</p>
         */
        public Builder creatorUid(String creatorUid) {
            this.creatorUid = creatorUid;
            return this;
        }

        /**
         * <p>The description of the application. The description can be up to 250 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test application</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The time when the application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-12T10:40:12.000+00:00</p>
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * <p>The time when the application was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-12T10:40:12.000+00:00</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The UID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1673828888852166</p>
         */
        public Builder mainUid(String mainUid) {
            this.mainUid = mainUid;
            return this;
        }

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The ID of the current or most recently associated session.</p>
         * 
         * <strong>example:</strong>
         * <p>axc3lsxxxxxxxxxdapwe</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The status of the application. Valid values:</p>
         * <ul>
         * <li>REGISTERED</li>
         * <li>DEPLOYING</li>
         * <li>DEPLOYED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REGISTERED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>3700inkdc2y7zs0r37m5pika6</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public DataAgentApplication build() {
            return new DataAgentApplication(this);
        } 

    } 

}
