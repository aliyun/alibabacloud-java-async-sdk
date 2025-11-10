// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link GetErrorCodeSolutionsRequest} extends {@link RequestModel}
 *
 * <p>GetErrorCodeSolutionsRequest</p>
 */
public class GetErrorCodeSolutionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("acceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("errorCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String errorCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("product")
    private String product;

    private GetErrorCodeSolutionsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetErrorCodeSolutionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    public static final class Builder extends Request.Builder<GetErrorCodeSolutionsRequest, Builder> {
        private String acceptLanguage; 
        private String errorCode; 
        private String errorMessage; 
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(GetErrorCodeSolutionsRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.errorCode = request.errorCode;
            this.errorMessage = request.errorMessage;
            this.product = request.product;
        } 

        /**
         * <p>The language of the solution. Valid values: zh-CN and en-US. Not all of the solutions are available in English. If you set this parameter to en-US, but the corresponding solution is actually not available in English, no response is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("acceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The error code based on which you want to query a solution.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234-56789012</p>
         */
        public Builder errorCode(String errorCode) {
            this.putQueryParameter("errorCode", errorCode);
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message for which you want to query a solution. This parameter must be configured together with the errorCode parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>An error occurred while processing your request.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.putQueryParameter("errorMessage", errorMessage);
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The product code. You can use one of the following methods to query a product code:</p>
         * <ul>
         * <li>Call the GetRequestLog operation to query a product code from the response.</li>
         * <li>Query the code of a product in the OpenAPI Explorer URL of the product. For example, the OpenAPI Explorer URL of Short Message Service (SMS) is <a href="https://api.alibabacloud.com/product/Dysmsapi">https://api.alibabacloud.com/product/Dysmsapi</a>. Therefore, the product code of SMS is Dysmsapi.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("product", product);
            this.product = product;
            return this;
        }

        @Override
        public GetErrorCodeSolutionsRequest build() {
            return new GetErrorCodeSolutionsRequest(this);
        } 

    } 

}
