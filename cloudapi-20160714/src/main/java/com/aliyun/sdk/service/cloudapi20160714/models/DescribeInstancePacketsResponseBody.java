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
 * {@link DescribeInstancePacketsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancePacketsResponseBody</p>
 */
public class DescribeInstancePacketsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstancePackets")
    private InstancePackets instancePackets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInstancePacketsResponseBody model) {
            this.instancePackets = model.instancePackets;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of inbound and outbound data packets in the instance.</p>
         */
        public Builder instancePackets(InstancePackets instancePackets) {
            this.instancePackets = instancePackets;
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

        public DescribeInstancePacketsResponseBody build() {
            return new DescribeInstancePacketsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstancePacketsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancePacketsResponseBody</p>
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
             * <li>InstancePacketRX: inbound data packets</li>
             * <li>InstancePacketTX: outbound data packets</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InstancePacketRX</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The monitoring time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-24T10:14:53Z</p>
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * <p>The number of inbound and outbound data packets in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link DescribeInstancePacketsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancePacketsResponseBody</p>
     */
    public static class InstancePackets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItem")
        private java.util.List<MonitorItem> monitorItem;

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
        public java.util.List<MonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

        public static final class Builder {
            private java.util.List<MonitorItem> monitorItem; 

            private Builder() {
            } 

            private Builder(InstancePackets model) {
                this.monitorItem = model.monitorItem;
            } 

            /**
             * MonitorItem.
             */
            public Builder monitorItem(java.util.List<MonitorItem> monitorItem) {
                this.monitorItem = monitorItem;
                return this;
            }

            public InstancePackets build() {
                return new InstancePackets(this);
            } 

        } 

    }
}
