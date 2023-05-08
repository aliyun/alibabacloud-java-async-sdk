// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOnceTaskLeafRecordPageRequest} extends {@link RequestModel}
 *
 * <p>DescribeOnceTaskLeafRecordPageRequest</p>
 */
public class DescribeOnceTaskLeafRecordPageRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("RelateInfo")
    @Validation(required = true)
    private Boolean relateInfo;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("StatusList")
    private java.util.List < String > statusList;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
    private String taskType;

    private DescribeOnceTaskLeafRecordPageRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.pageSize = builder.pageSize;
        this.relateInfo = builder.relateInfo;
        this.source = builder.source;
        this.startTime = builder.startTime;
        this.statusList = builder.statusList;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOnceTaskLeafRecordPageRequest create() {
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
     * @return relateInfo
     */
    public Boolean getRelateInfo() {
        return this.relateInfo;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return statusList
     */
    public java.util.List < String > getStatusList() {
        return this.statusList;
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

    public static final class Builder extends Request.Builder<DescribeOnceTaskLeafRecordPageRequest, Builder> {
        private Integer currentPage; 
        private Long endTime; 
        private Integer pageSize; 
        private Boolean relateInfo; 
        private String source; 
        private Long startTime; 
        private java.util.List < String > statusList; 
        private String taskId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOnceTaskLeafRecordPageRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.pageSize = request.pageSize;
            this.relateInfo = request.relateInfo;
            this.source = request.source;
            this.startTime = request.startTime;
            this.statusList = request.statusList;
            this.taskId = request.taskId;
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
         * The end timestamp of the sub-task.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 20
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Specifies whether extension information is associated.
         */
        public Builder relateInfo(Boolean relateInfo) {
            this.putQueryParameter("RelateInfo", relateInfo);
            this.relateInfo = relateInfo;
            return this;
        }

        /**
         * The source of the request.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The start timestamp of the sub-task.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The status information.
         */
        public Builder statusList(java.util.List < String > statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * The ID of the sub-task.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * The type of the sub-task. Valid values:
         * <p>
         * 
         * *   **IMAGE_SCAN**: image scan task
         * *   **IMAGE_REGISTRY_PULL**: image asset synchronization task
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public DescribeOnceTaskLeafRecordPageRequest build() {
            return new DescribeOnceTaskLeafRecordPageRequest(this);
        } 

    } 

}
