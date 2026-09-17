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
 * {@link ListDataCheckReportRequest} extends {@link RequestModel}
 *
 * <p>ListDataCheckReportRequest</p>
 */
public class ListDataCheckReportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("batchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long batchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("checkResult")
    private Integer checkResult;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jobStatus")
    private Integer jobStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    private ListDataCheckReportRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.checkResult = builder.checkResult;
        this.jobStatus = builder.jobStatus;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataCheckReportRequest create() {
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
     * @return jobStatus
     */
    public Integer getJobStatus() {
        return this.jobStatus;
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
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<ListDataCheckReportRequest, Builder> {
        private Long batchId; 
        private Integer checkResult; 
        private Integer jobStatus; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(ListDataCheckReportRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.checkResult = request.checkResult;
            this.jobStatus = request.jobStatus;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.tableName = request.tableName;
        } 

        /**
         * <p>The validation job (batch) ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        public Builder batchId(Long batchId) {
            this.putBodyParameter("batchId", batchId);
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
            this.putBodyParameter("checkResult", checkResult);
            this.checkResult = checkResult;
            return this;
        }

        /**
         * <p>Filters by job status. Valid values:</p>
         * <ul>
         * <li>0: INIT (pending).</li>
         * <li>1: RUNNING (running).</li>
         * <li>2: FINISHED (completed).</li>
         * <li>3: STOPPED (stopped).</li>
         * <li>4: FAIL (failed).</li>
         * <li>6: READY (ready).</li>
         * <li>7: SKIPPED (skipped).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder jobStatus(Integer jobStatus) {
            this.putBodyParameter("jobStatus", jobStatus);
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * <p>The page number. Minimum value: 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putBodyParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The table name to filter by.</p>
         * 
         * <strong>example:</strong>
         * <p>dim_func_with_diff_area_data_d</p>
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("tableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public ListDataCheckReportRequest build() {
            return new ListDataCheckReportRequest(this);
        } 

    } 

}
