// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("MonitorData")
    private MonitorData monitorData;

    @NameInMap("RequestId")
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
         * The monitoring data of the instance.
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

        public DescribeInstanceMonitorDataResponseBody build() {
            return new DescribeInstanceMonitorDataResponseBody(this);
        } 

    } 

    public static class InstanceMonitorData extends TeaModel {
        @NameInMap("BPSRead")
        private Integer BPSRead;

        @NameInMap("BPSWrite")
        private Integer BPSWrite;

        @NameInMap("CPU")
        private Integer CPU;

        @NameInMap("CPUAdvanceCreditBalance")
        private Float CPUAdvanceCreditBalance;

        @NameInMap("CPUCreditBalance")
        private Float CPUCreditBalance;

        @NameInMap("CPUCreditUsage")
        private Float CPUCreditUsage;

        @NameInMap("CPUNotpaidSurplusCreditUsage")
        private Float CPUNotpaidSurplusCreditUsage;

        @NameInMap("IOPSRead")
        private Integer IOPSRead;

        @NameInMap("IOPSWrite")
        private Integer IOPSWrite;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InternetBandwidth")
        private Integer internetBandwidth;

        @NameInMap("InternetRX")
        private Integer internetRX;

        @NameInMap("InternetTX")
        private Integer internetTX;

        @NameInMap("IntranetBandwidth")
        private Integer intranetBandwidth;

        @NameInMap("IntranetRX")
        private Integer intranetRX;

        @NameInMap("IntranetTX")
        private Integer intranetTX;

        @NameInMap("TimeStamp")
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
             * The read bandwidth of the cloud disks (system disk and data disks). Unit: Byte/s.
             */
            public Builder BPSRead(Integer BPSRead) {
                this.BPSRead = BPSRead;
                return this;
            }

            /**
             * The write bandwidth of the cloud disks (system disk and data disks). Unit: Byte/s.
             */
            public Builder BPSWrite(Integer BPSWrite) {
                this.BPSWrite = BPSWrite;
                return this;
            }

            /**
             * The vCPU utilization of the instance. Unit: percent (%).
             */
            public Builder CPU(Integer CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * The overdrawn CPU credits of the burstable instance.
             */
            public Builder CPUAdvanceCreditBalance(Float CPUAdvanceCreditBalance) {
                this.CPUAdvanceCreditBalance = CPUAdvanceCreditBalance;
                return this;
            }

            /**
             * The total number of CPU credits of the burstable instance.
             */
            public Builder CPUCreditBalance(Float CPUCreditBalance) {
                this.CPUCreditBalance = CPUCreditBalance;
                return this;
            }

            /**
             * The number of CPU credits consumed by the burstable instance.
             */
            public Builder CPUCreditUsage(Float CPUCreditUsage) {
                this.CPUCreditUsage = CPUCreditUsage;
                return this;
            }

            /**
             * The unpaid overdrawn CPU credits.
             */
            public Builder CPUNotpaidSurplusCreditUsage(Float CPUNotpaidSurplusCreditUsage) {
                this.CPUNotpaidSurplusCreditUsage = CPUNotpaidSurplusCreditUsage;
                return this;
            }

            /**
             * The number of read I/O operations per second on the cloud disks (system disk and data disks).
             */
            public Builder IOPSRead(Integer IOPSRead) {
                this.IOPSRead = IOPSRead;
                return this;
            }

            /**
             * The number of write I/O operations per second on the cloud disks (system disk and data disks).
             */
            public Builder IOPSWrite(Integer IOPSWrite) {
                this.IOPSWrite = IOPSWrite;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The public bandwidth of the instance. Unit: Kbit/s.
             */
            public Builder internetBandwidth(Integer internetBandwidth) {
                this.internetBandwidth = internetBandwidth;
                return this;
            }

            /**
             * The Internet traffic received by the instance during the period that is specified by the `Period` parameter. The period starts from the point in time that is specified by the `TimeStamp` parameter. Unit: Kbit.
             */
            public Builder internetRX(Integer internetRX) {
                this.internetRX = internetRX;
                return this;
            }

            /**
             * The Internet traffic sent by the instance during the period that is specified by the `Period` parameter. The period starts from the point in time that is specified by the `TimeStamp` parameter. Unit: Kbit.
             */
            public Builder internetTX(Integer internetTX) {
                this.internetTX = internetTX;
                return this;
            }

            /**
             * The internal bandwidth of the instance. Unit: Kbit/s.
             */
            public Builder intranetBandwidth(Integer intranetBandwidth) {
                this.intranetBandwidth = intranetBandwidth;
                return this;
            }

            /**
             * The internal data traffic received by the instance during the period that is specified by the `Period` parameter. The period starts from the point in time that is specified by the `TimeStamp` parameter. Unit: Kbit.
             */
            public Builder intranetRX(Integer intranetRX) {
                this.intranetRX = intranetRX;
                return this;
            }

            /**
             * The internal data traffic sent by the instance during the period that is specified by the `Period` parameter. The period starts from the point in time that is specified by the `TimeStamp` parameter. Unit: Kbit.
             */
            public Builder intranetTX(Integer intranetTX) {
                this.intranetTX = intranetTX;
                return this;
            }

            /**
             * The timestamp of the monitoring data.
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
