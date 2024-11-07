// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUsersRequest} extends {@link RequestModel}
 *
 * <p>DescribeUsersRequest</p>
 */
public class DescribeUsersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserIds")
    private java.util.List < String > endUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeEndUserIds")
    private java.util.List < String > excludeEndUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilterWithAssignedResources")
    private java.util.Map < String, Boolean > filterWithAssignedResources;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrgId")
    private String orgId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShowExtras")
    private java.util.Map < String, ? > showExtras;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SolutionId")
    private String solutionId;

    private DescribeUsersRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.endUserIds = builder.endUserIds;
        this.excludeEndUserIds = builder.excludeEndUserIds;
        this.filter = builder.filter;
        this.filterWithAssignedResources = builder.filterWithAssignedResources;
        this.groupId = builder.groupId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orgId = builder.orgId;
        this.showExtras = builder.showExtras;
        this.solutionId = builder.solutionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return endUserIds
     */
    public java.util.List < String > getEndUserIds() {
        return this.endUserIds;
    }

    /**
     * @return excludeEndUserIds
     */
    public java.util.List < String > getExcludeEndUserIds() {
        return this.excludeEndUserIds;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return filterWithAssignedResources
     */
    public java.util.Map < String, Boolean > getFilterWithAssignedResources() {
        return this.filterWithAssignedResources;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
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
     * @return showExtras
     */
    public java.util.Map < String, ? > getShowExtras() {
        return this.showExtras;
    }

    /**
     * @return solutionId
     */
    public String getSolutionId() {
        return this.solutionId;
    }

    public static final class Builder extends Request.Builder<DescribeUsersRequest, Builder> {
        private String bizType; 
        private java.util.List < String > endUserIds; 
        private java.util.List < String > excludeEndUserIds; 
        private String filter; 
        private java.util.Map < String, Boolean > filterWithAssignedResources; 
        private String groupId; 
        private Long maxResults; 
        private String nextToken; 
        private String orgId; 
        private java.util.Map < String, ? > showExtras; 
        private String solutionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUsersRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.endUserIds = request.endUserIds;
            this.excludeEndUserIds = request.excludeEndUserIds;
            this.filter = request.filter;
            this.filterWithAssignedResources = request.filterWithAssignedResources;
            this.groupId = request.groupId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orgId = request.orgId;
            this.showExtras = request.showExtras;
            this.solutionId = request.solutionId;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The list of usernames that must be exactly matched.</p>
         */
        public Builder endUserIds(java.util.List < String > endUserIds) {
            this.putBodyParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * <p>The list of usernames to be exactly excluded.</p>
         */
        public Builder excludeEndUserIds(java.util.List < String > excludeEndUserIds) {
            this.putBodyParameter("ExcludeEndUserIds", excludeEndUserIds);
            this.excludeEndUserIds = excludeEndUserIds;
            return this;
        }

        /**
         * <p>The string that is used for fuzzy search. You perform fuzzy search by username (EndUserId) and email address (Email). Wildcard characters (*) are supported. For example, if you set this parameter to <code>a*m</code>, usernames or email addresses that start with <code>a</code> and end with <code>m</code> are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>a*m</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * FilterWithAssignedResources.
         */
        public Builder filterWithAssignedResources(java.util.Map < String, Boolean > filterWithAssignedResources) {
            String filterWithAssignedResourcesShrink = shrink(filterWithAssignedResources, "FilterWithAssignedResources", "json");
            this.putBodyParameter("FilterWithAssignedResources", filterWithAssignedResourcesShrink);
            this.filterWithAssignedResources = filterWithAssignedResources;
            return this;
        }

        /**
         * <p>The ID of the organization in which you want to query convenience users.</p>
         * 
         * <strong>example:</strong>
         * <p>ug-12341234****</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <ul>
         * <li>Valid values: 1 to 500</li>
         * <li>Default value: 500</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.<br>If not all results are returned in a query, a value is returned for the NextToken parameter. In this case, you can use the return value of NextToken to perform the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the organization in which you want to query users.</p>
         * 
         * <strong>example:</strong>
         * <p>org-4mdgc1cocc59z****</p>
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * ShowExtras.
         */
        public Builder showExtras(java.util.Map < String, ? > showExtras) {
            String showExtrasShrink = shrink(showExtras, "ShowExtras", "json");
            this.putBodyParameter("ShowExtras", showExtrasShrink);
            this.showExtras = showExtras;
            return this;
        }

        /**
         * SolutionId.
         */
        public Builder solutionId(String solutionId) {
            this.putBodyParameter("SolutionId", solutionId);
            this.solutionId = solutionId;
            return this;
        }

        @Override
        public DescribeUsersRequest build() {
            return new DescribeUsersRequest(this);
        } 

    } 

}
