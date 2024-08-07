// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSignatureRequest} extends {@link RequestModel}
 *
 * <p>DeleteSignatureRequest</p>
 */
public class DeleteSignatureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignatureId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The security token included in the WebSocket request header. The system uses this token to authenticate the request.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * The ID of the key to be deleted.
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
