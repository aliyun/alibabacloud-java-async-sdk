// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceCoverageDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceCoverageDetailRequest</p>
 */
public class DescribeResourceCoverageDetailRequest extends Request {
    @Query
    @NameInMap("BillOwnerId")
    @Validation()
    private Long billOwnerId;

    @Query
    @NameInMap("EndPeriod")
    private String endPeriod;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PeriodType")
    @Validation(required = true)
    private String periodType;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("StartPeriod")
    @Validation(required = true)
    private String startPeriod;

    private DescribeResourceCoverageDetailRequest(Builder builder) {
        super(builder);
        this.billOwnerId = builder.billOwnerId;
        this.endPeriod = builder.endPeriod;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.periodType = builder.periodType;
        this.resourceType = builder.resourceType;
        this.startPeriod = builder.startPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceCoverageDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billOwnerId
     */
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    /**
     * @return endPeriod
     */
    public String getEndPeriod() {
        return this.endPeriod;
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
     * @return periodType
     */
    public String getPeriodType() {
        return this.periodType;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return startPeriod
     */
    public String getStartPeriod() {
        return this.startPeriod;
    }

    public static final class Builder extends Request.Builder<DescribeResourceCoverageDetailRequest, Builder> {
        private Long billOwnerId; 
        private String endPeriod; 
        private Integer maxResults; 
        private String nextToken; 
        private String periodType; 
        private String resourceType; 
        private String startPeriod; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceCoverageDetailRequest request) {
            super(request);
            this.billOwnerId = request.billOwnerId;
            this.endPeriod = request.endPeriod;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.periodType = request.periodType;
            this.resourceType = request.resourceType;
            this.startPeriod = request.startPeriod;
        } 

        /**
         * BillOwnerId.
         */
        public Builder billOwnerId(Long billOwnerId) {
            this.putQueryParameter("BillOwnerId", billOwnerId);
            this.billOwnerId = billOwnerId;
            return this;
        }

        /**
         * EndPeriod.
         */
        public Builder endPeriod(String endPeriod) {
            this.putQueryParameter("EndPeriod", endPeriod);
            this.endPeriod = endPeriod;
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
         * PeriodType.
         */
        public Builder periodType(String periodType) {
            this.putQueryParameter("PeriodType", periodType);
            this.periodType = periodType;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * StartPeriod.
         */
        public Builder startPeriod(String startPeriod) {
            this.putQueryParameter("StartPeriod", startPeriod);
            this.startPeriod = startPeriod;
            return this;
        }

        @Override
        public DescribeResourceCoverageDetailRequest build() {
            return new DescribeResourceCoverageDetailRequest(this);
        } 

    } 

}
