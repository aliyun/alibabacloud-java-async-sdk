// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainStagingConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainStagingConfigRequest</p>
 */
public class DescribeDcdnDomainStagingConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionNames;

    private DescribeDcdnDomainStagingConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.functionNames = builder.functionNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainStagingConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnDomainStagingConfigRequest, Builder> {
        private String domainName; 
        private String functionNames; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnDomainStagingConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.functionNames = request.functionNames;
        } 

        /**
         * <p>The accelerated domain name.</p>
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
         * <p>The names of the features to query. You can separate multiple features with commas (,).</p>
         * <p>This parameter is required.</p>
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
        public DescribeDcdnDomainStagingConfigRequest build() {
            return new DescribeDcdnDomainStagingConfigRequest(this);
        } 

    } 

}
