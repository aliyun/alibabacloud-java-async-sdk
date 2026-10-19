// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionsResponseBody</p>
 */
public class DescribeRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegionIds")
    private RegionIds regionIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRegionsResponseBody model) {
            this.regionIds = model.regionIds;
            this.requestId = model.requestId;
        } 

        /**
         * RegionIds.
         */
        public Builder regionIds(RegionIds regionIds) {
            this.regionIds = regionIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AD425AD3-CC7B-4EE2-A5CB-2F61BA73****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRegionsResponseBody build() {
            return new DescribeRegionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionsResponseBody</p>
     */
    public static class ZoneIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private java.util.List<String> zoneId;

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
        public java.util.List<String> getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<String> zoneId; 

            private Builder() {
            } 

            private Builder(ZoneIdList model) {
                this.zoneId = model.zoneId;
            } 

            /**
             * ZoneId.
             */
            public Builder zoneId(java.util.List<String> zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneIdList build() {
                return new ZoneIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionsResponseBody</p>
     */
    public static class KVStoreRegion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("RegionEndpoint")
        private String regionEndpoint;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ZoneIdList")
        private ZoneIdList zoneIdList;

        @com.aliyun.core.annotation.NameInMap("ZoneIds")
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

            private Builder() {
            } 

            private Builder(KVStoreRegion model) {
                this.localName = model.localName;
                this.regionEndpoint = model.regionEndpoint;
                this.regionId = model.regionId;
                this.zoneIdList = model.zoneIdList;
                this.zoneIds = model.zoneIds;
            } 

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
    /**
     * 
     * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionsResponseBody</p>
     */
    public static class RegionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KVStoreRegion")
        private java.util.List<KVStoreRegion> KVStoreRegion;

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
        public java.util.List<KVStoreRegion> getKVStoreRegion() {
            return this.KVStoreRegion;
        }

        public static final class Builder {
            private java.util.List<KVStoreRegion> KVStoreRegion; 

            private Builder() {
            } 

            private Builder(RegionIds model) {
                this.KVStoreRegion = model.KVStoreRegion;
            } 

            /**
             * KVStoreRegion.
             */
            public Builder KVStoreRegion(java.util.List<KVStoreRegion> KVStoreRegion) {
                this.KVStoreRegion = KVStoreRegion;
                return this;
            }

            public RegionIds build() {
                return new RegionIds(this);
            } 

        } 

    }
}
