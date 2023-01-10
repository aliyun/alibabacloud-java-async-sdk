// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFunctionRequest} extends {@link RequestModel}
 *
 * <p>CreateFunctionRequest</p>
 */
public class CreateFunctionRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

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
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Body
    @NameInMap("handler")
    @Validation(required = true)
    private String handler;

    @Body
    @NameInMap("initializationTimeout")
    private Integer initializationTimeout;

    @Body
    @NameInMap("initializer")
    private String initializer;

    @Body
    @NameInMap("instanceConcurrency")
    private Integer instanceConcurrency;

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
    @Validation(required = true)
    private String runtime;

    @Body
    @NameInMap("timeout")
    private Integer timeout;

    private CreateFunctionRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcCodeChecksum = builder.xFcCodeChecksum;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
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
        this.functionName = builder.functionName;
        this.handler = builder.handler;
        this.initializationTimeout = builder.initializationTimeout;
        this.initializer = builder.initializer;
        this.instanceConcurrency = builder.instanceConcurrency;
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

    public static CreateFunctionRequest create() {
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
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
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

    public static final class Builder extends Request.Builder<CreateFunctionRequest, Builder> {
        private String serviceName; 
        private String xFcAccountId; 
        private String xFcCodeChecksum; 
        private String xFcDate; 
        private String xFcTraceId; 
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
        private String functionName; 
        private String handler; 
        private Integer initializationTimeout; 
        private String initializer; 
        private Integer instanceConcurrency; 
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

        private Builder(CreateFunctionRequest request) {
            super(request);
            this.serviceName = request.serviceName;
            this.xFcAccountId = request.xFcAccountId;
            this.xFcCodeChecksum = request.xFcCodeChecksum;
            this.xFcDate = request.xFcDate;
            this.xFcTraceId = request.xFcTraceId;
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
            this.functionName = request.functionName;
            this.handler = request.handler;
            this.initializationTimeout = request.initializationTimeout;
            this.initializer = request.initializer;
            this.instanceConcurrency = request.instanceConcurrency;
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
         * The port on which the HTTP server listens for the custom runtime or custom container runtime.
         */
        public Builder caPort(Integer caPort) {
            this.putBodyParameter("caPort", caPort);
            this.caPort = caPort;
            return this;
        }

        /**
         * The code of the function. The code must be packaged into a ZIP file. Choose **code** or **customContainerConfig** for the function.
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
         * The configurations of the custom container runtime. After you configure the custom container runtime, Function Compute can execute the function in a container created from a custom image. Choose **code** or **customContainerConfig** for the function.
         */
        public Builder customContainerConfig(CustomContainerConfig customContainerConfig) {
            this.putBodyParameter("customContainerConfig", customContainerConfig);
            this.customContainerConfig = customContainerConfig;
            return this;
        }

        /**
         * The custom Domain Name System (DNS) configurations of the function.
         */
        public Builder customDNS(CustomDNS customDNS) {
            this.putBodyParameter("customDNS", customDNS);
            this.customDNS = customDNS;
            return this;
        }

        /**
         * The custom health check configuration of the function. This parameter is applicable only to custom runtimes and custom containers.
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
         * The environment variables that you configured for the function. You can obtain the values of the environment variables from the function. For more information, see [Overview](~~69777~~).
         */
        public Builder environmentVariables(java.util.Map < String, String > environmentVariables) {
            this.putBodyParameter("environmentVariables", environmentVariables);
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * The name of the function. The name can contain letters, digits, underscores (\_), and hyphens (-) only. The name cannot start with a digit or a hyphen (-). The name must be 1 to 64 characters in length.
         */
        public Builder functionName(String functionName) {
            this.putBodyParameter("functionName", functionName);
            this.functionName = functionName;
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
         * The timeout period for the execution of the initializer function. Unit: seconds. Default value: 3. Valid values: 1 to 300. When this period expires, the execution of the initializer function is terminated.
         */
        public Builder initializationTimeout(Integer initializationTimeout) {
            this.putBodyParameter("initializationTimeout", initializationTimeout);
            this.initializationTimeout = initializationTimeout;
            return this;
        }

        /**
         * The handler of the initializer function. For more information, see [Initializer functions](~~157704~~).
         */
        public Builder initializer(String initializer) {
            this.putBodyParameter("initializer", initializer);
            this.initializer = initializer;
            return this;
        }

        /**
         * The number of requests that can be concurrently processed by a single instance.
         */
        public Builder instanceConcurrency(Integer instanceConcurrency) {
            this.putBodyParameter("instanceConcurrency", instanceConcurrency);
            this.instanceConcurrency = instanceConcurrency;
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
         * The soft concurrency of the instance. You can use this parameter to implement graceful scale-up of instances. If the number of concurrent requests on an instance is greater than the number of the soft concurrency, the instance scale-up is triggered. For example, if your instance requires a long term to start, you can specify a suitable soft concurrency to start the instance in advance.
         * <p>
         * 
         * The value must be less than or equal to that of **instanceConcurrency**.
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
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("instanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * An array that consists of the information of layers.
         * <p>
         * 
         * >  Multiple layers are merged based on the order of array subscripts. The content of a layer with a smaller subscript overwrites the file with the same name in the layer with a larger subscript.
         */
        public Builder layers(java.util.List < String > layers) {
            this.putBodyParameter("layers", layers);
            this.layers = layers;
            return this;
        }

        /**
         * The memory size for the function. Unit: MB. The memory size must be a multiple of 64 MB. The memory size varies based on the function instance type. For more information, see [Instance types](~~179379~~).
         */
        public Builder memorySize(Integer memorySize) {
            this.putBodyParameter("memorySize", memorySize);
            this.memorySize = memorySize;
            return this;
        }

        /**
         * The runtime environment of the function. Valid values: **nodejs14**, **nodejs12**, **nodejs10**, **nodejs8**, **nodejs6**, **nodejs4.4**, **python3.9**, **python3**, **python2.7**, **java11**, **java8**, **go1**, **php7.2**, **dotnetcore2.1**, **custom** and **custom-container**.
         */
        public Builder runtime(String runtime) {
            this.putBodyParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * The timeout period for the execution of the function. Unit: seconds. Default value: 3. Minimum value: 1. When this period ends, the execution of the function is terminated.
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public CreateFunctionRequest build() {
            return new CreateFunctionRequest(this);
        } 

    } 

}
