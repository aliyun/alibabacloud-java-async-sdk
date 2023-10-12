// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPhysicalSpacesRequest} extends {@link RequestModel}
 *
 * <p>ListPhysicalSpacesRequest</p>
 */
public class ListPhysicalSpacesRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 1000, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PhysicalSpaceIds")
    private java.util.List < String > physicalSpaceIds;

    @Query
    @NameInMap("PhysicalSpaceName")
    private String physicalSpaceName;

    private ListPhysicalSpacesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.physicalSpaceIds = builder.physicalSpaceIds;
        this.physicalSpaceName = builder.physicalSpaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPhysicalSpacesRequest create() {
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
     * @return physicalSpaceIds
     */
    public java.util.List < String > getPhysicalSpaceIds() {
        return this.physicalSpaceIds;
    }

    /**
     * @return physicalSpaceName
     */
    public String getPhysicalSpaceName() {
        return this.physicalSpaceName;
    }

    public static final class Builder extends Request.Builder<ListPhysicalSpacesRequest, Builder> {
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > physicalSpaceIds; 
        private String physicalSpaceName; 

        private Builder() {
            super();
        } 

        private Builder(ListPhysicalSpacesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.physicalSpaceIds = request.physicalSpaceIds;
            this.physicalSpaceName = request.physicalSpaceName;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * PhysicalSpaceIds.
         */
        public Builder physicalSpaceIds(java.util.List < String > physicalSpaceIds) {
            String physicalSpaceIdsShrink = shrink(physicalSpaceIds, "PhysicalSpaceIds", "json");
            this.putQueryParameter("PhysicalSpaceIds", physicalSpaceIdsShrink);
            this.physicalSpaceIds = physicalSpaceIds;
            return this;
        }

        /**
         * PhysicalSpaceName.
         */
        public Builder physicalSpaceName(String physicalSpaceName) {
            this.putQueryParameter("PhysicalSpaceName", physicalSpaceName);
            this.physicalSpaceName = physicalSpaceName;
            return this;
        }

        @Override
        public ListPhysicalSpacesRequest build() {
            return new ListPhysicalSpacesRequest(this);
        } 

    } 

}
