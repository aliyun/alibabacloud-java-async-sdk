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
 * {@link DescribeGroupTrafficResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupTrafficResponseBody</p>
 */
public class DescribeGroupTrafficResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficPerSecond")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeGroupTrafficResponseBody model) {
            this.requestId = model.requestId;
            this.trafficPerSecond = model.trafficPerSecond;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EF924FE4-2EDD-4CD3-89EC-34E4708574E7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The traffic information per second.</p>
         */
        public Builder trafficPerSecond(TrafficPerSecond trafficPerSecond) {
            this.trafficPerSecond = trafficPerSecond;
            return this;
        }

        public DescribeGroupTrafficResponseBody build() {
            return new DescribeGroupTrafficResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGroupTrafficResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupTrafficResponseBody</p>
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
             * <li>inbound: traffic consumed by requests</li>
             * <li>outbound: traffic consumed by responses</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>inbound</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The corresponding time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-29T01:30:00Z</p>
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * <p>The traffic volume per second.</p>
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
     * {@link DescribeGroupTrafficResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupTrafficResponseBody</p>
     */
    public static class TrafficPerSecond extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItem")
        private java.util.List<MonitorItem> monitorItem;

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
        public java.util.List<MonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

        public static final class Builder {
            private java.util.List<MonitorItem> monitorItem; 

            private Builder() {
            } 

            private Builder(TrafficPerSecond model) {
                this.monitorItem = model.monitorItem;
            } 

            /**
             * MonitorItem.
             */
            public Builder monitorItem(java.util.List<MonitorItem> monitorItem) {
                this.monitorItem = monitorItem;
                return this;
            }

            public TrafficPerSecond build() {
                return new TrafficPerSecond(this);
            } 

        } 

    }
}
