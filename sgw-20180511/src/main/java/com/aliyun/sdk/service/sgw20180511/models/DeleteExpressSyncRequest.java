// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteExpressSyncRequest} extends {@link RequestModel}
 *
 * <p>DeleteExpressSyncRequest</p>
 */
public class DeleteExpressSyncRequest extends Request {
    @Query
    @NameInMap("ExpressSyncId")
    @Validation(required = true)
    private String expressSyncId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DeleteExpressSyncRequest(Builder builder) {
        super(builder);
        this.expressSyncId = builder.expressSyncId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExpressSyncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expressSyncId
     */
    public String getExpressSyncId() {
        return this.expressSyncId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DeleteExpressSyncRequest, Builder> {
        private String expressSyncId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExpressSyncRequest request) {
            super(request);
            this.expressSyncId = request.expressSyncId;
            this.securityToken = request.securityToken;
        } 

        /**
         * ExpressSyncId.
         */
        public Builder expressSyncId(String expressSyncId) {
            this.putQueryParameter("ExpressSyncId", expressSyncId);
            this.expressSyncId = expressSyncId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DeleteExpressSyncRequest build() {
            return new DeleteExpressSyncRequest(this);
        } 

    } 

}
