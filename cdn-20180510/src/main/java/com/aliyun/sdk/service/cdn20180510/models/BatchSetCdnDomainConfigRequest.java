// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link BatchSetCdnDomainConfigRequest} extends {@link RequestModel}
 *
 * <p>BatchSetCdnDomainConfigRequest</p>
 */
public class BatchSetCdnDomainConfigRequest extends Request {
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

    private BatchSetCdnDomainConfigRequest(Builder builder) {
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

    public static BatchSetCdnDomainConfigRequest create() {
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

    public static final class Builder extends Request.Builder<BatchSetCdnDomainConfigRequest, Builder> {
        private String domainNames; 
        private String functions; 
        private String ownerAccount; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(BatchSetCdnDomainConfigRequest request) {
            super(request);
            this.domainNames = request.domainNames;
            this.functions = request.functions;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The accelerated domain names. You can specify multiple accelerated domain names and separate them with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder domainNames(String domainNames) {
            this.putQueryParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
            return this;
        }

        /**
         * <p>The features that you want to configure. Format:</p>
         * <ul>
         * <li><strong>functionName</strong>: the name of the feature. This parameter is required. Separate multiple values with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/388460.html">Parameters for configuring features for domain names</a>.</li>
         * <li><strong>argName</strong>: the feature parameter for <strong>functionName</strong>. This parameter is required. You can specify multiple feature parameters.</li>
         * <li><strong>argValue</strong>: the parameter value that is specified for <strong>functionName</strong>. This parameter is required.</li>
         * <li><strong>parentid</strong>: the rule condition ID. This parameter is optional. You can use the <strong>condition</strong> rule engine to create a rule condition. For information, see <a href="https://help.aliyun.com/document_detail/388460.html">Parameters for configuring features for domain names</a>. A rule condition can identify parameters that are included in requests and filter requests based on the identified parameters. After you create a rule condition, a <a href="https://help.aliyun.com/document_detail/388994.html">configid</a> is generated. A configid can be used as parentId that is referenced by other features. This way, you can combine rule conditions and features for flexible configurations.</li>
         * </ul>
         * <p>If the <strong>ParentId</strong> parameter is **-1**, the existing rule conditions in the configurations are deleted.</p>
         * <pre><code class="language-[{">   &quot;functionArgs&quot;: [{
         *      &quot;argName&quot;: &quot;Parameter A&quot;, 
         *      &quot;argValue&quot;: &quot;Value of parameter A&quot;
         *     }, 
         *   {
         *     &quot;argName&quot;: &quot;Parameter B&quot;, 
         *     &quot;argValue&quot;: &quot;Value of parameter B&quot;
         *      }], 
         *  &quot;functionName&quot;: &quot;Feature name&quot;
         *  &quot;parentId&quot;: Optional. parentId corresponds to configid of the referenced rule condition
         * }]
         * </code></pre>
         * <p>The following code provides a sample configuration if <strong>parentId</strong> is not used. In this example, the <strong>origin_request_header</strong> feature is used to add back-to-origin HTTP headers, and the rule condition whose configuration ID is <strong>configid=222728944812032</strong> is referenced.</p>
         * <pre><code class="language-[{">        &quot;functionArgs&quot;: [{
         *             &quot;argName&quot;: &quot;header_operation_type&quot;,
         *             &quot;argValue&quot;: &quot;add&quot;
         *         }, {
         *             &quot;argName&quot;: &quot;header_name&quot;,
         *             &quot;argValue&quot;: &quot;Accept-Encoding&quot;
         *         }, {
         *             &quot;argName&quot;: &quot;header_value&quot;,
         *             &quot;argValue&quot;: &quot;gzip&quot;
         *         }, {
         *             &quot;argName&quot;: &quot;duplicate&quot;,
         *             &quot;argValue&quot;: &quot;off&quot;
         *         }],
         *         &quot;functionName&quot;: &quot;origin_request_header&quot;
         * }]
         * </code></pre>
         * <p>The following code shows a sample configuration if <strong>parentId</strong> is used. In this example, the <strong>origin_request_header</strong> feature is used to add back-to-origin HTTP headers, and the rule condition whose configuration ID is <strong>222728944812032</strong> is referenced.</p>
         * <pre><code class="language-[{">        &quot;functionArgs&quot;: [{
         *             &quot;argName&quot;: &quot;header_operation_type&quot;,
         *             &quot;argValue&quot;: &quot;add&quot;
         *         }, {
         *             &quot;argName&quot;: &quot;header_name&quot;,
         *             &quot;argValue&quot;: &quot;Accept-Encoding&quot;
         *         }, {
         *             &quot;argName&quot;: &quot;header_value&quot;,
         *             &quot;argValue&quot;: &quot;gzip&quot;
         *         }, {
         *             &quot;argName&quot;: &quot;duplicate&quot;,
         *             &quot;argValue&quot;: &quot;off&quot;
         *         }],
         *         &quot;functionName&quot;: &quot;origin_request_header&quot;,
         *         &quot;parentId&quot;: 222728944812032
         * }]
         * </code></pre>
         * <p>The following code provides a sample configuration that deletes the reference to <strong>parentId</strong> for a feature that uses <strong>parentId</strong>. This example shows how to delete the rule condition that has a configuration ID of <strong>222728944812032</strong> and is referenced when <strong>origin_request_header</strong> feature is used to add back-to-origin HTTP headers.</p>
         * <pre><code class="language-[{">        &quot;functionArgs&quot;: [{
         *             &quot;argName&quot;: &quot;header_operation_type&quot;,
         *             &quot;argValue&quot;: &quot;add&quot;
         *         }, {
         *             &quot;argName&quot;: &quot;header_name&quot;,
         *             &quot;argValue&quot;: &quot;Accept-Encoding&quot;
         *         }, {
         *             &quot;argName&quot;: &quot;header_value&quot;,
         *             &quot;argValue&quot;: &quot;gzip&quot;
         *         }, {
         *             &quot;argName&quot;: &quot;duplicate&quot;,
         *             &quot;argValue&quot;: &quot;off&quot;
         *         }],
         *         &quot;functionName&quot;: &quot;origin_request_header&quot;,
         *         &quot;parentId&quot;: -1
         * }]
         * </code></pre>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;functionArgs&quot;: [{&quot;argName&quot;: &quot;key&quot;,&quot;argValue&quot;: &quot;Content-Encoding&quot;},{&quot;argName&quot;: &quot;value&quot;,&quot;argValue&quot;: &quot;gzip&quot;}],&quot;functionName&quot;: &quot;set_resp_header&quot;} ]</p>
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
        public BatchSetCdnDomainConfigRequest build() {
            return new BatchSetCdnDomainConfigRequest(this);
        } 

    } 

}
