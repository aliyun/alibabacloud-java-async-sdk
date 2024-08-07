// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceDropPacketResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceDropPacketResponseBody</p>
 */
public class DescribeInstanceDropPacketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceDropPacket")
    private InstanceDropPacket instanceDropPacket;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceDropPacketResponseBody(Builder builder) {
        this.instanceDropPacket = builder.instanceDropPacket;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceDropPacketResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceDropPacket
     */
    public InstanceDropPacket getInstanceDropPacket() {
        return this.instanceDropPacket;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceDropPacket instanceDropPacket; 
        private String requestId; 

        /**
         * The list of dropped packets in the instance.
         */
        public Builder instanceDropPacket(InstanceDropPacket instanceDropPacket) {
            this.instanceDropPacket = instanceDropPacket;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceDropPacketResponseBody build() {
            return new DescribeInstanceDropPacketResponseBody(this);
        } 

    } 

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
             * The metric. Valid values:
             * <p>
             * 
             * *   InstanceDropPacketRX: the number of inbound packets dropped in the instance per second.
             * *   InstanceDropPacketTX: the number of outbound packets dropped in the instance per second.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * The monitoring time. The time follows the ISO 8601 standard. Format: YYYY-MM-DDThh:mm:ssZ
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * The number of dropped packets in the instance.
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
    public static class InstanceDropPacket extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItem")
        private java.util.List < MonitorItem> monitorItem;

        private InstanceDropPacket(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceDropPacket create() {
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

            public InstanceDropPacket build() {
                return new InstanceDropPacket(this);
            } 

        } 

    }
}
