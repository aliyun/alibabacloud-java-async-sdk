// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnDomainConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnDomainConfigsRequest</p>
 */
public class DescribeCdnDomainConfigsRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    private String configId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("FunctionNames")
    private String functionNames;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeCdnDomainConfigsRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.domainName = builder.domainName;
        this.functionNames = builder.functionNames;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnDomainConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
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

    public static final class Builder extends Request.Builder<DescribeCdnDomainConfigsRequest, Builder> {
        private String configId; 
        private String domainName; 
        private String functionNames; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnDomainConfigsRequest request) {
            super(request);
            this.configId = request.configId;
            this.domainName = request.domainName;
            this.functionNames = request.functionNames;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * The ID of the configuration. For more information about ConfigId, see [Usage notes on ConfigId](~~388994~~).
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * The accelerated domain name. You can specify only one domain name in each request.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The names of the features. Separate multiple feature names with commas (,). For more information, see [Parameters for configuring features for domain names](~~388460~~).
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
        public DescribeCdnDomainConfigsRequest build() {
            return new DescribeCdnDomainConfigsRequest(this);
        } 

    } 

}
