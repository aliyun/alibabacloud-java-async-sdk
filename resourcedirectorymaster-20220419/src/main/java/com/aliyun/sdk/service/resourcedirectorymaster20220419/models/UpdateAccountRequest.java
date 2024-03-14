// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("NewAccountType")
    private String newAccountType;

    @Query
    @NameInMap("NewDisplayName")
    private String newDisplayName;

    private UpdateAccountRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.dryRun = builder.dryRun;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
        private Boolean dryRun; 
        private String newAccountType; 
        private String newDisplayName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAccountRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.dryRun = request.dryRun;
            this.newAccountType = request.newAccountType;
            this.newDisplayName = request.newDisplayName;
        } 

        /**
         * The Alibaba Cloud account ID of the member.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The new type of the member. Valid values:
         * <p>
         * 
         * *   ResourceAccount: resource account
         * *   CloudAccount: cloud account
         * 
         * > You can specify either `NewDisplayName` or `NewAccountType`.
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
         * > You can specify either `NewDisplayName` or `NewAccountType`.
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
