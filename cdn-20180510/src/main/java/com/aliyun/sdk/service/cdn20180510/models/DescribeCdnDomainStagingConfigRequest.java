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
 * {@link DescribeCdnDomainStagingConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnDomainStagingConfigRequest</p>
 */
public class DescribeCdnDomainStagingConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionNames")
    private String functionNames;

    private DescribeCdnDomainStagingConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.functionNames = builder.functionNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnDomainStagingConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCdnDomainStagingConfigRequest, Builder> {
        private String domainName; 
        private String functionNames; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnDomainStagingConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.functionNames = request.functionNames;
        } 

        /**
         * <p>The accelerated domain name. You can specify only one domain name in each request.</p>
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
         * <p>The list of feature names. Separate multiple values with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/388460.html">A list of features</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>aliauth</p>
         */
        public Builder functionNames(String functionNames) {
            this.putQueryParameter("FunctionNames", functionNames);
            this.functionNames = functionNames;
            return this;
        }

        @Override
        public DescribeCdnDomainStagingConfigRequest build() {
            return new DescribeCdnDomainStagingConfigRequest(this);
        } 

    } 

}
