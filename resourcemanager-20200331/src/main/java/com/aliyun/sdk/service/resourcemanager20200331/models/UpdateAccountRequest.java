// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAccountRequest} extends {@link RequestModel}
 *
 * <p>UpdateAccountRequest</p>
 */
public class UpdateAccountRequest extends Request {
    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    @Query
    @NameInMap("NewAccountType")
    private String newAccountType;

    @Query
    @NameInMap("NewDisplayName")
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
         * The ID of the Alibaba Cloud account that corresponds to the member.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * The new type of the member. Valid values:
         * <p>
         * 
         * *   ResourceAccount: resource account
         * *   CloudAccount: cloud account
         * 
         * >  You can configure either the `NewDisplayName` or `NewAccountType` parameter.
         */
        public Builder newAccountType(String newAccountType) {
            this.putQueryParameter("NewAccountType", newAccountType);
            this.newAccountType = newAccountType;
            return this;
        }

        /**
         * The new display name of the member.
         * <p>
         * 
         * >  You can configure either the `NewDisplayName` or `NewAccountType` parameter.
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
