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
 * {@link DescribeInstanceCreatableZoneResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceCreatableZoneResponseBody</p>
 */
public class DescribeInstanceCreatableZoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ZoneList")
    private java.util.List<ZoneList> zoneList;

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
    public java.util.List<ZoneList> getZoneList() {
        return this.zoneList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ZoneList> zoneList; 

        /**
         * <p>Indicates whether the cluster is deployed in the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The operation that you want to perform.<br>Set the value to <strong>DescribeInstanceCreatableZone</strong>.</p>
         */
        public Builder zoneList(java.util.List<ZoneList> zoneList) {
            this.zoneList = zoneList;
            return this;
        }

        public DescribeInstanceCreatableZoneResponseBody build() {
            return new DescribeInstanceCreatableZoneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceCreatableZoneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceCreatableZoneResponseBody</p>
     */
    public static class ZoneList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FullCopyId")
        private String fullCopyId;

        @com.aliyun.core.annotation.NameInMap("IsInCluster")
        private Boolean isInCluster;

        @com.aliyun.core.annotation.NameInMap("LogicalZoneName")
        private String logicalZoneName;

        @com.aliyun.core.annotation.NameInMap("ReplicateZoneIndex")
        private Long replicateZoneIndex;

        @com.aliyun.core.annotation.NameInMap("Zone")
        private String zone;

        private ZoneList(Builder builder) {
            this.fullCopyId = builder.fullCopyId;
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
         * @return fullCopyId
         */
        public String getFullCopyId() {
            return this.fullCopyId;
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
        public Long getReplicateZoneIndex() {
            return this.replicateZoneIndex;
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        public static final class Builder {
            private String fullCopyId; 
            private Boolean isInCluster; 
            private String logicalZoneName; 
            private Long replicateZoneIndex; 
            private String zone; 

            /**
             * FullCopyId.
             */
            public Builder fullCopyId(String fullCopyId) {
                this.fullCopyId = fullCopyId;
                return this;
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
            public Builder replicateZoneIndex(Long replicateZoneIndex) {
                this.replicateZoneIndex = replicateZoneIndex;
                return this;
            }

            /**
             * <p>DescribeInstanceCreatableZone</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
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
