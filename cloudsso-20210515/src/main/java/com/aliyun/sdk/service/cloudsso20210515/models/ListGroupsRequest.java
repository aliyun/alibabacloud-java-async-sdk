// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListGroupsRequest</p>
 */
public class ListGroupsRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("Filter")
    private String filter;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ProvisionType")
    private String provisionType;

    private ListGroupsRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.filter = builder.filter;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.provisionType = builder.provisionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
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
     * @return provisionType
     */
    public String getProvisionType() {
        return this.provisionType;
    }

    public static final class Builder extends Request.Builder<ListGroupsRequest, Builder> {
        private String directoryId; 
        private String filter; 
        private Integer maxResults; 
        private String nextToken; 
        private String provisionType; 

        private Builder() {
            super();
        } 

        private Builder(ListGroupsRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.filter = request.filter;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.provisionType = request.provisionType;
        } 

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
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
         * ProvisionType.
         */
        public Builder provisionType(String provisionType) {
            this.putQueryParameter("ProvisionType", provisionType);
            this.provisionType = provisionType;
            return this;
        }

        @Override
        public ListGroupsRequest build() {
            return new ListGroupsRequest(this);
        } 

    } 

}
