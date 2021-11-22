// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder {
        private Long maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List < String > resourceDriftStatus; 
        private String stackId; 

        /**
         * <p>MaxResults.</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>NextToken.</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>ResourceDriftStatus.</p>
         */
        public Builder resourceDriftStatus(java.util.List < String > resourceDriftStatus) {
            this.putQueryParameter("ResourceDriftStatus", resourceDriftStatus);
            this.resourceDriftStatus = resourceDriftStatus;
            return this;
        }

        /**
         * <p>StackId.</p>
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        public ListStackResourceDriftsRequest build() {
            return new ListStackResourceDriftsRequest(this);
        } 

    } 

}
