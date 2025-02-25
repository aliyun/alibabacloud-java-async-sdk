// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNisInspectionReportCheckItemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNisInspectionReportCheckItemsResponseBody</p>
 */
public class DescribeNisInspectionReportCheckItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckItemList")
    private java.util.List < CheckItemList> checkItemList;

    @com.aliyun.core.annotation.NameInMap("InspectionReportId")
    private String inspectionReportId;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNisInspectionReportCheckItemsResponseBody(Builder builder) {
        this.checkItemList = builder.checkItemList;
        this.inspectionReportId = builder.inspectionReportId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNisInspectionReportCheckItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkItemList
     */
    public java.util.List < CheckItemList> getCheckItemList() {
        return this.checkItemList;
    }

    /**
     * @return inspectionReportId
     */
    public String getInspectionReportId() {
        return this.inspectionReportId;
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

    public static final class Builder {
        private java.util.List < CheckItemList> checkItemList; 
        private String inspectionReportId; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * CheckItemList.
         */
        public Builder checkItemList(java.util.List < CheckItemList> checkItemList) {
            this.checkItemList = checkItemList;
            return this;
        }

        /**
         * InspectionReportId.
         */
        public Builder inspectionReportId(String inspectionReportId) {
            this.inspectionReportId = inspectionReportId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNisInspectionReportCheckItemsResponseBody build() {
            return new DescribeNisInspectionReportCheckItemsResponseBody(this);
        } 

    } 

    public static class CheckResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private CheckResultList(Builder builder) {
            this.count = builder.count;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckResultList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private Integer count; 
            private String riskLevel; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public CheckResultList build() {
                return new CheckResultList(this);
            } 

        } 

    }
    public static class RecommendationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Abnormality")
        private String abnormality;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private String metadata;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("RecommendationCode")
        private String recommendationCode;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private RecommendationList(Builder builder) {
            this.abnormality = builder.abnormality;
            this.metadata = builder.metadata;
            this.reason = builder.reason;
            this.recommendationCode = builder.recommendationCode;
            this.riskLevel = builder.riskLevel;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendationList create() {
            return builder().build();
        }

        /**
         * @return abnormality
         */
        public String getAbnormality() {
            return this.abnormality;
        }

        /**
         * @return metadata
         */
        public String getMetadata() {
            return this.metadata;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return recommendationCode
         */
        public String getRecommendationCode() {
            return this.recommendationCode;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String abnormality; 
            private String metadata; 
            private String reason; 
            private String recommendationCode; 
            private String riskLevel; 
            private String suggestion; 

            /**
             * Abnormality.
             */
            public Builder abnormality(String abnormality) {
                this.abnormality = abnormality;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(String metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * RecommendationCode.
             */
            public Builder recommendationCode(String recommendationCode) {
                this.recommendationCode = recommendationCode;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public RecommendationList build() {
                return new RecommendationList(this);
            } 

        } 

    }
    public static class CheckItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryCode")
        private String categoryCode;

        @com.aliyun.core.annotation.NameInMap("CheckItemCode")
        private String checkItemCode;

        @com.aliyun.core.annotation.NameInMap("CheckItemName")
        private String checkItemName;

        @com.aliyun.core.annotation.NameInMap("CheckResultList")
        private java.util.List < CheckResultList> checkResultList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RecommendationList")
        private java.util.List < RecommendationList> recommendationList;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private CheckItemList(Builder builder) {
            this.categoryCode = builder.categoryCode;
            this.checkItemCode = builder.checkItemCode;
            this.checkItemName = builder.checkItemName;
            this.checkResultList = builder.checkResultList;
            this.description = builder.description;
            this.recommendationList = builder.recommendationList;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckItemList create() {
            return builder().build();
        }

        /**
         * @return categoryCode
         */
        public String getCategoryCode() {
            return this.categoryCode;
        }

        /**
         * @return checkItemCode
         */
        public String getCheckItemCode() {
            return this.checkItemCode;
        }

        /**
         * @return checkItemName
         */
        public String getCheckItemName() {
            return this.checkItemName;
        }

        /**
         * @return checkResultList
         */
        public java.util.List < CheckResultList> getCheckResultList() {
            return this.checkResultList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return recommendationList
         */
        public java.util.List < RecommendationList> getRecommendationList() {
            return this.recommendationList;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String categoryCode; 
            private String checkItemCode; 
            private String checkItemName; 
            private java.util.List < CheckResultList> checkResultList; 
            private String description; 
            private java.util.List < RecommendationList> recommendationList; 
            private String resourceType; 

            /**
             * CategoryCode.
             */
            public Builder categoryCode(String categoryCode) {
                this.categoryCode = categoryCode;
                return this;
            }

            /**
             * CheckItemCode.
             */
            public Builder checkItemCode(String checkItemCode) {
                this.checkItemCode = checkItemCode;
                return this;
            }

            /**
             * CheckItemName.
             */
            public Builder checkItemName(String checkItemName) {
                this.checkItemName = checkItemName;
                return this;
            }

            /**
             * CheckResultList.
             */
            public Builder checkResultList(java.util.List < CheckResultList> checkResultList) {
                this.checkResultList = checkResultList;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * RecommendationList.
             */
            public Builder recommendationList(java.util.List < RecommendationList> recommendationList) {
                this.recommendationList = recommendationList;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public CheckItemList build() {
                return new CheckItemList(this);
            } 

        } 

    }
}
