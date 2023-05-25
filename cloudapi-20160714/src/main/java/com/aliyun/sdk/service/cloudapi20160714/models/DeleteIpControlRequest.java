// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIpControlRequest} extends {@link RequestModel}
 *
 * <p>DeleteIpControlRequest</p>
 */
public class DeleteIpControlRequest extends Request {
    @Query
    @NameInMap("IpControlId")
    @Validation(required = true)
    private String ipControlId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DeleteIpControlRequest(Builder builder) {
        super(builder);
        this.ipControlId = builder.ipControlId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIpControlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipControlId
     */
    public String getIpControlId() {
        return this.ipControlId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DeleteIpControlRequest, Builder> {
        private String ipControlId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIpControlRequest request) {
            super(request);
            this.ipControlId = request.ipControlId;
            this.securityToken = request.securityToken;
        } 

        /**
         * *   This operation is intended for API providers.
         * <p>
         * *   If the ACL is bound to an API, you must unbind the ACL from the API before you can delete the ACL. Otherwise, an error is returned.
         * *   If you call this operation on an ACL that does not exist, a success message is returned.
         */
        public Builder ipControlId(String ipControlId) {
            this.putQueryParameter("IpControlId", ipControlId);
            this.ipControlId = ipControlId;
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
        public DeleteIpControlRequest build() {
            return new DeleteIpControlRequest(this);
        } 

    } 

}
