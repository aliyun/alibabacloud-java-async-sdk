// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverAvailableZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResolverAvailableZonesResponseBody</p>
 */
public class DescribeResolverAvailableZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableZones")
    private java.util.List < AvailableZones> availableZones;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeResolverAvailableZonesResponseBody(Builder builder) {
        this.availableZones = builder.availableZones;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResolverAvailableZonesResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableZones
     */
    public java.util.List < AvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AvailableZones> availableZones; 
        private String requestId; 

        /**
         * The information about the queried zones.
         */
        public Builder availableZones(java.util.List < AvailableZones> availableZones) {
            this.availableZones = availableZones;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeResolverAvailableZonesResponseBody build() {
            return new DescribeResolverAvailableZonesResponseBody(this);
        } 

    } 

    public static class AvailableZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AzId")
        private String azId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AvailableZones(Builder builder) {
            this.azId = builder.azId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZones create() {
            return builder().build();
        }

        /**
         * @return azId
         */
        public String getAzId() {
            return this.azId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String azId; 
            private String status; 

            /**
             * The zone ID.
             */
            public Builder azId(String azId) {
                this.azId = azId;
                return this;
            }

            /**
             * The state of resources in the zone. Valid values:
             * <p>
             * 
             * *   NORMAL: The resources are in the normal state.
             * *   SOLD_OUT: The resources are sold out.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AvailableZones build() {
                return new AvailableZones(this);
            } 

        } 

    }
}
