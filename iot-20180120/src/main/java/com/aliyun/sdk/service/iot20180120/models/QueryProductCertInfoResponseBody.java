// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryProductCertInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryProductCertInfoResponseBody</p>
 */
public class QueryProductCertInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ProductCertInfo")
    private ProductCertInfo productCertInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryProductCertInfoResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.productCertInfo = model.productCertInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>MissingProductKey</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>ProductKey is mandatory for this action.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The returned certificate information that includes the value of the <strong>IssueModel</strong> parameter.</p>
         */
        public Builder productCertInfo(ProductCertInfo productCertInfo) {
            this.productCertInfo = productCertInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>57b144cf-09fc-4916-a272-a62902d5b207</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryProductCertInfoResponseBody build() {
            return new QueryProductCertInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryProductCertInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProductCertInfoResponseBody</p>
     */
    public static class ProductCertInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IssueModel")
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

            private Builder() {
            } 

            private Builder(ProductCertInfo model) {
                this.issueModel = model.issueModel;
            } 

            /**
             * <p>The source from which the X.509 certificate is issued.</p>
             * <ul>
             * <li><strong>1</strong>: The X.509 certificate is issued by IoT Platform.</li>
             * <li><strong>3</strong>: The X.509 certificate is issued by a third-party platform.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
