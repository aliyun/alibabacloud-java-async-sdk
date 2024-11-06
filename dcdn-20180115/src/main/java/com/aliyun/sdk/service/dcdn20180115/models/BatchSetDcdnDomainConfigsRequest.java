// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The accelerated domain names. Specify multiple accelerated domain names with commas (,).</p>
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
         * <p>The features that you want to configure. Format:</p>
         * <ul>
         * <li><p><strong>functionName</strong>: The name of the feature. Separate multiple values with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/410622.html">A list of features</a>.</p>
         * </li>
         * <li><p><strong>argName</strong>: The feature parameters for <strong>functionName</strong>.</p>
         * </li>
         * <li><p><strong>argValue</strong>: The parameter values set for <strong>functionName</strong>.</p>
         * </li>
         * <li><p><strong>parentid</strong>: the rule ID. This parameter is optional. You can use the <strong>condition</strong> rules engine to create a rule. For information, see <a href="https://help.aliyun.com/document_detail/388460.html">Feature settings for domain names</a>. A rule can identify parameters that are included in requests and filter requests based on the identified parameters. After you create a rule, a <a href="https://help.aliyun.com/document_detail/388994.html">configid</a> is generated. A configid can be used as parentId that is referenced by other features. This way, you can combine rules and features for flexible configurations.</p>
         * </li>
         * </ul>
         * <p>If the <strong>parentId</strong> parameter is <strong>-1</strong>, the existing rules in the configurations are deleted.</p>
         * <pre><code class="language-["> {
         *    &quot;functionArgs&quot;: [
         *     {
         *      &quot;argName&quot;: &quot;Parameter A&quot;, 
         *      &quot;argValue&quot;: Value of parameter A&quot;
         *     }, 
         *   {
         *     &quot;argName&quot;: &quot;Parameter B&quot;, 
         *     &quot;argValue&quot;: &quot;Value of Parameter B&quot;
         *      }
         *  ], 
         *  &quot;functionName&quot;: &quot;Feature name&quot;
         *     }
         * ]```
         * </code></pre>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;functionArgs&quot;:[{&quot;argName&quot;:&quot;switch&quot;,&quot;argValue&quot;:&quot;on&quot;},{&quot;argName&quot;:&quot;region&quot;,&quot;argValue&quot;:&quot;*&quot;}],&quot;functionName&quot;:&quot;ipv6&quot;}]</p>
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
