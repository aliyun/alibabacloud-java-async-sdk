// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupPlanRequest</p>
 */
public class CreateBackupPlanRequest extends Request {
    @Query
    @NameInMap("BackupMethod")
    @Validation(required = true)
    private String backupMethod;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DatabaseRegion")
    private String databaseRegion;

    @Query
    @NameInMap("DatabaseType")
    @Validation(required = true)
    private String databaseType;

    @Query
    @NameInMap("FromApp")
    private String fromApp;

    @Query
    @NameInMap("InstanceClass")
    @Validation(required = true)
    private String instanceClass;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("PayType")
    private String payType;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("Region")
    private String region;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("StorageRegion")
    private String storageRegion;

    @Query
    @NameInMap("StorageType")
    private String storageType;

    @Query
    @NameInMap("UsedTime")
    private Integer usedTime;

    private CreateBackupPlanRequest(Builder builder) {
        super(builder);
        this.backupMethod = builder.backupMethod;
        this.clientToken = builder.clientToken;
        this.databaseRegion = builder.databaseRegion;
        this.databaseType = builder.databaseType;
        this.fromApp = builder.fromApp;
        this.instanceClass = builder.instanceClass;
        this.instanceType = builder.instanceType;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.storageRegion = builder.storageRegion;
        this.storageType = builder.storageType;
        this.usedTime = builder.usedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupPlanRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return databaseRegion
     */
    public String getDatabaseRegion() {
        return this.databaseRegion;
    }

    /**
     * @return databaseType
     */
    public String getDatabaseType() {
        return this.databaseType;
    }

    /**
     * @return fromApp
     */
    public String getFromApp() {
        return this.fromApp;
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return storageRegion
     */
    public String getStorageRegion() {
        return this.storageRegion;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public static final class Builder extends Request.Builder<CreateBackupPlanRequest, Builder> {
        private String backupMethod; 
        private String clientToken; 
        private String databaseRegion; 
        private String databaseType; 
        private String fromApp; 
        private String instanceClass; 
        private String instanceType; 
        private String ownerId; 
        private String payType; 
        private String period; 
        private String region; 
        private String regionId; 
        private String resourceGroupId; 
        private String storageRegion; 
        private String storageType; 
        private Integer usedTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackupPlanRequest request) {
            super(request);
            this.backupMethod = request.backupMethod;
            this.clientToken = request.clientToken;
            this.databaseRegion = request.databaseRegion;
            this.databaseType = request.databaseType;
            this.fromApp = request.fromApp;
            this.instanceClass = request.instanceClass;
            this.instanceType = request.instanceType;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.period = request.period;
            this.region = request.region;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.storageRegion = request.storageRegion;
            this.storageType = request.storageType;
            this.usedTime = request.usedTime;
        } 

        /**
         * BackupMethod.
         */
        public Builder backupMethod(String backupMethod) {
            this.putQueryParameter("BackupMethod", backupMethod);
            this.backupMethod = backupMethod;
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
         * DatabaseRegion.
         */
        public Builder databaseRegion(String databaseRegion) {
            this.putQueryParameter("DatabaseRegion", databaseRegion);
            this.databaseRegion = databaseRegion;
            return this;
        }

        /**
         * DatabaseType.
         */
        public Builder databaseType(String databaseType) {
            this.putQueryParameter("DatabaseType", databaseType);
            this.databaseType = databaseType;
            return this;
        }

        /**
         * FromApp.
         */
        public Builder fromApp(String fromApp) {
            this.putQueryParameter("FromApp", fromApp);
            this.fromApp = fromApp;
            return this;
        }

        /**
         * InstanceClass.
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
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
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * StorageRegion.
         */
        public Builder storageRegion(String storageRegion) {
            this.putQueryParameter("StorageRegion", storageRegion);
            this.storageRegion = storageRegion;
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

        /**
         * UsedTime.
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        @Override
        public CreateBackupPlanRequest build() {
            return new CreateBackupPlanRequest(this);
        } 

    } 

}
