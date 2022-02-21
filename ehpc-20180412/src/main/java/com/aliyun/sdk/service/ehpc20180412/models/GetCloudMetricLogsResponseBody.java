// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudMetricLogsResponseBody} extends {@link TeaModel}
 *
 * <p>GetCloudMetricLogsResponseBody</p>
 */
public class GetCloudMetricLogsResponseBody extends TeaModel {
    @NameInMap("MetricLogs")
    private MetricLogs metricLogs;

    @NameInMap("RequestId")
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

        /**
         * MetricLogs.
         */
        public Builder metricLogs(MetricLogs metricLogs) {
            this.metricLogs = metricLogs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCloudMetricLogsResponseBody build() {
            return new GetCloudMetricLogsResponseBody(this);
        } 

    } 

    public static class MetricLog extends TeaModel {
        @NameInMap("DiskDevice")
        private String diskDevice;

        @NameInMap("Hostname")
        private String hostname;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MetricData")
        private String metricData;

        @NameInMap("NetworkInterface")
        private String networkInterface;

        @NameInMap("Time")
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

            /**
             * DiskDevice.
             */
            public Builder diskDevice(String diskDevice) {
                this.diskDevice = diskDevice;
                return this;
            }

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MetricData.
             */
            public Builder metricData(String metricData) {
                this.metricData = metricData;
                return this;
            }

            /**
             * NetworkInterface.
             */
            public Builder networkInterface(String networkInterface) {
                this.networkInterface = networkInterface;
                return this;
            }

            /**
             * Time.
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
    public static class MetricLogs extends TeaModel {
        @NameInMap("MetricLog")
        private java.util.List < MetricLog> metricLog;

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
        public java.util.List < MetricLog> getMetricLog() {
            return this.metricLog;
        }

        public static final class Builder {
            private java.util.List < MetricLog> metricLog; 

            /**
             * MetricLog.
             */
            public Builder metricLog(java.util.List < MetricLog> metricLog) {
                this.metricLog = metricLog;
                return this;
            }

            public MetricLogs build() {
                return new MetricLogs(this);
            } 

        } 

    }
}
