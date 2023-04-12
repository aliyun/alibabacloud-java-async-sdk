// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveCloudAccountRequest} extends {@link RequestModel}
 *
 * <p>RemoveCloudAccountRequest</p>
 */
public class RemoveCloudAccountRequest extends Request {
    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    private RemoveCloudAccountRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveCloudAccountRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveCloudAccountRequest, Builder> {
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveCloudAccountRequest request) {
            super(request);
            this.accountId = request.accountId;
        } 

        /**
         * The Alibaba Cloud account ID of the member.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        @Override
        public RemoveCloudAccountRequest build() {
            return new RemoveCloudAccountRequest(this);
        } 

    } 

}
