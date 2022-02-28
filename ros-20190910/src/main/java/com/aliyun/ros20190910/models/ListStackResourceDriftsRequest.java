// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackResourceDriftsRequest} extends {@link RequestModel}
 *
 * <p>ListStackResourceDriftsRequest</p>
 */
public class ListStackResourceDriftsRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceDriftStatus")
    private java.util.List < String > resourceDriftStatus;

    @Query
    @NameInMap("StackId")
    private String stackId;

    private ListStackResourceDriftsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceDriftStatus = builder.resourceDriftStatus;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackResourceDriftsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
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
     * @return resourceDriftStatus
     */
    public java.util.List < String > getResourceDriftStatus() {
        return this.resourceDriftStatus;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder extends Request.Builder<ListStackResourceDriftsRequest, Builder> {
        private Long maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List < String > resourceDriftStatus; 
        private String stackId; 

        private Builder() {
            super();
        } 

        private Builder(ListStackResourceDriftsRequest response) {
            super(response);
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.regionId = response.regionId;
            this.resourceDriftStatus = response.resourceDriftStatus;
            this.stackId = response.stackId;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
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
         * ResourceDriftStatus.
         */
        public Builder resourceDriftStatus(java.util.List < String > resourceDriftStatus) {
            this.putQueryParameter("ResourceDriftStatus", resourceDriftStatus);
            this.resourceDriftStatus = resourceDriftStatus;
            return this;
        }

        /**
         * StackId.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        @Override
        public ListStackResourceDriftsRequest build() {
            return new ListStackResourceDriftsRequest(this);
        } 

    } 

}
