// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @NameInMap("Code")
    private Integer code;

    @NameInMap("MonitorData")
    private MonitorData monitorData;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceMonitorDataResponseBody(Builder builder) {
        this.code = builder.code;
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
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
        private Integer code; 
        private MonitorData monitorData; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

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

        public DescribeInstanceMonitorDataResponseBody build() {
            return new DescribeInstanceMonitorDataResponseBody(this);
        } 

    } 

    public static class InstanceMonitorData extends TeaModel {
        @NameInMap("CPU")
        private String CPU;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Memory")
        private String memory;

        private InstanceMonitorData(Builder builder) {
            this.CPU = builder.CPU;
            this.instanceId = builder.instanceId;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceMonitorData create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public String getCPU() {
            return this.CPU;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private String CPU; 
            private String instanceId; 
            private String memory; 

            /**
             * CPU.
             */
            public Builder CPU(String CPU) {
                this.CPU = CPU;
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
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
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
