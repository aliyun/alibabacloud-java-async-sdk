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
         * checkResult.
         */
        public Builder checkResult(Integer checkResult) {
            this.putBodyParameter("checkResult", checkResult);
            this.checkResult = checkResult;
            return this;
        }

        /**
         * jobStatus.
         */
        public Builder jobStatus(Integer jobStatus) {
            this.putBodyParameter("jobStatus", jobStatus);
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * pageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putBodyParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * tableName.
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
