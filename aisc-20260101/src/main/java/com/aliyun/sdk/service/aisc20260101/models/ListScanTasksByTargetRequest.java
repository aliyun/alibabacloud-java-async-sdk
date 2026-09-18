// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link ListScanTasksByTargetRequest} extends {@link RequestModel}
 *
 * <p>ListScanTasksByTargetRequest</p>
 */
public class ListScanTasksByTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SampleLevel")
    private String sampleLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanType")
    private String scanType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    private ListScanTasksByTargetRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sampleLevel = builder.sampleLevel;
        this.scanType = builder.scanType;
        this.targetId = builder.targetId;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScanTasksByTargetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return sampleLevel
     */
    public String getSampleLevel() {
        return this.sampleLevel;
    }

    /**
     * @return scanType
     */
    public String getScanType() {
        return this.scanType;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder extends Request.Builder<ListScanTasksByTargetRequest, Builder> {
        private String pageNumber; 
        private String pageSize; 
        private String sampleLevel; 
        private String scanType; 
        private String targetId; 
        private String taskStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListScanTasksByTargetRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sampleLevel = request.sampleLevel;
            this.scanType = request.scanType;
            this.targetId = request.targetId;
            this.taskStatus = request.taskStatus;
        } 

        /**
         * <p>The page number, starting from 1. Values less than 1 are normalized to 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100. Values greater than 100 are clamped to 100. Values less than 1 return HTTP status code 400.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Filters by detection intensity. If this parameter is not specified, no filtering by intensity is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder sampleLevel(String sampleLevel) {
            this.putQueryParameter("SampleLevel", sampleLevel);
            this.sampleLevel = sampleLevel;
            return this;
        }

        /**
         * <p>Filters by scan type. If this parameter is not specified, tasks of all scan types are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>attack</p>
         */
        public Builder scanType(String scanType) {
            this.putQueryParameter("ScanType", scanType);
            this.scanType = scanType;
            return this;
        }

        /**
         * <p>The unique identifier of the scan target. Only tasks under this target are queried. If the target does not exist or does not belong to the current tenant, HTTP status code 400 is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>target-abc123def4567</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>Filters by task status. If this parameter is not specified, tasks in all statuses are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.putQueryParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        @Override
        public ListScanTasksByTargetRequest build() {
            return new ListScanTasksByTargetRequest(this);
        } 

    } 

}
