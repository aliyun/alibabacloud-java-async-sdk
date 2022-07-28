// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFullBackupSetDownloadRequest} extends {@link RequestModel}
 *
 * <p>CreateFullBackupSetDownloadRequest</p>
 */
public class CreateFullBackupSetDownloadRequest extends Request {
    @Query
    @NameInMap("BackupSetDataFormat")
    private String backupSetDataFormat;

    @Query
    @NameInMap("BackupSetId")
    @Validation(required = true)
    private String backupSetId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateFullBackupSetDownloadRequest(Builder builder) {
        super(builder);
        this.backupSetDataFormat = builder.backupSetDataFormat;
        this.backupSetId = builder.backupSetId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFullBackupSetDownloadRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupSetDataFormat
     */
    public String getBackupSetDataFormat() {
        return this.backupSetDataFormat;
    }

    /**
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<CreateFullBackupSetDownloadRequest, Builder> {
        private String backupSetDataFormat; 
        private String backupSetId; 
        private String clientToken; 
        private String ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFullBackupSetDownloadRequest request) {
            super(request);
            this.backupSetDataFormat = request.backupSetDataFormat;
            this.backupSetId = request.backupSetId;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
        } 

        /**
         * BackupSetDataFormat.
         */
        public Builder backupSetDataFormat(String backupSetDataFormat) {
            this.putQueryParameter("BackupSetDataFormat", backupSetDataFormat);
            this.backupSetDataFormat = backupSetDataFormat;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
        public CreateFullBackupSetDownloadRequest build() {
            return new CreateFullBackupSetDownloadRequest(this);
        } 

    } 

}
