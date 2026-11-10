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
 * {@link ModifyBackupSetDownloadRulesRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupSetDownloadRulesRequest</p>
 */
public class ModifyBackupSetDownloadRulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupGatewayId")
    private Long backupGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetDownloadDir")
    private String backupSetDownloadDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetDownloadTargetType")
    private String backupSetDownloadTargetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetDownloadTargetTypeLocation")
    private String backupSetDownloadTargetTypeLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FullDataFormat")
    private String fullDataFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncrementDataFormat")
    private String incrementDataFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpenAutoDownload")
    private Boolean openAutoDownload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    private ModifyBackupSetDownloadRulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupGatewayId = builder.backupGatewayId;
        this.backupPlanId = builder.backupPlanId;
        this.backupSetDownloadDir = builder.backupSetDownloadDir;
        this.backupSetDownloadTargetType = builder.backupSetDownloadTargetType;
        this.backupSetDownloadTargetTypeLocation = builder.backupSetDownloadTargetTypeLocation;
        this.clientToken = builder.clientToken;
        this.fullDataFormat = builder.fullDataFormat;
        this.incrementDataFormat = builder.incrementDataFormat;
        this.openAutoDownload = builder.openAutoDownload;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupSetDownloadRulesRequest create() {
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
     * @return backupGatewayId
     */
    public Long getBackupGatewayId() {
        return this.backupGatewayId;
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * @return backupSetDownloadDir
     */
    public String getBackupSetDownloadDir() {
        return this.backupSetDownloadDir;
    }

    /**
     * @return backupSetDownloadTargetType
     */
    public String getBackupSetDownloadTargetType() {
        return this.backupSetDownloadTargetType;
    }

    /**
     * @return backupSetDownloadTargetTypeLocation
     */
    public String getBackupSetDownloadTargetTypeLocation() {
        return this.backupSetDownloadTargetTypeLocation;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return fullDataFormat
     */
    public String getFullDataFormat() {
        return this.fullDataFormat;
    }

    /**
     * @return incrementDataFormat
     */
    public String getIncrementDataFormat() {
        return this.incrementDataFormat;
    }

    /**
     * @return openAutoDownload
     */
    public Boolean getOpenAutoDownload() {
        return this.openAutoDownload;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<ModifyBackupSetDownloadRulesRequest, Builder> {
        private String regionId; 
        private Long backupGatewayId; 
        private String backupPlanId; 
        private String backupSetDownloadDir; 
        private String backupSetDownloadTargetType; 
        private String backupSetDownloadTargetTypeLocation; 
        private String clientToken; 
        private String fullDataFormat; 
        private String incrementDataFormat; 
        private Boolean openAutoDownload; 
        private String ownerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupSetDownloadRulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupGatewayId = request.backupGatewayId;
            this.backupPlanId = request.backupPlanId;
            this.backupSetDownloadDir = request.backupSetDownloadDir;
            this.backupSetDownloadTargetType = request.backupSetDownloadTargetType;
            this.backupSetDownloadTargetTypeLocation = request.backupSetDownloadTargetTypeLocation;
            this.clientToken = request.clientToken;
            this.fullDataFormat = request.fullDataFormat;
            this.incrementDataFormat = request.incrementDataFormat;
            this.openAutoDownload = request.openAutoDownload;
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
         * <p>The ID of the backup gateway used to download the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>23312323</p>
         */
        public Builder backupGatewayId(Long backupGatewayId) {
            this.putQueryParameter("BackupGatewayId", backupGatewayId);
            this.backupGatewayId = backupGatewayId;
            return this;
        }

        /**
         * <p>The ID of the backup plan. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbstooi01xxxx</p>
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * <p>The server directory to which the backup set is downloaded.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder backupSetDownloadDir(String backupSetDownloadDir) {
            this.putQueryParameter("BackupSetDownloadDir", backupSetDownloadDir);
            this.backupSetDownloadDir = backupSetDownloadDir;
            return this;
        }

        /**
         * <p>The target type for downloading the backup set.</p>
         * <blockquote>
         * <p>Default value: agent. A backup gateway is installed. This is the only supported value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>agent</p>
         */
        public Builder backupSetDownloadTargetType(String backupSetDownloadTargetType) {
            this.putQueryParameter("BackupSetDownloadTargetType", backupSetDownloadTargetType);
            this.backupSetDownloadTargetType = backupSetDownloadTargetType;
            return this;
        }

        /**
         * <p>The target directory type for downloading the backup set. This parameter is required if automatic download is enabled. Valid values:</p>
         * <ul>
         * <li>local</li>
         * <li>nas</li>
         * <li>ftp</li>
         * <li>minio</li>
         * </ul>
         * <blockquote>
         * <p>Default value: local.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        public Builder backupSetDownloadTargetTypeLocation(String backupSetDownloadTargetTypeLocation) {
            this.putQueryParameter("BackupSetDownloadTargetTypeLocation", backupSetDownloadTargetTypeLocation);
            this.backupSetDownloadTargetTypeLocation = backupSetDownloadTargetTypeLocation;
            return this;
        }

        /**
         * <p>The client token used to ensure the idempotence of the request and prevent duplicate request submissions.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The format of the full data downloaded from the backup set. Valid values:</p>
         * <ul>
         * <li>Native</li>
         * <li>SQL</li>
         * <li>CSV</li>
         * <li>JSON</li>
         * </ul>
         * <blockquote>
         * <p>Default value: CSV.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CSV</p>
         */
        public Builder fullDataFormat(String fullDataFormat) {
            this.putQueryParameter("FullDataFormat", fullDataFormat);
            this.fullDataFormat = fullDataFormat;
            return this;
        }

        /**
         * <p>The format of the incremental data downloaded from the backup set. Valid values:</p>
         * <ul>
         * <li>Native</li>
         * <li>SQL</li>
         * <li>CSV</li>
         * <li>JSON</li>
         * </ul>
         * <blockquote>
         * <p>Default value: Native.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Native</p>
         */
        public Builder incrementDataFormat(String incrementDataFormat) {
            this.putQueryParameter("IncrementDataFormat", incrementDataFormat);
            this.incrementDataFormat = incrementDataFormat;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic download. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder openAutoDownload(Boolean openAutoDownload) {
            this.putQueryParameter("OpenAutoDownload", openAutoDownload);
            this.openAutoDownload = openAutoDownload;
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
        public ModifyBackupSetDownloadRulesRequest build() {
            return new ModifyBackupSetDownloadRulesRequest(this);
        } 

    } 

}
