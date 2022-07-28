// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPlanBillingRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupPlanBillingRequest</p>
 */
public class DescribeBackupPlanBillingRequest extends Request {
    @Query
    @NameInMap("BackupPlanId")
    @Validation(required = true)
    private String backupPlanId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ShowStorageType")
    private Boolean showStorageType;

    private DescribeBackupPlanBillingRequest(Builder builder) {
        super(builder);
        this.backupPlanId = builder.backupPlanId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.showStorageType = builder.showStorageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPlanBillingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
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

    /**
     * @return showStorageType
     */
    public Boolean getShowStorageType() {
        return this.showStorageType;
    }

    public static final class Builder extends Request.Builder<DescribeBackupPlanBillingRequest, Builder> {
        private String backupPlanId; 
        private String clientToken; 
        private String ownerId; 
        private String regionId; 
        private Boolean showStorageType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupPlanBillingRequest request) {
            super(request);
            this.backupPlanId = request.backupPlanId;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.showStorageType = request.showStorageType;
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

        /**
         * ShowStorageType.
         */
        public Builder showStorageType(Boolean showStorageType) {
            this.putQueryParameter("ShowStorageType", showStorageType);
            this.showStorageType = showStorageType;
            return this;
        }

        @Override
        public DescribeBackupPlanBillingRequest build() {
            return new DescribeBackupPlanBillingRequest(this);
        } 

    } 

}
