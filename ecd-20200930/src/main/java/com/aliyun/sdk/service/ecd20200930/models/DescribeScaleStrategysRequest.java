// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScaleStrategysRequest} extends {@link RequestModel}
 *
 * <p>DescribeScaleStrategysRequest</p>
 */
public class DescribeScaleStrategysRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ScaleStrategyName")
    private String scaleStrategyName;

    private DescribeScaleStrategysRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.scaleStrategyName = builder.scaleStrategyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScaleStrategysRequest create() {
        return builder().build();
    }

    @Override
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scaleStrategyName
     */
    public String getScaleStrategyName() {
        return this.scaleStrategyName;
    }

    public static final class Builder extends Request.Builder<DescribeScaleStrategysRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String scaleStrategyName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScaleStrategysRequest response) {
            super(response);
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.regionId = response.regionId;
            this.scaleStrategyName = response.scaleStrategyName;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ScaleStrategyName.
         */
        public Builder scaleStrategyName(String scaleStrategyName) {
            this.putQueryParameter("ScaleStrategyName", scaleStrategyName);
            this.scaleStrategyName = scaleStrategyName;
            return this;
        }

        @Override
        public DescribeScaleStrategysRequest build() {
            return new DescribeScaleStrategysRequest(this);
        } 

    } 

}
