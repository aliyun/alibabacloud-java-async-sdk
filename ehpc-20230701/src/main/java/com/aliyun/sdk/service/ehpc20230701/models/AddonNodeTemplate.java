// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20230701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddonNodeTemplate} extends {@link TeaModel}
 *
 * <p>AddonNodeTemplate</p>
 */
public class AddonNodeTemplate extends TeaModel {
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @NameInMap("DataDisks")
    private java.util.List < DataDisks> dataDisks;

    @NameInMap("Duration")
    private Integer duration;

    @NameInMap("EnableHT")
    private Boolean enableHT;

    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @NameInMap("OsName")
    @Validation(required = true)
    private String osName;

    @NameInMap("OsNameEN")
    @Validation(required = true)
    private String osNameEN;

    @NameInMap("Period")
    private Integer period;

    @NameInMap("PeriodUnit")
    private String periodUnit;

    @NameInMap("SpotPriceLimit")
    private Float spotPriceLimit;

    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    private AddonNodeTemplate(Builder builder) {
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.dataDisks = builder.dataDisks;
        this.duration = builder.duration;
        this.enableHT = builder.enableHT;
        this.imageId = builder.imageId;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceType = builder.instanceType;
        this.osName = builder.osName;
        this.osNameEN = builder.osNameEN;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.spotStrategy = builder.spotStrategy;
        this.systemDisk = builder.systemDisk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddonNodeTemplate create() {
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
    public java.util.List < DataDisks> getDataDisks() {
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
     * @return osName
     */
    public String getOsName() {
        return this.osName;
    }

    /**
     * @return osNameEN
     */
    public String getOsNameEN() {
        return this.osNameEN;
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
        private java.util.List < DataDisks> dataDisks; 
        private Integer duration; 
        private Boolean enableHT; 
        private String imageId; 
        private String instanceChargeType; 
        private String instanceType; 
        private String osName; 
        private String osNameEN; 
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
        public Builder dataDisks(java.util.List < DataDisks> dataDisks) {
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
         * OsName.
         */
        public Builder osName(String osName) {
            this.osName = osName;
            return this;
        }

        /**
         * OsNameEN.
         */
        public Builder osNameEN(String osNameEN) {
            this.osNameEN = osNameEN;
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

        public AddonNodeTemplate build() {
            return new AddonNodeTemplate(this);
        } 

    } 

    public static class DataDisks extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @NameInMap("Level")
        private String level;

        @NameInMap("Size")
        private Integer size;

        private DataDisks(Builder builder) {
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.level = builder.level;
            this.size = builder.size;
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
            private Boolean deleteWithInstance; 
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
             * DeleteWithInstance.
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
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

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
    public static class SystemDisk extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Level")
        private String level;

        @NameInMap("Size")
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
