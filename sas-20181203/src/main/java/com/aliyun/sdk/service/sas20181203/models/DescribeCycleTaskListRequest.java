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
 * {@link DescribeCycleTaskListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCycleTaskListRequest</p>
 */
public class DescribeCycleTaskListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private DescribeCycleTaskListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCycleTaskListRequest create() {
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<DescribeCycleTaskListRequest, Builder> {
        private Integer currentPage; 
        private Integer pageSize; 
        private String taskName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCycleTaskListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The number of the page to return.</p>
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
         * <p>The number of entries to return on each page.</p>
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
         * <p>The name of the task. Valid values:</p>
         * <ul>
         * <li><strong>VIRUS_VUL_SCHEDULE_SCAN</strong>: virus scan task</li>
         * <li><strong>IMAGE_SCAN</strong>: image scan task</li>
         * <li><strong>EMG_VUL_SCHEDULE_SCAN</strong>: urgent vulnerability scan task</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IMAGE_SCAN</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The type of the task. Valid values:</p>
         * <ul>
         * <li><strong>VIRUS_VUL_SCHEDULE_SCAN</strong>: virus scan task</li>
         * <li><strong>IMAGE_SCAN</strong>: image scan task</li>
         * <li><strong>EMG_VUL_SCHEDULE_SCAN</strong>: urgent vulnerability scan task</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE_SCAN</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public DescribeCycleTaskListRequest build() {
            return new DescribeCycleTaskListRequest(this);
        } 

    } 

}
