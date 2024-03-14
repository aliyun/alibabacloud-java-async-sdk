// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckMnsServiceRequest} extends {@link RequestModel}
 *
 * <p>CheckMnsServiceRequest</p>
 */
public class CheckMnsServiceRequest extends Request {
    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private CheckMnsServiceRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckMnsServiceRequest create() {
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

    public static final class Builder extends Request.Builder<CheckMnsServiceRequest, Builder> {
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CheckMnsServiceRequest request) {
            super(request);
            this.securityToken = request.securityToken;
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
        public CheckMnsServiceRequest build() {
            return new CheckMnsServiceRequest(this);
        } 

    } 

}
