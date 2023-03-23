// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancePacketsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancePacketsResponseBody</p>
 */
public class DescribeInstancePacketsResponseBody extends TeaModel {
    @NameInMap("InstancePackets")
    private InstancePackets instancePackets;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstancePacketsResponseBody(Builder builder) {
        this.instancePackets = builder.instancePackets;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancePacketsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instancePackets
     */
    public InstancePackets getInstancePackets() {
        return this.instancePackets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstancePackets instancePackets; 
        private String requestId; 

        /**
         * The list of inbound and outbound data packets in the instance.
         */
        public Builder instancePackets(InstancePackets instancePackets) {
            this.instancePackets = instancePackets;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstancePacketsResponseBody build() {
            return new DescribeInstancePacketsResponseBody(this);
        } 

    } 

    public static class MonitorItem extends TeaModel {
        @NameInMap("Item")
        private String item;

        @NameInMap("ItemTime")
        private String itemTime;

        @NameInMap("ItemValue")
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
             * *   InstancePacketRX: inbound data packets
             * *   InstancePacketTX: outbound data packets
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * The monitoring time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * The number of inbound and outbound data packets in the instance.
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
    public static class InstancePackets extends TeaModel {
        @NameInMap("MonitorItem")
        private java.util.List < MonitorItem> monitorItem;

        private InstancePackets(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstancePackets create() {
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

            public InstancePackets build() {
                return new InstancePackets(this);
            } 

        } 

    }
}
