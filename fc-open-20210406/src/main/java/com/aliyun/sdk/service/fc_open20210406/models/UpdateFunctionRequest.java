// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFunctionRequest} extends {@link RequestModel}
 *
 * <p>UpdateFunctionRequest</p>
 */
public class UpdateFunctionRequest extends Request {
    @Path
    @NameInMap("serviceName")
    @Validation(required = true)
    private String serviceName;

    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Header
    @NameInMap("If-Match")
    private String ifMatch;

    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Code-Checksum")
    private String xFcCodeChecksum;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Body
    @NameInMap("InstanceConcurrency")
    private Integer instanceConcurrency;

    @Body
    @NameInMap("caPort")
    private Integer caPort;

    @Body
    @NameInMap("code")
    private Code code;

    @Body
    @NameInMap("cpu")
    private Float cpu;

    @Body
    @NameInMap("customContainerConfig")
    private CustomContainerConfig customContainerConfig;

    @Body
    @NameInMap("customDNS")
    private CustomDNS customDNS;

    @Body
    @NameInMap("customHealthCheckConfig")
    private CustomHealthCheckConfig customHealthCheckConfig;

    @Body
    @NameInMap("customRuntimeConfig")
    private CustomRuntimeConfig customRuntimeConfig;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("diskSize")
    private Integer diskSize;

    @Body
    @NameInMap("environmentVariables")
    private java.util.Map < String, String > environmentVariables;

    @Body
    @NameInMap("gpuMemorySize")
    private Integer gpuMemorySize;

    @Body
    @NameInMap("handler")
    private String handler;

    @Body
    @NameInMap("initializationTimeout")
    private Integer initializationTimeout;

    @Body
    @NameInMap("initializer")
    private String initializer;

    @Body
    @NameInMap("instanceLifecycleConfig")
    private InstanceLifecycleConfig instanceLifecycleConfig;

    @Body
    @NameInMap("instanceSoftConcurrency")
    private Integer instanceSoftConcurrency;

    @Body
    @NameInMap("instanceType")
    private String instanceType;

    @Body
    @NameInMap("layers")
    private java.util.List < String > layers;

    @Body
    @NameInMap("memorySize")
    private Integer memorySize;

    @Body
    @NameInMap("runtime")
    private String runtime;

    @Body
    @NameInMap("timeout")
    private Integer timeout;

    private UpdateFunctionRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.ifMatch = builder.ifMatch;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcCodeChecksum = builder.xFcCodeChecksum;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.instanceConcurrency = builder.instanceConcurrency;
        this.caPort = builder.caPort;
        this.code = builder.code;
        this.cpu = builder.cpu;
        this.customContainerConfig = builder.customContainerConfig;
        this.customDNS = builder.customDNS;
        this.customHealthCheckConfig = builder.customHealthCheckConfig;
        this.customRuntimeConfig = builder.customRuntimeConfig;
        this.description = builder.description;
        this.diskSize = builder.diskSize;
        this.environmentVariables = builder.environmentVariables;
        this.gpuMemorySize = builder.gpuMemorySize;
        this.handler = builder.handler;
        this.initializationTimeout = builder.initializationTimeout;
        this.initializer = builder.initializer;
        this.instanceLifecycleConfig = builder.instanceLifecycleConfig;
        this.instanceSoftConcurrency = builder.instanceSoftConcurrency;
        this.instanceType = builder.instanceType;
        this.layers = builder.layers;
        this.memorySize = builder.memorySize;
        this.runtime = builder.runtime;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFunctionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return ifMatch
     */
    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcCodeChecksum
     */
    public String getXFcCodeChecksum() {
        return this.xFcCodeChecksum;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return instanceConcurrency
     */
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    /**
     * @return caPort
     */
    public Integer getCaPort() {
        return this.caPort;
    }

    /**
     * @return code
     */
    public Code getCode() {
        return this.code;
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
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

    public static final class Builder extends Request.Builder<UpdateFunctionRequest, Builder> {
        private String serviceName; 
        private String functionName; 
        private String ifMatch; 
        private String xFcAccountId; 
        private String xFcCodeChecksum; 
        private String xFcDate; 
        private String xFcTraceId; 
        private Integer instanceConcurrency; 
        private Integer caPort; 
        private Code code; 
        private Float cpu; 
        private CustomContainerConfig customContainerConfig; 
        private CustomDNS customDNS; 
        private CustomHealthCheckConfig customHealthCheckConfig; 
        private CustomRuntimeConfig customRuntimeConfig; 
        private String description; 
        private Integer diskSize; 
        private java.util.Map < String, String > environmentVariables; 
        private Integer gpuMemorySize; 
        private String handler; 
        private Integer initializationTimeout; 
        private String initializer; 
        private InstanceLifecycleConfig instanceLifecycleConfig; 
        private Integer instanceSoftConcurrency; 
        private String instanceType; 
        private java.util.List < String > layers; 
        private Integer memorySize; 
        private String runtime; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFunctionRequest request) {
            super(request);
            this.serviceName = request.serviceName;
            this.functionName = request.functionName;
            this.ifMatch = request.ifMatch;
            this.xFcAccountId = request.xFcAccountId;
            this.xFcCodeChecksum = request.xFcCodeChecksum;
            this.xFcDate = request.xFcDate;
            this.xFcTraceId = request.xFcTraceId;
            this.instanceConcurrency = request.instanceConcurrency;
            this.caPort = request.caPort;
            this.code = request.code;
            this.cpu = request.cpu;
            this.customContainerConfig = request.customContainerConfig;
            this.customDNS = request.customDNS;
            this.customHealthCheckConfig = request.customHealthCheckConfig;
            this.customRuntimeConfig = request.customRuntimeConfig;
            this.description = request.description;
            this.diskSize = request.diskSize;
            this.environmentVariables = request.environmentVariables;
            this.gpuMemorySize = request.gpuMemorySize;
            this.handler = request.handler;
            this.initializationTimeout = request.initializationTimeout;
            this.initializer = request.initializer;
            this.instanceLifecycleConfig = request.instanceLifecycleConfig;
            this.instanceSoftConcurrency = request.instanceSoftConcurrency;
            this.instanceType = request.instanceType;
            this.layers = request.layers;
            this.memorySize = request.memorySize;
            this.runtime = request.runtime;
            this.timeout = request.timeout;
        } 

        /**
         * The name of the service.
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The name of the function.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The parameter that is used to ensure that the modified resource is consistent with the resource to be modified. The value of this parameter is returned in the responses of the [CreateFunction](~~415747~~), [GetFunction](~~415750~~), and [UpdateFunction](~~415749~~) operations.
         */
        public Builder ifMatch(String ifMatch) {
            this.putHeaderParameter("If-Match", ifMatch);
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The ID of your Alibaba Cloud account.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * The CRC-64 value of the function code package.
         */
        public Builder xFcCodeChecksum(String xFcCodeChecksum) {
            this.putHeaderParameter("X-Fc-Code-Checksum", xFcCodeChecksum);
            this.xFcCodeChecksum = xFcCodeChecksum;
            return this;
        }

        /**
         * The time on which the function is invoked. The format of the value is: **EEE,d MMM yyyy HH:mm:ss GMT**.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * The trace ID of the request. The value is the same as that of the requestId parameter in the response.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * The number of requests that can be concurrently processed by a single instance.
         */
        public Builder instanceConcurrency(Integer instanceConcurrency) {
            this.putBodyParameter("InstanceConcurrency", instanceConcurrency);
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }

        /**
         * The port on which the HTTP server listens for the custom runtime or custom container runtime.
         */
        public Builder caPort(Integer caPort) {
            this.putBodyParameter("caPort", caPort);
            this.caPort = caPort;
            return this;
        }

        /**
         * The packaged code of the function. **Function code packages** can be provided with the following two methods. You must use only one of the methods in a request.
         * <p>
         * 
         * *   Specify the name of the Object Storage Service (OSS) bucket and object where the code package is stored. The names are specified in the **ossBucketName** and **ossObjectName** parameters.
         * *   Specify the Base64-encoded content of the ZIP file by using the **zipFile** parameter.
         */
        public Builder code(Code code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * The number of vCPUs of the function. The value must be a multiple of 0.05.
         */
        public Builder cpu(Float cpu) {
            this.putBodyParameter("cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * The configuration of the custom container. After you configure the custom container, Function Compute can execute the function in a container created from a custom image.
         */
        public Builder customContainerConfig(CustomContainerConfig customContainerConfig) {
            this.putBodyParameter("customContainerConfig", customContainerConfig);
            this.customContainerConfig = customContainerConfig;
            return this;
        }

        /**
         * The custom DNS configurations of the function.
         */
        public Builder customDNS(CustomDNS customDNS) {
            this.putBodyParameter("customDNS", customDNS);
            this.customDNS = customDNS;
            return this;
        }

        /**
         * The custom health check configurations of the function. This parameter is applicable to only custom runtimes and custom containers.
         */
        public Builder customHealthCheckConfig(CustomHealthCheckConfig customHealthCheckConfig) {
            this.putBodyParameter("customHealthCheckConfig", customHealthCheckConfig);
            this.customHealthCheckConfig = customHealthCheckConfig;
            return this;
        }

        /**
         * The configurations of the custom runtime.
         */
        public Builder customRuntimeConfig(CustomRuntimeConfig customRuntimeConfig) {
            this.putBodyParameter("customRuntimeConfig", customRuntimeConfig);
            this.customRuntimeConfig = customRuntimeConfig;
            return this;
        }

        /**
         * The description of the function.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The disk size of the function. Unit: MB. Valid values: 512 and 10240.
         */
        public Builder diskSize(Integer diskSize) {
            this.putBodyParameter("diskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * The environment variables that are configured for the function. You can obtain the values of the environment variables from the function. For more information, see [Environment variables](~~69777~~).
         */
        public Builder environmentVariables(java.util.Map < String, String > environmentVariables) {
            this.putBodyParameter("environmentVariables", environmentVariables);
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * The GPU memory capacity for the function. Unit: MB. The value must be a multiple of 1,024.
         */
        public Builder gpuMemorySize(Integer gpuMemorySize) {
            this.putBodyParameter("gpuMemorySize", gpuMemorySize);
            this.gpuMemorySize = gpuMemorySize;
            return this;
        }

        /**
         * The handler of the function. The format varies based on the programming language. For more information, see [Function handlers](~~157704~~).
         */
        public Builder handler(String handler) {
            this.putBodyParameter("handler", handler);
            this.handler = handler;
            return this;
        }

        /**
         * The timeout period for the execution of the Initializer hook. Unit: seconds. Default value: 3. Minimum value: 1. When the period ends, the execution of the Initializer hook is terminated.
         */
        public Builder initializationTimeout(Integer initializationTimeout) {
            this.putBodyParameter("initializationTimeout", initializationTimeout);
            this.initializationTimeout = initializationTimeout;
            return this;
        }

        /**
         * The handler of the Initializer hook. The format is determined by the programming language. For more information, see [Function handlers](~~157704~~).
         */
        public Builder initializer(String initializer) {
            this.putBodyParameter("initializer", initializer);
            this.initializer = initializer;
            return this;
        }

        /**
         * The lifecycle configurations of the instance.
         */
        public Builder instanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
            this.putBodyParameter("instanceLifecycleConfig", instanceLifecycleConfig);
            this.instanceLifecycleConfig = instanceLifecycleConfig;
            return this;
        }

        /**
         * The soft concurrency of the instance. You can use this parameter to implement graceful scale-up of instances. If the number of concurrent requests on an instance is greater than the value of soft concurrency, an instance scale-up is triggered. For example, if your instance requires a long time to start, you can specify a suitable soft concurrency to start the instance in advance.
         * <p>
         * 
         * The value must be less than or equal to that of the **instanceConcurrency** parameter.
         */
        public Builder instanceSoftConcurrency(Integer instanceSoftConcurrency) {
            this.putBodyParameter("instanceSoftConcurrency", instanceSoftConcurrency);
            this.instanceSoftConcurrency = instanceSoftConcurrency;
            return this;
        }

        /**
         * The instance type of the function. Valid values:
         * <p>
         * 
         * *   **e1**: elastic instance
         * *   **c1**: performance instance
         * *   **fc.gpu.tesla.1**: GPU-accelerated instance (Tesla T4)
         * *   **fc.gpu.ampere.1**: GPU-accelerated instance (Ampere A10)
         * *   **g1**: same as **fc.gpu.tesla.1**
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("instanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The information about layers.
         * <p>
         * 
         * > Multiple layers are merged based on the order of array subscripts. The content of a layer with a smaller subscript overwrites the file that has the same name as a layer with a larger subscript.
         */
        public Builder layers(java.util.List < String > layers) {
            this.putBodyParameter("layers", layers);
            this.layers = layers;
            return this;
        }

        /**
         * The memory size for the function. Unit: MB. The memory size must be a multiple of 64. The memory size varies based on the function instance type. For more information, see [Instance types](~~179379~~).
         */
        public Builder memorySize(Integer memorySize) {
            this.putBodyParameter("memorySize", memorySize);
            this.memorySize = memorySize;
            return this;
        }

        /**
         * The runtime environment of the function. Valid values: **nodejs16**, **nodejs14**, **nodejs12**, **nodejs10**, **nodejs8**, **nodejs6**, **nodejs4.4**, **python3.9**, **python3**, **python2.7**, **java11**, **java8**, **go1**, **php7.2**, **dotnetcore3.1**, **dotnetcore2.1**, **custom** and **custom-container**. For more information, see [Supported function runtime environments](~~73338~~).
         */
        public Builder runtime(String runtime) {
            this.putBodyParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * The timeout period for the execution of the function. Unit: seconds. Default value: 3. Minimum value: 1. When the period ends, the execution of the function is terminated.
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public UpdateFunctionRequest build() {
            return new UpdateFunctionRequest(this);
        } 

    } 

}
