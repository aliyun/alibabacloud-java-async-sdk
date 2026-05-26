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
 * {@link DeleteTokenVaultRequest} extends {@link RequestModel}
 *
 * <p>DeleteTokenVaultRequest</p>
 */
public class DeleteTokenVaultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TokenVaultName")
    private String tokenVaultName;

    private DeleteTokenVaultRequest(Builder builder) {
        super(builder);
        this.tokenVaultName = builder.tokenVaultName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTokenVaultRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteTokenVaultRequest, Builder> {
        private String tokenVaultName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTokenVaultRequest request) {
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
        public DeleteTokenVaultRequest build() {
            return new DeleteTokenVaultRequest(this);
        } 

    } 

}
