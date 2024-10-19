// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApiQpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiQpsDataResponseBody</p>
 */
public class DescribeApiQpsDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallFails")
    private CallFails callFails;

    @com.aliyun.core.annotation.NameInMap("CallSuccesses")
    private CallSuccesses callSuccesses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApiQpsDataResponseBody(Builder builder) {
        this.callFails = builder.callFails;
        this.callSuccesses = builder.callSuccesses;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiQpsDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return callFails
     */
    public CallFails getCallFails() {
        return this.callFails;
    }

    /**
     * @return callSuccesses
     */
    public CallSuccesses getCallSuccesses() {
        return this.callSuccesses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CallFails callFails; 
        private CallSuccesses callSuccesses; 
        private String requestId; 

        /**
         * <p>The returned information about failed API calls. It is an array consisting of MonitorItem data.</p>
         */
        public Builder callFails(CallFails callFails) {
            this.callFails = callFails;
            return this;
        }

        /**
         * <p>The returned information about successful API calls. It is an array consisting of MonitorItem data.</p>
         */
        public Builder callSuccesses(CallSuccesses callSuccesses) {
            this.callSuccesses = callSuccesses;
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

        public DescribeApiQpsDataResponseBody build() {
            return new DescribeApiQpsDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApiQpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiQpsDataResponseBody</p>
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
     * {@link DescribeApiQpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiQpsDataResponseBody</p>
     */
    public static class CallFails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItem")
        private java.util.List < MonitorItem> monitorItem;

        private CallFails(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallFails create() {
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

            public CallFails build() {
                return new CallFails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApiQpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiQpsDataResponseBody</p>
     */
    public static class CallSuccessesMonitorItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemTime")
        private String itemTime;

        @com.aliyun.core.annotation.NameInMap("ItemValue")
        private String itemValue;

        private CallSuccessesMonitorItem(Builder builder) {
            this.itemTime = builder.itemTime;
            this.itemValue = builder.itemValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallSuccessesMonitorItem create() {
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
             * <p>2016-07-28T08:24:00Z</p>
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * <p>The value corresponding to the monitoring metric.</p>
             * 
             * <strong>example:</strong>
             * <p>650</p>
             */
            public Builder itemValue(String itemValue) {
                this.itemValue = itemValue;
                return this;
            }

            public CallSuccessesMonitorItem build() {
                return new CallSuccessesMonitorItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApiQpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiQpsDataResponseBody</p>
     */
    public static class CallSuccesses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItem")
        private java.util.List < CallSuccessesMonitorItem> monitorItem;

        private CallSuccesses(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallSuccesses create() {
            return builder().build();
        }

        /**
         * @return monitorItem
         */
        public java.util.List < CallSuccessesMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

        public static final class Builder {
            private java.util.List < CallSuccessesMonitorItem> monitorItem; 

            /**
             * MonitorItem.
             */
            public Builder monitorItem(java.util.List < CallSuccessesMonitorItem> monitorItem) {
                this.monitorItem = monitorItem;
                return this;
            }

            public CallSuccesses build() {
                return new CallSuccesses(this);
            } 

        } 

    }
}
