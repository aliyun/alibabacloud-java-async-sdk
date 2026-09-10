// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link ListVolumesRequest} extends {@link RequestModel}
 *
 * <p>ListVolumesRequest</p>
 */
public class ListVolumesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userID")
    private String userID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("volumeName")
    private String volumeName;

    private ListVolumesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceGroupID = builder.resourceGroupID;
        this.status = builder.status;
        this.teamID = builder.teamID;
        this.userID = builder.userID;
        this.volumeName = builder.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVolumesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return userID
     */
    public String getUserID() {
        return this.userID;
    }

    /**
     * @return volumeName
     */
    public String getVolumeName() {
        return this.volumeName;
    }

    public static final class Builder extends Request.Builder<ListVolumesRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String resourceGroupID; 
        private String status; 
        private String teamID; 
        private String userID; 
        private String volumeName; 

        private Builder() {
            super();
        } 

        private Builder(ListVolumesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceGroupID = request.resourceGroupID;
            this.status = request.status;
            this.teamID = request.teamID;
            this.userID = request.userID;
            this.volumeName = request.volumeName;
        } 

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token used to retrieve more results. You do not need to specify this parameter for the first request. For subsequent requests, use the token returned in the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>qxGrXje86XMrYQ51aJMy</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmwxqyrgwabcd</p>
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.putQueryParameter("resourceGroupID", resourceGroupID);
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * <p>The status of the volume. Valid values:</p>
         * <ul>
         * <li>CREATING</li>
         * <li>AVAILABLE</li>
         * <li>ERROR</li>
         * <li>DELETING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATING</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The unique identifier of the team.</p>
         * 
         * <strong>example:</strong>
         * <p>70d1c834-0383-58d8-97ac-5336eb91abcd</p>
         */
        public Builder teamID(String teamID) {
            this.putQueryParameter("teamID", teamID);
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The UID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>210000000</p>
         */
        public Builder userID(String userID) {
            this.putQueryParameter("userID", userID);
            this.userID = userID;
            return this;
        }

        /**
         * <p>The name of the volume. The name must be unique within a team.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace</p>
         */
        public Builder volumeName(String volumeName) {
            this.putQueryParameter("volumeName", volumeName);
            this.volumeName = volumeName;
            return this;
        }

        @Override
        public ListVolumesRequest build() {
            return new ListVolumesRequest(this);
        } 

    } 

}
