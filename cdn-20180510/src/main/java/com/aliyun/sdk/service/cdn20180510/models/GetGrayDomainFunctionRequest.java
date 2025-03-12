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
 * {@link GetGrayDomainFunctionRequest} extends {@link RequestModel}
 *
 * <p>GetGrayDomainFunctionRequest</p>
 */
public class GetGrayDomainFunctionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FunctionNames")
    private String functionNames;

    private GetGrayDomainFunctionRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.functionNames = builder.functionNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGrayDomainFunctionRequest create() {
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

    public static final class Builder extends Request.Builder<GetGrayDomainFunctionRequest, Builder> {
        private String domainName; 
        private String functionNames; 

        private Builder() {
            super();
        } 

        private Builder(GetGrayDomainFunctionRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.functionNames = request.functionNames;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * FunctionNames.
         */
        public Builder functionNames(String functionNames) {
            this.putBodyParameter("FunctionNames", functionNames);
            this.functionNames = functionNames;
            return this;
        }

        @Override
        public GetGrayDomainFunctionRequest build() {
            return new GetGrayDomainFunctionRequest(this);
        } 

    } 

}
