// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
 * {@link ListAccessAssignmentsRequest} extends {@link RequestModel}
 *
 * <p>ListAccessAssignmentsRequest</p>
 */
public class ListAccessAssignmentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginTargetId")
    private String originTargetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrincipalId")
    private String principalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrincipalType")
    private String principalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private ListAccessAssignmentsRequest(Builder builder) {
        super(builder);
        this.accessConfigurationId = builder.accessConfigurationId;
        this.directoryId = builder.directoryId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.originTargetId = builder.originTargetId;
        this.principalId = builder.principalId;
        this.principalType = builder.principalType;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessAssignmentsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessConfigurationId
     */
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
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
     * @return originTargetId
     */
    public String getOriginTargetId() {
        return this.originTargetId;
    }

    /**
     * @return principalId
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * @return principalType
     */
    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<ListAccessAssignmentsRequest, Builder> {
        private String accessConfigurationId; 
        private String directoryId; 
        private Integer maxResults; 
        private String nextToken; 
        private String originTargetId; 
        private String principalId; 
        private String principalType; 
        private String targetId; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(ListAccessAssignmentsRequest request) {
            super(request);
            this.accessConfigurationId = request.accessConfigurationId;
            this.directoryId = request.directoryId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.originTargetId = request.originTargetId;
            this.principalId = request.principalId;
            this.principalType = request.principalType;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The ID of the access configuration. This parameter is used as a filter condition for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-00jhtfl8thteu6uj****</p>
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page.</p>
         * <p>Valid values: 1 to 20.</p>
         * <p>Default value: 10.</p>
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
         * <p>The token for the next page of query results. You do not need to specify <code>NextToken</code> when you call this operation for the first time.</p>
         * <p>When you call this operation for the first time, if the total number of returned entries exceeds the value of <code>MaxResults</code>, the returned entries are truncated. Only the number of entries specified by <code>MaxResults</code> is returned, the <code>IsTruncated</code> parameter is set to <code>true</code>, and a <code>NextToken</code> value is returned. You can use the returned <code>NextToken</code> value to call this operation again to query the truncated entries while keeping other request parameters unchanged. You can repeat this process until <code>IsTruncated</code> is set to <code>false</code>, which indicates that all entries are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the authorization target belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>114240524784****</p>
         */
        public Builder originTargetId(String originTargetId) {
            this.putQueryParameter("OriginTargetId", originTargetId);
            this.originTargetId = originTargetId;
            return this;
        }

        /**
         * <p>The ID of the CloudSSO identity, which is used as a filter condition for the query. Details:</p>
         * <ul>
         * <li>If <code>PrincipalType</code> is set to User, <code>PrincipalId</code> is the ID of the CloudSSO user.</li>
         * <li>If <code>PrincipalType</code> is set to Group, <code>PrincipalId</code> is the ID of the CloudSSO group.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify both <code>PrincipalId</code> and <code>PrincipalType</code> for the filter condition to take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>u-00q8wbq42wiltcrk****</p>
         */
        public Builder principalId(String principalId) {
            this.putQueryParameter("PrincipalId", principalId);
            this.principalId = principalId;
            return this;
        }

        /**
         * <p>The type of the CloudSSO identity, which is used as a filter condition for the query. Valid values:</p>
         * <ul>
         * <li>User: user.</li>
         * <li>Group: group.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify both <code>PrincipalId</code> and <code>PrincipalType</code> for the filter condition to take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        public Builder principalType(String principalType) {
            this.putQueryParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        /**
         * <p>The ID of the task target, which is used as a filter condition for the query.</p>
         * <blockquote>
         * <p>You must specify both <code>TargetId</code> and <code>TargetType</code> for the filter condition to take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>114240524784****</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>The type of the task target, which is used as a filter condition for the query.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RD-Account: The task target is an account in a resource directory.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify both <code>TargetId</code> and <code>TargetType</code> for the filter condition to take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RD-Account</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public ListAccessAssignmentsRequest build() {
            return new ListAccessAssignmentsRequest(this);
        } 

    } 

}
