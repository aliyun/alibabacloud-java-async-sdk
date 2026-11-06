// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link DescribeExportTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeExportTasksRequest</p>
 */
public class DescribeExportTasksRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private DescribeExportTasksRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExportTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<DescribeExportTasksRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String taskId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExportTasksRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.taskId = request.taskId;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The page number for paging. Pages start from 1. If this parameter is not specified or is set to a value less than 1, the first page is returned. The query results are sorted in descending order of task creation time, with the most recently created tasks listed first. When polling a single task by TaskId, explicitly set this parameter to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of tasks to return per page. Default value: 200. If this parameter is not specified, the default value is used. If a value less than 1 is specified, 10 is used. When polling a single task by TaskId, set this parameter to 1 to avoid returning redundant tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Filters tasks by export task ID. The value is the TaskId returned by CreateExportTask, which is a 32-character UUID string without hyphens. This parameter requires exact match and does not support fuzzy queries. If this parameter is not specified, all tasks that meet other conditions under the current account are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>8119078c29e948dba2e0a9917995332a</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>Filters tasks by export task type. The value is case-sensitive and must be one of the following valid values:</p>
         * <ul>
         * <li>WUYING_SERVER_LIST: Wuying host list.</li>
         * <li>USER_USAGE_REPORT: User usage report.</li>
         * <li>BROWSER_BOOKMARK_LIST: Cloud browser bookmark list.</li>
         * <li>BROWSER_RESTRICTED_URL_LIST: Cloud browser URL whitelist.</li>
         * </ul>
         * <p>If this parameter is not specified, tasks are not filtered by type, and all tasks that meet other conditions under the current account are returned. If an unrecognized value is specified, the server does not return a parameter error but cancels type filtering. Therefore, you must specify one of the preceding exact enum values. When querying a single task by TaskId, omit this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>WUYING_SERVER_LIST</p>
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public DescribeExportTasksRequest build() {
            return new DescribeExportTasksRequest(this);
        } 

    } 

}
