// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeDataMaskingRunHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataMaskingRunHistoryRequest</p>
 */
public class DescribeDataMaskingRunHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstType")
    private Integer dstType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MainProcessId")
    private Long mainProcessId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcTableName")
    private String srcTableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcType")
    private Integer srcType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
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
         * <p>The type of the service to which the de-identified data belongs. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder dstType(Integer dstType) {
            this.putQueryParameter("DstType", dstType);
            this.dstType = dstType;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1583856000000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Chinese</li>
         * <li><strong>en_us</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_cn</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * <blockquote>
         * <p>If a task has one or more subtasks, the value of the parameter must be the ID of the task. Otherwise, leave this parameter empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>366731</p>
         */
        public Builder mainProcessId(Long mainProcessId) {
            this.putQueryParameter("MainProcessId", mainProcessId);
            this.mainProcessId = mainProcessId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        public Builder srcTableName(String srcTableName) {
            this.putQueryParameter("SrcTableName", srcTableName);
            this.srcTableName = srcTableName;
            return this;
        }

        /**
         * <p>The type of the service to which the data to be de-identified belongs. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates Object Storage Service (OSS). The value indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder srcType(Integer srcType) {
            this.putQueryParameter("SrcType", srcType);
            this.srcType = srcType;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1582992000000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the de-identification task. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: waiting</li>
         * <li><strong>0</strong>: being executed</li>
         * <li><strong>1</strong>: executed</li>
         * <li><strong>2</strong>: failed to be executed</li>
         * <li><strong>3</strong>: terminated</li>
         * <li><strong>4</strong>: partially failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the de-identification task.</p>
         * 
         * <strong>example:</strong>
         * <p>mt4HBgtw1B******</p>
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
