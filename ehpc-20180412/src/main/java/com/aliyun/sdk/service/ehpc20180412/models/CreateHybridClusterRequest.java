// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHybridClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateHybridClusterRequest</p>
 */
public class CreateHybridClusterRequest extends Request {
    @Query
    @NameInMap("EcsOrder")
    private EcsOrder ecsOrder;

    @Query
    @NameInMap("Application")
    private java.util.List < Application> application;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClientVersion")
    private String clientVersion;

    @Query
    @NameInMap("ComputeSpotPriceLimit")
    private Float computeSpotPriceLimit;

    @Query
    @NameInMap("ComputeSpotStrategy")
    private String computeSpotStrategy;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("EhpcVersion")
    private String ehpcVersion;

    @Query
    @NameInMap("HybridClusterOpMode")
    private String hybridClusterOpMode;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @Query
    @NameInMap("JobQueue")
    private String jobQueue;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("Location")
    private String location;

    @Query
    @NameInMap("MultiOs")
    private Boolean multiOs;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Nodes")
    private java.util.List < Nodes> nodes;

    @Query
    @NameInMap("OnPremiseVolumeLocalPath")
    private String onPremiseVolumeLocalPath;

    @Query
    @NameInMap("OnPremiseVolumeMountPoint")
    private String onPremiseVolumeMountPoint;

    @Query
    @NameInMap("OnPremiseVolumeProtocol")
    private String onPremiseVolumeProtocol;

    @Query
    @NameInMap("OnPremiseVolumeRemotePath")
    private String onPremiseVolumeRemotePath;

    @Query
    @NameInMap("OpenldapPar")
    private OpenldapPar openldapPar;

    @Query
    @NameInMap("OsTag")
    @Validation(required = true)
    private String osTag;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("Plugin")
    private String plugin;

    @Query
    @NameInMap("PostInstallScript")
    private java.util.List < PostInstallScript> postInstallScript;

    @Query
    @NameInMap("RemoteDirectory")
    private String remoteDirectory;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SchedulerPreInstall")
    private Boolean schedulerPreInstall;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("SecurityGroupName")
    private String securityGroupName;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("VolumeId")
    private String volumeId;

    @Query
    @NameInMap("VolumeMountpoint")
    private String volumeMountpoint;

    @Query
    @NameInMap("VolumeProtocol")
    private String volumeProtocol;

    @Query
    @NameInMap("VolumeType")
    private String volumeType;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @Query
    @NameInMap("WinAdPar")
    private WinAdPar winAdPar;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private CreateHybridClusterRequest(Builder builder) {
        super(builder);
        this.ecsOrder = builder.ecsOrder;
        this.application = builder.application;
        this.clientToken = builder.clientToken;
        this.clientVersion = builder.clientVersion;
        this.computeSpotPriceLimit = builder.computeSpotPriceLimit;
        this.computeSpotStrategy = builder.computeSpotStrategy;
        this.description = builder.description;
        this.domain = builder.domain;
        this.ehpcVersion = builder.ehpcVersion;
        this.hybridClusterOpMode = builder.hybridClusterOpMode;
        this.imageId = builder.imageId;
        this.imageOwnerAlias = builder.imageOwnerAlias;
        this.jobQueue = builder.jobQueue;
        this.keyPairName = builder.keyPairName;
        this.location = builder.location;
        this.multiOs = builder.multiOs;
        this.name = builder.name;
        this.nodes = builder.nodes;
        this.onPremiseVolumeLocalPath = builder.onPremiseVolumeLocalPath;
        this.onPremiseVolumeMountPoint = builder.onPremiseVolumeMountPoint;
        this.onPremiseVolumeProtocol = builder.onPremiseVolumeProtocol;
        this.onPremiseVolumeRemotePath = builder.onPremiseVolumeRemotePath;
        this.openldapPar = builder.openldapPar;
        this.osTag = builder.osTag;
        this.password = builder.password;
        this.plugin = builder.plugin;
        this.postInstallScript = builder.postInstallScript;
        this.remoteDirectory = builder.remoteDirectory;
        this.resourceGroupId = builder.resourceGroupId;
        this.schedulerPreInstall = builder.schedulerPreInstall;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupName = builder.securityGroupName;
        this.vSwitchId = builder.vSwitchId;
        this.volumeId = builder.volumeId;
        this.volumeMountpoint = builder.volumeMountpoint;
        this.volumeProtocol = builder.volumeProtocol;
        this.volumeType = builder.volumeType;
        this.vpcId = builder.vpcId;
        this.winAdPar = builder.winAdPar;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHybridClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ecsOrder
     */
    public EcsOrder getEcsOrder() {
        return this.ecsOrder;
    }

    /**
     * @return application
     */
    public java.util.List < Application> getApplication() {
        return this.application;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return computeSpotPriceLimit
     */
    public Float getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    /**
     * @return computeSpotStrategy
     */
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return ehpcVersion
     */
    public String getEhpcVersion() {
        return this.ehpcVersion;
    }

    /**
     * @return hybridClusterOpMode
     */
    public String getHybridClusterOpMode() {
        return this.hybridClusterOpMode;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * @return jobQueue
     */
    public String getJobQueue() {
        return this.jobQueue;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return multiOs
     */
    public Boolean getMultiOs() {
        return this.multiOs;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nodes
     */
    public java.util.List < Nodes> getNodes() {
        return this.nodes;
    }

    /**
     * @return onPremiseVolumeLocalPath
     */
    public String getOnPremiseVolumeLocalPath() {
        return this.onPremiseVolumeLocalPath;
    }

    /**
     * @return onPremiseVolumeMountPoint
     */
    public String getOnPremiseVolumeMountPoint() {
        return this.onPremiseVolumeMountPoint;
    }

    /**
     * @return onPremiseVolumeProtocol
     */
    public String getOnPremiseVolumeProtocol() {
        return this.onPremiseVolumeProtocol;
    }

    /**
     * @return onPremiseVolumeRemotePath
     */
    public String getOnPremiseVolumeRemotePath() {
        return this.onPremiseVolumeRemotePath;
    }

    /**
     * @return openldapPar
     */
    public OpenldapPar getOpenldapPar() {
        return this.openldapPar;
    }

    /**
     * @return osTag
     */
    public String getOsTag() {
        return this.osTag;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return plugin
     */
    public String getPlugin() {
        return this.plugin;
    }

    /**
     * @return postInstallScript
     */
    public java.util.List < PostInstallScript> getPostInstallScript() {
        return this.postInstallScript;
    }

    /**
     * @return remoteDirectory
     */
    public String getRemoteDirectory() {
        return this.remoteDirectory;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return schedulerPreInstall
     */
    public Boolean getSchedulerPreInstall() {
        return this.schedulerPreInstall;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return volumeId
     */
    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * @return volumeMountpoint
     */
    public String getVolumeMountpoint() {
        return this.volumeMountpoint;
    }

    /**
     * @return volumeProtocol
     */
    public String getVolumeProtocol() {
        return this.volumeProtocol;
    }

    /**
     * @return volumeType
     */
    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return winAdPar
     */
    public WinAdPar getWinAdPar() {
        return this.winAdPar;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateHybridClusterRequest, Builder> {
        private EcsOrder ecsOrder; 
        private java.util.List < Application> application; 
        private String clientToken; 
        private String clientVersion; 
        private Float computeSpotPriceLimit; 
        private String computeSpotStrategy; 
        private String description; 
        private String domain; 
        private String ehpcVersion; 
        private String hybridClusterOpMode; 
        private String imageId; 
        private String imageOwnerAlias; 
        private String jobQueue; 
        private String keyPairName; 
        private String location; 
        private Boolean multiOs; 
        private String name; 
        private java.util.List < Nodes> nodes; 
        private String onPremiseVolumeLocalPath; 
        private String onPremiseVolumeMountPoint; 
        private String onPremiseVolumeProtocol; 
        private String onPremiseVolumeRemotePath; 
        private OpenldapPar openldapPar; 
        private String osTag; 
        private String password; 
        private String plugin; 
        private java.util.List < PostInstallScript> postInstallScript; 
        private String remoteDirectory; 
        private String resourceGroupId; 
        private Boolean schedulerPreInstall; 
        private String securityGroupId; 
        private String securityGroupName; 
        private String vSwitchId; 
        private String volumeId; 
        private String volumeMountpoint; 
        private String volumeProtocol; 
        private String volumeType; 
        private String vpcId; 
        private WinAdPar winAdPar; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateHybridClusterRequest request) {
            super(request);
            this.ecsOrder = request.ecsOrder;
            this.application = request.application;
            this.clientToken = request.clientToken;
            this.clientVersion = request.clientVersion;
            this.computeSpotPriceLimit = request.computeSpotPriceLimit;
            this.computeSpotStrategy = request.computeSpotStrategy;
            this.description = request.description;
            this.domain = request.domain;
            this.ehpcVersion = request.ehpcVersion;
            this.hybridClusterOpMode = request.hybridClusterOpMode;
            this.imageId = request.imageId;
            this.imageOwnerAlias = request.imageOwnerAlias;
            this.jobQueue = request.jobQueue;
            this.keyPairName = request.keyPairName;
            this.location = request.location;
            this.multiOs = request.multiOs;
            this.name = request.name;
            this.nodes = request.nodes;
            this.onPremiseVolumeLocalPath = request.onPremiseVolumeLocalPath;
            this.onPremiseVolumeMountPoint = request.onPremiseVolumeMountPoint;
            this.onPremiseVolumeProtocol = request.onPremiseVolumeProtocol;
            this.onPremiseVolumeRemotePath = request.onPremiseVolumeRemotePath;
            this.openldapPar = request.openldapPar;
            this.osTag = request.osTag;
            this.password = request.password;
            this.plugin = request.plugin;
            this.postInstallScript = request.postInstallScript;
            this.remoteDirectory = request.remoteDirectory;
            this.resourceGroupId = request.resourceGroupId;
            this.schedulerPreInstall = request.schedulerPreInstall;
            this.securityGroupId = request.securityGroupId;
            this.securityGroupName = request.securityGroupName;
            this.vSwitchId = request.vSwitchId;
            this.volumeId = request.volumeId;
            this.volumeMountpoint = request.volumeMountpoint;
            this.volumeProtocol = request.volumeProtocol;
            this.volumeType = request.volumeType;
            this.vpcId = request.vpcId;
            this.winAdPar = request.winAdPar;
            this.zoneId = request.zoneId;
        } 

        /**
         * EcsOrder.
         */
        public Builder ecsOrder(EcsOrder ecsOrder) {
            this.putQueryParameter("EcsOrder", ecsOrder);
            this.ecsOrder = ecsOrder;
            return this;
        }

        /**
         * An array that consists of the information about the software.
         */
        public Builder application(java.util.List < Application> application) {
            this.putQueryParameter("Application", application);
            this.application = application;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence of a request?](~~25693~~)
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The version of the client. By default, the latest version is used.
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * The maximum hourly price for the ECS instance under the compute node. A maximum of three decimal places can be used in the value of the parameter. The parameter is valid only when the ComputeSpotStrategy parameter is set to SpotWithPriceLimit.
         */
        public Builder computeSpotPriceLimit(Float computeSpotPriceLimit) {
            this.putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit);
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }

        /**
         * The preemption policy of the compute nodes. Valid values:
         * <p>
         * 
         * *   NoSpot: The compute nodes are pay-as-you-go instances.
         * *   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.
         * *   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.
         * 
         * Default value: NoSpot.
         */
        public Builder computeSpotStrategy(String computeSpotStrategy) {
            this.putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
            this.computeSpotStrategy = computeSpotStrategy;
            return this;
        }

        /**
         * The description of the E-HPC cluster. The description must be 2 to 256 characters in length and cannot start with [http:// or https://](http://https://。).
         * <p>
         * 
         * This parameter is empty by default.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The type of the domain account service. Valid values:
         * <p>
         * 
         * *   nis
         * *   ldap
         * 
         * Default value: nis.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The version of E-HPC. By default, the latest version is used.
         */
        public Builder ehpcVersion(String ehpcVersion) {
            this.putQueryParameter("EhpcVersion", ehpcVersion);
            this.ehpcVersion = ehpcVersion;
            return this;
        }

        /**
         * The mode in which the proxy node manages the offline nodes. Valid values:
         * <p>
         * 
         * *   SSH: indicates management via SSH logon.
         * *   CA: indicates management through Cloud Assistant.
         */
        public Builder hybridClusterOpMode(String hybridClusterOpMode) {
            this.putQueryParameter("HybridClusterOpMode", hybridClusterOpMode);
            this.hybridClusterOpMode = hybridClusterOpMode;
            return this;
        }

        /**
         * The IDs of the images.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The type of the image. Valid values:
         * <p>
         * 
         * *   system: public image
         * *   self: custom image
         * *   others: shared image
         * *   marketplace: Alibaba Cloud Marketplace image
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * The default queue of the scale-out nodes.
         */
        public Builder jobQueue(String jobQueue) {
            this.putQueryParameter("JobQueue", jobQueue);
            this.jobQueue = jobQueue;
            return this;
        }

        /**
         * The name of the key pair. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter and cannot start with http:// or https://.[](http://https://。、（:）、（\_）（-）。)
         * <p>
         * 
         * > To use an SSH key pair, see [Create an SSH key pair](~~51793~~).
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * The location where the cluster resides. Set the value to OnPremise.
         */
        public Builder location(String location) {
            this.putQueryParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * Specifies whether the cluster supports multiple operating systems. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         */
        public Builder multiOs(Boolean multiOs) {
            this.putQueryParameter("MultiOs", multiOs);
            this.multiOs = multiOs;
            return this;
        }

        /**
         * The name of the cluster. The name must be 2 to 64 characters in length, and can contain only letters, digits, hyphens (-), and underscores (\_). It must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The information about the nodes in the local cluster.
         */
        public Builder nodes(java.util.List < Nodes> nodes) {
            this.putQueryParameter("Nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        /**
         * The path in which the on-premises file system is mounted on the nodes on the cloud.
         */
        public Builder onPremiseVolumeLocalPath(String onPremiseVolumeLocalPath) {
            this.putQueryParameter("OnPremiseVolumeLocalPath", onPremiseVolumeLocalPath);
            this.onPremiseVolumeLocalPath = onPremiseVolumeLocalPath;
            return this;
        }

        /**
         * The mount target of the on-premises file system.
         */
        public Builder onPremiseVolumeMountPoint(String onPremiseVolumeMountPoint) {
            this.putQueryParameter("OnPremiseVolumeMountPoint", onPremiseVolumeMountPoint);
            this.onPremiseVolumeMountPoint = onPremiseVolumeMountPoint;
            return this;
        }

        /**
         * The type of the protocol that is used by the on-premises file system. Only NFS is supported.
         */
        public Builder onPremiseVolumeProtocol(String onPremiseVolumeProtocol) {
            this.putQueryParameter("OnPremiseVolumeProtocol", onPremiseVolumeProtocol);
            this.onPremiseVolumeProtocol = onPremiseVolumeProtocol;
            return this;
        }

        /**
         * The mount path of the on-premises file system.
         */
        public Builder onPremiseVolumeRemotePath(String onPremiseVolumeRemotePath) {
            this.putQueryParameter("OnPremiseVolumeRemotePath", onPremiseVolumeRemotePath);
            this.onPremiseVolumeRemotePath = onPremiseVolumeRemotePath;
            return this;
        }

        /**
         * The parameter that is used to connect to the OpenLDAP server.
         */
        public Builder openldapPar(OpenldapPar openldapPar) {
            this.putQueryParameter("OpenldapPar", openldapPar);
            this.openldapPar = openldapPar;
            return this;
        }

        /**
         * The image tag of the operating system. You can call the [ListImages](~~87213~~) operation to query the image tag.
         */
        public Builder osTag(String osTag) {
            this.putQueryParameter("OsTag", osTag);
            this.osTag = osTag;
            return this;
        }

        /**
         * The root password of the logon node. The password must be 8 to 30 characters in length and contain at least three of the following items: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported: `() ~ ! @ # $ % ^ & * - = + | { } [ ] : ; ‘ < > , . ? /`
         * <p>
         * 
         * > We recommend that you use HTTPS to call the API operation to prevent password leakage.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The mode configurations of the plug-in. This parameter takes effect only when the SchedulerType parameter is set to custom.
         * <p>
         * 
         * The value must be a JSON string. The parameter contains the following parameters: pluginMod, pluginLocalPath, and pluginOssPath.
         * 
         * *   pluginMod: the mode of the plug-in. The following modes are supported:
         * 
         *     *   oss: The plug-in is downloaded and decompressed from OSS to a local path. The local path is specified by the pluginLocalPath parameter.
         *     *   image: By default, the plug-in is stored in a pre-defined local path. The local path is specified by the pluginLocalPath parameter.
         * 
         * *   pluginLocalPath: the local path where the plug-in is stored. We recommend that you select a shared directory in oss mode and a non-shared directory in image mode.
         * 
         * *   pluginOssPath: the remote path where the plug-in is stored in OSS. This parameter takes effect only when the pluginMod parameter is set to oss.
         */
        public Builder plugin(String plugin) {
            this.putQueryParameter("Plugin", plugin);
            this.plugin = plugin;
            return this;
        }

        /**
         * The list of post-installation script information.
         */
        public Builder postInstallScript(java.util.List < PostInstallScript> postInstallScript) {
            this.putQueryParameter("PostInstallScript", postInstallScript);
            this.postInstallScript = postInstallScript;
            return this;
        }

        /**
         * The remote directory to which the file system is mounted.
         */
        public Builder remoteDirectory(String remoteDirectory) {
            this.putQueryParameter("RemoteDirectory", remoteDirectory);
            this.remoteDirectory = remoteDirectory;
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
         * Specifies whether the scheduler is preinstalled for the image. Valid values:
         * <p>
         * 
         * *   true: The scheduler is preinstalled. When you create or add a node, you do not need to install the scheduler.
         * *   false: The scheduler is not preinstalled. When you create or add a cluster, you must install the scheduler.
         */
        public Builder schedulerPreInstall(Boolean schedulerPreInstall) {
            this.putQueryParameter("SchedulerPreInstall", schedulerPreInstall);
            this.schedulerPreInstall = schedulerPreInstall;
            return this;
        }

        /**
         * You can select an existing security group by its ID.
         * <p>
         * 
         * **
         * 
         * **If you specify this parameter, you cannot specify the **SecurityGroupName`  parameter. `
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * If you do not use an existing security group, set the parameter to the name of a new security group. A default policy is applied to the new security group.
         * <p>
         * 
         * > If you specify this parameter, you cannot specify the `SecurityGroupId` parameter.
         */
        public Builder securityGroupName(String securityGroupName) {
            this.putQueryParameter("SecurityGroupName", securityGroupName);
            this.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * The ID of the vSwitch to which the instance connects to.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the file system. NAS file systems cannot be automatically created.
         */
        public Builder volumeId(String volumeId) {
            this.putQueryParameter("VolumeId", volumeId);
            this.volumeId = volumeId;
            return this;
        }

        /**
         * The mount target of the NAS file system. The mount target is of the VPC type. Mount targets cannot be automatically created for NAS file systems.
         */
        public Builder volumeMountpoint(String volumeMountpoint) {
            this.putQueryParameter("VolumeMountpoint", volumeMountpoint);
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }

        /**
         * The type of the protocol that is used by the NAS file system. Only NFS is supported.
         */
        public Builder volumeProtocol(String volumeProtocol) {
            this.putQueryParameter("VolumeProtocol", volumeProtocol);
            this.volumeProtocol = volumeProtocol;
            return this;
        }

        /**
         * The type of the file system. Only NAS file systems are supported.
         */
        public Builder volumeType(String volumeType) {
            this.putQueryParameter("VolumeType", volumeType);
            this.volumeType = volumeType;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) to which the E-HPC cluster belongs.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The parameter that is used to connect to the Windows AD server.
         */
        public Builder winAdPar(WinAdPar winAdPar) {
            this.putQueryParameter("WinAdPar", winAdPar);
            this.winAdPar = winAdPar;
            return this;
        }

        /**
         * The ID of the zone.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateHybridClusterRequest build() {
            return new CreateHybridClusterRequest(this);
        } 

    } 

    public static class Compute extends TeaModel {
        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        private Compute(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Compute create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceType; 

            /**
             * The instance type of the compute nodes.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public Compute build() {
                return new Compute(this);
            } 

        } 

    }
    public static class Manager extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        private Manager(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Manager create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceType; 

            /**
             * The instance type of the management node. Only Proxy Mode is supported.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public Manager build() {
                return new Manager(this);
            } 

        } 

    }
    public static class EcsOrder extends TeaModel {
        @NameInMap("Compute")
        @Validation(required = true)
        private Compute compute;

        @NameInMap("Manager")
        @Validation(required = true)
        private Manager manager;

        private EcsOrder(Builder builder) {
            this.compute = builder.compute;
            this.manager = builder.manager;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsOrder create() {
            return builder().build();
        }

        /**
         * @return compute
         */
        public Compute getCompute() {
            return this.compute;
        }

        /**
         * @return manager
         */
        public Manager getManager() {
            return this.manager;
        }

        public static final class Builder {
            private Compute compute; 
            private Manager manager; 

            /**
             * Compute.
             */
            public Builder compute(Compute compute) {
                this.compute = compute;
                return this;
            }

            /**
             * Manager.
             */
            public Builder manager(Manager manager) {
                this.manager = manager;
                return this;
            }

            public EcsOrder build() {
                return new EcsOrder(this);
            } 

        } 

    }
    public static class Application extends TeaModel {
        @NameInMap("Tag")
        private String tag;

        private Application(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String tag; 

            /**
             * The tag of the software.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
    public static class Nodes extends TeaModel {
        @NameInMap("AccountType")
        private String accountType;

        @NameInMap("Dir")
        private String dir;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("Role")
        private String role;

        @NameInMap("SchedulerType")
        private String schedulerType;

        private Nodes(Builder builder) {
            this.accountType = builder.accountType;
            this.dir = builder.dir;
            this.hostName = builder.hostName;
            this.ipAddress = builder.ipAddress;
            this.role = builder.role;
            this.schedulerType = builder.schedulerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return dir
         */
        public String getDir() {
            return this.dir;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return schedulerType
         */
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public static final class Builder {
            private String accountType; 
            private String dir; 
            private String hostName; 
            private String ipAddress; 
            private String role; 
            private String schedulerType; 

            /**
             * The service type of the domain account to which the on-premises node in the cluster belongs. Valid values:
             * <p>
             * 
             * *   nis
             * *   ldap
             * 
             * Default value: nis.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * The directory of the on-premises node in the cluster.
             */
            public Builder dir(String dir) {
                this.dir = dir;
                return this;
            }

            /**
             * The hostname of the on-premises node in the cluster.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The IP address of the on-premises node in the cluster.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The role of the on-premises node in the cluster. Valid values:
             * <p>
             * 
             * *   Manager: management node
             * *   Login: logon node
             * *   Compute: compute node
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The scheduler type of the on-premises node in the cluster. Valid values:
             * <p>
             * 
             * *   pbs
             * *   slurm
             * *   opengridscheduler
             * *   deadline
             * 
             * Default value: pbs.
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class OpenldapPar extends TeaModel {
        @NameInMap("BaseDn")
        private String baseDn;

        @NameInMap("FallbackHomeDir")
        private String fallbackHomeDir;

        @NameInMap("LdapServerIp")
        private String ldapServerIp;

        private OpenldapPar(Builder builder) {
            this.baseDn = builder.baseDn;
            this.fallbackHomeDir = builder.fallbackHomeDir;
            this.ldapServerIp = builder.ldapServerIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenldapPar create() {
            return builder().build();
        }

        /**
         * @return baseDn
         */
        public String getBaseDn() {
            return this.baseDn;
        }

        /**
         * @return fallbackHomeDir
         */
        public String getFallbackHomeDir() {
            return this.fallbackHomeDir;
        }

        /**
         * @return ldapServerIp
         */
        public String getLdapServerIp() {
            return this.ldapServerIp;
        }

        public static final class Builder {
            private String baseDn; 
            private String fallbackHomeDir; 
            private String ldapServerIp; 

            /**
             * The BaseDN of the LDAP server.
             */
            public Builder baseDn(String baseDn) {
                this.baseDn = baseDn;
                return this;
            }

            /**
             * The home directory of the Linux server.
             */
            public Builder fallbackHomeDir(String fallbackHomeDir) {
                this.fallbackHomeDir = fallbackHomeDir;
                return this;
            }

            /**
             * The IP address of the LDAP server.
             */
            public Builder ldapServerIp(String ldapServerIp) {
                this.ldapServerIp = ldapServerIp;
                return this;
            }

            public OpenldapPar build() {
                return new OpenldapPar(this);
            } 

        } 

    }
    public static class PostInstallScript extends TeaModel {
        @NameInMap("Args")
        private String args;

        @NameInMap("Url")
        private String url;

        private PostInstallScript(Builder builder) {
            this.args = builder.args;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostInstallScript create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public String getArgs() {
            return this.args;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String args; 
            private String url; 

            /**
             * The parameter that is used to run the script after the cluster is created.
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * The full path of the post-installation script.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public PostInstallScript build() {
                return new PostInstallScript(this);
            } 

        } 

    }
    public static class WinAdPar extends TeaModel {
        @NameInMap("AdDc")
        private String adDc;

        @NameInMap("AdIp")
        private String adIp;

        @NameInMap("AdUser")
        private String adUser;

        @NameInMap("AdUserPasswd")
        private String adUserPasswd;

        private WinAdPar(Builder builder) {
            this.adDc = builder.adDc;
            this.adIp = builder.adIp;
            this.adUser = builder.adUser;
            this.adUserPasswd = builder.adUserPasswd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WinAdPar create() {
            return builder().build();
        }

        /**
         * @return adDc
         */
        public String getAdDc() {
            return this.adDc;
        }

        /**
         * @return adIp
         */
        public String getAdIp() {
            return this.adIp;
        }

        /**
         * @return adUser
         */
        public String getAdUser() {
            return this.adUser;
        }

        /**
         * @return adUserPasswd
         */
        public String getAdUserPasswd() {
            return this.adUserPasswd;
        }

        public static final class Builder {
            private String adDc; 
            private String adIp; 
            private String adUser; 
            private String adUserPasswd; 

            /**
             * The name of the AD domain.
             */
            public Builder adDc(String adDc) {
                this.adDc = adDc;
                return this;
            }

            /**
             * The IP address of the AD domain.
             */
            public Builder adIp(String adIp) {
                this.adIp = adIp;
                return this;
            }

            /**
             * The AD user.
             */
            public Builder adUser(String adUser) {
                this.adUser = adUser;
                return this;
            }

            /**
             * The password of the AD user.
             */
            public Builder adUserPasswd(String adUserPasswd) {
                this.adUserPasswd = adUserPasswd;
                return this;
            }

            public WinAdPar build() {
                return new WinAdPar(this);
            } 

        } 

    }
}
