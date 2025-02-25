// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDbfsRequest} extends {@link RequestModel}
 *
 * <p>CreateDbfsRequest</p>
 */
public class CreateDbfsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdvancedFeatures")
    private String advancedFeatures;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteSnapshot")
    private Boolean deleteSnapshot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableRaid")
    private Boolean enableRaid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Encryption")
    private Boolean encryption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FsName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fsName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KMSKeyId")
    private String KMSKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
    private String performanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RaidStripeUnitNumber")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer raidStripeUnitNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SizeG")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 20)
    private Integer sizeG;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedScene")
    private String usedScene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateDbfsRequest(Builder builder) {
        super(builder);
        this.advancedFeatures = builder.advancedFeatures;
        this.category = builder.category;
        this.clientToken = builder.clientToken;
        this.deleteSnapshot = builder.deleteSnapshot;
        this.enableRaid = builder.enableRaid;
        this.encryption = builder.encryption;
        this.fsName = builder.fsName;
        this.instanceType = builder.instanceType;
        this.KMSKeyId = builder.KMSKeyId;
        this.performanceLevel = builder.performanceLevel;
        this.raidStripeUnitNumber = builder.raidStripeUnitNumber;
        this.regionId = builder.regionId;
        this.sizeG = builder.sizeG;
        this.snapshotId = builder.snapshotId;
        this.usedScene = builder.usedScene;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDbfsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedFeatures
     */
    public String getAdvancedFeatures() {
        return this.advancedFeatures;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deleteSnapshot
     */
    public Boolean getDeleteSnapshot() {
        return this.deleteSnapshot;
    }

    /**
     * @return enableRaid
     */
    public Boolean getEnableRaid() {
        return this.enableRaid;
    }

    /**
     * @return encryption
     */
    public Boolean getEncryption() {
        return this.encryption;
    }

    /**
     * @return fsName
     */
    public String getFsName() {
        return this.fsName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * @return performanceLevel
     */
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    /**
     * @return raidStripeUnitNumber
     */
    public Integer getRaidStripeUnitNumber() {
        return this.raidStripeUnitNumber;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sizeG
     */
    public Integer getSizeG() {
        return this.sizeG;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return usedScene
     */
    public String getUsedScene() {
        return this.usedScene;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDbfsRequest, Builder> {
        private String advancedFeatures; 
        private String category; 
        private String clientToken; 
        private Boolean deleteSnapshot; 
        private Boolean enableRaid; 
        private Boolean encryption; 
        private String fsName; 
        private String instanceType; 
        private String KMSKeyId; 
        private String performanceLevel; 
        private Integer raidStripeUnitNumber; 
        private String regionId; 
        private Integer sizeG; 
        private String snapshotId; 
        private String usedScene; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDbfsRequest request) {
            super(request);
            this.advancedFeatures = request.advancedFeatures;
            this.category = request.category;
            this.clientToken = request.clientToken;
            this.deleteSnapshot = request.deleteSnapshot;
            this.enableRaid = request.enableRaid;
            this.encryption = request.encryption;
            this.fsName = request.fsName;
            this.instanceType = request.instanceType;
            this.KMSKeyId = request.KMSKeyId;
            this.performanceLevel = request.performanceLevel;
            this.raidStripeUnitNumber = request.raidStripeUnitNumber;
            this.regionId = request.regionId;
            this.sizeG = request.sizeG;
            this.snapshotId = request.snapshotId;
            this.usedScene = request.usedScene;
            this.zoneId = request.zoneId;
        } 

        /**
         * AdvancedFeatures.
         */
        public Builder advancedFeatures(String advancedFeatures) {
            this.putQueryParameter("AdvancedFeatures", advancedFeatures);
            this.advancedFeatures = advancedFeatures;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
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
         * DeleteSnapshot.
         */
        public Builder deleteSnapshot(Boolean deleteSnapshot) {
            this.putQueryParameter("DeleteSnapshot", deleteSnapshot);
            this.deleteSnapshot = deleteSnapshot;
            return this;
        }

        /**
         * EnableRaid.
         */
        public Builder enableRaid(Boolean enableRaid) {
            this.putQueryParameter("EnableRaid", enableRaid);
            this.enableRaid = enableRaid;
            return this;
        }

        /**
         * Encryption.
         */
        public Builder encryption(Boolean encryption) {
            this.putQueryParameter("Encryption", encryption);
            this.encryption = encryption;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testdbfs-001</p>
         */
        public Builder fsName(String fsName) {
            this.putQueryParameter("FsName", fsName);
            this.fsName = fsName;
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
         * KMSKeyId.
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * PerformanceLevel.
         */
        public Builder performanceLevel(String performanceLevel) {
            this.putQueryParameter("PerformanceLevel", performanceLevel);
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * RaidStripeUnitNumber.
         */
        public Builder raidStripeUnitNumber(Integer raidStripeUnitNumber) {
            this.putQueryParameter("RaidStripeUnitNumber", raidStripeUnitNumber);
            this.raidStripeUnitNumber = raidStripeUnitNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>200</p>
         */
        public Builder sizeG(Integer sizeG) {
            this.putQueryParameter("SizeG", sizeG);
            this.sizeG = sizeG;
            return this;
        }

        /**
         * SnapshotId.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * UsedScene.
         */
        public Builder usedScene(String usedScene) {
            this.putQueryParameter("UsedScene", usedScene);
            this.usedScene = usedScene;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDbfsRequest build() {
            return new CreateDbfsRequest(this);
        } 

    } 

}
