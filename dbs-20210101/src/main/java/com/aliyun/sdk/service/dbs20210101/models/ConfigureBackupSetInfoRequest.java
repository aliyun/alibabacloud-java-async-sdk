// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

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
 * {@link ConfigureBackupSetInfoRequest} extends {@link RequestModel}
 *
 * <p>ConfigureBackupSetInfoRequest</p>
 */
public class ConfigureBackupSetInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMethod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetId")
    private String backupSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupSetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckSum")
    private String checkSum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraMeta")
    private String extraMeta;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadStatus;

    private ConfigureBackupSetInfoRequest(Builder builder) {
        super(builder);
        this.backupMethod = builder.backupMethod;
        this.backupMode = builder.backupMode;
        this.backupSetId = builder.backupSetId;
        this.backupSetName = builder.backupSetName;
        this.backupType = builder.backupType;
        this.checkSum = builder.checkSum;
        this.clientToken = builder.clientToken;
        this.dataSourceId = builder.dataSourceId;
        this.extraMeta = builder.extraMeta;
        this.regionCode = builder.regionCode;
        this.regionId = builder.regionId;
        this.uploadStatus = builder.uploadStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureBackupSetInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupMethod
     */
    public String getBackupMethod() {
        return this.backupMethod;
    }

    /**
     * @return backupMode
     */
    public String getBackupMode() {
        return this.backupMode;
    }

    /**
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return backupSetName
     */
    public String getBackupSetName() {
        return this.backupSetName;
    }

    /**
     * @return backupType
     */
    public String getBackupType() {
        return this.backupType;
    }

    /**
     * @return checkSum
     */
    public String getCheckSum() {
        return this.checkSum;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return extraMeta
     */
    public String getExtraMeta() {
        return this.extraMeta;
    }

    /**
     * @return regionCode
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return uploadStatus
     */
    public String getUploadStatus() {
        return this.uploadStatus;
    }

    public static final class Builder extends Request.Builder<ConfigureBackupSetInfoRequest, Builder> {
        private String backupMethod; 
        private String backupMode; 
        private String backupSetId; 
        private String backupSetName; 
        private String backupType; 
        private String checkSum; 
        private String clientToken; 
        private String dataSourceId; 
        private String extraMeta; 
        private String regionCode; 
        private String regionId; 
        private String uploadStatus; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureBackupSetInfoRequest request) {
            super(request);
            this.backupMethod = request.backupMethod;
            this.backupMode = request.backupMode;
            this.backupSetId = request.backupSetId;
            this.backupSetName = request.backupSetName;
            this.backupType = request.backupType;
            this.checkSum = request.checkSum;
            this.clientToken = request.clientToken;
            this.dataSourceId = request.dataSourceId;
            this.extraMeta = request.extraMeta;
            this.regionCode = request.regionCode;
            this.regionId = request.regionId;
            this.uploadStatus = request.uploadStatus;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Physical</p>
         */
        public Builder backupMethod(String backupMethod) {
            this.putQueryParameter("BackupMethod", backupMethod);
            this.backupMethod = backupMethod;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Automated</p>
         */
        public Builder backupMode(String backupMode) {
            this.putQueryParameter("BackupMode", backupMode);
            this.backupMode = backupMode;
            return this;
        }

        /**
         * BackupSetId.
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder backupSetName(String backupSetName) {
            this.putQueryParameter("BackupSetName", backupSetName);
            this.backupSetName = backupSetName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FullBackup</p>
         */
        public Builder backupType(String backupType) {
            this.putQueryParameter("BackupType", backupType);
            this.backupType = backupType;
            return this;
        }

        /**
         * CheckSum.
         */
        public Builder checkSum(String checkSum) {
            this.putQueryParameter("CheckSum", checkSum);
            this.checkSum = checkSum;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-7iz7uw****</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * ExtraMeta.
         */
        public Builder extraMeta(String extraMeta) {
            this.putQueryParameter("ExtraMeta", extraMeta);
            this.extraMeta = extraMeta;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionCode(String regionCode) {
            this.putQueryParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WaitingUpload</p>
         */
        public Builder uploadStatus(String uploadStatus) {
            this.putQueryParameter("UploadStatus", uploadStatus);
            this.uploadStatus = uploadStatus;
            return this;
        }

        @Override
        public ConfigureBackupSetInfoRequest build() {
            return new ConfigureBackupSetInfoRequest(this);
        } 

    } 

}
