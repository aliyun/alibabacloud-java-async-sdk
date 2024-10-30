// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHanaBackupsAsyncRequest} extends {@link RequestModel}
 *
 * <p>DescribeHanaBackupsAsyncRequest</p>
 */
public class DescribeHanaBackupsAsyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeDifferential")
    private Boolean includeDifferential;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeIncremental")
    private Boolean includeIncremental;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeLog")
    private Boolean includeLog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogPosition")
    private Long logPosition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecoveryPointInTime")
    private Long recoveryPointInTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceClusterId")
    private String sourceClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemCopy")
    private Boolean systemCopy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseBackint")
    private Boolean useBackint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
    private String vaultId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeId")
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
         * <p>The ID of the SAP HANA instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-00098******yuqvu</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>BPD</p>
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>Specifies whether to include differential backups in the query results. Valid values:</p>
         * <ul>
         * <li>true: includes differential backups.</li>
         * <li>false: excludes differential backups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeDifferential(Boolean includeDifferential) {
            this.putQueryParameter("IncludeDifferential", includeDifferential);
            this.includeDifferential = includeDifferential;
            return this;
        }

        /**
         * <p>Specifies whether to include incremental backups in the query results. Valid values:</p>
         * <ul>
         * <li>true: includes incremental backups.</li>
         * <li>false: excludes incremental backups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeIncremental(Boolean includeIncremental) {
            this.putQueryParameter("IncludeIncremental", includeIncremental);
            this.includeIncremental = includeIncremental;
            return this;
        }

        /**
         * <p>Specifies whether to include log backups in the query results. Valid values:</p>
         * <ul>
         * <li>true: includes log backups.</li>
         * <li>false: excludes log backups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeLog(Boolean includeLog) {
            this.putQueryParameter("IncludeLog", includeLog);
            this.includeLog = includeLog;
            return this;
        }

        /**
         * <p>The log position to which you want to restore the database. This parameter is valid only if you set the Mode parameter to <strong>RECOVERY_TO_LOG_POSITION</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder logPosition(Long logPosition) {
            this.putQueryParameter("LogPosition", logPosition);
            this.logPosition = logPosition;
            return this;
        }

        /**
         * <p>The recovery mode. Valid values:</p>
         * <ul>
         * <li><strong>RECOVERY_TO_MOST_RECENT</strong>: restores the database to the recently available state to which the database has been backed up.</li>
         * <li><strong>RECOVERY_TO_POINT_IN_TIME</strong>: restores the database to a specified point in time.</li>
         * <li><strong>RECOVERY_TO_SPECIFIC_BACKUP</strong>: restores the database to a specified backup.</li>
         * <li><strong>RECOVERY_TO_LOG_POSITION</strong>: restores the database to a specified log position.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RECOVERY_TO_SPECIFIC_BACKUP</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The point in time to which you want to restore the database. This parameter is valid only if you set the Mode parameter to <strong>RECOVERY_TO_POINT_IN_TIME</strong>. Cloud Backup restores the database to a state closest to the specified point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>1649851200</p>
         */
        public Builder recoveryPointInTime(Long recoveryPointInTime) {
            this.putQueryParameter("RecoveryPointInTime", recoveryPointInTime);
            this.recoveryPointInTime = recoveryPointInTime;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmz7mced2ldhy</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The name of the source system. This parameter specifies the name of the source database that you want to restore. You must set the parameter in the <code>&lt;Source database name&gt;@SID</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>P01@HP1</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The ID of the source SAP HANA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-0000g3m******5cj</p>
         */
        public Builder sourceClusterId(String sourceClusterId) {
            this.putQueryParameter("SourceClusterId", sourceClusterId);
            this.sourceClusterId = sourceClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to restore the database to a different instance.</p>
         * <ul>
         * <li>true: restores the database to a different instance.</li>
         * <li>false: restores the database within the same instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder systemCopy(Boolean systemCopy) {
            this.putQueryParameter("SystemCopy", systemCopy);
            this.systemCopy = systemCopy;
            return this;
        }

        /**
         * <p>Specifies whether Backint is used. Valid values:</p>
         * <ul>
         * <li>true: Backint is used.</li>
         * <li>false: Backint is not used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useBackint(Boolean useBackint) {
            this.putQueryParameter("UseBackint", useBackint);
            this.useBackint = useBackint;
            return this;
        }

        /**
         * <p>The ID of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-000270c******pi81</p>
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        /**
         * <p>The ID of the volume that you want to restore. This parameter is valid only if you set the Mode parameter to <strong>RECOVERY_TO_LOG_POSITION</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
