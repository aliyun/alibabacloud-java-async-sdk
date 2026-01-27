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
 * {@link DescribeBakDataSourceStorageAccessInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeBakDataSourceStorageAccessInfoRequest</p>
 */
public class DescribeBakDataSourceStorageAccessInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DurationSeconds")
    private Long durationSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    private DescribeBakDataSourceStorageAccessInfoRequest(Builder builder) {
        super(builder);
        this.backupSetId = builder.backupSetId;
        this.backupType = builder.backupType;
        this.clientToken = builder.clientToken;
        this.dataSourceId = builder.dataSourceId;
        this.durationSeconds = builder.durationSeconds;
        this.regionCode = builder.regionCode;
        this.regionId = builder.regionId;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBakDataSourceStorageAccessInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return backupType
     */
    public String getBackupType() {
        return this.backupType;
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
     * @return durationSeconds
     */
    public Long getDurationSeconds() {
        return this.durationSeconds;
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
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<DescribeBakDataSourceStorageAccessInfoRequest, Builder> {
        private String backupSetId; 
        private String backupType; 
        private String clientToken; 
        private String dataSourceId; 
        private Long durationSeconds; 
        private String regionCode; 
        private String regionId; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBakDataSourceStorageAccessInfoRequest request) {
            super(request);
            this.backupSetId = request.backupSetId;
            this.backupType = request.backupType;
            this.clientToken = request.clientToken;
            this.dataSourceId = request.dataSourceId;
            this.durationSeconds = request.durationSeconds;
            this.regionCode = request.regionCode;
            this.regionId = request.regionId;
            this.storageType = request.storageType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ee-d84wwm3cazdbjli1m1*****</p>
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
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
         * <p>ds-7iz7uwzgcgumznkd02xn*****</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * DurationSeconds.
         */
        public Builder durationSeconds(Long durationSeconds) {
            this.putQueryParameter("DurationSeconds", durationSeconds);
            this.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
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
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public DescribeBakDataSourceStorageAccessInfoRequest build() {
            return new DescribeBakDataSourceStorageAccessInfoRequest(this);
        } 

    } 

}
