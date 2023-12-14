// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupTrafficResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupTrafficResponseBody</p>
 */
public class DescribeGroupTrafficResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TrafficPerSecond")
    private TrafficPerSecond trafficPerSecond;

    private DescribeGroupTrafficResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficPerSecond = builder.trafficPerSecond;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupTrafficResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trafficPerSecond
     */
    public TrafficPerSecond getTrafficPerSecond() {
        return this.trafficPerSecond;
    }

    public static final class Builder {
        private String requestId; 
        private TrafficPerSecond trafficPerSecond; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The traffic information per second.
         */
        public Builder trafficPerSecond(TrafficPerSecond trafficPerSecond) {
            this.trafficPerSecond = trafficPerSecond;
            return this;
        }

        public DescribeGroupTrafficResponseBody build() {
            return new DescribeGroupTrafficResponseBody(this);
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
             * *   inbound: traffic consumed by requests
             * *   outbound: traffic consumed by responses
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * The corresponding time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ.
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * The traffic volume per second.
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
    public static class TrafficPerSecond extends TeaModel {
        @NameInMap("MonitorItem")
        private java.util.List < MonitorItem> monitorItem;

        private TrafficPerSecond(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficPerSecond create() {
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

            public TrafficPerSecond build() {
                return new TrafficPerSecond(this);
            } 

        } 

    }
}
