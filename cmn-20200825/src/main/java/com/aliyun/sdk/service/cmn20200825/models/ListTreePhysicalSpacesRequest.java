// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTreePhysicalSpacesRequest} extends {@link RequestModel}
 *
 * <p>ListTreePhysicalSpacesRequest</p>
 */
public class ListTreePhysicalSpacesRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MaxResults")
    private String maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PhysicalSpaceIds")
    private java.util.List < String > physicalSpaceIds;

    @Query
    @NameInMap("PhysicalSpaceName")
    private String physicalSpaceName;

    @Query
    @NameInMap("Tree")
    private Boolean tree;

    private ListTreePhysicalSpacesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.physicalSpaceIds = builder.physicalSpaceIds;
        this.physicalSpaceName = builder.physicalSpaceName;
        this.tree = builder.tree;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTreePhysicalSpacesRequest create() {
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
    public String getMaxResults() {
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

    /**
     * @return tree
     */
    public Boolean getTree() {
        return this.tree;
    }

    public static final class Builder extends Request.Builder<ListTreePhysicalSpacesRequest, Builder> {
        private String instanceId; 
        private String maxResults; 
        private String nextToken; 
        private java.util.List < String > physicalSpaceIds; 
        private String physicalSpaceName; 
        private Boolean tree; 

        private Builder() {
            super();
        } 

        private Builder(ListTreePhysicalSpacesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.physicalSpaceIds = request.physicalSpaceIds;
            this.physicalSpaceName = request.physicalSpaceName;
            this.tree = request.tree;
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
        public Builder maxResults(String maxResults) {
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

        /**
         * Tree.
         */
        public Builder tree(Boolean tree) {
            this.putQueryParameter("Tree", tree);
            this.tree = tree;
            return this;
        }

        @Override
        public ListTreePhysicalSpacesRequest build() {
            return new ListTreePhysicalSpacesRequest(this);
        } 

    } 

}
