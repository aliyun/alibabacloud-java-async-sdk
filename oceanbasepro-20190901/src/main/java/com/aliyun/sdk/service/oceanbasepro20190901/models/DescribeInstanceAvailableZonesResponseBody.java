// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeInstanceAvailableZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAvailableZonesResponseBody</p>
 */
public class DescribeInstanceAvailableZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ZoneList")
    private java.util.List<ZoneList> zoneList;

    private DescribeInstanceAvailableZonesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.zoneList = builder.zoneList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAvailableZonesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ZoneList> getZoneList() {
        return this.zoneList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ZoneList> zoneList; 

        private Builder() {
        } 

        private Builder(DescribeInstanceAvailableZonesResponseBody model) {
            this.requestId = model.requestId;
            this.zoneList = model.zoneList;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E3D924FB-52****B253-0C1A7EFB778C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ZoneList.
         */
        public Builder zoneList(java.util.List<ZoneList> zoneList) {
            this.zoneList = zoneList;
            return this;
        }

        public DescribeInstanceAvailableZonesResponseBody build() {
            return new DescribeInstanceAvailableZonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceAvailableZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAvailableZonesResponseBody</p>
     */
    public static class ZoneList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsInCluster")
        private Boolean isInCluster;

        @com.aliyun.core.annotation.NameInMap("LogicalZoneName")
        private String logicalZoneName;

        @com.aliyun.core.annotation.NameInMap("ReplicateZoneIndex")
        private String replicateZoneIndex;

        @com.aliyun.core.annotation.NameInMap("Zone")
        private String zone;

        private ZoneList(Builder builder) {
            this.isInCluster = builder.isInCluster;
            this.logicalZoneName = builder.logicalZoneName;
            this.replicateZoneIndex = builder.replicateZoneIndex;
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
         * @return logicalZoneName
         */
        public String getLogicalZoneName() {
            return this.logicalZoneName;
        }

        /**
         * @return replicateZoneIndex
         */
        public String getReplicateZoneIndex() {
            return this.replicateZoneIndex;
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        public static final class Builder {
            private Boolean isInCluster; 
            private String logicalZoneName; 
            private String replicateZoneIndex; 
            private String zone; 

            private Builder() {
            } 

            private Builder(ZoneList model) {
                this.isInCluster = model.isInCluster;
                this.logicalZoneName = model.logicalZoneName;
                this.replicateZoneIndex = model.replicateZoneIndex;
                this.zone = model.zone;
            } 

            /**
             * IsInCluster.
             */
            public Builder isInCluster(Boolean isInCluster) {
                this.isInCluster = isInCluster;
                return this;
            }

            /**
             * LogicalZoneName.
             */
            public Builder logicalZoneName(String logicalZoneName) {
                this.logicalZoneName = logicalZoneName;
                return this;
            }

            /**
             * ReplicateZoneIndex.
             */
            public Builder replicateZoneIndex(String replicateZoneIndex) {
                this.replicateZoneIndex = replicateZoneIndex;
                return this;
            }

            /**
             * Zone.
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
