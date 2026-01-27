// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
 * {@link ApproveFotaUpdateRequest} extends {@link RequestModel}
 *
 * <p>ApproveFotaUpdateRequest</p>
 */
public class ApproveFotaUpdateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetStatus")
    private String targetStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ApproveFotaUpdateRequest(Builder builder) {
        super(builder);
        this.appVersion = builder.appVersion;
        this.clientId = builder.clientId;
        this.desktopId = builder.desktopId;
        this.loginToken = builder.loginToken;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
        this.targetStatus = builder.targetStatus;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApproveFotaUpdateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return targetStatus
     */
    public String getTargetStatus() {
        return this.targetStatus;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ApproveFotaUpdateRequest, Builder> {
        private String appVersion; 
        private String clientId; 
        private String desktopId; 
        private String loginToken; 
        private String regionId; 
        private String sessionId; 
        private String targetStatus; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ApproveFotaUpdateRequest request) {
            super(request);
            this.appVersion = request.appVersion;
            this.clientId = request.clientId;
            this.desktopId = request.desktopId;
            this.loginToken = request.loginToken;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
            this.targetStatus = request.targetStatus;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The application version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1-D-20220513.14****</p>
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * <p>The client ID. The system generates a unique ID for each client.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d4452bd7-88df-4b90-a409-806da674****</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The cloud computer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-138dsptkrt00u****</p>
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The logon token.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v18390c954ce59e2915ef16663205371721e0db9a46179ac89249a203320459523cb54ad08efe324784dd0eba25950****</p>
         */
        public Builder loginToken(String loginToken) {
            this.putQueryParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4771b873-c757-4893-973c-7f5beejh****</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The state of the cloud computer after the OTA update.</p>
         * <blockquote>
         * <p> This parameter is not publicly available. After the OTA update is complete, the state of the cloud computer changes to <code>RUNNING</code>.</p>
         * </blockquote>
         * <ul>
         * <li>Set the value to running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder targetStatus(String targetStatus) {
            this.putQueryParameter("TargetStatus", targetStatus);
            this.targetStatus = targetStatus;
            return this;
        }

        /**
         * <p>The unique identifier of the client. To view the unique identifier of an Alibaba Cloud Workspace client, go to the client logon page and click on &quot;About.&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>28c80e90-f71e-4c23-93d6-1225329c****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ApproveFotaUpdateRequest build() {
            return new ApproveFotaUpdateRequest(this);
        } 

    } 

}
