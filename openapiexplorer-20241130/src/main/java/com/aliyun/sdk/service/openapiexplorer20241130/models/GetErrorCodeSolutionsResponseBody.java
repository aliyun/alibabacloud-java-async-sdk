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
 * {@link GetErrorCodeSolutionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetErrorCodeSolutionsResponseBody</p>
 */
public class GetErrorCodeSolutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("solutions")
    private java.util.List<Solutions> solutions;

    private GetErrorCodeSolutionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.solutions = builder.solutions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetErrorCodeSolutionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return solutions
     */
    public java.util.List<Solutions> getSolutions() {
        return this.solutions;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Solutions> solutions; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * solutions.
         */
        public Builder solutions(java.util.List<Solutions> solutions) {
            this.solutions = solutions;
            return this;
        }

        public GetErrorCodeSolutionsResponseBody build() {
            return new GetErrorCodeSolutionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetErrorCodeSolutionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetErrorCodeSolutionsResponseBody</p>
     */
    public static class Solutions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("productName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("solutionId")
        private String solutionId;

        private Solutions(Builder builder) {
            this.content = builder.content;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.product = builder.product;
            this.productName = builder.productName;
            this.solutionId = builder.solutionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Solutions create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
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

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return solutionId
         */
        public String getSolutionId() {
            return this.solutionId;
        }

        public static final class Builder {
            private String content; 
            private String errorCode; 
            private String errorMessage; 
            private String product; 
            private String productName; 
            private String solutionId; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * errorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * productName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * solutionId.
             */
            public Builder solutionId(String solutionId) {
                this.solutionId = solutionId;
                return this;
            }

            public Solutions build() {
                return new Solutions(this);
            } 

        } 

    }
}
