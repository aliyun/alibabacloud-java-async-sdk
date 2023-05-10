// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceDriftStatus")
    private java.util.List < String > resourceDriftStatus;

    @Query
    @NameInMap("StackId")
    @Validation(required = true)
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

        private Builder(ListStackResourceDriftsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceDriftStatus = request.resourceDriftStatus;
            this.stackId = request.stackId;
        } 

        /**
         * The type of the resource.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The resource properties as defined in the template, in JSON format.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The time when the resource drift detection operation was initiated.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The drift status of the resource. Valid values:
         * <p>
         * 
         * *   DELETED: The actual configuration of the resource differs from its expected template configuration because the resource had been deleted.
         * *   MODIFIED: The actual configuration of the resource differs from its expected template configuration.
         * *   NOT_CHECKED: ROS has not checked whether the actual configuration of the resource differs from its expected template configuration.
         * *   IN_SYNC: The actual configuration of the resource matches its expected template configuration.
         */
        public Builder resourceDriftStatus(java.util.List < String > resourceDriftStatus) {
            this.putQueryParameter("ResourceDriftStatus", resourceDriftStatus);
            this.resourceDriftStatus = resourceDriftStatus;
            return this;
        }

        /**
         * The physical ID of the resource.
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
