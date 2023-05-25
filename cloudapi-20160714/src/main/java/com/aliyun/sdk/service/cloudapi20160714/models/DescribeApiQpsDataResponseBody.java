// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiQpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiQpsDataResponseBody</p>
 */
public class DescribeApiQpsDataResponseBody extends TeaModel {
    @NameInMap("CallFails")
    private CallFails callFails;

    @NameInMap("CallSuccesses")
    private CallSuccesses callSuccesses;

    @NameInMap("RequestId")
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
         * CallFails.
         */
        public Builder callFails(CallFails callFails) {
            this.callFails = callFails;
            return this;
        }

        /**
         * CallSuccesses.
         */
        public Builder callSuccesses(CallSuccesses callSuccesses) {
            this.callSuccesses = callSuccesses;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApiQpsDataResponseBody build() {
            return new DescribeApiQpsDataResponseBody(this);
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
             * ItemTime.
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * ItemValue.
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
    public static class CallFails extends TeaModel {
        @NameInMap("MonitorItem")
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
    public static class CallSuccessesMonitorItem extends TeaModel {
        @NameInMap("ItemTime")
        private String itemTime;

        @NameInMap("ItemValue")
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
             * ItemTime.
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * ItemValue.
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
    public static class CallSuccesses extends TeaModel {
        @NameInMap("MonitorItem")
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
