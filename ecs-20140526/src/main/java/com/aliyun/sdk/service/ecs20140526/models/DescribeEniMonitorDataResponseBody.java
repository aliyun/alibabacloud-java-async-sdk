// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEniMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEniMonitorDataResponseBody</p>
 */
public class DescribeEniMonitorDataResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("MonitorData")
    private MonitorData monitorData;

    private DescribeEniMonitorDataResponseBody(Builder builder) {
        this.totalCount = builder.totalCount;
        this.requestId = builder.requestId;
        this.monitorData = builder.monitorData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEniMonitorDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
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
        private Integer totalCount; 
        private String requestId; 
        private MonitorData monitorData; 

        /**
         * The number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A collection of monitoring data EniMonitorDataType of secondary Nic traffic.
         */
        public Builder monitorData(MonitorData monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        public DescribeEniMonitorDataResponseBody build() {
            return new DescribeEniMonitorDataResponseBody(this);
        } 

    } 

    public static class EniMonitorData extends TeaModel {
        @NameInMap("PacketRx")
        private String packetRx;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("DropPacketRx")
        private String dropPacketRx;

        @NameInMap("EniId")
        private String eniId;

        @NameInMap("DropPacketTx")
        private String dropPacketTx;

        @NameInMap("PacketTx")
        private String packetTx;

        @NameInMap("IntranetTx")
        private String intranetTx;

        @NameInMap("IntranetRx")
        private String intranetRx;

        private EniMonitorData(Builder builder) {
            this.packetRx = builder.packetRx;
            this.timeStamp = builder.timeStamp;
            this.dropPacketRx = builder.dropPacketRx;
            this.eniId = builder.eniId;
            this.dropPacketTx = builder.dropPacketTx;
            this.packetTx = builder.packetTx;
            this.intranetTx = builder.intranetTx;
            this.intranetRx = builder.intranetRx;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EniMonitorData create() {
            return builder().build();
        }

        /**
         * @return packetRx
         */
        public String getPacketRx() {
            return this.packetRx;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return dropPacketRx
         */
        public String getDropPacketRx() {
            return this.dropPacketRx;
        }

        /**
         * @return eniId
         */
        public String getEniId() {
            return this.eniId;
        }

        /**
         * @return dropPacketTx
         */
        public String getDropPacketTx() {
            return this.dropPacketTx;
        }

        /**
         * @return packetTx
         */
        public String getPacketTx() {
            return this.packetTx;
        }

        /**
         * @return intranetTx
         */
        public String getIntranetTx() {
            return this.intranetTx;
        }

        /**
         * @return intranetRx
         */
        public String getIntranetRx() {
            return this.intranetRx;
        }

        public static final class Builder {
            private String packetRx; 
            private String timeStamp; 
            private String dropPacketRx; 
            private String eniId; 
            private String dropPacketTx; 
            private String packetTx; 
            private String intranetTx; 
            private String intranetRx; 

            /**
             * The internal network packets received by the secondary Eni. Unit: packets.
             */
            public Builder packetRx(String packetRx) {
                this.packetRx = packetRx;
                return this;
            }

            /**
             * The timestamp used to query monitoring information. The time follows the ISO 8601 standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The secondary Eni receives discarded intranet packets. Unit: packets.
             */
            public Builder dropPacketRx(String dropPacketRx) {
                this.dropPacketRx = dropPacketRx;
                return this;
            }

            /**
             * The ID of the secondary Eni.
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * The discarded intranet packets sent by the secondary Eni. Unit: packets.
             */
            public Builder dropPacketTx(String dropPacketTx) {
                this.dropPacketTx = dropPacketTx;
                return this;
            }

            /**
             * The internal network packets sent by the secondary Eni. Unit: packets.
             */
            public Builder packetTx(String packetTx) {
                this.packetTx = packetTx;
                return this;
            }

            /**
             * The average rate of intranet data sent by the secondary Eni. Unit: kB/s.
             */
            public Builder intranetTx(String intranetTx) {
                this.intranetTx = intranetTx;
                return this;
            }

            /**
             * The average rate of intranet data received by the secondary Eni. Unit: kB/s.
             */
            public Builder intranetRx(String intranetRx) {
                this.intranetRx = intranetRx;
                return this;
            }

            public EniMonitorData build() {
                return new EniMonitorData(this);
            } 

        } 

    }
    public static class MonitorData extends TeaModel {
        @NameInMap("EniMonitorData")
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
