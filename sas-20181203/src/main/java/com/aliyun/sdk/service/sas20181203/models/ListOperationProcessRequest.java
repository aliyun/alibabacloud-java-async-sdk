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
 * {@link ListOperationProcessRequest} extends {@link RequestModel}
 *
 * <p>ListOperationProcessRequest</p>
 */
public class ListOperationProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusCodes")
    private java.util.List<Integer> statusCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    private java.util.List<String> taskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskTypes")
    private java.util.List<String> taskTypes;

    private ListOperationProcessRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.statusCodes = builder.statusCodes;
        this.taskIds = builder.taskIds;
        this.taskTypes = builder.taskTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationProcessRequest create() {
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
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return statusCodes
     */
    public java.util.List<Integer> getStatusCodes() {
        return this.statusCodes;
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    /**
     * @return taskTypes
     */
    public java.util.List<String> getTaskTypes() {
        return this.taskTypes;
    }

    public static final class Builder extends Request.Builder<ListOperationProcessRequest, Builder> {
        private Integer currentPage; 
        private Long endTime; 
        private Integer pageSize; 
        private Long startTime; 
        private java.util.List<Integer> statusCodes; 
        private java.util.List<String> taskIds; 
        private java.util.List<String> taskTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationProcessRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.statusCodes = request.statusCodes;
            this.taskIds = request.taskIds;
            this.taskTypes = request.taskTypes;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * StatusCodes.
         */
        public Builder statusCodes(java.util.List<Integer> statusCodes) {
            this.putQueryParameter("StatusCodes", statusCodes);
            this.statusCodes = statusCodes;
            return this;
        }

        /**
         * TaskIds.
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        /**
         * TaskTypes.
         */
        public Builder taskTypes(java.util.List<String> taskTypes) {
            this.putQueryParameter("TaskTypes", taskTypes);
            this.taskTypes = taskTypes;
            return this;
        }

        @Override
        public ListOperationProcessRequest build() {
            return new ListOperationProcessRequest(this);
        } 

    } 

}
