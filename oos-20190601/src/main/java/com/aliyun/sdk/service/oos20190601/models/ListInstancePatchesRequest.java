// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancePatchesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancePatchesRequest</p>
 */
public class ListInstancePatchesRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PatchStatuses")
    private String patchStatuses;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ListInstancePatchesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.patchStatuses = builder.patchStatuses;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancePatchesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return patchStatuses
     */
    public String getPatchStatuses() {
        return this.patchStatuses;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListInstancePatchesRequest, Builder> {
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String patchStatuses; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancePatchesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.patchStatuses = request.patchStatuses;
            this.regionId = request.regionId;
        } 

        /**
         * The number of entries to return on each page.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The token that is used to retrieve the next page of results.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJDQzQ
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The token that is used to retrieve the next page of results.
         */
        public Builder patchStatuses(String patchStatuses) {
            this.putQueryParameter("PatchStatuses", patchStatuses);
            this.patchStatuses = patchStatuses;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListInstancePatchesRequest build() {
            return new ListInstancePatchesRequest(this);
        } 

    } 

}
