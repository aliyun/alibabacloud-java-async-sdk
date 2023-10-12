// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IpBlock} extends {@link TeaModel}
 *
 * <p>IpBlock</p>
 */
public class IpBlock extends TeaModel {
    @NameInMap("Application")
    private String application;

    @NameInMap("BackupDeviceName")
    private String backupDeviceName;

    @NameInMap("Block")
    private String block;

    @NameInMap("BusinessTypeId")
    private String businessTypeId;

    @NameInMap("Category")
    private String category;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("DeviceName")
    private String deviceName;

    @NameInMap("IpBlockId")
    private String ipBlockId;

    @NameInMap("Mask")
    private String mask;

    @NameInMap("NetBusiness")
    private String netBusiness;

    @NameInMap("NetType")
    private String netType;

    @NameInMap("Ownership")
    private String ownership;

    @NameInMap("ParentId")
    private String parentId;

    @NameInMap("ReserveParentBlock")
    private String reserveParentBlock;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("UpdateType")
    private String updateType;

    @NameInMap("ZoneLayer")
    private java.util.List < ZoneLayer> zoneLayer;

    @NameInMap("ZoneName")
    private String zoneName;

    private IpBlock(Builder builder) {
        this.application = builder.application;
        this.backupDeviceName = builder.backupDeviceName;
        this.block = builder.block;
        this.businessTypeId = builder.businessTypeId;
        this.category = builder.category;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.deviceName = builder.deviceName;
        this.ipBlockId = builder.ipBlockId;
        this.mask = builder.mask;
        this.netBusiness = builder.netBusiness;
        this.netType = builder.netType;
        this.ownership = builder.ownership;
        this.parentId = builder.parentId;
        this.reserveParentBlock = builder.reserveParentBlock;
        this.resourceGroupId = builder.resourceGroupId;
        this.updateType = builder.updateType;
        this.zoneLayer = builder.zoneLayer;
        this.zoneName = builder.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IpBlock create() {
        return builder().build();
    }

    /**
     * @return application
     */
    public String getApplication() {
        return this.application;
    }

    /**
     * @return backupDeviceName
     */
    public String getBackupDeviceName() {
        return this.backupDeviceName;
    }

    /**
     * @return block
     */
    public String getBlock() {
        return this.block;
    }

    /**
     * @return businessTypeId
     */
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return ipBlockId
     */
    public String getIpBlockId() {
        return this.ipBlockId;
    }

    /**
     * @return mask
     */
    public String getMask() {
        return this.mask;
    }

    /**
     * @return netBusiness
     */
    public String getNetBusiness() {
        return this.netBusiness;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
    }

    /**
     * @return ownership
     */
    public String getOwnership() {
        return this.ownership;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return reserveParentBlock
     */
    public String getReserveParentBlock() {
        return this.reserveParentBlock;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return updateType
     */
    public String getUpdateType() {
        return this.updateType;
    }

    /**
     * @return zoneLayer
     */
    public java.util.List < ZoneLayer> getZoneLayer() {
        return this.zoneLayer;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    public static final class Builder {
        private String application; 
        private String backupDeviceName; 
        private String block; 
        private String businessTypeId; 
        private String category; 
        private String createTime; 
        private String description; 
        private String deviceName; 
        private String ipBlockId; 
        private String mask; 
        private String netBusiness; 
        private String netType; 
        private String ownership; 
        private String parentId; 
        private String reserveParentBlock; 
        private String resourceGroupId; 
        private String updateType; 
        private java.util.List < ZoneLayer> zoneLayer; 
        private String zoneName; 

        /**
         * Application.
         */
        public Builder application(String application) {
            this.application = application;
            return this;
        }

        /**
         * BackupDeviceName.
         */
        public Builder backupDeviceName(String backupDeviceName) {
            this.backupDeviceName = backupDeviceName;
            return this;
        }

        /**
         * Block.
         */
        public Builder block(String block) {
            this.block = block;
            return this;
        }

        /**
         * BusinessTypeId.
         */
        public Builder businessTypeId(String businessTypeId) {
            this.businessTypeId = businessTypeId;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        /**
         * IpBlockId.
         */
        public Builder ipBlockId(String ipBlockId) {
            this.ipBlockId = ipBlockId;
            return this;
        }

        /**
         * Mask.
         */
        public Builder mask(String mask) {
            this.mask = mask;
            return this;
        }

        /**
         * NetBusiness.
         */
        public Builder netBusiness(String netBusiness) {
            this.netBusiness = netBusiness;
            return this;
        }

        /**
         * NetType.
         */
        public Builder netType(String netType) {
            this.netType = netType;
            return this;
        }

        /**
         * Ownership.
         */
        public Builder ownership(String ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * ParentId.
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * ReserveParentBlock.
         */
        public Builder reserveParentBlock(String reserveParentBlock) {
            this.reserveParentBlock = reserveParentBlock;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * UpdateType.
         */
        public Builder updateType(String updateType) {
            this.updateType = updateType;
            return this;
        }

        /**
         * ZoneLayer.
         */
        public Builder zoneLayer(java.util.List < ZoneLayer> zoneLayer) {
            this.zoneLayer = zoneLayer;
            return this;
        }

        /**
         * ZoneName.
         */
        public Builder zoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }

        public IpBlock build() {
            return new IpBlock(this);
        } 

    } 

    public static class ZoneLayer extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private ZoneLayer(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneLayer create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ZoneLayer build() {
                return new ZoneLayer(this);
            } 

        } 

    }
}
