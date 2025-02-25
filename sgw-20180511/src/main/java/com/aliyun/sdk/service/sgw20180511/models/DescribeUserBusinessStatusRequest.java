// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserBusinessStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserBusinessStatusRequest</p>
 */
public class DescribeUserBusinessStatusRequest extends Request {
    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeUserBusinessStatusRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBusinessStatusRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeUserBusinessStatusRequest, Builder> {
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserBusinessStatusRequest request) {
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
        public DescribeUserBusinessStatusRequest build() {
            return new DescribeUserBusinessStatusRequest(this);
        } 

    } 

}
