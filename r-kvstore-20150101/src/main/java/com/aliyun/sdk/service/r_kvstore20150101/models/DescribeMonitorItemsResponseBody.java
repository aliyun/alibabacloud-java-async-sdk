// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorItemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorItemsResponseBody</p>
 */
public class DescribeMonitorItemsResponseBody extends TeaModel {
    @NameInMap("MonitorItems")
    private MonitorItems monitorItems;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMonitorItemsResponseBody(Builder builder) {
        this.monitorItems = builder.monitorItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return monitorItems
     */
    public MonitorItems getMonitorItems() {
        return this.monitorItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MonitorItems monitorItems; 
        private String requestId; 

        /**
         * The returned metrics.
         * <p>
         * 
         * > *   **memoryUsage**, **GetQps**, and **PutQps** are supported only by ApsaraDB for Redis instances that use Redis 4.0 or later. **GetQps** and **PutQps** require the latest minor version. You can upgrade the major version or minor version of the instance as needed. For more information, see [Upgrade the major version](~~101764~~) and [Upgrade the minor version](~~56450~~).
         * > *   When you use instances of Redis 2.8, if the **hit_rate** metric is not displayed, you must upgrade the minor version of the instance. For more information, see [Upgrade the minor version](~~56450~~).
         */
        public Builder monitorItems(MonitorItems monitorItems) {
            this.monitorItems = monitorItems;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMonitorItemsResponseBody build() {
            return new DescribeMonitorItemsResponseBody(this);
        } 

    } 

    public static class KVStoreMonitorItem extends TeaModel {
        @NameInMap("MonitorKey")
        private String monitorKey;

        @NameInMap("Unit")
        private String unit;

        private KVStoreMonitorItem(Builder builder) {
            this.monitorKey = builder.monitorKey;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KVStoreMonitorItem create() {
            return builder().build();
        }

        /**
         * @return monitorKey
         */
        public String getMonitorKey() {
            return this.monitorKey;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String monitorKey; 
            private String unit; 

            /**
             * The metric.
             */
            public Builder monitorKey(String monitorKey) {
                this.monitorKey = monitorKey;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public KVStoreMonitorItem build() {
                return new KVStoreMonitorItem(this);
            } 

        } 

    }
    public static class MonitorItems extends TeaModel {
        @NameInMap("KVStoreMonitorItem")
        private java.util.List < KVStoreMonitorItem> KVStoreMonitorItem;

        private MonitorItems(Builder builder) {
            this.KVStoreMonitorItem = builder.KVStoreMonitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorItems create() {
            return builder().build();
        }

        /**
         * @return KVStoreMonitorItem
         */
        public java.util.List < KVStoreMonitorItem> getKVStoreMonitorItem() {
            return this.KVStoreMonitorItem;
        }

        public static final class Builder {
            private java.util.List < KVStoreMonitorItem> KVStoreMonitorItem; 

            /**
             * KVStoreMonitorItem.
             */
            public Builder KVStoreMonitorItem(java.util.List < KVStoreMonitorItem> KVStoreMonitorItem) {
                this.KVStoreMonitorItem = KVStoreMonitorItem;
                return this;
            }

            public MonitorItems build() {
                return new MonitorItems(this);
            } 

        } 

    }
}
