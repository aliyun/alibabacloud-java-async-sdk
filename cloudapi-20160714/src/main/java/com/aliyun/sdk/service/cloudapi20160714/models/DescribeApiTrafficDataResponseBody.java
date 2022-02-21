// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiTrafficDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiTrafficDataResponseBody</p>
 */
public class DescribeApiTrafficDataResponseBody extends TeaModel {
    @NameInMap("CallDownloads")
    private CallDownloads callDownloads;

    @NameInMap("CallUploads")
    private CallUploads callUploads;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeApiTrafficDataResponseBody(Builder builder) {
        this.callDownloads = builder.callDownloads;
        this.callUploads = builder.callUploads;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiTrafficDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return callDownloads
     */
    public CallDownloads getCallDownloads() {
        return this.callDownloads;
    }

    /**
     * @return callUploads
     */
    public CallUploads getCallUploads() {
        return this.callUploads;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CallDownloads callDownloads; 
        private CallUploads callUploads; 
        private String requestId; 

        /**
         * CallDownloads.
         */
        public Builder callDownloads(CallDownloads callDownloads) {
            this.callDownloads = callDownloads;
            return this;
        }

        /**
         * CallUploads.
         */
        public Builder callUploads(CallUploads callUploads) {
            this.callUploads = callUploads;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApiTrafficDataResponseBody build() {
            return new DescribeApiTrafficDataResponseBody(this);
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
    public static class CallDownloads extends TeaModel {
        @NameInMap("MonitorItem")
        private java.util.List < MonitorItem> monitorItem;

        private CallDownloads(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallDownloads create() {
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

            public CallDownloads build() {
                return new CallDownloads(this);
            } 

        } 

    }
    public static class CallUploadsMonitorItem extends TeaModel {
        @NameInMap("ItemTime")
        private String itemTime;

        @NameInMap("ItemValue")
        private String itemValue;

        private CallUploadsMonitorItem(Builder builder) {
            this.itemTime = builder.itemTime;
            this.itemValue = builder.itemValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallUploadsMonitorItem create() {
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

            public CallUploadsMonitorItem build() {
                return new CallUploadsMonitorItem(this);
            } 

        } 

    }
    public static class CallUploads extends TeaModel {
        @NameInMap("MonitorItem")
        private java.util.List < CallUploadsMonitorItem> monitorItem;

        private CallUploads(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallUploads create() {
            return builder().build();
        }

        /**
         * @return monitorItem
         */
        public java.util.List < CallUploadsMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

        public static final class Builder {
            private java.util.List < CallUploadsMonitorItem> monitorItem; 

            /**
             * MonitorItem.
             */
            public Builder monitorItem(java.util.List < CallUploadsMonitorItem> monitorItem) {
                this.monitorItem = monitorItem;
                return this;
            }

            public CallUploads build() {
                return new CallUploads(this);
            } 

        } 

    }
}
