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
 * {@link ListDirectoryUsersRequest} extends {@link RequestModel}
 *
 * <p>ListDirectoryUsersRequest</p>
 */
public class ListDirectoryUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssignedInfo")
    private String assignedInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryId;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    private String sortType;

    private ListDirectoryUsersRequest(Builder builder) {
        super(builder);
        this.assignedInfo = builder.assignedInfo;
        this.directoryId = builder.directoryId;
        this.filter = builder.filter;
        this.includeAssignedUser = builder.includeAssignedUser;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.OUPath = builder.OUPath;
        this.regionId = builder.regionId;
        this.sortType = builder.sortType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDirectoryUsersRequest create() {
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

    public static final class Builder extends Request.Builder<ListDirectoryUsersRequest, Builder> {
        private String assignedInfo; 
        private String directoryId; 
        private String filter; 
        private Boolean includeAssignedUser; 
        private Integer maxResults; 
        private String nextToken; 
        private String OUPath; 
        private String regionId; 
        private String sortType; 

        private Builder() {
            super();
        } 

        private Builder(ListDirectoryUsersRequest request) {
            super(request);
            this.assignedInfo = request.assignedInfo;
            this.directoryId = request.directoryId;
            this.filter = request.filter;
            this.includeAssignedUser = request.includeAssignedUser;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.OUPath = request.OUPath;
            this.regionId = request.regionId;
            this.sortType = request.sortType;
        } 

        /**
         * <blockquote>
         * <p>This field is not available for use. You can only pass in <code>1</code> or leave it empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder assignedInfo(String assignedInfo) {
            this.putQueryParameter("AssignedInfo", assignedInfo);
            this.assignedInfo = assignedInfo;
            return this;
        }

        /**
         * <p>The AD directory ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-jedbpr4sl9l37****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The fuzzy search string. All results that contain this string are matched.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>Specifies whether to return only users who have been assigned cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeAssignedUser(Boolean includeAssignedUser) {
            this.putQueryParameter("IncludeAssignedUser", includeAssignedUser);
            this.includeAssignedUser = includeAssignedUser;
            return this;
        }

        /**
         * <p>The number of entries per page for a paginated query.    </p>
         * <ul>
         * <li>Maximum value: 100.    </li>
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
         * <p>The token for the next query. If this parameter is empty, no more results are available.</p>
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
         * <p>The organizational unit (OU) in the AD domain to which the user belongs. You can call <a href="https://help.aliyun.com/document_detail/311259.html">ListUserAdOrganizationUnits</a> to obtain this value.</p>
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
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
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
         * <p>The sorting method.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        @Override
        public ListDirectoryUsersRequest build() {
            return new ListDirectoryUsersRequest(this);
        } 

    } 

}
