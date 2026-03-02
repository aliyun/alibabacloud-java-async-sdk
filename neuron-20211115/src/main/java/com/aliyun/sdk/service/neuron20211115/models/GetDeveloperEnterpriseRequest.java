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
 * {@link GetDeveloperEnterpriseRequest} extends {@link RequestModel}
 *
 * <p>GetDeveloperEnterpriseRequest</p>
 */
public class GetDeveloperEnterpriseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("account_id")
    private String accountId;

    private GetDeveloperEnterpriseRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeveloperEnterpriseRequest create() {
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

    public static final class Builder extends Request.Builder<GetDeveloperEnterpriseRequest, Builder> {
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeveloperEnterpriseRequest request) {
            super(request);
            this.accountId = request.accountId;
        } 

        /**
         * account_id.
         */
        public Builder accountId(String accountId) {
            this.putPathParameter("account_id", accountId);
            this.accountId = accountId;
            return this;
        }

        @Override
        public GetDeveloperEnterpriseRequest build() {
            return new GetDeveloperEnterpriseRequest(this);
        } 

    } 

}
