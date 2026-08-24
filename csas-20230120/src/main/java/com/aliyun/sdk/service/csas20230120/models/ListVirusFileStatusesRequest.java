// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListVirusFileStatusesRequest} extends {@link RequestModel}
 *
 * <p>ListVirusFileStatusesRequest</p>
 */
public class ListVirusFileStatusesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Department")
    private String department;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DevTag")
    private String devTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DevType")
    private String devType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileMd5")
    private String fileMd5;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileProcessStatus")
    private String fileProcessStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operations")
    private java.util.List<String> operations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevels")
    private java.util.List<String> riskLevels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaseUserId")
    private String saseUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanTaskId")
    private String scanTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirusTypes")
    private java.util.List<String> virusTypes;

    private ListVirusFileStatusesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.department = builder.department;
        this.devTag = builder.devTag;
        this.devType = builder.devType;
        this.endTime = builder.endTime;
        this.fileMd5 = builder.fileMd5;
        this.fileProcessStatus = builder.fileProcessStatus;
        this.hostname = builder.hostname;
        this.operations = builder.operations;
        this.pageSize = builder.pageSize;
        this.riskLevels = builder.riskLevels;
        this.saseUserId = builder.saseUserId;
        this.scanTaskId = builder.scanTaskId;
        this.startTime = builder.startTime;
        this.username = builder.username;
        this.virusTypes = builder.virusTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusFileStatusesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return department
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * @return devTag
     */
    public String getDevTag() {
        return this.devTag;
    }

    /**
     * @return devType
     */
    public String getDevType() {
        return this.devType;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return fileMd5
     */
    public String getFileMd5() {
        return this.fileMd5;
    }

    /**
     * @return fileProcessStatus
     */
    public String getFileProcessStatus() {
        return this.fileProcessStatus;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return operations
     */
    public java.util.List<String> getOperations() {
        return this.operations;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return riskLevels
     */
    public java.util.List<String> getRiskLevels() {
        return this.riskLevels;
    }

    /**
     * @return saseUserId
     */
    public String getSaseUserId() {
        return this.saseUserId;
    }

    /**
     * @return scanTaskId
     */
    public String getScanTaskId() {
        return this.scanTaskId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return virusTypes
     */
    public java.util.List<String> getVirusTypes() {
        return this.virusTypes;
    }

    public static final class Builder extends Request.Builder<ListVirusFileStatusesRequest, Builder> {
        private Long currentPage; 
        private String department; 
        private String devTag; 
        private String devType; 
        private Long endTime; 
        private String fileMd5; 
        private String fileProcessStatus; 
        private String hostname; 
        private java.util.List<String> operations; 
        private Long pageSize; 
        private java.util.List<String> riskLevels; 
        private String saseUserId; 
        private String scanTaskId; 
        private Long startTime; 
        private String username; 
        private java.util.List<String> virusTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListVirusFileStatusesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.department = request.department;
            this.devTag = request.devTag;
            this.devType = request.devType;
            this.endTime = request.endTime;
            this.fileMd5 = request.fileMd5;
            this.fileProcessStatus = request.fileProcessStatus;
            this.hostname = request.hostname;
            this.operations = request.operations;
            this.pageSize = request.pageSize;
            this.riskLevels = request.riskLevels;
            this.saseUserId = request.saseUserId;
            this.scanTaskId = request.scanTaskId;
            this.startTime = request.startTime;
            this.username = request.username;
            this.virusTypes = request.virusTypes;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Department.
         */
        public Builder department(String department) {
            this.putQueryParameter("Department", department);
            this.department = department;
            return this;
        }

        /**
         * DevTag.
         */
        public Builder devTag(String devTag) {
            this.putQueryParameter("DevTag", devTag);
            this.devTag = devTag;
            return this;
        }

        /**
         * DevType.
         */
        public Builder devType(String devType) {
            this.putQueryParameter("DevType", devType);
            this.devType = devType;
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
         * FileMd5.
         */
        public Builder fileMd5(String fileMd5) {
            this.putQueryParameter("FileMd5", fileMd5);
            this.fileMd5 = fileMd5;
            return this;
        }

        /**
         * FileProcessStatus.
         */
        public Builder fileProcessStatus(String fileProcessStatus) {
            this.putQueryParameter("FileProcessStatus", fileProcessStatus);
            this.fileProcessStatus = fileProcessStatus;
            return this;
        }

        /**
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.putQueryParameter("Hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * Operations.
         */
        public Builder operations(java.util.List<String> operations) {
            this.putQueryParameter("Operations", operations);
            this.operations = operations;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RiskLevels.
         */
        public Builder riskLevels(java.util.List<String> riskLevels) {
            this.putQueryParameter("RiskLevels", riskLevels);
            this.riskLevels = riskLevels;
            return this;
        }

        /**
         * SaseUserId.
         */
        public Builder saseUserId(String saseUserId) {
            this.putQueryParameter("SaseUserId", saseUserId);
            this.saseUserId = saseUserId;
            return this;
        }

        /**
         * ScanTaskId.
         */
        public Builder scanTaskId(String scanTaskId) {
            this.putQueryParameter("ScanTaskId", scanTaskId);
            this.scanTaskId = scanTaskId;
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
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * VirusTypes.
         */
        public Builder virusTypes(java.util.List<String> virusTypes) {
            this.putQueryParameter("VirusTypes", virusTypes);
            this.virusTypes = virusTypes;
            return this;
        }

        @Override
        public ListVirusFileStatusesRequest build() {
            return new ListVirusFileStatusesRequest(this);
        } 

    } 

}
