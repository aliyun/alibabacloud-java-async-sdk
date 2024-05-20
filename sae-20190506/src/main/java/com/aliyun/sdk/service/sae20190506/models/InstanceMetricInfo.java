// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstanceMetricInfo} extends {@link TeaModel}
 *
 * <p>InstanceMetricInfo</p>
 */
public class InstanceMetricInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("applicationID")
    private String applicationID;

    @com.aliyun.core.annotation.NameInMap("cpuPercent")
    private Float cpuPercent;

    @com.aliyun.core.annotation.NameInMap("cpuQuotaPercent")
    private Float cpuQuotaPercent;

    @com.aliyun.core.annotation.NameInMap("instanceID")
    private String instanceID;

    @com.aliyun.core.annotation.NameInMap("memoryLimitMB")
    private Float memoryLimitMB;

    @com.aliyun.core.annotation.NameInMap("memoryUsageMB")
    private Float memoryUsageMB;

    @com.aliyun.core.annotation.NameInMap("timestamp")
    private Long timestamp;

    private InstanceMetricInfo(Builder builder) {
        this.applicationID = builder.applicationID;
        this.cpuPercent = builder.cpuPercent;
        this.cpuQuotaPercent = builder.cpuQuotaPercent;
        this.instanceID = builder.instanceID;
        this.memoryLimitMB = builder.memoryLimitMB;
        this.memoryUsageMB = builder.memoryUsageMB;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceMetricInfo create() {
        return builder().build();
    }

    /**
     * @return applicationID
     */
    public String getApplicationID() {
        return this.applicationID;
    }

    /**
     * @return cpuPercent
     */
    public Float getCpuPercent() {
        return this.cpuPercent;
    }

    /**
     * @return cpuQuotaPercent
     */
    public Float getCpuQuotaPercent() {
        return this.cpuQuotaPercent;
    }

    /**
     * @return instanceID
     */
    public String getInstanceID() {
        return this.instanceID;
    }

    /**
     * @return memoryLimitMB
     */
    public Float getMemoryLimitMB() {
        return this.memoryLimitMB;
    }

    /**
     * @return memoryUsageMB
     */
    public Float getMemoryUsageMB() {
        return this.memoryUsageMB;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private String applicationID; 
        private Float cpuPercent; 
        private Float cpuQuotaPercent; 
        private String instanceID; 
        private Float memoryLimitMB; 
        private Float memoryUsageMB; 
        private Long timestamp; 

        /**
         * applicationID.
         */
        public Builder applicationID(String applicationID) {
            this.applicationID = applicationID;
            return this;
        }

        /**
         * cpuPercent.
         */
        public Builder cpuPercent(Float cpuPercent) {
            this.cpuPercent = cpuPercent;
            return this;
        }

        /**
         * cpuQuotaPercent.
         */
        public Builder cpuQuotaPercent(Float cpuQuotaPercent) {
            this.cpuQuotaPercent = cpuQuotaPercent;
            return this;
        }

        /**
         * instanceID.
         */
        public Builder instanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }

        /**
         * memoryLimitMB.
         */
        public Builder memoryLimitMB(Float memoryLimitMB) {
            this.memoryLimitMB = memoryLimitMB;
            return this;
        }

        /**
         * memoryUsageMB.
         */
        public Builder memoryUsageMB(Float memoryUsageMB) {
            this.memoryUsageMB = memoryUsageMB;
            return this;
        }

        /**
         * timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public InstanceMetricInfo build() {
            return new InstanceMetricInfo(this);
        } 

    } 

}
