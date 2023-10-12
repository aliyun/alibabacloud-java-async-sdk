// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>ListMonitorDataResponseBody</p>
 */
public class ListMonitorDataResponseBody extends TeaModel {
    @NameInMap("MonitorData")
    private java.util.List < MonitorData> monitorData;

    @NameInMap("RequestId")
    private String requestId;

    private ListMonitorDataResponseBody(Builder builder) {
        this.monitorData = builder.monitorData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMonitorDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return monitorData
     */
    public java.util.List < MonitorData> getMonitorData() {
        return this.monitorData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < MonitorData> monitorData; 
        private String requestId; 

        /**
         * MonitorData.
         */
        public Builder monitorData(java.util.List < MonitorData> monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMonitorDataResponseBody build() {
            return new ListMonitorDataResponseBody(this);
        } 

    } 

    public static class MonitorData extends TeaModel {
        @NameInMap("DataItem")
        private String dataItem;

        @NameInMap("Key")
        private String key;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("Value")
        private String value;

        private MonitorData(Builder builder) {
            this.dataItem = builder.dataItem;
            this.key = builder.key;
            this.timestamp = builder.timestamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorData create() {
            return builder().build();
        }

        /**
         * @return dataItem
         */
        public String getDataItem() {
            return this.dataItem;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String dataItem; 
            private String key; 
            private Long timestamp; 
            private String value; 

            /**
             * DataItem.
             */
            public Builder dataItem(String dataItem) {
                this.dataItem = dataItem;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MonitorData build() {
                return new MonitorData(this);
            } 

        } 

    }
}
