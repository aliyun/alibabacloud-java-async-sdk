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
 * {@link BatchSetGrayDomainFunctionRequest} extends {@link RequestModel}
 *
 * <p>BatchSetGrayDomainFunctionRequest</p>
 */
public class BatchSetGrayDomainFunctionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Configs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainNames;

    private BatchSetGrayDomainFunctionRequest(Builder builder) {
        super(builder);
        this.configs = builder.configs;
        this.domainNames = builder.domainNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSetGrayDomainFunctionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public String getConfigs() {
        return this.configs;
    }

    /**
     * @return domainNames
     */
    public String getDomainNames() {
        return this.domainNames;
    }

    public static final class Builder extends Request.Builder<BatchSetGrayDomainFunctionRequest, Builder> {
        private String configs; 
        private String domainNames; 

        private Builder() {
            super();
        } 

        private Builder(BatchSetGrayDomainFunctionRequest request) {
            super(request);
            this.configs = request.configs;
            this.domainNames = request.domainNames;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;functionArgs&quot;: [{&quot;argName&quot;: &quot;key&quot;,&quot;argValue&quot;: &quot;Content-Encoding&quot;},{&quot;argName&quot;: &quot;value&quot;,&quot;argValue&quot;: &quot;gzip&quot;}],&quot;functionName&quot;: &quot;set_resp_header&quot;} ]</p>
         */
        public Builder configs(String configs) {
            this.putBodyParameter("Configs", configs);
            this.configs = configs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com,xxx.org.com</p>
         */
        public Builder domainNames(String domainNames) {
            this.putBodyParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
            return this;
        }

        @Override
        public BatchSetGrayDomainFunctionRequest build() {
            return new BatchSetGrayDomainFunctionRequest(this);
        } 

    } 

}
