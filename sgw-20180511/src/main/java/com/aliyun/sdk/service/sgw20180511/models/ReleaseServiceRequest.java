// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseServiceRequest} extends {@link RequestModel}
 *
 * <p>ReleaseServiceRequest</p>
 */
public class ReleaseServiceRequest extends Request {
    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ReleaseServiceRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseServiceRequest create() {
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

    public static final class Builder extends Request.Builder<ReleaseServiceRequest, Builder> {
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseServiceRequest request) {
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
        public ReleaseServiceRequest build() {
            return new ReleaseServiceRequest(this);
        } 

    } 

}
