// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeGroupLatencyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupLatencyResponseBody</p>
 */
public class DescribeGroupLatencyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LatencyPacket")
    private LatencyPacket latencyPacket;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGroupLatencyResponseBody(Builder builder) {
        this.latencyPacket = builder.latencyPacket;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupLatencyResponseBody create() {
        return builder().build();
    }

    /**
     * @return latencyPacket
     */
    public LatencyPacket getLatencyPacket() {
        return this.latencyPacket;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LatencyPacket latencyPacket; 
        private String requestId; 

        /**
         * <p>The latency information.</p>
         */
        public Builder latencyPacket(LatencyPacket latencyPacket) {
            this.latencyPacket = latencyPacket;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DC3AB0-421C-5371-8170-86AEABF77AD0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGroupLatencyResponseBody build() {
            return new DescribeGroupLatencyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGroupLatencyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupLatencyResponseBody</p>
     */
    public static class MonitorItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("ItemTime")
        private String itemTime;

        @com.aliyun.core.annotation.NameInMap("ItemValue")
        private String itemValue;

        private MonitorItem(Builder builder) {
            this.item = builder.item;
            this.itemTime = builder.itemTime;
            this.itemValue = builder.itemValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorItem create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return itemTime
         */
        public String getItemTime() {
            return this.itemTime;
        }

        /**
         * @return itemValue
         */
        public String getItemValue() {
            return this.itemValue;
        }

        public static final class Builder {
            private String item; 
            private String itemTime; 
            private String itemValue; 

            /**
             * <p>The metric. Valid values:</p>
             * <ul>
             * <li>latency: the backend processing latency</li>
             * <li>gatewayLatency: the API Gateway processing latency</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>latency</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The point in time when the latency data was collected. The format is YYYY-MM-DDThh:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-30T16:10:00Z</p>
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * <p>The latency. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
             */
            public Builder itemValue(String itemValue) {
                this.itemValue = itemValue;
                return this;
            }

            public MonitorItem build() {
                return new MonitorItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGroupLatencyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupLatencyResponseBody</p>
     */
    public static class LatencyPacket extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItem")
        private java.util.List < MonitorItem> monitorItem;

        private LatencyPacket(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatencyPacket create() {
            return builder().build();
        }

        /**
         * @return monitorItem
         */
        public java.util.List < MonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

        public static final class Builder {
            private java.util.List < MonitorItem> monitorItem; 

            /**
             * MonitorItem.
             */
            public Builder monitorItem(java.util.List < MonitorItem> monitorItem) {
                this.monitorItem = monitorItem;
                return this;
            }

            public LatencyPacket build() {
                return new LatencyPacket(this);
            } 

        } 

    }
}
