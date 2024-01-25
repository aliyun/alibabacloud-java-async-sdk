// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHanaRestoresRequest} extends {@link RequestModel}
 *
 * <p>DescribeHanaRestoresRequest</p>
 */
public class DescribeHanaRestoresRequest extends Request {
    @Query
    @NameInMap("BackupId")
    private Long backupId;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DatabaseName")
    private String databaseName;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("RestoreId")
    private String restoreId;

    @Query
    @NameInMap("RestoreStatus")
    private String restoreStatus;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private DescribeHanaRestoresRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.clusterId = builder.clusterId;
        this.databaseName = builder.databaseName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.restoreId = builder.restoreId;
        this.restoreStatus = builder.restoreStatus;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHanaRestoresRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupId
     */
    public Long getBackupId() {
        return this.backupId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return restoreId
     */
    public String getRestoreId() {
        return this.restoreId;
    }

    /**
     * @return restoreStatus
     */
    public String getRestoreStatus() {
        return this.restoreStatus;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<DescribeHanaRestoresRequest, Builder> {
        private Long backupId; 
        private String clusterId; 
        private String databaseName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private String restoreId; 
        private String restoreStatus; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHanaRestoresRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.clusterId = request.clusterId;
            this.databaseName = request.databaseName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.restoreId = request.restoreId;
            this.restoreStatus = request.restoreStatus;
            this.vaultId = request.vaultId;
        } 

        /**
         * The ID of the backup.
         */
        public Builder backupId(Long backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * The ID of the SAP HANA instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 1 to 99. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the restore job.
         */
        public Builder restoreId(String restoreId) {
            this.putQueryParameter("RestoreId", restoreId);
            this.restoreId = restoreId;
            return this;
        }

        /**
         * The status of the restore job. Valid values:
         * <p>
         * 
         * *   **RUNNING**: The restore job is running.
         * *   **COMPLETE**: The restore job is completed.
         * *   **PARTIAL_COMPLETE**: The restore job is partially completed.
         * *   **FAILED**: The restore job has failed.
         * *   **CANCELED**: The restore job is canceled.
         * *   **EXPIRED**: The restore job has timed out.
         */
        public Builder restoreStatus(String restoreStatus) {
            this.putQueryParameter("RestoreStatus", restoreStatus);
            this.restoreStatus = restoreStatus;
            return this;
        }

        /**
         * The ID of the backup vault.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public DescribeHanaRestoresRequest build() {
            return new DescribeHanaRestoresRequest(this);
        } 

    } 

}
