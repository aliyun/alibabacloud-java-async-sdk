// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNisInspectionRecommendationResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeNisInspectionRecommendationResourcesRequest</p>
 */
public class DescribeNisInspectionRecommendationResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InspectionReportId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String inspectionReportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecommendationCode")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String recommendationCode;

    private DescribeNisInspectionRecommendationResourcesRequest(Builder builder) {
        super(builder);
        this.inspectionReportId = builder.inspectionReportId;
        this.language = builder.language;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.recommendationCode = builder.recommendationCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNisInspectionRecommendationResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inspectionReportId
     */
    public String getInspectionReportId() {
        return this.inspectionReportId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
     * @return recommendationCode
     */
    public String getRecommendationCode() {
        return this.recommendationCode;
    }

    public static final class Builder extends Request.Builder<DescribeNisInspectionRecommendationResourcesRequest, Builder> {
        private String inspectionReportId; 
        private String language; 
        private Integer maxResults; 
        private String nextToken; 
        private String recommendationCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNisInspectionRecommendationResourcesRequest request) {
            super(request);
            this.inspectionReportId = request.inspectionReportId;
            this.language = request.language;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.recommendationCode = request.recommendationCode;
        } 

        /**
         * InspectionReportId.
         */
        public Builder inspectionReportId(String inspectionReportId) {
            this.putQueryParameter("InspectionReportId", inspectionReportId);
            this.inspectionReportId = inspectionReportId;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RecommendationCode.
         */
        public Builder recommendationCode(String recommendationCode) {
            this.putQueryParameter("RecommendationCode", recommendationCode);
            this.recommendationCode = recommendationCode;
            return this;
        }

        @Override
        public DescribeNisInspectionRecommendationResourcesRequest build() {
            return new DescribeNisInspectionRecommendationResourcesRequest(this);
        } 

    } 

}
