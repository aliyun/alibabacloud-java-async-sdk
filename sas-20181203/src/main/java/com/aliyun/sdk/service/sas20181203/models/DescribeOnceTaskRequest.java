// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeOnceTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeOnceTaskRequest</p>
 */
public class DescribeOnceTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimeQuery")
    private Long endTimeQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootTaskId")
    private String rootTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimeQuery")
    private Long startTimeQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private DescribeOnceTaskRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTimeQuery = builder.endTimeQuery;
        this.pageSize = builder.pageSize;
        this.rootTaskId = builder.rootTaskId;
        this.source = builder.source;
        this.startTimeQuery = builder.startTimeQuery;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOnceTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTimeQuery
     */
    public Long getEndTimeQuery() {
        return this.endTimeQuery;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return rootTaskId
     */
    public String getRootTaskId() {
        return this.rootTaskId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return startTimeQuery
     */
    public Long getStartTimeQuery() {
        return this.startTimeQuery;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<DescribeOnceTaskRequest, Builder> {
        private Integer currentPage; 
        private Long endTimeQuery; 
        private Integer pageSize; 
        private String rootTaskId; 
        private String source; 
        private Long startTimeQuery; 
        private String taskId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOnceTaskRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTimeQuery = request.endTimeQuery;
            this.pageSize = request.pageSize;
            this.rootTaskId = request.rootTaskId;
            this.source = request.source;
            this.startTimeQuery = request.startTimeQuery;
            this.taskId = request.taskId;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The timestamp when the root task ends. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1651766520000</p>
         */
        public Builder endTimeQuery(Long endTimeQuery) {
            this.putQueryParameter("EndTimeQuery", endTimeQuery);
            this.endTimeQuery = endTimeQuery;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the root task.</p>
         * <blockquote>
         * <p>You must specify at least one of the <strong>TaskType</strong> and <strong>RootTaskId</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>bb5d657479bba5e1d308b6c9e85c9174</p>
         */
        public Builder rootTaskId(String rootTaskId) {
            this.putQueryParameter("RootTaskId", rootTaskId);
            this.rootTaskId = rootTaskId;
            return this;
        }

        /**
         * <p>The source of the task. Valid values include the following values:</p>
         * <ul>
         * <li><strong>schedule</strong>: automatic scheduling of Cloud Security Scanner.</li>
         * <li><strong>console</strong>: one-click detection in the Cloud Security Scanner console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>console</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The timestamp when the root task starts. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1651737301000</p>
         */
        public Builder startTimeQuery(Long startTimeQuery) {
            this.putQueryParameter("StartTimeQuery", startTimeQuery);
            this.startTimeQuery = startTimeQuery;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>d7b2acf8d362742123e4a84e1bf8****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The type of the task. Valid values:</p>
         * <ul>
         * <li><strong>CLIENT_PROBLEM_CHECK</strong>: a task of the Security Center agent</li>
         * <li><strong>CLIENT_DEV_OPS</strong>: an O&amp;M task of Cloud Assistant</li>
         * <li><strong>ASSET_SECURITY_CHECK</strong>: a task of asset information collection</li>
         * </ul>
         * <blockquote>
         * <p>You must specify at least one of the <strong>TaskType</strong> and <strong>RootTaskId</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CLIENT_PROBLEM_CHECK</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public DescribeOnceTaskRequest build() {
            return new DescribeOnceTaskRequest(this);
        } 

    } 

}
