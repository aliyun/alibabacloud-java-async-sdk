// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNisInspectionReportCheckItemsRequest} extends {@link RequestModel}
 *
 * <p>DescribeNisInspectionReportCheckItemsRequest</p>
 */
public class DescribeNisInspectionReportCheckItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryCode")
    private String categoryCode;

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
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private java.util.List < String > resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private java.util.List < String > riskLevel;

    private DescribeNisInspectionReportCheckItemsRequest(Builder builder) {
        super(builder);
        this.categoryCode = builder.categoryCode;
        this.inspectionReportId = builder.inspectionReportId;
        this.language = builder.language;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceType = builder.resourceType;
        this.riskLevel = builder.riskLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNisInspectionReportCheckItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryCode
     */
    public String getCategoryCode() {
        return this.categoryCode;
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
     * @return resourceType
     */
    public java.util.List < String > getResourceType() {
        return this.resourceType;
    }

    /**
     * @return riskLevel
     */
    public java.util.List < String > getRiskLevel() {
        return this.riskLevel;
    }

    public static final class Builder extends Request.Builder<DescribeNisInspectionReportCheckItemsRequest, Builder> {
        private String categoryCode; 
        private String inspectionReportId; 
        private String language; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > resourceType; 
        private java.util.List < String > riskLevel; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNisInspectionReportCheckItemsRequest request) {
            super(request);
            this.categoryCode = request.categoryCode;
            this.inspectionReportId = request.inspectionReportId;
            this.language = request.language;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceType = request.resourceType;
            this.riskLevel = request.riskLevel;
        } 

        /**
         * CategoryCode.
         */
        public Builder categoryCode(String categoryCode) {
            this.putQueryParameter("CategoryCode", categoryCode);
            this.categoryCode = categoryCode;
            return this;
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
         * ResourceType.
         */
        public Builder resourceType(java.util.List < String > resourceType) {
            String resourceTypeShrink = shrink(resourceType, "ResourceType", "json");
            this.putQueryParameter("ResourceType", resourceTypeShrink);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * RiskLevel.
         */
        public Builder riskLevel(java.util.List < String > riskLevel) {
            String riskLevelShrink = shrink(riskLevel, "RiskLevel", "json");
            this.putQueryParameter("RiskLevel", riskLevelShrink);
            this.riskLevel = riskLevel;
            return this;
        }

        @Override
        public DescribeNisInspectionReportCheckItemsRequest build() {
            return new DescribeNisInspectionReportCheckItemsRequest(this);
        } 

    } 

}
