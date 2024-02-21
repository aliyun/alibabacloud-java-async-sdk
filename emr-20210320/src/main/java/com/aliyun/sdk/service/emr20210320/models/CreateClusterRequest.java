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
         * The configurations of the applications. Valid values of N: 1 to 1000.
         */
        public Builder applicationConfigs(java.util.List < ApplicationConfig > applicationConfigs) {
            this.putQueryParameter("ApplicationConfigs", applicationConfigs);
            this.applicationConfigs = applicationConfigs;
            return this;
        }

        /**
         * The applications that you want to add to the cluster. Valid values of N: 1 to 100.
         */
        public Builder applications(java.util.List < Application > applications) {
            this.putQueryParameter("Applications", applications);
            this.applications = applications;
            return this;
        }

        /**
         * The array of scripts for the bootstrap actions. Valid values of N: 1 to 10.
         */
        public Builder bootstrapScripts(java.util.List < Script > bootstrapScripts) {
            this.putQueryParameter("BootstrapScripts", bootstrapScripts);
            this.bootstrapScripts = bootstrapScripts;
            return this;
        }

        /**
         * The idempotent client token. If you call the same ClientToken multiple times, the returned results are the same. Only one cluster can be created with the same ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The name of the cluster. The name must be 1 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * The type of the cluster. Valid values:
         * <p>
         * 
         * *   DATALAKE: data lake
         * *   OLAP: online analytical processing (OLAP)
         * *   DATAFLOW: Dataflow
         * *   DATASERVING: DataServing
         * *   CUSTOM: a custom hybrid cluster.
         * *   HADOOP: the old data lake. We recommend that you use the new data lake.
         * 
         * If you create an EMR cluster for the first time after 17:00 (UTC +8) on December 19, 2022, you cannot select the HADOOP, DATA_SCIENCE, PRESTO, or ZOOKEEPER cluster type.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The deployment mode of applications in the cluster. Valid values:
         * <p>
         * 
         * *   NORMAL: regular mode. A master node is deployed in the cluster.
         * *   HA: high availability mode. At least three master nodes are deployed in the cluster.
         */
        public Builder deployMode(String deployMode) {
            this.putQueryParameter("DeployMode", deployMode);
            this.deployMode = deployMode;
            return this;
        }

        /**
         * The attributes of all Elastic Compute Service (ECS) nodes in the cluster. The basic attributes of all ECS nodes in the cluster.
         */
        public Builder nodeAttributes(NodeAttributes nodeAttributes) {
            this.putQueryParameter("NodeAttributes", nodeAttributes);
            this.nodeAttributes = nodeAttributes;
            return this;
        }

        /**
         * The array of configurations of the node groups. Valid values of N: 1 to 100.
         */
        public Builder nodeGroups(java.util.List < NodeGroupConfig > nodeGroups) {
            this.putQueryParameter("NodeGroups", nodeGroups);
            this.nodeGroups = nodeGroups;
            return this;
        }

        /**
         * The billing cycle of the instance. Valid values:
         * <p>
         * 
         * *   PayAsYouGo: pay-as-you-go
         * *   Subscription: subscription
         * 
         * Default value: PayAsYouGo.
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * The ID of the region in which you want to create the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The version of EMR. You can view the EMR release version on the EMR cluster purchase page.
         */
        public Builder releaseVersion(String releaseVersion) {
            this.putQueryParameter("ReleaseVersion", releaseVersion);
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * The ID of the resource group to which to assign the ENI.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The security mode of the cluster. Valid values:
         * <p>
         * 
         * *   NORMAL: regular mode. Kerberos is not enabled.
         * *   KERBEROS: Kerberos mode. Kerberos is enabled.
         */
        public Builder securityMode(String securityMode) {
            this.putQueryParameter("SecurityMode", securityMode);
            this.securityMode = securityMode;
            return this;
        }

        /**
         * The subscription configurations. This parameter is required when the PaymentType parameter is set to Subscription.
         */
        public Builder subscriptionConfig(SubscriptionConfig subscriptionConfig) {
            this.putQueryParameter("SubscriptionConfig", subscriptionConfig);
            this.subscriptionConfig = subscriptionConfig;
            return this;
        }

        /**
         * The tag that you want to add to the cloud desktop. Valid values of N: 0 to 20.
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
