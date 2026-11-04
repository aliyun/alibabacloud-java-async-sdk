// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ResetApplicationAccountPasswordRequest} extends {@link RequestModel}
 *
 * <p>ResetApplicationAccountPasswordRequest</p>
 */
public class ResetApplicationAccountPasswordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewAccountPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newAccountPassword;

    private ResetApplicationAccountPasswordRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.applicationId = builder.applicationId;
        this.newAccountPassword = builder.newAccountPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetApplicationAccountPasswordRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return newAccountPassword
     */
    public String getNewAccountPassword() {
        return this.newAccountPassword;
    }

    public static final class Builder extends Request.Builder<ResetApplicationAccountPasswordRequest, Builder> {
        private String accountName; 
        private String applicationId; 
        private String newAccountPassword; 

        private Builder() {
            super();
        } 

        private Builder(ResetApplicationAccountPasswordRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.applicationId = request.applicationId;
            this.newAccountPassword = request.newAccountPassword;
        } 

        /**
         * <p>The account name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp_user</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-bp1abcdef1234567</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The new password.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Pw123456</p>
         */
        public Builder newAccountPassword(String newAccountPassword) {
            this.putQueryParameter("NewAccountPassword", newAccountPassword);
            this.newAccountPassword = newAccountPassword;
            return this;
        }

        @Override
        public ResetApplicationAccountPasswordRequest build() {
            return new ResetApplicationAccountPasswordRequest(this);
        } 

    } 

}
