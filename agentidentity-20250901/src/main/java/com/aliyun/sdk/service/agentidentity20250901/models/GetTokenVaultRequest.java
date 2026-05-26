// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link GetTokenVaultRequest} extends {@link RequestModel}
 *
 * <p>GetTokenVaultRequest</p>
 */
public class GetTokenVaultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TokenVaultName")
    private String tokenVaultName;

    private GetTokenVaultRequest(Builder builder) {
        super(builder);
        this.tokenVaultName = builder.tokenVaultName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTokenVaultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tokenVaultName
     */
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

    public static final class Builder extends Request.Builder<GetTokenVaultRequest, Builder> {
        private String tokenVaultName; 

        private Builder() {
            super();
        } 

        private Builder(GetTokenVaultRequest request) {
            super(request);
            this.tokenVaultName = request.tokenVaultName;
        } 

        /**
         * TokenVaultName.
         */
        public Builder tokenVaultName(String tokenVaultName) {
            this.putBodyParameter("TokenVaultName", tokenVaultName);
            this.tokenVaultName = tokenVaultName;
            return this;
        }

        @Override
        public GetTokenVaultRequest build() {
            return new GetTokenVaultRequest(this);
        } 

    } 

}
