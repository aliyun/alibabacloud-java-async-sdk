// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudDriveServiceRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudDriveServiceRequest</p>
 */
public class DescribeCloudDriveServiceRequest extends Request {
    @Query
    @NameInMap("CdsIds")
    private java.util.List < String > cdsIds;

    @Query
    @NameInMap("IsTokenNeeded")
    private Boolean isTokenNeeded;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 500)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeCloudDriveServiceRequest(Builder builder) {
        super(builder);
        this.cdsIds = builder.cdsIds;
        this.isTokenNeeded = builder.isTokenNeeded;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudDriveServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsIds
     */
    public java.util.List < String > getCdsIds() {
        return this.cdsIds;
    }

    /**
     * @return isTokenNeeded
     */
    public Boolean getIsTokenNeeded() {
        return this.isTokenNeeded;
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

    public static final class Builder extends Request.Builder<DescribeCloudDriveServiceRequest, Builder> {
        private java.util.List < String > cdsIds; 
        private Boolean isTokenNeeded; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudDriveServiceRequest response) {
            super(response);
            this.cdsIds = response.cdsIds;
            this.isTokenNeeded = response.isTokenNeeded;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.regionId = response.regionId;
        } 

        /**
         * CdsIds.
         */
        public Builder cdsIds(java.util.List < String > cdsIds) {
            this.putQueryParameter("CdsIds", cdsIds);
            this.cdsIds = cdsIds;
            return this;
        }

        /**
         * IsTokenNeeded.
         */
        public Builder isTokenNeeded(Boolean isTokenNeeded) {
            this.putQueryParameter("IsTokenNeeded", isTokenNeeded);
            this.isTokenNeeded = isTokenNeeded;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeCloudDriveServiceRequest build() {
            return new DescribeCloudDriveServiceRequest(this);
        } 

    } 

}
