// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeClusterRequest} extends {@link RequestModel}
 *
 * <p>ResizeClusterRequest</p>
 */
public class ResizeClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloudType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColdStorageSize")
    private String coldStorageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreDiskQuantity")
    private String coreDiskQuantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreDiskSize")
    private String coreDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreDiskType")
    private String coreDiskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreInstanceQuantity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coreInstanceQuantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreInstanceType")
    private String coreInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsColdStorage")
    private String isColdStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String upgradeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private ResizeClusterRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.cloudType = builder.cloudType;
        this.clusterId = builder.clusterId;
        this.coldStorageSize = builder.coldStorageSize;
        this.coreDiskQuantity = builder.coreDiskQuantity;
        this.coreDiskSize = builder.coreDiskSize;
        this.coreDiskType = builder.coreDiskType;
        this.coreInstanceQuantity = builder.coreInstanceQuantity;
        this.coreInstanceType = builder.coreInstanceType;
        this.engine = builder.engine;
        this.isColdStorage = builder.isColdStorage;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.upgradeType = builder.upgradeType;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cloudType
     */
    public String getCloudType() {
        return this.cloudType;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return coldStorageSize
     */
    public String getColdStorageSize() {
        return this.coldStorageSize;
    }

    /**
     * @return coreDiskQuantity
     */
    public String getCoreDiskQuantity() {
        return this.coreDiskQuantity;
    }

    /**
     * @return coreDiskSize
     */
    public String getCoreDiskSize() {
        return this.coreDiskSize;
    }

    /**
     * @return coreDiskType
     */
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    /**
     * @return coreInstanceQuantity
     */
    public String getCoreInstanceQuantity() {
        return this.coreInstanceQuantity;
    }

    /**
     * @return coreInstanceType
     */
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return isColdStorage
     */
    public String getIsColdStorage() {
        return this.isColdStorage;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return upgradeType
     */
    public String getUpgradeType() {
        return this.upgradeType;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ResizeClusterRequest, Builder> {
        private String clientToken; 
        private String cloudType; 
        private String clusterId; 
        private String coldStorageSize; 
        private String coreDiskQuantity; 
        private String coreDiskSize; 
        private String coreDiskType; 
        private String coreInstanceQuantity; 
        private String coreInstanceType; 
        private String engine; 
        private String isColdStorage; 
        private String payType; 
        private String regionId; 
        private String upgradeType; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ResizeClusterRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.cloudType = request.cloudType;
            this.clusterId = request.clusterId;
            this.coldStorageSize = request.coldStorageSize;
            this.coreDiskQuantity = request.coreDiskQuantity;
            this.coreDiskSize = request.coreDiskSize;
            this.coreDiskType = request.coreDiskType;
            this.coreInstanceQuantity = request.coreInstanceQuantity;
            this.coreInstanceType = request.coreInstanceType;
            this.engine = request.engine;
            this.isColdStorage = request.isColdStorage;
            this.payType = request.payType;
            this.regionId = request.regionId;
            this.upgradeType = request.upgradeType;
            this.zoneId = request.zoneId;
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
         * CloudType.
         */
        public Builder cloudType(String cloudType) {
            this.putQueryParameter("CloudType", cloudType);
            this.cloudType = cloudType;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ColdStorageSize.
         */
        public Builder coldStorageSize(String coldStorageSize) {
            this.putQueryParameter("ColdStorageSize", coldStorageSize);
            this.coldStorageSize = coldStorageSize;
            return this;
        }

        /**
         * CoreDiskQuantity.
         */
        public Builder coreDiskQuantity(String coreDiskQuantity) {
            this.putQueryParameter("CoreDiskQuantity", coreDiskQuantity);
            this.coreDiskQuantity = coreDiskQuantity;
            return this;
        }

        /**
         * CoreDiskSize.
         */
        public Builder coreDiskSize(String coreDiskSize) {
            this.putQueryParameter("CoreDiskSize", coreDiskSize);
            this.coreDiskSize = coreDiskSize;
            return this;
        }

        /**
         * CoreDiskType.
         */
        public Builder coreDiskType(String coreDiskType) {
            this.putQueryParameter("CoreDiskType", coreDiskType);
            this.coreDiskType = coreDiskType;
            return this;
        }

        /**
         * CoreInstanceQuantity.
         */
        public Builder coreInstanceQuantity(String coreInstanceQuantity) {
            this.putQueryParameter("CoreInstanceQuantity", coreInstanceQuantity);
            this.coreInstanceQuantity = coreInstanceQuantity;
            return this;
        }

        /**
         * CoreInstanceType.
         */
        public Builder coreInstanceType(String coreInstanceType) {
            this.putQueryParameter("CoreInstanceType", coreInstanceType);
            this.coreInstanceType = coreInstanceType;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * IsColdStorage.
         */
        public Builder isColdStorage(String isColdStorage) {
            this.putQueryParameter("IsColdStorage", isColdStorage);
            this.isColdStorage = isColdStorage;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UpgradeType.
         */
        public Builder upgradeType(String upgradeType) {
            this.putQueryParameter("UpgradeType", upgradeType);
            this.upgradeType = upgradeType;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ResizeClusterRequest build() {
            return new ResizeClusterRequest(this);
        } 

    } 

}
