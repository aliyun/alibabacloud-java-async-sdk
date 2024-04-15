// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsersInGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeUsersInGroupRequest</p>
 */
public class DescribeUsersInGroupRequest extends Request {
    @Query
    @NameInMap("ConnectState")
    private Integer connectState;

    @Query
    @NameInMap("DesktopGroupId")
    @Validation(required = true)
    private String desktopGroupId;

    @Query
    @NameInMap("EndUserId")
    private String endUserId;

    @Query
    @NameInMap("EndUserIds")
    private java.util.List < String > endUserIds;

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
    @NameInMap("OrgId")
    private String orgId;

    @Query
    @NameInMap("QueryUserDetail")
    private Boolean queryUserDetail;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeUsersInGroupRequest(Builder builder) {
        super(builder);
        this.connectState = builder.connectState;
        this.desktopGroupId = builder.desktopGroupId;
        this.endUserId = builder.endUserId;
        this.endUserIds = builder.endUserIds;
        this.filter = builder.filter;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orgId = builder.orgId;
        this.queryUserDetail = builder.queryUserDetail;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsersInGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectState
     */
    public Integer getConnectState() {
        return this.connectState;
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return endUserIds
     */
    public java.util.List < String > getEndUserIds() {
        return this.endUserIds;
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
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return queryUserDetail
     */
    public Boolean getQueryUserDetail() {
        return this.queryUserDetail;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeUsersInGroupRequest, Builder> {
        private Integer connectState; 
        private String desktopGroupId; 
        private String endUserId; 
        private java.util.List < String > endUserIds; 
        private String filter; 
        private Integer maxResults; 
        private String nextToken; 
        private String orgId; 
        private Boolean queryUserDetail; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUsersInGroupRequest request) {
            super(request);
            this.connectState = request.connectState;
            this.desktopGroupId = request.desktopGroupId;
            this.endUserId = request.endUserId;
            this.endUserIds = request.endUserIds;
            this.filter = request.filter;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orgId = request.orgId;
            this.queryUserDetail = request.queryUserDetail;
            this.regionId = request.regionId;
        } 

        /**
         * The status of the desktop connection for the end user.
         * <p>
         * 
         * Valid values:
         * 
         * - 0: Disconnected.
         * - 1: Connected.
         */
        public Builder connectState(Integer connectState) {
            this.putQueryParameter("ConnectState", connectState);
            this.connectState = connectState;
            return this;
        }

        /**
         * The ID of the cloud computer pool.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * The ID of the authorized user.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The IDs of the authorized users.
         */
        public Builder endUserIds(java.util.List < String > endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * The query string for fuzzy match. If you specify this parameter, the system returns all results that contain the string.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * *   Maximum value: 100.
         * *   Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the next query. If this parameter is left empty, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the organization to which the end user belongs.
         */
        public Builder orgId(String orgId) {
            this.putQueryParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * Specifies whether to query user details.
         * <p>
         * 
         * Valid values:
         * 
         * *   true (default)
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   false
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder queryUserDetail(Boolean queryUserDetail) {
            this.putQueryParameter("QueryUserDetail", queryUserDetail);
            this.queryUserDetail = queryUserDetail;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeUsersInGroupRequest build() {
            return new DescribeUsersInGroupRequest(this);
        } 

    } 

}
