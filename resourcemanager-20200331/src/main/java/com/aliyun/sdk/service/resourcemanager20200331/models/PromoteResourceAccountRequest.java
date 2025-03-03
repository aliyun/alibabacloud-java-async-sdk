// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link PromoteResourceAccountRequest} extends {@link RequestModel}
 *
 * <p>PromoteResourceAccountRequest</p>
 */
public class PromoteResourceAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    private PromoteResourceAccountRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.email = builder.email;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PromoteResourceAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    public static final class Builder extends Request.Builder<PromoteResourceAccountRequest, Builder> {
        private String accountId; 
        private String email; 

        private Builder() {
            super();
        } 

        private Builder(PromoteResourceAccountRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.email = request.email;
        } 

        /**
         * <p>The ID of the resource account you want to upgrade.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The email address used to log on to the cloud account after the upgrade.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        @Override
        public PromoteResourceAccountRequest build() {
            return new PromoteResourceAccountRequest(this);
        } 

    } 

}
