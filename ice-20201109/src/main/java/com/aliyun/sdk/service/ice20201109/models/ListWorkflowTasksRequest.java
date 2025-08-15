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
         * EndOfCreateTime.
         */
        public Builder endOfCreateTime(String endOfCreateTime) {
            this.putQueryParameter("EndOfCreateTime", endOfCreateTime);
            this.endOfCreateTime = endOfCreateTime;
            return this;
        }

        /**
         * KeyText.
         */
        public Builder keyText(String keyText) {
            this.putQueryParameter("KeyText", keyText);
            this.keyText = keyText;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
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
         * StartOfCreateTime.
         */
        public Builder startOfCreateTime(String startOfCreateTime) {
            this.putQueryParameter("StartOfCreateTime", startOfCreateTime);
            this.startOfCreateTime = startOfCreateTime;
            return this;
        }

        /**
         * WorkflowId.
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        /**
         * WorkflowName.
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
