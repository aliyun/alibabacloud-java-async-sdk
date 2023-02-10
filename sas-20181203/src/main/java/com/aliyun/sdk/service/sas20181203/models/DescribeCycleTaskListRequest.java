// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCycleTaskListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCycleTaskListRequest</p>
 */
public class DescribeCycleTaskListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
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
         * The number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 20.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the task. Valid values:
         * <p>
         * 
         * *   **VIRUS_VUL_SCHEDULE_SCAN**: virus scan task
         * *   **IMAGE_SCAN**: image scan task
         * *   **EMG_VUL_SCHEDULE_SCAN**: urgent vulnerability scan task
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * The type of the task. Valid values:
         * <p>
         * 
         * *   **VIRUS_VUL_SCHEDULE_SCAN**: virus scan task
         * *   **IMAGE_SCAN**: image scan task
         * *   **EMG_VUL_SCHEDULE_SCAN**: urgent vulnerability scan task
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
