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
 * {@link QueryUserInfoToMsenceRequest} extends {@link RequestModel}
 *
 * <p>QueryUserInfoToMsenceRequest</p>
 */
public class QueryUserInfoToMsenceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthToken")
    private String authToken;

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

    private QueryUserInfoToMsenceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.authToken = builder.authToken;
        this.miniProgramId = builder.miniProgramId;
        this.platformId = builder.platformId;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserInfoToMsenceRequest create() {
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
     * @return authToken
     */
    public String getAuthToken() {
        return this.authToken;
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

    public static final class Builder extends Request.Builder<QueryUserInfoToMsenceRequest, Builder> {
        private String appId; 
        private String authToken; 
        private String miniProgramId; 
        private String platformId; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryUserInfoToMsenceRequest request) {
            super(request);
            this.appId = request.appId;
            this.authToken = request.authToken;
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
         * AuthToken.
         */
        public Builder authToken(String authToken) {
            this.putBodyParameter("AuthToken", authToken);
            this.authToken = authToken;
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
        public QueryUserInfoToMsenceRequest build() {
            return new QueryUserInfoToMsenceRequest(this);
        } 

    } 

}
