// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchDeleteCdnDomainConfigRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteCdnDomainConfigRequest</p>
 */
public class BatchDeleteCdnDomainConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private BatchDeleteCdnDomainConfigRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
        this.functionNames = builder.functionNames;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteCdnDomainConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNames
     */
    public String getDomainNames() {
        return this.domainNames;
    }

    /**
     * @return functionNames
     */
    public String getFunctionNames() {
        return this.functionNames;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
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

    public static final class Builder extends Request.Builder<BatchDeleteCdnDomainConfigRequest, Builder> {
        private String domainNames; 
        private String functionNames; 
        private String ownerAccount; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteCdnDomainConfigRequest request) {
            super(request);
            this.domainNames = request.domainNames;
            this.functionNames = request.functionNames;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The accelerated domain names whose configurations you want to delete. Separate multiple accelerated domain names with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com,example.org</p>
         */
        public Builder domainNames(String domainNames) {
            this.putQueryParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
            return this;
        }

        /**
         * <p>The names of the features that you want to delete. Separate multiple feature names with commas (,). For more information about feature names, see <a href="https://help.aliyun.com/document_detail/388460.html">Parameters for configuring features for domain names</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>referer_white_list_set,https_force</p>
         */
        public Builder functionNames(String functionNames) {
            this.putQueryParameter("FunctionNames", functionNames);
            this.functionNames = functionNames;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
        public BatchDeleteCdnDomainConfigRequest build() {
            return new BatchDeleteCdnDomainConfigRequest(this);
        } 

    } 

}
