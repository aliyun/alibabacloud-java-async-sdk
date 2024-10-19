// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstanceDropConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceDropConnectionsResponseBody</p>
 */
public class DescribeInstanceDropConnectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceDropConnections")
    private InstanceDropConnections instanceDropConnections;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceDropConnectionsResponseBody(Builder builder) {
        this.instanceDropConnections = builder.instanceDropConnections;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceDropConnectionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceDropConnections
     */
    public InstanceDropConnections getInstanceDropConnections() {
        return this.instanceDropConnections;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceDropConnections instanceDropConnections; 
        private String requestId; 

        /**
         * <p>The list of dropped connections in the instance.</p>
         */
        public Builder instanceDropConnections(InstanceDropConnections instanceDropConnections) {
            this.instanceDropConnections = instanceDropConnections;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceDropConnectionsResponseBody build() {
            return new DescribeInstanceDropConnectionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceDropConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceDropConnectionsResponseBody</p>
     */
    public static class MonitorItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemTime")
        private String itemTime;

        @com.aliyun.core.annotation.NameInMap("ItemValue")
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
             * <p>The monitoring time. The time follows the ISO 8601 standard. Format: YYYY-MM-DDThh:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-31T01:11:00Z</p>
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * <p>The number of dropped packets in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
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
     * {@link DescribeInstanceDropConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceDropConnectionsResponseBody</p>
     */
    public static class InstanceDropConnections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItem")
        private java.util.List < MonitorItem> monitorItem;

        private InstanceDropConnections(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceDropConnections create() {
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

            public InstanceDropConnections build() {
                return new InstanceDropConnections(this);
            } 

        } 

    }
}
