// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link AddOrganizationMemberRequest} extends {@link RequestModel}
 *
 * <p>AddOrganizationMemberRequest</p>
 */
public class AddOrganizationMemberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerUacAccountId")
    private String callerUacAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgRoleCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orgRoleCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecType")
    private String specType;

    private AddOrganizationMemberRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.callerUacAccountId = builder.callerUacAccountId;
        this.namespaceId = builder.namespaceId;
        this.orgId = builder.orgId;
        this.orgRoleCode = builder.orgRoleCode;
        this.specType = builder.specType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddOrganizationMemberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return callerUacAccountId
     */
    public String getCallerUacAccountId() {
        return this.callerUacAccountId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return orgRoleCode
     */
    public String getOrgRoleCode() {
        return this.orgRoleCode;
    }

    /**
     * @return specType
     */
    public String getSpecType() {
        return this.specType;
    }

    public static final class Builder extends Request.Builder<AddOrganizationMemberRequest, Builder> {
        private String accountName; 
        private String callerUacAccountId; 
        private String namespaceId; 
        private String orgId; 
        private String orgRoleCode; 
        private String specType; 

        private Builder() {
            super();
        } 

        private Builder(AddOrganizationMemberRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.callerUacAccountId = request.callerUacAccountId;
            this.namespaceId = request.namespaceId;
            this.orgId = request.orgId;
            this.orgRoleCode = request.orgRoleCode;
            this.specType = request.specType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * CallerUacAccountId.
         */
        public Builder callerUacAccountId(String callerUacAccountId) {
            this.putQueryParameter("CallerUacAccountId", callerUacAccountId);
            this.callerUacAccountId = callerUacAccountId;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>org_123456789</p>
         */
        public Builder orgId(String orgId) {
            this.putQueryParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ORG_MEMBER</p>
         */
        public Builder orgRoleCode(String orgRoleCode) {
            this.putQueryParameter("OrgRoleCode", orgRoleCode);
            this.orgRoleCode = orgRoleCode;
            return this;
        }

        /**
         * SpecType.
         */
        public Builder specType(String specType) {
            this.putQueryParameter("SpecType", specType);
            this.specType = specType;
            return this;
        }

        @Override
        public AddOrganizationMemberRequest build() {
            return new AddOrganizationMemberRequest(this);
        } 

    } 

}
