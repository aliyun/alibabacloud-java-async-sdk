// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The queried zones.</p>
         */
        public Builder availableZones(java.util.List < AvailableZones> availableZones) {
            this.availableZones = availableZones;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23268E49-0C3E-4A2C-AB70-B4C7D092470B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeResolverAvailableZonesResponseBody build() {
            return new DescribeResolverAvailableZonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResolverAvailableZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResolverAvailableZonesResponseBody</p>
     */
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
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou-a</p>
             */
            public Builder azId(String azId) {
                this.azId = azId;
                return this;
            }

            /**
             * <p>The state of resources in the zone. Valid values:</p>
             * <ul>
             * <li>NORMAL: The resources are in the normal state.</li>
             * <li>SOLD_OUT: The resources are sold out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
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
