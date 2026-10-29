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
 * {@link ListUniBackupRecordRequest} extends {@link RequestModel}
 *
 * <p>ListUniBackupRecordRequest</p>
 */
public class ListUniBackupRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupRegionId;

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
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private ListUniBackupRecordRequest(Builder builder) {
        super(builder);
        this.backupRegionId = builder.backupRegionId;
        this.currentPage = builder.currentPage;
        this.machineRemark = builder.machineRemark;
        this.pageSize = builder.pageSize;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUniBackupRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupRegionId
     */
    public String getBackupRegionId() {
        return this.backupRegionId;
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
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<ListUniBackupRecordRequest, Builder> {
        private String backupRegionId; 
        private Integer currentPage; 
        private String machineRemark; 
        private Integer pageSize; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(ListUniBackupRecordRequest request) {
            super(request);
            this.backupRegionId = request.backupRegionId;
            this.currentPage = request.currentPage;
            this.machineRemark = request.machineRemark;
            this.pageSize = request.pageSize;
            this.state = request.state;
        } 

        /**
         * <p>The region where the anti-ransomware backup service is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder backupRegionId(String backupRegionId) {
            this.putQueryParameter("BackupRegionId", backupRegionId);
            this.backupRegionId = backupRegionId;
            return this;
        }

        /**
         * <p>The Settings of the paging page number for the paged query. Default value: <strong>1</strong>.</p>
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
         * <p>1.1.XX.XX</p>
         */
        public Builder machineRemark(String machineRemark) {
            this.putQueryParameter("MachineRemark", machineRemark);
            this.machineRemark = machineRemark;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page for the paged query. This paging parameter defines the page size.</p>
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
         * <p>The backup status. Valid values:</p>
         * <ul>
         * <li><strong>completed</strong>: Successful.</li>
         * <li><strong>error</strong>: Failed.</li>
         * <li><strong>canceled</strong>: Canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public ListUniBackupRecordRequest build() {
            return new ListUniBackupRecordRequest(this);
        } 

    } 

}
