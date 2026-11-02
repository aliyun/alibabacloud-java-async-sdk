// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListWorkflowTasksRequest} extends {@link RequestModel}
 *
 * <p>ListWorkflowTasksRequest</p>
 */
public class ListWorkflowTasksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndOfCreateTime")
    private String endOfCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyText")
    private String keyText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartOfCreateTime")
    private String startOfCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    private String workflowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowName")
    private String workflowName;

    private ListWorkflowTasksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endOfCreateTime = builder.endOfCreateTime;
        this.keyText = builder.keyText;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.startOfCreateTime = builder.startOfCreateTime;
        this.workflowId = builder.workflowId;
        this.workflowName = builder.workflowName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return endOfCreateTime
     */
    public String getEndOfCreateTime() {
        return this.endOfCreateTime;
    }

    /**
     * @return keyText
     */
    public String getKeyText() {
        return this.keyText;
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
     * @return startOfCreateTime
     */
    public String getStartOfCreateTime() {
        return this.startOfCreateTime;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * @return workflowName
     */
    public String getWorkflowName() {
        return this.workflowName;
    }

    public static final class Builder extends Request.Builder<ListWorkflowTasksRequest, Builder> {
        private String regionId; 
        private String endOfCreateTime; 
        private String keyText; 
        private Integer maxResults; 
        private String nextToken; 
        private String startOfCreateTime; 
        private String workflowId; 
        private String workflowName; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkflowTasksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endOfCreateTime = request.endOfCreateTime;
            this.keyText = request.keyText;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.startOfCreateTime = request.startOfCreateTime;
            this.workflowId = request.workflowId;
            this.workflowName = request.workflowName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The end time for the task creation time filter. Only the last 90 days are supported. Specify the time in ISO 8601 format in UTC (ending with Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-15T00:00:00Z</p>
         */
        public Builder endOfCreateTime(String endOfCreateTime) {
            this.putQueryParameter("EndOfCreateTime", endOfCreateTime);
            this.endOfCreateTime = endOfCreateTime;
            return this;
        }

        /**
         * <p>The file name or media asset ID. This parameter supports fuzzy match for TaskInput and has a maximum length of 32 characters.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>7aa4cc4459ada8ef35f7</strong></strong></strong>
         * or
         * <strong>TestVideo</strong>*.flv</p>
         */
        public Builder keyText(String keyText) {
            this.putQueryParameter("KeyText", keyText);
            this.keyText = keyText;
            return this;
        }

        /**
         * <p>The maximum number of media workflow task instances to return. Valid values: 1 to 100. Default value: 10.</p>
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
         * <p>The token for the next page in a continuous paging query. This parameter is not returned for the first page.</p>
         * 
         * <strong>example:</strong>
         * <p>****<strong><strong><strong><strong><strong>VRpbWUQARgBIpcBCgkA1bUtaAAAAAAKiQEDhAAAADFTMzg2NTY2NjU2MzM3NjU2NjYyMzkzMTYyMzI2MjYzNjY2</strong></strong></strong></strong></strong></p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The start time for the task creation time filter. Only the last 90 days are supported. Specify the time in ISO 8601 format in UTC (ending with Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-12T00:00:00Z</p>
         */
        public Builder startOfCreateTime(String startOfCreateTime) {
            this.putQueryParameter("StartOfCreateTime", startOfCreateTime);
            this.startOfCreateTime = startOfCreateTime;
            return this;
        }

        /**
         * <p>The ID of the workflow template. You can view the template ID in the <a href="https://ims.console.aliyun.com/settings/workflow/list">Intelligent Media Services console</a> by choosing Configuration Management &gt; Workflow Templates.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>b4fb044839815d4f2cd8</strong></strong></strong></p>
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        /**
         * <p>The name of the workflow template.</p>
         * 
         * <strong>example:</strong>
         * <p>example-workflow-****</p>
         */
        public Builder workflowName(String workflowName) {
            this.putQueryParameter("WorkflowName", workflowName);
            this.workflowName = workflowName;
            return this;
        }

        @Override
        public ListWorkflowTasksRequest build() {
            return new ListWorkflowTasksRequest(this);
        } 

    } 

}
