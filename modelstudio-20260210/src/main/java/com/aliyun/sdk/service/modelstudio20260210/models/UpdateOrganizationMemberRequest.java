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
 * {@link UpdateOrganizationMemberRequest} extends {@link RequestModel}
 *
 * <p>UpdateOrganizationMemberRequest</p>
 */
public class UpdateOrganizationMemberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountIds")
    private java.util.List<String> accountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewRoleCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newRoleCode;

    private UpdateOrganizationMemberRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.newRoleCode = builder.newRoleCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOrganizationMemberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIds
     */
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return newRoleCode
     */
    public String getNewRoleCode() {
        return this.newRoleCode;
    }

    public static final class Builder extends Request.Builder<UpdateOrganizationMemberRequest, Builder> {
        private java.util.List<String> accountIds; 
        private String newRoleCode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOrganizationMemberRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.newRoleCode = request.newRoleCode;
        } 

        /**
         * AccountIds.
         */
        public Builder accountIds(java.util.List<String> accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ORG_MEMBER</p>
         */
        public Builder newRoleCode(String newRoleCode) {
            this.putQueryParameter("NewRoleCode", newRoleCode);
            this.newRoleCode = newRoleCode;
            return this;
        }

        @Override
        public UpdateOrganizationMemberRequest build() {
            return new UpdateOrganizationMemberRequest(this);
        } 

    } 

}
