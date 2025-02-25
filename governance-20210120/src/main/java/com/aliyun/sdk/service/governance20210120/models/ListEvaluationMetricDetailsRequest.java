// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListEvaluationMetricDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListEvaluationMetricDetailsRequest</p>
 */
public class ListEvaluationMetricDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private Long accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListEvaluationMetricDetailsRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.id = builder.id;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEvaluationMetricDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListEvaluationMetricDetailsRequest, Builder> {
        private Long accountId; 
        private String id; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListEvaluationMetricDetailsRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.id = request.id;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The account ID of the member. This parameter takes effect only when a multi-account governance maturity check is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>103144549568****</p>
         */
        public Builder accountId(Long accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The ID of the check item.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2841889.html">ListEvaluationMetadata</a> operation to query the ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>xfyve5****</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for a single request. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAGEaXR18y1rqykZHIqRuBejOqED4S3Xne33c7zbn****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListEvaluationMetricDetailsRequest build() {
            return new ListEvaluationMetricDetailsRequest(this);
        } 

    } 

}
