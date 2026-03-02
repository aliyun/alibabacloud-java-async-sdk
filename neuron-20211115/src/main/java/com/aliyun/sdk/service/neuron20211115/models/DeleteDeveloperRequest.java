// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link DeleteDeveloperRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeveloperRequest</p>
 */
public class DeleteDeveloperRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("accountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    private DeleteDeveloperRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.enterpriseId = builder.enterpriseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeveloperRequest create() {
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
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public static final class Builder extends Request.Builder<DeleteDeveloperRequest, Builder> {
        private String accountId; 
        private Long enterpriseId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeveloperRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.enterpriseId = request.enterpriseId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder accountId(String accountId) {
            this.putPathParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * enterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("enterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        @Override
        public DeleteDeveloperRequest build() {
            return new DeleteDeveloperRequest(this);
        } 

    } 

}
