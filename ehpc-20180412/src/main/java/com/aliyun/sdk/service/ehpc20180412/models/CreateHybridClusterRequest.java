// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link CreateHybridClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateHybridClusterRequest</p>
 */
public class CreateHybridClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsOrder")
    private EcsOrder ecsOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Application")
    private java.util.List<Application> application;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeSpotPriceLimit")
    private Float computeSpotPriceLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeSpotStrategy")
    private String computeSpotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EhpcVersion")
    private String ehpcVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HybridClusterOpMode")
    private String hybridClusterOpMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobQueue")
    private String jobQueue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiOs")
    private Boolean multiOs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<Nodes> nodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnPremiseVolumeLocalPath")
    private String onPremiseVolumeLocalPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnPremiseVolumeMountPoint")
    private String onPremiseVolumeMountPoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnPremiseVolumeProtocol")
    private String onPremiseVolumeProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnPremiseVolumeRemotePath")
    private String onPremiseVolumeRemotePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpenldapPar")
    private OpenldapPar openldapPar;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String osTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Plugin")
    private String plugin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostInstallScript")
    private java.util.List<PostInstallScript> postInstallScript;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoteDirectory")
    private String remoteDirectory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchedulerPreInstall")
    private Boolean schedulerPreInstall;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
    private String securityGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeId")
    private String volumeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeMountpoint")
    private String volumeMountpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeProtocol")
    private String volumeProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeType")
    private String volumeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WinAdPar")
    private WinAdPar winAdPar;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
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
    public java.util.List<Application> getApplication() {
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
    public java.util.List<Nodes> getNodes() {
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
    public java.util.List<PostInstallScript> getPostInstallScript() {
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
        private java.util.List<Application> application; 
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
        private java.util.List<Nodes> nodes; 
        private String onPremiseVolumeLocalPath; 
        private String onPremiseVolumeMountPoint; 
        private String onPremiseVolumeProtocol; 
        private String onPremiseVolumeRemotePath; 
        private OpenldapPar openldapPar; 
        private String osTag; 
        private String password; 
        private String plugin; 
        private java.util.List<PostInstallScript> postInstallScript; 
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
         * <p>An array that consists of the information about the software.</p>
         */
        public Builder application(java.util.List<Application> application) {
            this.putQueryParameter("Application", application);
            this.application = application;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence of a request?</a></p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The version of the client. By default, the latest version is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.64</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * <p>The maximum hourly price for the ECS instance under the compute node. A maximum of three decimal places can be used in the value of the parameter. The parameter is valid only when the ComputeSpotStrategy parameter is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.034</p>
         */
        public Builder computeSpotPriceLimit(Float computeSpotPriceLimit) {
            this.putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit);
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }

        /**
         * <p>The preemption policy of the compute nodes. Valid values:</p>
         * <ul>
         * <li>NoSpot: The compute nodes are pay-as-you-go instances.</li>
         * <li>SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.</li>
         * </ul>
         * <p>Default value: NoSpot.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        public Builder computeSpotStrategy(String computeSpotStrategy) {
            this.putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
            this.computeSpotStrategy = computeSpotStrategy;
            return this;
        }

        /**
         * <p>The description of the E-HPC cluster. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or<code> https://</code>.</p>
         * <p>This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The type of the domain account service. Valid values:</p>
         * <ul>
         * <li>nis</li>
         * <li>ldap</li>
         * </ul>
         * <p>Default value: nis.</p>
         * 
         * <strong>example:</strong>
         * <p>nis</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The version of E-HPC. By default, the latest version is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder ehpcVersion(String ehpcVersion) {
            this.putQueryParameter("EhpcVersion", ehpcVersion);
            this.ehpcVersion = ehpcVersion;
            return this;
        }

        /**
         * <p>The mode in which the proxy node manages the offline nodes. Valid values:</p>
         * <ul>
         * <li>SSH: indicates management via SSH logon.</li>
         * <li>CA: indicates management through Cloud Assistant.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SSH</p>
         */
        public Builder hybridClusterOpMode(String hybridClusterOpMode) {
            this.putQueryParameter("HybridClusterOpMode", hybridClusterOpMode);
            this.hybridClusterOpMode = hybridClusterOpMode;
            return this;
        }

        /**
         * <p>The IDs of the images.</p>
         * 
         * <strong>example:</strong>
         * <p>wi_1607_x64_dtc_zh_40G_alibase****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The type of the image. Valid values:</p>
         * <ul>
         * <li>system: public image</li>
         * <li>self: custom image</li>
         * <li>others: shared image</li>
         * <li>marketplace: Alibaba Cloud Marketplace image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * <p>The default queue of the scale-out nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>workq</p>
         */
        public Builder jobQueue(String jobQueue) {
            this.putQueryParameter("JobQueue", jobQueue);
            this.jobQueue = jobQueue;
            return this;
        }

        /**
         * <p>The name of the key pair. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with http:// or https://.<a href="http://https://%E3%80%82%E3%80%81%EF%BC%88:%EF%BC%89%E3%80%81%EF%BC%88_%EF%BC%89%EF%BC%88-%EF%BC%89%E3%80%82"></a></p>
         * <blockquote>
         * <p>To use an SSH key pair, see <a href="https://help.aliyun.com/document_detail/51793.html">Create an SSH key pair</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The location where the cluster resides. Set the value to OnPremise.</p>
         * 
         * <strong>example:</strong>
         * <p>OnPremise</p>
         */
        public Builder location(String location) {
            this.putQueryParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * <p>Specifies whether the cluster supports multiple operating systems. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder multiOs(Boolean multiOs) {
            this.putQueryParameter("MultiOs", multiOs);
            this.multiOs = multiOs;
            return this;
        }

        /**
         * <p>The name of the cluster. The name must be 2 to 64 characters in length, and can contain only letters, digits, hyphens (-), and underscores (_). It must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hybridcluster</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The information about the nodes in the local cluster.</p>
         */
        public Builder nodes(java.util.List<Nodes> nodes) {
            this.putQueryParameter("Nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>The path in which the on-premises file system is mounted on the nodes on the cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>/OnCloudDirectory</p>
         */
        public Builder onPremiseVolumeLocalPath(String onPremiseVolumeLocalPath) {
            this.putQueryParameter("OnPremiseVolumeLocalPath", onPremiseVolumeLocalPath);
            this.onPremiseVolumeLocalPath = onPremiseVolumeLocalPath;
            return this;
        }

        /**
         * <p>The mount target of the on-premises file system.</p>
         * 
         * <strong>example:</strong>
         * <p>RemoteNasDomain.com</p>
         */
        public Builder onPremiseVolumeMountPoint(String onPremiseVolumeMountPoint) {
            this.putQueryParameter("OnPremiseVolumeMountPoint", onPremiseVolumeMountPoint);
            this.onPremiseVolumeMountPoint = onPremiseVolumeMountPoint;
            return this;
        }

        /**
         * <p>The type of the protocol that is used by the on-premises file system. Only NFS is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        public Builder onPremiseVolumeProtocol(String onPremiseVolumeProtocol) {
            this.putQueryParameter("OnPremiseVolumeProtocol", onPremiseVolumeProtocol);
            this.onPremiseVolumeProtocol = onPremiseVolumeProtocol;
            return this;
        }

        /**
         * <p>The mount path of the on-premises file system.</p>
         * 
         * <strong>example:</strong>
         * <p>/RemoteDirectory</p>
         */
        public Builder onPremiseVolumeRemotePath(String onPremiseVolumeRemotePath) {
            this.putQueryParameter("OnPremiseVolumeRemotePath", onPremiseVolumeRemotePath);
            this.onPremiseVolumeRemotePath = onPremiseVolumeRemotePath;
            return this;
        }

        /**
         * <p>The parameter that is used to connect to the OpenLDAP server.</p>
         */
        public Builder openldapPar(OpenldapPar openldapPar) {
            this.putQueryParameter("OpenldapPar", openldapPar);
            this.openldapPar = openldapPar;
            return this;
        }

        /**
         * <p>The image tag of the operating system. You can call the <a href="https://help.aliyun.com/document_detail/87213.html">ListImages</a> operation to query the image tag.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_7.2_64</p>
         */
        public Builder osTag(String osTag) {
            this.putQueryParameter("OsTag", osTag);
            this.osTag = osTag;
            return this;
        }

        /**
         * <p>The root password of the logon node. The password must be 8 to 30 characters in length and contain at least three of the following items: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported: <code>() ~ ! @ # $ % ^ &amp; * - = + | { } [ ] : ; ‘ &lt; &gt; , . ? /</code></p>
         * <blockquote>
         * <p>We recommend that you use HTTPS to call the API operation to prevent password leakage.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123****</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The mode configurations of the plug-in. This parameter takes effect only when the SchedulerType parameter is set to custom.</p>
         * <p>The value must be a JSON string. The parameter contains the following parameters: pluginMod, pluginLocalPath, and pluginOssPath.</p>
         * <ul>
         * <li><p>pluginMod: the mode of the plug-in. The following modes are supported:</p>
         * <ul>
         * <li>oss: The plug-in is downloaded and decompressed from OSS to a local path. The local path is specified by the pluginLocalPath parameter.</li>
         * <li>image: By default, the plug-in is stored in a pre-defined local path. The local path is specified by the pluginLocalPath parameter.</li>
         * </ul>
         * </li>
         * <li><p>pluginLocalPath: the local path where the plug-in is stored. We recommend that you select a shared directory in oss mode and a non-shared directory in image mode.</p>
         * </li>
         * <li><p>pluginOssPath: the remote path where the plug-in is stored in OSS. This parameter takes effect only when the pluginMod parameter is set to oss.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pluginMod&quot;: &quot;oss&quot;,&quot;pluginLocalPath&quot;: &quot;/opt/plugin&quot;,&quot;pluginOssPath&quot;: &quot;<a href="https://bucket.oss-cn-hangzhou.aliyuncs.com/plugin/plugin.tgz%22%7D">https://bucket.oss-cn-hangzhou.aliyuncs.com/plugin/plugin.tgz&quot;}</a></p>
         */
        public Builder plugin(String plugin) {
            this.putQueryParameter("Plugin", plugin);
            this.plugin = plugin;
            return this;
        }

        /**
         * <p>The list of post-installation script information.</p>
         */
        public Builder postInstallScript(java.util.List<PostInstallScript> postInstallScript) {
            this.putQueryParameter("PostInstallScript", postInstallScript);
            this.postInstallScript = postInstallScript;
            return this;
        }

        /**
         * <p>The remote directory to which the file system is mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>/RemoteDirectory</p>
         */
        public Builder remoteDirectory(String remoteDirectory) {
            this.putQueryParameter("RemoteDirectory", remoteDirectory);
            this.remoteDirectory = remoteDirectory;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Specifies whether the scheduler is preinstalled for the image. Valid values:</p>
         * <ul>
         * <li>true: The scheduler is preinstalled. When you create or add a node, you do not need to install the scheduler.</li>
         * <li>false: The scheduler is not preinstalled. When you create or add a cluster, you must install the scheduler.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder schedulerPreInstall(Boolean schedulerPreInstall) {
            this.putQueryParameter("SchedulerPreInstall", schedulerPreInstall);
            this.schedulerPreInstall = schedulerPreInstall;
            return this;
        }

        /**
         * <p>You can select an existing security group by its ID.</p>
         * <blockquote>
         * <p>If you specify this parameter, you cannot specify the <code>SecurityGroupName</code>  parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sg-bp13n61xsydodfyg****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>If you do not use an existing security group, set the parameter to the name of a new security group. A default policy is applied to the new security group.</p>
         * <blockquote>
         * <p>If you specify this parameter, you cannot specify the <code>SecurityGroupId</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ehpc-SecurityGroup</p>
         */
        public Builder securityGroupName(String securityGroupName) {
            this.putQueryParameter("SecurityGroupName", securityGroupName);
            this.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the instance connects to.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1lfcjbfb099rrjn****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the file system. NAS file systems cannot be automatically created.</p>
         * 
         * <strong>example:</strong>
         * <p>008b64****</p>
         */
        public Builder volumeId(String volumeId) {
            this.putQueryParameter("VolumeId", volumeId);
            this.volumeId = volumeId;
            return this;
        }

        /**
         * <p>The mount target of the NAS file system. The mount target is of the VPC type. Mount targets cannot be automatically created for NAS file systems.</p>
         * 
         * <strong>example:</strong>
         * <p>008b648bcb-s****.cn-hangzhou.nas.aliyuncs.com</p>
         */
        public Builder volumeMountpoint(String volumeMountpoint) {
            this.putQueryParameter("VolumeMountpoint", volumeMountpoint);
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }

        /**
         * <p>The type of the protocol that is used by the NAS file system. Only NFS is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        public Builder volumeProtocol(String volumeProtocol) {
            this.putQueryParameter("VolumeProtocol", volumeProtocol);
            this.volumeProtocol = volumeProtocol;
            return this;
        }

        /**
         * <p>The type of the file system. Only NAS file systems are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>NAS</p>
         */
        public Builder volumeType(String volumeType) {
            this.putQueryParameter("VolumeType", volumeType);
            this.volumeType = volumeType;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the E-HPC cluster belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-b3f3edefefeep0760yju****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The parameter that is used to connect to the Windows AD server.</p>
         */
        public Builder winAdPar(WinAdPar winAdPar) {
            this.putQueryParameter("WinAdPar", winAdPar);
            this.winAdPar = winAdPar;
            return this;
        }

        /**
         * <p>The ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
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

    /**
     * 
     * {@link CreateHybridClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateHybridClusterRequest</p>
     */
    public static class Compute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(Compute model) {
                this.instanceType = model.instanceType;
            } 

            /**
             * <p>The instance type of the compute nodes.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.n1.tiny</p>
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
    /**
     * 
     * {@link CreateHybridClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateHybridClusterRequest</p>
     */
    public static class Manager extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
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

            private Builder() {
            } 

            private Builder(Manager model) {
                this.instanceType = model.instanceType;
            } 

            /**
             * <p>The instance type of the management node. Only Proxy Mode is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.n1.tiny</p>
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
    /**
     * 
     * {@link CreateHybridClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateHybridClusterRequest</p>
     */
    public static class EcsOrder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Compute")
        @com.aliyun.core.annotation.Validation(required = true)
        private Compute compute;

        @com.aliyun.core.annotation.NameInMap("Manager")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(EcsOrder model) {
                this.compute = model.compute;
                this.manager = model.manager;
            } 

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
    /**
     * 
     * {@link CreateHybridClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateHybridClusterRequest</p>
     */
    public static class Application extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
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

            private Builder() {
            } 

            private Builder(Application model) {
                this.tag = model.tag;
            } 

            /**
             * <p>The tag of the software.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenMPI_11.1</p>
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
    /**
     * 
     * {@link CreateHybridClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateHybridClusterRequest</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("Dir")
        private String dir;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("SchedulerType")
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

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.accountType = model.accountType;
                this.dir = model.dir;
                this.hostName = model.hostName;
                this.ipAddress = model.ipAddress;
                this.role = model.role;
                this.schedulerType = model.schedulerType;
            } 

            /**
             * <p>The service type of the domain account to which the on-premises node in the cluster belongs. Valid values:</p>
             * <ul>
             * <li>nis</li>
             * <li>ldap</li>
             * </ul>
             * <p>Default value: nis.</p>
             * 
             * <strong>example:</strong>
             * <p>nis</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The directory of the on-premises node in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>/opt/sge/default/</p>
             */
            public Builder dir(String dir) {
                this.dir = dir;
                return this;
            }

            /**
             * <p>The hostname of the on-premises node in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The IP address of the on-premises node in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>00b648b****</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The role of the on-premises node in the cluster. Valid values:</p>
             * <ul>
             * <li>Manager: management node</li>
             * <li>Login: logon node</li>
             * <li>Compute: compute node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Compute</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The scheduler type of the on-premises node in the cluster. Valid values:</p>
             * <ul>
             * <li>pbs</li>
             * <li>slurm</li>
             * <li>opengridscheduler</li>
             * <li>deadline</li>
             * </ul>
             * <p>Default value: pbs.</p>
             * 
             * <strong>example:</strong>
             * <p>pbs</p>
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
    /**
     * 
     * {@link CreateHybridClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateHybridClusterRequest</p>
     */
    public static class OpenldapPar extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseDn")
        private String baseDn;

        @com.aliyun.core.annotation.NameInMap("FallbackHomeDir")
        private String fallbackHomeDir;

        @com.aliyun.core.annotation.NameInMap("LdapServerIp")
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

            private Builder() {
            } 

            private Builder(OpenldapPar model) {
                this.baseDn = model.baseDn;
                this.fallbackHomeDir = model.fallbackHomeDir;
                this.ldapServerIp = model.ldapServerIp;
            } 

            /**
             * <p>The BaseDN of the LDAP server.</p>
             * 
             * <strong>example:</strong>
             * <p>ehpctest</p>
             */
            public Builder baseDn(String baseDn) {
                this.baseDn = baseDn;
                return this;
            }

            /**
             * <p>The home directory of the Linux server.</p>
             * 
             * <strong>example:</strong>
             * <p>/home</p>
             */
            public Builder fallbackHomeDir(String fallbackHomeDir) {
                this.fallbackHomeDir = fallbackHomeDir;
                return this;
            }

            /**
             * <p>The IP address of the LDAP server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.2</p>
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
    /**
     * 
     * {@link CreateHybridClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateHybridClusterRequest</p>
     */
    public static class PostInstallScript extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private String args;

        @com.aliyun.core.annotation.NameInMap("Url")
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

            private Builder() {
            } 

            private Builder(PostInstallScript model) {
                this.args = model.args;
                this.url = model.url;
            } 

            /**
             * <p>The parameter that is used to run the script after the cluster is created.</p>
             * 
             * <strong>example:</strong>
             * <p>bash file.sh</p>
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The full path of the post-installation script.</p>
             * 
             * <strong>example:</strong>
             * <p>/opt/job.sh</p>
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
    /**
     * 
     * {@link CreateHybridClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateHybridClusterRequest</p>
     */
    public static class WinAdPar extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdDc")
        private String adDc;

        @com.aliyun.core.annotation.NameInMap("AdIp")
        private String adIp;

        @com.aliyun.core.annotation.NameInMap("AdUser")
        private String adUser;

        @com.aliyun.core.annotation.NameInMap("AdUserPasswd")
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

            private Builder() {
            } 

            private Builder(WinAdPar model) {
                this.adDc = model.adDc;
                this.adIp = model.adIp;
                this.adUser = model.adUser;
                this.adUserPasswd = model.adUserPasswd;
            } 

            /**
             * <p>The name of the AD domain.</p>
             * 
             * <strong>example:</strong>
             * <p>ad-hybrid001.ehpcad.com</p>
             */
            public Builder adDc(String adDc) {
                this.adDc = adDc;
                return this;
            }

            /**
             * <p>The IP address of the AD domain.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.2</p>
             */
            public Builder adIp(String adIp) {
                this.adIp = adIp;
                return this;
            }

            /**
             * <p>The AD user.</p>
             * 
             * <strong>example:</strong>
             * <p>Administrator</p>
             */
            public Builder adUser(String adUser) {
                this.adUser = adUser;
                return this;
            }

            /**
             * <p>The password of the AD user.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
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
