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
 * {@link CreateGrafanaWorkspaceAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateGrafanaWorkspaceAccountRequest</p>
 */
public class CreateGrafanaWorkspaceAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountNotes")
    private String accountNotes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountPassword")
    private String accountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliyunUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrafanaWorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grafanaWorkspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer orgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    @com.aliyun.core.annotation.Validation(required = true)
    private String role;

    private CreateGrafanaWorkspaceAccountRequest(Builder builder) {
        super(builder);
        this.accountNotes = builder.accountNotes;
        this.accountPassword = builder.accountPassword;
        this.aliyunLang = builder.aliyunLang;
        this.aliyunUid = builder.aliyunUid;
        this.grafanaWorkspaceId = builder.grafanaWorkspaceId;
        this.orgId = builder.orgId;
        this.regionId = builder.regionId;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGrafanaWorkspaceAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNotes
     */
    public String getAccountNotes() {
        return this.accountNotes;
    }

    /**
     * @return accountPassword
     */
    public String getAccountPassword() {
        return this.accountPassword;
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return aliyunUid
     */
    public String getAliyunUid() {
        return this.aliyunUid;
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
    public Integer getOrgId() {
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

    public static final class Builder extends Request.Builder<CreateGrafanaWorkspaceAccountRequest, Builder> {
        private String accountNotes; 
        private String accountPassword; 
        private String aliyunLang; 
        private String aliyunUid; 
        private String grafanaWorkspaceId; 
        private Integer orgId; 
        private String regionId; 
        private String role; 

        private Builder() {
            super();
        } 

        private Builder(CreateGrafanaWorkspaceAccountRequest request) {
            super(request);
            this.accountNotes = request.accountNotes;
            this.accountPassword = request.accountPassword;
            this.aliyunLang = request.aliyunLang;
            this.aliyunUid = request.aliyunUid;
            this.grafanaWorkspaceId = request.grafanaWorkspaceId;
            this.orgId = request.orgId;
            this.regionId = request.regionId;
            this.role = request.role;
        } 

        /**
         * AccountNotes.
         */
        public Builder accountNotes(String accountNotes) {
            this.putQueryParameter("AccountNotes", accountNotes);
            this.accountNotes = accountNotes;
            return this;
        }

        /**
         * AccountPassword.
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * AliyunLang.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1449570186405787</p>
         */
        public Builder aliyunUid(String aliyunUid) {
            this.putQueryParameter("AliyunUid", aliyunUid);
            this.aliyunUid = aliyunUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>grafana-cn-06f4xyxjo01</p>
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
        public Builder orgId(Integer orgId) {
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
         * <p>admin</p>
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        @Override
        public CreateGrafanaWorkspaceAccountRequest build() {
            return new CreateGrafanaWorkspaceAccountRequest(this);
        } 

    } 

}
