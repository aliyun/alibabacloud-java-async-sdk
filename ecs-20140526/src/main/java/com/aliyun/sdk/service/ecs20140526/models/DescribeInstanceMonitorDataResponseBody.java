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
 * {@link DescribeInstanceMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceMonitorDataResponseBody</p>
 */
public class DescribeInstanceMonitorDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MonitorData")
    private MonitorData monitorData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceMonitorDataResponseBody(Builder builder) {
        this.monitorData = builder.monitorData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceMonitorDataResponseBody create() {
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
         * <p>The monitoring data of the instance.</p>
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

        public DescribeInstanceMonitorDataResponseBody build() {
            return new DescribeInstanceMonitorDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceMonitorDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceMonitorDataResponseBody</p>
     */
    public static class InstanceMonitorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BPSRead")
        private Integer BPSRead;

        @com.aliyun.core.annotation.NameInMap("BPSWrite")
        private Integer BPSWrite;

        @com.aliyun.core.annotation.NameInMap("CPU")
        private Integer CPU;

        @com.aliyun.core.annotation.NameInMap("CPUAdvanceCreditBalance")
        private Float CPUAdvanceCreditBalance;

        @com.aliyun.core.annotation.NameInMap("CPUCreditBalance")
        private Float CPUCreditBalance;

        @com.aliyun.core.annotation.NameInMap("CPUCreditUsage")
        private Float CPUCreditUsage;

        @com.aliyun.core.annotation.NameInMap("CPUNotpaidSurplusCreditUsage")
        private Float CPUNotpaidSurplusCreditUsage;

        @com.aliyun.core.annotation.NameInMap("IOPSRead")
        private Integer IOPSRead;

        @com.aliyun.core.annotation.NameInMap("IOPSWrite")
        private Integer IOPSWrite;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InternetBandwidth")
        private Integer internetBandwidth;

        @com.aliyun.core.annotation.NameInMap("InternetRX")
        private Integer internetRX;

        @com.aliyun.core.annotation.NameInMap("InternetTX")
        private Integer internetTX;

        @com.aliyun.core.annotation.NameInMap("IntranetBandwidth")
        private Integer intranetBandwidth;

        @com.aliyun.core.annotation.NameInMap("IntranetRX")
        private Integer intranetRX;

        @com.aliyun.core.annotation.NameInMap("IntranetTX")
        private Integer intranetTX;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private InstanceMonitorData(Builder builder) {
            this.BPSRead = builder.BPSRead;
            this.BPSWrite = builder.BPSWrite;
            this.CPU = builder.CPU;
            this.CPUAdvanceCreditBalance = builder.CPUAdvanceCreditBalance;
            this.CPUCreditBalance = builder.CPUCreditBalance;
            this.CPUCreditUsage = builder.CPUCreditUsage;
            this.CPUNotpaidSurplusCreditUsage = builder.CPUNotpaidSurplusCreditUsage;
            this.IOPSRead = builder.IOPSRead;
            this.IOPSWrite = builder.IOPSWrite;
            this.instanceId = builder.instanceId;
            this.internetBandwidth = builder.internetBandwidth;
            this.internetRX = builder.internetRX;
            this.internetTX = builder.internetTX;
            this.intranetBandwidth = builder.intranetBandwidth;
            this.intranetRX = builder.intranetRX;
            this.intranetTX = builder.intranetTX;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceMonitorData create() {
            return builder().build();
        }

        /**
         * @return BPSRead
         */
        public Integer getBPSRead() {
            return this.BPSRead;
        }

        /**
         * @return BPSWrite
         */
        public Integer getBPSWrite() {
            return this.BPSWrite;
        }

        /**
         * @return CPU
         */
        public Integer getCPU() {
            return this.CPU;
        }

        /**
         * @return CPUAdvanceCreditBalance
         */
        public Float getCPUAdvanceCreditBalance() {
            return this.CPUAdvanceCreditBalance;
        }

        /**
         * @return CPUCreditBalance
         */
        public Float getCPUCreditBalance() {
            return this.CPUCreditBalance;
        }

        /**
         * @return CPUCreditUsage
         */
        public Float getCPUCreditUsage() {
            return this.CPUCreditUsage;
        }

        /**
         * @return CPUNotpaidSurplusCreditUsage
         */
        public Float getCPUNotpaidSurplusCreditUsage() {
            return this.CPUNotpaidSurplusCreditUsage;
        }

        /**
         * @return IOPSRead
         */
        public Integer getIOPSRead() {
            return this.IOPSRead;
        }

        /**
         * @return IOPSWrite
         */
        public Integer getIOPSWrite() {
            return this.IOPSWrite;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return internetBandwidth
         */
        public Integer getInternetBandwidth() {
            return this.internetBandwidth;
        }

        /**
         * @return internetRX
         */
        public Integer getInternetRX() {
            return this.internetRX;
        }

        /**
         * @return internetTX
         */
        public Integer getInternetTX() {
            return this.internetTX;
        }

        /**
         * @return intranetBandwidth
         */
        public Integer getIntranetBandwidth() {
            return this.intranetBandwidth;
        }

        /**
         * @return intranetRX
         */
        public Integer getIntranetRX() {
            return this.intranetRX;
        }

        /**
         * @return intranetTX
         */
        public Integer getIntranetTX() {
            return this.intranetTX;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Integer BPSRead; 
            private Integer BPSWrite; 
            private Integer CPU; 
            private Float CPUAdvanceCreditBalance; 
            private Float CPUCreditBalance; 
            private Float CPUCreditUsage; 
            private Float CPUNotpaidSurplusCreditUsage; 
            private Integer IOPSRead; 
            private Integer IOPSWrite; 
            private String instanceId; 
            private Integer internetBandwidth; 
            private Integer internetRX; 
            private Integer internetTX; 
            private Integer intranetBandwidth; 
            private Integer intranetRX; 
            private Integer intranetTX; 
            private String timeStamp; 

            /**
             * <p>The read bandwidth of the cloud disks (system disk and data disks). Unit: Byte/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder BPSRead(Integer BPSRead) {
                this.BPSRead = BPSRead;
                return this;
            }

            /**
             * <p>The write bandwidth of the cloud disks (system disk and data disks). Unit: Byte/s.</p>
             * 
             * <strong>example:</strong>
             * <p>13585</p>
             */
            public Builder BPSWrite(Integer BPSWrite) {
                this.BPSWrite = BPSWrite;
                return this;
            }

            /**
             * <p>The vCPU utilization of the instance. Unit: percent (%).</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder CPU(Integer CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>The overdrawn CPU credits of the burstable instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0.4</p>
             */
            public Builder CPUAdvanceCreditBalance(Float CPUAdvanceCreditBalance) {
                this.CPUAdvanceCreditBalance = CPUAdvanceCreditBalance;
                return this;
            }

            /**
             * <p>The total number of CPU credits of the burstable instance.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder CPUCreditBalance(Float CPUCreditBalance) {
                this.CPUCreditBalance = CPUCreditBalance;
                return this;
            }

            /**
             * <p>The number of CPU credits consumed by the burstable instance.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder CPUCreditUsage(Float CPUCreditUsage) {
                this.CPUCreditUsage = CPUCreditUsage;
                return this;
            }

            /**
             * <p>The unpaid overdrawn CPU credits.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder CPUNotpaidSurplusCreditUsage(Float CPUNotpaidSurplusCreditUsage) {
                this.CPUNotpaidSurplusCreditUsage = CPUNotpaidSurplusCreditUsage;
                return this;
            }

            /**
             * <p>The number of read I/O operations per second on the cloud disks (system disk and data disks).</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder IOPSRead(Integer IOPSRead) {
                this.IOPSRead = IOPSRead;
                return this;
            }

            /**
             * <p>The number of write I/O operations per second on the cloud disks (system disk and data disks).</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder IOPSWrite(Integer IOPSWrite) {
                this.IOPSWrite = IOPSWrite;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1a36962lrhj4****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The public bandwidth of the instance. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder internetBandwidth(Integer internetBandwidth) {
                this.internetBandwidth = internetBandwidth;
                return this;
            }

            /**
             * <p>The Internet traffic received by the instance during the period that is specified by the <code>Period</code> parameter. The period starts from the point in time that is specified by the <code>TimeStamp</code> parameter. Unit: Kbit.</p>
             * 
             * <strong>example:</strong>
             * <p>122</p>
             */
            public Builder internetRX(Integer internetRX) {
                this.internetRX = internetRX;
                return this;
            }

            /**
             * <p>The Internet traffic sent by the instance during the period that is specified by the <code>Period</code> parameter. The period starts from the point in time that is specified by the <code>TimeStamp</code> parameter. Unit: Kbit.</p>
             * 
             * <strong>example:</strong>
             * <p>343</p>
             */
            public Builder internetTX(Integer internetTX) {
                this.internetTX = internetTX;
                return this;
            }

            /**
             * <p>The internal bandwidth of the instance. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder intranetBandwidth(Integer intranetBandwidth) {
                this.intranetBandwidth = intranetBandwidth;
                return this;
            }

            /**
             * <p>The internal data traffic received by the instance during the period that is specified by the <code>Period</code> parameter. The period starts from the point in time that is specified by the <code>TimeStamp</code> parameter. Unit: Kbit.</p>
             * 
             * <strong>example:</strong>
             * <p>122</p>
             */
            public Builder intranetRX(Integer intranetRX) {
                this.intranetRX = intranetRX;
                return this;
            }

            /**
             * <p>The internal data traffic sent by the instance during the period that is specified by the <code>Period</code> parameter. The period starts from the point in time that is specified by the <code>TimeStamp</code> parameter. Unit: Kbit.</p>
             * 
             * <strong>example:</strong>
             * <p>343</p>
             */
            public Builder intranetTX(Integer intranetTX) {
                this.intranetTX = intranetTX;
                return this;
            }

            /**
             * <p>The timestamp of the monitoring data.</p>
             * 
             * <strong>example:</strong>
             * <p>2014-10-30T05:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public InstanceMonitorData build() {
                return new InstanceMonitorData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceMonitorDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceMonitorDataResponseBody</p>
     */
    public static class MonitorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceMonitorData")
        private java.util.List<InstanceMonitorData> instanceMonitorData;

        private MonitorData(Builder builder) {
            this.instanceMonitorData = builder.instanceMonitorData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorData create() {
            return builder().build();
        }

        /**
         * @return instanceMonitorData
         */
        public java.util.List<InstanceMonitorData> getInstanceMonitorData() {
            return this.instanceMonitorData;
        }

        public static final class Builder {
            private java.util.List<InstanceMonitorData> instanceMonitorData; 

            /**
             * InstanceMonitorData.
             */
            public Builder instanceMonitorData(java.util.List<InstanceMonitorData> instanceMonitorData) {
                this.instanceMonitorData = instanceMonitorData;
                return this;
            }

            public MonitorData build() {
                return new MonitorData(this);
            } 

        } 

    }
}
