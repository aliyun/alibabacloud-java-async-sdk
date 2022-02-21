// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedHostDisksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedHostDisksResponseBody</p>
 */
public class DescribeDedicatedHostDisksResponseBody extends TeaModel {
    @NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @NameInMap("Disks")
    private java.util.List < Disks> disks;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDedicatedHostDisksResponseBody(Builder builder) {
        this.dedicatedHostId = builder.dedicatedHostId;
        this.disks = builder.disks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedHostDisksResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    /**
     * @return disks
     */
    public java.util.List < Disks> getDisks() {
        return this.disks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dedicatedHostId; 
        private java.util.List < Disks> disks; 
        private String requestId; 

        /**
         * DedicatedHostId.
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * Disks.
         */
        public Builder disks(java.util.List < Disks> disks) {
            this.disks = disks;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDedicatedHostDisksResponseBody build() {
            return new DescribeDedicatedHostDisksResponseBody(this);
        } 

    } 

    public static class Disks extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("Device")
        private String device;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("HasDBInstance")
        private Boolean hasDBInstance;

        @NameInMap("MaxIOPS")
        private Integer maxIOPS;

        @NameInMap("MaxThroughput")
        private Integer maxThroughput;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("ZoneId")
        private String zoneId;

        private Disks(Builder builder) {
            this.category = builder.category;
            this.DBInstanceId = builder.DBInstanceId;
            this.device = builder.device;
            this.diskId = builder.diskId;
            this.hasDBInstance = builder.hasDBInstance;
            this.maxIOPS = builder.maxIOPS;
            this.maxThroughput = builder.maxThroughput;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
            this.status = builder.status;
            this.type = builder.type;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disks create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return hasDBInstance
         */
        public Boolean getHasDBInstance() {
            return this.hasDBInstance;
        }

        /**
         * @return maxIOPS
         */
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        /**
         * @return maxThroughput
         */
        public Integer getMaxThroughput() {
            return this.maxThroughput;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String category; 
            private String DBInstanceId; 
            private String device; 
            private String diskId; 
            private Boolean hasDBInstance; 
            private Integer maxIOPS; 
            private Integer maxThroughput; 
            private String performanceLevel; 
            private Integer size; 
            private String status; 
            private String type; 
            private String zoneId; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
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
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * HasDBInstance.
             */
            public Builder hasDBInstance(Boolean hasDBInstance) {
                this.hasDBInstance = hasDBInstance;
                return this;
            }

            /**
             * MaxIOPS.
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * MaxThroughput.
             */
            public Builder maxThroughput(Integer maxThroughput) {
                this.maxThroughput = maxThroughput;
                return this;
            }

            /**
             * PerformanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
}
