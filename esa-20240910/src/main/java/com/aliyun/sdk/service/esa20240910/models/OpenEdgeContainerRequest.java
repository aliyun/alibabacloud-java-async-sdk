// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link OpenEdgeContainerRequest} extends {@link RequestModel}
 *
 * <p>OpenEdgeContainerRequest</p>
 */
public class OpenEdgeContainerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private OpenEdgeContainerRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenEdgeContainerRequest create() {
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

    public static final class Builder extends Request.Builder<OpenEdgeContainerRequest, Builder> {
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(OpenEdgeContainerRequest request) {
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
        public OpenEdgeContainerRequest build() {
            return new OpenEdgeContainerRequest(this);
        } 

    } 

}
