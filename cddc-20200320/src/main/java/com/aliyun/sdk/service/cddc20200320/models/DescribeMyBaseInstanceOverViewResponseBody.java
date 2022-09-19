// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMyBaseInstanceOverViewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMyBaseInstanceOverViewResponseBody</p>
 */
public class DescribeMyBaseInstanceOverViewResponseBody extends TeaModel {
    @NameInMap("Regions")
    private Regions regions;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMyBaseInstanceOverViewResponseBody(Builder builder) {
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMyBaseInstanceOverViewResponseBody create() {
        return builder().build();
    }

    /**
     * @return regions
     */
    public Regions getRegions() {
        return this.regions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Regions regions; 
        private String requestId; 

        /**
         * Regions.
         */
        public Builder regions(Regions regions) {
            this.regions = regions;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMyBaseInstanceOverViewResponseBody build() {
            return new DescribeMyBaseInstanceOverViewResponseBody(this);
        } 

    } 

    public static class InstanceModel extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("ZoneId")
        private String zoneId;

        private InstanceModel(Builder builder) {
            this.createdTime = builder.createdTime;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.expireTime = builder.expireTime;
            this.payType = builder.payType;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceModel create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceStatus
         */
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String createdTime; 
            private String DBInstanceId; 
            private String DBInstanceStatus; 
            private String expireTime; 
            private String payType; 
            private String zoneId; 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
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
             * DBInstanceStatus.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public InstanceModel build() {
                return new InstanceModel(this);
            } 

        } 

    }
    public static class InstanceModels extends TeaModel {
        @NameInMap("InstanceModel")
        private java.util.List < InstanceModel> instanceModel;

        private InstanceModels(Builder builder) {
            this.instanceModel = builder.instanceModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceModels create() {
            return builder().build();
        }

        /**
         * @return instanceModel
         */
        public java.util.List < InstanceModel> getInstanceModel() {
            return this.instanceModel;
        }

        public static final class Builder {
            private java.util.List < InstanceModel> instanceModel; 

            /**
             * InstanceModel.
             */
            public Builder instanceModel(java.util.List < InstanceModel> instanceModel) {
                this.instanceModel = instanceModel;
                return this;
            }

            public InstanceModels build() {
                return new InstanceModels(this);
            } 

        } 

    }
    public static class TypeModel extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("InstanceDateType")
        private String instanceDateType;

        @NameInMap("InstanceEngineCount")
        private String instanceEngineCount;

        @NameInMap("InstanceModels")
        private InstanceModels instanceModels;

        private TypeModel(Builder builder) {
            this.count = builder.count;
            this.instanceDateType = builder.instanceDateType;
            this.instanceEngineCount = builder.instanceEngineCount;
            this.instanceModels = builder.instanceModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TypeModel create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return instanceDateType
         */
        public String getInstanceDateType() {
            return this.instanceDateType;
        }

        /**
         * @return instanceEngineCount
         */
        public String getInstanceEngineCount() {
            return this.instanceEngineCount;
        }

        /**
         * @return instanceModels
         */
        public InstanceModels getInstanceModels() {
            return this.instanceModels;
        }

        public static final class Builder {
            private Integer count; 
            private String instanceDateType; 
            private String instanceEngineCount; 
            private InstanceModels instanceModels; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * InstanceDateType.
             */
            public Builder instanceDateType(String instanceDateType) {
                this.instanceDateType = instanceDateType;
                return this;
            }

            /**
             * InstanceEngineCount.
             */
            public Builder instanceEngineCount(String instanceEngineCount) {
                this.instanceEngineCount = instanceEngineCount;
                return this;
            }

            /**
             * InstanceModels.
             */
            public Builder instanceModels(InstanceModels instanceModels) {
                this.instanceModels = instanceModels;
                return this;
            }

            public TypeModel build() {
                return new TypeModel(this);
            } 

        } 

    }
    public static class TypeModels extends TeaModel {
        @NameInMap("TypeModel")
        private java.util.List < TypeModel> typeModel;

        private TypeModels(Builder builder) {
            this.typeModel = builder.typeModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TypeModels create() {
            return builder().build();
        }

        /**
         * @return typeModel
         */
        public java.util.List < TypeModel> getTypeModel() {
            return this.typeModel;
        }

        public static final class Builder {
            private java.util.List < TypeModel> typeModel; 

            /**
             * TypeModel.
             */
            public Builder typeModel(java.util.List < TypeModel> typeModel) {
                this.typeModel = typeModel;
                return this;
            }

            public TypeModels build() {
                return new TypeModels(this);
            } 

        } 

    }
    public static class RegionModel extends TeaModel {
        @NameInMap("EngineCount")
        private String engineCount;

        @NameInMap("Region")
        private String region;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TypeModels")
        private TypeModels typeModels;

        private RegionModel(Builder builder) {
            this.engineCount = builder.engineCount;
            this.region = builder.region;
            this.totalCount = builder.totalCount;
            this.typeModels = builder.typeModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionModel create() {
            return builder().build();
        }

        /**
         * @return engineCount
         */
        public String getEngineCount() {
            return this.engineCount;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return typeModels
         */
        public TypeModels getTypeModels() {
            return this.typeModels;
        }

        public static final class Builder {
            private String engineCount; 
            private String region; 
            private Integer totalCount; 
            private TypeModels typeModels; 

            /**
             * EngineCount.
             */
            public Builder engineCount(String engineCount) {
                this.engineCount = engineCount;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TypeModels.
             */
            public Builder typeModels(TypeModels typeModels) {
                this.typeModels = typeModels;
                return this;
            }

            public RegionModel build() {
                return new RegionModel(this);
            } 

        } 

    }
    public static class Regions extends TeaModel {
        @NameInMap("RegionModel")
        private java.util.List < RegionModel> regionModel;

        private Regions(Builder builder) {
            this.regionModel = builder.regionModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return regionModel
         */
        public java.util.List < RegionModel> getRegionModel() {
            return this.regionModel;
        }

        public static final class Builder {
            private java.util.List < RegionModel> regionModel; 

            /**
             * RegionModel.
             */
            public Builder regionModel(java.util.List < RegionModel> regionModel) {
                this.regionModel = regionModel;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
