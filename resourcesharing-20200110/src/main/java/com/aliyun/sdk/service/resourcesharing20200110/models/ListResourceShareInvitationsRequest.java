// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListResourceShareInvitationsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceShareInvitationsRequest</p>
 */
public class ListResourceShareInvitationsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceShareIds")
    private java.util.List < String > resourceShareIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceShareInvitationIds")
    private java.util.List < String > resourceShareInvitationIds;

    private ListResourceShareInvitationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceShareIds = builder.resourceShareIds;
        this.resourceShareInvitationIds = builder.resourceShareInvitationIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceShareInvitationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return resourceShareIds
     */
    public java.util.List < String > getResourceShareIds() {
        return this.resourceShareIds;
    }

    /**
     * @return resourceShareInvitationIds
     */
    public java.util.List < String > getResourceShareInvitationIds() {
        return this.resourceShareInvitationIds;
    }

    public static final class Builder extends Request.Builder<ListResourceShareInvitationsRequest, Builder> {
        private String regionId; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > resourceShareIds; 
        private java.util.List < String > resourceShareInvitationIds; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceShareInvitationsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceShareIds = request.resourceShareIds;
            this.resourceShareInvitationIds = request.resourceShareInvitationIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for a single request.</p>
         * <p>Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The IDs of the resource shares.</p>
         */
        public Builder resourceShareIds(java.util.List < String > resourceShareIds) {
            this.putQueryParameter("ResourceShareIds", resourceShareIds);
            this.resourceShareIds = resourceShareIds;
            return this;
        }

        /**
         * <p>The IDs of the resource sharing invitations.</p>
         */
        public Builder resourceShareInvitationIds(java.util.List < String > resourceShareInvitationIds) {
            this.putQueryParameter("ResourceShareInvitationIds", resourceShareInvitationIds);
            this.resourceShareInvitationIds = resourceShareInvitationIds;
            return this;
        }

        @Override
        public ListResourceShareInvitationsRequest build() {
            return new ListResourceShareInvitationsRequest(this);
        } 

    } 

}
