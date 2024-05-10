// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDiagnosticsRequest} extends {@link RequestModel}
 *
 * <p>ListDiagnosticsRequest</p>
 */
public class ListDiagnosticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiagnosticKey")
    private String diagnosticKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiagnosticProduct")
    private String diagnosticProduct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListDiagnosticsRequest(Builder builder) {
        super(builder);
        this.diagnosticKey = builder.diagnosticKey;
        this.diagnosticProduct = builder.diagnosticProduct;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiagnosticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diagnosticKey
     */
    public String getDiagnosticKey() {
        return this.diagnosticKey;
    }

    /**
     * @return diagnosticProduct
     */
    public String getDiagnosticProduct() {
        return this.diagnosticProduct;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListDiagnosticsRequest, Builder> {
        private String diagnosticKey; 
        private String diagnosticProduct; 
        private String maxResults; 
        private String nextToken; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListDiagnosticsRequest request) {
            super(request);
            this.diagnosticKey = request.diagnosticKey;
            this.diagnosticProduct = request.diagnosticProduct;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.status = request.status;
        } 

        /**
         * The keyword in the diagnosis.
         */
        public Builder diagnosticKey(String diagnosticKey) {
            this.putQueryParameter("DiagnosticKey", diagnosticKey);
            this.diagnosticKey = diagnosticKey;
            return this;
        }

        /**
         * The product that is diagnosed.
         */
        public Builder diagnosticProduct(String diagnosticProduct) {
            this.putQueryParameter("DiagnosticProduct", diagnosticProduct);
            this.diagnosticProduct = diagnosticProduct;
            return this;
        }

        /**
         * The maximum number of results to be returned in a single call when NextToken is used for the query.
         * <p>
         * 
         * Valid values: 1 to 100.
         * 
         * Default value: 50.
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The diagnosis status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListDiagnosticsRequest build() {
            return new ListDiagnosticsRequest(this);
        } 

    } 

}
