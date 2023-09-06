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
         * The cluster information.
         */
        public Builder clusterInfo(ClusterInfo clusterInfo) {
            this.clusterInfo = clusterInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterResponseBody build() {
            return new DescribeClusterResponseBody(this);
        } 

    } 

    public static class AddOnsInfo extends TeaModel {
        @NameInMap("DeployMode")
        private String deployMode;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("SoftwareId")
        private String softwareId;

        @NameInMap("Status")
        private String status;

        @NameInMap("URL")
        private String URL;

        private AddOnsInfo(Builder builder) {
            this.deployMode = builder.deployMode;
            this.port = builder.port;
            this.softwareId = builder.softwareId;
            this.status = builder.status;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddOnsInfo create() {
            return builder().build();
        }

        /**
         * @return deployMode
         */
        public String getDeployMode() {
            return this.deployMode;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return softwareId
         */
        public String getSoftwareId() {
            return this.softwareId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String deployMode; 
            private Integer port; 
            private String softwareId; 
            private String status; 
            private String URL; 

            /**
             * The deployment mode of the custom component. Valid values:
             * <p>
             * 
             * *   local
             * *   ecs
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * The TCP port number of the custom component.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The software ID of the component.
             */
            public Builder softwareId(String softwareId) {
                this.softwareId = softwareId;
                return this;
            }

            /**
             * The running status of the custom component. Valid values:
             * <p>
             * 
             * *   running
             * *   stopped
             * *   exception
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The endpoint of the custom component service.
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public AddOnsInfo build() {
                return new AddOnsInfo(this);
            } 

        } 

    }
    public static class ClusterInfoAddOnsInfo extends TeaModel {
        @NameInMap("AddOnsInfo")
        private java.util.List < AddOnsInfo> addOnsInfo;

        private ClusterInfoAddOnsInfo(Builder builder) {
            this.addOnsInfo = builder.addOnsInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInfoAddOnsInfo create() {
            return builder().build();
        }

        /**
         * @return addOnsInfo
         */
        public java.util.List < AddOnsInfo> getAddOnsInfo() {
            return this.addOnsInfo;
        }

        public static final class Builder {
            private java.util.List < AddOnsInfo> addOnsInfo; 

            /**
             * AddOnsInfo.
             */
            public Builder addOnsInfo(java.util.List < AddOnsInfo> addOnsInfo) {
                this.addOnsInfo = addOnsInfo;
                return this;
            }

            public ClusterInfoAddOnsInfo build() {
                return new ClusterInfoAddOnsInfo(this);
            } 

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
             * The name of the software.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The tag of the software.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The version of the software.
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
             * The number of compute nodes in the cluster.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

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
             * The number of logon nodes in the cluster.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The instance type of the logon nodes.
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
             * The number of management nodes.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The instance type of the management nodes.
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
             * The number of proxy nodes.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The instance type of the proxy node.
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
             * The list of compute nodes.
             */
            public Builder compute(Compute compute) {
                this.compute = compute;
                return this;
            }

            /**
             * The list of logon nodes.
             */
            public Builder login(Login login) {
                this.login = login;
                return this;
            }

            /**
             * The information of management nodes.
             */
            public Builder manager(Manager manager) {
                this.manager = manager;
                return this;
            }

            /**
             * The list of proxy nodes on the cloud.
             * <p>
             * 
             * This parameter is returned only when the cluster is deployed across hybrid environments and the hybrid-cloud proxy mode is enabled for the cluster.
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
    public static class InitialImage extends TeaModel {
        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @NameInMap("OsTag")
        private String osTag;

        private InitialImage(Builder builder) {
            this.imageId = builder.imageId;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.osTag = builder.osTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitialImage create() {
            return builder().build();
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
         * @return osTag
         */
        public String getOsTag() {
            return this.osTag;
        }

        public static final class Builder {
            private String imageId; 
            private String imageOwnerAlias; 
            private String osTag; 

            /**
             * The image ID.
             */
            public Builder imageId(String imageId) {
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
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * An array of OS images that are supported by E-HPC.
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            public InitialImage build() {
                return new InitialImage(this);
            } 

        } 

    }
    public static class NodesInfo extends TeaModel {
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

        private NodesInfo(Builder builder) {
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

        public static NodesInfo create() {
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

            public NodesInfo build() {
                return new NodesInfo(this);
            } 

        } 

    }
    public static class Nodes extends TeaModel {
        @NameInMap("NodesInfo")
        private java.util.List < NodesInfo> nodesInfo;

        private Nodes(Builder builder) {
            this.nodesInfo = builder.nodesInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return nodesInfo
         */
        public java.util.List < NodesInfo> getNodesInfo() {
            return this.nodesInfo;
        }

        public static final class Builder {
            private java.util.List < NodesInfo> nodesInfo; 

            /**
             * NodesInfo.
             */
            public Builder nodesInfo(java.util.List < NodesInfo> nodesInfo) {
                this.nodesInfo = nodesInfo;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class OnPremiseInfo extends TeaModel {
        @NameInMap("HostName")
        private String hostName;

        @NameInMap("IP")
        private String ip;

        @NameInMap("Type")
        private String type;

        private OnPremiseInfo(Builder builder) {
            this.hostName = builder.hostName;
            this.ip = builder.ip;
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
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String hostName; 
            private String ip; 
            private String type; 

            /**
             * The hostname of the on-premises management nodes.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The IP address of the on-premises management nodes.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The type of on-premises management nodes. Valid values:
             * <p>
             * 
             * *   scheduler
             * *   account
             * *   account, scheduler
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
             * The runtime parameters of the script.
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * The URL used to download the script.
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

        @NameInMap("AddOnsInfo")
        private ClusterInfoAddOnsInfo addOnsInfo;

        @NameInMap("Applications")
        private Applications applications;

        @NameInMap("AutoRenew")
        private String autoRenew;

        @NameInMap("AutoRenewPeriod")
        private String autoRenewPeriod;

        @NameInMap("BaseOsTag")
        private String baseOsTag;

        @NameInMap("ClientVersion")
        private String clientVersion;

        @NameInMap("ClusterVersion")
        private String clusterVersion;

        @NameInMap("ComputeSpotPriceLimit")
        private String computeSpotPriceLimit;

        @NameInMap("ComputeSpotStrategy")
        private String computeSpotStrategy;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeployMode")
        private String deployMode;

        @NameInMap("Description")
        private String description;

        @NameInMap("Domain")
        private String domain;

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

        @NameInMap("InitialImage")
        private InitialImage initialImage;

        @NameInMap("KeyPairName")
        private String keyPairName;

        @NameInMap("Location")
        private String location;

        @NameInMap("Name")
        private String name;

        @NameInMap("Nodes")
        private Nodes nodes;

        @NameInMap("OnPremiseInfo")
        private ClusterInfoOnPremiseInfo onPremiseInfo;

        @NameInMap("OpenldapPar")
        private String openldapPar;

        @NameInMap("OsTag")
        private String osTag;

        @NameInMap("Period")
        private String period;

        @NameInMap("PeriodUnit")
        private String periodUnit;

        @NameInMap("Plugin")
        private String plugin;

        @NameInMap("PostInstallScripts")
        private PostInstallScripts postInstallScripts;

        @NameInMap("RamNodeTypes")
        private String ramNodeTypes;

        @NameInMap("RamRoleName")
        private String ramRoleName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RemoteDirectory")
        private String remoteDirectory;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SccClusterId")
        private String sccClusterId;

        @NameInMap("SchedulerPreInstall")
        private Integer schedulerPreInstall;

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

        @NameInMap("WinAdPar")
        private String winAdPar;

        @NameInMap("WithoutAgent")
        private Integer withoutAgent;

        @NameInMap("ZoneId")
        private String zoneId;

        private ClusterInfo(Builder builder) {
            this.accountType = builder.accountType;
            this.addOnsInfo = builder.addOnsInfo;
            this.applications = builder.applications;
            this.autoRenew = builder.autoRenew;
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.baseOsTag = builder.baseOsTag;
            this.clientVersion = builder.clientVersion;
            this.clusterVersion = builder.clusterVersion;
            this.computeSpotPriceLimit = builder.computeSpotPriceLimit;
            this.computeSpotStrategy = builder.computeSpotStrategy;
            this.createTime = builder.createTime;
            this.deployMode = builder.deployMode;
            this.description = builder.description;
            this.domain = builder.domain;
            this.ecsChargeType = builder.ecsChargeType;
            this.ecsInfo = builder.ecsInfo;
            this.haEnable = builder.haEnable;
            this.id = builder.id;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.initialImage = builder.initialImage;
            this.keyPairName = builder.keyPairName;
            this.location = builder.location;
            this.name = builder.name;
            this.nodes = builder.nodes;
            this.onPremiseInfo = builder.onPremiseInfo;
            this.openldapPar = builder.openldapPar;
            this.osTag = builder.osTag;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.plugin = builder.plugin;
            this.postInstallScripts = builder.postInstallScripts;
            this.ramNodeTypes = builder.ramNodeTypes;
            this.ramRoleName = builder.ramRoleName;
            this.regionId = builder.regionId;
            this.remoteDirectory = builder.remoteDirectory;
            this.resourceGroupId = builder.resourceGroupId;
            this.sccClusterId = builder.sccClusterId;
            this.schedulerPreInstall = builder.schedulerPreInstall;
            this.schedulerType = builder.schedulerType;
            this.securityGroupId = builder.securityGroupId;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.volumeId = builder.volumeId;
            this.volumeMountpoint = builder.volumeMountpoint;
            this.volumeProtocol = builder.volumeProtocol;
            this.volumeType = builder.volumeType;
            this.vpcId = builder.vpcId;
            this.winAdPar = builder.winAdPar;
            this.withoutAgent = builder.withoutAgent;
            this.zoneId = builder.zoneId;
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
         * @return addOnsInfo
         */
        public ClusterInfoAddOnsInfo getAddOnsInfo() {
            return this.addOnsInfo;
        }

        /**
         * @return applications
         */
        public Applications getApplications() {
            return this.applications;
        }

        /**
         * @return autoRenew
         */
        public String getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return autoRenewPeriod
         */
        public String getAutoRenewPeriod() {
            return this.autoRenewPeriod;
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
         * @return clusterVersion
         */
        public String getClusterVersion() {
            return this.clusterVersion;
        }

        /**
         * @return computeSpotPriceLimit
         */
        public String getComputeSpotPriceLimit() {
            return this.computeSpotPriceLimit;
        }

        /**
         * @return computeSpotStrategy
         */
        public String getComputeSpotStrategy() {
            return this.computeSpotStrategy;
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
         * @return domain
         */
        public String getDomain() {
            return this.domain;
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
         * @return initialImage
         */
        public InitialImage getInitialImage() {
            return this.initialImage;
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
         * @return nodes
         */
        public Nodes getNodes() {
            return this.nodes;
        }

        /**
         * @return onPremiseInfo
         */
        public ClusterInfoOnPremiseInfo getOnPremiseInfo() {
            return this.onPremiseInfo;
        }

        /**
         * @return openldapPar
         */
        public String getOpenldapPar() {
            return this.openldapPar;
        }

        /**
         * @return osTag
         */
        public String getOsTag() {
            return this.osTag;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return plugin
         */
        public String getPlugin() {
            return this.plugin;
        }

        /**
         * @return postInstallScripts
         */
        public PostInstallScripts getPostInstallScripts() {
            return this.postInstallScripts;
        }

        /**
         * @return ramNodeTypes
         */
        public String getRamNodeTypes() {
            return this.ramNodeTypes;
        }

        /**
         * @return ramRoleName
         */
        public String getRamRoleName() {
            return this.ramRoleName;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return sccClusterId
         */
        public String getSccClusterId() {
            return this.sccClusterId;
        }

        /**
         * @return schedulerPreInstall
         */
        public Integer getSchedulerPreInstall() {
            return this.schedulerPreInstall;
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

        /**
         * @return winAdPar
         */
        public String getWinAdPar() {
            return this.winAdPar;
        }

        /**
         * @return withoutAgent
         */
        public Integer getWithoutAgent() {
            return this.withoutAgent;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String accountType; 
            private ClusterInfoAddOnsInfo addOnsInfo; 
            private Applications applications; 
            private String autoRenew; 
            private String autoRenewPeriod; 
            private String baseOsTag; 
            private String clientVersion; 
            private String clusterVersion; 
            private String computeSpotPriceLimit; 
            private String computeSpotStrategy; 
            private String createTime; 
            private String deployMode; 
            private String description; 
            private String domain; 
            private String ecsChargeType; 
            private EcsInfo ecsInfo; 
            private Boolean haEnable; 
            private String id; 
            private String imageId; 
            private String imageName; 
            private String imageOwnerAlias; 
            private InitialImage initialImage; 
            private String keyPairName; 
            private String location; 
            private String name; 
            private Nodes nodes; 
            private ClusterInfoOnPremiseInfo onPremiseInfo; 
            private String openldapPar; 
            private String osTag; 
            private String period; 
            private String periodUnit; 
            private String plugin; 
            private PostInstallScripts postInstallScripts; 
            private String ramNodeTypes; 
            private String ramRoleName; 
            private String regionId; 
            private String remoteDirectory; 
            private String resourceGroupId; 
            private String sccClusterId; 
            private Integer schedulerPreInstall; 
            private String schedulerType; 
            private String securityGroupId; 
            private String status; 
            private String vSwitchId; 
            private String volumeId; 
            private String volumeMountpoint; 
            private String volumeProtocol; 
            private String volumeType; 
            private String vpcId; 
            private String winAdPar; 
            private Integer withoutAgent; 
            private String zoneId; 

            /**
             * The server type of the account. Valid values:
             * <p>
             * 
             * *   nis
             * *   ldap
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * The information about the custom component service.
             */
            public Builder addOnsInfo(ClusterInfoAddOnsInfo addOnsInfo) {
                this.addOnsInfo = addOnsInfo;
                return this;
            }

            /**
             * The array of the software in the cluster. The array contains the name and version of the software.
             */
            public Builder applications(Applications applications) {
                this.applications = applications;
                return this;
            }

            /**
             * Specifies whether to enable auto-renewal. The parameter takes effect only when EcsChargeType is set to PrePaid. Valid values:
             * <p>
             * 
             * *   true: enables auto-renewal.
             * *   false: disables auto-renewal.
             * 
             * Default value: true.
             */
            public Builder autoRenew(String autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * The auto-renewal period of the subscription compute nodes. The parameter takes effect when AutoRenew is set to true.
             * <p>
             * 
             * *   If PeriodUnit is set to Week, the valid values of the AutoRenewPeriod parameter are 1, 2, and 3.
             * *   If PeriodUnit is set to Month, the valid values of the AutoRenewPeriod parameter are 1, 2, 3, 6, and 12.
             * 
             * Default value: 1.
             */
            public Builder autoRenewPeriod(String autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * The image of the cluster.
             */
            public Builder baseOsTag(String baseOsTag) {
                this.baseOsTag = baseOsTag;
                return this;
            }

            /**
             * The version of the E-HPC client.
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * The version of the E-HPC cluster.
             */
            public Builder clusterVersion(String clusterVersion) {
                this.clusterVersion = clusterVersion;
                return this;
            }

            /**
             * The maximum hourly price of the compute nodes. A maximum of three decimal places can be used in the value of the parameter. The parameter is valid only when the ComputeSpotStrategy parameter is set to SpotWithPriceLimit.
             */
            public Builder computeSpotPriceLimit(String computeSpotPriceLimit) {
                this.computeSpotPriceLimit = computeSpotPriceLimit;
                return this;
            }

            /**
             * The bidding method of the compute node. Valid values:
             * <p>
             * 
             * *   NoSpot: The instance is created as a pay-as-you-go instance.
             * *   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.
             * *   SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.
             */
            public Builder computeSpotStrategy(String computeSpotStrategy) {
                this.computeSpotStrategy = computeSpotStrategy;
                return this;
            }

            /**
             * The time at which the instance is created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The mode in which the cluster is deployed. Valid values:
             * <p>
             * 
             * *   Standard: An account node, a scheduling node, a logon node, and multiple compute nodes are separately deployed.
             * *   Advanced: Two high availability (HA) account nodes, two HA scheduler nodes, one logon node, and multiple compute nodes are separately deployed.
             * *   Simple: A management node, a logon node, and multiple compute nodes are deployed. The management node consists of an account node and a scheduling node. The logon node and compute nodes are separately deployed.
             * *   Tiny: The account node, scheduling node, and logon node are deployed on one node. The compute node is separately deployed.
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * The description of the cluster.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The domain name of the on-premises E-HPC cluster.
             * <p>
             * 
             * This parameter takes effect only when the AccoutType parameter is set to Idap.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The billing method of the nodes in the cluster. Valid values:
             * <p>
             * 
             * *   PostPaid: pay-as-you-go
             * *   PrePaid: subscription
             */
            public Builder ecsChargeType(String ecsChargeType) {
                this.ecsChargeType = ecsChargeType;
                return this;
            }

            /**
             * The list of ECS instance specifications and quantity.
             */
            public Builder ecsInfo(EcsInfo ecsInfo) {
                this.ecsInfo = ecsInfo;
                return this;
            }

            /**
             * Specifies whether to enable the high availability feature.
             * <p>
             * 
             * >  If high availability is enabled, each management role in the cluster uses both primary and secondary instances.
             */
            public Builder haEnable(Boolean haEnable) {
                this.haEnable = haEnable;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The image ID.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The image name.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The image type. Valid values:
             * <p>
             * 
             * *   system: public image
             * *   self: custom image
             * *   others: shared image
             * *   marketplace: Alibaba Cloud Marketplace image
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * The image information of the operating systems.
             */
            public Builder initialImage(InitialImage initialImage) {
                this.initialImage = initialImage;
                return this;
            }

            /**
             * The name of the AccessKey pair.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * The location where the cluster is deployed. Valid values:
             * <p>
             * 
             * *   OnPremise: The node is deployed on a hybrid cloud.
             * *   PublicCloud: The cluster is deployed on a public cloud.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The information of the on-premises node in the cluster.
             */
            public Builder nodes(Nodes nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * The list of on-premises management nodes.
             * <p>
             * 
             * This parameter is returned only when the cluster is deployed across hybrid environments and the hybrid-cloud proxy mode is enabled for the cluster.
             */
            public Builder onPremiseInfo(ClusterInfoOnPremiseInfo onPremiseInfo) {
                this.onPremiseInfo = onPremiseInfo;
                return this;
            }

            /**
             * The parameter that is used to connect to the OpenLDAP server.
             */
            public Builder openldapPar(String openldapPar) {
                this.openldapPar = openldapPar;
                return this;
            }

            /**
             * The operating system tag of the image.
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * The duration of the subscription. The unit of the duration is specified by the `PeriodUnit` parameter.
             * <p>
             * 
             * *   If you set PriceUnit to Year, the valid values of the Period parameter are 1, 2, and 3.
             * *   If you set PriceUnit to Month, the valid values of the Period parameter are 1, 2, 3, 4, 5, 6, 7, 8, and 9.
             * *   If you set PriceUnit to Hour, the valid value of the Period parameter is 1.
             * 
             * Default value: 1.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * The unit of the subscription duration. Valid value:
             * <p>
             * 
             * *   Year
             * *   Month
             * *   Hour
             * 
             * Default value: Month.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
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
             *     *   oss: The plug-in is downloaded and decompressed from OSS to a local path that is specified by the pluginLocalPath parameter.
             *     *   image: By default, the plug-in is stored in a pre-defined local path that is specified by the pluginLocalPath parameter.
             * 
             * *   pluginLocalPath: the local path where the plug-in is stored. We recommend that you select a shared directory in the oss mode and a non-shared directory in the image mode.
             * 
             * *   pluginOssPath: the remote path where the plug-in is stored in OSS. This parameter takes effect only if you set the pluginMod parameter to oss.
             */
            public Builder plugin(String plugin) {
                this.plugin = plugin;
                return this;
            }

            /**
             * The list of post-installation scripts
             */
            public Builder postInstallScripts(PostInstallScripts postInstallScripts) {
                this.postInstallScripts = postInstallScripts;
                return this;
            }

            /**
             * The node type details of the instance RAM role.
             */
            public Builder ramNodeTypes(String ramNodeTypes) {
                this.ramNodeTypes = ramNodeTypes;
                return this;
            }

            /**
             * The name of the instance Resource Access Management (RAM) role.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The remote directory on which the file system is mounted.
             */
            public Builder remoteDirectory(String remoteDirectory) {
                this.remoteDirectory = remoteDirectory;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the Super Computing Cluster (SCC) instance. If the cluster is not an SCC instance, a null string is returned.
             */
            public Builder sccClusterId(String sccClusterId) {
                this.sccClusterId = sccClusterId;
                return this;
            }

            /**
             * Specifies whether the scheduler is preinstalled for the image. Valid values:
             * <p>
             * 
             * *   true: The scheduler is preinstalled. When you create a node or scale out a cluster, you do not need to install the scheduler.
             * *   false: The scheduler is not preinstalled. When you create or add a cluster, you must install the scheduler.
             */
            public Builder schedulerPreInstall(Integer schedulerPreInstall) {
                this.schedulerPreInstall = schedulerPreInstall;
                return this;
            }

            /**
             * The type of the scheduler. Valid values:
             * <p>
             * 
             * *   pbs
             * *   slurm
             * *   opengridscheduler
             * *   deadline
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * The ID of the security group.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The status of the cluster. Valid values:
             * <p>
             * 
             * *   uninit: The cluster is not initialized.
             * *   creating: The cluster is being created.
             * *   init: The cluster is being initialized.
             * *   running: The cluster is running.
             * *   exception: The cluster encounters an exception.
             * *   releasing: The cluster is being released.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The vSwitch ID. E-HPC can be deployed only in VPCs.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the Apsara File Storage NAS file system. NAS file systems cannot be automatically created.
             */
            public Builder volumeId(String volumeId) {
                this.volumeId = volumeId;
                return this;
            }

            /**
             * The mount target of the NAS file system. The mount target is of the VPC type. Mount targets cannot be automatically created for NAS file systems.
             */
            public Builder volumeMountpoint(String volumeMountpoint) {
                this.volumeMountpoint = volumeMountpoint;
                return this;
            }

            /**
             * The type of the protocol that is used by the file system. Valid values:
             * <p>
             * 
             * *   nfs
             * *   smb
             */
            public Builder volumeProtocol(String volumeProtocol) {
                this.volumeProtocol = volumeProtocol;
                return this;
            }

            /**
             * The type of the network shared storage. Valid value: NAS.
             */
            public Builder volumeType(String volumeType) {
                this.volumeType = volumeType;
                return this;
            }

            /**
             * The VPC ID of the node.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The parameter that is used to connect to the Windows AD server.
             */
            public Builder winAdPar(String winAdPar) {
                this.winAdPar = winAdPar;
                return this;
            }

            /**
             * Specifies whether to not install the agent.
             */
            public Builder withoutAgent(Integer withoutAgent) {
                this.withoutAgent = withoutAgent;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ClusterInfo build() {
                return new ClusterInfo(this);
            } 

        } 

    }
}
