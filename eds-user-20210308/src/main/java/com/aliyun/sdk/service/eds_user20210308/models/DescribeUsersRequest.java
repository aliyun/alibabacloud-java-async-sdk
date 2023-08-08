// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsersRequest} extends {@link RequestModel}
 *
 * <p>DescribeUsersRequest</p>
 */
public class DescribeUsersRequest extends Request {
    @Body
    @NameInMap("EndUserIds")
    private java.util.List < String > endUserIds;

    @Body
    @NameInMap("ExcludeEndUserIds")
    private java.util.List < String > excludeEndUserIds;

    @Query
    @NameInMap("Filter")
    private String filter;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 500, minimum = 1)
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Body
    @NameInMap("OrgId")
    private String orgId;

    private DescribeUsersRequest(Builder builder) {
        super(builder);
        this.endUserIds = builder.endUserIds;
        this.excludeEndUserIds = builder.excludeEndUserIds;
        this.filter = builder.filter;
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
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orgId = request.orgId;
        } 

        /**
         * EndUserIds.
         */
        public Builder endUserIds(java.util.List < String > endUserIds) {
            this.putBodyParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * ExcludeEndUserIds.
         */
        public Builder excludeEndUserIds(java.util.List < String > excludeEndUserIds) {
            this.putBodyParameter("ExcludeEndUserIds", excludeEndUserIds);
            this.excludeEndUserIds = excludeEndUserIds;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OrgId.
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
