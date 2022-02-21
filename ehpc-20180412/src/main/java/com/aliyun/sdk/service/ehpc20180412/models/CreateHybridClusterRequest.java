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
    @NameInMap("OsTag")
    @Validation(required = true)
    private String osTag;

    @Query
    @NameInMap("Password")
    private String password;

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
        this.osTag = builder.osTag;
        this.password = builder.password;
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
        private String osTag; 
        private String password; 
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
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateHybridClusterRequest response) {
            super(response);
            this.ecsOrder = response.ecsOrder;
            this.application = response.application;
            this.clientToken = response.clientToken;
            this.clientVersion = response.clientVersion;
            this.computeSpotPriceLimit = response.computeSpotPriceLimit;
            this.computeSpotStrategy = response.computeSpotStrategy;
            this.description = response.description;
            this.domain = response.domain;
            this.ehpcVersion = response.ehpcVersion;
            this.imageId = response.imageId;
            this.imageOwnerAlias = response.imageOwnerAlias;
            this.jobQueue = response.jobQueue;
            this.keyPairName = response.keyPairName;
            this.location = response.location;
            this.multiOs = response.multiOs;
            this.name = response.name;
            this.nodes = response.nodes;
            this.onPremiseVolumeLocalPath = response.onPremiseVolumeLocalPath;
            this.onPremiseVolumeMountPoint = response.onPremiseVolumeMountPoint;
            this.onPremiseVolumeProtocol = response.onPremiseVolumeProtocol;
            this.onPremiseVolumeRemotePath = response.onPremiseVolumeRemotePath;
            this.osTag = response.osTag;
            this.password = response.password;
            this.postInstallScript = response.postInstallScript;
            this.remoteDirectory = response.remoteDirectory;
            this.resourceGroupId = response.resourceGroupId;
            this.schedulerPreInstall = response.schedulerPreInstall;
            this.securityGroupId = response.securityGroupId;
            this.securityGroupName = response.securityGroupName;
            this.vSwitchId = response.vSwitchId;
            this.volumeId = response.volumeId;
            this.volumeMountpoint = response.volumeMountpoint;
            this.volumeProtocol = response.volumeProtocol;
            this.volumeType = response.volumeType;
            this.vpcId = response.vpcId;
            this.zoneId = response.zoneId;
        } 

        /**
         * EcsOrder.
         */
        public Builder ecsOrder(EcsOrder ecsOrder) {
            this.ecsOrder = ecsOrder;
            return this;
        }

        /**
         * Application.
         */
        public Builder application(java.util.List < Application> application) {
            this.putQueryParameter("Application", application);
            this.application = application;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ClientVersion.
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * ComputeSpotPriceLimit.
         */
        public Builder computeSpotPriceLimit(Float computeSpotPriceLimit) {
            this.putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit);
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }

        /**
         * ComputeSpotStrategy.
         */
        public Builder computeSpotStrategy(String computeSpotStrategy) {
            this.putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
            this.computeSpotStrategy = computeSpotStrategy;
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
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * EhpcVersion.
         */
        public Builder ehpcVersion(String ehpcVersion) {
            this.putQueryParameter("EhpcVersion", ehpcVersion);
            this.ehpcVersion = ehpcVersion;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * ImageOwnerAlias.
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * JobQueue.
         */
        public Builder jobQueue(String jobQueue) {
            this.putQueryParameter("JobQueue", jobQueue);
            this.jobQueue = jobQueue;
            return this;
        }

        /**
         * KeyPairName.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putQueryParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * MultiOs.
         */
        public Builder multiOs(Boolean multiOs) {
            this.putQueryParameter("MultiOs", multiOs);
            this.multiOs = multiOs;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Nodes.
         */
        public Builder nodes(java.util.List < Nodes> nodes) {
            this.putQueryParameter("Nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        /**
         * OnPremiseVolumeLocalPath.
         */
        public Builder onPremiseVolumeLocalPath(String onPremiseVolumeLocalPath) {
            this.putQueryParameter("OnPremiseVolumeLocalPath", onPremiseVolumeLocalPath);
            this.onPremiseVolumeLocalPath = onPremiseVolumeLocalPath;
            return this;
        }

        /**
         * OnPremiseVolumeMountPoint.
         */
        public Builder onPremiseVolumeMountPoint(String onPremiseVolumeMountPoint) {
            this.putQueryParameter("OnPremiseVolumeMountPoint", onPremiseVolumeMountPoint);
            this.onPremiseVolumeMountPoint = onPremiseVolumeMountPoint;
            return this;
        }

        /**
         * OnPremiseVolumeProtocol.
         */
        public Builder onPremiseVolumeProtocol(String onPremiseVolumeProtocol) {
            this.putQueryParameter("OnPremiseVolumeProtocol", onPremiseVolumeProtocol);
            this.onPremiseVolumeProtocol = onPremiseVolumeProtocol;
            return this;
        }

        /**
         * OnPremiseVolumeRemotePath.
         */
        public Builder onPremiseVolumeRemotePath(String onPremiseVolumeRemotePath) {
            this.putQueryParameter("OnPremiseVolumeRemotePath", onPremiseVolumeRemotePath);
            this.onPremiseVolumeRemotePath = onPremiseVolumeRemotePath;
            return this;
        }

        /**
         * OsTag.
         */
        public Builder osTag(String osTag) {
            this.putQueryParameter("OsTag", osTag);
            this.osTag = osTag;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * PostInstallScript.
         */
        public Builder postInstallScript(java.util.List < PostInstallScript> postInstallScript) {
            this.putQueryParameter("PostInstallScript", postInstallScript);
            this.postInstallScript = postInstallScript;
            return this;
        }

        /**
         * RemoteDirectory.
         */
        public Builder remoteDirectory(String remoteDirectory) {
            this.putQueryParameter("RemoteDirectory", remoteDirectory);
            this.remoteDirectory = remoteDirectory;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SchedulerPreInstall.
         */
        public Builder schedulerPreInstall(Boolean schedulerPreInstall) {
            this.putQueryParameter("SchedulerPreInstall", schedulerPreInstall);
            this.schedulerPreInstall = schedulerPreInstall;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * SecurityGroupName.
         */
        public Builder securityGroupName(String securityGroupName) {
            this.putQueryParameter("SecurityGroupName", securityGroupName);
            this.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VolumeId.
         */
        public Builder volumeId(String volumeId) {
            this.putQueryParameter("VolumeId", volumeId);
            this.volumeId = volumeId;
            return this;
        }

        /**
         * VolumeMountpoint.
         */
        public Builder volumeMountpoint(String volumeMountpoint) {
            this.putQueryParameter("VolumeMountpoint", volumeMountpoint);
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }

        /**
         * VolumeProtocol.
         */
        public Builder volumeProtocol(String volumeProtocol) {
            this.putQueryParameter("VolumeProtocol", volumeProtocol);
            this.volumeProtocol = volumeProtocol;
            return this;
        }

        /**
         * VolumeType.
         */
        public Builder volumeType(String volumeType) {
            this.putQueryParameter("VolumeType", volumeType);
            this.volumeType = volumeType;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * ZoneId.
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
             * InstanceType.
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
    public static class EcsOrder extends TeaModel {
        @NameInMap("Compute")
        @Validation(required = true)
        private Compute compute;

        private EcsOrder(Builder builder) {
            this.compute = builder.compute;
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

        public static final class Builder {
            private Compute compute; 

            /**
             * Compute.
             */
            public Builder compute(Compute compute) {
                this.compute = compute;
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
             * Tag.
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
            private String hostName; 
            private String ipAddress; 
            private String role; 
            private String schedulerType; 

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * SchedulerType.
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
             * Args.
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * Url.
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
}
