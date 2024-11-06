// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRDDomainConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeRDDomainConfigRequest</p>
 */
public class DescribeRDDomainConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionName")
    private String functionName;

    private DescribeRDDomainConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.functionName = builder.functionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRDDomainConfigRequest create() {
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
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    public static final class Builder extends Request.Builder<DescribeRDDomainConfigRequest, Builder> {
        private String domainName; 
        private String functionName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRDDomainConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.functionName = request.functionName;
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
         * <p>The name of the feature. Default value: source_group.</p>
         * 
         * <strong>example:</strong>
         * <p>source_group</p>
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("FunctionName", functionName);
            this.functionName = functionName;
            return this;
        }

        @Override
        public DescribeRDDomainConfigRequest build() {
            return new DescribeRDDomainConfigRequest(this);
        } 

    } 

}
