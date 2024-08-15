// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsersRequest} extends {@link RequestModel}
 *
 * <p>DescribeUsersRequest</p>
 */
public class DescribeUsersRequest extends Request {
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

    private DescribeUsersRequest(Builder builder) {
        super(builder);
        this.endUserIds = builder.endUserIds;
        this.excludeEndUserIds = builder.excludeEndUserIds;
        this.filter = builder.filter;
        this.groupId = builder.groupId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orgId = builder.orgId;
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

    public static final class Builder extends Request.Builder<DescribeUsersRequest, Builder> {
        private java.util.List < String > endUserIds; 
        private java.util.List < String > excludeEndUserIds; 
        private String filter; 
        private String groupId; 
        private Long maxResults; 
        private String nextToken; 
        private String orgId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUsersRequest request) {
            super(request);
            this.endUserIds = request.endUserIds;
            this.excludeEndUserIds = request.excludeEndUserIds;
            this.filter = request.filter;
            this.groupId = request.groupId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orgId = request.orgId;
        } 

        /**
         * The list of usernames that must be exactly matched.
         */
        public Builder endUserIds(java.util.List < String > endUserIds) {
            this.putBodyParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * The list of usernames to be exactly excluded.
         */
        public Builder excludeEndUserIds(java.util.List < String > excludeEndUserIds) {
            this.putBodyParameter("ExcludeEndUserIds", excludeEndUserIds);
            this.excludeEndUserIds = excludeEndUserIds;
            return this;
        }

        /**
         * The string that is used for fuzzy search. You perform fuzzy search by username (EndUserId) and email address (Email). Wildcard characters (\*) are supported. For example, if you set this parameter to `a*m`, usernames or email addresses that start with `a` and end with `m` are returned.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * The ID of the organization in which you want to query convenience users.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * *   Valid values: 1 to 500
         * *   Default value: 500
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.\
         * <p>
         * If not all results are returned in a query, a value is returned for the NextToken parameter. In this case, you can use the return value of NextToken to perform the next query.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the organization in which you want to query users.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        @Override
        public DescribeUsersRequest build() {
            return new DescribeUsersRequest(this);
        } 

    } 

}
