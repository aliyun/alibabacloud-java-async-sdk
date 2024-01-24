// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOrgsRequest} extends {@link RequestModel}
 *
 * <p>DescribeOrgsRequest</p>
 */
public class DescribeOrgsRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 500, minimum = 1)
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OrgName")
    private String orgName;

    @Query
    @NameInMap("ParentOrgId")
    private String parentOrgId;

    private DescribeOrgsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orgName = builder.orgName;
        this.parentOrgId = builder.parentOrgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOrgsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return orgName
     */
    public String getOrgName() {
        return this.orgName;
    }

    /**
     * @return parentOrgId
     */
    public String getParentOrgId() {
        return this.parentOrgId;
    }

    public static final class Builder extends Request.Builder<DescribeOrgsRequest, Builder> {
        private Long maxResults; 
        private String nextToken; 
        private String orgName; 
        private String parentOrgId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOrgsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orgName = request.orgName;
            this.parentOrgId = request.parentOrgId;
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
         * OrgName.
         */
        public Builder orgName(String orgName) {
            this.putQueryParameter("OrgName", orgName);
            this.orgName = orgName;
            return this;
        }

        /**
         * ParentOrgId.
         */
        public Builder parentOrgId(String parentOrgId) {
            this.putQueryParameter("ParentOrgId", parentOrgId);
            this.parentOrgId = parentOrgId;
            return this;
        }

        @Override
        public DescribeOrgsRequest build() {
            return new DescribeOrgsRequest(this);
        } 

    } 

}
