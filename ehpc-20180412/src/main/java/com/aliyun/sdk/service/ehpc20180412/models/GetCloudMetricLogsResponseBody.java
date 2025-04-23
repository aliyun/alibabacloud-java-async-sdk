// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link GetCloudMetricLogsResponseBody} extends {@link TeaModel}
 *
 * <p>GetCloudMetricLogsResponseBody</p>
 */
public class GetCloudMetricLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetricLogs")
    private MetricLogs metricLogs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCloudMetricLogsResponseBody(Builder builder) {
        this.metricLogs = builder.metricLogs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudMetricLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricLogs
     */
    public MetricLogs getMetricLogs() {
        return this.metricLogs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MetricLogs metricLogs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCloudMetricLogsResponseBody model) {
            this.metricLogs = model.metricLogs;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried performance metric data.</p>
         */
        public Builder metricLogs(MetricLogs metricLogs) {
            this.metricLogs = metricLogs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>015C2C4D-1884-4EB7-BCD3-C5BB8D7E56DB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCloudMetricLogsResponseBody build() {
            return new GetCloudMetricLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCloudMetricLogsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCloudMetricLogsResponseBody</p>
     */
    public static class MetricLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskDevice")
        private String diskDevice;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MetricData")
        private String metricData;

        @com.aliyun.core.annotation.NameInMap("NetworkInterface")
        private String networkInterface;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Integer time;

        private MetricLog(Builder builder) {
            this.diskDevice = builder.diskDevice;
            this.hostname = builder.hostname;
            this.instanceId = builder.instanceId;
            this.metricData = builder.metricData;
            this.networkInterface = builder.networkInterface;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricLog create() {
            return builder().build();
        }

        /**
         * @return diskDevice
         */
        public String getDiskDevice() {
            return this.diskDevice;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return metricData
         */
        public String getMetricData() {
            return this.metricData;
        }

        /**
         * @return networkInterface
         */
        public String getNetworkInterface() {
            return this.networkInterface;
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        public static final class Builder {
            private String diskDevice; 
            private String hostname; 
            private String instanceId; 
            private String metricData; 
            private String networkInterface; 
            private Integer time; 

            private Builder() {
            } 

            private Builder(MetricLog model) {
                this.diskDevice = model.diskDevice;
                this.hostname = model.hostname;
                this.instanceId = model.instanceId;
                this.metricData = model.metricData;
                this.networkInterface = model.networkInterface;
                this.time = model.time;
            } 

            /**
             * <p>The name of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>vda1</p>
             */
            public Builder diskDevice(String diskDevice) {
                this.diskDevice = diskDevice;
                return this;
            }

            /**
             * <p>The hostname of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>compute000</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp132g97g7zwnvta****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>A JSON-formatted serialized string that contains performance metric data of multiple categories.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;process|cpusage&quot;:0,&quot;process|cpuser&quot;:0,&quot;process|cpusys&quot;:0,******}</p>
             */
            public Builder metricData(String metricData) {
                this.metricData = metricData;
                return this;
            }

            /**
             * <p>The name of the network interface.</p>
             * 
             * <strong>example:</strong>
             * <p>eth1</p>
             */
            public Builder networkInterface(String networkInterface) {
                this.networkInterface = networkInterface;
                return this;
            }

            /**
             * <p>The timestamp of the log. The time is a timestamp. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1583907780</p>
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            public MetricLog build() {
                return new MetricLog(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCloudMetricLogsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCloudMetricLogsResponseBody</p>
     */
    public static class MetricLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricLog")
        private java.util.List<MetricLog> metricLog;

        private MetricLogs(Builder builder) {
            this.metricLog = builder.metricLog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricLogs create() {
            return builder().build();
        }

        /**
         * @return metricLog
         */
        public java.util.List<MetricLog> getMetricLog() {
            return this.metricLog;
        }

        public static final class Builder {
            private java.util.List<MetricLog> metricLog; 

            private Builder() {
            } 

            private Builder(MetricLogs model) {
                this.metricLog = model.metricLog;
            } 

            /**
             * MetricLog.
             */
            public Builder metricLog(java.util.List<MetricLog> metricLog) {
                this.metricLog = metricLog;
                return this;
            }

            public MetricLogs build() {
                return new MetricLogs(this);
            } 

        } 

    }
}
