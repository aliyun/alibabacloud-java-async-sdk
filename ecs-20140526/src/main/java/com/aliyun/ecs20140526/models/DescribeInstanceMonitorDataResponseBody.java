// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceMonitorDataResponseBody</p>
 */
public class DescribeInstanceMonitorDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("MonitorData")
    private MonitorData monitorData;

    private DescribeInstanceMonitorDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.monitorData = builder.monitorData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceMonitorDataResponseBody create() {
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
         * The monitoring data set of the instance.
         */
        public Builder monitorData(MonitorData monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        public DescribeInstanceMonitorDataResponseBody build() {
            return new DescribeInstanceMonitorDataResponseBody(this);
        } 

    } 

    public static class InstanceMonitorData extends TeaModel {
        @NameInMap("CPUCreditBalance")
        private Float CPUCreditBalance;

        @NameInMap("BPSRead")
        private Integer BPSRead;

        @NameInMap("InternetTX")
        private Integer internetTX;

        @NameInMap("CPU")
        private Integer CPU;

        @NameInMap("CPUCreditUsage")
        private Float CPUCreditUsage;

        @NameInMap("IOPSWrite")
        private Integer IOPSWrite;

        @NameInMap("IntranetTX")
        private Integer intranetTX;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("BPSWrite")
        private Integer BPSWrite;

        @NameInMap("CPUNotpaidSurplusCreditUsage")
        private Float CPUNotpaidSurplusCreditUsage;

        @NameInMap("CPUAdvanceCreditBalance")
        private Float CPUAdvanceCreditBalance;

        @NameInMap("IOPSRead")
        private Integer IOPSRead;

        @NameInMap("InternetBandwidth")
        private Integer internetBandwidth;

        @NameInMap("InternetRX")
        private Integer internetRX;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("IntranetRX")
        private Integer intranetRX;

        @NameInMap("IntranetBandwidth")
        private Integer intranetBandwidth;

        private InstanceMonitorData(Builder builder) {
            this.CPUCreditBalance = builder.CPUCreditBalance;
            this.BPSRead = builder.BPSRead;
            this.internetTX = builder.internetTX;
            this.CPU = builder.CPU;
            this.CPUCreditUsage = builder.CPUCreditUsage;
            this.IOPSWrite = builder.IOPSWrite;
            this.intranetTX = builder.intranetTX;
            this.instanceId = builder.instanceId;
            this.BPSWrite = builder.BPSWrite;
            this.CPUNotpaidSurplusCreditUsage = builder.CPUNotpaidSurplusCreditUsage;
            this.CPUAdvanceCreditBalance = builder.CPUAdvanceCreditBalance;
            this.IOPSRead = builder.IOPSRead;
            this.internetBandwidth = builder.internetBandwidth;
            this.internetRX = builder.internetRX;
            this.timeStamp = builder.timeStamp;
            this.intranetRX = builder.intranetRX;
            this.intranetBandwidth = builder.intranetBandwidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceMonitorData create() {
            return builder().build();
        }

        /**
         * @return CPUCreditBalance
         */
        public Float getCPUCreditBalance() {
            return this.CPUCreditBalance;
        }

        /**
         * @return BPSRead
         */
        public Integer getBPSRead() {
            return this.BPSRead;
        }

        /**
         * @return internetTX
         */
        public Integer getInternetTX() {
            return this.internetTX;
        }

        /**
         * @return CPU
         */
        public Integer getCPU() {
            return this.CPU;
        }

        /**
         * @return CPUCreditUsage
         */
        public Float getCPUCreditUsage() {
            return this.CPUCreditUsage;
        }

        /**
         * @return IOPSWrite
         */
        public Integer getIOPSWrite() {
            return this.IOPSWrite;
        }

        /**
         * @return intranetTX
         */
        public Integer getIntranetTX() {
            return this.intranetTX;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return BPSWrite
         */
        public Integer getBPSWrite() {
            return this.BPSWrite;
        }

        /**
         * @return CPUNotpaidSurplusCreditUsage
         */
        public Float getCPUNotpaidSurplusCreditUsage() {
            return this.CPUNotpaidSurplusCreditUsage;
        }

        /**
         * @return CPUAdvanceCreditBalance
         */
        public Float getCPUAdvanceCreditBalance() {
            return this.CPUAdvanceCreditBalance;
        }

        /**
         * @return IOPSRead
         */
        public Integer getIOPSRead() {
            return this.IOPSRead;
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
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return intranetRX
         */
        public Integer getIntranetRX() {
            return this.intranetRX;
        }

        /**
         * @return intranetBandwidth
         */
        public Integer getIntranetBandwidth() {
            return this.intranetBandwidth;
        }

        public static final class Builder {
            private Float CPUCreditBalance; 
            private Integer BPSRead; 
            private Integer internetTX; 
            private Integer CPU; 
            private Float CPUCreditUsage; 
            private Integer IOPSWrite; 
            private Integer intranetTX; 
            private String instanceId; 
            private Integer BPSWrite; 
            private Float CPUNotpaidSurplusCreditUsage; 
            private Float CPUAdvanceCreditBalance; 
            private Integer IOPSRead; 
            private Integer internetBandwidth; 
            private Integer internetRX; 
            private String timeStamp; 
            private Integer intranetRX; 
            private Integer intranetBandwidth; 

            /**
             * Burst performance instance integral total number.
             */
            public Builder CPUCreditBalance(Float CPUCreditBalance) {
                this.CPUCreditBalance = CPUCreditBalance;
                return this;
            }

            /**
             * Instance cloud (including system disk and data plate) read bandwidth, unit: Byte/s.
             */
            public Builder BPSRead(Integer BPSRead) {
                this.BPSRead = BPSRead;
                return this;
            }

            /**
             * When you query monitoring information ("TimeStamp"), the public network data traffic sent by the instance within the specified interval ("1"). Unit: kbits.
             */
            public Builder internetTX(Integer internetTX) {
                this.internetTX = internetTX;
                return this;
            }

            /**
             * Instance of VCPUs use scale, unit: the percent (%).
             */
            public Builder CPU(Integer CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * Burst performance instance has been using number of points.
             */
            public Builder CPUCreditUsage(Float CPUCreditUsage) {
                this.CPUCreditUsage = CPUCreditUsage;
                return this;
            }

            /**
             * Instance cloud (including system disk and data plate) I/O write operation, unit: Times/s.
             */
            public Builder IOPSWrite(Integer IOPSWrite) {
                this.IOPSWrite = IOPSWrite;
                return this;
            }

            /**
             * The intranet data traffic sent by the instance within the specified interval ("timestamp") when the monitoring information is queried. Unit: kbits.
             */
            public Builder intranetTX(Integer intranetTX) {
                this.intranetTX = intranetTX;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Instance cloud (including system disk and data plate) write bandwidth, unit: Byte/s.
             */
            public Builder BPSWrite(Integer BPSWrite) {
                this.BPSWrite = BPSWrite;
                return this;
            }

            /**
             * Excess unpaid points.
             */
            public Builder CPUNotpaidSurplusCreditUsage(Float CPUNotpaidSurplusCreditUsage) {
                this.CPUNotpaidSurplusCreditUsage = CPUNotpaidSurplusCreditUsage;
                return this;
            }

            /**
             * Excess integral (burst performance instance integral overrun section).
             */
            public Builder CPUAdvanceCreditBalance(Float CPUAdvanceCreditBalance) {
                this.CPUAdvanceCreditBalance = CPUAdvanceCreditBalance;
                return this;
            }

            /**
             * Instance cloud (including system disk and data plate) I/O read operation, unit: Times/s.
             */
            public Builder IOPSRead(Integer IOPSRead) {
                this.IOPSRead = IOPSRead;
                return this;
            }

            /**
             * The Internet bandwidth of the instance. Unit: kbits/s.
             */
            public Builder internetBandwidth(Integer internetBandwidth) {
                this.internetBandwidth = internetBandwidth;
                return this;
            }

            /**
             * In query monitoring information ("timestamp"), instance at the specified interval time ("period") received in the public network data traffic. Unit: kbits.
             */
            public Builder internetRX(Integer internetRX) {
                this.internetRX = internetRX;
                return this;
            }

            /**
             * Query monitoring information timestamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * In query monitoring information ("timestamp"), instance at the specified interval time ("period") received in the intranet data traffic. Unit: kbits.
             */
            public Builder intranetRX(Integer intranetRX) {
                this.intranetRX = intranetRX;
                return this;
            }

            /**
             * The internal bandwidth of the instance. Unit: kbits/s.
             */
            public Builder intranetBandwidth(Integer intranetBandwidth) {
                this.intranetBandwidth = intranetBandwidth;
                return this;
            }

            public InstanceMonitorData build() {
                return new InstanceMonitorData(this);
            } 

        } 

    }
    public static class MonitorData extends TeaModel {
        @NameInMap("InstanceMonitorData")
        private java.util.List < InstanceMonitorData> instanceMonitorData;

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
        public java.util.List < InstanceMonitorData> getInstanceMonitorData() {
            return this.instanceMonitorData;
        }

        public static final class Builder {
            private java.util.List < InstanceMonitorData> instanceMonitorData; 

            /**
             * InstanceMonitorData.
             */
            public Builder instanceMonitorData(java.util.List < InstanceMonitorData> instanceMonitorData) {
                this.instanceMonitorData = instanceMonitorData;
                return this;
            }

            public MonitorData build() {
                return new MonitorData(this);
            } 

        } 

    }
}
