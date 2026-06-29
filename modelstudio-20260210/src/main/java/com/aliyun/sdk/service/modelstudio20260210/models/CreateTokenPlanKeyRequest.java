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
 * {@link CreateTokenPlanKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateTokenPlanKeyRequest</p>
 */
public class CreateTokenPlanKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    private CreateTokenPlanKeyRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTokenPlanKeyRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<CreateTokenPlanKeyRequest, Builder> {
        private String accountId; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(CreateTokenPlanKeyRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.description = request.description;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acc_123456789</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        @Override
        public CreateTokenPlanKeyRequest build() {
            return new CreateTokenPlanKeyRequest(this);
        } 

    } 

}
