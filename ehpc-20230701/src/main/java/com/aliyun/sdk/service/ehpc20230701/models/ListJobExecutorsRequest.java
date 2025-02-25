// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20230701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobExecutorsRequest} extends {@link RequestModel}
 *
 * <p>ListJobExecutorsRequest</p>
 */
public class ListJobExecutorsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private ListJobExecutorsRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobExecutorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<ListJobExecutorsRequest, Builder> {
        private String jobId; 
        private String pageNumber; 
        private String pageSize; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(ListJobExecutorsRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.taskName = request.taskName;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Task ID
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public ListJobExecutorsRequest build() {
            return new ListJobExecutorsRequest(this);
        } 

    } 

}
