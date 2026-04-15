// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link GetAuthTokenToMsenceRequest} extends {@link RequestModel}
 *
 * <p>GetAuthTokenToMsenceRequest</p>
 */
public class GetAuthTokenToMsenceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    private String authCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MiniProgramId")
    private String miniProgramId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlatformId")
    private String platformId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetAuthTokenToMsenceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.authCode = builder.authCode;
        this.miniProgramId = builder.miniProgramId;
        this.platformId = builder.platformId;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthTokenToMsenceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return authCode
     */
    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * @return miniProgramId
     */
    public String getMiniProgramId() {
        return this.miniProgramId;
    }

    /**
     * @return platformId
     */
    public String getPlatformId() {
        return this.platformId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetAuthTokenToMsenceRequest, Builder> {
        private String appId; 
        private String authCode; 
        private String miniProgramId; 
        private String platformId; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetAuthTokenToMsenceRequest request) {
            super(request);
            this.appId = request.appId;
            this.authCode = request.authCode;
            this.miniProgramId = request.miniProgramId;
            this.platformId = request.platformId;
            this.tenantId = request.tenantId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AuthCode.
         */
        public Builder authCode(String authCode) {
            this.putBodyParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * MiniProgramId.
         */
        public Builder miniProgramId(String miniProgramId) {
            this.putBodyParameter("MiniProgramId", miniProgramId);
            this.miniProgramId = miniProgramId;
            return this;
        }

        /**
         * PlatformId.
         */
        public Builder platformId(String platformId) {
            this.putBodyParameter("PlatformId", platformId);
            this.platformId = platformId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetAuthTokenToMsenceRequest build() {
            return new GetAuthTokenToMsenceRequest(this);
        } 

    } 

}
