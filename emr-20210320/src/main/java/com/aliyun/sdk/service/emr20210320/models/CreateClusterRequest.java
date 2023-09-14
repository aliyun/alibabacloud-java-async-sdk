// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @Query
    @NameInMap("ApplicationConfigs")
    private java.util.List < ApplicationConfig > applicationConfigs;

    @Query
    @NameInMap("Applications")
    @Validation(required = true)
    private java.util.List < Application > applications;

    @Query
    @NameInMap("BootstrapScripts")
    private java.util.List < Script > bootstrapScripts;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClusterName")
    @Validation(required = true)
    private String clusterName;

    @Query
    @NameInMap("ClusterType")
    @Validation(required = true)
    private String clusterType;

    @Query
    @NameInMap("DeployMode")
    private String deployMode;

    @Query
    @NameInMap("NodeAttributes")
    @Validation(required = true)
    private NodeAttributes nodeAttributes;

    @Query
    @NameInMap("NodeGroups")
    @Validation(required = true)
    private java.util.List < NodeGroupConfig > nodeGroups;

    @Query
    @NameInMap("PaymentType")
    private String paymentType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReleaseVersion")
    @Validation(required = true)
    private String releaseVersion;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SecurityMode")
    private String securityMode;

    @Query
    @NameInMap("SubscriptionConfig")
    private SubscriptionConfig subscriptionConfig;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tag > tags;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.applicationConfigs = builder.applicationConfigs;
        this.applications = builder.applications;
        this.bootstrapScripts = builder.bootstrapScripts;
        this.clientToken = builder.clientToken;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.deployMode = builder.deployMode;
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

    public static CreateClusterRequest create() {
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

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private java.util.List < ApplicationConfig > applicationConfigs; 
        private java.util.List < Application > applications; 
        private java.util.List < Script > bootstrapScripts; 
        private String clientToken; 
        private String clusterName; 
        private String clusterType; 
        private String deployMode; 
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

        private Builder(CreateClusterRequest request) {
            super(request);
            this.applicationConfigs = request.applicationConfigs;
            this.applications = request.applications;
            this.bootstrapScripts = request.bootstrapScripts;
            this.clientToken = request.clientToken;
            this.clusterName = request.clusterName;
            this.clusterType = request.clusterType;
            this.deployMode = request.deployMode;
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
         * 应用配置。数组元素个数N的取值范围：1~1000。
         */
        public Builder applicationConfigs(java.util.List < ApplicationConfig > applicationConfigs) {
            this.putQueryParameter("ApplicationConfigs", applicationConfigs);
            this.applicationConfigs = applicationConfigs;
            return this;
        }

        /**
         * 应用列表。数组元素个数N的取值范围：1~100。
         */
        public Builder applications(java.util.List < Application > applications) {
            this.putQueryParameter("Applications", applications);
            this.applications = applications;
            return this;
        }

        /**
         * 引导脚本。数组元素个数N的取值范围：1~10。
         */
        public Builder bootstrapScripts(java.util.List < Script > bootstrapScripts) {
            this.putQueryParameter("BootstrapScripts", bootstrapScripts);
            this.bootstrapScripts = bootstrapScripts;
            return this;
        }

        /**
         * 幂等客户端TOKEN。同一个ClientToken多次调用的返回结果一致，同一个ClientToken最多只创建一个集群。
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 集群名称。长度为1~128个字符，必须以大小字母或中文开头，不能以http://和https://开头。可以包含中文、英文、数字、半角冒号（:）、下划线（_）、半角句号（.）或者短划线（-）
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * 创建的EMR集群类型。取值范围：
         * <p>
         * - DATALAKE：新版数据湖。
         * - OLAP：数据分析。
         * - DATAFLOW：实时数据流。
         * - DATASERVING：数据服务。
         * - CUSTOM：自定义集群。
         * - HADOOP：旧版数据湖（不推荐使用，建议使用新版数据湖）。
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * 集群中的应用部署模式。取值范围：
         * <p>
         * - NORMAL：非高可用部署。集群1个MASTER节点。
         * - HA：高可用部署。高可用部署要求至少3个MASTER节点。
         * 
         * 默认值：NORMAL。
         */
        public Builder deployMode(String deployMode) {
            this.putQueryParameter("DeployMode", deployMode);
            this.deployMode = deployMode;
            return this;
        }

        /**
         * 节点属性。集群中的ECS节点基础属性。
         */
        public Builder nodeAttributes(NodeAttributes nodeAttributes) {
            this.putQueryParameter("NodeAttributes", nodeAttributes);
            this.nodeAttributes = nodeAttributes;
            return this;
        }

        /**
         * 节点组。数组元素个数N的取值范围：1~100。
         * <p>
         * <p>
         */
        public Builder nodeGroups(java.util.List < NodeGroupConfig > nodeGroups) {
            this.putQueryParameter("NodeGroups", nodeGroups);
            this.nodeGroups = nodeGroups;
            return this;
        }

        /**
         * 集群的付费类型。取值范围：
         * <p>
         * - PayAsYouGo：后付费。
         * - Subscription：预付费。
         * 
         * 默认值：PayAsYouGo。
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * 区域ID。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * EMR发行版。
         */
        public Builder releaseVersion(String releaseVersion) {
            this.putQueryParameter("ReleaseVersion", releaseVersion);
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * 集群所在的企业资源组ID。
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Kerberos安全模式。取值范围：
         * <p>
         * - NORMAL：普通模式，不开启Kerberos模式。
         * - KERBEROS：开启Kerberos模式。
         * 
         * 默认值：NORMAL
         */
        public Builder securityMode(String securityMode) {
            this.putQueryParameter("SecurityMode", securityMode);
            this.securityMode = securityMode;
            return this;
        }

        /**
         * 预付费配置。当PaymentType取值Subscription时该参数生效。
         */
        public Builder subscriptionConfig(SubscriptionConfig subscriptionConfig) {
            this.putQueryParameter("SubscriptionConfig", subscriptionConfig);
            this.subscriptionConfig = subscriptionConfig;
            return this;
        }

        /**
         * 标签。数组元数个数N的取值范围：0~20。
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

}
