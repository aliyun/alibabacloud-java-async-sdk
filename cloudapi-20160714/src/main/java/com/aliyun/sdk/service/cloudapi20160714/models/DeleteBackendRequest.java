// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteBackendRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackendRequest</p>
 */
public class DeleteBackendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendId")
    private String backendId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DeleteBackendRequest(Builder builder) {
        super(builder);
        this.backendId = builder.backendId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBackendRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backendId
     */
    public String getBackendId() {
        return this.backendId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DeleteBackendRequest, Builder> {
        private String backendId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBackendRequest request) {
            super(request);
            this.backendId = request.backendId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The ID of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>27be0dd9ebbc467b9e86c0d250d0b92e</p>
         */
        public Builder backendId(String backendId) {
            this.putQueryParameter("BackendId", backendId);
            this.backendId = backendId;
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
        public DeleteBackendRequest build() {
            return new DeleteBackendRequest(this);
        } 

    } 

}
