// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ListDataCheckTaskHistoryRequest} extends {@link RequestModel}
 *
 * <p>ListDataCheckTaskHistoryRequest</p>
 */
public class ListDataCheckTaskHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("batchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long batchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("checkResult")
    private Integer checkResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createEndTime")
    private String createEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createStartTime")
    private String createStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("execEndTime")
    private String execEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("execStartTime")
    private String execStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("execStatus")
    private Integer execStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("finishEndTime")
    private String finishEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("finishStartTime")
    private String finishStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    private Long taskId;

    private ListDataCheckTaskHistoryRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.checkResult = builder.checkResult;
        this.createEndTime = builder.createEndTime;
        this.createStartTime = builder.createStartTime;
        this.execEndTime = builder.execEndTime;
        this.execStartTime = builder.execStartTime;
        this.execStatus = builder.execStatus;
        this.finishEndTime = builder.finishEndTime;
        this.finishStartTime = builder.finishStartTime;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataCheckTaskHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public Long getBatchId() {
        return this.batchId;
    }

    /**
     * @return checkResult
     */
    public Integer getCheckResult() {
        return this.checkResult;
    }

    /**
     * @return createEndTime
     */
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    /**
     * @return createStartTime
     */
    public String getCreateStartTime() {
        return this.createStartTime;
    }

    /**
     * @return execEndTime
     */
    public String getExecEndTime() {
        return this.execEndTime;
    }

    /**
     * @return execStartTime
     */
    public String getExecStartTime() {
        return this.execStartTime;
    }

    /**
     * @return execStatus
     */
    public Integer getExecStatus() {
        return this.execStatus;
    }

    /**
     * @return finishEndTime
     */
    public String getFinishEndTime() {
        return this.finishEndTime;
    }

    /**
     * @return finishStartTime
     */
    public String getFinishStartTime() {
        return this.finishStartTime;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
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
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ListDataCheckTaskHistoryRequest, Builder> {
        private Long batchId; 
        private Integer checkResult; 
        private String createEndTime; 
        private String createStartTime; 
        private String execEndTime; 
        private String execStartTime; 
        private Integer execStatus; 
        private String finishEndTime; 
        private String finishStartTime; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataCheckTaskHistoryRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.checkResult = request.checkResult;
            this.createEndTime = request.createEndTime;
            this.createStartTime = request.createStartTime;
            this.execEndTime = request.execEndTime;
            this.execStartTime = request.execStartTime;
            this.execStatus = request.execStatus;
            this.finishEndTime = request.finishEndTime;
            this.finishStartTime = request.finishStartTime;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The ID of the validation job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        public Builder batchId(Long batchId) {
            this.putQueryParameter("batchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * <p>Filters by validation result. Valid values:</p>
         * <ul>
         * <li>0: No records.</li>
         * <li>1: Passed.</li>
         * <li>2: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder checkResult(Integer checkResult) {
            this.putQueryParameter("checkResult", checkResult);
            this.checkResult = checkResult;
            return this;
        }

        /**
         * <p>The end of the job creation time filter range. Format: YYYY-MM-DD HH:MM:SS.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 10:00:00</p>
         */
        public Builder createEndTime(String createEndTime) {
            this.putQueryParameter("createEndTime", createEndTime);
            this.createEndTime = createEndTime;
            return this;
        }

        /**
         * <p>The start of the job creation time filter range. Format: YYYY-MM-DD HH:MM:SS.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 00:00:00</p>
         */
        public Builder createStartTime(String createStartTime) {
            this.putQueryParameter("createStartTime", createStartTime);
            this.createStartTime = createStartTime;
            return this;
        }

        /**
         * <p>The end of the execution start time filter range. Format: YYYY-MM-DD HH:MM:SS.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 12:00:00</p>
         */
        public Builder execEndTime(String execEndTime) {
            this.putQueryParameter("execEndTime", execEndTime);
            this.execEndTime = execEndTime;
            return this;
        }

        /**
         * <p>The start of the execution start time filter range. Format: YYYY-MM-DD HH:MM:SS.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 10:00:00</p>
         */
        public Builder execStartTime(String execStartTime) {
            this.putQueryParameter("execStartTime", execStartTime);
            this.execStartTime = execStartTime;
            return this;
        }

        /**
         * <p>Filters by execution status. Valid values:</p>
         * <ul>
         * <li>0: Pending.</li>
         * <li>1: Running.</li>
         * <li>2: Stopped.</li>
         * <li>3: Failed.</li>
         * <li>4: Completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder execStatus(Integer execStatus) {
            this.putQueryParameter("execStatus", execStatus);
            this.execStatus = execStatus;
            return this;
        }

        /**
         * <p>The end of the execution end time filter range. Format: YYYY-MM-DD HH:MM:SS.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 12:30:00</p>
         */
        public Builder finishEndTime(String finishEndTime) {
            this.putQueryParameter("finishEndTime", finishEndTime);
            this.finishEndTime = finishEndTime;
            return this;
        }

        /**
         * <p>The start of the execution end time filter range. Format: YYYY-MM-DD HH:MM:SS.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 10:30:00</p>
         */
        public Builder finishStartTime(String finishStartTime) {
            this.putQueryParameter("finishStartTime", finishStartTime);
            this.finishStartTime = finishStartTime;
            return this;
        }

        /**
         * <p>The page number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The maximum number of entries to return per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the data validation task.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ListDataCheckTaskHistoryRequest build() {
            return new ListDataCheckTaskHistoryRequest(this);
        } 

    } 

}
