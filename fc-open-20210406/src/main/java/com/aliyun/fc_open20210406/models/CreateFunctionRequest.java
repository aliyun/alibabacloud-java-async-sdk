// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
    @NameInMap("X-Fc-Invocation-Type")
    private String xFcInvocationType;

    @Header
    @NameInMap("X-Fc-Log-Type")
    private String xFcLogType;

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
    @NameInMap("customContainerConfig")
    private CustomContainerConfig customContainerConfig;

    @Body
    @NameInMap("customDNS")
    private CustomDNS customDNS;

    @Body
    @NameInMap("customRuntimeConfig")
    private CustomRuntimeConfig customRuntimeConfig;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("environmentVariables")
    private java.util.Map < String, String > environmentVariables;

    @Body
    @NameInMap("functionName")
    private String functionName;

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
    @NameInMap("instanceConcurrency")
    private Integer instanceConcurrency;

    @Body
    @NameInMap("instanceLifecycleConfig")
    private InstanceLifecycleConfig instanceLifecycleConfig;

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


    private CreateFunctionRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcCodeChecksum = builder.xFcCodeChecksum;
        this.xFcDate = builder.xFcDate;
        this.xFcInvocationType = builder.xFcInvocationType;
        this.xFcLogType = builder.xFcLogType;
        this.xFcTraceId = builder.xFcTraceId;
        this.caPort = builder.caPort;
        this.code = builder.code;
        this.customContainerConfig = builder.customContainerConfig;
        this.customDNS = builder.customDNS;
        this.customRuntimeConfig = builder.customRuntimeConfig;
        this.description = builder.description;
        this.environmentVariables = builder.environmentVariables;
        this.functionName = builder.functionName;
        this.handler = builder.handler;
        this.initializationTimeout = builder.initializationTimeout;
        this.initializer = builder.initializer;
        this.instanceConcurrency = builder.instanceConcurrency;
        this.instanceLifecycleConfig = builder.instanceLifecycleConfig;
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
     * @return xFcInvocationType
     */
    public String getXFcInvocationType() {
        return this.xFcInvocationType;
    }

    /**
     * @return xFcLogType
     */
    public String getXFcLogType() {
        return this.xFcLogType;
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

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String xFcAccountId; 
        private String xFcCodeChecksum; 
        private String xFcDate; 
        private String xFcInvocationType; 
        private String xFcLogType; 
        private String xFcTraceId; 
        private Integer caPort; 
        private Code code; 
        private CustomContainerConfig customContainerConfig; 
        private CustomDNS customDNS; 
        private CustomRuntimeConfig customRuntimeConfig; 
        private String description; 
        private java.util.Map < String, String > environmentVariables; 
        private String functionName; 
        private String handler; 
        private Integer initializationTimeout; 
        private String initializer; 
        private Integer instanceConcurrency; 
        private InstanceLifecycleConfig instanceLifecycleConfig; 
        private String instanceType; 
        private java.util.List < String > layers; 
        private Integer memorySize; 
        private String runtime; 
        private Integer timeout; 

        /**
         * <p>服务名称</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>X-Fc-Account-Id.</p>
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * <p>X-Fc-Code-Checksum.</p>
         */
        public Builder xFcCodeChecksum(String xFcCodeChecksum) {
            this.putHeaderParameter("X-Fc-Code-Checksum", xFcCodeChecksum);
            this.xFcCodeChecksum = xFcCodeChecksum;
            return this;
        }

        /**
         * <p>X-Fc-Date.</p>
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * <p>X-Fc-Invocation-Type.</p>
         */
        public Builder xFcInvocationType(String xFcInvocationType) {
            this.putHeaderParameter("X-Fc-Invocation-Type", xFcInvocationType);
            this.xFcInvocationType = xFcInvocationType;
            return this;
        }

        /**
         * <p>X-Fc-Log-Type.</p>
         */
        public Builder xFcLogType(String xFcLogType) {
            this.putHeaderParameter("X-Fc-Log-Type", xFcLogType);
            this.xFcLogType = xFcLogType;
            return this;
        }

        /**
         * <p>X-Fc-Trace-Id.</p>
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * <p>自定义、自定义容器运行时 HTTP Server 的监听端口</p>
         */
        public Builder caPort(Integer caPort) {
            this.putBodyParameter("caPort", caPort);
            this.caPort = caPort;
            return this;
        }

        /**
         * <p>code.</p>
         */
        public Builder code(Code code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>customContainerConfig.</p>
         */
        public Builder customContainerConfig(CustomContainerConfig customContainerConfig) {
            this.putBodyParameter("customContainerConfig", customContainerConfig);
            this.customContainerConfig = customContainerConfig;
            return this;
        }

        /**
         * <p>函数自定义DNS配置</p>
         */
        public Builder customDNS(CustomDNS customDNS) {
            this.putBodyParameter("customDNS", customDNS);
            this.customDNS = customDNS;
            return this;
        }

        /**
         * <p>Custom Runtime函数详细配置</p>
         */
        public Builder customRuntimeConfig(CustomRuntimeConfig customRuntimeConfig) {
            this.putBodyParameter("customRuntimeConfig", customRuntimeConfig);
            this.customRuntimeConfig = customRuntimeConfig;
            return this;
        }

        /**
         * <p>函数描述</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>environmentVariables.</p>
         */
        public Builder environmentVariables(java.util.Map < String, String > environmentVariables) {
            this.putBodyParameter("environmentVariables", environmentVariables);
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * <p>函数名称</p>
         */
        public Builder functionName(String functionName) {
            this.putBodyParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>function执行的入口，具体格式和语言相关</p>
         */
        public Builder handler(String handler) {
            this.putBodyParameter("handler", handler);
            this.handler = handler;
            return this;
        }

        /**
         * <p>初始化function运行的超时时间，单位为秒，最小1秒，默认3秒。初始化function超过这个时间后会被终止执行</p>
         */
        public Builder initializationTimeout(Integer initializationTimeout) {
            this.putBodyParameter("initializationTimeout", initializationTimeout);
            this.initializationTimeout = initializationTimeout;
            return this;
        }

        /**
         * <p>初始化 function 执行的入口，具体格式和语言相关</p>
         */
        public Builder initializer(String initializer) {
            this.putBodyParameter("initializer", initializer);
            this.initializer = initializer;
            return this;
        }

        /**
         * <p>instanceConcurrency.</p>
         */
        public Builder instanceConcurrency(Integer instanceConcurrency) {
            this.putBodyParameter("instanceConcurrency", instanceConcurrency);
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }

        /**
         * <p>instanceLifecycleConfig.</p>
         */
        public Builder instanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
            this.putBodyParameter("instanceLifecycleConfig", instanceLifecycleConfig);
            this.instanceLifecycleConfig = instanceLifecycleConfig;
            return this;
        }

        /**
         * <p>instanceType.</p>
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("instanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>层列表</p>
         */
        public Builder layers(java.util.List < String > layers) {
            this.putBodyParameter("layers", layers);
            this.layers = layers;
            return this;
        }

        /**
         * <p>function的内存规格，单位为MB，为64MB的倍数</p>
         */
        public Builder memorySize(Integer memorySize) {
            this.putBodyParameter("memorySize", memorySize);
            this.memorySize = memorySize;
            return this;
        }

        /**
         * <p>function运行的语言环境，目前支持nodejs6, nodejs8, python2.7, python3, java8</p>
         */
        public Builder runtime(String runtime) {
            this.putBodyParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * <p>function运行的超时时间，单位为秒，最小1秒，默认3秒。function超过这个时间后会被终止执行</p>
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        public CreateFunctionRequest build() {
            return new CreateFunctionRequest(this);
        } 

    } 

}
