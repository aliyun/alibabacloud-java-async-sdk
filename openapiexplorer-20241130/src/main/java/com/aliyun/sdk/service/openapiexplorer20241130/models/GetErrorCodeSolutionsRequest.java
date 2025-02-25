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
         * acceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("acceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
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
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.putQueryParameter("errorMessage", errorMessage);
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * product.
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
