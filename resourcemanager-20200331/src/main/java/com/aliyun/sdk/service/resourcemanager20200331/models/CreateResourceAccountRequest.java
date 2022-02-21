// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceAccountRequest</p>
 */
public class CreateResourceAccountRequest extends Request {
    @Query
    @NameInMap("AccountNamePrefix")
    private String accountNamePrefix;

    @Query
    @NameInMap("DisplayName")
    @Validation(required = true)
    private String displayName;

    @Query
    @NameInMap("ParentFolderId")
    private String parentFolderId;

    @Query
    @NameInMap("PayerAccountId")
    private String payerAccountId;

    private CreateResourceAccountRequest(Builder builder) {
        super(builder);
        this.accountNamePrefix = builder.accountNamePrefix;
        this.displayName = builder.displayName;
        this.parentFolderId = builder.parentFolderId;
        this.payerAccountId = builder.payerAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNamePrefix
     */
    public String getAccountNamePrefix() {
        return this.accountNamePrefix;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return parentFolderId
     */
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    /**
     * @return payerAccountId
     */
    public String getPayerAccountId() {
        return this.payerAccountId;
    }

    public static final class Builder extends Request.Builder<CreateResourceAccountRequest, Builder> {
        private String accountNamePrefix; 
        private String displayName; 
        private String parentFolderId; 
        private String payerAccountId; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceAccountRequest response) {
            super(response);
            this.accountNamePrefix = response.accountNamePrefix;
            this.displayName = response.displayName;
            this.parentFolderId = response.parentFolderId;
            this.payerAccountId = response.payerAccountId;
        } 

        /**
         * AccountNamePrefix.
         */
        public Builder accountNamePrefix(String accountNamePrefix) {
            this.putQueryParameter("AccountNamePrefix", accountNamePrefix);
            this.accountNamePrefix = accountNamePrefix;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * ParentFolderId.
         */
        public Builder parentFolderId(String parentFolderId) {
            this.putQueryParameter("ParentFolderId", parentFolderId);
            this.parentFolderId = parentFolderId;
            return this;
        }

        /**
         * PayerAccountId.
         */
        public Builder payerAccountId(String payerAccountId) {
            this.putQueryParameter("PayerAccountId", payerAccountId);
            this.payerAccountId = payerAccountId;
            return this;
        }

        @Override
        public CreateResourceAccountRequest build() {
            return new CreateResourceAccountRequest(this);
        } 

    } 

}
