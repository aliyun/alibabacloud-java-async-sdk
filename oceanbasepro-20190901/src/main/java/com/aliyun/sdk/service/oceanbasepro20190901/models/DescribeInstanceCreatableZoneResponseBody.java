// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceCreatableZoneResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceCreatableZoneResponseBody</p>
 */
public class DescribeInstanceCreatableZoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ZoneList")
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
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 可用区列表信息。
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
        @NameInMap("IsInCluster")
        private Boolean isInCluster;

        @NameInMap("Zone")
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
             * 是否是集群部署的可用区。
             */
            public Builder isInCluster(Boolean isInCluster) {
                this.isInCluster = isInCluster;
                return this;
            }

            /**
             * 可用区ID。
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
