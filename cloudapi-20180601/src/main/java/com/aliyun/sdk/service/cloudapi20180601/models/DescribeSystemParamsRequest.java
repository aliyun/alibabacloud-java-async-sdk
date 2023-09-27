// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSystemParamsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSystemParamsRequest</p>
 */
public class DescribeSystemParamsRequest extends Request {
    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeSystemParamsRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSystemParamsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeSystemParamsRequest, Builder> {
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSystemParamsRequest request) {
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
        public DescribeSystemParamsRequest build() {
            return new DescribeSystemParamsRequest(this);
        } 

    } 

}
