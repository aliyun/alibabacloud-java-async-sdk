// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeMonitorItemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorItemsResponseBody</p>
 */
public class DescribeMonitorItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MonitorItems")
    private MonitorItems monitorItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeMonitorItemsResponseBody model) {
            this.monitorItems = model.monitorItems;
            this.requestId = model.requestId;
        } 

        /**
         * MonitorItems.
         */
        public Builder monitorItems(MonitorItems monitorItems) {
            this.monitorItems = monitorItems;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8BEB2618-9517-43F3-A233-E0B34512****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMonitorItemsResponseBody build() {
            return new DescribeMonitorItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMonitorItemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorItemsResponseBody</p>
     */
    public static class KVStoreMonitorItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorKey")
        private String monitorKey;

        @com.aliyun.core.annotation.NameInMap("Unit")
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

            private Builder() {
            } 

            private Builder(KVStoreMonitorItem model) {
                this.monitorKey = model.monitorKey;
                this.unit = model.unit;
            } 

            /**
             * MonitorKey.
             */
            public Builder monitorKey(String monitorKey) {
                this.monitorKey = monitorKey;
                return this;
            }

            /**
             * Unit.
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
    /**
     * 
     * {@link DescribeMonitorItemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorItemsResponseBody</p>
     */
    public static class MonitorItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KVStoreMonitorItem")
        private java.util.List<KVStoreMonitorItem> KVStoreMonitorItem;

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
        public java.util.List<KVStoreMonitorItem> getKVStoreMonitorItem() {
            return this.KVStoreMonitorItem;
        }

        public static final class Builder {
            private java.util.List<KVStoreMonitorItem> KVStoreMonitorItem; 

            private Builder() {
            } 

            private Builder(MonitorItems model) {
                this.KVStoreMonitorItem = model.KVStoreMonitorItem;
            } 

            /**
             * KVStoreMonitorItem.
             */
            public Builder KVStoreMonitorItem(java.util.List<KVStoreMonitorItem> KVStoreMonitorItem) {
                this.KVStoreMonitorItem = KVStoreMonitorItem;
                return this;
            }

            public MonitorItems build() {
                return new MonitorItems(this);
            } 

        } 

    }
}
