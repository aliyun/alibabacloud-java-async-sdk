// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableVipsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableVipsRequest</p>
 */
public class DescribeAvailableVipsRequest extends Request {
    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Vip")
    @Validation(required = true)
    private String vip;

    private DescribeAvailableVipsRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
        this.vip = builder.vip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableVipsRequest create() {
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
     * @return vip
     */
    public String getVip() {
        return this.vip;
    }

    public static final class Builder extends Request.Builder<DescribeAvailableVipsRequest, Builder> {
        private String securityToken; 
        private String vip; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableVipsRequest request) {
            super(request);
            this.securityToken = request.securityToken;
            this.vip = request.vip;
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
         * Vip.
         */
        public Builder vip(String vip) {
            this.putQueryParameter("Vip", vip);
            this.vip = vip;
            return this;
        }

        @Override
        public DescribeAvailableVipsRequest build() {
            return new DescribeAvailableVipsRequest(this);
        } 

    } 

}
