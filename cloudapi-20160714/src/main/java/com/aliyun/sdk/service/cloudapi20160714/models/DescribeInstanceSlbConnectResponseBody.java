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
 * {@link DescribeInstanceSlbConnectResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSlbConnectResponseBody</p>
 */
public class DescribeInstanceSlbConnectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceSlbConnect")
    private InstanceSlbConnect instanceSlbConnect;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceSlbConnectResponseBody(Builder builder) {
        this.instanceSlbConnect = builder.instanceSlbConnect;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSlbConnectResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceSlbConnect
     */
    public InstanceSlbConnect getInstanceSlbConnect() {
        return this.instanceSlbConnect;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceSlbConnect instanceSlbConnect; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceSlbConnectResponseBody model) {
            this.instanceSlbConnect = model.instanceSlbConnect;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of concurrent connections in the instance.</p>
         */
        public Builder instanceSlbConnect(InstanceSlbConnect instanceSlbConnect) {
            this.instanceSlbConnect = instanceSlbConnect;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E7FE7172-AA75-5880-B6F7-C00893E9BC06</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceSlbConnectResponseBody build() {
            return new DescribeInstanceSlbConnectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceSlbConnectResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSlbConnectResponseBody</p>
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
             * <li>InstanceMaxConnection: the maximum number of connections</li>
             * <li>InstanceInactiveConnection: the number of inactive connections</li>
             * <li>InstanceActiveConnection: the number of active connections</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InstanceActiveConnection</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The monitoring time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-15T15:07:06Z</p>
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * <p>The number of concurrent connections in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
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
     * {@link DescribeInstanceSlbConnectResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSlbConnectResponseBody</p>
     */
    public static class InstanceSlbConnect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItem")
        private java.util.List<MonitorItem> monitorItem;

        private InstanceSlbConnect(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSlbConnect create() {
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

            private Builder(InstanceSlbConnect model) {
                this.monitorItem = model.monitorItem;
            } 

            /**
             * MonitorItem.
             */
            public Builder monitorItem(java.util.List<MonitorItem> monitorItem) {
                this.monitorItem = monitorItem;
                return this;
            }

            public InstanceSlbConnect build() {
                return new InstanceSlbConnect(this);
            } 

        } 

    }
}
