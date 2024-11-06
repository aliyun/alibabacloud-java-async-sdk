// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDcdnDomainStagingConfigRequest} extends {@link RequestModel}
 *
 * <p>SetDcdnDomainStagingConfigRequest</p>
 */
public class SetDcdnDomainStagingConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Functions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functions;

    private SetDcdnDomainStagingConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.functions = builder.functions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDcdnDomainStagingConfigRequest create() {
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

    public static final class Builder extends Request.Builder<SetDcdnDomainStagingConfigRequest, Builder> {
        private String domainName; 
        private String functions; 

        private Builder() {
            super();
        } 

        private Builder(SetDcdnDomainStagingConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.functions = request.functions;
        } 

        /**
         * <p>The accelerated domain name. Separate multiple accelerated domain names with commas (,).</p>
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
         * <p>The list of features. Format: <code>[{&quot;functionArgs&quot;:[{&quot;argName&quot;:&quot;parameter key&quot;,&quot;argValue&quot;:&quot;parameter value&quot;},{&quot;argName&quot;:&quot;xx&quot;,&quot;argValue&quot;:&quot;xx&quot;}],&quot;functionName&quot;: feature name&quot;}]</code></p>
         * <blockquote>
         * <p>Separate multiple parameters with commas (,).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;functionArgs&quot;:[{&quot;argName&quot;:&quot;enable&quot;,&quot;argValue&quot;:&quot;on&quot;,&quot;argName&quot;:&quot;pri&quot;,&quot;argValue&quot;:&quot;1&quot;,&quot;argName&quot;:&quot;rule&quot;,&quot;argValue&quot;:&quot;xxx&quot;}],&quot;functionName&quot;:&quot;edge_function&quot;}]</p>
         */
        public Builder functions(String functions) {
            this.putQueryParameter("Functions", functions);
            this.functions = functions;
            return this;
        }

        @Override
        public SetDcdnDomainStagingConfigRequest build() {
            return new SetDcdnDomainStagingConfigRequest(this);
        } 

    } 

}
