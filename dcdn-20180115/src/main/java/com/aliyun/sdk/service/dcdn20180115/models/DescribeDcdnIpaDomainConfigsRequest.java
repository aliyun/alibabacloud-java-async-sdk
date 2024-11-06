// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnIpaDomainConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnIpaDomainConfigsRequest</p>
 */
public class DescribeDcdnIpaDomainConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribeDcdnIpaDomainConfigsRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.functionNames = builder.functionNames;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnIpaDomainConfigsRequest create() {
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
     * @return functionNames
     */
    public String getFunctionNames() {
        return this.functionNames;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnIpaDomainConfigsRequest, Builder> {
        private String domainName; 
        private String functionNames; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnIpaDomainConfigsRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.functionNames = request.functionNames;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The accelerated domain name. Separate multiple domain names with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The name of the feature. Set the value to protogw, which indicates IP Application Accelerator (IPA).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>protogw</p>
         */
        public Builder functionNames(String functionNames) {
            this.putQueryParameter("FunctionNames", functionNames);
            this.functionNames = functionNames;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
        public DescribeDcdnIpaDomainConfigsRequest build() {
            return new DescribeDcdnIpaDomainConfigsRequest(this);
        } 

    } 

}
