// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link DeletePermissionRuleRequest} extends {@link RequestModel}
 *
 * <p>DeletePermissionRuleRequest</p>
 */
public class DeletePermissionRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("permissionRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String permissionRuleId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private DeletePermissionRuleRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.permissionRuleId = builder.permissionRuleId;
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePermissionRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return permissionRuleId
     */
    public String getPermissionRuleId() {
        return this.permissionRuleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<DeletePermissionRuleRequest, Builder> {
        private String workspaceId; 
        private String permissionRuleId; 
        private String regionId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(DeletePermissionRuleRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.permissionRuleId = request.permissionRuleId;
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1234567890</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The permission rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pr-1234567890</p>
         */
        public Builder permissionRuleId(String permissionRuleId) {
            this.putPathParameter("permissionRuleId", permissionRuleId);
            this.permissionRuleId = permissionRuleId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The client token that ensures the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public DeletePermissionRuleRequest build() {
            return new DeletePermissionRuleRequest(this);
        } 

    } 

}
