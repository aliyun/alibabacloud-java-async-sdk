// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeApiTrafficDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiTrafficDataResponseBody</p>
 */
public class DescribeApiTrafficDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallDownloads")
    private CallDownloads callDownloads;

    @com.aliyun.core.annotation.NameInMap("CallUploads")
    private CallUploads callUploads;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeApiTrafficDataResponseBody model) {
            this.callDownloads = model.callDownloads;
            this.callUploads = model.callUploads;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned downlink traffic data of API calls. It is an array consisting of MonitorItem data.</p>
         */
        public Builder callDownloads(CallDownloads callDownloads) {
            this.callDownloads = callDownloads;
            return this;
        }

        /**
         * <p>The returned uplink traffic data of API calls. It is an array consisting of MonitorItem data.</p>
         */
        public Builder callUploads(CallUploads callUploads) {
            this.callUploads = callUploads;
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

        public DescribeApiTrafficDataResponseBody build() {
            return new DescribeApiTrafficDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApiTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiTrafficDataResponseBody</p>
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

            private Builder() {
            } 

            private Builder(MonitorItem model) {
                this.itemTime = model.itemTime;
                this.itemValue = model.itemValue;
            } 

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
     * {@link DescribeApiTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiTrafficDataResponseBody</p>
     */
    public static class CallDownloads extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItem")
        private java.util.List<MonitorItem> monitorItem;

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
        public java.util.List<MonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

        public static final class Builder {
            private java.util.List<MonitorItem> monitorItem; 

            private Builder() {
            } 

            private Builder(CallDownloads model) {
                this.monitorItem = model.monitorItem;
            } 

            /**
             * MonitorItem.
             */
            public Builder monitorItem(java.util.List<MonitorItem> monitorItem) {
                this.monitorItem = monitorItem;
                return this;
            }

            public CallDownloads build() {
                return new CallDownloads(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApiTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiTrafficDataResponseBody</p>
     */
    public static class CallUploadsMonitorItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemTime")
        private String itemTime;

        @com.aliyun.core.annotation.NameInMap("ItemValue")
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

            private Builder() {
            } 

            private Builder(CallUploadsMonitorItem model) {
                this.itemTime = model.itemTime;
                this.itemValue = model.itemValue;
            } 

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
             * <p>670</p>
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
    /**
     * 
     * {@link DescribeApiTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiTrafficDataResponseBody</p>
     */
    public static class CallUploads extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItem")
        private java.util.List<CallUploadsMonitorItem> monitorItem;

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
        public java.util.List<CallUploadsMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

        public static final class Builder {
            private java.util.List<CallUploadsMonitorItem> monitorItem; 

            private Builder() {
            } 

            private Builder(CallUploads model) {
                this.monitorItem = model.monitorItem;
            } 

            /**
             * MonitorItem.
             */
            public Builder monitorItem(java.util.List<CallUploadsMonitorItem> monitorItem) {
                this.monitorItem = monitorItem;
                return this;
            }

            public CallUploads build() {
                return new CallUploads(this);
            } 

        } 

    }
}
