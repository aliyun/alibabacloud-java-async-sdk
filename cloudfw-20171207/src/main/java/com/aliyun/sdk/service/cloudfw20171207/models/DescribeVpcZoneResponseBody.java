// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcZoneResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcZoneResponseBody</p>
 */
public class DescribeVpcZoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ZoneList")
    private java.util.List < ZoneList> zoneList;

    private DescribeVpcZoneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.zoneList = builder.zoneList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcZoneResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The zones.
         */
        public Builder zoneList(java.util.List < ZoneList> zoneList) {
            this.zoneList = zoneList;
            return this;
        }

        public DescribeVpcZoneResponseBody build() {
            return new DescribeVpcZoneResponseBody(this);
        } 

    } 

    public static class ZoneList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneType")
        private String zoneType;

        private ZoneList(Builder builder) {
            this.localName = builder.localName;
            this.zoneId = builder.zoneId;
            this.zoneType = builder.zoneType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneList create() {
            return builder().build();
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return zoneType
         */
        public String getZoneType() {
            return this.zoneType;
        }

        public static final class Builder {
            private String localName; 
            private String zoneId; 
            private String zoneType; 

            /**
             * The name of the zone.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The zone type. Default value: AvailabilityZone. This value indicates Alibaba Cloud zones.
             */
            public Builder zoneType(String zoneType) {
                this.zoneType = zoneType;
                return this;
            }

            public ZoneList build() {
                return new ZoneList(this);
            } 

        } 

    }
}
