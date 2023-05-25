// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSignatureRequest} extends {@link RequestModel}
 *
 * <p>DeleteSignatureRequest</p>
 */
public class DeleteSignatureRequest extends Request {
    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SignatureId")
    @Validation(required = true)
    private String signatureId;

    private DeleteSignatureRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
        this.signatureId = builder.signatureId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSignatureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return signatureId
     */
    public String getSignatureId() {
        return this.signatureId;
    }

    public static final class Builder extends Request.Builder<DeleteSignatureRequest, Builder> {
        private String securityToken; 
        private String signatureId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSignatureRequest request) {
            super(request);
            this.securityToken = request.securityToken;
            this.signatureId = request.signatureId;
        } 

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * *   This API is intended for API providers.
         * <p>
         * *   This API operation deletes an existing backend signature key.
         * *   You cannot delete a key that is bound to an API. To delete the key, you must unbind it first.
         * *   The QPS limit on this operation is 50 per user.
         */
        public Builder signatureId(String signatureId) {
            this.putQueryParameter("SignatureId", signatureId);
            this.signatureId = signatureId;
            return this;
        }

        @Override
        public DeleteSignatureRequest build() {
            return new DeleteSignatureRequest(this);
        } 

    } 

}
