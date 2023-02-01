// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceLatencyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceLatencyResponseBody</p>
 */
public class DescribeInstanceLatencyResponseBody extends TeaModel {
    @NameInMap("InstanceLatency")
    private InstanceLatency instanceLatency;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceLatencyResponseBody(Builder builder) {
        this.instanceLatency = builder.instanceLatency;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceLatencyResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceLatency
     */
    public InstanceLatency getInstanceLatency() {
        return this.instanceLatency;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceLatency instanceLatency; 
        private String requestId; 

        /**
         * InstanceLatency.
         */
        public Builder instanceLatency(InstanceLatency instanceLatency) {
            this.instanceLatency = instanceLatency;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceLatencyResponseBody build() {
            return new DescribeInstanceLatencyResponseBody(this);
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
             * Item.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * ItemTime.
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * ItemValue.
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
    public static class InstanceLatency extends TeaModel {
        @NameInMap("MonitorItem")
        private java.util.List < MonitorItem> monitorItem;

        private InstanceLatency(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceLatency create() {
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

            public InstanceLatency build() {
                return new InstanceLatency(this);
            } 

        } 

    }
}
