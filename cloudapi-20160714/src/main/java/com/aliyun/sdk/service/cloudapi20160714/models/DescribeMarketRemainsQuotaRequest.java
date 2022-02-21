// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMarketRemainsQuotaRequest} extends {@link RequestModel}
 *
 * <p>DescribeMarketRemainsQuotaRequest</p>
 */
public class DescribeMarketRemainsQuotaRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeMarketRemainsQuotaRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMarketRemainsQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeMarketRemainsQuotaRequest, Builder> {
        private String domainName; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMarketRemainsQuotaRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.securityToken = response.securityToken;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
        public DescribeMarketRemainsQuotaRequest build() {
            return new DescribeMarketRemainsQuotaRequest(this);
        } 

    } 

}
