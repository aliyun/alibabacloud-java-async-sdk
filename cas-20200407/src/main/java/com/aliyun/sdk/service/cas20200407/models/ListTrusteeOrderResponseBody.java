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
 * {@link ListTrusteeOrderResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrusteeOrderResponseBody</p>
 */
public class ListTrusteeOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TrusteeOrderList")
    private String trusteeOrderList;

    private ListTrusteeOrderResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trusteeOrderList = builder.trusteeOrderList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrusteeOrderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return trusteeOrderList
     */
    public String getTrusteeOrderList() {
        return this.trusteeOrderList;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private String trusteeOrderList; 

        private Builder() {
        } 

        private Builder(ListTrusteeOrderResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.trusteeOrderList = model.trusteeOrderList;
        } 

        /**
         * <p>The maximum number of records to return in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
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
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0068247C-A454-5FC9-93BF-C41CBB5CD19E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of orders.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of orders.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {
         *     &quot;VerifyStatus&quot;: 0,
         *     &quot;ShowRefund&quot;: false,
         *     &quot;CertificateId&quot;: 0,
         *     &quot;SourceType&quot;: &quot;buy&quot;,
         *     &quot;IsMix&quot;: false,
         *     &quot;CertType&quot;: &quot;DV&quot;,
         *     &quot;PartnerOrderId&quot;: null,
         *     &quot;ProductId&quot;: 53,
         *     &quot;StatusCode&quot;: &quot;closed&quot;,
         *     &quot;KeyProtection&quot;: &quot;UNKNOWN&quot;,
         *     &quot;BrandName&quot;: &quot;Rapid&quot;,
         *     &quot;JobStatus&quot;: &quot;editing&quot;,
         *     &quot;Month&quot;: 6,
         *     &quot;IsFree&quot;: false,
         *     &quot;DomainType&quot;: &quot;ONE&quot;,
         *     &quot;IsRefunding&quot;: false,
         *     &quot;RevokeReturnCount&quot;: false,
         *     &quot;JobId&quot;: 440231,
         *     &quot;DomainCount&quot;: 1,
         *     &quot;InstanceId&quot;: &quot;cas-ivauto-fe7kv4-15650439-renew&quot;,
         *     &quot;ProductCode&quot;: &quot;geotrust-dv-1-starter&quot;,
         *     &quot;WildDomainCount&quot;: 0,
         *     &quot;OrderId&quot;: 15652305,
         *     &quot;Algorithm&quot;: &quot;RSA&quot;,
         *     &quot;Year&quot;: 1,
         *     &quot;IsRenew&quot;: false,
         *     &quot;Domain&quot;: &quot;tw.certqa.cn&quot;,
         *     &quot;AllDomain&quot;: &quot;tw.certqa.cn&quot;,
         *     &quot;BuyDate&quot;: 1773906251000
         *   }
         * ]</p>
         */
        public Builder trusteeOrderList(String trusteeOrderList) {
            this.trusteeOrderList = trusteeOrderList;
            return this;
        }

        public ListTrusteeOrderResponseBody build() {
            return new ListTrusteeOrderResponseBody(this);
        } 

    } 

}
