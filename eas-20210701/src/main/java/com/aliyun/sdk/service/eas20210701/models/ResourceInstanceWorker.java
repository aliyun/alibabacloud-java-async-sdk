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
    private Long memoryLimit;

    @com.aliyun.core.annotation.NameInMap("MemoryRquest")
    private Integer memoryRquest;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Ready")
    private Boolean ready;

    @com.aliyun.core.annotation.NameInMap("RestartCount")
    private Long restartCount;

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
    public Long getMemoryLimit() {
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
    public Long getRestartCount() {
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
        private Long memoryLimit; 
        private Integer memoryRquest; 
        private String name; 
        private Boolean ready; 
        private Long restartCount; 
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
         * <p>The CPU core limit.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpuLimit(Integer cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }

        /**
         * <p>The number of CPU cores requested.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cpuRequest(Integer cpuRequest) {
            this.cpuRequest = cpuRequest;
            return this;
        }

        /**
         * <p>The GPU limit.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder gpuLimit(Integer gpuLimit) {
            this.gpuLimit = gpuLimit;
            return this;
        }

        /**
         * <p>The number of GPUs requested.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder gpuRequest(Integer gpuRequest) {
            this.gpuRequest = gpuRequest;
            return this;
        }

        /**
         * <p>The memory limit.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder memoryLimit(Long memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }

        /**
         * <p>The requested memory.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder memoryRquest(Integer memoryRquest) {
            this.memoryRquest = memoryRquest;
            return this;
        }

        /**
         * <p>The name of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test-india-5bbbfdbc98-****</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Indicates whether the instance is ready.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ready(Boolean ready) {
            this.ready = ready;
            return this;
        }

        /**
         * <p>The number of times the instance has been restarted.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder restartCount(Long restartCount) {
            this.restartCount = restartCount;
            return this;
        }

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>test-in****</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The start time of the instance, in UTC (ISO 8601 format).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-09T09:56:19Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
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
