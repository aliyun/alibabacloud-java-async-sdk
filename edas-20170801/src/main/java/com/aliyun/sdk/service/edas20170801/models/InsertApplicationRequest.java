// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertApplicationRequest} extends {@link RequestModel}
 *
 * <p>InsertApplicationRequest</p>
 */
public class InsertApplicationRequest extends Request {
    @Query
    @NameInMap("ApplicationName")
    @Validation(required = true)
    private String applicationName;

    @Query
    @NameInMap("BuildPackId")
    private Integer buildPackId;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ComponentIds")
    private String componentIds;

    @Query
    @NameInMap("Cpu")
    private Integer cpu;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EcuInfo")
    private String ecuInfo;

    @Query
    @NameInMap("EnablePortCheck")
    private Boolean enablePortCheck;

    @Query
    @NameInMap("EnableUrlCheck")
    private Boolean enableUrlCheck;

    @Query
    @NameInMap("HealthCheckURL")
    private String healthCheckURL;

    @Query
    @NameInMap("HealthCheckUrl")
    private String healthCheckUrl;

    @Query
    @NameInMap("Hooks")
    private String hooks;

    @Query
    @NameInMap("Jdk")
    private String jdk;

    @Query
    @NameInMap("JvmOptions")
    private String jvmOptions;

    @Query
    @NameInMap("LogicalRegionId")
    private String logicalRegionId;

    @Query
    @NameInMap("MaxHeapSize")
    private Integer maxHeapSize;

    @Query
    @NameInMap("MaxPermSize")
    private Integer maxPermSize;

    @Query
    @NameInMap("Mem")
    private Integer mem;

    @Query
    @NameInMap("MinHeapSize")
    private Integer minHeapSize;

    @Query
    @NameInMap("PackageType")
    private String packageType;

    @Query
    @NameInMap("ReservedPortStr")
    private String reservedPortStr;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("WebContainer")
    private String webContainer;

    private InsertApplicationRequest(Builder builder) {
        super(builder);
        this.applicationName = builder.applicationName;
        this.buildPackId = builder.buildPackId;
        this.clusterId = builder.clusterId;
        this.componentIds = builder.componentIds;
        this.cpu = builder.cpu;
        this.description = builder.description;
        this.ecuInfo = builder.ecuInfo;
        this.enablePortCheck = builder.enablePortCheck;
        this.enableUrlCheck = builder.enableUrlCheck;
        this.healthCheckURL = builder.healthCheckURL;
        this.healthCheckUrl = builder.healthCheckUrl;
        this.hooks = builder.hooks;
        this.jdk = builder.jdk;
        this.jvmOptions = builder.jvmOptions;
        this.logicalRegionId = builder.logicalRegionId;
        this.maxHeapSize = builder.maxHeapSize;
        this.maxPermSize = builder.maxPermSize;
        this.mem = builder.mem;
        this.minHeapSize = builder.minHeapSize;
        this.packageType = builder.packageType;
        this.reservedPortStr = builder.reservedPortStr;
        this.resourceGroupId = builder.resourceGroupId;
        this.webContainer = builder.webContainer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return buildPackId
     */
    public Integer getBuildPackId() {
        return this.buildPackId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return componentIds
     */
    public String getComponentIds() {
        return this.componentIds;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ecuInfo
     */
    public String getEcuInfo() {
        return this.ecuInfo;
    }

    /**
     * @return enablePortCheck
     */
    public Boolean getEnablePortCheck() {
        return this.enablePortCheck;
    }

    /**
     * @return enableUrlCheck
     */
    public Boolean getEnableUrlCheck() {
        return this.enableUrlCheck;
    }

    /**
     * @return healthCheckURL
     */
    public String getHealthCheckURL() {
        return this.healthCheckURL;
    }

    /**
     * @return healthCheckUrl
     */
    public String getHealthCheckUrl() {
        return this.healthCheckUrl;
    }

    /**
     * @return hooks
     */
    public String getHooks() {
        return this.hooks;
    }

    /**
     * @return jdk
     */
    public String getJdk() {
        return this.jdk;
    }

    /**
     * @return jvmOptions
     */
    public String getJvmOptions() {
        return this.jvmOptions;
    }

    /**
     * @return logicalRegionId
     */
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    /**
     * @return maxHeapSize
     */
    public Integer getMaxHeapSize() {
        return this.maxHeapSize;
    }

    /**
     * @return maxPermSize
     */
    public Integer getMaxPermSize() {
        return this.maxPermSize;
    }

    /**
     * @return mem
     */
    public Integer getMem() {
        return this.mem;
    }

    /**
     * @return minHeapSize
     */
    public Integer getMinHeapSize() {
        return this.minHeapSize;
    }

    /**
     * @return packageType
     */
    public String getPackageType() {
        return this.packageType;
    }

    /**
     * @return reservedPortStr
     */
    public String getReservedPortStr() {
        return this.reservedPortStr;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return webContainer
     */
    public String getWebContainer() {
        return this.webContainer;
    }

    public static final class Builder extends Request.Builder<InsertApplicationRequest, Builder> {
        private String applicationName; 
        private Integer buildPackId; 
        private String clusterId; 
        private String componentIds; 
        private Integer cpu; 
        private String description; 
        private String ecuInfo; 
        private Boolean enablePortCheck; 
        private Boolean enableUrlCheck; 
        private String healthCheckURL; 
        private String healthCheckUrl; 
        private String hooks; 
        private String jdk; 
        private String jvmOptions; 
        private String logicalRegionId; 
        private Integer maxHeapSize; 
        private Integer maxPermSize; 
        private Integer mem; 
        private Integer minHeapSize; 
        private String packageType; 
        private String reservedPortStr; 
        private String resourceGroupId; 
        private String webContainer; 

        private Builder() {
            super();
        } 

        private Builder(InsertApplicationRequest request) {
            super(request);
            this.applicationName = request.applicationName;
            this.buildPackId = request.buildPackId;
            this.clusterId = request.clusterId;
            this.componentIds = request.componentIds;
            this.cpu = request.cpu;
            this.description = request.description;
            this.ecuInfo = request.ecuInfo;
            this.enablePortCheck = request.enablePortCheck;
            this.enableUrlCheck = request.enableUrlCheck;
            this.healthCheckURL = request.healthCheckURL;
            this.healthCheckUrl = request.healthCheckUrl;
            this.hooks = request.hooks;
            this.jdk = request.jdk;
            this.jvmOptions = request.jvmOptions;
            this.logicalRegionId = request.logicalRegionId;
            this.maxHeapSize = request.maxHeapSize;
            this.maxPermSize = request.maxPermSize;
            this.mem = request.mem;
            this.minHeapSize = request.minHeapSize;
            this.packageType = request.packageType;
            this.reservedPortStr = request.reservedPortStr;
            this.resourceGroupId = request.resourceGroupId;
            this.webContainer = request.webContainer;
        } 

        /**
         * The name of the application. The name can contain only digits, letters, hyphens (-), and underscores (\_) and must start with a letter. The name can be up to 36 characters in length.
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * The build package number of EDAS Container. This parameter is required if you create a High-Speed Service Framework (HSF) application. You can query the build package number by using one of the following methods:
         * <p>
         * 
         * *   Call the ListBuildPack operation. For more information, see [ListBuildPack](~~149391~~).
         * *   Obtain the value in the **Build package number** column of the [Release notes for EDAS Container](~~92614~~) topic.
         */
        public Builder buildPackId(Integer buildPackId) {
            this.putQueryParameter("BuildPackId", buildPackId);
            this.buildPackId = buildPackId;
            return this;
        }

        /**
         * The ID of the ECS cluster in which you want to create the application. If you specify an ID, the application is created in the specified ECS cluster. If you leave this parameter empty, the application is created in the default cluster. We recommend that you specify this parameter.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the application component. You can call the ListComponents operation to query the component IDs. For more information, see [ListComponents](~~97502~~).
         * <p>
         * 
         * This parameter is required if the application runs in Apache Tomcat or in a standard Java application runtime environment. The Apache Tomcat application runtime environment is applicable to Dubbo applications that are deployed by using WAR packages. A standard Java application runtime environment is applicable to Spring Boot or Spring Cloud applications that are deployed by using JAR packages.
         * 
         * Valid values for common application components:
         * 
         * *   4: Apache Tomcat 7.0.91
         * *   7: Apache Tomcat 8.5.42
         * *   5: OpenJDK 1.8.x
         * *   6: OpenJDK 1.7.x
         * 
         * This parameter is available only for Java SDK 2.57.3 or later, or Python SDK 2.57.3 or later. Assume that you use an SDK that is not provided by EDAS, for example, aliyun-python-sdk-core, aliyun-java-sdk-core, and Alibaba Cloud CLI. In this case, you can directly specify this parameter.
         */
        public Builder componentIds(String componentIds) {
            this.putQueryParameter("ComponentIds", componentIds);
            this.componentIds = componentIds;
            return this;
        }

        /**
         * The number of CPU cores that can be used by the application container in a Swarm cluster. \*\*This parameter is deprecated.\*\*
         */
        public Builder cpu(Integer cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * The description of the application.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The value of `ecu_id` of the ECS instance to be added during scale-out. The ECU ID is the unique identity for an ECS instance that is imported to EDAS. Separate multiple values of `ecu_id` with commas (,). You can call the ListScaleOutEcu operation to query the value of `ecu_id`. For more information, see [ListScaleOutEcu](~~149371~~).
         */
        public Builder ecuInfo(String ecuInfo) {
            this.putQueryParameter("EcuInfo", ecuInfo);
            this.ecuInfo = ecuInfo;
            return this;
        }

        /**
         * Specifies whether to enable the port health check. Valid values:
         * <p>
         * 
         * *   **true**: enable the port health check.
         * *   **false**: does not enable the port health check.
         */
        public Builder enablePortCheck(Boolean enablePortCheck) {
            this.putQueryParameter("EnablePortCheck", enablePortCheck);
            this.enablePortCheck = enablePortCheck;
            return this;
        }

        /**
         * Specifies whether to enable the URL health check. Valid values:
         * <p>
         * 
         * *   **true**: enables the URL health check.
         * *   **false**: does not enable the URL health check.
         */
        public Builder enableUrlCheck(Boolean enableUrlCheck) {
            this.putQueryParameter("EnableUrlCheck", enableUrlCheck);
            this.enableUrlCheck = enableUrlCheck;
            return this;
        }

        /**
         * The health check URL of the application.
         */
        public Builder healthCheckURL(String healthCheckURL) {
            this.putQueryParameter("HealthCheckURL", healthCheckURL);
            this.healthCheckURL = healthCheckURL;
            return this;
        }

        /**
         * The health check URL of the application. This parameter is equivalent to the HealthCheckURL parameter.
         */
        public Builder healthCheckUrl(String healthCheckUrl) {
            this.putQueryParameter("HealthCheckUrl", healthCheckUrl);
            this.healthCheckUrl = healthCheckUrl;
            return this;
        }

        /**
         * The script to mount. Set the value in the JSON format. Example: `[{"ignoreFail":false,"name":"postprepareInstanceEnvironmentOnScaleOut","script":"ls"},{"ignoreFail":true,"name":"postdeleteInstanceDataOnScaleIn","script":""},{"ignoreFail":true,"name":"prestartInstance","script":""},{"ignoreFail":true,"name":"poststartInstance","script":""},{"ignoreFail":true,"name":"prestopInstance","script":""},{"ignoreFail":true,"name":"poststopInstance","script":""}]`
         */
        public Builder hooks(String hooks) {
            this.putQueryParameter("Hooks", hooks);
            this.hooks = hooks;
            return this;
        }

        /**
         * The version of the Java Development Kit (JDK) used to deploy the application. **This parameter is deprecated.
         */
        public Builder jdk(String jdk) {
            this.putQueryParameter("Jdk", jdk);
            this.jdk = jdk;
            return this;
        }

        /**
         * The custom parameters.
         */
        public Builder jvmOptions(String jvmOptions) {
            this.putQueryParameter("JvmOptions", jvmOptions);
            this.jvmOptions = jvmOptions;
            return this;
        }

        /**
         * The ID of the microservices namespace. To query the ID of a microservices namespace, you can choose **Resource Management** > **Microservice Namespaces** in the left-side navigation pane of the EDAS console or call the ListUserDefineRegion operation. For more information, see [ListUserDefineRegion](~~149377~~).
         * <p>
         * 
         * *   This parameter is required if the cluster you specify is not deployed in the default microservices namespace. Otherwise, the message `application regionId is different with cluster regionId!` appears.
         * *   If the cluster you specify is deployed in the default microservices namespace, you do not need to specify this parameter. Set this parameter to the ID of the microservices namespace in which the cluster you specify is deployed.
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        /**
         * The maximum size of the heap memory. Unit: MB.
         */
        public Builder maxHeapSize(Integer maxHeapSize) {
            this.putQueryParameter("MaxHeapSize", maxHeapSize);
            this.maxHeapSize = maxHeapSize;
            return this;
        }

        /**
         * The size of the permanent generation heap memory. Unit: MB.
         */
        public Builder maxPermSize(Integer maxPermSize) {
            this.putQueryParameter("MaxPermSize", maxPermSize);
            this.maxPermSize = maxPermSize;
            return this;
        }

        /**
         * The memory size that can be used by the application container in a Swarm cluster. \*\*This parameter is deprecated.\*\*
         */
        public Builder mem(Integer mem) {
            this.putQueryParameter("Mem", mem);
            this.mem = mem;
            return this;
        }

        /**
         * The initial size of the heap memory. Unit: MB.
         */
        public Builder minHeapSize(Integer minHeapSize) {
            this.putQueryParameter("MinHeapSize", minHeapSize);
            this.minHeapSize = minHeapSize;
            return this;
        }

        /**
         * The type of the application deployment package. Valid values: war and jar.
         */
        public Builder packageType(String packageType) {
            this.putQueryParameter("PackageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * The reserved port for the application. \*\*This parameter is deprecated.\*\*
         */
        public Builder reservedPortStr(String reservedPortStr) {
            this.putQueryParameter("ReservedPortStr", reservedPortStr);
            this.reservedPortStr = reservedPortStr;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The version of Apache Tomcat. **This parameter is deprecated.
         */
        public Builder webContainer(String webContainer) {
            this.putQueryParameter("WebContainer", webContainer);
            this.webContainer = webContainer;
            return this;
        }

        @Override
        public InsertApplicationRequest build() {
            return new InsertApplicationRequest(this);
        } 

    } 

}
