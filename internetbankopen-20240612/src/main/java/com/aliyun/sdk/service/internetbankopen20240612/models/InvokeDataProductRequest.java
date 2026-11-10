// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.internetbankopen20240612.models;

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
 * {@link InvokeDataProductRequest} extends {@link RequestModel}
 *
 * <p>InvokeDataProductRequest</p>
 */
public class InvokeDataProductRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("productCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceParameters")
    private String serviceParameters;

    private InvokeDataProductRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.productCode = builder.productCode;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeDataProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return serviceParameters
     */
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public static final class Builder extends Request.Builder<InvokeDataProductRequest, Builder> {
        private String clientToken; 
        private String productCode; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(InvokeDataProductRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.productCode = request.productCode;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * productCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("productCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * serviceParameters.
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putQueryParameter("serviceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public InvokeDataProductRequest build() {
            return new InvokeDataProductRequest(this);
        } 

    } 

}
