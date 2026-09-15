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
 * {@link ListBackupRecordRequest} extends {@link RequestModel}
 *
 * <p>ListBackupRecordRequest</p>
 */
public class ListBackupRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupEndTime")
    private Long backupEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupStartTime")
    private Long backupStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineRemark")
    private String machineRemark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List<String> statusList;

    private ListBackupRecordRequest(Builder builder) {
        super(builder);
        this.backupEndTime = builder.backupEndTime;
        this.backupStartTime = builder.backupStartTime;
        this.currentPage = builder.currentPage;
        this.machineRemark = builder.machineRemark;
        this.pageSize = builder.pageSize;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBackupRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupEndTime
     */
    public Long getBackupEndTime() {
        return this.backupEndTime;
    }

    /**
     * @return backupStartTime
     */
    public Long getBackupStartTime() {
        return this.backupStartTime;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return machineRemark
     */
    public String getMachineRemark() {
        return this.machineRemark;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return statusList
     */
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<ListBackupRecordRequest, Builder> {
        private Long backupEndTime; 
        private Long backupStartTime; 
        private Integer currentPage; 
        private String machineRemark; 
        private Integer pageSize; 
        private java.util.List<String> statusList; 

        private Builder() {
            super();
        } 

        private Builder(ListBackupRecordRequest request) {
            super(request);
            this.backupEndTime = request.backupEndTime;
            this.backupStartTime = request.backupStartTime;
            this.currentPage = request.currentPage;
            this.machineRemark = request.machineRemark;
            this.pageSize = request.pageSize;
            this.statusList = request.statusList;
        } 

        /**
         * <p>The backup end time. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1699600611000</p>
         */
        public Builder backupEndTime(Long backupEndTime) {
            this.putQueryParameter("BackupEndTime", backupEndTime);
            this.backupEndTime = backupEndTime;
            return this;
        }

        /**
         * <p>The backup start time. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1699514211000</p>
         */
        public Builder backupStartTime(Long backupStartTime) {
            this.putQueryParameter("BackupStartTime", backupStartTime);
            this.backupStartTime = backupStartTime;
            return this;
        }

        /**
         * <p>The page number of the page to return. Default value: <strong>1</strong>, which indicates the first page.</p>
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
         * <p>The identification information of the server protected by the anti-ransomware policy that you want to query. You can enter the IP address or instance ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder machineRemark(String machineRemark) {
            this.putQueryParameter("MachineRemark", machineRemark);
            this.machineRemark = machineRemark;
            return this;
        }

        /**
         * <p>The maximum number of entries per page in a paged query. Default value: 20. If you leave this parameter empty, 20 entries are returned.</p>
         * <blockquote>
         * <p>Do not leave PageSize empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of backup task statuses. Valid values:</p>
         * <ul>
         * <li><strong>BACKUP_COMPLETE</strong>: backup succeeded</li>
         * <li><strong>BACKUP_FAILED</strong>: backup failed</li>
         * <li><strong>PARTIAL_COMPLETE</strong>: partial backup succeeded.</li>
         * </ul>
         */
        public Builder statusList(java.util.List<String> statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        @Override
        public ListBackupRecordRequest build() {
            return new ListBackupRecordRequest(this);
        } 

    } 

}
