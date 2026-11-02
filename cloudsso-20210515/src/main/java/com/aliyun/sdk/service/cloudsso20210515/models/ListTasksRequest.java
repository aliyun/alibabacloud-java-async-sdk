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
 * {@link ListTasksRequest} extends {@link RequestModel}
 *
 * <p>ListTasksRequest</p>
 */
public class ListTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

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
    @com.aliyun.core.annotation.NameInMap("PrincipalId")
    private String principalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrincipalType")
    private String principalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private ListTasksRequest(Builder builder) {
        super(builder);
        this.accessConfigurationId = builder.accessConfigurationId;
        this.directoryId = builder.directoryId;
        this.filter = builder.filter;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.principalId = builder.principalId;
        this.principalType = builder.principalType;
        this.status = builder.status;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTasksRequest create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
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

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<ListTasksRequest, Builder> {
        private String accessConfigurationId; 
        private String directoryId; 
        private String filter; 
        private Integer maxResults; 
        private String nextToken; 
        private String principalId; 
        private String principalType; 
        private String status; 
        private String targetId; 
        private String targetType; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(ListTasksRequest request) {
            super(request);
            this.accessConfigurationId = request.accessConfigurationId;
            this.directoryId = request.directoryId;
            this.filter = request.filter;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.principalId = request.principalId;
            this.principalType = request.principalType;
            this.status = request.status;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
            this.taskType = request.taskType;
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
         * <p>The filter condition.</p>
         * <p>Format: <Attribute> <Operator> <Value>. The format is not case-sensitive. <Attribute> only supports StartTime. <Operator> only supports ge (greater than or equal to). <Value> must be in the YYYY-MM-DDTHH:mm:ssZ format and can only be a time within the last 7 days.</p>
         * <p>Example: Filter = &quot;StartTime ge 2021-03-15T01:12:23Z&quot;. This example queries the list of tasks starting from 2021-03-15T01:12:23Z.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the list of tasks created within the last 24 hours is returned by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>StartTime ge 2021-03-15T01:12:23Z</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
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
         * <p>The token used to return the next page of the query results. You do not need to specify NextToken when you call this operation for the first time.</p>
         * <p>When you call this operation for the first time, if the total number of returned entries exceeds the value of MaxResults, the returned data is truncated. Only the number of entries specified by MaxResults is returned, the IsTruncated response parameter is set to true, and a NextToken value is returned. You can use the returned NextToken value to call this operation again while keeping other request parameters unchanged to query the truncated data. You can repeat this process until IsTruncated is set to false, which indicates that all data is returned.</p>
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
         * <p>The ID of the CloudSSO identity. This parameter is used as a filter condition for the query. Details:</p>
         * <ul>
         * <li>If PrincipalType is set to User, PrincipalId is the ID of the CloudSSO user.</li>
         * <li>If PrincipalType is set to Group, PrincipalId is the ID of the CloudSSO group.</li>
         * </ul>
         * <blockquote>
         * <p>PrincipalId and PrincipalType must be specified at the same time to serve as a valid filter condition.</p>
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
         * <p>The type of the CloudSSO identity. This parameter is used as a filter condition for the query. Valid values:</p>
         * <ul>
         * <li>User: The CloudSSO user.</li>
         * <li>Group: The CloudSSO group.</li>
         * </ul>
         * <blockquote>
         * <p>PrincipalId and PrincipalType must be specified at the same time to serve as a valid filter condition.</p>
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
         * <p>The status of the task. This parameter is used as a filter condition for the query. Valid values:</p>
         * <ul>
         * <li>InProgress: The task is running.</li>
         * <li>Success: The task succeeded.</li>
         * <li>Failed: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the task target. This parameter is used as a filter condition for the query.</p>
         * <blockquote>
         * <p>TargetId and TargetType must be specified at the same time to serve as a valid filter condition.</p>
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
         * <p>The type of the task target. This parameter is used as a filter condition for the query. Valid values:</p>
         * <ul>
         * <li>RD-Account: The task target is an account in a resource directory.</li>
         * </ul>
         * <blockquote>
         * <p>TargetId and TargetType must be specified at the same time to serve as a valid filter condition.</p>
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

        /**
         * <p>The type of the node. This parameter is used as a filter condition for the query. Valid values:</p>
         * <ul>
         * <li>ProvisionAccessConfiguration: Access configuration deployment.</li>
         * <li>DeprovisionAccessConfiguration: Removes access configuration provisioning.</li>
         * <li>CreateAccessAssignment: Grants authorization to an account in a resource directory.</li>
         * <li>DeleteAccessAssignment: Removes authorization from an account in a resource directory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateAccessAssignment</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public ListTasksRequest build() {
            return new ListTasksRequest(this);
        } 

    } 

}
