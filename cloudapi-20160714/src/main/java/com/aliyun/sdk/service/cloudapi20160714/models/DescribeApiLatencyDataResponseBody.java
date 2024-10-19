// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApiLatencyDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiLatencyDataResponseBody</p>
 */
public class DescribeApiLatencyDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallLatencys")
    private CallLatencys callLatencys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The returned information about API call latency. It is an array consisting of MonitorItem data.</p>
         */
        public Builder callLatencys(CallLatencys callLatencys) {
            this.callLatencys = callLatencys;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApiLatencyDataResponseBody build() {
            return new DescribeApiLatencyDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApiLatencyDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiLatencyDataResponseBody</p>
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
             * <p>The time of the monitoring metric. The time format follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2016-07-28T08:20:00Z</p>
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * <p>The value corresponding to the monitoring metric.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
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
     * {@link DescribeApiLatencyDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiLatencyDataResponseBody</p>
     */
    public static class CallLatencys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItem")
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
