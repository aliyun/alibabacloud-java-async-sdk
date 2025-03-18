// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeInstanceLatencyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceLatencyResponseBody</p>
 */
public class DescribeInstanceLatencyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceLatency")
    private InstanceLatency instanceLatency;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInstanceLatencyResponseBody model) {
            this.instanceLatency = model.instanceLatency;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of average latencies in the instance.</p>
         */
        public Builder instanceLatency(InstanceLatency instanceLatency) {
            this.instanceLatency = instanceLatency;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceLatencyResponseBody build() {
            return new DescribeInstanceLatencyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceLatencyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceLatencyResponseBody</p>
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

            private Builder() {
            } 

            private Builder(MonitorItem model) {
                this.item = model.item;
                this.itemTime = model.itemTime;
                this.itemValue = model.itemValue;
            } 

            /**
             * <p>The metric. Valid values:</p>
             * <ul>
             * <li>gatewayLatency API: the processing latency of API Gateway</li>
             * <li>latency: the processing latency of the backend service.</li>
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
             * <p>The monitoring time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-06T02:05:13Z</p>
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * <p>The value of the average latency.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
     * {@link DescribeInstanceLatencyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceLatencyResponseBody</p>
     */
    public static class InstanceLatency extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItem")
        private java.util.List<MonitorItem> monitorItem;

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
        public java.util.List<MonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

        public static final class Builder {
            private java.util.List<MonitorItem> monitorItem; 

            private Builder() {
            } 

            private Builder(InstanceLatency model) {
                this.monitorItem = model.monitorItem;
            } 

            /**
             * MonitorItem.
             */
            public Builder monitorItem(java.util.List<MonitorItem> monitorItem) {
                this.monitorItem = monitorItem;
                return this;
            }

            public InstanceLatency build() {
                return new InstanceLatency(this);
            } 

        } 

    }
}
