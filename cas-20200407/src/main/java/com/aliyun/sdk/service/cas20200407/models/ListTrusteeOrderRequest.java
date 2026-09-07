// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link ListTrusteeOrderRequest} extends {@link RequestModel}
 *
 * <p>ListTrusteeOrderRequest</p>
 */
public class ListTrusteeOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private Long certificateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    private ListTrusteeOrderRequest(Builder builder) {
        super(builder);
        this.certificateId = builder.certificateId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrusteeOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateId
     */
    public Long getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    public static final class Builder extends Request.Builder<ListTrusteeOrderRequest, Builder> {
        private Long certificateId; 
        private Integer maxResults; 
        private String nextToken; 
        private Long orderId; 

        private Builder() {
            super();
        } 

        private Builder(ListTrusteeOrderRequest request) {
            super(request);
            this.certificateId = request.certificateId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderId = request.orderId;
        } 

        /**
         * <p>The certificate ID. You must specify either CertificateId or OrderId. Both cannot be empty at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>23787679</p>
         */
        public Builder certificateId(Long certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * <p>The maximum number of records to return in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query. If NextToken is empty, no more results are available.</p>
         * 
         * <strong>example:</strong>
         * <p>1d2db86sca4384811e0b5e8707e68181f</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The order ID. You must specify either CertificateId or OrderId. Both cannot be empty at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>14933279</p>
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public ListTrusteeOrderRequest build() {
            return new ListTrusteeOrderRequest(this);
        } 

    } 

}
