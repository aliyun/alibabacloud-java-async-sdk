// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ListOfficeSiteUsersRequest} extends {@link RequestModel}
 *
 * <p>ListOfficeSiteUsersRequest</p>
 */
public class ListOfficeSiteUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssignedInfo")
    private String assignedInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeAssignedUser")
    private Boolean includeAssignedUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OUPath")
    private String OUPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    private String sortType;

    private ListOfficeSiteUsersRequest(Builder builder) {
        super(builder);
        this.assignedInfo = builder.assignedInfo;
        this.filter = builder.filter;
        this.includeAssignedUser = builder.includeAssignedUser;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.OUPath = builder.OUPath;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
        this.sortType = builder.sortType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOfficeSiteUsersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assignedInfo
     */
    public String getAssignedInfo() {
        return this.assignedInfo;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return includeAssignedUser
     */
    public Boolean getIncludeAssignedUser() {
        return this.includeAssignedUser;
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
     * @return OUPath
     */
    public String getOUPath() {
        return this.OUPath;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sortType
     */
    public String getSortType() {
        return this.sortType;
    }

    public static final class Builder extends Request.Builder<ListOfficeSiteUsersRequest, Builder> {
        private String assignedInfo; 
        private String filter; 
        private Boolean includeAssignedUser; 
        private Integer maxResults; 
        private String nextToken; 
        private String OUPath; 
        private String officeSiteId; 
        private String regionId; 
        private String sortType; 

        private Builder() {
            super();
        } 

        private Builder(ListOfficeSiteUsersRequest request) {
            super(request);
            this.assignedInfo = request.assignedInfo;
            this.filter = request.filter;
            this.includeAssignedUser = request.includeAssignedUser;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.OUPath = request.OUPath;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
            this.sortType = request.sortType;
        } 

        /**
         * AssignedInfo.
         */
        public Builder assignedInfo(String assignedInfo) {
            this.putQueryParameter("AssignedInfo", assignedInfo);
            this.assignedInfo = assignedInfo;
            return this;
        }

        /**
         * <p>The query string for fuzzy query.</p>
         * 
         * <strong>example:</strong>
         * <p><em>jin</em></p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * IncludeAssignedUser.
         */
        public Builder includeAssignedUser(Boolean includeAssignedUser) {
            this.putQueryParameter("IncludeAssignedUser", includeAssignedUser);
            this.includeAssignedUser = includeAssignedUser;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <ul>
         * <li>Valid values: 1 to 100.</li>
         * <li>Default value: 10.</li>
         * </ul>
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request or if no next query exists. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
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
         * <p>The organizational unit (OU) of the specified AD domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com/Domain Controllers</p>
         */
        public Builder OUPath(String OUPath) {
            this.putQueryParameter("OUPath", OUPath);
            this.OUPath = OUPath;
            return this;
        }

        /**
         * <p>The office network ID. The office network must be of the enterprise AD account type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SortType.
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        @Override
        public ListOfficeSiteUsersRequest build() {
            return new ListOfficeSiteUsersRequest(this);
        } 

    } 

}
