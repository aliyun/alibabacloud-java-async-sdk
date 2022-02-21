// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSyncEcsHostTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSyncEcsHostTaskResponseBody</p>
 */
public class DescribeSyncEcsHostTaskResponseBody extends TeaModel {
    @NameInMap("EcsRegions")
    private EcsRegions ecsRegions;

    @NameInMap("Regions")
    private Regions regions;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("ZoneId")
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
         * EcsRegions.
         */
        public Builder ecsRegions(EcsRegions ecsRegions) {
            this.ecsRegions = ecsRegions;
            return this;
        }

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

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeSyncEcsHostTaskResponseBody build() {
            return new DescribeSyncEcsHostTaskResponseBody(this);
        } 

    } 

    public static class RegionIds extends TeaModel {
        @NameInMap("RegionId")
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
    public static class EcsRegion extends TeaModel {
        @NameInMap("RegionIds")
        private RegionIds regionIds;

        @NameInMap("UserId")
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
             * RegionIds.
             */
            public Builder regionIds(RegionIds regionIds) {
                this.regionIds = regionIds;
                return this;
            }

            /**
             * UserId.
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
    public static class EcsRegions extends TeaModel {
        @NameInMap("EcsRegion")
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
    public static class Regions extends TeaModel {
        @NameInMap("RegionId")
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
