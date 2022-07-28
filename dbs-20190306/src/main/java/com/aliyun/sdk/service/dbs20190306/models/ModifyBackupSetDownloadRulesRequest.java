// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupSetDownloadRulesRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupSetDownloadRulesRequest</p>
 */
public class ModifyBackupSetDownloadRulesRequest extends Request {
    @Query
    @NameInMap("BackupGatewayId")
    private Long backupGatewayId;

    @Query
    @NameInMap("BackupPlanId")
    @Validation(required = true)
    private String backupPlanId;

    @Query
    @NameInMap("BackupSetDownloadDir")
    private String backupSetDownloadDir;

    @Query
    @NameInMap("BackupSetDownloadTargetType")
    private String backupSetDownloadTargetType;

    @Query
    @NameInMap("BackupSetDownloadTargetTypeLocation")
    private String backupSetDownloadTargetTypeLocation;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("FullDataFormat")
    private String fullDataFormat;

    @Query
    @NameInMap("IncrementDataFormat")
    private String incrementDataFormat;

    @Query
    @NameInMap("OpenAutoDownload")
    private Boolean openAutoDownload;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ModifyBackupSetDownloadRulesRequest(Builder builder) {
        super(builder);
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
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyBackupSetDownloadRulesRequest, Builder> {
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
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupSetDownloadRulesRequest request) {
            super(request);
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
            this.regionId = request.regionId;
        } 

        /**
         * BackupGatewayId.
         */
        public Builder backupGatewayId(Long backupGatewayId) {
            this.putQueryParameter("BackupGatewayId", backupGatewayId);
            this.backupGatewayId = backupGatewayId;
            return this;
        }

        /**
         * BackupPlanId.
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * BackupSetDownloadDir.
         */
        public Builder backupSetDownloadDir(String backupSetDownloadDir) {
            this.putQueryParameter("BackupSetDownloadDir", backupSetDownloadDir);
            this.backupSetDownloadDir = backupSetDownloadDir;
            return this;
        }

        /**
         * BackupSetDownloadTargetType.
         */
        public Builder backupSetDownloadTargetType(String backupSetDownloadTargetType) {
            this.putQueryParameter("BackupSetDownloadTargetType", backupSetDownloadTargetType);
            this.backupSetDownloadTargetType = backupSetDownloadTargetType;
            return this;
        }

        /**
         * BackupSetDownloadTargetTypeLocation.
         */
        public Builder backupSetDownloadTargetTypeLocation(String backupSetDownloadTargetTypeLocation) {
            this.putQueryParameter("BackupSetDownloadTargetTypeLocation", backupSetDownloadTargetTypeLocation);
            this.backupSetDownloadTargetTypeLocation = backupSetDownloadTargetTypeLocation;
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
         * FullDataFormat.
         */
        public Builder fullDataFormat(String fullDataFormat) {
            this.putQueryParameter("FullDataFormat", fullDataFormat);
            this.fullDataFormat = fullDataFormat;
            return this;
        }

        /**
         * IncrementDataFormat.
         */
        public Builder incrementDataFormat(String incrementDataFormat) {
            this.putQueryParameter("IncrementDataFormat", incrementDataFormat);
            this.incrementDataFormat = incrementDataFormat;
            return this;
        }

        /**
         * OpenAutoDownload.
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyBackupSetDownloadRulesRequest build() {
            return new ModifyBackupSetDownloadRulesRequest(this);
        } 

    } 

}
