// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnvResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnvResourceResponseBody</p>
 */
public class DescribeEnvResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("EnvResource")
    private EnvResource envResource;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeEnvResourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.envResource = builder.envResource;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnvResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return envResource
     */
    public EnvResource getEnvResource() {
        return this.envResource;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private EnvResource envResource; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * EnvResource.
         */
        public Builder envResource(EnvResource envResource) {
            this.envResource = envResource;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEnvResourceResponseBody build() {
            return new DescribeEnvResourceResponseBody(this);
        } 

    } 

    public static class SecurityGroup extends TeaModel {
        @NameInMap("Id")
        private String id;

        private SecurityGroup(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroup create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public SecurityGroup build() {
                return new SecurityGroup(this);
            } 

        } 

    }
    public static class DefaultSecurityGroups extends TeaModel {
        @NameInMap("SecurityGroup")
        private java.util.List < SecurityGroup> securityGroup;

        private DefaultSecurityGroups(Builder builder) {
            this.securityGroup = builder.securityGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultSecurityGroups create() {
            return builder().build();
        }

        /**
         * @return securityGroup
         */
        public java.util.List < SecurityGroup> getSecurityGroup() {
            return this.securityGroup;
        }

        public static final class Builder {
            private java.util.List < SecurityGroup> securityGroup; 

            /**
             * SecurityGroup.
             */
            public Builder securityGroup(java.util.List < SecurityGroup> securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            public DefaultSecurityGroups build() {
                return new DefaultSecurityGroups(this);
            } 

        } 

    }
    public static class Domain extends TeaModel {
        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("HostedBy")
        private String hostedBy;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("ManagedBy")
        private String managedBy;

        @NameInMap("SubDomain")
        private String subDomain;

        private Domain(Builder builder) {
            this.domainName = builder.domainName;
            this.hostedBy = builder.hostedBy;
            this.isDefault = builder.isDefault;
            this.managedBy = builder.managedBy;
            this.subDomain = builder.subDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domain create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return hostedBy
         */
        public String getHostedBy() {
            return this.hostedBy;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return managedBy
         */
        public String getManagedBy() {
            return this.managedBy;
        }

        /**
         * @return subDomain
         */
        public String getSubDomain() {
            return this.subDomain;
        }

        public static final class Builder {
            private String domainName; 
            private String hostedBy; 
            private Boolean isDefault; 
            private String managedBy; 
            private String subDomain; 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * HostedBy.
             */
            public Builder hostedBy(String hostedBy) {
                this.hostedBy = hostedBy;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * ManagedBy.
             */
            public Builder managedBy(String managedBy) {
                this.managedBy = managedBy;
                return this;
            }

            /**
             * SubDomain.
             */
            public Builder subDomain(String subDomain) {
                this.subDomain = subDomain;
                return this;
            }

            public Domain build() {
                return new Domain(this);
            } 

        } 

    }
    public static class Domains extends TeaModel {
        @NameInMap("Domain")
        private java.util.List < Domain> domain;

        private Domains(Builder builder) {
            this.domain = builder.domain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public java.util.List < Domain> getDomain() {
            return this.domain;
        }

        public static final class Builder {
            private java.util.List < Domain> domain; 

            /**
             * Domain.
             */
            public Builder domain(java.util.List < Domain> domain) {
                this.domain = domain;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
    public static class Instance extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Imported")
        private Boolean imported;

        private Instance(Builder builder) {
            this.id = builder.id;
            this.imported = builder.imported;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return imported
         */
        public Boolean getImported() {
            return this.imported;
        }

        public static final class Builder {
            private String id; 
            private Boolean imported; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Imported.
             */
            public Builder imported(Boolean imported) {
                this.imported = imported;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("Instance")
        private java.util.List < Instance> instance;

        private Instances(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    public static class Listener extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        private Listener(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listener create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Listener build() {
                return new Listener(this);
            } 

        } 

    }
    public static class Listeners extends TeaModel {
        @NameInMap("Listener")
        private java.util.List < Listener> listener;

        private Listeners(Builder builder) {
            this.listener = builder.listener;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listeners create() {
            return builder().build();
        }

        /**
         * @return listener
         */
        public java.util.List < Listener> getListener() {
            return this.listener;
        }

        public static final class Builder {
            private java.util.List < Listener> listener; 

            /**
             * Listener.
             */
            public Builder listener(java.util.List < Listener> listener) {
                this.listener = listener;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
    public static class LoadBalancer extends TeaModel {
        @NameInMap("AddressType")
        private String addressType;

        @NameInMap("Id")
        private String id;

        @NameInMap("Imported")
        private Boolean imported;

        @NameInMap("Listeners")
        private Listeners listeners;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        private LoadBalancer(Builder builder) {
            this.addressType = builder.addressType;
            this.id = builder.id;
            this.imported = builder.imported;
            this.listeners = builder.listeners;
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancer create() {
            return builder().build();
        }

        /**
         * @return addressType
         */
        public String getAddressType() {
            return this.addressType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return imported
         */
        public Boolean getImported() {
            return this.imported;
        }

        /**
         * @return listeners
         */
        public Listeners getListeners() {
            return this.listeners;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String addressType; 
            private String id; 
            private Boolean imported; 
            private Listeners listeners; 
            private Integer port; 
            private String protocol; 

            /**
             * AddressType.
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
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
             * Imported.
             */
            public Builder imported(Boolean imported) {
                this.imported = imported;
                return this;
            }

            /**
             * Listeners.
             */
            public Builder listeners(Listeners listeners) {
                this.listeners = listeners;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public LoadBalancer build() {
                return new LoadBalancer(this);
            } 

        } 

    }
    public static class LoadBalancers extends TeaModel {
        @NameInMap("LoadBalancer")
        private java.util.List < LoadBalancer> loadBalancer;

        private LoadBalancers(Builder builder) {
            this.loadBalancer = builder.loadBalancer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancers create() {
            return builder().build();
        }

        /**
         * @return loadBalancer
         */
        public java.util.List < LoadBalancer> getLoadBalancer() {
            return this.loadBalancer;
        }

        public static final class Builder {
            private java.util.List < LoadBalancer> loadBalancer; 

            /**
             * LoadBalancer.
             */
            public Builder loadBalancer(java.util.List < LoadBalancer> loadBalancer) {
                this.loadBalancer = loadBalancer;
                return this;
            }

            public LoadBalancers build() {
                return new LoadBalancers(this);
            } 

        } 

    }
    public static class MonitorGroup extends TeaModel {
        @NameInMap("Id")
        private String id;

        private MonitorGroup(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorGroup create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public MonitorGroup build() {
                return new MonitorGroup(this);
            } 

        } 

    }
    public static class RdsInstance extends TeaModel {
        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("Id")
        private String id;

        @NameInMap("Imported")
        private Boolean imported;

        private RdsInstance(Builder builder) {
            this.accountName = builder.accountName;
            this.databaseName = builder.databaseName;
            this.id = builder.id;
            this.imported = builder.imported;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RdsInstance create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return imported
         */
        public Boolean getImported() {
            return this.imported;
        }

        public static final class Builder {
            private String accountName; 
            private String databaseName; 
            private String id; 
            private Boolean imported; 

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
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
             * Imported.
             */
            public Builder imported(Boolean imported) {
                this.imported = imported;
                return this;
            }

            public RdsInstance build() {
                return new RdsInstance(this);
            } 

        } 

    }
    public static class RdsInstances extends TeaModel {
        @NameInMap("RdsInstance")
        private java.util.List < RdsInstance> rdsInstance;

        private RdsInstances(Builder builder) {
            this.rdsInstance = builder.rdsInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RdsInstances create() {
            return builder().build();
        }

        /**
         * @return rdsInstance
         */
        public java.util.List < RdsInstance> getRdsInstance() {
            return this.rdsInstance;
        }

        public static final class Builder {
            private java.util.List < RdsInstance> rdsInstance; 

            /**
             * RdsInstance.
             */
            public Builder rdsInstance(java.util.List < RdsInstance> rdsInstance) {
                this.rdsInstance = rdsInstance;
                return this;
            }

            public RdsInstances build() {
                return new RdsInstances(this);
            } 

        } 

    }
    public static class ScalingGroup extends TeaModel {
        @NameInMap("Id")
        private String id;

        private ScalingGroup(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingGroup create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public ScalingGroup build() {
                return new ScalingGroup(this);
            } 

        } 

    }
    public static class VSwitch extends TeaModel {
        @NameInMap("Id")
        private String id;

        private VSwitch(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitch create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public VSwitch build() {
                return new VSwitch(this);
            } 

        } 

    }
    public static class VSwitches extends TeaModel {
        @NameInMap("VSwitch")
        private java.util.List < VSwitch> vSwitch;

        private VSwitches(Builder builder) {
            this.vSwitch = builder.vSwitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitches create() {
            return builder().build();
        }

        /**
         * @return vSwitch
         */
        public java.util.List < VSwitch> getVSwitch() {
            return this.vSwitch;
        }

        public static final class Builder {
            private java.util.List < VSwitch> vSwitch; 

            /**
             * VSwitch.
             */
            public Builder vSwitch(java.util.List < VSwitch> vSwitch) {
                this.vSwitch = vSwitch;
                return this;
            }

            public VSwitches build() {
                return new VSwitches(this);
            } 

        } 

    }
    public static class Vpc extends TeaModel {
        @NameInMap("Id")
        private String id;

        private Vpc(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpc create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Vpc build() {
                return new Vpc(this);
            } 

        } 

    }
    public static class EnvResource extends TeaModel {
        @NameInMap("DefaultSecurityGroups")
        private DefaultSecurityGroups defaultSecurityGroups;

        @NameInMap("Domains")
        private Domains domains;

        @NameInMap("EnvId")
        private String envId;

        @NameInMap("EnvName")
        private String envName;

        @NameInMap("Instances")
        private Instances instances;

        @NameInMap("LaunchConfigurationId")
        private String launchConfigurationId;

        @NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @NameInMap("LoadBalancers")
        private LoadBalancers loadBalancers;

        @NameInMap("MonitorGroup")
        private MonitorGroup monitorGroup;

        @NameInMap("RdsInstances")
        private RdsInstances rdsInstances;

        @NameInMap("ScalingGroup")
        private ScalingGroup scalingGroup;

        @NameInMap("VSwitches")
        private VSwitches vSwitches;

        @NameInMap("Vpc")
        private Vpc vpc;

        private EnvResource(Builder builder) {
            this.defaultSecurityGroups = builder.defaultSecurityGroups;
            this.domains = builder.domains;
            this.envId = builder.envId;
            this.envName = builder.envName;
            this.instances = builder.instances;
            this.launchConfigurationId = builder.launchConfigurationId;
            this.launchTemplateId = builder.launchTemplateId;
            this.loadBalancers = builder.loadBalancers;
            this.monitorGroup = builder.monitorGroup;
            this.rdsInstances = builder.rdsInstances;
            this.scalingGroup = builder.scalingGroup;
            this.vSwitches = builder.vSwitches;
            this.vpc = builder.vpc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvResource create() {
            return builder().build();
        }

        /**
         * @return defaultSecurityGroups
         */
        public DefaultSecurityGroups getDefaultSecurityGroups() {
            return this.defaultSecurityGroups;
        }

        /**
         * @return domains
         */
        public Domains getDomains() {
            return this.domains;
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        /**
         * @return envName
         */
        public String getEnvName() {
            return this.envName;
        }

        /**
         * @return instances
         */
        public Instances getInstances() {
            return this.instances;
        }

        /**
         * @return launchConfigurationId
         */
        public String getLaunchConfigurationId() {
            return this.launchConfigurationId;
        }

        /**
         * @return launchTemplateId
         */
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        /**
         * @return loadBalancers
         */
        public LoadBalancers getLoadBalancers() {
            return this.loadBalancers;
        }

        /**
         * @return monitorGroup
         */
        public MonitorGroup getMonitorGroup() {
            return this.monitorGroup;
        }

        /**
         * @return rdsInstances
         */
        public RdsInstances getRdsInstances() {
            return this.rdsInstances;
        }

        /**
         * @return scalingGroup
         */
        public ScalingGroup getScalingGroup() {
            return this.scalingGroup;
        }

        /**
         * @return vSwitches
         */
        public VSwitches getVSwitches() {
            return this.vSwitches;
        }

        /**
         * @return vpc
         */
        public Vpc getVpc() {
            return this.vpc;
        }

        public static final class Builder {
            private DefaultSecurityGroups defaultSecurityGroups; 
            private Domains domains; 
            private String envId; 
            private String envName; 
            private Instances instances; 
            private String launchConfigurationId; 
            private String launchTemplateId; 
            private LoadBalancers loadBalancers; 
            private MonitorGroup monitorGroup; 
            private RdsInstances rdsInstances; 
            private ScalingGroup scalingGroup; 
            private VSwitches vSwitches; 
            private Vpc vpc; 

            /**
             * DefaultSecurityGroups.
             */
            public Builder defaultSecurityGroups(DefaultSecurityGroups defaultSecurityGroups) {
                this.defaultSecurityGroups = defaultSecurityGroups;
                return this;
            }

            /**
             * Domains.
             */
            public Builder domains(Domains domains) {
                this.domains = domains;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * EnvName.
             */
            public Builder envName(String envName) {
                this.envName = envName;
                return this;
            }

            /**
             * Instances.
             */
            public Builder instances(Instances instances) {
                this.instances = instances;
                return this;
            }

            /**
             * LaunchConfigurationId.
             */
            public Builder launchConfigurationId(String launchConfigurationId) {
                this.launchConfigurationId = launchConfigurationId;
                return this;
            }

            /**
             * LaunchTemplateId.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * LoadBalancers.
             */
            public Builder loadBalancers(LoadBalancers loadBalancers) {
                this.loadBalancers = loadBalancers;
                return this;
            }

            /**
             * MonitorGroup.
             */
            public Builder monitorGroup(MonitorGroup monitorGroup) {
                this.monitorGroup = monitorGroup;
                return this;
            }

            /**
             * RdsInstances.
             */
            public Builder rdsInstances(RdsInstances rdsInstances) {
                this.rdsInstances = rdsInstances;
                return this;
            }

            /**
             * ScalingGroup.
             */
            public Builder scalingGroup(ScalingGroup scalingGroup) {
                this.scalingGroup = scalingGroup;
                return this;
            }

            /**
             * VSwitches.
             */
            public Builder vSwitches(VSwitches vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * Vpc.
             */
            public Builder vpc(Vpc vpc) {
                this.vpc = vpc;
                return this;
            }

            public EnvResource build() {
                return new EnvResource(this);
            } 

        } 

    }
}
