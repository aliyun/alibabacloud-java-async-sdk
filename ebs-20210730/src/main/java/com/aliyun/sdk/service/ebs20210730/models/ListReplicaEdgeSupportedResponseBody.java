// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link ListReplicaEdgeSupportedResponseBody} extends {@link TeaModel}
 *
 * <p>ListReplicaEdgeSupportedResponseBody</p>
 */
public class ListReplicaEdgeSupportedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportedRegions")
    private java.util.List<SupportedRegions> supportedRegions;

    private ListReplicaEdgeSupportedResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.supportedRegions = builder.supportedRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReplicaEdgeSupportedResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportedRegions
     */
    public java.util.List<SupportedRegions> getSupportedRegions() {
        return this.supportedRegions;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<SupportedRegions> supportedRegions; 

        private Builder() {
        } 

        private Builder(ListReplicaEdgeSupportedResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.supportedRegions = model.supportedRegions;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * SupportedRegions.
         */
        public Builder supportedRegions(java.util.List<SupportedRegions> supportedRegions) {
            this.supportedRegions = supportedRegions;
            return this;
        }

        public ListReplicaEdgeSupportedResponseBody build() {
            return new ListReplicaEdgeSupportedResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListReplicaEdgeSupportedResponseBody} extends {@link TeaModel}
     *
     * <p>ListReplicaEdgeSupportedResponseBody</p>
     */
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Zones(Builder builder) {
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Zones model) {
                this.zoneId = model.zoneId;
            } 

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListReplicaEdgeSupportedResponseBody} extends {@link TeaModel}
     *
     * <p>ListReplicaEdgeSupportedResponseBody</p>
     */
    public static class SupportedRegions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private java.util.List<Zones> zones;

        private SupportedRegions(Builder builder) {
            this.regionId = builder.regionId;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedRegions create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return zones
         */
        public java.util.List<Zones> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String regionId; 
            private java.util.List<Zones> zones; 

            private Builder() {
            } 

            private Builder(SupportedRegions model) {
                this.regionId = model.regionId;
                this.zones = model.zones;
            } 

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Zones.
             */
            public Builder zones(java.util.List<Zones> zones) {
                this.zones = zones;
                return this;
            }

            public SupportedRegions build() {
                return new SupportedRegions(this);
            } 

        } 

    }
}
