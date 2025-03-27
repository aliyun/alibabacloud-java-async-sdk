// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ResourceInstanceWorker} extends {@link TeaModel}
 *
 * <p>ResourceInstanceWorker</p>
 */
public class ResourceInstanceWorker extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CpuLimit")
    private Integer cpuLimit;

    @com.aliyun.core.annotation.NameInMap("CpuRequest")
    private Integer cpuRequest;

    @com.aliyun.core.annotation.NameInMap("GpuLimit")
    private Integer gpuLimit;

    @com.aliyun.core.annotation.NameInMap("GpuRequest")
    private Integer gpuRequest;

    @com.aliyun.core.annotation.NameInMap("MemoryLimit")
    private Integer memoryLimit;

    @com.aliyun.core.annotation.NameInMap("MemoryRquest")
    private Integer memoryRquest;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Ready")
    private Boolean ready;

    @com.aliyun.core.annotation.NameInMap("RestartCount")
    private Integer restartCount;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ResourceInstanceWorker(Builder builder) {
        this.cpuLimit = builder.cpuLimit;
        this.cpuRequest = builder.cpuRequest;
        this.gpuLimit = builder.gpuLimit;
        this.gpuRequest = builder.gpuRequest;
        this.memoryLimit = builder.memoryLimit;
        this.memoryRquest = builder.memoryRquest;
        this.name = builder.name;
        this.ready = builder.ready;
        this.restartCount = builder.restartCount;
        this.serviceName = builder.serviceName;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceInstanceWorker create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpuLimit
     */
    public Integer getCpuLimit() {
        return this.cpuLimit;
    }

    /**
     * @return cpuRequest
     */
    public Integer getCpuRequest() {
        return this.cpuRequest;
    }

    /**
     * @return gpuLimit
     */
    public Integer getGpuLimit() {
        return this.gpuLimit;
    }

    /**
     * @return gpuRequest
     */
    public Integer getGpuRequest() {
        return this.gpuRequest;
    }

    /**
     * @return memoryLimit
     */
    public Integer getMemoryLimit() {
        return this.memoryLimit;
    }

    /**
     * @return memoryRquest
     */
    public Integer getMemoryRquest() {
        return this.memoryRquest;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ready
     */
    public Boolean getReady() {
        return this.ready;
    }

    /**
     * @return restartCount
     */
    public Integer getRestartCount() {
        return this.restartCount;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer cpuLimit; 
        private Integer cpuRequest; 
        private Integer gpuLimit; 
        private Integer gpuRequest; 
        private Integer memoryLimit; 
        private Integer memoryRquest; 
        private String name; 
        private Boolean ready; 
        private Integer restartCount; 
        private String serviceName; 
        private String startTime; 
        private String status; 

        private Builder() {
        } 

        private Builder(ResourceInstanceWorker model) {
            this.cpuLimit = model.cpuLimit;
            this.cpuRequest = model.cpuRequest;
            this.gpuLimit = model.gpuLimit;
            this.gpuRequest = model.gpuRequest;
            this.memoryLimit = model.memoryLimit;
            this.memoryRquest = model.memoryRquest;
            this.name = model.name;
            this.ready = model.ready;
            this.restartCount = model.restartCount;
            this.serviceName = model.serviceName;
            this.startTime = model.startTime;
            this.status = model.status;
        } 

        /**
         * CpuLimit.
         */
        public Builder cpuLimit(Integer cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }

        /**
         * CpuRequest.
         */
        public Builder cpuRequest(Integer cpuRequest) {
            this.cpuRequest = cpuRequest;
            return this;
        }

        /**
         * GpuLimit.
         */
        public Builder gpuLimit(Integer gpuLimit) {
            this.gpuLimit = gpuLimit;
            return this;
        }

        /**
         * GpuRequest.
         */
        public Builder gpuRequest(Integer gpuRequest) {
            this.gpuRequest = gpuRequest;
            return this;
        }

        /**
         * MemoryLimit.
         */
        public Builder memoryLimit(Integer memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }

        /**
         * MemoryRquest.
         */
        public Builder memoryRquest(Integer memoryRquest) {
            this.memoryRquest = memoryRquest;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Ready.
         */
        public Builder ready(Boolean ready) {
            this.ready = ready;
            return this;
        }

        /**
         * RestartCount.
         */
        public Builder restartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ResourceInstanceWorker build() {
            return new ResourceInstanceWorker(this);
        } 

    } 

}
