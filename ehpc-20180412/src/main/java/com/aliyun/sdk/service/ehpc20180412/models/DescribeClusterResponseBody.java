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
 * {@link DescribeClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterResponseBody</p>
 */
public class DescribeClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterInfo")
    private ClusterInfo clusterInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeClusterResponseBody model) {
            this.clusterInfo = model.clusterInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the cluster.</p>
         */
        public Builder clusterInfo(ClusterInfo clusterInfo) {
            this.clusterInfo = clusterInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterResponseBody build() {
            return new DescribeClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class AddOnsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeployMode")
        private String deployMode;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("SoftwareId")
        private String softwareId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("URL")
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

            private Builder() {
            } 

            private Builder(AddOnsInfo model) {
                this.deployMode = model.deployMode;
                this.port = model.port;
                this.softwareId = model.softwareId;
                this.status = model.status;
                this.URL = model.URL;
            } 

            /**
             * <p>The deployment mode of the custom component. Valid values:</p>
             * <ul>
             * <li>local</li>
             * <li>ecs</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>local</p>
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * <p>The TCP port number of the custom component.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The software ID of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>CROMWELL_85</p>
             */
            public Builder softwareId(String softwareId) {
                this.softwareId = softwareId;
                return this;
            }

            /**
             * <p>The running status of the custom component. Valid values:</p>
             * <ul>
             * <li>running</li>
             * <li>stopped</li>
             * <li>exception</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The URL of the custom component service.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://172.16.10.12:10000/">http://172.16.10.12:10000/</a></p>
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
    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class ClusterInfoAddOnsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddOnsInfo")
        private java.util.List<AddOnsInfo> addOnsInfo;

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
        public java.util.List<AddOnsInfo> getAddOnsInfo() {
            return this.addOnsInfo;
        }

        public static final class Builder {
            private java.util.List<AddOnsInfo> addOnsInfo; 

            private Builder() {
            } 

            private Builder(ClusterInfoAddOnsInfo model) {
                this.addOnsInfo = model.addOnsInfo;
            } 

            /**
             * AddOnsInfo.
             */
            public Builder addOnsInfo(java.util.List<AddOnsInfo> addOnsInfo) {
                this.addOnsInfo = addOnsInfo;
                return this;
            }

            public ClusterInfoAddOnsInfo build() {
                return new ClusterInfoAddOnsInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class ApplicationInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Version")
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

            private Builder() {
            } 

            private Builder(ApplicationInfo model) {
                this.name = model.name;
                this.tag = model.tag;
                this.version = model.version;
            } 

            /**
             * <p>The name of the software.</p>
             * 
             * <strong>example:</strong>
             * <p>openmpi</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The tag of the software.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenMPI_1.8.7</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The version of the software.</p>
             * 
             * <strong>example:</strong>
             * <p>1.10</p>
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
    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationInfo")
        private java.util.List<ApplicationInfo> applicationInfo;

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
        public java.util.List<ApplicationInfo> getApplicationInfo() {
            return this.applicationInfo;
        }

        public static final class Builder {
            private java.util.List<ApplicationInfo> applicationInfo; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.applicationInfo = model.applicationInfo;
            } 

            /**
             * ApplicationInfo.
             */
            public Builder applicationInfo(java.util.List<ApplicationInfo> applicationInfo) {
                this.applicationInfo = applicationInfo;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class Compute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
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

            private Builder() {
            } 

            private Builder(Compute model) {
                this.count = model.count;
                this.instanceType = model.instanceType;
            } 

            /**
             * <p>The number of compute nodes in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The instance type of the compute nodes.</p>
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
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class Login extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
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

            private Builder() {
            } 

            private Builder(Login model) {
                this.count = model.count;
                this.instanceType = model.instanceType;
            } 

            /**
             * <p>The number of logon nodes in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The instance type of the logon nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.n1.tiny</p>
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
    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class Manager extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
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

            private Builder() {
            } 

            private Builder(Manager model) {
                this.count = model.count;
                this.instanceType = model.instanceType;
            } 

            /**
             * <p>The number of management nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The instance type of the management nodes.</p>
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
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class ProxyMgr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
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

            private Builder() {
            } 

            private Builder(ProxyMgr model) {
                this.count = model.count;
                this.instanceType = model.instanceType;
            } 

            /**
             * <p>The number of proxy nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The instance type of the proxy node.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.n1.tiny</p>
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
    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class EcsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Compute")
        private Compute compute;

        @com.aliyun.core.annotation.NameInMap("Login")
        private Login login;

        @com.aliyun.core.annotation.NameInMap("Manager")
        private Manager manager;

        @com.aliyun.core.annotation.NameInMap("ProxyMgr")
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

            private Builder() {
            } 

            private Builder(EcsInfo model) {
                this.compute = model.compute;
                this.login = model.login;
                this.manager = model.manager;
                this.proxyMgr = model.proxyMgr;
            } 

            /**
             * <p>The list of compute nodes.</p>
             */
            public Builder compute(Compute compute) {
                this.compute = compute;
                return this;
            }

            /**
             * <p>The list of logon nodes.</p>
             */
            public Builder login(Login login) {
                this.login = login;
                return this;
            }

            /**
             * <p>The information of management nodes.</p>
             */
            public Builder manager(Manager manager) {
                this.manager = manager;
                return this;
            }

            /**
             * <p>The list of proxy nodes on the cloud.</p>
             * <p>This parameter is returned only when the cluster is deployed across hybrid environments and the hybrid-cloud proxy mode is enabled for the cluster.</p>
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
    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class InitialImage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @com.aliyun.core.annotation.NameInMap("OsTag")
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

            private Builder() {
            } 

            private Builder(InitialImage model) {
                this.imageId = model.imageId;
                this.imageOwnerAlias = model.imageOwnerAlias;
                this.osTag = model.osTag;
            } 

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_7_6_x64_20G_alibase_20211130.vhd</p>
             */
            public Builder imageId(String imageId) {
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
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * <p>An array of OS images that are supported by E-HPC.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_7.6_64</p>
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
    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class NodesInfo extends TeaModel {
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

            private Builder() {
            } 

            private Builder(NodesInfo model) {
                this.accountType = model.accountType;
                this.dir = model.dir;
                this.hostName = model.hostName;
                this.ipAddress = model.ipAddress;
                this.role = model.role;
                this.schedulerType = model.schedulerType;
            } 

            /**
             * <p>The service type of the domain account to which the node in the on-premises cluster belongs. Valid values:</p>
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
             * <p>The directory of the node in the on-premises cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>/opt/sge/default/</p>
             */
            public Builder dir(String dir) {
                this.dir = dir;
                return this;
            }

            /**
             * <p>The hostname of the node in the on-premises cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>compute000</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The IP address of the node in the on-premises cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The role of the node in the on-premises cluster. Valid values:</p>
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
             * <p>The scheduler type of the node in the on-premises cluster. Valid values:</p>
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

            public NodesInfo build() {
                return new NodesInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodesInfo")
        private java.util.List<NodesInfo> nodesInfo;

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
        public java.util.List<NodesInfo> getNodesInfo() {
            return this.nodesInfo;
        }

        public static final class Builder {
            private java.util.List<NodesInfo> nodesInfo; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.nodesInfo = model.nodesInfo;
            } 

            /**
             * NodesInfo.
             */
            public Builder nodesInfo(java.util.List<NodesInfo> nodesInfo) {
                this.nodesInfo = nodesInfo;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class OnPremiseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(OnPremiseInfo model) {
                this.hostName = model.hostName;
                this.ip = model.ip;
                this.type = model.type;
            } 

            /**
             * <p>The hostname of the management node in the on-premises cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>testecs</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The IP address of the management node in the on-premises cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.<em>.</em></p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The type of the management node in the on-premises cluster. Valid values:</p>
             * <ul>
             * <li>scheduler</li>
             * <li>account</li>
             * <li>account, scheduler</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>scheduler</p>
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
    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class ClusterInfoOnPremiseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OnPremiseInfo")
        private java.util.List<OnPremiseInfo> onPremiseInfo;

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
        public java.util.List<OnPremiseInfo> getOnPremiseInfo() {
            return this.onPremiseInfo;
        }

        public static final class Builder {
            private java.util.List<OnPremiseInfo> onPremiseInfo; 

            private Builder() {
            } 

            private Builder(ClusterInfoOnPremiseInfo model) {
                this.onPremiseInfo = model.onPremiseInfo;
            } 

            /**
             * OnPremiseInfo.
             */
            public Builder onPremiseInfo(java.util.List<OnPremiseInfo> onPremiseInfo) {
                this.onPremiseInfo = onPremiseInfo;
                return this;
            }

            public ClusterInfoOnPremiseInfo build() {
                return new ClusterInfoOnPremiseInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class PostInstallScriptInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private String args;

        @com.aliyun.core.annotation.NameInMap("Url")
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

            private Builder() {
            } 

            private Builder(PostInstallScriptInfo model) {
                this.args = model.args;
                this.url = model.url;
            } 

            /**
             * <p>The parameter used to run the script.</p>
             * 
             * <strong>example:</strong>
             * <p>bash file.sh</p>
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The URL used to download the script.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
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
    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class PostInstallScripts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PostInstallScriptInfo")
        private java.util.List<PostInstallScriptInfo> postInstallScriptInfo;

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
        public java.util.List<PostInstallScriptInfo> getPostInstallScriptInfo() {
            return this.postInstallScriptInfo;
        }

        public static final class Builder {
            private java.util.List<PostInstallScriptInfo> postInstallScriptInfo; 

            private Builder() {
            } 

            private Builder(PostInstallScripts model) {
                this.postInstallScriptInfo = model.postInstallScriptInfo;
            } 

            /**
             * PostInstallScriptInfo.
             */
            public Builder postInstallScriptInfo(java.util.List<PostInstallScriptInfo> postInstallScriptInfo) {
                this.postInstallScriptInfo = postInstallScriptInfo;
                return this;
            }

            public PostInstallScripts build() {
                return new PostInstallScripts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class ClusterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("AddOnsInfo")
        private ClusterInfoAddOnsInfo addOnsInfo;

        @com.aliyun.core.annotation.NameInMap("Applications")
        private Applications applications;

        @com.aliyun.core.annotation.NameInMap("AutoRenew")
        private String autoRenew;

        @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
        private String autoRenewPeriod;

        @com.aliyun.core.annotation.NameInMap("BaseOsTag")
        private String baseOsTag;

        @com.aliyun.core.annotation.NameInMap("ClientVersion")
        private String clientVersion;

        @com.aliyun.core.annotation.NameInMap("ClusterVersion")
        private String clusterVersion;

        @com.aliyun.core.annotation.NameInMap("ComputeSpotPriceLimit")
        private String computeSpotPriceLimit;

        @com.aliyun.core.annotation.NameInMap("ComputeSpotStrategy")
        private String computeSpotStrategy;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeployMode")
        private String deployMode;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("EcsChargeType")
        private String ecsChargeType;

        @com.aliyun.core.annotation.NameInMap("EcsInfo")
        private EcsInfo ecsInfo;

        @com.aliyun.core.annotation.NameInMap("HaEnable")
        private Boolean haEnable;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @com.aliyun.core.annotation.NameInMap("InitialImage")
        private InitialImage initialImage;

        @com.aliyun.core.annotation.NameInMap("KeyPairName")
        private String keyPairName;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private Nodes nodes;

        @com.aliyun.core.annotation.NameInMap("OnPremiseInfo")
        private ClusterInfoOnPremiseInfo onPremiseInfo;

        @com.aliyun.core.annotation.NameInMap("OpenldapPar")
        private String openldapPar;

        @com.aliyun.core.annotation.NameInMap("OsTag")
        private String osTag;

        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("Plugin")
        private String plugin;

        @com.aliyun.core.annotation.NameInMap("PostInstallScripts")
        private PostInstallScripts postInstallScripts;

        @com.aliyun.core.annotation.NameInMap("RamNodeTypes")
        private String ramNodeTypes;

        @com.aliyun.core.annotation.NameInMap("RamRoleName")
        private String ramRoleName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RemoteDirectory")
        private String remoteDirectory;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SccClusterId")
        private String sccClusterId;

        @com.aliyun.core.annotation.NameInMap("SchedulerPreInstall")
        private Integer schedulerPreInstall;

        @com.aliyun.core.annotation.NameInMap("SchedulerType")
        private String schedulerType;

        @com.aliyun.core.annotation.NameInMap("SchedulerVersion")
        private String schedulerVersion;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VolumeId")
        private String volumeId;

        @com.aliyun.core.annotation.NameInMap("VolumeMountpoint")
        private String volumeMountpoint;

        @com.aliyun.core.annotation.NameInMap("VolumeProtocol")
        private String volumeProtocol;

        @com.aliyun.core.annotation.NameInMap("VolumeType")
        private String volumeType;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("WinAdPar")
        private String winAdPar;

        @com.aliyun.core.annotation.NameInMap("WithoutAgent")
        private Integer withoutAgent;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
            this.schedulerVersion = builder.schedulerVersion;
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
         * @return schedulerVersion
         */
        public String getSchedulerVersion() {
            return this.schedulerVersion;
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
            private String schedulerVersion; 
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

            private Builder() {
            } 

            private Builder(ClusterInfo model) {
                this.accountType = model.accountType;
                this.addOnsInfo = model.addOnsInfo;
                this.applications = model.applications;
                this.autoRenew = model.autoRenew;
                this.autoRenewPeriod = model.autoRenewPeriod;
                this.baseOsTag = model.baseOsTag;
                this.clientVersion = model.clientVersion;
                this.clusterVersion = model.clusterVersion;
                this.computeSpotPriceLimit = model.computeSpotPriceLimit;
                this.computeSpotStrategy = model.computeSpotStrategy;
                this.createTime = model.createTime;
                this.deployMode = model.deployMode;
                this.description = model.description;
                this.domain = model.domain;
                this.ecsChargeType = model.ecsChargeType;
                this.ecsInfo = model.ecsInfo;
                this.haEnable = model.haEnable;
                this.id = model.id;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.imageOwnerAlias = model.imageOwnerAlias;
                this.initialImage = model.initialImage;
                this.keyPairName = model.keyPairName;
                this.location = model.location;
                this.name = model.name;
                this.nodes = model.nodes;
                this.onPremiseInfo = model.onPremiseInfo;
                this.openldapPar = model.openldapPar;
                this.osTag = model.osTag;
                this.period = model.period;
                this.periodUnit = model.periodUnit;
                this.plugin = model.plugin;
                this.postInstallScripts = model.postInstallScripts;
                this.ramNodeTypes = model.ramNodeTypes;
                this.ramRoleName = model.ramRoleName;
                this.regionId = model.regionId;
                this.remoteDirectory = model.remoteDirectory;
                this.resourceGroupId = model.resourceGroupId;
                this.sccClusterId = model.sccClusterId;
                this.schedulerPreInstall = model.schedulerPreInstall;
                this.schedulerType = model.schedulerType;
                this.schedulerVersion = model.schedulerVersion;
                this.securityGroupId = model.securityGroupId;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
                this.volumeId = model.volumeId;
                this.volumeMountpoint = model.volumeMountpoint;
                this.volumeProtocol = model.volumeProtocol;
                this.volumeType = model.volumeType;
                this.vpcId = model.vpcId;
                this.winAdPar = model.winAdPar;
                this.withoutAgent = model.withoutAgent;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The server type of the account. Valid values:</p>
             * <ul>
             * <li>nis</li>
             * <li>ldap</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>nis</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The information about the custom component service.</p>
             */
            public Builder addOnsInfo(ClusterInfoAddOnsInfo addOnsInfo) {
                this.addOnsInfo = addOnsInfo;
                return this;
            }

            /**
             * <p>The array of the software in the cluster. The array contains the name and version of the software.</p>
             */
            public Builder applications(Applications applications) {
                this.applications = applications;
                return this;
            }

            /**
             * <p>Specifies whether to enable auto-renewal. The parameter takes effect only when EcsChargeType is set to PrePaid. Valid values:</p>
             * <ul>
             * <li>true: enables auto-renewal.</li>
             * <li>false: disables auto-renewal.</li>
             * </ul>
             * <p>Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRenew(String autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * <p>The auto-renewal period of the subscription compute nodes. The parameter takes effect when AutoRenew is set to true.</p>
             * <ul>
             * <li>If PeriodUnit is set to Week, the valid values of the AutoRenewPeriod parameter are 1, 2, and 3.</li>
             * <li>If PeriodUnit is set to Month, the valid values of the AutoRenewPeriod parameter are 1, 2, 3, 6, and 12.</li>
             * </ul>
             * <p>Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoRenewPeriod(String autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * <p>The image of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_7.2_64</p>
             */
            public Builder baseOsTag(String baseOsTag) {
                this.baseOsTag = baseOsTag;
                return this;
            }

            /**
             * <p>The version of the E-HPC client.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.1</p>
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * <p>The version of the E-HPC cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder clusterVersion(String clusterVersion) {
                this.clusterVersion = clusterVersion;
                return this;
            }

            /**
             * <p>The maximum hourly price of the compute nodes. A maximum of three decimal places can be used in the value of the parameter. The parameter is valid only when the ComputeSpotStrategy parameter is set to SpotWithPriceLimit.</p>
             * 
             * <strong>example:</strong>
             * <p>0.56</p>
             */
            public Builder computeSpotPriceLimit(String computeSpotPriceLimit) {
                this.computeSpotPriceLimit = computeSpotPriceLimit;
                return this;
            }

            /**
             * <p>The bidding method of the compute node. Valid values:</p>
             * <ul>
             * <li>NoSpot: The instance is created as a pay-as-you-go instance.</li>
             * <li>SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</li>
             * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder computeSpotStrategy(String computeSpotStrategy) {
                this.computeSpotStrategy = computeSpotStrategy;
                return this;
            }

            /**
             * <p>The time at which the instance is created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-24T03:18:23.000Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The mode in which the cluster is deployed. Valid values:</p>
             * <ul>
             * <li>Standard: An account node, a scheduling node, a logon node, and multiple compute nodes are separately deployed.</li>
             * <li>Advanced: Two high availability (HA) account nodes, two HA scheduler nodes, one logon node, and multiple compute nodes are separately deployed.</li>
             * <li>Simple: A management node, a logon node, and multiple compute nodes are deployed. The management node consists of an account node and a scheduling node. The logon node and compute nodes are separately deployed.</li>
             * <li>Tiny: The account node, scheduling node, and logon node are deployed on one node. The compute node is separately deployed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Simple</p>
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * <p>The description of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The domain name of the on-premises E-HPC cluster.</p>
             * <p>This parameter takes effect only when the AccoutType parameter is set to Idap.</p>
             * 
             * <strong>example:</strong>
             * <p>ldap</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The billing method of the nodes in the cluster. Valid values:</p>
             * <ul>
             * <li>PostPaid: pay-as-you-go</li>
             * <li>PrePaid: subscription</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder ecsChargeType(String ecsChargeType) {
                this.ecsChargeType = ecsChargeType;
                return this;
            }

            /**
             * <p>The list of ECS instance specifications and quantity.</p>
             */
            public Builder ecsInfo(EcsInfo ecsInfo) {
                this.ecsInfo = ecsInfo;
                return this;
            }

            /**
             * <p>Specifies whether to enable the high availability feature.</p>
             * <blockquote>
             * <p> If high availability is enabled, each management role in the cluster uses both primary and secondary instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder haEnable(Boolean haEnable) {
                this.haEnable = haEnable;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp15de54eet1c43f****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_7_02_64_20G_alibase_20170818****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_for_Image</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The image type. Valid values:</p>
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
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * <p>The image information of the operating systems.</p>
             */
            public Builder initialImage(InitialImage initialImage) {
                this.initialImage = initialImage;
                return this;
            }

            /**
             * <p>The name of the AccessKey pair.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * <p>The location where the cluster is deployed. Valid values:</p>
             * <ul>
             * <li>OnPremise: The node is deployed on a hybrid cloud.</li>
             * <li>PublicCloud: The cluster is deployed on a public cloud.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PublicCloud</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The information of the on-premises node in the cluster.</p>
             */
            public Builder nodes(Nodes nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>The list of on-premises management nodes.</p>
             * <p>This parameter is returned only when the cluster is deployed across hybrid environments and the hybrid-cloud proxy mode is enabled for the cluster.</p>
             */
            public Builder onPremiseInfo(ClusterInfoOnPremiseInfo onPremiseInfo) {
                this.onPremiseInfo = onPremiseInfo;
                return this;
            }

            /**
             * <p>The parameter that is used to connect to the OpenLDAP server.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;LdapServerIp&quot;: &quot;192.168.XX.XX&quot;,
             *     &quot;BaseDn&quot;: &quot;ehpctest&quot;,
             *     &quot;FallbackHomeDir&quot;: &quot;/home&quot;
             * }</p>
             */
            public Builder openldapPar(String openldapPar) {
                this.openldapPar = openldapPar;
                return this;
            }

            /**
             * <p>The operating system tag of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_7.2_64</p>
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * <p>The duration of the subscription. The unit of the duration is specified by the <code>PeriodUnit</code> parameter.</p>
             * <ul>
             * <li>If you set PriceUnit to Year, the valid values of the Period parameter are 1, 2, and 3.</li>
             * <li>If you set PriceUnit to Month, the valid values of the Period parameter are 1, 2, 3, 4, 5, 6, 7, 8, and 9.</li>
             * <li>If you set PriceUnit to Hour, the valid value of the Period parameter is 1.</li>
             * </ul>
             * <p>Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The unit of the subscription duration. Valid value:</p>
             * <ul>
             * <li>Year</li>
             * <li>Month</li>
             * <li>Hour</li>
             * </ul>
             * <p>Default value: Month.</p>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The mode configurations of the plug-in. This parameter takes effect only when the SchedulerType parameter is set to custom.</p>
             * <p>The value must be a JSON string. The parameter contains the following parameters: pluginMod, pluginLocalPath, and pluginOssPath.</p>
             * <ul>
             * <li><p>pluginMod: the mode of the plug-in. The following modes are supported:</p>
             * <ul>
             * <li>oss: The plug-in is downloaded and decompressed from OSS to a local path that is specified by the pluginLocalPath parameter.</li>
             * <li>image: By default, the plug-in is stored in a pre-defined local path that is specified by the pluginLocalPath parameter.</li>
             * </ul>
             * </li>
             * <li><p>pluginLocalPath: the local path where the plug-in is stored. We recommend that you select a shared directory in the oss mode and a non-shared directory in the image mode.</p>
             * </li>
             * <li><p>pluginOssPath: the remote path where the plug-in is stored in OSS. This parameter takes effect only if you set the pluginMod parameter to oss.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;pluginMod&quot;:&quot;image&quot;,&quot;pluginLocalPath&quot;:&quot;/opt/plugin&quot;}</p>
             */
            public Builder plugin(String plugin) {
                this.plugin = plugin;
                return this;
            }

            /**
             * <p>The list of post-installation scripts</p>
             */
            public Builder postInstallScripts(PostInstallScripts postInstallScripts) {
                this.postInstallScripts = postInstallScripts;
                return this;
            }

            /**
             * <p>The node type details of the instance RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;manager&quot;, &quot;compute&quot;]</p>
             */
            public Builder ramNodeTypes(String ramNodeTypes) {
                this.ramNodeTypes = ramNodeTypes;
                return this;
            }

            /**
             * <p>The name of the instance Resource Access Management (RAM) role.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunEHPCFullAccess</p>
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The remote directory on which the file system is mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>NasMountpoint:/RemoteDirectory</p>
             */
            public Builder remoteDirectory(String remoteDirectory) {
                this.remoteDirectory = remoteDirectory;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek23szz5i2****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the Super Computing Cluster (SCC) instance. If the cluster is not an SCC instance, a null string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>00b648b****</p>
             */
            public Builder sccClusterId(String sccClusterId) {
                this.sccClusterId = sccClusterId;
                return this;
            }

            /**
             * <p>Specifies whether the scheduler is preinstalled for the image. Valid values:</p>
             * <ul>
             * <li>true: The scheduler is preinstalled. When you create a node or scale out a cluster, you do not need to install the scheduler.</li>
             * <li>false: The scheduler is not preinstalled. When you create or add a cluster, you must install the scheduler.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder schedulerPreInstall(Integer schedulerPreInstall) {
                this.schedulerPreInstall = schedulerPreInstall;
                return this;
            }

            /**
             * <p>The type of the scheduler. Valid values:</p>
             * <ul>
             * <li>pbs</li>
             * <li>slurm</li>
             * <li>opengridscheduler</li>
             * <li>deadline</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pbs</p>
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * <p>The version of the scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>18.1.1</p>
             */
            public Builder schedulerVersion(String schedulerVersion) {
                this.schedulerVersion = schedulerVersion;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1asugr34gzn****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The status of the cluster. Valid values:</p>
             * <ul>
             * <li>uninit: The cluster is not initialized.</li>
             * <li>creating: The cluster is being created.</li>
             * <li>init: The cluster is being initialized.</li>
             * <li>running: The cluster is running.</li>
             * <li>exception: The cluster encounters an exception.</li>
             * <li>releasing: The cluster is being released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>creating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The vSwitch ID. E-HPC can be deployed only in VPCs.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1e47optm9g58zcu****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the File Storage NAS file system. NAS file systems cannot be automatically created.</p>
             * 
             * <strong>example:</strong>
             * <p>008b64****</p>
             */
            public Builder volumeId(String volumeId) {
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
                this.volumeMountpoint = volumeMountpoint;
                return this;
            }

            /**
             * <p>The type of the protocol that is used by the file system. Valid values:</p>
             * <ul>
             * <li>nfs</li>
             * <li>smb</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>nfs</p>
             */
            public Builder volumeProtocol(String volumeProtocol) {
                this.volumeProtocol = volumeProtocol;
                return this;
            }

            /**
             * <p>The type of the network shared storage. Valid value: NAS.</p>
             * 
             * <strong>example:</strong>
             * <p>NAS</p>
             */
            public Builder volumeType(String volumeType) {
                this.volumeType = volumeType;
                return this;
            }

            /**
             * <p>The VPC ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1pxkcvmmz53ki89****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The parameter that is used to connect to the Windows AD server.</p>
             * 
             * <strong>example:</strong>
             * <p>{	&quot;AdUser&quot;: &quot;Administrator&quot;,	&quot;AdUserPasswd&quot;: &quot;xxxxxx&quot;,	&quot;AdDc&quot;: &quot;ad-hybrid001.ehpcad.com&quot;,	&quot;AdIp&quot;: &quot;192.168.XX.XX&quot;}</p>
             */
            public Builder winAdPar(String winAdPar) {
                this.winAdPar = winAdPar;
                return this;
            }

            /**
             * <p>Specifies whether to not install the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder withoutAgent(Integer withoutAgent) {
                this.withoutAgent = withoutAgent;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-k</p>
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
