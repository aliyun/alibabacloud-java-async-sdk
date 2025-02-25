// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link NodeTemplate} extends {@link TeaModel}
 *
 * <p>NodeTemplate</p>
 */
public class NodeTemplate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @com.aliyun.core.annotation.NameInMap("DataDisks")
    private java.util.List<DataDisks> dataDisks;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.NameInMap("EnableHT")
    private Boolean enableHT;

    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
    private Float spotPriceLimit;

    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    private NodeTemplate(Builder builder) {
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.dataDisks = builder.dataDisks;
        this.duration = builder.duration;
        this.enableHT = builder.enableHT;
        this.imageId = builder.imageId;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceType = builder.instanceType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.spotStrategy = builder.spotStrategy;
        this.systemDisk = builder.systemDisk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeTemplate create() {
        return builder().build();
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return dataDisks
     */
    public java.util.List<DataDisks> getDataDisks() {
        return this.dataDisks;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return enableHT
     */
    public Boolean getEnableHT() {
        return this.enableHT;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return spotPriceLimit
     */
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public static final class Builder {
        private Boolean autoRenew; 
        private Integer autoRenewPeriod; 
        private java.util.List<DataDisks> dataDisks; 
        private Integer duration; 
        private Boolean enableHT; 
        private String imageId; 
        private String instanceChargeType; 
        private String instanceType; 
        private Integer period; 
        private String periodUnit; 
        private Float spotPriceLimit; 
        private String spotStrategy; 
        private SystemDisk systemDisk; 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * AutoRenewPeriod.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * DataDisks.
         */
        public Builder dataDisks(java.util.List<DataDisks> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        /**
         * EnableHT.
         */
        public Builder enableHT(Boolean enableHT) {
            this.enableHT = enableHT;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * InstanceChargeType.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * SpotPriceLimit.
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        public NodeTemplate build() {
            return new NodeTemplate(this);
        } 

    } 

    /**
     * 
     * {@link NodeTemplate} extends {@link TeaModel}
     *
     * <p>NodeTemplate</p>
     */
    public static class DataDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("MountDir")
        private String mountDir;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        private DataDisks(Builder builder) {
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.device = builder.device;
            this.level = builder.level;
            this.mountDir = builder.mountDir;
            this.size = builder.size;
            this.snapshotId = builder.snapshotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisks create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return deleteWithInstance
         */
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return mountDir
         */
        public String getMountDir() {
            return this.mountDir;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public static final class Builder {
            private String category; 
            private Boolean deleteWithInstance; 
            private String device; 
            private String level; 
            private String mountDir; 
            private Integer size; 
            private String snapshotId; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DeleteWithInstance.
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * Device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * MountDir.
             */
            public Builder mountDir(String mountDir) {
                this.mountDir = mountDir;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * SnapshotId.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
    /**
     * 
     * {@link NodeTemplate} extends {@link TeaModel}
     *
     * <p>NodeTemplate</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private SystemDisk(Builder builder) {
            this.category = builder.category;
            this.level = builder.level;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private String level; 
            private Integer size; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
}
