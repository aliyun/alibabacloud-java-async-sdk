// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiLatencyDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiLatencyDataResponseBody</p>
 */
public class DescribeApiLatencyDataResponseBody extends TeaModel {
    @NameInMap("CallLatencys")
    private CallLatencys callLatencys;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeApiLatencyDataResponseBody(Builder builder) {
        this.callLatencys = builder.callLatencys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiLatencyDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return callLatencys
     */
    public CallLatencys getCallLatencys() {
        return this.callLatencys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CallLatencys callLatencys; 
        private String requestId; 

        /**
         * The value corresponding to the monitoring metric.
         */
        public Builder callLatencys(CallLatencys callLatencys) {
            this.callLatencys = callLatencys;
            return this;
        }

        /**
         * The returned information about API call latency. It is an array consisting of MonitorItem data.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApiLatencyDataResponseBody build() {
            return new DescribeApiLatencyDataResponseBody(this);
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
             * auditing
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * The time of the monitoring metric. The time format follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ
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
    public static class CallLatencys extends TeaModel {
        @NameInMap("MonitorItem")
        private java.util.List < MonitorItem> monitorItem;

        private CallLatencys(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallLatencys create() {
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

            public CallLatencys build() {
                return new CallLatencys(this);
            } 

        } 

    }
}
