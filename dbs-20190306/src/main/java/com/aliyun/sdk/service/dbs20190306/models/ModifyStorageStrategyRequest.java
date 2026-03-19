// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link ModifyStorageStrategyRequest} extends {@link RequestModel}
 *
 * <p>ModifyStorageStrategyRequest</p>
 */
public class ModifyStorageStrategyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupRetentionPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer backupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupStorageEncryptMethod")
    private String backupStorageEncryptMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DuplicationArchivePeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer duplicationArchivePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DuplicationInfrequentAccessPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer duplicationInfrequentAccessPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncrementBackupRetentionPeriod")
    private String incrementBackupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncrementDuplicationArchivePeriod")
    private String incrementDuplicationArchivePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncrementDuplicationInfrequentAccessPeriod")
    private String incrementDuplicationInfrequentAccessPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogBackupRetentionPeriod")
    private String logBackupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogDuplicationArchivePeriod")
    private String logDuplicationArchivePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogDuplicationInfrequentAccessPeriod")
    private String logDuplicationInfrequentAccessPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    private ModifyStorageStrategyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupPlanId = builder.backupPlanId;
        this.backupRetentionPeriod = builder.backupRetentionPeriod;
        this.backupStorageEncryptMethod = builder.backupStorageEncryptMethod;
        this.clientToken = builder.clientToken;
        this.duplicationArchivePeriod = builder.duplicationArchivePeriod;
        this.duplicationInfrequentAccessPeriod = builder.duplicationInfrequentAccessPeriod;
        this.incrementBackupRetentionPeriod = builder.incrementBackupRetentionPeriod;
        this.incrementDuplicationArchivePeriod = builder.incrementDuplicationArchivePeriod;
        this.incrementDuplicationInfrequentAccessPeriod = builder.incrementDuplicationInfrequentAccessPeriod;
        this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
        this.logDuplicationArchivePeriod = builder.logDuplicationArchivePeriod;
        this.logDuplicationInfrequentAccessPeriod = builder.logDuplicationInfrequentAccessPeriod;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStorageStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * @return backupRetentionPeriod
     */
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * @return backupStorageEncryptMethod
     */
    public String getBackupStorageEncryptMethod() {
        return this.backupStorageEncryptMethod;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return duplicationArchivePeriod
     */
    public Integer getDuplicationArchivePeriod() {
        return this.duplicationArchivePeriod;
    }

    /**
     * @return duplicationInfrequentAccessPeriod
     */
    public Integer getDuplicationInfrequentAccessPeriod() {
        return this.duplicationInfrequentAccessPeriod;
    }

    /**
     * @return incrementBackupRetentionPeriod
     */
    public String getIncrementBackupRetentionPeriod() {
        return this.incrementBackupRetentionPeriod;
    }

    /**
     * @return incrementDuplicationArchivePeriod
     */
    public String getIncrementDuplicationArchivePeriod() {
        return this.incrementDuplicationArchivePeriod;
    }

    /**
     * @return incrementDuplicationInfrequentAccessPeriod
     */
    public String getIncrementDuplicationInfrequentAccessPeriod() {
        return this.incrementDuplicationInfrequentAccessPeriod;
    }

    /**
     * @return logBackupRetentionPeriod
     */
    public String getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    /**
     * @return logDuplicationArchivePeriod
     */
    public String getLogDuplicationArchivePeriod() {
        return this.logDuplicationArchivePeriod;
    }

    /**
     * @return logDuplicationInfrequentAccessPeriod
     */
    public String getLogDuplicationInfrequentAccessPeriod() {
        return this.logDuplicationInfrequentAccessPeriod;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<ModifyStorageStrategyRequest, Builder> {
        private String regionId; 
        private String backupPlanId; 
        private Integer backupRetentionPeriod; 
        private String backupStorageEncryptMethod; 
        private String clientToken; 
        private Integer duplicationArchivePeriod; 
        private Integer duplicationInfrequentAccessPeriod; 
        private String incrementBackupRetentionPeriod; 
        private String incrementDuplicationArchivePeriod; 
        private String incrementDuplicationInfrequentAccessPeriod; 
        private String logBackupRetentionPeriod; 
        private String logDuplicationArchivePeriod; 
        private String logDuplicationInfrequentAccessPeriod; 
        private String ownerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStorageStrategyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupPlanId = request.backupPlanId;
            this.backupRetentionPeriod = request.backupRetentionPeriod;
            this.backupStorageEncryptMethod = request.backupStorageEncryptMethod;
            this.clientToken = request.clientToken;
            this.duplicationArchivePeriod = request.duplicationArchivePeriod;
            this.duplicationInfrequentAccessPeriod = request.duplicationInfrequentAccessPeriod;
            this.incrementBackupRetentionPeriod = request.incrementBackupRetentionPeriod;
            this.incrementDuplicationArchivePeriod = request.incrementDuplicationArchivePeriod;
            this.incrementDuplicationInfrequentAccessPeriod = request.incrementDuplicationInfrequentAccessPeriod;
            this.logBackupRetentionPeriod = request.logBackupRetentionPeriod;
            this.logDuplicationArchivePeriod = request.logDuplicationArchivePeriod;
            this.logDuplicationInfrequentAccessPeriod = request.logDuplicationInfrequentAccessPeriod;
            this.ownerId = request.ownerId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the backup schedule. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbsqdss5tmh****</p>
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * <p>The number of days for which the backup data is retained. Valid values: 0 to 1825.</p>
         * <blockquote>
         * <p>Default value: 730.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>730</p>
         */
        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            this.putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod);
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * BackupStorageEncryptMethod.
         */
        public Builder backupStorageEncryptMethod(String backupStorageEncryptMethod) {
            this.putQueryParameter("BackupStorageEncryptMethod", backupStorageEncryptMethod);
            this.backupStorageEncryptMethod = backupStorageEncryptMethod;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>dbstest</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The number of days after which the storage class of the backup data is changed to Archive. The value of this parameter must be smaller than the value of the BackupRetentionPeriod parameter. For more information about the Archive storage class, see <a href="https://help.aliyun.com/document_detail/51374.html">Storage class overview</a>.</p>
         * <blockquote>
         * <p>Default value: 365.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>366</p>
         */
        public Builder duplicationArchivePeriod(Integer duplicationArchivePeriod) {
            this.putQueryParameter("DuplicationArchivePeriod", duplicationArchivePeriod);
            this.duplicationArchivePeriod = duplicationArchivePeriod;
            return this;
        }

        /**
         * <p>The number of days after which the storage class of the backup data is changed to Infrequent Access (IA). The value of this parameter must be smaller than the value of the DuplicationArchivePeriod parameter. For more information about the IA storage class, see <a href="https://help.aliyun.com/document_detail/51374.html">Storage class overview</a>.</p>
         * <blockquote>
         * <p>Default value: 180.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>190</p>
         */
        public Builder duplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
            this.putQueryParameter("DuplicationInfrequentAccessPeriod", duplicationInfrequentAccessPeriod);
            this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
            return this;
        }

        /**
         * IncrementBackupRetentionPeriod.
         */
        public Builder incrementBackupRetentionPeriod(String incrementBackupRetentionPeriod) {
            this.putQueryParameter("IncrementBackupRetentionPeriod", incrementBackupRetentionPeriod);
            this.incrementBackupRetentionPeriod = incrementBackupRetentionPeriod;
            return this;
        }

        /**
         * IncrementDuplicationArchivePeriod.
         */
        public Builder incrementDuplicationArchivePeriod(String incrementDuplicationArchivePeriod) {
            this.putQueryParameter("IncrementDuplicationArchivePeriod", incrementDuplicationArchivePeriod);
            this.incrementDuplicationArchivePeriod = incrementDuplicationArchivePeriod;
            return this;
        }

        /**
         * IncrementDuplicationInfrequentAccessPeriod.
         */
        public Builder incrementDuplicationInfrequentAccessPeriod(String incrementDuplicationInfrequentAccessPeriod) {
            this.putQueryParameter("IncrementDuplicationInfrequentAccessPeriod", incrementDuplicationInfrequentAccessPeriod);
            this.incrementDuplicationInfrequentAccessPeriod = incrementDuplicationInfrequentAccessPeriod;
            return this;
        }

        /**
         * LogBackupRetentionPeriod.
         */
        public Builder logBackupRetentionPeriod(String logBackupRetentionPeriod) {
            this.putQueryParameter("LogBackupRetentionPeriod", logBackupRetentionPeriod);
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }

        /**
         * LogDuplicationArchivePeriod.
         */
        public Builder logDuplicationArchivePeriod(String logDuplicationArchivePeriod) {
            this.putQueryParameter("LogDuplicationArchivePeriod", logDuplicationArchivePeriod);
            this.logDuplicationArchivePeriod = logDuplicationArchivePeriod;
            return this;
        }

        /**
         * LogDuplicationInfrequentAccessPeriod.
         */
        public Builder logDuplicationInfrequentAccessPeriod(String logDuplicationInfrequentAccessPeriod) {
            this.putQueryParameter("LogDuplicationInfrequentAccessPeriod", logDuplicationInfrequentAccessPeriod);
            this.logDuplicationInfrequentAccessPeriod = logDuplicationInfrequentAccessPeriod;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public ModifyStorageStrategyRequest build() {
            return new ModifyStorageStrategyRequest(this);
        } 

    } 

}
