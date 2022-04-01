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
    @NameInMap("MonitorData")
    private MonitorData monitorData;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * MonitorData.
         */
        public Builder monitorData(MonitorData monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("DropPacketRx")
        private String dropPacketRx;

        @NameInMap("DropPacketTx")
        private String dropPacketTx;

        @NameInMap("EniId")
        private String eniId;

        @NameInMap("IntranetRx")
        private String intranetRx;

        @NameInMap("IntranetTx")
        private String intranetTx;

        @NameInMap("PacketRx")
        private String packetRx;

        @NameInMap("PacketTx")
        private String packetTx;

        @NameInMap("TimeStamp")
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
             * DropPacketRx.
             */
            public Builder dropPacketRx(String dropPacketRx) {
                this.dropPacketRx = dropPacketRx;
                return this;
            }

            /**
             * DropPacketTx.
             */
            public Builder dropPacketTx(String dropPacketTx) {
                this.dropPacketTx = dropPacketTx;
                return this;
            }

            /**
             * EniId.
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * IntranetRx.
             */
            public Builder intranetRx(String intranetRx) {
                this.intranetRx = intranetRx;
                return this;
            }

            /**
             * IntranetTx.
             */
            public Builder intranetTx(String intranetTx) {
                this.intranetTx = intranetTx;
                return this;
            }

            /**
             * PacketRx.
             */
            public Builder packetRx(String packetRx) {
                this.packetRx = packetRx;
                return this;
            }

            /**
             * PacketTx.
             */
            public Builder packetTx(String packetTx) {
                this.packetTx = packetTx;
                return this;
            }

            /**
             * TimeStamp.
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
