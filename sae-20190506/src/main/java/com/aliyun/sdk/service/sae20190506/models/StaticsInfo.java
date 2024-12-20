// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link StaticsInfo} extends {@link TeaModel}
 *
 * <p>StaticsInfo</p>
 */
public class StaticsInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("activeCPUUsage")
    private Long activeCPUUsage;

    @com.aliyun.core.annotation.NameInMap("cost")
    private Float cost;

    @com.aliyun.core.annotation.NameInMap("diskUsage")
    private Long diskUsage;

    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("gpuUsage")
    private Long gpuUsage;

    @com.aliyun.core.annotation.NameInMap("idleCPUUsage")
    private Long idleCPUUsage;

    @com.aliyun.core.annotation.NameInMap("instanceTrafficOut")
    private Long instanceTrafficOut;

    @com.aliyun.core.annotation.NameInMap("invocations")
    private Long invocations;

    @com.aliyun.core.annotation.NameInMap("invokeCDNOut")
    private Long invokeCDNOut;

    @com.aliyun.core.annotation.NameInMap("invokeInternetOut")
    private Long invokeInternetOut;

    @com.aliyun.core.annotation.NameInMap("memoryUsage")
    private Long memoryUsage;

    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("serviceName")
    private String serviceName;

    private StaticsInfo(Builder builder) {
        this.activeCPUUsage = builder.activeCPUUsage;
        this.cost = builder.cost;
        this.diskUsage = builder.diskUsage;
        this.functionName = builder.functionName;
        this.gpuUsage = builder.gpuUsage;
        this.idleCPUUsage = builder.idleCPUUsage;
        this.instanceTrafficOut = builder.instanceTrafficOut;
        this.invocations = builder.invocations;
        this.invokeCDNOut = builder.invokeCDNOut;
        this.invokeInternetOut = builder.invokeInternetOut;
        this.memoryUsage = builder.memoryUsage;
        this.region = builder.region;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StaticsInfo create() {
        return builder().build();
    }

    /**
     * @return activeCPUUsage
     */
    public Long getActiveCPUUsage() {
        return this.activeCPUUsage;
    }

    /**
     * @return cost
     */
    public Float getCost() {
        return this.cost;
    }

    /**
     * @return diskUsage
     */
    public Long getDiskUsage() {
        return this.diskUsage;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return gpuUsage
     */
    public Long getGpuUsage() {
        return this.gpuUsage;
    }

    /**
     * @return idleCPUUsage
     */
    public Long getIdleCPUUsage() {
        return this.idleCPUUsage;
    }

    /**
     * @return instanceTrafficOut
     */
    public Long getInstanceTrafficOut() {
        return this.instanceTrafficOut;
    }

    /**
     * @return invocations
     */
    public Long getInvocations() {
        return this.invocations;
    }

    /**
     * @return invokeCDNOut
     */
    public Long getInvokeCDNOut() {
        return this.invokeCDNOut;
    }

    /**
     * @return invokeInternetOut
     */
    public Long getInvokeInternetOut() {
        return this.invokeInternetOut;
    }

    /**
     * @return memoryUsage
     */
    public Long getMemoryUsage() {
        return this.memoryUsage;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder {
        private Long activeCPUUsage; 
        private Float cost; 
        private Long diskUsage; 
        private String functionName; 
        private Long gpuUsage; 
        private Long idleCPUUsage; 
        private Long instanceTrafficOut; 
        private Long invocations; 
        private Long invokeCDNOut; 
        private Long invokeInternetOut; 
        private Long memoryUsage; 
        private String region; 
        private String serviceName; 

        /**
         * activeCPUUsage.
         */
        public Builder activeCPUUsage(Long activeCPUUsage) {
            this.activeCPUUsage = activeCPUUsage;
            return this;
        }

        /**
         * cost.
         */
        public Builder cost(Float cost) {
            this.cost = cost;
            return this;
        }

        /**
         * diskUsage.
         */
        public Builder diskUsage(Long diskUsage) {
            this.diskUsage = diskUsage;
            return this;
        }

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * gpuUsage.
         */
        public Builder gpuUsage(Long gpuUsage) {
            this.gpuUsage = gpuUsage;
            return this;
        }

        /**
         * idleCPUUsage.
         */
        public Builder idleCPUUsage(Long idleCPUUsage) {
            this.idleCPUUsage = idleCPUUsage;
            return this;
        }

        /**
         * instanceTrafficOut.
         */
        public Builder instanceTrafficOut(Long instanceTrafficOut) {
            this.instanceTrafficOut = instanceTrafficOut;
            return this;
        }

        /**
         * invocations.
         */
        public Builder invocations(Long invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * invokeCDNOut.
         */
        public Builder invokeCDNOut(Long invokeCDNOut) {
            this.invokeCDNOut = invokeCDNOut;
            return this;
        }

        /**
         * invokeInternetOut.
         */
        public Builder invokeInternetOut(Long invokeInternetOut) {
            this.invokeInternetOut = invokeInternetOut;
            return this;
        }

        /**
         * memoryUsage.
         */
        public Builder memoryUsage(Long memoryUsage) {
            this.memoryUsage = memoryUsage;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * serviceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public StaticsInfo build() {
            return new StaticsInfo(this);
        } 

    } 

}
