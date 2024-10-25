// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationConfigs")
    private java.util.List < ApplicationConfig > applicationConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Applications")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Application > applications;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BootstrapScripts")
    private java.util.List < Script > bootstrapScripts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployMode")
    private String deployMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeAttributes")
    @com.aliyun.core.annotation.Validation(required = true)
    private NodeAttributes nodeAttributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroups")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < NodeGroupConfig > nodeGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReleaseVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String releaseVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityMode")
    private String securityMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionConfig")
    private SubscriptionConfig subscriptionConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
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

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
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

        private Builder(CreateClusterRequest request) {
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
         * <p>The service configurations. Number of elements in the array: 1 to 1000.</p>
         */
        public Builder applicationConfigs(java.util.List < ApplicationConfig > applicationConfigs) {
            this.putQueryParameter("ApplicationConfigs", applicationConfigs);
            this.applicationConfigs = applicationConfigs;
            return this;
        }

        /**
         * <p>The services. Number of elements in the array: 1 to 100.</p>
         * <p>This parameter is required.</p>
         */
        public Builder applications(java.util.List < Application > applications) {
            this.putQueryParameter("Applications", applications);
            this.applications = applications;
            return this;
        }

        /**
         * <p>The bootstrap actions. Number of elements in the array: 1 to 10.</p>
         */
        public Builder bootstrapScripts(java.util.List < Script > bootstrapScripts) {
            this.putQueryParameter("BootstrapScripts", bootstrapScripts);
            this.bootstrapScripts = bootstrapScripts;
            return this;
        }

        /**
         * <p>The idempotent client token. If you call the same ClientToken multiple times, the returned results are the same. Only one cluster can be created with the same ClientToken.</p>
         * 
         * <strong>example:</strong>
         * <p>A7D960FA-6DBA-5E07-8746-A63E3E4D****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The name of the cluster. The name must be 1 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>emrtest</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <ul>
         * <li>DATALAKE: data lake</li>
         * <li>OLAP: online analytical processing (OLAP)</li>
         * <li>DATAFLOW: Dataflow</li>
         * <li>DATASERVING: DataServing</li>
         * <li>CUSTOM: a custom hybrid cluster.</li>
         * <li>HADOOP: the old data lake. We recommend that you use the new data lake.</li>
         * </ul>
         * <p>If you create an EMR cluster for the first time after 17:00 (UTC +8) on December 19, 2022, you cannot select the HADOOP, DATA_SCIENCE, PRESTO, or ZOOKEEPER cluster type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DATALAKE</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The deployment mode of master nodes in the cluster. Valid values:</p>
         * <ul>
         * <li>NORMAL: regular mode. This is the default value. A cluster that contains only one master node is created.</li>
         * <li>HA: high availability (HA) mode. A cluster that contains three master nodes is created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HA</p>
         */
        public Builder deployMode(String deployMode) {
            this.putQueryParameter("DeployMode", deployMode);
            this.deployMode = deployMode;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The attributes of all ECS instances. The basic attributes of all ECS instances in the cluster.</p>
         * <p>This parameter is required.</p>
         */
        public Builder nodeAttributes(NodeAttributes nodeAttributes) {
            this.putQueryParameter("NodeAttributes", nodeAttributes);
            this.nodeAttributes = nodeAttributes;
            return this;
        }

        /**
         * <p>The node groups. Number of elements in the array: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder nodeGroups(java.util.List < NodeGroupConfig > nodeGroups) {
            this.putQueryParameter("NodeGroups", nodeGroups);
            this.nodeGroups = nodeGroups;
            return this;
        }

        /**
         * <p>The billing cycle of the instance. Valid values:</p>
         * <ul>
         * <li>PayAsYouGo: pay-as-you-go</li>
         * <li>Subscription: subscription</li>
         * </ul>
         * <p>Default value: PayAsYouGo.</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The version of EMR. You can view the EMR release version on the EMR cluster purchase page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EMR-5.8.0</p>
         */
        public Builder releaseVersion(String releaseVersion) {
            this.putQueryParameter("ReleaseVersion", releaseVersion);
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * <p>The ID of the resource group to which to assign the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzabjyop****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The security mode of the cluster. Valid values:</p>
         * <ul>
         * <li>NORMAL: disables Kerberos authentication for the cluster. This is the default value.</li>
         * <li>KERBEROS: enables Kerberos authentication for the cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder securityMode(String securityMode) {
            this.putQueryParameter("SecurityMode", securityMode);
            this.securityMode = securityMode;
            return this;
        }

        /**
         * <p>The subscription configurations. This parameter is required only if you set the PaymentType parameter to Subscription.</p>
         */
        public Builder subscriptionConfig(SubscriptionConfig subscriptionConfig) {
            this.putQueryParameter("SubscriptionConfig", subscriptionConfig);
            this.subscriptionConfig = subscriptionConfig;
            return this;
        }

        /**
         * <p>The list of tags. Number of elements in the array: 0 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>A7D960FA-6DBA-5E07-8746-A63E3E4D****</p>
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
