// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryProductCertInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryProductCertInfoResponseBody</p>
 */
public class QueryProductCertInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("ProductCertInfo")
    private ProductCertInfo productCertInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryProductCertInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.productCertInfo = builder.productCertInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryProductCertInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return productCertInfo
     */
    public ProductCertInfo getProductCertInfo() {
        return this.productCertInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private ProductCertInfo productCertInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * ProductCertInfo.
         */
        public Builder productCertInfo(ProductCertInfo productCertInfo) {
            this.productCertInfo = productCertInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryProductCertInfoResponseBody build() {
            return new QueryProductCertInfoResponseBody(this);
        } 

    } 

    public static class ProductCertInfo extends TeaModel {
        @NameInMap("IssueModel")
        private Integer issueModel;

        private ProductCertInfo(Builder builder) {
            this.issueModel = builder.issueModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductCertInfo create() {
            return builder().build();
        }

        /**
         * @return issueModel
         */
        public Integer getIssueModel() {
            return this.issueModel;
        }

        public static final class Builder {
            private Integer issueModel; 

            /**
             * IssueModel.
             */
            public Builder issueModel(Integer issueModel) {
                this.issueModel = issueModel;
                return this;
            }

            public ProductCertInfo build() {
                return new ProductCertInfo(this);
            } 

        } 

    }
}
