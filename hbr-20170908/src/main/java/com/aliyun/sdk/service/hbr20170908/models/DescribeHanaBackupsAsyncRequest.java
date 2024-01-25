// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHanaBackupsAsyncRequest} extends {@link RequestModel}
 *
 * <p>DescribeHanaBackupsAsyncRequest</p>
 */
public class DescribeHanaBackupsAsyncRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DatabaseName")
    private String databaseName;

    @Query
    @NameInMap("IncludeDifferential")
    private Boolean includeDifferential;

    @Query
    @NameInMap("IncludeIncremental")
    private Boolean includeIncremental;

    @Query
    @NameInMap("IncludeLog")
    private Boolean includeLog;

    @Query
    @NameInMap("LogPosition")
    private Long logPosition;

    @Query
    @NameInMap("Mode")
    private String mode;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("RecoveryPointInTime")
    private Long recoveryPointInTime;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SourceClusterId")
    private String sourceClusterId;

    @Query
    @NameInMap("SystemCopy")
    private Boolean systemCopy;

    @Query
    @NameInMap("UseBackint")
    private Boolean useBackint;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    @Query
    @NameInMap("VolumeId")
    private Integer volumeId;

    private DescribeHanaBackupsAsyncRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.databaseName = builder.databaseName;
        this.includeDifferential = builder.includeDifferential;
        this.includeIncremental = builder.includeIncremental;
        this.includeLog = builder.includeLog;
        this.logPosition = builder.logPosition;
        this.mode = builder.mode;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.recoveryPointInTime = builder.recoveryPointInTime;
        this.resourceGroupId = builder.resourceGroupId;
        this.source = builder.source;
        this.sourceClusterId = builder.sourceClusterId;
        this.systemCopy = builder.systemCopy;
        this.useBackint = builder.useBackint;
        this.vaultId = builder.vaultId;
        this.volumeId = builder.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHanaBackupsAsyncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return includeDifferential
     */
    public Boolean getIncludeDifferential() {
        return this.includeDifferential;
    }

    /**
     * @return includeIncremental
     */
    public Boolean getIncludeIncremental() {
        return this.includeIncremental;
    }

    /**
     * @return includeLog
     */
    public Boolean getIncludeLog() {
        return this.includeLog;
    }

    /**
     * @return logPosition
     */
    public Long getLogPosition() {
        return this.logPosition;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
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
     * @return recoveryPointInTime
     */
    public Long getRecoveryPointInTime() {
        return this.recoveryPointInTime;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceClusterId
     */
    public String getSourceClusterId() {
        return this.sourceClusterId;
    }

    /**
     * @return systemCopy
     */
    public Boolean getSystemCopy() {
        return this.systemCopy;
    }

    /**
     * @return useBackint
     */
    public Boolean getUseBackint() {
        return this.useBackint;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    /**
     * @return volumeId
     */
    public Integer getVolumeId() {
        return this.volumeId;
    }

    public static final class Builder extends Request.Builder<DescribeHanaBackupsAsyncRequest, Builder> {
        private String clusterId; 
        private String databaseName; 
        private Boolean includeDifferential; 
        private Boolean includeIncremental; 
        private Boolean includeLog; 
        private Long logPosition; 
        private String mode; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long recoveryPointInTime; 
        private String resourceGroupId; 
        private String source; 
        private String sourceClusterId; 
        private Boolean systemCopy; 
        private Boolean useBackint; 
        private String vaultId; 
        private Integer volumeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHanaBackupsAsyncRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.databaseName = request.databaseName;
            this.includeDifferential = request.includeDifferential;
            this.includeIncremental = request.includeIncremental;
            this.includeLog = request.includeLog;
            this.logPosition = request.logPosition;
            this.mode = request.mode;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.recoveryPointInTime = request.recoveryPointInTime;
            this.resourceGroupId = request.resourceGroupId;
            this.source = request.source;
            this.sourceClusterId = request.sourceClusterId;
            this.systemCopy = request.systemCopy;
            this.useBackint = request.useBackint;
            this.vaultId = request.vaultId;
            this.volumeId = request.volumeId;
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
         * Specifies whether to include differential backups in the query results. Valid values:
         * <p>
         * 
         * *   true: includes differential backups.
         * *   false: excludes differential backups.
         */
        public Builder includeDifferential(Boolean includeDifferential) {
            this.putQueryParameter("IncludeDifferential", includeDifferential);
            this.includeDifferential = includeDifferential;
            return this;
        }

        /**
         * Specifies whether to include incremental backups in the query results. Valid values:
         * <p>
         * 
         * *   true: includes incremental backups.
         * *   false: excludes incremental backups.
         */
        public Builder includeIncremental(Boolean includeIncremental) {
            this.putQueryParameter("IncludeIncremental", includeIncremental);
            this.includeIncremental = includeIncremental;
            return this;
        }

        /**
         * Specifies whether to include log backups in the query results. Valid values:
         * <p>
         * 
         * *   true: includes log backups.
         * *   false: excludes log backups.
         */
        public Builder includeLog(Boolean includeLog) {
            this.putQueryParameter("IncludeLog", includeLog);
            this.includeLog = includeLog;
            return this;
        }

        /**
         * The log position to which you want to restore the database. This parameter is valid only if you set the Mode parameter to **RECOVERY_TO_LOG_POSITION**.
         */
        public Builder logPosition(Long logPosition) {
            this.putQueryParameter("LogPosition", logPosition);
            this.logPosition = logPosition;
            return this;
        }

        /**
         * The recovery mode. Valid values:
         * <p>
         * 
         * *   **RECOVERY_TO_MOST_RECENT**: restores the database to the recently available state to which the database has been backed up.
         * *   **RECOVERY_TO_POINT_IN_TIME**: restores the database to a specified point in time.
         * *   **RECOVERY_TO_SPECIFIC_BACKUP**: restores the database to a specified backup.
         * *   **RECOVERY_TO_LOG_POSITION**: restores the database to a specified log position.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
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
         * The point in time to which you want to restore the database. This parameter is valid only if you set the Mode parameter to **RECOVERY_TO_POINT_IN_TIME**. HBR restores the database to a state closest to the specified point in time.
         */
        public Builder recoveryPointInTime(Long recoveryPointInTime) {
            this.putQueryParameter("RecoveryPointInTime", recoveryPointInTime);
            this.recoveryPointInTime = recoveryPointInTime;
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
         * The name of the source system. This parameter specifies the name of the source database that you want to restore. You must set the parameter in the `<Source database name>@SID` format.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The ID of the source SAP HANA instance.
         */
        public Builder sourceClusterId(String sourceClusterId) {
            this.putQueryParameter("SourceClusterId", sourceClusterId);
            this.sourceClusterId = sourceClusterId;
            return this;
        }

        /**
         * Specifies whether to restore the database to a different instance. Valid values:
         * <p>
         * 
         * *   true: restores the database to a different instance.
         * *   false: restores the database within the same instance.
         */
        public Builder systemCopy(Boolean systemCopy) {
            this.putQueryParameter("SystemCopy", systemCopy);
            this.systemCopy = systemCopy;
            return this;
        }

        /**
         * Specifies whether Backint is used. Valid values:
         * <p>
         * 
         * *   true: Backint is used.
         * *   false: Backint is not used.
         */
        public Builder useBackint(Boolean useBackint) {
            this.putQueryParameter("UseBackint", useBackint);
            this.useBackint = useBackint;
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

        /**
         * The ID of the volume that you want to restore. This parameter is valid only if you set the Mode parameter to **RECOVERY_TO_LOG_POSITION**.
         */
        public Builder volumeId(Integer volumeId) {
            this.putQueryParameter("VolumeId", volumeId);
            this.volumeId = volumeId;
            return this;
        }

        @Override
        public DescribeHanaBackupsAsyncRequest build() {
            return new DescribeHanaBackupsAsyncRequest(this);
        } 

    } 

}
