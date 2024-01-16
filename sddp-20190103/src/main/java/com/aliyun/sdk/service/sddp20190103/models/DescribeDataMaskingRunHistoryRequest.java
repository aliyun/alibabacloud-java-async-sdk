// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataMaskingRunHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataMaskingRunHistoryRequest</p>
 */
public class DescribeDataMaskingRunHistoryRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("DstType")
    private Integer dstType;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MainProcessId")
    private Long mainProcessId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SrcTableName")
    private String srcTableName;

    @Query
    @NameInMap("SrcType")
    private Integer srcType;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    private DescribeDataMaskingRunHistoryRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.dstType = builder.dstType;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.mainProcessId = builder.mainProcessId;
        this.pageSize = builder.pageSize;
        this.srcTableName = builder.srcTableName;
        this.srcType = builder.srcType;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataMaskingRunHistoryRequest create() {
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
     * @return dstType
     */
    public Integer getDstType() {
        return this.dstType;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return mainProcessId
     */
    public Long getMainProcessId() {
        return this.mainProcessId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return srcTableName
     */
    public String getSrcTableName() {
        return this.srcTableName;
    }

    /**
     * @return srcType
     */
    public Integer getSrcType() {
        return this.srcType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeDataMaskingRunHistoryRequest, Builder> {
        private Integer currentPage; 
        private Integer dstType; 
        private Long endTime; 
        private String lang; 
        private Long mainProcessId; 
        private Integer pageSize; 
        private String srcTableName; 
        private Integer srcType; 
        private Long startTime; 
        private Integer status; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataMaskingRunHistoryRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.dstType = request.dstType;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.mainProcessId = request.mainProcessId;
            this.pageSize = request.pageSize;
            this.srcTableName = request.srcTableName;
            this.srcType = request.srcType;
            this.startTime = request.startTime;
            this.status = request.status;
            this.taskId = request.taskId;
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
         * The type of the service to which the de-identified data belongs. Valid values: **1**, **2**, **3**, **4**, and **5**. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.
         */
        public Builder dstType(Integer dstType) {
            this.putQueryParameter("DstType", dstType);
            this.dstType = dstType;
            return this;
        }

        /**
         * The end of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh_cn**. Valid values:
         * <p>
         * 
         * *   **zh_cn**: Chinese
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the task.
         * <p>
         * 
         * > If a task has one or more subtasks, the value of the parameter must be the ID of the task. Otherwise, leave this parameter empty.
         */
        public Builder mainProcessId(Long mainProcessId) {
            this.putQueryParameter("MainProcessId", mainProcessId);
            this.mainProcessId = mainProcessId;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the source table.
         */
        public Builder srcTableName(String srcTableName) {
            this.putQueryParameter("SrcTableName", srcTableName);
            this.srcTableName = srcTableName;
            return this;
        }

        /**
         * The type of the service to which the data to be de-identified belongs. Valid values: **1**, **2**, **3**, **4**, and **5**. The value 1 indicates MaxCompute. The value 2 indicates Object Storage Service (OSS). The value indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.
         */
        public Builder srcType(Integer srcType) {
            this.putQueryParameter("SrcType", srcType);
            this.srcType = srcType;
            return this;
        }

        /**
         * The beginning of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The status of the de-identification task. Valid values:
         * <p>
         * 
         * *   **-1**: waiting
         * *   **0**: being executed
         * *   **1**: executed
         * *   **2**: failed to be executed
         * *   **3**: terminated
         * *   **4**: partially failed
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The ID of the de-identification task.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeDataMaskingRunHistoryRequest build() {
            return new DescribeDataMaskingRunHistoryRequest(this);
        } 

    } 

}
