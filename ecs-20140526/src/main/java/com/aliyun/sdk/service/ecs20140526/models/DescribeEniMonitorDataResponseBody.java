// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeEniMonitorDataResponseBody model) {
            this.monitorData = model.monitorData;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The monitoring data of the secondary ENI.</p>
         */
        public Builder monitorData(MonitorData monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEniMonitorDataResponseBody build() {
            return new DescribeEniMonitorDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEniMonitorDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEniMonitorDataResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(EniMonitorData model) {
                this.dropPacketRx = model.dropPacketRx;
                this.dropPacketTx = model.dropPacketTx;
                this.eniId = model.eniId;
                this.intranetRx = model.intranetRx;
                this.intranetTx = model.intranetTx;
                this.packetRx = model.packetRx;
                this.packetTx = model.packetTx;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The number of received packets that were dropped by the secondary ENI over the internal network.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dropPacketRx(String dropPacketRx) {
                this.dropPacketRx = dropPacketRx;
                return this;
            }

            /**
             * <p>The number of sent packets that were dropped by the secondary ENI over the internal network.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dropPacketTx(String dropPacketTx) {
                this.dropPacketTx = dropPacketTx;
                return this;
            }

            /**
             * <p>The ID of the secondary ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-bp19da36d6xdwey****</p>
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * <p>The average rate at which the secondary ENI received data over the internal network. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder intranetRx(String intranetRx) {
                this.intranetRx = intranetRx;
                return this;
            }

            /**
             * <p>The average rate at which the secondary ENI sent data over the internal network. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder intranetTx(String intranetTx) {
                this.intranetTx = intranetTx;
                return this;
            }

            /**
             * <p>The number of packets received by the secondary ENI over the internal network.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder packetRx(String packetRx) {
                this.packetRx = packetRx;
                return this;
            }

            /**
             * <p>The number of packets sent by the secondary ENI over the internal network.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder packetTx(String packetTx) {
                this.packetTx = packetTx;
                return this;
            }

            /**
             * <p>The timestamp of the monitoring data. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-05-21T03:22:00Z</p>
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
    /**
     * 
     * {@link DescribeEniMonitorDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEniMonitorDataResponseBody</p>
     */
    public static class MonitorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EniMonitorData")
        private java.util.List<EniMonitorData> eniMonitorData;

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
        public java.util.List<EniMonitorData> getEniMonitorData() {
            return this.eniMonitorData;
        }

        public static final class Builder {
            private java.util.List<EniMonitorData> eniMonitorData; 

            private Builder() {
            } 

            private Builder(MonitorData model) {
                this.eniMonitorData = model.eniMonitorData;
            } 

            /**
             * EniMonitorData.
             */
            public Builder eniMonitorData(java.util.List<EniMonitorData> eniMonitorData) {
                this.eniMonitorData = eniMonitorData;
                return this;
            }

            public MonitorData build() {
                return new MonitorData(this);
            } 

        } 

    }
}
