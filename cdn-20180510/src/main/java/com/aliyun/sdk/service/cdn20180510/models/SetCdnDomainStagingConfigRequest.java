// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetCdnDomainStagingConfigRequest} extends {@link RequestModel}
 *
 * <p>SetCdnDomainStagingConfigRequest</p>
 */
public class SetCdnDomainStagingConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Functions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functions;

    private SetCdnDomainStagingConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.functions = builder.functions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCdnDomainStagingConfigRequest create() {
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
     * @return functions
     */
    public String getFunctions() {
        return this.functions;
    }

    public static final class Builder extends Request.Builder<SetCdnDomainStagingConfigRequest, Builder> {
        private String domainName; 
        private String functions; 

        private Builder() {
            super();
        } 

        private Builder(SetCdnDomainStagingConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.functions = request.functions;
        } 

        /**
         * <p>The accelerated domain name. You can specify only one domain name.</p>
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
         * <p>The features that you want to configure. Format:</p>
         * <blockquote>
         * <ul>
         * <li><strong>functionName</strong>: The name of the feature. Separate multiple values with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/388460.html">A list of features</a>.</li>
         * <li><strong>argName</strong>: The feature parameters for <strong>functionName</strong>.</li>
         * <li><strong>argValue</strong>: The parameter values set for <strong>functionName</strong>.</li>
         * </ul>
         * </blockquote>
         * <pre><code>    [
         *      {
         *        &quot;functionArgs&quot;: [
         *         {
         *          &quot;argName&quot;: &quot;Parameter A&quot;, 
         *          &quot;argValue&quot;: &quot;Value of Parameter A&quot;
         *         }, 
         *       {
         *         &quot;argName&quot;: &quot;Parameter B&quot;, 
         *         &quot;argValue&quot;: &quot;Value of Parameter B&quot;
         *          }
         *      ], 
         *      &quot;functionName&quot;: &quot;Feature name&quot;
         *         }
         *     ]
         * </code></pre>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;functionArgs&quot;:[{&quot;argName&quot;:&quot;enable&quot;,&quot;argValue&quot;:&quot;on&quot;},{&quot;argName&quot;:&quot;pri&quot;,&quot;argValue&quot;:&quot;1&quot;},{&quot;argName&quot;:&quot;rule&quot;,&quot;argValue&quot;:&quot;xxx&quot;}],&quot;functionName&quot;:&quot;edge_function&quot;}]</p>
         */
        public Builder functions(String functions) {
            this.putQueryParameter("Functions", functions);
            this.functions = functions;
            return this;
        }

        @Override
        public SetCdnDomainStagingConfigRequest build() {
            return new SetCdnDomainStagingConfigRequest(this);
        } 

    } 

}
