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
 * {@link CreateFullBackupSetDownloadRequest} extends {@link RequestModel}
 *
 * <p>CreateFullBackupSetDownloadRequest</p>
 */
public class CreateFullBackupSetDownloadRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetDataFormat")
    private String backupSetDataFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    private CreateFullBackupSetDownloadRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupSetDataFormat = builder.backupSetDataFormat;
        this.backupSetId = builder.backupSetId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreateFullBackupSetDownloadRequest, Builder> {
        private String regionId; 
        private String backupSetDataFormat; 
        private String backupSetId; 
        private String clientToken; 
        private String ownerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFullBackupSetDownloadRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupSetDataFormat = request.backupSetDataFormat;
            this.backupSetId = request.backupSetId;
            this.clientToken = request.clientToken;
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
         * <p>The format of the downloaded full backup set. Valid values:</p>
         * <ul>
         * <li><p><strong>Native</strong></p>
         * </li>
         * <li><p><strong>SQL</strong></p>
         * </li>
         * <li><p><strong>CSV</strong></p>
         * </li>
         * <li><p><strong>JSON</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is CSV.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        public Builder backupSetDataFormat(String backupSetDataFormat) {
            this.putQueryParameter("BackupSetDataFormat", backupSetDataFormat);
            this.backupSetDataFormat = backupSetDataFormat;
            return this;
        }

        /**
         * <p>The ID of the full backup set.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbs1hvXXXXX</p>
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * <p>A client token used to ensure the idempotence of the request. This prevents the same request from being sent multiple times.</p>
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
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public CreateFullBackupSetDownloadRequest build() {
            return new CreateFullBackupSetDownloadRequest(this);
        } 

    } 

}
