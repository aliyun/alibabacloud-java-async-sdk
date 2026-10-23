// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DescribeHanaRestoresResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHanaRestoresResponseBody</p>
 */
public class DescribeHanaRestoresResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HanaRestore")
    private HanaRestore hanaRestore;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHanaRestoresResponseBody(Builder builder) {
        this.code = builder.code;
        this.hanaRestore = builder.hanaRestore;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHanaRestoresResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return hanaRestore
     */
    public HanaRestore getHanaRestore() {
        return this.hanaRestore;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private HanaRestore hanaRestore; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeHanaRestoresResponseBody model) {
            this.code = model.code;
            this.hanaRestore = model.hanaRestore;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The response code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HanaRestore.
         */
        public Builder hanaRestore(HanaRestore hanaRestore) {
            this.hanaRestore = hanaRestore;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
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
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7DEFC897-8F05-5C05-912C-C9A9510FBFF1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHanaRestoresResponseBody build() {
            return new DescribeHanaRestoresResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHanaRestoresResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHanaRestoresResponseBody</p>
     */
    public static class HanaRestores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupID")
        private Long backupID;

        @com.aliyun.core.annotation.NameInMap("BackupPrefix")
        private String backupPrefix;

        @com.aliyun.core.annotation.NameInMap("CheckAccess")
        private Boolean checkAccess;

        @com.aliyun.core.annotation.NameInMap("ClearLog")
        private Boolean clearLog;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CurrentPhase")
        private Integer currentPhase;

        @com.aliyun.core.annotation.NameInMap("CurrentProgress")
        private Long currentProgress;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("DatabaseRestoreId")
        private Long databaseRestoreId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("LogPosition")
        private Long logPosition;

        @com.aliyun.core.annotation.NameInMap("MaxPhase")
        private Integer maxPhase;

        @com.aliyun.core.annotation.NameInMap("MaxProgress")
        private Long maxProgress;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("ReachedTime")
        private Long reachedTime;

        @com.aliyun.core.annotation.NameInMap("RecoveryPointInTime")
        private Long recoveryPointInTime;

        @com.aliyun.core.annotation.NameInMap("RestoreId")
        private String restoreId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceClusterId")
        private String sourceClusterId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SystemCopy")
        private Boolean systemCopy;

        @com.aliyun.core.annotation.NameInMap("UseCatalog")
        private Boolean useCatalog;

        @com.aliyun.core.annotation.NameInMap("UseDelta")
        private Boolean useDelta;

        @com.aliyun.core.annotation.NameInMap("VaultId")
        private String vaultId;

        @com.aliyun.core.annotation.NameInMap("VolumeId")
        private Integer volumeId;

        private HanaRestores(Builder builder) {
            this.backupID = builder.backupID;
            this.backupPrefix = builder.backupPrefix;
            this.checkAccess = builder.checkAccess;
            this.clearLog = builder.clearLog;
            this.clusterId = builder.clusterId;
            this.currentPhase = builder.currentPhase;
            this.currentProgress = builder.currentProgress;
            this.databaseName = builder.databaseName;
            this.databaseRestoreId = builder.databaseRestoreId;
            this.endTime = builder.endTime;
            this.logPosition = builder.logPosition;
            this.maxPhase = builder.maxPhase;
            this.maxProgress = builder.maxProgress;
            this.message = builder.message;
            this.mode = builder.mode;
            this.phase = builder.phase;
            this.reachedTime = builder.reachedTime;
            this.recoveryPointInTime = builder.recoveryPointInTime;
            this.restoreId = builder.restoreId;
            this.source = builder.source;
            this.sourceClusterId = builder.sourceClusterId;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.status = builder.status;
            this.systemCopy = builder.systemCopy;
            this.useCatalog = builder.useCatalog;
            this.useDelta = builder.useDelta;
            this.vaultId = builder.vaultId;
            this.volumeId = builder.volumeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HanaRestores create() {
            return builder().build();
        }

        /**
         * @return backupID
         */
        public Long getBackupID() {
            return this.backupID;
        }

        /**
         * @return backupPrefix
         */
        public String getBackupPrefix() {
            return this.backupPrefix;
        }

        /**
         * @return checkAccess
         */
        public Boolean getCheckAccess() {
            return this.checkAccess;
        }

        /**
         * @return clearLog
         */
        public Boolean getClearLog() {
            return this.clearLog;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return currentPhase
         */
        public Integer getCurrentPhase() {
            return this.currentPhase;
        }

        /**
         * @return currentProgress
         */
        public Long getCurrentProgress() {
            return this.currentProgress;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return databaseRestoreId
         */
        public Long getDatabaseRestoreId() {
            return this.databaseRestoreId;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return logPosition
         */
        public Long getLogPosition() {
            return this.logPosition;
        }

        /**
         * @return maxPhase
         */
        public Integer getMaxPhase() {
            return this.maxPhase;
        }

        /**
         * @return maxProgress
         */
        public Long getMaxProgress() {
            return this.maxProgress;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return reachedTime
         */
        public Long getReachedTime() {
            return this.reachedTime;
        }

        /**
         * @return recoveryPointInTime
         */
        public Long getRecoveryPointInTime() {
            return this.recoveryPointInTime;
        }

        /**
         * @return restoreId
         */
        public String getRestoreId() {
            return this.restoreId;
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
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return systemCopy
         */
        public Boolean getSystemCopy() {
            return this.systemCopy;
        }

        /**
         * @return useCatalog
         */
        public Boolean getUseCatalog() {
            return this.useCatalog;
        }

        /**
         * @return useDelta
         */
        public Boolean getUseDelta() {
            return this.useDelta;
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

        public static final class Builder {
            private Long backupID; 
            private String backupPrefix; 
            private Boolean checkAccess; 
            private Boolean clearLog; 
            private String clusterId; 
            private Integer currentPhase; 
            private Long currentProgress; 
            private String databaseName; 
            private Long databaseRestoreId; 
            private Long endTime; 
            private Long logPosition; 
            private Integer maxPhase; 
            private Long maxProgress; 
            private String message; 
            private String mode; 
            private String phase; 
            private Long reachedTime; 
            private Long recoveryPointInTime; 
            private String restoreId; 
            private String source; 
            private String sourceClusterId; 
            private Long startTime; 
            private String state; 
            private String status; 
            private Boolean systemCopy; 
            private Boolean useCatalog; 
            private Boolean useDelta; 
            private String vaultId; 
            private Integer volumeId; 

            private Builder() {
            } 

            private Builder(HanaRestores model) {
                this.backupID = model.backupID;
                this.backupPrefix = model.backupPrefix;
                this.checkAccess = model.checkAccess;
                this.clearLog = model.clearLog;
                this.clusterId = model.clusterId;
                this.currentPhase = model.currentPhase;
                this.currentProgress = model.currentProgress;
                this.databaseName = model.databaseName;
                this.databaseRestoreId = model.databaseRestoreId;
                this.endTime = model.endTime;
                this.logPosition = model.logPosition;
                this.maxPhase = model.maxPhase;
                this.maxProgress = model.maxProgress;
                this.message = model.message;
                this.mode = model.mode;
                this.phase = model.phase;
                this.reachedTime = model.reachedTime;
                this.recoveryPointInTime = model.recoveryPointInTime;
                this.restoreId = model.restoreId;
                this.source = model.source;
                this.sourceClusterId = model.sourceClusterId;
                this.startTime = model.startTime;
                this.state = model.state;
                this.status = model.status;
                this.systemCopy = model.systemCopy;
                this.useCatalog = model.useCatalog;
                this.useDelta = model.useDelta;
                this.vaultId = model.vaultId;
                this.volumeId = model.volumeId;
            } 

            /**
             * BackupID.
             */
            public Builder backupID(Long backupID) {
                this.backupID = backupID;
                return this;
            }

            /**
             * BackupPrefix.
             */
            public Builder backupPrefix(String backupPrefix) {
                this.backupPrefix = backupPrefix;
                return this;
            }

            /**
             * CheckAccess.
             */
            public Builder checkAccess(Boolean checkAccess) {
                this.checkAccess = checkAccess;
                return this;
            }

            /**
             * ClearLog.
             */
            public Builder clearLog(Boolean clearLog) {
                this.clearLog = clearLog;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * CurrentPhase.
             */
            public Builder currentPhase(Integer currentPhase) {
                this.currentPhase = currentPhase;
                return this;
            }

            /**
             * CurrentProgress.
             */
            public Builder currentProgress(Long currentProgress) {
                this.currentProgress = currentProgress;
                return this;
            }

            /**
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * DatabaseRestoreId.
             */
            public Builder databaseRestoreId(Long databaseRestoreId) {
                this.databaseRestoreId = databaseRestoreId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * LogPosition.
             */
            public Builder logPosition(Long logPosition) {
                this.logPosition = logPosition;
                return this;
            }

            /**
             * MaxPhase.
             */
            public Builder maxPhase(Integer maxPhase) {
                this.maxPhase = maxPhase;
                return this;
            }

            /**
             * MaxProgress.
             */
            public Builder maxProgress(Long maxProgress) {
                this.maxProgress = maxProgress;
                return this;
            }

            /**
             * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>successful</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Phase.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * ReachedTime.
             */
            public Builder reachedTime(Long reachedTime) {
                this.reachedTime = reachedTime;
                return this;
            }

            /**
             * RecoveryPointInTime.
             */
            public Builder recoveryPointInTime(Long recoveryPointInTime) {
                this.recoveryPointInTime = recoveryPointInTime;
                return this;
            }

            /**
             * RestoreId.
             */
            public Builder restoreId(String restoreId) {
                this.restoreId = restoreId;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SourceClusterId.
             */
            public Builder sourceClusterId(String sourceClusterId) {
                this.sourceClusterId = sourceClusterId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SystemCopy.
             */
            public Builder systemCopy(Boolean systemCopy) {
                this.systemCopy = systemCopy;
                return this;
            }

            /**
             * UseCatalog.
             */
            public Builder useCatalog(Boolean useCatalog) {
                this.useCatalog = useCatalog;
                return this;
            }

            /**
             * UseDelta.
             */
            public Builder useDelta(Boolean useDelta) {
                this.useDelta = useDelta;
                return this;
            }

            /**
             * VaultId.
             */
            public Builder vaultId(String vaultId) {
                this.vaultId = vaultId;
                return this;
            }

            /**
             * VolumeId.
             */
            public Builder volumeId(Integer volumeId) {
                this.volumeId = volumeId;
                return this;
            }

            public HanaRestores build() {
                return new HanaRestores(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHanaRestoresResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHanaRestoresResponseBody</p>
     */
    public static class HanaRestore extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HanaRestores")
        private java.util.List<HanaRestores> hanaRestores;

        private HanaRestore(Builder builder) {
            this.hanaRestores = builder.hanaRestores;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HanaRestore create() {
            return builder().build();
        }

        /**
         * @return hanaRestores
         */
        public java.util.List<HanaRestores> getHanaRestores() {
            return this.hanaRestores;
        }

        public static final class Builder {
            private java.util.List<HanaRestores> hanaRestores; 

            private Builder() {
            } 

            private Builder(HanaRestore model) {
                this.hanaRestores = model.hanaRestores;
            } 

            /**
             * HanaRestores.
             */
            public Builder hanaRestores(java.util.List<HanaRestores> hanaRestores) {
                this.hanaRestores = hanaRestores;
                return this;
            }

            public HanaRestore build() {
                return new HanaRestore(this);
            } 

        } 

    }
}
