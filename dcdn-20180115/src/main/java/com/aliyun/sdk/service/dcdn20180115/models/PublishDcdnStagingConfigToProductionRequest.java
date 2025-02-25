// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PublishDcdnStagingConfigToProductionRequest} extends {@link RequestModel}
 *
 * <p>PublishDcdnStagingConfigToProductionRequest</p>
 */
public class PublishDcdnStagingConfigToProductionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    private PublishDcdnStagingConfigToProductionRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.functionName = builder.functionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishDcdnStagingConfigToProductionRequest create() {
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

    public static final class Builder extends Request.Builder<PublishDcdnStagingConfigToProductionRequest, Builder> {
        private String domainName; 
        private String functionName; 

        private Builder() {
            super();
        } 

        private Builder(PublishDcdnStagingConfigToProductionRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.functionName = request.functionName;
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
         * <p>The name of the feature.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliauth</p>
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("FunctionName", functionName);
            this.functionName = functionName;
            return this;
        }

        @Override
        public PublishDcdnStagingConfigToProductionRequest build() {
            return new PublishDcdnStagingConfigToProductionRequest(this);
        } 

    } 

}
