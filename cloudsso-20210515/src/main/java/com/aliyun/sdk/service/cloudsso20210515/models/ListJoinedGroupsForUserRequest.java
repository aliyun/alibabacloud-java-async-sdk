// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJoinedGroupsForUserRequest} extends {@link RequestModel}
 *
 * <p>ListJoinedGroupsForUserRequest</p>
 */
public class ListJoinedGroupsForUserRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("UserId")
    private String userId;

    private ListJoinedGroupsForUserRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJoinedGroupsForUserRequest create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListJoinedGroupsForUserRequest, Builder> {
        private String directoryId; 
        private Integer maxResults; 
        private String nextToken; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListJoinedGroupsForUserRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.userId = request.userId;
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
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListJoinedGroupsForUserRequest build() {
            return new ListJoinedGroupsForUserRequest(this);
        } 

    } 

}
