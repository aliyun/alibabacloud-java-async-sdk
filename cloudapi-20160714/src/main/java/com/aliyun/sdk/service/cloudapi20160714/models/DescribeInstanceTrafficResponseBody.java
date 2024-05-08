// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTrafficResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTrafficResponseBody</p>
 */
public class DescribeInstanceTrafficResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceTraffic")
    private InstanceTraffic instanceTraffic;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceTrafficResponseBody(Builder builder) {
        this.instanceTraffic = builder.instanceTraffic;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTrafficResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceTraffic
     */
    public InstanceTraffic getInstanceTraffic() {
        return this.instanceTraffic;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceTraffic instanceTraffic; 
        private String requestId; 

        /**
         * The traffic consumed by the requests and responses in the instance.
         */
        public Builder instanceTraffic(InstanceTraffic instanceTraffic) {
            this.instanceTraffic = instanceTraffic;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceTrafficResponseBody build() {
            return new DescribeInstanceTrafficResponseBody(this);
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
             * *   inbound: traffic consumed by requests
             * *   outbound: traffic consumed by responses
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
             * The amount of traffic consumed by the requests and responses in the instance.
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
    public static class InstanceTraffic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItem")
        private java.util.List < MonitorItem> monitorItem;

        private InstanceTraffic(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTraffic create() {
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

            public InstanceTraffic build() {
                return new InstanceTraffic(this);
            } 

        } 

    }
}
