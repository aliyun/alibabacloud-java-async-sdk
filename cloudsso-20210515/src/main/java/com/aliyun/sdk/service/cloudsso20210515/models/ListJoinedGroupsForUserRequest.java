// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListJoinedGroupsForUserRequest} extends {@link RequestModel}
 *
 * <p>ListJoinedGroupsForUserRequest</p>
 */
public class ListJoinedGroupsForUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
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
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>Valid values: 1 to 100.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
         * <p>When you call this operation for the first time, if the total number of entries to return is larger than the value of the <code>MaxResults</code> parameter, the entries are truncated. The system returns entries based on the value of the <code>MaxResults</code> parameter, and does not return the excess entries. In this case, the value of the response parameter <code>IsTruncated</code> is <code>true</code>, and the <code>NextToken</code> parameter is returned. In the next call, you can use the value of the <code>NextToken</code> parameter and maintain the settings of the other request parameters to query the excess entries. You can repeat the call until the value of <code>IsTruncated</code> becomes <code>false</code>. This way, all entries are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>u-00q8wbq42wiltcrk****</p>
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
