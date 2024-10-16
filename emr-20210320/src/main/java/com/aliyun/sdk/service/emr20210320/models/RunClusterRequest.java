// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunClusterRequest} extends {@link RequestModel}
 *
 * <p>RunClusterRequest</p>
 */
public class RunClusterRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationConfigs")
    private java.util.List < ApplicationConfig > applicationConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Applications")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Application > applications;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BootstrapScripts")
    private java.util.List < Script > bootstrapScripts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeployMode")
    private String deployMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeAttributes")
    private NodeAttributes nodeAttributes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeGroups")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < NodeGroupConfig > nodeGroups;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReleaseVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String releaseVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityMode")
    private String securityMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubscriptionConfig")
    private SubscriptionConfig subscriptionConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tag > tags;

    private RunClusterRequest(Builder builder) {
        super(builder);
        this.applicationConfigs = builder.applicationConfigs;
        this.applications = builder.applications;
        this.bootstrapScripts = builder.bootstrapScripts;
        this.clientToken = builder.clientToken;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.deployMode = builder.deployMode;
        this.description = builder.description;
        this.nodeAttributes = builder.nodeAttributes;
        this.nodeGroups = builder.nodeGroups;
        this.paymentType = builder.paymentType;
        this.regionId = builder.regionId;
        this.releaseVersion = builder.releaseVersion;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityMode = builder.securityMode;
        this.subscriptionConfig = builder.subscriptionConfig;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationConfigs
     */
    public java.util.List < ApplicationConfig > getApplicationConfigs() {
        return this.applicationConfigs;
    }

    /**
     * @return applications
     */
    public java.util.List < Application > getApplications() {
        return this.applications;
    }

    /**
     * @return bootstrapScripts
     */
    public java.util.List < Script > getBootstrapScripts() {
        return this.bootstrapScripts;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return deployMode
     */
    public String getDeployMode() {
        return this.deployMode;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return nodeAttributes
     */
    public NodeAttributes getNodeAttributes() {
        return this.nodeAttributes;
    }

    /**
     * @return nodeGroups
     */
    public java.util.List < NodeGroupConfig > getNodeGroups() {
        return this.nodeGroups;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return releaseVersion
     */
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityMode
     */
    public String getSecurityMode() {
        return this.securityMode;
    }

    /**
     * @return subscriptionConfig
     */
    public SubscriptionConfig getSubscriptionConfig() {
        return this.subscriptionConfig;
    }

    /**
     * @return tags
     */
    public java.util.List < Tag > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<RunClusterRequest, Builder> {
        private java.util.List < ApplicationConfig > applicationConfigs; 
        private java.util.List < Application > applications; 
        private java.util.List < Script > bootstrapScripts; 
        private String clientToken; 
        private String clusterName; 
        private String clusterType; 
        private String deployMode; 
        private String description; 
        private NodeAttributes nodeAttributes; 
        private java.util.List < NodeGroupConfig > nodeGroups; 
        private String paymentType; 
        private String regionId; 
        private String releaseVersion; 
        private String resourceGroupId; 
        private String securityMode; 
        private SubscriptionConfig subscriptionConfig; 
        private java.util.List < Tag > tags; 

        private Builder() {
            super();
        } 

        private Builder(RunClusterRequest request) {
            super(request);
            this.applicationConfigs = request.applicationConfigs;
            this.applications = request.applications;
            this.bootstrapScripts = request.bootstrapScripts;
            this.clientToken = request.clientToken;
            this.clusterName = request.clusterName;
            this.clusterType = request.clusterType;
            this.deployMode = request.deployMode;
            this.description = request.description;
            this.nodeAttributes = request.nodeAttributes;
            this.nodeGroups = request.nodeGroups;
            this.paymentType = request.paymentType;
            this.regionId = request.regionId;
            this.releaseVersion = request.releaseVersion;
            this.resourceGroupId = request.resourceGroupId;
            this.securityMode = request.securityMode;
            this.subscriptionConfig = request.subscriptionConfig;
            this.tags = request.tags;
        } 

        /**
         * <p>应用配置。数组元素个数N的取值范围：1~1000。</p>
         */
        public Builder applicationConfigs(java.util.List < ApplicationConfig > applicationConfigs) {
            String applicationConfigsShrink = shrink(applicationConfigs, "ApplicationConfigs", "json");
            this.putBodyParameter("ApplicationConfigs", applicationConfigsShrink);
            this.applicationConfigs = applicationConfigs;
            return this;
        }

        /**
         * <p>应用列表。数组元素个数N的取值范围：1~100。</p>
         * <p>This parameter is required.</p>
         */
        public Builder applications(java.util.List < Application > applications) {
            String applicationsShrink = shrink(applications, "Applications", "json");
            this.putBodyParameter("Applications", applicationsShrink);
            this.applications = applications;
            return this;
        }

        /**
         * <p>引导脚本。数组元素个数N的取值范围：1~10。</p>
         */
        public Builder bootstrapScripts(java.util.List < Script > bootstrapScripts) {
            String bootstrapScriptsShrink = shrink(bootstrapScripts, "BootstrapScripts", "json");
            this.putBodyParameter("BootstrapScripts", bootstrapScriptsShrink);
            this.bootstrapScripts = bootstrapScripts;
            return this;
        }

        /**
         * <p>幂等客户端TOKEN。同一个ClientToken多次调用的返回结果一致，同一个ClientToken最多只创建一个集群。</p>
         * 
         * <strong>example:</strong>
         * <p>A7D960FA-6DBA-5E07-8746-A63E3E4D****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>集群名称。长度为1~128个字符，必须以大小字母或中文开头，不能以http://和https://开头。可以包含中文、英文、数字、半角冒号（:）、下划线（_）、半角句号（.）或者短划线（-）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>emrtest</p>
         */
        public Builder clusterName(String clusterName) {
            this.putBodyParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>创建的EMR集群类型。取值范围：</p>
         * <ul>
         * <li>DATALAKE：新版数据湖。</li>
         * <li>OLAP：数据分析。</li>
         * <li>DATAFLOW：实时数据流。</li>
         * <li>DATASERVING：数据服务。</li>
         * <li>CUSTOM：自定义集群。</li>
         * <li>HADOOP：旧版数据湖（不推荐使用，建议使用新版数据湖）。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DATALAKE</p>
         */
        public Builder clusterType(String clusterType) {
            this.putBodyParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>集群中的应用部署模式。取值范围：</p>
         * <ul>
         * <li>NORMAL：非高可用部署。集群1个MASTER节点。</li>
         * <li>HA：高可用部署。高可用部署要求至少3个MASTER节点。</li>
         * </ul>
         * <p>默认值：NORMAL。</p>
         * 
         * <strong>example:</strong>
         * <p>HA</p>
         */
        public Builder deployMode(String deployMode) {
            this.putBodyParameter("DeployMode", deployMode);
            this.deployMode = deployMode;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * NodeAttributes.
         */
        public Builder nodeAttributes(NodeAttributes nodeAttributes) {
            String nodeAttributesShrink = shrink(nodeAttributes, "NodeAttributes", "json");
            this.putBodyParameter("NodeAttributes", nodeAttributesShrink);
            this.nodeAttributes = nodeAttributes;
            return this;
        }

        /**
         * <p>节点组。数组元素个数N的取值范围：1~100。</p>
         * <p>
         * 
         * <p>This parameter is required.</p>
         */
        public Builder nodeGroups(java.util.List < NodeGroupConfig > nodeGroups) {
            String nodeGroupsShrink = shrink(nodeGroups, "NodeGroups", "json");
            this.putBodyParameter("NodeGroups", nodeGroupsShrink);
            this.nodeGroups = nodeGroups;
            return this;
        }

        /**
         * <p>集群的付费类型。取值范围：</p>
         * <ul>
         * <li>PayAsYouGo：后付费。</li>
         * <li>Subscription：预付费。</li>
         * </ul>
         * <p>默认值：PayAsYouGo。</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder paymentType(String paymentType) {
            this.putBodyParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>区域ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>EMR发行版。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EMR-5.16.0</p>
         */
        public Builder releaseVersion(String releaseVersion) {
            this.putBodyParameter("ReleaseVersion", releaseVersion);
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * <p>集群所在的企业资源组ID。</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzabjyop****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Kerberos安全模式。取值范围：</p>
         * <ul>
         * <li>NORMAL：普通模式，不开启Kerberos模式。</li>
         * <li>KERBEROS：开启Kerberos模式。</li>
         * </ul>
         * <p>默认值：NORMAL</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder securityMode(String securityMode) {
            this.putBodyParameter("SecurityMode", securityMode);
            this.securityMode = securityMode;
            return this;
        }

        /**
         * SubscriptionConfig.
         */
        public Builder subscriptionConfig(SubscriptionConfig subscriptionConfig) {
            String subscriptionConfigShrink = shrink(subscriptionConfig, "SubscriptionConfig", "json");
            this.putBodyParameter("SubscriptionConfig", subscriptionConfigShrink);
            this.subscriptionConfig = subscriptionConfig;
            return this;
        }

        /**
         * <p>标签。数组元数个数N的取值范围：0~20。</p>
         */
        public Builder tags(java.util.List < Tag > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putBodyParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public RunClusterRequest build() {
            return new RunClusterRequest(this);
        } 

    } 

}
