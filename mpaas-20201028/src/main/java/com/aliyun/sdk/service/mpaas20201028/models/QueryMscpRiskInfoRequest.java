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
 * {@link QueryMscpRiskInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryMscpRiskInfoRequest</p>
 */
public class QueryMscpRiskInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApdidToken")
    private String apdidToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerminalType")
    private String terminalType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private QueryMscpRiskInfoRequest(Builder builder) {
        super(builder);
        this.apdidToken = builder.apdidToken;
        this.appId = builder.appId;
        this.tenantId = builder.tenantId;
        this.terminalType = builder.terminalType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMscpRiskInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apdidToken
     */
    public String getApdidToken() {
        return this.apdidToken;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return terminalType
     */
    public String getTerminalType() {
        return this.terminalType;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<QueryMscpRiskInfoRequest, Builder> {
        private String apdidToken; 
        private String appId; 
        private String tenantId; 
        private String terminalType; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryMscpRiskInfoRequest request) {
            super(request);
            this.apdidToken = request.apdidToken;
            this.appId = request.appId;
            this.tenantId = request.tenantId;
            this.terminalType = request.terminalType;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>ApdidToken</p>
         * 
         * <strong>example:</strong>
         * <p>ApdidToken</p>
         */
        public Builder apdidToken(String apdidToken) {
            this.putBodyParameter("ApdidToken", apdidToken);
            this.apdidToken = apdidToken;
            return this;
        }

        /**
         * <p>AppId</p>
         * 
         * <strong>example:</strong>
         * <p>AppId</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>TenantId</p>
         * 
         * <strong>example:</strong>
         * <p>TenantId</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>TerminalType</p>
         * 
         * <strong>example:</strong>
         * <p>TerminalType</p>
         */
        public Builder terminalType(String terminalType) {
            this.putBodyParameter("TerminalType", terminalType);
            this.terminalType = terminalType;
            return this;
        }

        /**
         * <p>WorkspaceId</p>
         * 
         * <strong>example:</strong>
         * <p>WorkspaceId</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public QueryMscpRiskInfoRequest build() {
            return new QueryMscpRiskInfoRequest(this);
        } 

    } 

}
