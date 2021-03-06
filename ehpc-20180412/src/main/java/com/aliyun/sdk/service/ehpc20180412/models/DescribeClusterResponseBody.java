// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterResponseBody</p>
 */
public class DescribeClusterResponseBody extends TeaModel {
    @NameInMap("ClusterInfo")
    private ClusterInfo clusterInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeClusterResponseBody(Builder builder) {
        this.clusterInfo = builder.clusterInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterInfo
     */
    public ClusterInfo getClusterInfo() {
        return this.clusterInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClusterInfo clusterInfo; 
        private String requestId; 

        /**
         * ClusterInfo.
         */
        public Builder clusterInfo(ClusterInfo clusterInfo) {
            this.clusterInfo = clusterInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterResponseBody build() {
            return new DescribeClusterResponseBody(this);
        } 

    } 

    public static class ApplicationInfo extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Version")
        private String version;

        private ApplicationInfo(Builder builder) {
            this.name = builder.name;
            this.tag = builder.tag;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationInfo create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private String tag; 
            private String version; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ApplicationInfo build() {
                return new ApplicationInfo(this);
            } 

        } 

    }
    public static class Applications extends TeaModel {
        @NameInMap("ApplicationInfo")
        private java.util.List < ApplicationInfo> applicationInfo;

        private Applications(Builder builder) {
            this.applicationInfo = builder.applicationInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return applicationInfo
         */
        public java.util.List < ApplicationInfo> getApplicationInfo() {
            return this.applicationInfo;
        }

        public static final class Builder {
            private java.util.List < ApplicationInfo> applicationInfo; 

            /**
             * ApplicationInfo.
             */
            public Builder applicationInfo(java.util.List < ApplicationInfo> applicationInfo) {
                this.applicationInfo = applicationInfo;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
    public static class Compute extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("InstanceType")
        private String instanceType;

        private Compute(Builder builder) {
            this.count = builder.count;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Compute create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private Integer count; 
            private String instanceType; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

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
    public static class Login extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("InstanceType")
        private String instanceType;

        private Login(Builder builder) {
            this.count = builder.count;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Login create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private Integer count; 
            private String instanceType; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public Login build() {
                return new Login(this);
            } 

        } 

    }
    public static class Manager extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("InstanceType")
        private String instanceType;

        private Manager(Builder builder) {
            this.count = builder.count;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Manager create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private Integer count; 
            private String instanceType; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * InstanceType.
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
    public static class ProxyMgr extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("InstanceType")
        private String instanceType;

        private ProxyMgr(Builder builder) {
            this.count = builder.count;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyMgr create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private Integer count; 
            private String instanceType; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public ProxyMgr build() {
                return new ProxyMgr(this);
            } 

        } 

    }
    public static class EcsInfo extends TeaModel {
        @NameInMap("Compute")
        private Compute compute;

        @NameInMap("Login")
        private Login login;

        @NameInMap("Manager")
        private Manager manager;

        @NameInMap("ProxyMgr")
        private ProxyMgr proxyMgr;

        private EcsInfo(Builder builder) {
            this.compute = builder.compute;
            this.login = builder.login;
            this.manager = builder.manager;
            this.proxyMgr = builder.proxyMgr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsInfo create() {
            return builder().build();
        }

        /**
         * @return compute
         */
        public Compute getCompute() {
            return this.compute;
        }

        /**
         * @return login
         */
        public Login getLogin() {
            return this.login;
        }

        /**
         * @return manager
         */
        public Manager getManager() {
            return this.manager;
        }

        /**
         * @return proxyMgr
         */
        public ProxyMgr getProxyMgr() {
            return this.proxyMgr;
        }

        public static final class Builder {
            private Compute compute; 
            private Login login; 
            private Manager manager; 
            private ProxyMgr proxyMgr; 

            /**
             * Compute.
             */
            public Builder compute(Compute compute) {
                this.compute = compute;
                return this;
            }

            /**
             * Login.
             */
            public Builder login(Login login) {
                this.login = login;
                return this;
            }

            /**
             * Manager.
             */
            public Builder manager(Manager manager) {
                this.manager = manager;
                return this;
            }

            /**
             * ProxyMgr.
             */
            public Builder proxyMgr(ProxyMgr proxyMgr) {
                this.proxyMgr = proxyMgr;
                return this;
            }

            public EcsInfo build() {
                return new EcsInfo(this);
            } 

        } 

    }
    public static class OnPremiseInfo extends TeaModel {
        @NameInMap("HostName")
        private String hostName;

        @NameInMap("IP")
        private String IP;

        @NameInMap("Type")
        private String type;

        private OnPremiseInfo(Builder builder) {
            this.hostName = builder.hostName;
            this.IP = builder.IP;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnPremiseInfo create() {
            return builder().build();
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return IP
         */
        public String getIP() {
            return this.IP;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String hostName; 
            private String IP; 
            private String type; 

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * IP.
             */
            public Builder IP(String IP) {
                this.IP = IP;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OnPremiseInfo build() {
                return new OnPremiseInfo(this);
            } 

        } 

    }
    public static class ClusterInfoOnPremiseInfo extends TeaModel {
        @NameInMap("OnPremiseInfo")
        private java.util.List < OnPremiseInfo> onPremiseInfo;

        private ClusterInfoOnPremiseInfo(Builder builder) {
            this.onPremiseInfo = builder.onPremiseInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInfoOnPremiseInfo create() {
            return builder().build();
        }

        /**
         * @return onPremiseInfo
         */
        public java.util.List < OnPremiseInfo> getOnPremiseInfo() {
            return this.onPremiseInfo;
        }

        public static final class Builder {
            private java.util.List < OnPremiseInfo> onPremiseInfo; 

            /**
             * OnPremiseInfo.
             */
            public Builder onPremiseInfo(java.util.List < OnPremiseInfo> onPremiseInfo) {
                this.onPremiseInfo = onPremiseInfo;
                return this;
            }

            public ClusterInfoOnPremiseInfo build() {
                return new ClusterInfoOnPremiseInfo(this);
            } 

        } 

    }
    public static class PostInstallScriptInfo extends TeaModel {
        @NameInMap("Args")
        private String args;

        @NameInMap("Url")
        private String url;

        private PostInstallScriptInfo(Builder builder) {
            this.args = builder.args;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostInstallScriptInfo create() {
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

            public PostInstallScriptInfo build() {
                return new PostInstallScriptInfo(this);
            } 

        } 

    }
    public static class PostInstallScripts extends TeaModel {
        @NameInMap("PostInstallScriptInfo")
        private java.util.List < PostInstallScriptInfo> postInstallScriptInfo;

        private PostInstallScripts(Builder builder) {
            this.postInstallScriptInfo = builder.postInstallScriptInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostInstallScripts create() {
            return builder().build();
        }

        /**
         * @return postInstallScriptInfo
         */
        public java.util.List < PostInstallScriptInfo> getPostInstallScriptInfo() {
            return this.postInstallScriptInfo;
        }

        public static final class Builder {
            private java.util.List < PostInstallScriptInfo> postInstallScriptInfo; 

            /**
             * PostInstallScriptInfo.
             */
            public Builder postInstallScriptInfo(java.util.List < PostInstallScriptInfo> postInstallScriptInfo) {
                this.postInstallScriptInfo = postInstallScriptInfo;
                return this;
            }

            public PostInstallScripts build() {
                return new PostInstallScripts(this);
            } 

        } 

    }
    public static class ClusterInfo extends TeaModel {
        @NameInMap("AccountType")
        private String accountType;

        @NameInMap("Applications")
        private Applications applications;

        @NameInMap("BaseOsTag")
        private String baseOsTag;

        @NameInMap("ClientVersion")
        private String clientVersion;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeployMode")
        private String deployMode;

        @NameInMap("Description")
        private String description;

        @NameInMap("EcsChargeType")
        private String ecsChargeType;

        @NameInMap("EcsInfo")
        private EcsInfo ecsInfo;

        @NameInMap("HaEnable")
        private Boolean haEnable;

        @NameInMap("Id")
        private String id;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @NameInMap("KeyPairName")
        private String keyPairName;

        @NameInMap("Location")
        private String location;

        @NameInMap("Name")
        private String name;

        @NameInMap("OnPremiseInfo")
        private ClusterInfoOnPremiseInfo onPremiseInfo;

        @NameInMap("OsTag")
        private String osTag;

        @NameInMap("PostInstallScripts")
        private PostInstallScripts postInstallScripts;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RemoteDirectory")
        private String remoteDirectory;

        @NameInMap("SccClusterId")
        private String sccClusterId;

        @NameInMap("SchedulerType")
        private String schedulerType;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VolumeId")
        private String volumeId;

        @NameInMap("VolumeMountpoint")
        private String volumeMountpoint;

        @NameInMap("VolumeProtocol")
        private String volumeProtocol;

        @NameInMap("VolumeType")
        private String volumeType;

        @NameInMap("VpcId")
        private String vpcId;

        private ClusterInfo(Builder builder) {
            this.accountType = builder.accountType;
            this.applications = builder.applications;
            this.baseOsTag = builder.baseOsTag;
            this.clientVersion = builder.clientVersion;
            this.createTime = builder.createTime;
            this.deployMode = builder.deployMode;
            this.description = builder.description;
            this.ecsChargeType = builder.ecsChargeType;
            this.ecsInfo = builder.ecsInfo;
            this.haEnable = builder.haEnable;
            this.id = builder.id;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.keyPairName = builder.keyPairName;
            this.location = builder.location;
            this.name = builder.name;
            this.onPremiseInfo = builder.onPremiseInfo;
            this.osTag = builder.osTag;
            this.postInstallScripts = builder.postInstallScripts;
            this.regionId = builder.regionId;
            this.remoteDirectory = builder.remoteDirectory;
            this.sccClusterId = builder.sccClusterId;
            this.schedulerType = builder.schedulerType;
            this.securityGroupId = builder.securityGroupId;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.volumeId = builder.volumeId;
            this.volumeMountpoint = builder.volumeMountpoint;
            this.volumeProtocol = builder.volumeProtocol;
            this.volumeType = builder.volumeType;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInfo create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return applications
         */
        public Applications getApplications() {
            return this.applications;
        }

        /**
         * @return baseOsTag
         */
        public String getBaseOsTag() {
            return this.baseOsTag;
        }

        /**
         * @return clientVersion
         */
        public String getClientVersion() {
            return this.clientVersion;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return ecsChargeType
         */
        public String getEcsChargeType() {
            return this.ecsChargeType;
        }

        /**
         * @return ecsInfo
         */
        public EcsInfo getEcsInfo() {
            return this.ecsInfo;
        }

        /**
         * @return haEnable
         */
        public Boolean getHaEnable() {
            return this.haEnable;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageOwnerAlias
         */
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return onPremiseInfo
         */
        public ClusterInfoOnPremiseInfo getOnPremiseInfo() {
            return this.onPremiseInfo;
        }

        /**
         * @return osTag
         */
        public String getOsTag() {
            return this.osTag;
        }

        /**
         * @return postInstallScripts
         */
        public PostInstallScripts getPostInstallScripts() {
            return this.postInstallScripts;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remoteDirectory
         */
        public String getRemoteDirectory() {
            return this.remoteDirectory;
        }

        /**
         * @return sccClusterId
         */
        public String getSccClusterId() {
            return this.sccClusterId;
        }

        /**
         * @return schedulerType
         */
        public String getSchedulerType() {
            return this.schedulerType;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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

        public static final class Builder {
            private String accountType; 
            private Applications applications; 
            private String baseOsTag; 
            private String clientVersion; 
            private String createTime; 
            private String deployMode; 
            private String description; 
            private String ecsChargeType; 
            private EcsInfo ecsInfo; 
            private Boolean haEnable; 
            private String id; 
            private String imageId; 
            private String imageName; 
            private String imageOwnerAlias; 
            private String keyPairName; 
            private String location; 
            private String name; 
            private ClusterInfoOnPremiseInfo onPremiseInfo; 
            private String osTag; 
            private PostInstallScripts postInstallScripts; 
            private String regionId; 
            private String remoteDirectory; 
            private String sccClusterId; 
            private String schedulerType; 
            private String securityGroupId; 
            private String status; 
            private String vSwitchId; 
            private String volumeId; 
            private String volumeMountpoint; 
            private String volumeProtocol; 
            private String volumeType; 
            private String vpcId; 

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * Applications.
             */
            public Builder applications(Applications applications) {
                this.applications = applications;
                return this;
            }

            /**
             * BaseOsTag.
             */
            public Builder baseOsTag(String baseOsTag) {
                this.baseOsTag = baseOsTag;
                return this;
            }

            /**
             * ClientVersion.
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeployMode.
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EcsChargeType.
             */
            public Builder ecsChargeType(String ecsChargeType) {
                this.ecsChargeType = ecsChargeType;
                return this;
            }

            /**
             * EcsInfo.
             */
            public Builder ecsInfo(EcsInfo ecsInfo) {
                this.ecsInfo = ecsInfo;
                return this;
            }

            /**
             * HaEnable.
             */
            public Builder haEnable(Boolean haEnable) {
                this.haEnable = haEnable;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ImageOwnerAlias.
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * KeyPairName.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OnPremiseInfo.
             */
            public Builder onPremiseInfo(ClusterInfoOnPremiseInfo onPremiseInfo) {
                this.onPremiseInfo = onPremiseInfo;
                return this;
            }

            /**
             * OsTag.
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * PostInstallScripts.
             */
            public Builder postInstallScripts(PostInstallScripts postInstallScripts) {
                this.postInstallScripts = postInstallScripts;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RemoteDirectory.
             */
            public Builder remoteDirectory(String remoteDirectory) {
                this.remoteDirectory = remoteDirectory;
                return this;
            }

            /**
             * SccClusterId.
             */
            public Builder sccClusterId(String sccClusterId) {
                this.sccClusterId = sccClusterId;
                return this;
            }

            /**
             * SchedulerType.
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VolumeId.
             */
            public Builder volumeId(String volumeId) {
                this.volumeId = volumeId;
                return this;
            }

            /**
             * VolumeMountpoint.
             */
            public Builder volumeMountpoint(String volumeMountpoint) {
                this.volumeMountpoint = volumeMountpoint;
                return this;
            }

            /**
             * VolumeProtocol.
             */
            public Builder volumeProtocol(String volumeProtocol) {
                this.volumeProtocol = volumeProtocol;
                return this;
            }

            /**
             * VolumeType.
             */
            public Builder volumeType(String volumeType) {
                this.volumeType = volumeType;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public ClusterInfo build() {
                return new ClusterInfo(this);
            } 

        } 

    }
}
