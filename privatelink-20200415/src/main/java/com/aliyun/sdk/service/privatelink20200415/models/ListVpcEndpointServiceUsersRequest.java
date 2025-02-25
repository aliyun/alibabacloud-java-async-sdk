// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

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
         * <p>The number of entries to return on each page. Valid values: <strong>1 to 50</strong>. Default value: <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If this is your first request and no next requests are to be performed, you do not need to specify this parameter.</li>
         * <li>If a next request is to be performed, set the value to the value of <strong>NextToken</strong> that is returned from the last call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID of the endpoint service that you want to query.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The endpoint service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epsrv-hp3vpx8yqxblby3i****</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account in the whitelist of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The type of the user list in the whitelist of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>Users</p>
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
