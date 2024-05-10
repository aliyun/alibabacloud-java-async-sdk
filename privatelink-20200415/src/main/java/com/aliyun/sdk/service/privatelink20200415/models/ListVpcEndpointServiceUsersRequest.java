// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointServiceUsersRequest} extends {@link RequestModel}
 *
 * <p>ListVpcEndpointServiceUsersRequest</p>
 */
public class ListVpcEndpointServiceUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation()
    private Long userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserListType")
    private String userListType;

    private ListVpcEndpointServiceUsersRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.userId = builder.userId;
        this.userListType = builder.userListType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcEndpointServiceUsersRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @return userListType
     */
    public String getUserListType() {
        return this.userListType;
    }

    public static final class Builder extends Request.Builder<ListVpcEndpointServiceUsersRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String serviceId; 
        private Long userId; 
        private String userListType; 

        private Builder() {
            super();
        } 

        private Builder(ListVpcEndpointServiceUsersRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
            this.userId = request.userId;
            this.userListType = request.userListType;
        } 

        /**
         * The number of entries to return on each page. Valid values: **1 to 50**. Default value: **50**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If this is your first request and no next requests are to be performed, you do not need to specify this parameter.
         * *   If a next request is to be performed, set the value to the value of **NextToken** that is returned from the last call.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The region ID of the endpoint service that you want to query.
         * <p>
         * 
         * You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The endpoint service ID.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account in the whitelist of the endpoint service.
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * The type of the user list in the whitelist of the endpoint service.
         */
        public Builder userListType(String userListType) {
            this.putQueryParameter("UserListType", userListType);
            this.userListType = userListType;
            return this;
        }

        @Override
        public ListVpcEndpointServiceUsersRequest build() {
            return new ListVpcEndpointServiceUsersRequest(this);
        } 

    } 

}
