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

    @com.aliyun.core.annotation.NameInMap("AppUrl")
    private String appUrl;

    @com.aliyun.core.annotation.NameInMap("ApplicationExtraInfo")
    private String applicationExtraInfo;

    @com.aliyun.core.annotation.NameInMap("ApplicationRevision")
    private Long applicationRevision;

    @com.aliyun.core.annotation.NameInMap("AvailabilityErrorCode")
    private String availabilityErrorCode;

    @com.aliyun.core.annotation.NameInMap("AvailabilityErrorMessage")
    private String availabilityErrorMessage;

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

    @com.aliyun.core.annotation.NameInMap("LastRequest")
    private LastRequest lastRequest;

    @com.aliyun.core.annotation.NameInMap("MainUid")
    private String mainUid;

    @com.aliyun.core.annotation.NameInMap("ObservationStale")
    private Boolean observationStale;

    @com.aliyun.core.annotation.NameInMap("Ready")
    private Boolean ready;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DataAgentApplication(Builder builder) {
        this.agentId = builder.agentId;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.appUrl = builder.appUrl;
        this.applicationExtraInfo = builder.applicationExtraInfo;
        this.applicationRevision = builder.applicationRevision;
        this.availabilityErrorCode = builder.availabilityErrorCode;
        this.availabilityErrorMessage = builder.availabilityErrorMessage;
        this.creatorName = builder.creatorName;
        this.creatorUid = builder.creatorUid;
        this.description = builder.description;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.lastRequest = builder.lastRequest;
        this.mainUid = builder.mainUid;
        this.observationStale = builder.observationStale;
        this.ready = builder.ready;
        this.region = builder.region;
        this.sessionId = builder.sessionId;
        this.status = builder.status;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
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
     * @return appUrl
     */
    public String getAppUrl() {
        return this.appUrl;
    }

    /**
     * @return applicationExtraInfo
     */
    public String getApplicationExtraInfo() {
        return this.applicationExtraInfo;
    }

    /**
     * @return applicationRevision
     */
    public Long getApplicationRevision() {
        return this.applicationRevision;
    }

    /**
     * @return availabilityErrorCode
     */
    public String getAvailabilityErrorCode() {
        return this.availabilityErrorCode;
    }

    /**
     * @return availabilityErrorMessage
     */
    public String getAvailabilityErrorMessage() {
        return this.availabilityErrorMessage;
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
     * @return lastRequest
     */
    public LastRequest getLastRequest() {
        return this.lastRequest;
    }

    /**
     * @return mainUid
     */
    public String getMainUid() {
        return this.mainUid;
    }

    /**
     * @return observationStale
     */
    public Boolean getObservationStale() {
        return this.observationStale;
    }

    /**
     * @return ready
     */
    public Boolean getReady() {
        return this.ready;
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
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
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
        private String appUrl; 
        private String applicationExtraInfo; 
        private Long applicationRevision; 
        private String availabilityErrorCode; 
        private String availabilityErrorMessage; 
        private String creatorName; 
        private String creatorUid; 
        private String description; 
        private String gmtCreated; 
        private String gmtModified; 
        private LastRequest lastRequest; 
        private String mainUid; 
        private Boolean observationStale; 
        private Boolean ready; 
        private String region; 
        private String sessionId; 
        private String status; 
        private String vSwitchId; 
        private String vpcId; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(DataAgentApplication model) {
            this.agentId = model.agentId;
            this.appId = model.appId;
            this.appName = model.appName;
            this.appUrl = model.appUrl;
            this.applicationExtraInfo = model.applicationExtraInfo;
            this.applicationRevision = model.applicationRevision;
            this.availabilityErrorCode = model.availabilityErrorCode;
            this.availabilityErrorMessage = model.availabilityErrorMessage;
            this.creatorName = model.creatorName;
            this.creatorUid = model.creatorUid;
            this.description = model.description;
            this.gmtCreated = model.gmtCreated;
            this.gmtModified = model.gmtModified;
            this.lastRequest = model.lastRequest;
            this.mainUid = model.mainUid;
            this.observationStale = model.observationStale;
            this.ready = model.ready;
            this.region = model.region;
            this.sessionId = model.sessionId;
            this.status = model.status;
            this.vSwitchId = model.vSwitchId;
            this.vpcId = model.vpcId;
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
         * <p>The access URL of the application. This URL is generated and returned as-is by RM when the deployment snapshot ready=true, and is not filtered again based on Status or ObservationStale. If not provided, this parameter is empty or omitted.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://abc123.app.pre.datapaw-app.cloud">https://abc123.app.pre.datapaw-app.cloud</a></p>
         */
        public Builder appUrl(String appUrl) {
            this.appUrl = appUrl;
            return this;
        }

        /**
         * <p>The extended information of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder applicationExtraInfo(String applicationExtraInfo) {
            this.applicationExtraInfo = applicationExtraInfo;
            return this;
        }

        /**
         * <p>The control revision number of the application. The initial value is 0. This number increments after a control request is accepted and can be passed as ExpectedRevision.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder applicationRevision(Long applicationRevision) {
            this.applicationRevision = applicationRevision;
            return this;
        }

        /**
         * <p>The error code for the current service unavailability, which is expressed separately from the error code of the most recent control request. If no error occurs, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>SCRIPT_EXIT_FAILED</p>
         */
        public Builder availabilityErrorCode(String availabilityErrorCode) {
            this.availabilityErrorCode = availabilityErrorCode;
            return this;
        }

        /**
         * <p>The summary of the cause for the current service unavailability. If no error occurs, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>stage=script, exitCode=2</p>
         */
        public Builder availabilityErrorMessage(String availabilityErrorMessage) {
            this.availabilityErrorMessage = availabilityErrorMessage;
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
         * <p>The description of the application, which can be up to 250 characters in length.</p>
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
         * <p>The most recent user control request. If no control request has been made, this parameter is empty.</p>
         */
        public Builder lastRequest(LastRequest lastRequest) {
            this.lastRequest = lastRequest;
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
         * <p>Specifies whether the runtime or service observation is missing or stale. If this parameter is set to true, the availability information may be outdated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder observationStale(Boolean observationStale) {
            this.observationStale = observationStale;
            return this;
        }

        /**
         * <p>Specifies whether the current platform service is available. This does not indicate whether the most recent control request succeeded or whether the business components are healthy.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ready(Boolean ready) {
            this.ready = ready;
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
         * <li>PREPARING</li>
         * <li>WAITING_AGREEMENT: Indicates that the system is waiting for the owner of the target workspace to sign a valid agreement. The original deployment or restart request is still being executed. After the agreement is signed, RM automatically resumes the original request.</li>
         * <li>SEALING</li>
         * <li>REVIEWING</li>
         * <li>DEPLOYING</li>
         * <li>DEPLOYED</li>
         * <li>DEPLOY_FAILED</li>
         * <li>STOPPING</li>
         * <li>STOPPED</li>
         * <li>STOP_FAILED</li>
         * <li>RECOVERING</li>
         * <li>UNAVAILABLE</li>
         * <li>DELETING</li>
         * <li>DELETE_FAILED</li>
         * <li>DELETED: The logical deletion terminal state. The application no longer appears in List or Describe operations.</li>
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
         * <p>The ID of the vSwitch used for the actual deployment of the currently running application. If no resources are currently running, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-example</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC used for the actual deployment of the currently running application. If no resources are currently running, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-example</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
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

    /**
     * 
     * {@link DataAgentApplication} extends {@link TeaModel}
     *
     * <p>DataAgentApplication</p>
     */
    public static class LastRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        private LastRequest(Builder builder) {
            this.action = builder.action;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastRequest create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public static final class Builder {
            private String action; 
            private String errorCode; 
            private String errorMessage; 

            private Builder() {
            } 

            private Builder(LastRequest model) {
                this.action = model.action;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
            } 

            /**
             * <p>The control action. Valid values:</p>
             * <ul>
             * <li>DEPLOY</li>
             * <li>STOP</li>
             * <li>RESTART</li>
             * <li>DELETE</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RESTART</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The error code for the failure of the most recent user control request. If no error occurs, this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>SCRIPT_EXIT_FAILED</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The summary of the failure cause for the most recent user control request. If no error occurs, this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>stage=script, exitCode=2</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            public LastRequest build() {
                return new LastRequest(this);
            } 

        } 

    }
}
