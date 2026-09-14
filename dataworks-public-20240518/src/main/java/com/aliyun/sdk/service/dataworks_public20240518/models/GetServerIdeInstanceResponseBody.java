// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetServerIdeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetServerIdeInstanceResponseBody</p>
 */
public class GetServerIdeInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instance")
    private Instance instance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetServerIdeInstanceResponseBody(Builder builder) {
        this.instance = builder.instance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServerIdeInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Instance instance; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetServerIdeInstanceResponseBody model) {
            this.instance = model.instance;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the personal development environment instance.</p>
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetServerIdeInstanceResponseBody build() {
            return new GetServerIdeInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServerIdeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServerIdeInstanceResponseBody</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private UserInfo(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.id = builder.id;
            this.securityToken = builder.securityToken;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String id; 
            private String securityToken; 
            private String type; 

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.accessKeyId = model.accessKeyId;
                this.id = model.id;
                this.securityToken = model.securityToken;
                this.type = model.type;
            } 

            /**
             * <p>The temporary AccessKey ID used for credential injection.</p>
             * 
             * <strong>example:</strong>
             * <p>STS.N*********7</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>The account ID of the proxied user.</p>
             * 
             * <strong>example:</strong>
             * <p>20933221576142****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The temporary security token used for credential injection.</p>
             * 
             * <strong>example:</strong>
             * <p>DFE32G*******</p>
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * <p>The user type. Valid values: customer (Alibaba Cloud account), sub (RAM user), and AssumedRoleUser (RAM role).</p>
             * 
             * <strong>example:</strong>
             * <p>sub</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServerIdeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServerIdeInstanceResponseBody</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssumeRoleFor")
        private String assumeRoleFor;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        private String roleType;

        @com.aliyun.core.annotation.NameInMap("UserInfo")
        private UserInfo userInfo;

        private Roles(Builder builder) {
            this.assumeRoleFor = builder.assumeRoleFor;
            this.policy = builder.policy;
            this.roleArn = builder.roleArn;
            this.roleType = builder.roleType;
            this.userInfo = builder.userInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return assumeRoleFor
         */
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        /**
         * @return userInfo
         */
        public UserInfo getUserInfo() {
            return this.userInfo;
        }

        public static final class Builder {
            private String assumeRoleFor; 
            private String policy; 
            private String roleArn; 
            private String roleType; 
            private UserInfo userInfo; 

            private Builder() {
            } 

            private Builder(Roles model) {
                this.assumeRoleFor = model.assumeRoleFor;
                this.policy = model.policy;
                this.roleArn = model.roleArn;
                this.roleType = model.roleType;
                this.userInfo = model.userInfo;
            } 

            /**
             * <p>The Alibaba Cloud account ID of the principal that owns the assumed role.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789012****</p>
             */
            public Builder assumeRoleFor(String assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * <p>The policy used to further restrict the permissions of the role.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The ARN of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123456789012****:role/DataWorksRole</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>The role assumption type. Valid values: service (assumed by a service) and user (assumed by a user).</p>
             * 
             * <strong>example:</strong>
             * <p>service</p>
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * <p>The information of the proxied user.</p>
             */
            public Builder userInfo(UserInfo userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServerIdeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServerIdeInstanceResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private java.util.List<Roles> roles;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Configs(Builder builder) {
            this.key = builder.key;
            this.roles = builder.roles;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return roles
         */
        public java.util.List<Roles> getRoles() {
            return this.roles;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<Roles> roles; 
            private String type; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.key = model.key;
                this.roles = model.roles;
                this.type = model.type;
            } 

            /**
             * <p>The identifier key of the credential configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The list of roles in the credential configuration.</p>
             */
            public Builder roles(java.util.List<Roles> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * <p>The credential configuration type. Valid values: Role (single role assumption) and RoleChain (role chain assumption).</p>
             * 
             * <strong>example:</strong>
             * <p>RoleChain</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServerIdeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServerIdeInstanceResponseBody</p>
     */
    public static class CredentialConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunEnvRoleKey")
        private String aliyunEnvRoleKey;

        @com.aliyun.core.annotation.NameInMap("Configs")
        private java.util.List<Configs> configs;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        private CredentialConfig(Builder builder) {
            this.aliyunEnvRoleKey = builder.aliyunEnvRoleKey;
            this.configs = builder.configs;
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CredentialConfig create() {
            return builder().build();
        }

        /**
         * @return aliyunEnvRoleKey
         */
        public String getAliyunEnvRoleKey() {
            return this.aliyunEnvRoleKey;
        }

        /**
         * @return configs
         */
        public java.util.List<Configs> getConfigs() {
            return this.configs;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private String aliyunEnvRoleKey; 
            private java.util.List<Configs> configs; 
            private Boolean enable; 

            private Builder() {
            } 

            private Builder(CredentialConfig model) {
                this.aliyunEnvRoleKey = model.aliyunEnvRoleKey;
                this.configs = model.configs;
                this.enable = model.enable;
            } 

            /**
             * <p>The environment variable role key.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder aliyunEnvRoleKey(String aliyunEnvRoleKey) {
                this.aliyunEnvRoleKey = aliyunEnvRoleKey;
                return this;
            }

            /**
             * <p>The list of credential configurations.</p>
             */
            public Builder configs(java.util.List<Configs> configs) {
                this.configs = configs;
                return this;
            }

            /**
             * <p>Indicates whether credential injection is enabled.</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public CredentialConfig build() {
                return new CredentialConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServerIdeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServerIdeInstanceResponseBody</p>
     */
    public static class Datasets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtOptions")
        private String extOptions;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("ReadOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private Datasets(Builder builder) {
            this.extOptions = builder.extOptions;
            this.identifier = builder.identifier;
            this.mountPath = builder.mountPath;
            this.readOnly = builder.readOnly;
            this.uri = builder.uri;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datasets create() {
            return builder().build();
        }

        /**
         * @return extOptions
         */
        public String getExtOptions() {
            return this.extOptions;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String extOptions; 
            private String identifier; 
            private String mountPath; 
            private Boolean readOnly; 
            private String uri; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(Datasets model) {
                this.extOptions = model.extOptions;
                this.identifier = model.identifier;
                this.mountPath = model.mountPath;
                this.readOnly = model.readOnly;
                this.uri = model.uri;
                this.version = model.version;
            } 

            /**
             * <p>The custom mount properties of the dataset. The content is passed as mount options.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;fs.oss.download.thread.concurrency&quot;:&quot;10&quot;}</p>
             */
            public Builder extOptions(String extOptions) {
                this.extOptions = extOptions;
                return this;
            }

            /**
             * <p>The dataset identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>d-vsqjvs****rp5l206u</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The mount path of the dataset in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/data</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>Indicates whether the dataset is mounted in read-only mode.</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>The URI of the storage service directory used for direct mounting.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://example-bucket/data/</p>
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            /**
             * <p>The dataset version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public Datasets build() {
                return new Datasets(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServerIdeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServerIdeInstanceResponseBody</p>
     */
    public static class ForwardInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private java.util.List<String> accessType;

        @com.aliyun.core.annotation.NameInMap("ContainerName")
        private String containerName;

        @com.aliyun.core.annotation.NameInMap("EipAllocationId")
        private String eipAllocationId;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("ExternalPort")
        private String externalPort;

        @com.aliyun.core.annotation.NameInMap("ForwardPort")
        private String forwardPort;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("SSHPublicKey")
        private String SSHPublicKey;

        private ForwardInfos(Builder builder) {
            this.accessType = builder.accessType;
            this.containerName = builder.containerName;
            this.eipAllocationId = builder.eipAllocationId;
            this.enable = builder.enable;
            this.externalPort = builder.externalPort;
            this.forwardPort = builder.forwardPort;
            this.name = builder.name;
            this.natGatewayId = builder.natGatewayId;
            this.SSHPublicKey = builder.SSHPublicKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardInfos create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public java.util.List<String> getAccessType() {
            return this.accessType;
        }

        /**
         * @return containerName
         */
        public String getContainerName() {
            return this.containerName;
        }

        /**
         * @return eipAllocationId
         */
        public String getEipAllocationId() {
            return this.eipAllocationId;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return externalPort
         */
        public String getExternalPort() {
            return this.externalPort;
        }

        /**
         * @return forwardPort
         */
        public String getForwardPort() {
            return this.forwardPort;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return SSHPublicKey
         */
        public String getSSHPublicKey() {
            return this.SSHPublicKey;
        }

        public static final class Builder {
            private java.util.List<String> accessType; 
            private String containerName; 
            private String eipAllocationId; 
            private Boolean enable; 
            private String externalPort; 
            private String forwardPort; 
            private String name; 
            private String natGatewayId; 
            private String SSHPublicKey; 

            private Builder() {
            } 

            private Builder(ForwardInfos model) {
                this.accessType = model.accessType;
                this.containerName = model.containerName;
                this.eipAllocationId = model.eipAllocationId;
                this.enable = model.enable;
                this.externalPort = model.externalPort;
                this.forwardPort = model.forwardPort;
                this.name = model.name;
                this.natGatewayId = model.natGatewayId;
                this.SSHPublicKey = model.SSHPublicKey;
            } 

            /**
             * <p>The list of access types.</p>
             */
            public Builder accessType(java.util.List<String> accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>The name of the target container.</p>
             * 
             * <strong>example:</strong>
             * <p>dsw-notebook</p>
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * <p>The instance ID of the public Elastic IP Address (EIP).</p>
             * 
             * <strong>example:</strong>
             * <p>eip-bp1****</p>
             */
            public Builder eipAllocationId(String eipAllocationId) {
                this.eipAllocationId = eipAllocationId;
                return this;
            }

            /**
             * <p>Indicates whether this port forwarding configuration is enabled.</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The mapped public port.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder externalPort(String externalPort) {
                this.externalPort = externalPort;
                return this;
            }

            /**
             * <p>The target port inside the instance container.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder forwardPort(String forwardPort) {
                this.forwardPort = forwardPort;
                return this;
            }

            /**
             * <p>The name of the port forwarding configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>ssh</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The NAT gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-bp1****</p>
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * <p>The public key used for SSH access.</p>
             * 
             * <strong>example:</strong>
             * <p>ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQ****</p>
             */
            public Builder SSHPublicKey(String SSHPublicKey) {
                this.SSHPublicKey = SSHPublicKey;
                return this;
            }

            public ForwardInfos build() {
                return new ForwardInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServerIdeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServerIdeInstanceResponseBody</p>
     */
    public static class UserVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForwardInfos")
        private java.util.List<ForwardInfos> forwardInfos;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private UserVpc(Builder builder) {
            this.forwardInfos = builder.forwardInfos;
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserVpc create() {
            return builder().build();
        }

        /**
         * @return forwardInfos
         */
        public java.util.List<ForwardInfos> getForwardInfos() {
            return this.forwardInfos;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List<ForwardInfos> forwardInfos; 
            private String securityGroupId; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(UserVpc model) {
                this.forwardInfos = model.forwardInfos;
                this.securityGroupId = model.securityGroupId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The list of port forwarding configurations.</p>
             */
            public Builder forwardInfos(java.util.List<ForwardInfos> forwardInfos) {
                this.forwardInfos = forwardInfos;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public UserVpc build() {
                return new UserVpc(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServerIdeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServerIdeInstanceResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CredentialConfig")
        private CredentialConfig credentialConfig;

        @com.aliyun.core.annotation.NameInMap("Cu")
        private Integer cu;

        @com.aliyun.core.annotation.NameInMap("Datasets")
        private java.util.List<Datasets> datasets;

        @com.aliyun.core.annotation.NameInMap("FailReason")
        private String failReason;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private Long resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserVpc")
        private UserVpc userVpc;

        private Instance(Builder builder) {
            this.createTime = builder.createTime;
            this.credentialConfig = builder.credentialConfig;
            this.cu = builder.cu;
            this.datasets = builder.datasets;
            this.failReason = builder.failReason;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageUrl = builder.imageUrl;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.ownerId = builder.ownerId;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceGroupName = builder.resourceGroupName;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.userVpc = builder.userVpc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return credentialConfig
         */
        public CredentialConfig getCredentialConfig() {
            return this.credentialConfig;
        }

        /**
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
        }

        /**
         * @return datasets
         */
        public java.util.List<Datasets> getDatasets() {
            return this.datasets;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
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
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return resourceGroupId
         */
        public Long getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userVpc
         */
        public UserVpc getUserVpc() {
            return this.userVpc;
        }

        public static final class Builder {
            private Long createTime; 
            private CredentialConfig credentialConfig; 
            private Integer cu; 
            private java.util.List<Datasets> datasets; 
            private String failReason; 
            private String imageId; 
            private String imageName; 
            private String imageUrl; 
            private String instanceId; 
            private String instanceName; 
            private String ownerId; 
            private Long projectId; 
            private String projectName; 
            private Long resourceGroupId; 
            private String resourceGroupName; 
            private String status; 
            private Long updateTime; 
            private UserVpc userVpc; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.createTime = model.createTime;
                this.credentialConfig = model.credentialConfig;
                this.cu = model.cu;
                this.datasets = model.datasets;
                this.failReason = model.failReason;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.imageUrl = model.imageUrl;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.ownerId = model.ownerId;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceGroupName = model.resourceGroupName;
                this.status = model.status;
                this.updateTime = model.updateTime;
                this.userVpc = model.userVpc;
            } 

            /**
             * <p>The time when the instance was created. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1756000000000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The credential injection configuration of the instance. After this feature is enabled, you can use the default RAM role chain or specify a custom RAM role.</p>
             */
            public Builder credentialConfig(CredentialConfig credentialConfig) {
                this.credentialConfig = credentialConfig;
                return this;
            }

            /**
             * <p>The number of CUs used by the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The list of datasets mounted to the instance.</p>
             */
            public Builder datasets(java.util.List<Datasets> datasets) {
                this.datasets = datasets;
                return this;
            }

            /**
             * <p>The reason why the instance entered the failed state.</p>
             * 
             * <strong>example:</strong>
             * <p>ImagePullBackOff</p>
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * <p>The ID of the image used by the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>System_serveride_notebook_20240822</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>serveride_notebook</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The image URL.</p>
             * 
             * <strong>example:</strong>
             * <p>registry.cn-hangzhou.aliyuncs.com/example/serveride:latest</p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The personal development environment instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>699573</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the personal development environment instance.</p>
             * 
             * <strong>example:</strong>
             * <p>notebook_dev</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The account ID of the user who owns the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>20933221576142****</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The DataWorks workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The DataWorks workspace name.</p>
             * 
             * <strong>example:</strong>
             * <p>example_project</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The internal numeric ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>9876543210</p>
             */
            public Builder resourceGroupId(Long resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The resource group name.</p>
             * 
             * <strong>example:</strong>
             * <p>serverless_group</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * <p>The instance status. Valid values: Creating, Starting, Running, Stopping, Stopped, Updating, Deleting, DELETED, Failed, Arrearage, Saving, SaveFailed, and Saved.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the instance was last updated. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1756003600000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The VPC configuration used by the instance.</p>
             */
            public Builder userVpc(UserVpc userVpc) {
                this.userVpc = userVpc;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
