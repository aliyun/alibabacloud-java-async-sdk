// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("MonitorData")
    private MonitorData monitorData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The returned service code. A value of 0 indicates that the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The set of InstanceMonitorDataType data.</p>
         */
        public Builder monitorData(MonitorData monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C8B26B44-0189-443E-9816-D951F59623A9</p>
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
        @com.aliyun.core.annotation.NameInMap("CPU")
        private String CPU;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Memory")
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
             * <p>The vCPU usage of the instance, which is raw data. For example, a value of 0.02 indicates that the usage is 2%.</p>
             * 
             * <strong>example:</strong>
             * <p>0.02</p>
             */
            public Builder CPU(String CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>yourInstance ID</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>This parameter is not yet supported.</p>
             * 
             * <strong>example:</strong>
             * <p>Not currently supported</p>
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
    /**
     * 
     * {@link DescribeInstanceMonitorDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceMonitorDataResponseBody</p>
     */
    public static class MonitorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceMonitorData")
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
