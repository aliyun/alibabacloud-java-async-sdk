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
 * {@link UpdateAccountRequest} extends {@link RequestModel}
 *
 * <p>UpdateAccountRequest</p>
 */
public class UpdateAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewAccountType")
    private String newAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDisplayName")
    private String newDisplayName;

    private UpdateAccountRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.newAccountType = builder.newAccountType;
        this.newDisplayName = builder.newDisplayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAccountRequest create() {
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
     * @return newAccountType
     */
    public String getNewAccountType() {
        return this.newAccountType;
    }

    /**
     * @return newDisplayName
     */
    public String getNewDisplayName() {
        return this.newDisplayName;
    }

    public static final class Builder extends Request.Builder<UpdateAccountRequest, Builder> {
        private String accountId; 
        private String newAccountType; 
        private String newDisplayName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAccountRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.newAccountType = request.newAccountType;
            this.newDisplayName = request.newDisplayName;
        } 

        /**
         * <p>The ID of the Alibaba Cloud account that corresponds to the member.</p>
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
         * <p>The new type of the member. Valid values:</p>
         * <ul>
         * <li>ResourceAccount: resource account</li>
         * <li>CloudAccount: cloud account</li>
         * </ul>
         * <blockquote>
         * <p> You can configure either the <code>NewDisplayName</code> or <code>NewAccountType</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ResourceAccount</p>
         */
        public Builder newAccountType(String newAccountType) {
            this.putQueryParameter("NewAccountType", newAccountType);
            this.newAccountType = newAccountType;
            return this;
        }

        /**
         * <p>The new display name of the member.</p>
         * <blockquote>
         * <p> You can configure either the <code>NewDisplayName</code> or <code>NewAccountType</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder newDisplayName(String newDisplayName) {
            this.putQueryParameter("NewDisplayName", newDisplayName);
            this.newDisplayName = newDisplayName;
            return this;
        }

        @Override
        public UpdateAccountRequest build() {
            return new UpdateAccountRequest(this);
        } 

    } 

}
