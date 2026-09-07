// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link UpdateGrafanaWorkspaceAccountRoleRequest} extends {@link RequestModel}
 *
 * <p>UpdateGrafanaWorkspaceAccountRoleRequest</p>
 */
public class UpdateGrafanaWorkspaceAccountRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrafanaWorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grafanaWorkspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    @com.aliyun.core.annotation.Validation(required = true)
    private String role;

    private UpdateGrafanaWorkspaceAccountRoleRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.grafanaWorkspaceId = builder.grafanaWorkspaceId;
        this.orgId = builder.orgId;
        this.regionId = builder.regionId;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGrafanaWorkspaceAccountRoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return grafanaWorkspaceId
     */
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    /**
     * @return orgId
     */
    public Long getOrgId() {
        return this.orgId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    public static final class Builder extends Request.Builder<UpdateGrafanaWorkspaceAccountRoleRequest, Builder> {
        private Long accountId; 
        private String grafanaWorkspaceId; 
        private Long orgId; 
        private String regionId; 
        private String role; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGrafanaWorkspaceAccountRoleRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.grafanaWorkspaceId = request.grafanaWorkspaceId;
            this.orgId = request.orgId;
            this.regionId = request.regionId;
            this.role = request.role;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1035730062732547</p>
         */
        public Builder accountId(Long accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>grafana-cn-ipp4v54ms01</p>
         */
        public Builder grafanaWorkspaceId(String grafanaWorkspaceId) {
            this.putQueryParameter("GrafanaWorkspaceId", grafanaWorkspaceId);
            this.grafanaWorkspaceId = grafanaWorkspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder orgId(Long orgId) {
            this.putQueryParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Admin</p>
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        @Override
        public UpdateGrafanaWorkspaceAccountRoleRequest build() {
            return new UpdateGrafanaWorkspaceAccountRoleRequest(this);
        } 

    } 

}
