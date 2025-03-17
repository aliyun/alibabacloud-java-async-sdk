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
 * {@link DescribeUsersInGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeUsersInGroupRequest</p>
 */
public class DescribeUsersInGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectState")
    private Integer connectState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserIds")
    private java.util.List<String> endUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgId")
    private String orgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryUserDetail")
    private Boolean queryUserDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<String> getEndUserIds() {
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
        private java.util.List<String> endUserIds; 
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
         * <p>The status of the desktop connection for the end user.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: Disconnected.</li>
         * <li>1: Connected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder connectState(Integer connectState) {
            this.putQueryParameter("ConnectState", connectState);
            this.connectState = connectState;
            return this;
        }

        /**
         * <p>The ID of the cloud computer pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-8ttn55ujj8nj8****</p>
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * <p>The ID of the authorized user.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The IDs of the authorized users.</p>
         */
        public Builder endUserIds(java.util.List<String> endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * <p>The query string for fuzzy match. If you specify this parameter, the system returns all results that contain the string.</p>
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
         * <p>The number of entries to return on each page.</p>
         * <ul>
         * <li>Maximum value: 100.</li>
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
         * <p>The token that determines the start point of the next query. If this parameter is left empty, all results are returned.</p>
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
         * <p>The ID of the organization to which the end user belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>org-d0fua2oyukw8j****</p>
         */
        public Builder orgId(String orgId) {
            this.putQueryParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * <p>Specifies whether to query user details.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true (default)</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder queryUserDetail(Boolean queryUserDetail) {
            this.putQueryParameter("QueryUserDetail", queryUserDetail);
            this.queryUserDetail = queryUserDetail;
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

        @Override
        public DescribeUsersInGroupRequest build() {
            return new DescribeUsersInGroupRequest(this);
        } 

    } 

}
