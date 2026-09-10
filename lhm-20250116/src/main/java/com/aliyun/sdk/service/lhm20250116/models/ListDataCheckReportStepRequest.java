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
 * {@link ListDataCheckReportStepRequest} extends {@link RequestModel}
 *
 * <p>ListDataCheckReportStepRequest</p>
 */
public class ListDataCheckReportStepRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("checkResult")
    private Integer checkResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("jobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("jobStatus")
    private Integer jobStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private ListDataCheckReportStepRequest(Builder builder) {
        super(builder);
        this.checkResult = builder.checkResult;
        this.jobId = builder.jobId;
        this.jobStatus = builder.jobStatus;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataCheckReportStepRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkResult
     */
    public Integer getCheckResult() {
        return this.checkResult;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
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

    public static final class Builder extends Request.Builder<ListDataCheckReportStepRequest, Builder> {
        private Integer checkResult; 
        private Long jobId; 
        private Integer jobStatus; 
        private Integer pageIndex; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListDataCheckReportStepRequest request) {
            super(request);
            this.checkResult = request.checkResult;
            this.jobId = request.jobId;
            this.jobStatus = request.jobStatus;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The verification result filter. Valid values:</p>
         * <ul>
         * <li>0: no record.</li>
         * <li>1: passed.</li>
         * <li>2: failed.</li>
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
         * <p>The job database ID (integer) that identifies a verification sub-job. This parameter differs in format from the UUID-format sub-job ID (string) used in the operation that queries step details by UUID. The two are not interchangeable.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The step status filter. Valid values:</p>
         * <ul>
         * <li>0: INIT.</li>
         * <li>1: RUNNING.</li>
         * <li>2: FINISHED.</li>
         * <li>3: STOPPED.</li>
         * <li>4: FAIL.</li>
         * <li>6: READY.</li>
         * <li>7: SKIPPED.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder jobStatus(Integer jobStatus) {
            this.putQueryParameter("jobStatus", jobStatus);
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListDataCheckReportStepRequest build() {
            return new ListDataCheckReportStepRequest(this);
        } 

    } 

}
