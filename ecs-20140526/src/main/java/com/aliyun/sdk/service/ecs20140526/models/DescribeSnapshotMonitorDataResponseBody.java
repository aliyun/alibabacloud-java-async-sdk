// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSnapshotMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotMonitorDataResponseBody</p>
 */
public class DescribeSnapshotMonitorDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MonitorData")
    private MonitorData monitorData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSnapshotMonitorDataResponseBody(Builder builder) {
        this.monitorData = builder.monitorData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotMonitorDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return monitorData
     */
    public MonitorData getMonitorData() {
        return this.monitorData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MonitorData monitorData; 
        private String requestId; 

        /**
         * <p>The monitoring data of snapshot sizes.</p>
         */
        public Builder monitorData(MonitorData monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9F8163A8-F5DE-47A2-A572-4E062D223E09</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSnapshotMonitorDataResponseBody build() {
            return new DescribeSnapshotMonitorDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSnapshotMonitorDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotMonitorDataResponseBody</p>
     */
    public static class DataPoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private DataPoint(Builder builder) {
            this.size = builder.size;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataPoint create() {
            return builder().build();
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long size; 
            private String timeStamp; 

            /**
             * <p>The total size of snapshots. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>243036848128</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The timestamp that corresponds to a snapshot size.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-10T04:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public DataPoint build() {
                return new DataPoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSnapshotMonitorDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotMonitorDataResponseBody</p>
     */
    public static class MonitorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataPoint")
        private java.util.List < DataPoint> dataPoint;

        private MonitorData(Builder builder) {
            this.dataPoint = builder.dataPoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorData create() {
            return builder().build();
        }

        /**
         * @return dataPoint
         */
        public java.util.List < DataPoint> getDataPoint() {
            return this.dataPoint;
        }

        public static final class Builder {
            private java.util.List < DataPoint> dataPoint; 

            /**
             * DataPoint.
             */
            public Builder dataPoint(java.util.List < DataPoint> dataPoint) {
                this.dataPoint = dataPoint;
                return this;
            }

            public MonitorData build() {
                return new MonitorData(this);
            } 

        } 

    }
}
