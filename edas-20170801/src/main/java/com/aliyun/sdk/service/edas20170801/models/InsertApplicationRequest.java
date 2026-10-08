// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link InsertApplicationRequest} extends {@link RequestModel}
 *
 * <p>InsertApplicationRequest</p>
 */
public class InsertApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuildPackId")
    private Integer buildPackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentIds")
    private String componentIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Integer cpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcuInfo")
    private String ecuInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnablePortCheck")
    private Boolean enablePortCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableUrlCheck")
    private Boolean enableUrlCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckUrl")
    private String healthCheckUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hooks")
    private String hooks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Jdk")
    private String jdk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JvmOptions")
    private String jvmOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalRegionId")
    private String logicalRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxHeapSize")
    private Integer maxHeapSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxPermSize")
    private Integer maxPermSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mem")
    private Integer mem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinHeapSize")
    private Integer minHeapSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageType")
    private String packageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservedPortStr")
    private String reservedPortStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebContainer")
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
         * <p>The name of the application. The name can contain only digits, letters, hyphens (-), and underscores (_). It must start with a letter and can be up to 36 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hello-edas-test-1</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>The build package number of EDAS-Container. This parameter is required when you create a High-speed Service Framework (HSF) application. You can obtain the build package number in one of the following ways:</p>
         * <ul>
         * <li><p>Call the ListBuildPack operation. For more information, see <a href="https://help.aliyun.com/document_detail/149391.html">ListBuildPack</a>.</p>
         * </li>
         * <li><p>Obtain the build package number from the <strong>Build Package Number</strong> column in the <a href="https://help.aliyun.com/document_detail/92614.html">Container versions</a> table.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>59</p>
         */
        public Builder buildPackId(Integer buildPackId) {
            this.putQueryParameter("BuildPackId", buildPackId);
            this.buildPackId = buildPackId;
            return this;
        }

        /**
         * <p>The ID of the ECS cluster. Specify this parameter to create the application in a specific ECS cluster. If you leave this parameter empty, the application is created in the default cluster. We recommend that you specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>13136119-f384-4f50-b76e-xxxxxxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the application component. You can call the ListComponents operation to query the component ID. For more information, see <a href="https://help.aliyun.com/document_detail/97502.html">ListComponents</a>.</p>
         * <p>This parameter is required if the application runs in an Apache Tomcat container (for Dubbo applications that are deployed in a WAR package) or a standard Java application runtime environment (for Spring Boot or Spring Cloud applications that are deployed in a JAR package).</p>
         * <p>The following application component IDs are commonly used:</p>
         * <ul>
         * <li><p>4: Apache Tomcat 7.0.91</p>
         * </li>
         * <li><p>7: Apache Tomcat 8.5.42</p>
         * </li>
         * <li><p>5: OpenJDK 1.8.x</p>
         * </li>
         * <li><p>6: OpenJDK 1.7.x</p>
         * </li>
         * </ul>
         * <p>To set this parameter, you must update the Java or Python software development kit (SDK) to version 2.57.3 or later. If you do not use an EDAS SDK, such as aliyun-python-sdk-core, aliyun-java-sdk-core, or Alibaba Cloud CLI, you can set this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder componentIds(String componentIds) {
            this.putQueryParameter("ComponentIds", componentIds);
            this.componentIds = componentIds;
            return this;
        }

        /**
         * <p>\<em>\</em>(Deprecated)\<em>\</em> The number of CPU cores for the application container in a Swarm cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpu(Integer cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>create by edas pop api</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The \<code>ecu_id\\</code> of the ECS instance to which you want to scale out the application. The \<code>ecu_id\\</code> is the unique ID of an ECS instance that is imported to EDAS. To specify multiple \<code>ecu_id\\</code>s, separate them with commas (,). You can call the ListScaleOutEcu operation to query the \<code>ecu_id\\</code>. For more information, see <a href="https://help.aliyun.com/document_detail/149371.html">ListScaleOutEcu</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>07bd417a-b863-477d-<strong><strong>-</strong></strong>********</p>
         */
        public Builder ecuInfo(String ecuInfo) {
            this.putQueryParameter("EcuInfo", ecuInfo);
            this.ecuInfo = ecuInfo;
            return this;
        }

        /**
         * <p>Specifies whether to enable the port health check. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enablePortCheck(Boolean enablePortCheck) {
            this.putQueryParameter("EnablePortCheck", enablePortCheck);
            this.enablePortCheck = enablePortCheck;
            return this;
        }

        /**
         * <p>Specifies whether to enable the health check URL. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableUrlCheck(Boolean enableUrlCheck) {
            this.putQueryParameter("EnableUrlCheck", enableUrlCheck);
            this.enableUrlCheck = enableUrlCheck;
            return this;
        }

        /**
         * <p>The health check URL of the application. This parameter is equivalent to the HealthCheckURL parameter.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://127.0.0.1:8080/_ehc.html">http://127.0.0.1:8080/_ehc.html</a></p>
         */
        public Builder healthCheckUrl(String healthCheckUrl) {
            this.putQueryParameter("HealthCheckUrl", healthCheckUrl);
            this.healthCheckUrl = healthCheckUrl;
            return this;
        }

        /**
         * <p>The configuration of the mounted script. The value is a JSON string. Example:
         * <code>[{&quot;ignoreFail&quot;:false,&quot;name&quot;:&quot;postprepareInstanceEnvironmentOnScaleOut&quot;,&quot;script&quot;:&quot;ls&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;postdeleteInstanceDataOnScaleIn&quot;,&quot;script&quot;:&quot;&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;prestartInstance&quot;,&quot;script&quot;:&quot;&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;poststartInstance&quot;,&quot;script&quot;:&quot;&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;prestopInstance&quot;,&quot;script&quot;:&quot;&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;poststopInstance&quot;,&quot;script&quot;:&quot;&quot;}]</code></p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ignoreFail&quot;:false,&quot;name&quot;:&quot;postprepareInstanceEnvironmentOnScaleOut&quot;,&quot;script&quot;:&quot;ls&quot;}]</p>
         */
        public Builder hooks(String hooks) {
            this.putQueryParameter("Hooks", hooks);
            this.hooks = hooks;
            return this;
        }

        /**
         * <p><strong>(Deprecated)</strong> The version of the Java Development Kit (JDK) that the application uses.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder jdk(String jdk) {
            this.putQueryParameter("Jdk", jdk);
            this.jdk = jdk;
            return this;
        }

        /**
         * <p>The custom parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>-Dproperty=value</p>
         */
        public Builder jvmOptions(String jvmOptions) {
            this.putQueryParameter("JvmOptions", jvmOptions);
            this.jvmOptions = jvmOptions;
            return this;
        }

        /**
         * <p>The ID of the microservices namespace. In the EDAS console, choose <strong>Resource Management</strong> &gt; <strong>Microservices Namespace</strong> in the navigation pane on the left to view the ID of the microservices namespace. You can also call the ListUserDefineRegion operation to query the ID. For more information, see <a href="https://help.aliyun.com/document_detail/149377.html">ListUserDefineRegion</a>.</p>
         * <ul>
         * <li><p>If the specified cluster is not in the default microservices namespace, you must specify this parameter. Otherwise, the \<code>application regionId is different with cluster regionId!\\</code> error is reported.</p>
         * </li>
         * <li><p>If the cluster is in the default microservices namespace, you do not need to specify this parameter. The microservices namespace of the application must be the same as the microservices namespace of the specified cluster.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:prod</p>
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        /**
         * <p>The maximum size of the heap memory. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxHeapSize(Integer maxHeapSize) {
            this.putQueryParameter("MaxHeapSize", maxHeapSize);
            this.maxHeapSize = maxHeapSize;
            return this;
        }

        /**
         * <p>The size of the permanent generation memory. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder maxPermSize(Integer maxPermSize) {
            this.putQueryParameter("MaxPermSize", maxPermSize);
            this.maxPermSize = maxPermSize;
            return this;
        }

        /**
         * <p>\<em>\</em>(Deprecated)\<em>\</em> The memory size for the application container in a Swarm cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder mem(Integer mem) {
            this.putQueryParameter("Mem", mem);
            this.mem = mem;
            return this;
        }

        /**
         * <p>The initial size of the heap memory. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder minHeapSize(Integer minHeapSize) {
            this.putQueryParameter("MinHeapSize", minHeapSize);
            this.minHeapSize = minHeapSize;
            return this;
        }

        /**
         * <p>The format of the application deployment package. Valid values: war and jar.</p>
         * 
         * <strong>example:</strong>
         * <p>war</p>
         */
        public Builder packageType(String packageType) {
            this.putQueryParameter("PackageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * <p>\<em>\</em>(Deprecated)\<em>\</em> The reserved port of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>8090</p>
         */
        public Builder reservedPortStr(String reservedPortStr) {
            this.putQueryParameter("ReservedPortStr", reservedPortStr);
            this.reservedPortStr = reservedPortStr;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek24j4s4b*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p><strong>(Deprecated)</strong> The version of Apache Tomcat.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
