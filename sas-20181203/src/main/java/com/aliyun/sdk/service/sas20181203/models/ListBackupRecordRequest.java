// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    private java.util.List < String > statusList;

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
    public java.util.List < String > getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<ListBackupRecordRequest, Builder> {
        private Long backupEndTime; 
        private Long backupStartTime; 
        private Integer currentPage; 
        private String machineRemark; 
        private Integer pageSize; 
        private java.util.List < String > statusList; 

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
         * <p>The timestamp when the backup task ended. Unit: milliseconds.</p>
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
         * <p>The timestamp when the backup task started. Unit: milliseconds.</p>
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
         * <p>The page number. Default value: <strong>1</strong>. Pages start from page 1.</p>
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
         * <p>The information that you want to use to identify the servers protected by the anti-ransomware policy. You can enter the IP address or ID of a server.</p>
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
         * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * <blockquote>
         * <p> We recommend that you do not leave this parameter empty.</p>
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
         * <p>The backup task status. Valid values:</p>
         * <ul>
         * <li><strong>BACKUP_COMPLETE</strong>: The backup task is successful.</li>
         * <li><strong>BACKUP_FAILED</strong>: The backup task failed.</li>
         * <li><strong>PARTIAL_COMPLETE</strong>: The backup task is partially successful.</li>
         * </ul>
         */
        public Builder statusList(java.util.List < String > statusList) {
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
