// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link DescribeGroupUserRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupUserRequest</p>
 */
public class DescribeGroupUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SolutionId")
    private String solutionId;

    private DescribeGroupUserRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.filter = builder.filter;
        this.groupId = builder.groupId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.solutionId = builder.solutionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupUserRequest create() {
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
     * @return solutionId
     */
    public String getSolutionId() {
        return this.solutionId;
    }

    public static final class Builder extends Request.Builder<DescribeGroupUserRequest, Builder> {
        private String bizType; 
        private String filter; 
        private String groupId; 
        private Integer maxResults; 
        private String nextToken; 
        private String solutionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupUserRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.filter = request.filter;
            this.groupId = request.groupId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.solutionId = request.solutionId;
        } 

        /**
         * <blockquote>
         * <p> This parameter is not available for public use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The fuzzy search string that matches the username (EndUserId) and email address (Email) of the regular user.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The ID of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>ug-12341234****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
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
         * <p>The token for the next query. You can obtain this parameter from the response parameters of the last call to this operation.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is not available for public use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>co-0esnf80jab***</p>
         */
        public Builder solutionId(String solutionId) {
            this.putQueryParameter("SolutionId", solutionId);
            this.solutionId = solutionId;
            return this;
        }

        @Override
        public DescribeGroupUserRequest build() {
            return new DescribeGroupUserRequest(this);
        } 

    } 

}
