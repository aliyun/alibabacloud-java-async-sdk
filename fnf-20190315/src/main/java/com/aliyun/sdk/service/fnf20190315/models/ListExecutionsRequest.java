// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link ListExecutionsRequest} extends {@link RequestModel}
 *
 * <p>ListExecutionsRequest</p>
 */
public class ListExecutionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionNamePrefix")
    private String executionNamePrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetadataOnly")
    private Boolean metadataOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartedTimeBegin")
    private String startedTimeBegin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartedTimeEnd")
    private String startedTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListExecutionsRequest(Builder builder) {
        super(builder);
        this.executionNamePrefix = builder.executionNamePrefix;
        this.flowName = builder.flowName;
        this.limit = builder.limit;
        this.metadataOnly = builder.metadataOnly;
        this.nextToken = builder.nextToken;
        this.startedTimeBegin = builder.startedTimeBegin;
        this.startedTimeEnd = builder.startedTimeEnd;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionNamePrefix
     */
    public String getExecutionNamePrefix() {
        return this.executionNamePrefix;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return metadataOnly
     */
    public Boolean getMetadataOnly() {
        return this.metadataOnly;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return startedTimeBegin
     */
    public String getStartedTimeBegin() {
        return this.startedTimeBegin;
    }

    /**
     * @return startedTimeEnd
     */
    public String getStartedTimeEnd() {
        return this.startedTimeEnd;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListExecutionsRequest, Builder> {
        private String executionNamePrefix; 
        private String flowName; 
        private Integer limit; 
        private Boolean metadataOnly; 
        private String nextToken; 
        private String startedTimeBegin; 
        private String startedTimeEnd; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListExecutionsRequest request) {
            super(request);
            this.executionNamePrefix = request.executionNamePrefix;
            this.flowName = request.flowName;
            this.limit = request.limit;
            this.metadataOnly = request.metadataOnly;
            this.nextToken = request.nextToken;
            this.startedTimeBegin = request.startedTimeBegin;
            this.startedTimeEnd = request.startedTimeEnd;
            this.status = request.status;
        } 

        /**
         * <p>The name prefix of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>run</p>
         */
        public Builder executionNamePrefix(String executionNamePrefix) {
            this.putQueryParameter("ExecutionNamePrefix", executionNamePrefix);
            this.executionNamePrefix = executionNamePrefix;
            return this;
        }

        /**
         * <p>The name of the flow. The name must be unique within the region and cannot be modified after the flow is created. The name must meet the following conventions:</p>
         * <ul>
         * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
         * <li>The name must start with a letter or an underscore (_).</li>
         * <li>The name is case-sensitive.</li>
         * <li>The name must be 1 to 128 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flow</p>
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>The number of executions that you want to query. Valid values: 1-99. Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * MetadataOnly.
         */
        public Builder metadataOnly(Boolean metadataOnly) {
            this.putQueryParameter("MetadataOnly", metadataOnly);
            this.metadataOnly = metadataOnly;
            return this;
        }

        /**
         * <p>The name of the execution to start the query. You can obtain the value from the response data. You do not need to specify this parameter for the first request.</p>
         * 
         * <strong>example:</strong>
         * <p>flow_xxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The beginning of the time range to query executions. Specify the value in the UTC RFC3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-02T02:39:20.402Z</p>
         */
        public Builder startedTimeBegin(String startedTimeBegin) {
            this.putQueryParameter("StartedTimeBegin", startedTimeBegin);
            this.startedTimeBegin = startedTimeBegin;
            return this;
        }

        /**
         * <p>The end of the time range to query executions. Specify the value in the UTC RFC3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-02T02:23:54.817Z</p>
         */
        public Builder startedTimeEnd(String startedTimeEnd) {
            this.putQueryParameter("StartedTimeEnd", startedTimeEnd);
            this.startedTimeEnd = startedTimeEnd;
            return this;
        }

        /**
         * <p>The status of the execution that you want to filter. Valid values:</p>
         * <ul>
         * <li><strong>Starting</strong></li>
         * <li><strong>Running</strong></li>
         * <li><strong>Stopped</strong></li>
         * <li><strong>Succeeded</strong></li>
         * <li><strong>Failed</strong></li>
         * <li><strong>TimedOut</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListExecutionsRequest build() {
            return new ListExecutionsRequest(this);
        } 

    } 

}
