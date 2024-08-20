// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSetDcdnDomainConfigsRequest} extends {@link RequestModel}
 *
 * <p>BatchSetDcdnDomainConfigsRequest</p>
 */
public class BatchSetDcdnDomainConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Functions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private BatchSetDcdnDomainConfigsRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
        this.functions = builder.functions;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSetDcdnDomainConfigsRequest create() {
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
     * @return functions
     */
    public String getFunctions() {
        return this.functions;
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

    public static final class Builder extends Request.Builder<BatchSetDcdnDomainConfigsRequest, Builder> {
        private String domainNames; 
        private String functions; 
        private String ownerAccount; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(BatchSetDcdnDomainConfigsRequest request) {
            super(request);
            this.domainNames = request.domainNames;
            this.functions = request.functions;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * The accelerated domain names. Specify multiple accelerated domain names with commas (,).
         */
        public Builder domainNames(String domainNames) {
            this.putQueryParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
            return this;
        }

        /**
         * The features that you want to configure. Format:
         * <p>
         * 
         * *   **functionName**: The name of the feature. Separate multiple values with commas (,). For more information, see [A list of features](~~410622~~).
         * 
         * *   **argName**: The feature parameters for **functionName**.
         * *   **argValue**: The parameter values set for **functionName**.
         * *   **parentid**: the rule ID. This parameter is optional. You can use the **condition** rules engine to create a rule. For information, see [Feature settings for domain names](~~388460~~). A rule can identify parameters that are included in requests and filter requests based on the identified parameters. After you create a rule, a [configid](~~388994~~) is generated. A configid can be used as parentId that is referenced by other features. This way, you can combine rules and features for flexible configurations.
         * 
         * If the **parentId** parameter is **-1**, the existing rules in the configurations are deleted.
         * 
         * ````[
         *  {
         *    "functionArgs": [
         *     {
         *      "argName": "Parameter A", 
         *      "argValue": Value of parameter A"
         *     }, 
         *   {
         *     "argName": "Parameter B", 
         *     "argValue": "Value of Parameter B"
         *      }
         *  ], 
         *  "functionName": "Feature name"
         *     }
         * ]```
         * ````
         */
        public Builder functions(String functions) {
            this.putQueryParameter("Functions", functions);
            this.functions = functions;
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
        public BatchSetDcdnDomainConfigsRequest build() {
            return new BatchSetDcdnDomainConfigsRequest(this);
        } 

    } 

}
