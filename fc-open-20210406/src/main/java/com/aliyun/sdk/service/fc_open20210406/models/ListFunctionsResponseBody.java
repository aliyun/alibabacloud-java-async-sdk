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
         * The token used to obtain more results. If this parameter is left empty, all the results are returned.
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

        @NameInMap("customHealthCheckConfig")
        private CustomHealthCheckConfig customHealthCheckConfig;

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
            this.customHealthCheckConfig = builder.customHealthCheckConfig;
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
         * @return customHealthCheckConfig
         */
        public CustomHealthCheckConfig getCustomHealthCheckConfig() {
            return this.customHealthCheckConfig;
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
            private CustomHealthCheckConfig customHealthCheckConfig; 
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
            private Integer memorySize; 
            private String runtime; 
            private Integer timeout; 

            /**
             * The port on which the HTTP server listens for the custom runtime or custom container runtime.
             */
            public Builder caPort(Integer caPort) {
                this.caPort = caPort;
                return this;
            }

            /**
             * The CRC-64 value of the function code package.
             */
            public Builder codeChecksum(String codeChecksum) {
                this.codeChecksum = codeChecksum;
                return this;
            }

            /**
             * The size of the function code package that is returned by the system. Unit: byte.
             */
            public Builder codeSize(Long codeSize) {
                this.codeSize = codeSize;
                return this;
            }

            /**
             * The number of vCPUs of the function. The value must be a multiple of 0.05.
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
             * The configurations of the custom container runtime.
             */
            public Builder customContainerConfig(CustomContainerConfig customContainerConfig) {
                this.customContainerConfig = customContainerConfig;
                return this;
            }

            /**
             * The custom health check configuration of the function. This parameter is applicable only to custom runtimes and custom containers.
             */
            public Builder customHealthCheckConfig(CustomHealthCheckConfig customHealthCheckConfig) {
                this.customHealthCheckConfig = customHealthCheckConfig;
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
             * The disk size of the function. Unit: MB. Valid values: 512 and 10240.
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * The environment variables that you configured for the function. You can obtain the values of the environment variables from the function. For more information, see [Overview](~~69777~~).
             */
            public Builder environmentVariables(java.util.Map < String, String > environmentVariables) {
                this.environmentVariables = environmentVariables;
                return this;
            }

            /**
             * The unique ID that is generated by the system for the function.
             */
            public Builder functionId(String functionId) {
                this.functionId = functionId;
                return this;
            }

            /**
             * The name of the function.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * GPU instance memory specifications of the function. Unit: MB. The value is a multiple of 1024.
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
             * The timeout period for the execution of the initializer function. Unit: seconds. Default value: 3. Valid values: 1 to 300. When this period ends, the execution of the initializer function is terminated.
             */
            public Builder initializationTimeout(Integer initializationTimeout) {
                this.initializationTimeout = initializationTimeout;
                return this;
            }

            /**
             * The handler of the initializer function. The format of the value is determined by the programming language that you use. For more information, see [Initializer function](~~157704~~).
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
             * The soft concurrency of the instance. You can use this parameter to implement graceful scale-up of instances. If the number of concurrent requests on an instance is greater than the number of the soft concurrency, the instance scale-up is triggered. For example, if your instance requires a long term to start, you can specify a suitable soft concurrency to start the instance in advance.
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
             * An array that consists of the information of layers.
             * <p>
             * 
             * 
             * > Multiple layers are merged based on the order of array subscripts. The content of a layer with a smaller subscript overwrites the file with the same name in the layer with a larger subscript.
             */
            public Builder layers(java.util.List < String > layers) {
                this.layers = layers;
                return this;
            }

            /**
             * The memory size that is configured for the function. Unit: MB.
             */
            public Builder memorySize(Integer memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * The runtime environment of the function. Valid values: **nodejs16**, **nodejs14**, **nodejs12**, **nodejs10**, **nodejs8**, **nodejs6**, **nodejs4.4**, **python3.9**, **python3**, **python2.7**, **java11**, **java8**, **go1**, **php7.2**, **dotnetcore3.1**, **dotnetcore2.1**, **custom** and **custom-container**. For more information, see [Supported function runtime environments](~~73338~~).
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * The timeout period for the execution of the function. Unit: seconds. Default value: 60. Valid values: 1 to 600. When this period expires, the execution of the function is terminated.
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
