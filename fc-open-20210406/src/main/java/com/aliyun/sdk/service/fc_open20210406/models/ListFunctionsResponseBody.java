// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionsResponseBody</p>
 */
public class ListFunctionsResponseBody extends TeaModel {
    @NameInMap("functions")
    private java.util.List < Functions> functions;

    @NameInMap("nextToken")
    private String nextToken;

    private ListFunctionsResponseBody(Builder builder) {
        this.functions = builder.functions;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return functions
     */
    public java.util.List < Functions> getFunctions() {
        return this.functions;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List < Functions> functions; 
        private String nextToken; 

        /**
         * The information about functions.
         */
        public Builder functions(java.util.List < Functions> functions) {
            this.functions = functions;
            return this;
        }

        /**
         * The token used to obtain more results. If this parameter is not returned, all the layers are returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListFunctionsResponseBody build() {
            return new ListFunctionsResponseBody(this);
        } 

    } 

    public static class Functions extends TeaModel {
        @NameInMap("caPort")
        private Integer caPort;

        @NameInMap("codeChecksum")
        private String codeChecksum;

        @NameInMap("codeSize")
        private Long codeSize;

        @NameInMap("cpu")
        private Float cpu;

        @NameInMap("createdTime")
        private String createdTime;

        @NameInMap("customContainerConfig")
        private CustomContainerConfig customContainerConfig;

        @NameInMap("customDNS")
        private CustomDNS customDNS;

        @NameInMap("customHealthCheckConfig")
        private CustomHealthCheckConfig customHealthCheckConfig;

        @NameInMap("customRuntimeConfig")
        private CustomRuntimeConfig customRuntimeConfig;

        @NameInMap("description")
        private String description;

        @NameInMap("diskSize")
        private Integer diskSize;

        @NameInMap("environmentVariables")
        private java.util.Map < String, String > environmentVariables;

        @NameInMap("functionId")
        private String functionId;

        @NameInMap("functionName")
        private String functionName;

        @NameInMap("gpuMemorySize")
        private Integer gpuMemorySize;

        @NameInMap("handler")
        private String handler;

        @NameInMap("initializationTimeout")
        private Integer initializationTimeout;

        @NameInMap("initializer")
        private String initializer;

        @NameInMap("instanceConcurrency")
        private Integer instanceConcurrency;

        @NameInMap("instanceLifecycleConfig")
        private InstanceLifecycleConfig instanceLifecycleConfig;

        @NameInMap("instanceSoftConcurrency")
        private Integer instanceSoftConcurrency;

        @NameInMap("instanceType")
        private String instanceType;

        @NameInMap("lastModifiedTime")
        private String lastModifiedTime;

        @NameInMap("layers")
        private java.util.List < String > layers;

        @NameInMap("layersArnV2")
        private java.util.List < String > layersArnV2;

        @NameInMap("memorySize")
        private Integer memorySize;

        @NameInMap("runtime")
        private String runtime;

        @NameInMap("timeout")
        private Integer timeout;

        private Functions(Builder builder) {
            this.caPort = builder.caPort;
            this.codeChecksum = builder.codeChecksum;
            this.codeSize = builder.codeSize;
            this.cpu = builder.cpu;
            this.createdTime = builder.createdTime;
            this.customContainerConfig = builder.customContainerConfig;
            this.customDNS = builder.customDNS;
            this.customHealthCheckConfig = builder.customHealthCheckConfig;
            this.customRuntimeConfig = builder.customRuntimeConfig;
            this.description = builder.description;
            this.diskSize = builder.diskSize;
            this.environmentVariables = builder.environmentVariables;
            this.functionId = builder.functionId;
            this.functionName = builder.functionName;
            this.gpuMemorySize = builder.gpuMemorySize;
            this.handler = builder.handler;
            this.initializationTimeout = builder.initializationTimeout;
            this.initializer = builder.initializer;
            this.instanceConcurrency = builder.instanceConcurrency;
            this.instanceLifecycleConfig = builder.instanceLifecycleConfig;
            this.instanceSoftConcurrency = builder.instanceSoftConcurrency;
            this.instanceType = builder.instanceType;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.layers = builder.layers;
            this.layersArnV2 = builder.layersArnV2;
            this.memorySize = builder.memorySize;
            this.runtime = builder.runtime;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Functions create() {
            return builder().build();
        }

        /**
         * @return caPort
         */
        public Integer getCaPort() {
            return this.caPort;
        }

        /**
         * @return codeChecksum
         */
        public String getCodeChecksum() {
            return this.codeChecksum;
        }

        /**
         * @return codeSize
         */
        public Long getCodeSize() {
            return this.codeSize;
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return customContainerConfig
         */
        public CustomContainerConfig getCustomContainerConfig() {
            return this.customContainerConfig;
        }

        /**
         * @return customDNS
         */
        public CustomDNS getCustomDNS() {
            return this.customDNS;
        }

        /**
         * @return customHealthCheckConfig
         */
        public CustomHealthCheckConfig getCustomHealthCheckConfig() {
            return this.customHealthCheckConfig;
        }

        /**
         * @return customRuntimeConfig
         */
        public CustomRuntimeConfig getCustomRuntimeConfig() {
            return this.customRuntimeConfig;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return environmentVariables
         */
        public java.util.Map < String, String > getEnvironmentVariables() {
            return this.environmentVariables;
        }

        /**
         * @return functionId
         */
        public String getFunctionId() {
            return this.functionId;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return gpuMemorySize
         */
        public Integer getGpuMemorySize() {
            return this.gpuMemorySize;
        }

        /**
         * @return handler
         */
        public String getHandler() {
            return this.handler;
        }

        /**
         * @return initializationTimeout
         */
        public Integer getInitializationTimeout() {
            return this.initializationTimeout;
        }

        /**
         * @return initializer
         */
        public String getInitializer() {
            return this.initializer;
        }

        /**
         * @return instanceConcurrency
         */
        public Integer getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        /**
         * @return instanceLifecycleConfig
         */
        public InstanceLifecycleConfig getInstanceLifecycleConfig() {
            return this.instanceLifecycleConfig;
        }

        /**
         * @return instanceSoftConcurrency
         */
        public Integer getInstanceSoftConcurrency() {
            return this.instanceSoftConcurrency;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return lastModifiedTime
         */
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return layers
         */
        public java.util.List < String > getLayers() {
            return this.layers;
        }

        /**
         * @return layersArnV2
         */
        public java.util.List < String > getLayersArnV2() {
            return this.layersArnV2;
        }

        /**
         * @return memorySize
         */
        public Integer getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return runtime
         */
        public String getRuntime() {
            return this.runtime;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private Integer caPort; 
            private String codeChecksum; 
            private Long codeSize; 
            private Float cpu; 
            private String createdTime; 
            private CustomContainerConfig customContainerConfig; 
            private CustomDNS customDNS; 
            private CustomHealthCheckConfig customHealthCheckConfig; 
            private CustomRuntimeConfig customRuntimeConfig; 
            private String description; 
            private Integer diskSize; 
            private java.util.Map < String, String > environmentVariables; 
            private String functionId; 
            private String functionName; 
            private Integer gpuMemorySize; 
            private String handler; 
            private Integer initializationTimeout; 
            private String initializer; 
            private Integer instanceConcurrency; 
            private InstanceLifecycleConfig instanceLifecycleConfig; 
            private Integer instanceSoftConcurrency; 
            private String instanceType; 
            private String lastModifiedTime; 
            private java.util.List < String > layers; 
            private java.util.List < String > layersArnV2; 
            private Integer memorySize; 
            private String runtime; 
            private Integer timeout; 

            /**
             * The port on which the HTTP server listens for the custom runtime or Custom Container runtime.
             */
            public Builder caPort(Integer caPort) {
                this.caPort = caPort;
                return this;
            }

            /**
             * The CRC64 value of the function code package.
             */
            public Builder codeChecksum(String codeChecksum) {
                this.codeChecksum = codeChecksum;
                return this;
            }

            /**
             * The size of the function code package returned by the system. Unit: bytes.
             */
            public Builder codeSize(Long codeSize) {
                this.codeSize = codeSize;
                return this;
            }

            /**
             * The CPU size of the function. Unit: vCPUs. The value is a multiple of 0.05 vCPUs.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The time when the function was created.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The configurations of the Custom Container runtime.
             */
            public Builder customContainerConfig(CustomContainerConfig customContainerConfig) {
                this.customContainerConfig = customContainerConfig;
                return this;
            }

            /**
             * The custom DNS settings of the function.
             */
            public Builder customDNS(CustomDNS customDNS) {
                this.customDNS = customDNS;
                return this;
            }

            /**
             * The custom health check configurations of the function. This parameter is applicable only to custom runtimes and Custom Container runtimes.
             */
            public Builder customHealthCheckConfig(CustomHealthCheckConfig customHealthCheckConfig) {
                this.customHealthCheckConfig = customHealthCheckConfig;
                return this;
            }

            /**
             * The configurations of the custom runtime function.
             */
            public Builder customRuntimeConfig(CustomRuntimeConfig customRuntimeConfig) {
                this.customRuntimeConfig = customRuntimeConfig;
                return this;
            }

            /**
             * The description of the function.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The disk size of the function. Unit: MB. Valid values: 512 MB and 10240 MB.
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * The environment variables that are configured for the function. You can obtain the values of the environment variables from the function.
             */
            public Builder environmentVariables(java.util.Map < String, String > environmentVariables) {
                this.environmentVariables = environmentVariables;
                return this;
            }

            /**
             * The ID generated by the system for each function. The ID is globally unique.
             */
            public Builder functionId(String functionId) {
                this.functionId = functionId;
                return this;
            }

            /**
             * The function name.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * The GPU memory size of the function. Unit: MB, which is a multiple of 1024MB.
             */
            public Builder gpuMemorySize(Integer gpuMemorySize) {
                this.gpuMemorySize = gpuMemorySize;
                return this;
            }

            /**
             * The handler of the function.
             */
            public Builder handler(String handler) {
                this.handler = handler;
                return this;
            }

            /**
             * The timeout period for the Initializer hook to run. Unit: seconds. Default value: 3. Minimum value: 1. Maximum value: 300. When the period ends, the execution of the Initializer hook is terminated.
             */
            public Builder initializationTimeout(Integer initializationTimeout) {
                this.initializationTimeout = initializationTimeout;
                return this;
            }

            /**
             * The handler of the initializer function. The format of the value varies based on the programming language that you use. For more information, see [Initializer function](~~157704~~).
             */
            public Builder initializer(String initializer) {
                this.initializer = initializer;
                return this;
            }

            /**
             * The number of requests that can be concurrently processed by a single instance.
             */
            public Builder instanceConcurrency(Integer instanceConcurrency) {
                this.instanceConcurrency = instanceConcurrency;
                return this;
            }

            /**
             * The lifecycle configurations of the instance.
             */
            public Builder instanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
                this.instanceLifecycleConfig = instanceLifecycleConfig;
                return this;
            }

            /**
             * The soft concurrency of the instance. You can use this property to implement graceful scale-ups for instances. If the number of concurrent requests on an instance is greater than the soft concurrency value of the instance, an instance scale-up is triggered. For example, if your instance requires a long time to start, you can specify a suitable soft concurrency to start the instance in advance.
             * <p>
             * 
             * The value must be less than or equal to that of **instanceConcurrency**.
             */
            public Builder instanceSoftConcurrency(Integer instanceSoftConcurrency) {
                this.instanceSoftConcurrency = instanceSoftConcurrency;
                return this;
            }

            /**
             * The instance type of the function. Valid values:
             * <p>
             * 
             * *   **e1**: elastic instance
             * *   **c1**: performance instance
             * *   **fc.gpu.tesla. 1**: GPU-accelerated instances of Tesla T4 type
             * *   **fc.gpu.ampere. 1**: GPU-accelerated instances of the Ampere A10 type
             * *   **g1**: Same fc.gpu.tesla. 1.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The time when the function was last modified.
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * A list of layers.
             * <p>
             * 
             * >  If multiple layers exist, the layers are merged based on the array subscripts in descending order. The content of a layer with a smaller subscript overwrites that of a larger subscript.
             */
            public Builder layers(java.util.List < String > layers) {
                this.layers = layers;
                return this;
            }

            /**
             * A list of layer ARNs.
             */
            public Builder layersArnV2(java.util.List < String > layersArnV2) {
                this.layersArnV2 = layersArnV2;
                return this;
            }

            /**
             * The memory size of the function. Unit: MB.
             */
            public Builder memorySize(Integer memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * The runtime of the function. Valid values: **nodejs16**, **nodejs14**, **nodejs12**, **nodejs10**, **nodejs8**, **nodejs6**, **nodejs4.4**, **python3.10**, **python3.9**, **python3**, **python2.7**, **java11**, **java8**, **go1**, **php7.2**, **dotnetcore3.1**, **dotnetcore2.1**, **custom.debian10**, **custom**, and **custom-container**. For more information, see [Runtimes that are supported by Function Compute](~~73338~~).
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * The timeout period for the function to run. Unit: seconds. Default value: 60. Minimum value: 1. Maximum value: 600. When this period expires, the execution of the function is terminated.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            public Functions build() {
                return new Functions(this);
            } 

        } 

    }
}
