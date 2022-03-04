// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotMonitorDataResponseBody</p>
 */
public class DescribeSnapshotMonitorDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("MonitorData")
    private MonitorData monitorData;

    private DescribeSnapshotMonitorDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.monitorData = builder.monitorData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotMonitorDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return monitorData
     */
    public MonitorData getMonitorData() {
        return this.monitorData;
    }

    public static final class Builder {
        private String requestId; 
        private MonitorData monitorData; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The collection of snapshot capacity change data.
         */
        public Builder monitorData(MonitorData monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        public DescribeSnapshotMonitorDataResponseBody build() {
            return new DescribeSnapshotMonitorDataResponseBody(this);
        } 

    } 

    public static class DataPoint extends TeaModel {
        @NameInMap("Size")
        private Long size;

        @NameInMap("TimeStamp")
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
             * The total size of the snapshot. Unit: bytes.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The timestamp corresponding to the size of a snapshot.
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
    public static class MonitorData extends TeaModel {
        @NameInMap("DataPoint")
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
