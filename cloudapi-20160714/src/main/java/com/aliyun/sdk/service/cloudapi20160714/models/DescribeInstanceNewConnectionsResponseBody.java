// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceNewConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceNewConnectionsResponseBody</p>
 */
public class DescribeInstanceNewConnectionsResponseBody extends TeaModel {
    @NameInMap("InstanceNewConnections")
    private InstanceNewConnections instanceNewConnections;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceNewConnectionsResponseBody(Builder builder) {
        this.instanceNewConnections = builder.instanceNewConnections;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceNewConnectionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceNewConnections
     */
    public InstanceNewConnections getInstanceNewConnections() {
        return this.instanceNewConnections;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceNewConnections instanceNewConnections; 
        private String requestId; 

        /**
         * The list of new connections in the instance.
         */
        public Builder instanceNewConnections(InstanceNewConnections instanceNewConnections) {
            this.instanceNewConnections = instanceNewConnections;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceNewConnectionsResponseBody build() {
            return new DescribeInstanceNewConnectionsResponseBody(this);
        } 

    } 

    public static class MonitorItem extends TeaModel {
        @NameInMap("ItemTime")
        private String itemTime;

        @NameInMap("ItemValue")
        private String itemValue;

        private MonitorItem(Builder builder) {
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
            private String itemTime; 
            private String itemValue; 

            /**
             * The monitoring time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * The number of new connections in the instance.
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
    public static class InstanceNewConnections extends TeaModel {
        @NameInMap("MonitorItem")
        private java.util.List < MonitorItem> monitorItem;

        private InstanceNewConnections(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceNewConnections create() {
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

            public InstanceNewConnections build() {
                return new InstanceNewConnections(this);
            } 

        } 

    }
}
