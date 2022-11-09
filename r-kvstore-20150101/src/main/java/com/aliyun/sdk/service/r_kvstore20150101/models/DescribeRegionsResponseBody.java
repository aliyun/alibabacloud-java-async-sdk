// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionsResponseBody</p>
 */
public class DescribeRegionsResponseBody extends TeaModel {
    @NameInMap("RegionIds")
    private RegionIds regionIds;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeRegionsResponseBody(Builder builder) {
        this.regionIds = builder.regionIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return regionIds
     */
    public RegionIds getRegionIds() {
        return this.regionIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RegionIds regionIds; 
        private String requestId; 

        /**
         * RegionIds.
         */
        public Builder regionIds(RegionIds regionIds) {
            this.regionIds = regionIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRegionsResponseBody build() {
            return new DescribeRegionsResponseBody(this);
        } 

    } 

    public static class ZoneIdList extends TeaModel {
        @NameInMap("ZoneId")
        private java.util.List < String > zoneId;

        private ZoneIdList(Builder builder) {
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneIdList create() {
            return builder().build();
        }

        /**
         * @return zoneId
         */
        public java.util.List < String > getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List < String > zoneId; 

            /**
             * ZoneId.
             */
            public Builder zoneId(java.util.List < String > zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneIdList build() {
                return new ZoneIdList(this);
            } 

        } 

    }
    public static class KVStoreRegion extends TeaModel {
        @NameInMap("LocalName")
        private String localName;

        @NameInMap("RegionEndpoint")
        private String regionEndpoint;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ZoneIdList")
        private ZoneIdList zoneIdList;

        @NameInMap("ZoneIds")
        private String zoneIds;

        private KVStoreRegion(Builder builder) {
            this.localName = builder.localName;
            this.regionEndpoint = builder.regionEndpoint;
            this.regionId = builder.regionId;
            this.zoneIdList = builder.zoneIdList;
            this.zoneIds = builder.zoneIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KVStoreRegion create() {
            return builder().build();
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return regionEndpoint
         */
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return zoneIdList
         */
        public ZoneIdList getZoneIdList() {
            return this.zoneIdList;
        }

        /**
         * @return zoneIds
         */
        public String getZoneIds() {
            return this.zoneIds;
        }

        public static final class Builder {
            private String localName; 
            private String regionEndpoint; 
            private String regionId; 
            private ZoneIdList zoneIdList; 
            private String zoneIds; 

            /**
             * LocalName.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * RegionEndpoint.
             */
            public Builder regionEndpoint(String regionEndpoint) {
                this.regionEndpoint = regionEndpoint;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ZoneIdList.
             */
            public Builder zoneIdList(ZoneIdList zoneIdList) {
                this.zoneIdList = zoneIdList;
                return this;
            }

            /**
             * ZoneIds.
             */
            public Builder zoneIds(String zoneIds) {
                this.zoneIds = zoneIds;
                return this;
            }

            public KVStoreRegion build() {
                return new KVStoreRegion(this);
            } 

        } 

    }
    public static class RegionIds extends TeaModel {
        @NameInMap("KVStoreRegion")
        private java.util.List < KVStoreRegion> KVStoreRegion;

        private RegionIds(Builder builder) {
            this.KVStoreRegion = builder.KVStoreRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionIds create() {
            return builder().build();
        }

        /**
         * @return KVStoreRegion
         */
        public java.util.List < KVStoreRegion> getKVStoreRegion() {
            return this.KVStoreRegion;
        }

        public static final class Builder {
            private java.util.List < KVStoreRegion> KVStoreRegion; 

            /**
             * KVStoreRegion.
             */
            public Builder KVStoreRegion(java.util.List < KVStoreRegion> KVStoreRegion) {
                this.KVStoreRegion = KVStoreRegion;
                return this;
            }

            public RegionIds build() {
                return new RegionIds(this);
            } 

        } 

    }
}
