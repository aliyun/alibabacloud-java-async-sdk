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
 * {@link CreateIncrementBackupSetDownloadRequest} extends {@link RequestModel}
 *
 * <p>CreateIncrementBackupSetDownloadRequest</p>
 */
public class CreateIncrementBackupSetDownloadRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("BackupSetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupSetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    private CreateIncrementBackupSetDownloadRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupSetDataFormat = builder.backupSetDataFormat;
        this.backupSetId = builder.backupSetId;
        this.backupSetName = builder.backupSetName;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIncrementBackupSetDownloadRequest create() {
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
     * @return backupSetName
     */
    public String getBackupSetName() {
        return this.backupSetName;
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

    public static final class Builder extends Request.Builder<CreateIncrementBackupSetDownloadRequest, Builder> {
        private String regionId; 
        private String backupSetDataFormat; 
        private String backupSetId; 
        private String backupSetName; 
        private String clientToken; 
        private String ownerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIncrementBackupSetDownloadRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupSetDataFormat = request.backupSetDataFormat;
            this.backupSetId = request.backupSetId;
            this.backupSetName = request.backupSetName;
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
         * <p>The format in which the incremental backup set is downloaded. Valid values:</p>
         * <ul>
         * <li><strong>Native</strong></li>
         * <li><strong>SQL</strong></li>
         * <li><strong>CSV</strong></li>
         * <li><strong>JSON</strong></li>
         * </ul>
         * <blockquote>
         * <p>Default value: Native.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Native</p>
         */
        public Builder backupSetDataFormat(String backupSetDataFormat) {
            this.putQueryParameter("BackupSetDataFormat", backupSetDataFormat);
            this.backupSetDataFormat = backupSetDataFormat;
            return this;
        }

        /**
         * <p>The ID of the incremental backup task. To obtain the task ID, you can call the <a href="https://help.aliyun.com/document_detail/2869833.html">DescribeIncrementBackupList</a> operation and view the value of the <strong>BackupSetJobId</strong> parameter in the response.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbstooi01e****</p>
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * <p>The ID of the incremental backup set. To obtain the backup set ID, you can call the <a href="https://help.aliyun.com/document_detail/2869833.html">DescribeIncrementBackupList</a> operation and view the value of the <strong>BackupSetId</strong> parameter in the response.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder backupSetName(String backupSetName) {
            this.putQueryParameter("BackupSetName", backupSetName);
            this.backupSetName = backupSetName;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz****</p>
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
        public CreateIncrementBackupSetDownloadRequest build() {
            return new CreateIncrementBackupSetDownloadRequest(this);
        } 

    } 

}
