// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StaticsInfo} extends {@link TeaModel}
 *
 * <p>StaticsInfo</p>
 */
public class StaticsInfo extends TeaModel {
    @NameInMap("activeCPUUsage")
    private Long activeCPUUsage;

    @NameInMap("cost")
    private Float cost;

    @NameInMap("diskUsage")
    private Long diskUsage;

    @NameInMap("functionName")
    private String functionName;

    @NameInMap("gpuUsage")
    private Long gpuUsage;

    @NameInMap("idleCPUUsage")
    private Long idleCPUUsage;

    @NameInMap("instanceTrafficOut")
    private Long instanceTrafficOut;

    @NameInMap("invocations")
    private Long invocations;

    @NameInMap("invokeCDNOut")
    private Long invokeCDNOut;

    @NameInMap("invokeInternetOut")
    private Long invokeInternetOut;

    @NameInMap("memoryUsage")
    private Long memoryUsage;

    @NameInMap("region")
    private String region;

    @NameInMap("serviceName")
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
