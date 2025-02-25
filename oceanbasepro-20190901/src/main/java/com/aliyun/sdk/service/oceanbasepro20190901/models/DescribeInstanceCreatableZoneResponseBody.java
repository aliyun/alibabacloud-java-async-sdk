// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceCreatableZoneResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceCreatableZoneResponseBody</p>
 */
public class DescribeInstanceCreatableZoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ZoneList")
    private java.util.List < ZoneList> zoneList;

    private DescribeInstanceCreatableZoneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.zoneList = builder.zoneList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceCreatableZoneResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return zoneList
     */
    public java.util.List < ZoneList> getZoneList() {
        return this.zoneList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ZoneList> zoneList; 

        /**
         * Indicates whether the cluster is deployed in the zone.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The operation that you want to perform.   
         * <p>
         * Set the value to **DescribeInstanceCreatableZone**.
         */
        public Builder zoneList(java.util.List < ZoneList> zoneList) {
            this.zoneList = zoneList;
            return this;
        }

        public DescribeInstanceCreatableZoneResponseBody build() {
            return new DescribeInstanceCreatableZoneResponseBody(this);
        } 

    } 

    public static class ZoneList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsInCluster")
        private Boolean isInCluster;

        @com.aliyun.core.annotation.NameInMap("Zone")
        private String zone;

        private ZoneList(Builder builder) {
            this.isInCluster = builder.isInCluster;
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneList create() {
            return builder().build();
        }

        /**
         * @return isInCluster
         */
        public Boolean getIsInCluster() {
            return this.isInCluster;
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        public static final class Builder {
            private Boolean isInCluster; 
            private String zone; 

            /**
             * IsInCluster.
             */
            public Builder isInCluster(Boolean isInCluster) {
                this.isInCluster = isInCluster;
                return this;
            }

            /**
             * DescribeInstanceCreatableZone
             */
            public Builder zone(String zone) {
                this.zone = zone;
                return this;
            }

            public ZoneList build() {
                return new ZoneList(this);
            } 

        } 

    }
}
