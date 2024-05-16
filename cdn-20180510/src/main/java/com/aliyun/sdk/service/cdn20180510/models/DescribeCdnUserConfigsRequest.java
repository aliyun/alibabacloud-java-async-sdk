// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnUserConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnUserConfigsRequest</p>
 */
public class DescribeCdnUserConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    private DescribeCdnUserConfigsRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnUserConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    public static final class Builder extends Request.Builder<DescribeCdnUserConfigsRequest, Builder> {
        private String functionName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnUserConfigsRequest request) {
            super(request);
            this.functionName = request.functionName;
        } 

        /**
         * The configuration that you want to query. Valid values:
         * <p>
         * 
         * *   **domain_business_control**: user configurations
         * *   **waf**: Web Application Firewall (WAF) configurations
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("FunctionName", functionName);
            this.functionName = functionName;
            return this;
        }

        @Override
        public DescribeCdnUserConfigsRequest build() {
            return new DescribeCdnUserConfigsRequest(this);
        } 

    } 

}
