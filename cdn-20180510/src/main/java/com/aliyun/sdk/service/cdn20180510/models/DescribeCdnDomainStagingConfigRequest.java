// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnDomainStagingConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnDomainStagingConfigRequest</p>
 */
public class DescribeCdnDomainStagingConfigRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("FunctionNames")
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
         * The accelerated domain name. You can specify only one domain name in each request.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The list of feature names. Separate multiple values with commas (,). For more information, see [A list of features](~~388460~~).
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
