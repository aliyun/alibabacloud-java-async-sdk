// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEniMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEniMonitorDataResponseBody</p>
 */
public class DescribeEniMonitorDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MonitorData")
    private MonitorData monitorData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEniMonitorDataResponseBody(Builder builder) {
        this.monitorData = builder.monitorData;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEniMonitorDataResponseBody create() {
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private MonitorData monitorData; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The monitoring data of the secondary ENI.
         */
        public Builder monitorData(MonitorData monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEniMonitorDataResponseBody build() {
            return new DescribeEniMonitorDataResponseBody(this);
        } 

    } 

    public static class EniMonitorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DropPacketRx")
        private String dropPacketRx;

        @com.aliyun.core.annotation.NameInMap("DropPacketTx")
        private String dropPacketTx;

        @com.aliyun.core.annotation.NameInMap("EniId")
        private String eniId;

        @com.aliyun.core.annotation.NameInMap("IntranetRx")
        private String intranetRx;

        @com.aliyun.core.annotation.NameInMap("IntranetTx")
        private String intranetTx;

        @com.aliyun.core.annotation.NameInMap("PacketRx")
        private String packetRx;

        @com.aliyun.core.annotation.NameInMap("PacketTx")
        private String packetTx;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private EniMonitorData(Builder builder) {
            this.dropPacketRx = builder.dropPacketRx;
            this.dropPacketTx = builder.dropPacketTx;
            this.eniId = builder.eniId;
            this.intranetRx = builder.intranetRx;
            this.intranetTx = builder.intranetTx;
            this.packetRx = builder.packetRx;
            this.packetTx = builder.packetTx;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EniMonitorData create() {
            return builder().build();
        }

        /**
         * @return dropPacketRx
         */
        public String getDropPacketRx() {
            return this.dropPacketRx;
        }

        /**
         * @return dropPacketTx
         */
        public String getDropPacketTx() {
            return this.dropPacketTx;
        }

        /**
         * @return eniId
         */
        public String getEniId() {
            return this.eniId;
        }

        /**
         * @return intranetRx
         */
        public String getIntranetRx() {
            return this.intranetRx;
        }

        /**
         * @return intranetTx
         */
        public String getIntranetTx() {
            return this.intranetTx;
        }

        /**
         * @return packetRx
         */
        public String getPacketRx() {
            return this.packetRx;
        }

        /**
         * @return packetTx
         */
        public String getPacketTx() {
            return this.packetTx;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String dropPacketRx; 
            private String dropPacketTx; 
            private String eniId; 
            private String intranetRx; 
            private String intranetTx; 
            private String packetRx; 
            private String packetTx; 
            private String timeStamp; 

            /**
             * The number of received packets that were dropped by the secondary ENI over the internal network.
             */
            public Builder dropPacketRx(String dropPacketRx) {
                this.dropPacketRx = dropPacketRx;
                return this;
            }

            /**
             * The number of sent packets that were dropped by the secondary ENI over the internal network.
             */
            public Builder dropPacketTx(String dropPacketTx) {
                this.dropPacketTx = dropPacketTx;
                return this;
            }

            /**
             * The ID of the secondary ENI.
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * The average rate at which the secondary ENI received data over the internal network. Unit: Kbit/s.
             */
            public Builder intranetRx(String intranetRx) {
                this.intranetRx = intranetRx;
                return this;
            }

            /**
             * The average rate at which the secondary ENI sent data over the internal network. Unit: Kbit/s.
             */
            public Builder intranetTx(String intranetTx) {
                this.intranetTx = intranetTx;
                return this;
            }

            /**
             * The number of packets received by the secondary ENI over the internal network.
             */
            public Builder packetRx(String packetRx) {
                this.packetRx = packetRx;
                return this;
            }

            /**
             * The number of packets sent by the secondary ENI over the internal network.
             */
            public Builder packetTx(String packetTx) {
                this.packetTx = packetTx;
                return this;
            }

            /**
             * The timestamp of the monitoring data. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public EniMonitorData build() {
                return new EniMonitorData(this);
            } 

        } 

    }
    public static class MonitorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EniMonitorData")
        private java.util.List < EniMonitorData> eniMonitorData;

        private MonitorData(Builder builder) {
            this.eniMonitorData = builder.eniMonitorData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorData create() {
            return builder().build();
        }

        /**
         * @return eniMonitorData
         */
        public java.util.List < EniMonitorData> getEniMonitorData() {
            return this.eniMonitorData;
        }

        public static final class Builder {
            private java.util.List < EniMonitorData> eniMonitorData; 

            /**
             * EniMonitorData.
             */
            public Builder eniMonitorData(java.util.List < EniMonitorData> eniMonitorData) {
                this.eniMonitorData = eniMonitorData;
                return this;
            }

            public MonitorData build() {
                return new MonitorData(this);
            } 

        } 

    }
}
