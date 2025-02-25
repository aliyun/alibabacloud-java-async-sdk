// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSyncEcsHostTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSyncEcsHostTaskResponseBody</p>
 */
public class DescribeSyncEcsHostTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EcsRegions")
    private EcsRegions ecsRegions;

    @com.aliyun.core.annotation.NameInMap("Regions")
    private Regions regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeSyncEcsHostTaskResponseBody(Builder builder) {
        this.ecsRegions = builder.ecsRegions;
        this.regions = builder.regions;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSyncEcsHostTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return ecsRegions
     */
    public EcsRegions getEcsRegions() {
        return this.ecsRegions;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private EcsRegions ecsRegions; 
        private Regions regions; 
        private String requestId; 
        private String status; 
        private Boolean success; 
        private String zoneId; 

        /**
         * <p>The synchronized regions where the ECS instances are deployed.</p>
         */
        public Builder ecsRegions(EcsRegions ecsRegions) {
            this.ecsRegions = ecsRegions;
            return this;
        }

        /**
         * <p>The synchronized region IDs of the ECS instances.</p>
         */
        public Builder regions(Regions regions) {
            this.regions = regions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75446CC1-FC9A-4595-8D96-089D73D7A63D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether hostname automatic synchronization is enabled. Valid values:</p>
         * <ul>
         * <li>ON: Hostname automatic synchronization is enabled. After this feature is enabled, the system automatically reads the hostnames of the Elastic Compute Service (ECS) instances in the specified regions and updates Domain Name System (DNS) records at an interval of 1 minute.</li>
         * <li>OFF: Hostname automatic synchronization is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the task was successful. Valid values:</p>
         * <ul>
         * <li>True</li>
         * <li>False</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The zone ID. This ID uniquely identifies the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>pvtz-test-id-2989149d628c56****</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeSyncEcsHostTaskResponseBody build() {
            return new DescribeSyncEcsHostTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSyncEcsHostTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSyncEcsHostTaskResponseBody</p>
     */
    public static class RegionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private java.util.List < String > regionId;

        private RegionIds(Builder builder) {
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionIds create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public java.util.List < String > getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private java.util.List < String > regionId; 

            /**
             * RegionId.
             */
            public Builder regionId(java.util.List < String > regionId) {
                this.regionId = regionId;
                return this;
            }

            public RegionIds build() {
                return new RegionIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSyncEcsHostTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSyncEcsHostTaskResponseBody</p>
     */
    public static class EcsRegion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionIds")
        private RegionIds regionIds;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private EcsRegion(Builder builder) {
            this.regionIds = builder.regionIds;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsRegion create() {
            return builder().build();
        }

        /**
         * @return regionIds
         */
        public RegionIds getRegionIds() {
            return this.regionIds;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private RegionIds regionIds; 
            private Long userId; 

            /**
             * <p>The synchronized region IDs.</p>
             */
            public Builder regionIds(RegionIds regionIds) {
                this.regionIds = regionIds;
                return this;
            }

            /**
             * <p>The user ID to which the region belongs. This parameter is used in cross-account synchronization scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>141339776561****</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public EcsRegion build() {
                return new EcsRegion(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSyncEcsHostTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSyncEcsHostTaskResponseBody</p>
     */
    public static class EcsRegions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsRegion")
        private java.util.List < EcsRegion> ecsRegion;

        private EcsRegions(Builder builder) {
            this.ecsRegion = builder.ecsRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsRegions create() {
            return builder().build();
        }

        /**
         * @return ecsRegion
         */
        public java.util.List < EcsRegion> getEcsRegion() {
            return this.ecsRegion;
        }

        public static final class Builder {
            private java.util.List < EcsRegion> ecsRegion; 

            /**
             * EcsRegion.
             */
            public Builder ecsRegion(java.util.List < EcsRegion> ecsRegion) {
                this.ecsRegion = ecsRegion;
                return this;
            }

            public EcsRegions build() {
                return new EcsRegions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSyncEcsHostTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSyncEcsHostTaskResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private java.util.List < String > regionId;

        private Regions(Builder builder) {
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public java.util.List < String > getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private java.util.List < String > regionId; 

            /**
             * RegionId.
             */
            public Builder regionId(java.util.List < String > regionId) {
                this.regionId = regionId;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
