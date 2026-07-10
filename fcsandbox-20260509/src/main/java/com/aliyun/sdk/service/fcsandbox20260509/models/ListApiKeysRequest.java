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
 * {@link ListApiKeysRequest} extends {@link RequestModel}
 *
 * <p>ListApiKeysRequest</p>
 */
public class ListApiKeysRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiKeyName")
    private String apiKeyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

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

    private ListApiKeysRequest(Builder builder) {
        super(builder);
        this.apiKeyName = builder.apiKeyName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupID = builder.resourceGroupID;
        this.status = builder.status;
        this.teamID = builder.teamID;
        this.userID = builder.userID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiKeysRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyName
     */
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<ListApiKeysRequest, Builder> {
        private String apiKeyName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupID; 
        private String status; 
        private String teamID; 
        private String userID; 

        private Builder() {
            super();
        } 

        private Builder(ListApiKeysRequest request) {
            super(request);
            this.apiKeyName = request.apiKeyName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupID = request.resourceGroupID;
            this.status = request.status;
            this.teamID = request.teamID;
            this.userID = request.userID;
        } 

        /**
         * apiKeyName.
         */
        public Builder apiKeyName(String apiKeyName) {
            this.putQueryParameter("apiKeyName", apiKeyName);
            this.apiKeyName = apiKeyName;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * resourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.putQueryParameter("resourceGroupID", resourceGroupID);
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * teamID.
         */
        public Builder teamID(String teamID) {
            this.putQueryParameter("teamID", teamID);
            this.teamID = teamID;
            return this;
        }

        /**
         * userID.
         */
        public Builder userID(String userID) {
            this.putQueryParameter("userID", userID);
            this.userID = userID;
            return this;
        }

        @Override
        public ListApiKeysRequest build() {
            return new ListApiKeysRequest(this);
        } 

    } 

}
