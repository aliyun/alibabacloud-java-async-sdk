// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateContainerGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateContainerGroupRequest</p>
 */
public class UpdateContainerGroupRequest extends Request {
    @Query
    @NameInMap("DnsConfig")
    private DnsConfig dnsConfig;

    @Query
    @NameInMap("AcrRegistryInfo")
    private java.util.List < AcrRegistryInfo> acrRegistryInfo;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Container")
    private java.util.List < Container> container;

    @Query
    @NameInMap("ContainerGroupId")
    @Validation(required = true)
    private String containerGroupId;

    @Query
    @NameInMap("Cpu")
    private Float cpu;

    @Query
    @NameInMap("ImageRegistryCredential")
    private java.util.List < ImageRegistryCredential> imageRegistryCredential;

    @Query
    @NameInMap("InitContainer")
    private java.util.List < InitContainer> initContainer;

    @Query
    @NameInMap("Memory")
    private Float memory;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RestartPolicy")
    private String restartPolicy;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("UpdateType")
    private String updateType;

    @Query
    @NameInMap("Volume")
    private java.util.List < Volume> volume;

    private UpdateContainerGroupRequest(Builder builder) {
        super(builder);
        this.dnsConfig = builder.dnsConfig;
        this.acrRegistryInfo = builder.acrRegistryInfo;
        this.clientToken = builder.clientToken;
        this.container = builder.container;
        this.containerGroupId = builder.containerGroupId;
        this.cpu = builder.cpu;
        this.imageRegistryCredential = builder.imageRegistryCredential;
        this.initContainer = builder.initContainer;
        this.memory = builder.memory;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restartPolicy = builder.restartPolicy;
        this.tag = builder.tag;
        this.updateType = builder.updateType;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContainerGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dnsConfig
     */
    public DnsConfig getDnsConfig() {
        return this.dnsConfig;
    }

    /**
     * @return acrRegistryInfo
     */
    public java.util.List < AcrRegistryInfo> getAcrRegistryInfo() {
        return this.acrRegistryInfo;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return container
     */
    public java.util.List < Container> getContainer() {
        return this.container;
    }

    /**
     * @return containerGroupId
     */
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
    }

    /**
     * @return imageRegistryCredential
     */
    public java.util.List < ImageRegistryCredential> getImageRegistryCredential() {
        return this.imageRegistryCredential;
    }

    /**
     * @return initContainer
     */
    public java.util.List < InitContainer> getInitContainer() {
        return this.initContainer;
    }

    /**
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return restartPolicy
     */
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return updateType
     */
    public String getUpdateType() {
        return this.updateType;
    }

    /**
     * @return volume
     */
    public java.util.List < Volume> getVolume() {
        return this.volume;
    }

    public static final class Builder extends Request.Builder<UpdateContainerGroupRequest, Builder> {
        private DnsConfig dnsConfig; 
        private java.util.List < AcrRegistryInfo> acrRegistryInfo; 
        private String clientToken; 
        private java.util.List < Container> container; 
        private String containerGroupId; 
        private Float cpu; 
        private java.util.List < ImageRegistryCredential> imageRegistryCredential; 
        private java.util.List < InitContainer> initContainer; 
        private Float memory; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restartPolicy; 
        private java.util.List < Tag> tag; 
        private String updateType; 
        private java.util.List < Volume> volume; 

        private Builder() {
            super();
        } 

        private Builder(UpdateContainerGroupRequest request) {
            super(request);
            this.dnsConfig = request.dnsConfig;
            this.acrRegistryInfo = request.acrRegistryInfo;
            this.clientToken = request.clientToken;
            this.container = request.container;
            this.containerGroupId = request.containerGroupId;
            this.cpu = request.cpu;
            this.imageRegistryCredential = request.imageRegistryCredential;
            this.initContainer = request.initContainer;
            this.memory = request.memory;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restartPolicy = request.restartPolicy;
            this.tag = request.tag;
            this.updateType = request.updateType;
            this.volume = request.volume;
        } 

        /**
         * DnsConfig.
         */
        public Builder dnsConfig(DnsConfig dnsConfig) {
            this.putQueryParameter("DnsConfig", dnsConfig);
            this.dnsConfig = dnsConfig;
            return this;
        }

        /**
         * The information about the Container Registry Enterprise Edition instance.
         */
        public Builder acrRegistryInfo(java.util.List < AcrRegistryInfo> acrRegistryInfo) {
            this.putQueryParameter("AcrRegistryInfo", acrRegistryInfo);
            this.acrRegistryInfo = acrRegistryInfo;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotency](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The new configurations of the container group.
         */
        public Builder container(java.util.List < Container> container) {
            this.putQueryParameter("Container", container);
            this.container = container;
            return this;
        }

        /**
         * The ID of the elastic container instance that you want to update.
         */
        public Builder containerGroupId(String containerGroupId) {
            this.putQueryParameter("ContainerGroupId", containerGroupId);
            this.containerGroupId = containerGroupId;
            return this;
        }

        /**
         * The number of vCPUs allocated to the elastic container instance.
         */
        public Builder cpu(Float cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * The information about the credentials of the image repository.
         */
        public Builder imageRegistryCredential(java.util.List < ImageRegistryCredential> imageRegistryCredential) {
            this.putQueryParameter("ImageRegistryCredential", imageRegistryCredential);
            this.imageRegistryCredential = imageRegistryCredential;
            return this;
        }

        /**
         * The information about the new init containers.
         */
        public Builder initContainer(java.util.List < InitContainer> initContainer) {
            this.putQueryParameter("InitContainer", initContainer);
            this.initContainer = initContainer;
            return this;
        }

        /**
         * The memory size allocated to the elastic container instance. Unit: GiB.
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The restart policy of the elastic container instance. Valid values:
         * <p>
         * 
         * *   Always: Always restarts the instance if a container in the instance exits upon termination.
         * *   Never: Never restarts the instance if a container in the instance exits upon termination.
         * *   OnFailure: Restarts the instance only if a container in the instance exists upon failure with a status code of non-zero.
         */
        public Builder restartPolicy(String restartPolicy) {
            this.putQueryParameter("RestartPolicy", restartPolicy);
            this.restartPolicy = restartPolicy;
            return this;
        }

        /**
         * The tags that are bound to the instance.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The update type. Valid values:
         * <p>
         * 
         * *   RenewUpdate: full update. You must specify all relevant parameters to update the instance. For a parameter of the List type, you must specify all the items contained in the parameter even if you want to update only some of the items. For a parameter of the struct type, you must specify all the members if you want to update only some of the members.
         * *   IncrementalUpdate: incremental update. You can specify only the parameter that needs to be updated. Other related parameters remain unchanged.
         * 
         * Default value: RenewUpdate.
         */
        public Builder updateType(String updateType) {
            this.putQueryParameter("UpdateType", updateType);
            this.updateType = updateType;
            return this;
        }

        /**
         * The volumes that are mounted to the instance.
         */
        public Builder volume(java.util.List < Volume> volume) {
            this.putQueryParameter("Volume", volume);
            this.volume = volume;
            return this;
        }

        @Override
        public UpdateContainerGroupRequest build() {
            return new UpdateContainerGroupRequest(this);
        } 

    } 

    public static class Option extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private Option(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Option create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The option name of DNS configurations.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The option value of DNS configurations.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Option build() {
                return new Option(this);
            } 

        } 

    }
    public static class DnsConfig extends TeaModel {
        @NameInMap("NameServer")
        private java.util.List < String > nameServer;

        @NameInMap("Option")
        private java.util.List < Option> option;

        @NameInMap("Search")
        private java.util.List < String > search;

        private DnsConfig(Builder builder) {
            this.nameServer = builder.nameServer;
            this.option = builder.option;
            this.search = builder.search;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsConfig create() {
            return builder().build();
        }

        /**
         * @return nameServer
         */
        public java.util.List < String > getNameServer() {
            return this.nameServer;
        }

        /**
         * @return option
         */
        public java.util.List < Option> getOption() {
            return this.option;
        }

        /**
         * @return search
         */
        public java.util.List < String > getSearch() {
            return this.search;
        }

        public static final class Builder {
            private java.util.List < String > nameServer; 
            private java.util.List < Option> option; 
            private java.util.List < String > search; 

            /**
             * The IP addresses of the DNS servers.
             */
            public Builder nameServer(java.util.List < String > nameServer) {
                this.nameServer = nameServer;
                return this;
            }

            /**
             * The configurations of DNS.
             */
            public Builder option(java.util.List < Option> option) {
                this.option = option;
                return this;
            }

            /**
             * The search domains of the Domain Name System (DNS) server.
             */
            public Builder search(java.util.List < String > search) {
                this.search = search;
                return this;
            }

            public DnsConfig build() {
                return new DnsConfig(this);
            } 

        } 

    }
    public static class AcrRegistryInfo extends TeaModel {
        @NameInMap("Domain")
        private java.util.List < String > domain;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("RegionId")
        private String regionId;

        private AcrRegistryInfo(Builder builder) {
            this.domain = builder.domain;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AcrRegistryInfo create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public java.util.List < String > getDomain() {
            return this.domain;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private java.util.List < String > domain; 
            private String instanceId; 
            private String instanceName; 
            private String regionId; 

            /**
             * The domain names of the Container Registry Enterprise Edition instance. By default, all domain names of the instance are displayed. You can specify one or more domain names. Separate multiple domain names with commas (,).
             */
            public Builder domain(java.util.List < String > domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The ID of the Container Registry Enterprise Edition instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the Container Registry Enterprise Edition instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The region ID of the Container Registry Enterprise Edition instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public AcrRegistryInfo build() {
                return new AcrRegistryInfo(this);
            } 

        } 

    }
    public static class Exec extends TeaModel {
        @NameInMap("Command")
        private java.util.List < String > command;

        private Exec(Builder builder) {
            this.command = builder.command;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Exec create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public java.util.List < String > getCommand() {
            return this.command;
        }

        public static final class Builder {
            private java.util.List < String > command; 

            /**
             * Command.
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
                return this;
            }

            public Exec build() {
                return new Exec(this);
            } 

        } 

    }
    public static class HttpGet extends TeaModel {
        @NameInMap("Path")
        private String path;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Scheme")
        private String scheme;

        private HttpGet(Builder builder) {
            this.path = builder.path;
            this.port = builder.port;
            this.scheme = builder.scheme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpGet create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return scheme
         */
        public String getScheme() {
            return this.scheme;
        }

        public static final class Builder {
            private String path; 
            private Integer port; 
            private String scheme; 

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
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
             * Scheme.
             */
            public Builder scheme(String scheme) {
                this.scheme = scheme;
                return this;
            }

            public HttpGet build() {
                return new HttpGet(this);
            } 

        } 

    }
    public static class TcpSocket extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        private TcpSocket(Builder builder) {
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TcpSocket create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private Integer port; 

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public TcpSocket build() {
                return new TcpSocket(this);
            } 

        } 

    }
    public static class LivenessProbe extends TeaModel {
        @NameInMap("Exec")
        @Validation(required = true)
        private Exec exec;

        @NameInMap("FailureThreshold")
        private Integer failureThreshold;

        @NameInMap("HttpGet")
        @Validation(required = true)
        private HttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        private Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        private Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        private Integer successThreshold;

        @NameInMap("TcpSocket")
        @Validation(required = true)
        private TcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        private Integer timeoutSeconds;

        private LivenessProbe(Builder builder) {
            this.exec = builder.exec;
            this.failureThreshold = builder.failureThreshold;
            this.httpGet = builder.httpGet;
            this.initialDelaySeconds = builder.initialDelaySeconds;
            this.periodSeconds = builder.periodSeconds;
            this.successThreshold = builder.successThreshold;
            this.tcpSocket = builder.tcpSocket;
            this.timeoutSeconds = builder.timeoutSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LivenessProbe create() {
            return builder().build();
        }

        /**
         * @return exec
         */
        public Exec getExec() {
            return this.exec;
        }

        /**
         * @return failureThreshold
         */
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        /**
         * @return httpGet
         */
        public HttpGet getHttpGet() {
            return this.httpGet;
        }

        /**
         * @return initialDelaySeconds
         */
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        /**
         * @return periodSeconds
         */
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        /**
         * @return successThreshold
         */
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        /**
         * @return tcpSocket
         */
        public TcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        /**
         * @return timeoutSeconds
         */
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public static final class Builder {
            private Exec exec; 
            private Integer failureThreshold; 
            private HttpGet httpGet; 
            private Integer initialDelaySeconds; 
            private Integer periodSeconds; 
            private Integer successThreshold; 
            private TcpSocket tcpSocket; 
            private Integer timeoutSeconds; 

            /**
             * Exec.
             */
            public Builder exec(Exec exec) {
                this.exec = exec;
                return this;
            }

            /**
             * FailureThreshold.
             */
            public Builder failureThreshold(Integer failureThreshold) {
                this.failureThreshold = failureThreshold;
                return this;
            }

            /**
             * HttpGet.
             */
            public Builder httpGet(HttpGet httpGet) {
                this.httpGet = httpGet;
                return this;
            }

            /**
             * InitialDelaySeconds.
             */
            public Builder initialDelaySeconds(Integer initialDelaySeconds) {
                this.initialDelaySeconds = initialDelaySeconds;
                return this;
            }

            /**
             * PeriodSeconds.
             */
            public Builder periodSeconds(Integer periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * SuccessThreshold.
             */
            public Builder successThreshold(Integer successThreshold) {
                this.successThreshold = successThreshold;
                return this;
            }

            /**
             * TcpSocket.
             */
            public Builder tcpSocket(TcpSocket tcpSocket) {
                this.tcpSocket = tcpSocket;
                return this;
            }

            /**
             * TimeoutSeconds.
             */
            public Builder timeoutSeconds(Integer timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            public LivenessProbe build() {
                return new LivenessProbe(this);
            } 

        } 

    }
    public static class ReadinessProbeExec extends TeaModel {
        @NameInMap("Command")
        private java.util.List < String > command;

        private ReadinessProbeExec(Builder builder) {
            this.command = builder.command;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadinessProbeExec create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public java.util.List < String > getCommand() {
            return this.command;
        }

        public static final class Builder {
            private java.util.List < String > command; 

            /**
             * Command.
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
                return this;
            }

            public ReadinessProbeExec build() {
                return new ReadinessProbeExec(this);
            } 

        } 

    }
    public static class ReadinessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        private String path;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Scheme")
        private String scheme;

        private ReadinessProbeHttpGet(Builder builder) {
            this.path = builder.path;
            this.port = builder.port;
            this.scheme = builder.scheme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadinessProbeHttpGet create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return scheme
         */
        public String getScheme() {
            return this.scheme;
        }

        public static final class Builder {
            private String path; 
            private Integer port; 
            private String scheme; 

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
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
             * Scheme.
             */
            public Builder scheme(String scheme) {
                this.scheme = scheme;
                return this;
            }

            public ReadinessProbeHttpGet build() {
                return new ReadinessProbeHttpGet(this);
            } 

        } 

    }
    public static class ReadinessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        private ReadinessProbeTcpSocket(Builder builder) {
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadinessProbeTcpSocket create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private Integer port; 

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public ReadinessProbeTcpSocket build() {
                return new ReadinessProbeTcpSocket(this);
            } 

        } 

    }
    public static class ReadinessProbe extends TeaModel {
        @NameInMap("Exec")
        @Validation(required = true)
        private ReadinessProbeExec exec;

        @NameInMap("FailureThreshold")
        private Integer failureThreshold;

        @NameInMap("HttpGet")
        @Validation(required = true)
        private ReadinessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        private Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        private Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        private Integer successThreshold;

        @NameInMap("TcpSocket")
        @Validation(required = true)
        private ReadinessProbeTcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        private Integer timeoutSeconds;

        private ReadinessProbe(Builder builder) {
            this.exec = builder.exec;
            this.failureThreshold = builder.failureThreshold;
            this.httpGet = builder.httpGet;
            this.initialDelaySeconds = builder.initialDelaySeconds;
            this.periodSeconds = builder.periodSeconds;
            this.successThreshold = builder.successThreshold;
            this.tcpSocket = builder.tcpSocket;
            this.timeoutSeconds = builder.timeoutSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadinessProbe create() {
            return builder().build();
        }

        /**
         * @return exec
         */
        public ReadinessProbeExec getExec() {
            return this.exec;
        }

        /**
         * @return failureThreshold
         */
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        /**
         * @return httpGet
         */
        public ReadinessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        /**
         * @return initialDelaySeconds
         */
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        /**
         * @return periodSeconds
         */
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        /**
         * @return successThreshold
         */
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        /**
         * @return tcpSocket
         */
        public ReadinessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        /**
         * @return timeoutSeconds
         */
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public static final class Builder {
            private ReadinessProbeExec exec; 
            private Integer failureThreshold; 
            private ReadinessProbeHttpGet httpGet; 
            private Integer initialDelaySeconds; 
            private Integer periodSeconds; 
            private Integer successThreshold; 
            private ReadinessProbeTcpSocket tcpSocket; 
            private Integer timeoutSeconds; 

            /**
             * Exec.
             */
            public Builder exec(ReadinessProbeExec exec) {
                this.exec = exec;
                return this;
            }

            /**
             * FailureThreshold.
             */
            public Builder failureThreshold(Integer failureThreshold) {
                this.failureThreshold = failureThreshold;
                return this;
            }

            /**
             * HttpGet.
             */
            public Builder httpGet(ReadinessProbeHttpGet httpGet) {
                this.httpGet = httpGet;
                return this;
            }

            /**
             * InitialDelaySeconds.
             */
            public Builder initialDelaySeconds(Integer initialDelaySeconds) {
                this.initialDelaySeconds = initialDelaySeconds;
                return this;
            }

            /**
             * PeriodSeconds.
             */
            public Builder periodSeconds(Integer periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * SuccessThreshold.
             */
            public Builder successThreshold(Integer successThreshold) {
                this.successThreshold = successThreshold;
                return this;
            }

            /**
             * TcpSocket.
             */
            public Builder tcpSocket(ReadinessProbeTcpSocket tcpSocket) {
                this.tcpSocket = tcpSocket;
                return this;
            }

            /**
             * TimeoutSeconds.
             */
            public Builder timeoutSeconds(Integer timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            public ReadinessProbe build() {
                return new ReadinessProbe(this);
            } 

        } 

    }
    public static class Capability extends TeaModel {
        @NameInMap("Add")
        private java.util.List < String > add;

        private Capability(Builder builder) {
            this.add = builder.add;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capability create() {
            return builder().build();
        }

        /**
         * @return add
         */
        public java.util.List < String > getAdd() {
            return this.add;
        }

        public static final class Builder {
            private java.util.List < String > add; 

            /**
             * Add.
             */
            public Builder add(java.util.List < String > add) {
                this.add = add;
                return this;
            }

            public Capability build() {
                return new Capability(this);
            } 

        } 

    }
    public static class SecurityContext extends TeaModel {
        @NameInMap("Capability")
        @Validation(required = true)
        private Capability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        private Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        private Long runAsUser;

        private SecurityContext(Builder builder) {
            this.capability = builder.capability;
            this.readOnlyRootFilesystem = builder.readOnlyRootFilesystem;
            this.runAsUser = builder.runAsUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityContext create() {
            return builder().build();
        }

        /**
         * @return capability
         */
        public Capability getCapability() {
            return this.capability;
        }

        /**
         * @return readOnlyRootFilesystem
         */
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        /**
         * @return runAsUser
         */
        public Long getRunAsUser() {
            return this.runAsUser;
        }

        public static final class Builder {
            private Capability capability; 
            private Boolean readOnlyRootFilesystem; 
            private Long runAsUser; 

            /**
             * Capability.
             */
            public Builder capability(Capability capability) {
                this.capability = capability;
                return this;
            }

            /**
             * ReadOnlyRootFilesystem.
             */
            public Builder readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
                this.readOnlyRootFilesystem = readOnlyRootFilesystem;
                return this;
            }

            /**
             * RunAsUser.
             */
            public Builder runAsUser(Long runAsUser) {
                this.runAsUser = runAsUser;
                return this;
            }

            public SecurityContext build() {
                return new SecurityContext(this);
            } 

        } 

    }
    public static class FieldRef extends TeaModel {
        @NameInMap("FieldPath")
        private String fieldPath;

        private FieldRef(Builder builder) {
            this.fieldPath = builder.fieldPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldRef create() {
            return builder().build();
        }

        /**
         * @return fieldPath
         */
        public String getFieldPath() {
            return this.fieldPath;
        }

        public static final class Builder {
            private String fieldPath; 

            /**
             * FieldPath.
             */
            public Builder fieldPath(String fieldPath) {
                this.fieldPath = fieldPath;
                return this;
            }

            public FieldRef build() {
                return new FieldRef(this);
            } 

        } 

    }
    public static class EnvironmentVar extends TeaModel {
        @NameInMap("FieldRef")
        @Validation(required = true)
        private FieldRef fieldRef;

        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private EnvironmentVar(Builder builder) {
            this.fieldRef = builder.fieldRef;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentVar create() {
            return builder().build();
        }

        /**
         * @return fieldRef
         */
        public FieldRef getFieldRef() {
            return this.fieldRef;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private FieldRef fieldRef; 
            private String key; 
            private String value; 

            /**
             * FieldRef.
             */
            public Builder fieldRef(FieldRef fieldRef) {
                this.fieldRef = fieldRef;
                return this;
            }

            /**
             * The name of the environment variable for the container.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the environment variable for the container.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public EnvironmentVar build() {
                return new EnvironmentVar(this);
            } 

        } 

    }
    public static class LifecyclePostStartHandlerHttpGetHttpHeaders extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private LifecyclePostStartHandlerHttpGetHttpHeaders(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecyclePostStartHandlerHttpGetHttpHeaders create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The request parameter of HTTP GET requests when you use HTTP requests to specify the postStart callback function.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The request parameter value of HTTP GET requests when you use HTTP requests to specify the postStart callback function.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LifecyclePostStartHandlerHttpGetHttpHeaders build() {
                return new LifecyclePostStartHandlerHttpGetHttpHeaders(this);
            } 

        } 

    }
    public static class LifecyclePreStopHandlerHttpGetHttpHeader extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private LifecyclePreStopHandlerHttpGetHttpHeader(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecyclePreStopHandlerHttpGetHttpHeader create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The request parameter of HTTP GET requests when you use HTTP requests to specify the preStop callback function.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The request parameter value of HTTP GET requests when you use HTTP requests to specify the preStop callback function.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LifecyclePreStopHandlerHttpGetHttpHeader build() {
                return new LifecyclePreStopHandlerHttpGetHttpHeader(this);
            } 

        } 

    }
    public static class Port extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        private Port(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Port create() {
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
             * The port number. Valid values: 1 to 65535.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The protocol of the container. Valid values: TCP and UDP.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Port build() {
                return new Port(this);
            } 

        } 

    }
    public static class VolumeMount extends TeaModel {
        @NameInMap("MountPath")
        private String mountPath;

        @NameInMap("MountPropagation")
        private String mountPropagation;

        @NameInMap("Name")
        private String name;

        @NameInMap("ReadOnly")
        private Boolean readOnly;

        @NameInMap("SubPath")
        private String subPath;

        private VolumeMount(Builder builder) {
            this.mountPath = builder.mountPath;
            this.mountPropagation = builder.mountPropagation;
            this.name = builder.name;
            this.readOnly = builder.readOnly;
            this.subPath = builder.subPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VolumeMount create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return mountPropagation
         */
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return subPath
         */
        public String getSubPath() {
            return this.subPath;
        }

        public static final class Builder {
            private String mountPath; 
            private String mountPropagation; 
            private String name; 
            private Boolean readOnly; 
            private String subPath; 

            /**
             * The directory of the volume that is mounted to the container. The data in this directory is overwritten by the data on the volume. Specify this parameter with caution.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * The mount propagation setting of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:
             * <p>
             * 
             * *   None: This volume mount does not receive subsequent mounts that are mounted to this volume or subdirectories of this volume by the host.
             * *   HostToCotainer: This volume mount receives all subsequent mounts that are mounted to this volume or subdirectories of this volume.
             * *   Bidirectional: The volume mount behaves the same as the HostToCotainer mount. The volume mount receives all subsequent mounts that are mounted to this volume or subdirectories of this volume. In addition, all volume mounts created by the container are propagated back to the host and to all containers of all pods that use the same volume.
             * 
             * Default value: None.
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * The name of the volume that is mounted to the container. Valid values: the values of Volume.N.Name, which are the names of volumes that are mounted to the elastic container instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Specifies whether the volume is read-only. Default value: false.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * The subdirectory of the volume that is mounted to the container. The pod can mount different directories of the same volume to different subdirectories of containers.
             */
            public Builder subPath(String subPath) {
                this.subPath = subPath;
                return this;
            }

            public VolumeMount build() {
                return new VolumeMount(this);
            } 

        } 

    }
    public static class Container extends TeaModel {
        @NameInMap("LivenessProbe")
        @Validation(required = true)
        private LivenessProbe livenessProbe;

        @NameInMap("ReadinessProbe")
        @Validation(required = true)
        private ReadinessProbe readinessProbe;

        @NameInMap("SecurityContext")
        @Validation(required = true)
        private SecurityContext securityContext;

        @NameInMap("Arg")
        private java.util.List < String > arg;

        @NameInMap("Command")
        private java.util.List < String > command;

        @NameInMap("Cpu")
        private Float cpu;

        @NameInMap("EnvironmentVar")
        private java.util.List < EnvironmentVar> environmentVar;

        @NameInMap("Gpu")
        private Integer gpu;

        @NameInMap("Image")
        private String image;

        @NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @NameInMap("LifecyclePostStartHandlerExec")
        private java.util.List < String > lifecyclePostStartHandlerExec;

        @NameInMap("LifecyclePostStartHandlerHttpGetHost")
        private String lifecyclePostStartHandlerHttpGetHost;

        @NameInMap("LifecyclePostStartHandlerHttpGetHttpHeaders")
        private java.util.List < LifecyclePostStartHandlerHttpGetHttpHeaders> lifecyclePostStartHandlerHttpGetHttpHeaders;

        @NameInMap("LifecyclePostStartHandlerHttpGetPath")
        private String lifecyclePostStartHandlerHttpGetPath;

        @NameInMap("LifecyclePostStartHandlerHttpGetPort")
        private Integer lifecyclePostStartHandlerHttpGetPort;

        @NameInMap("LifecyclePostStartHandlerHttpGetScheme")
        private String lifecyclePostStartHandlerHttpGetScheme;

        @NameInMap("LifecyclePostStartHandlerTcpSocketHost")
        private String lifecyclePostStartHandlerTcpSocketHost;

        @NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        private Integer lifecyclePostStartHandlerTcpSocketPort;

        @NameInMap("LifecyclePreStopHandlerExec")
        private java.util.List < String > lifecyclePreStopHandlerExec;

        @NameInMap("LifecyclePreStopHandlerHttpGetHost")
        private String lifecyclePreStopHandlerHttpGetHost;

        @NameInMap("LifecyclePreStopHandlerHttpGetHttpHeader")
        private java.util.List < LifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader;

        @NameInMap("LifecyclePreStopHandlerHttpGetPath")
        private String lifecyclePreStopHandlerHttpGetPath;

        @NameInMap("LifecyclePreStopHandlerHttpGetPort")
        private Integer lifecyclePreStopHandlerHttpGetPort;

        @NameInMap("LifecyclePreStopHandlerHttpGetScheme")
        private String lifecyclePreStopHandlerHttpGetScheme;

        @NameInMap("LifecyclePreStopHandlerTcpSocketHost")
        private String lifecyclePreStopHandlerTcpSocketHost;

        @NameInMap("LifecyclePreStopHandlerTcpSocketPort")
        private Integer lifecyclePreStopHandlerTcpSocketPort;

        @NameInMap("Memory")
        private Float memory;

        @NameInMap("Name")
        private String name;

        @NameInMap("Port")
        private java.util.List < Port> port;

        @NameInMap("Stdin")
        private Boolean stdin;

        @NameInMap("StdinOnce")
        private Boolean stdinOnce;

        @NameInMap("Tty")
        private Boolean tty;

        @NameInMap("VolumeMount")
        private java.util.List < VolumeMount> volumeMount;

        @NameInMap("WorkingDir")
        private String workingDir;

        private Container(Builder builder) {
            this.livenessProbe = builder.livenessProbe;
            this.readinessProbe = builder.readinessProbe;
            this.securityContext = builder.securityContext;
            this.arg = builder.arg;
            this.command = builder.command;
            this.cpu = builder.cpu;
            this.environmentVar = builder.environmentVar;
            this.gpu = builder.gpu;
            this.image = builder.image;
            this.imagePullPolicy = builder.imagePullPolicy;
            this.lifecyclePostStartHandlerExec = builder.lifecyclePostStartHandlerExec;
            this.lifecyclePostStartHandlerHttpGetHost = builder.lifecyclePostStartHandlerHttpGetHost;
            this.lifecyclePostStartHandlerHttpGetHttpHeaders = builder.lifecyclePostStartHandlerHttpGetHttpHeaders;
            this.lifecyclePostStartHandlerHttpGetPath = builder.lifecyclePostStartHandlerHttpGetPath;
            this.lifecyclePostStartHandlerHttpGetPort = builder.lifecyclePostStartHandlerHttpGetPort;
            this.lifecyclePostStartHandlerHttpGetScheme = builder.lifecyclePostStartHandlerHttpGetScheme;
            this.lifecyclePostStartHandlerTcpSocketHost = builder.lifecyclePostStartHandlerTcpSocketHost;
            this.lifecyclePostStartHandlerTcpSocketPort = builder.lifecyclePostStartHandlerTcpSocketPort;
            this.lifecyclePreStopHandlerExec = builder.lifecyclePreStopHandlerExec;
            this.lifecyclePreStopHandlerHttpGetHost = builder.lifecyclePreStopHandlerHttpGetHost;
            this.lifecyclePreStopHandlerHttpGetHttpHeader = builder.lifecyclePreStopHandlerHttpGetHttpHeader;
            this.lifecyclePreStopHandlerHttpGetPath = builder.lifecyclePreStopHandlerHttpGetPath;
            this.lifecyclePreStopHandlerHttpGetPort = builder.lifecyclePreStopHandlerHttpGetPort;
            this.lifecyclePreStopHandlerHttpGetScheme = builder.lifecyclePreStopHandlerHttpGetScheme;
            this.lifecyclePreStopHandlerTcpSocketHost = builder.lifecyclePreStopHandlerTcpSocketHost;
            this.lifecyclePreStopHandlerTcpSocketPort = builder.lifecyclePreStopHandlerTcpSocketPort;
            this.memory = builder.memory;
            this.name = builder.name;
            this.port = builder.port;
            this.stdin = builder.stdin;
            this.stdinOnce = builder.stdinOnce;
            this.tty = builder.tty;
            this.volumeMount = builder.volumeMount;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Container create() {
            return builder().build();
        }

        /**
         * @return livenessProbe
         */
        public LivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        /**
         * @return readinessProbe
         */
        public ReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

        /**
         * @return securityContext
         */
        public SecurityContext getSecurityContext() {
            return this.securityContext;
        }

        /**
         * @return arg
         */
        public java.util.List < String > getArg() {
            return this.arg;
        }

        /**
         * @return command
         */
        public java.util.List < String > getCommand() {
            return this.command;
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return environmentVar
         */
        public java.util.List < EnvironmentVar> getEnvironmentVar() {
            return this.environmentVar;
        }

        /**
         * @return gpu
         */
        public Integer getGpu() {
            return this.gpu;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return imagePullPolicy
         */
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        /**
         * @return lifecyclePostStartHandlerExec
         */
        public java.util.List < String > getLifecyclePostStartHandlerExec() {
            return this.lifecyclePostStartHandlerExec;
        }

        /**
         * @return lifecyclePostStartHandlerHttpGetHost
         */
        public String getLifecyclePostStartHandlerHttpGetHost() {
            return this.lifecyclePostStartHandlerHttpGetHost;
        }

        /**
         * @return lifecyclePostStartHandlerHttpGetHttpHeaders
         */
        public java.util.List < LifecyclePostStartHandlerHttpGetHttpHeaders> getLifecyclePostStartHandlerHttpGetHttpHeaders() {
            return this.lifecyclePostStartHandlerHttpGetHttpHeaders;
        }

        /**
         * @return lifecyclePostStartHandlerHttpGetPath
         */
        public String getLifecyclePostStartHandlerHttpGetPath() {
            return this.lifecyclePostStartHandlerHttpGetPath;
        }

        /**
         * @return lifecyclePostStartHandlerHttpGetPort
         */
        public Integer getLifecyclePostStartHandlerHttpGetPort() {
            return this.lifecyclePostStartHandlerHttpGetPort;
        }

        /**
         * @return lifecyclePostStartHandlerHttpGetScheme
         */
        public String getLifecyclePostStartHandlerHttpGetScheme() {
            return this.lifecyclePostStartHandlerHttpGetScheme;
        }

        /**
         * @return lifecyclePostStartHandlerTcpSocketHost
         */
        public String getLifecyclePostStartHandlerTcpSocketHost() {
            return this.lifecyclePostStartHandlerTcpSocketHost;
        }

        /**
         * @return lifecyclePostStartHandlerTcpSocketPort
         */
        public Integer getLifecyclePostStartHandlerTcpSocketPort() {
            return this.lifecyclePostStartHandlerTcpSocketPort;
        }

        /**
         * @return lifecyclePreStopHandlerExec
         */
        public java.util.List < String > getLifecyclePreStopHandlerExec() {
            return this.lifecyclePreStopHandlerExec;
        }

        /**
         * @return lifecyclePreStopHandlerHttpGetHost
         */
        public String getLifecyclePreStopHandlerHttpGetHost() {
            return this.lifecyclePreStopHandlerHttpGetHost;
        }

        /**
         * @return lifecyclePreStopHandlerHttpGetHttpHeader
         */
        public java.util.List < LifecyclePreStopHandlerHttpGetHttpHeader> getLifecyclePreStopHandlerHttpGetHttpHeader() {
            return this.lifecyclePreStopHandlerHttpGetHttpHeader;
        }

        /**
         * @return lifecyclePreStopHandlerHttpGetPath
         */
        public String getLifecyclePreStopHandlerHttpGetPath() {
            return this.lifecyclePreStopHandlerHttpGetPath;
        }

        /**
         * @return lifecyclePreStopHandlerHttpGetPort
         */
        public Integer getLifecyclePreStopHandlerHttpGetPort() {
            return this.lifecyclePreStopHandlerHttpGetPort;
        }

        /**
         * @return lifecyclePreStopHandlerHttpGetScheme
         */
        public String getLifecyclePreStopHandlerHttpGetScheme() {
            return this.lifecyclePreStopHandlerHttpGetScheme;
        }

        /**
         * @return lifecyclePreStopHandlerTcpSocketHost
         */
        public String getLifecyclePreStopHandlerTcpSocketHost() {
            return this.lifecyclePreStopHandlerTcpSocketHost;
        }

        /**
         * @return lifecyclePreStopHandlerTcpSocketPort
         */
        public Integer getLifecyclePreStopHandlerTcpSocketPort() {
            return this.lifecyclePreStopHandlerTcpSocketPort;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public java.util.List < Port> getPort() {
            return this.port;
        }

        /**
         * @return stdin
         */
        public Boolean getStdin() {
            return this.stdin;
        }

        /**
         * @return stdinOnce
         */
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        /**
         * @return tty
         */
        public Boolean getTty() {
            return this.tty;
        }

        /**
         * @return volumeMount
         */
        public java.util.List < VolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private LivenessProbe livenessProbe; 
            private ReadinessProbe readinessProbe; 
            private SecurityContext securityContext; 
            private java.util.List < String > arg; 
            private java.util.List < String > command; 
            private Float cpu; 
            private java.util.List < EnvironmentVar> environmentVar; 
            private Integer gpu; 
            private String image; 
            private String imagePullPolicy; 
            private java.util.List < String > lifecyclePostStartHandlerExec; 
            private String lifecyclePostStartHandlerHttpGetHost; 
            private java.util.List < LifecyclePostStartHandlerHttpGetHttpHeaders> lifecyclePostStartHandlerHttpGetHttpHeaders; 
            private String lifecyclePostStartHandlerHttpGetPath; 
            private Integer lifecyclePostStartHandlerHttpGetPort; 
            private String lifecyclePostStartHandlerHttpGetScheme; 
            private String lifecyclePostStartHandlerTcpSocketHost; 
            private Integer lifecyclePostStartHandlerTcpSocketPort; 
            private java.util.List < String > lifecyclePreStopHandlerExec; 
            private String lifecyclePreStopHandlerHttpGetHost; 
            private java.util.List < LifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader; 
            private String lifecyclePreStopHandlerHttpGetPath; 
            private Integer lifecyclePreStopHandlerHttpGetPort; 
            private String lifecyclePreStopHandlerHttpGetScheme; 
            private String lifecyclePreStopHandlerTcpSocketHost; 
            private Integer lifecyclePreStopHandlerTcpSocketPort; 
            private Float memory; 
            private String name; 
            private java.util.List < Port> port; 
            private Boolean stdin; 
            private Boolean stdinOnce; 
            private Boolean tty; 
            private java.util.List < VolumeMount> volumeMount; 
            private String workingDir; 

            /**
             * LivenessProbe.
             */
            public Builder livenessProbe(LivenessProbe livenessProbe) {
                this.livenessProbe = livenessProbe;
                return this;
            }

            /**
             * ReadinessProbe.
             */
            public Builder readinessProbe(ReadinessProbe readinessProbe) {
                this.readinessProbe = readinessProbe;
                return this;
            }

            /**
             * SecurityContext.
             */
            public Builder securityContext(SecurityContext securityContext) {
                this.securityContext = securityContext;
                return this;
            }

            /**
             * The arguments that are passed to the container startup command. You can specify up to 10 arguments.
             */
            public Builder arg(java.util.List < String > arg) {
                this.arg = arg;
                return this;
            }

            /**
             * The commands that are used to run the probe.
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
                return this;
            }

            /**
             * The number of vCPUs that you want to allocate to the container.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The environment variables for the container.
             */
            public Builder environmentVar(java.util.List < EnvironmentVar> environmentVar) {
                this.environmentVar = environmentVar;
                return this;
            }

            /**
             * The number of GPUs that you want to allocate to the container.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * The image of the container.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The image pulling policy.
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * The command that you run in the container when you use a command-line interface (CLI) to specify the postStart callback function.
             */
            public Builder lifecyclePostStartHandlerExec(java.util.List < String > lifecyclePostStartHandlerExec) {
                this.lifecyclePostStartHandlerExec = lifecyclePostStartHandlerExec;
                return this;
            }

            /**
             * The IP address of the host that receives HTTP GET requests when you use HTTP requests to specify the postStart callback function.
             */
            public Builder lifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
                this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
                return this;
            }

            /**
             * The information about the valid HTTP request headers among the generated HTTP request headers.
             */
            public Builder lifecyclePostStartHandlerHttpGetHttpHeaders(java.util.List < LifecyclePostStartHandlerHttpGetHttpHeaders> lifecyclePostStartHandlerHttpGetHttpHeaders) {
                this.lifecyclePostStartHandlerHttpGetHttpHeaders = lifecyclePostStartHandlerHttpGetHttpHeaders;
                return this;
            }

            /**
             * The path to which HTTP GET requests are sent when you use HTTP requests to specify the postStart callback function.
             */
            public Builder lifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
                this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
                return this;
            }

            /**
             * The port to which HTTP GET requests are sent when you use HTTP requests to specify the postStart callback function.
             */
            public Builder lifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
                this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
                return this;
            }

            /**
             * The path to which HTTP GET requests are sent when you use HTTP requests to specify the postStart callback function.
             */
            public Builder lifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
                this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
                return this;
            }

            /**
             * The host IP address of TCP socket probes when you use TCP sockets to specify the postStart callback function.
             */
            public Builder lifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
                this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
                return this;
            }

            /**
             * The port of TCP socket probes when you use TCP sockets to specify the postStart callback function.
             */
            public Builder lifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
                this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
                return this;
            }

            /**
             * The command that you run in the container when you use a CLI to specify the preStop callback function.
             */
            public Builder lifecyclePreStopHandlerExec(java.util.List < String > lifecyclePreStopHandlerExec) {
                this.lifecyclePreStopHandlerExec = lifecyclePreStopHandlerExec;
                return this;
            }

            /**
             * The IP address of the host that receives HTTP GET requests when you use HTTP requests to specify the preStop callback function.
             */
            public Builder lifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
                this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
                return this;
            }

            /**
             * The information about the generated HTTP request headers.
             */
            public Builder lifecyclePreStopHandlerHttpGetHttpHeader(java.util.List < LifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader) {
                this.lifecyclePreStopHandlerHttpGetHttpHeader = lifecyclePreStopHandlerHttpGetHttpHeader;
                return this;
            }

            /**
             * The path to which HTTP GET requests are sent when you use HTTP requests to specify the preStop callback function.
             */
            public Builder lifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
                this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
                return this;
            }

            /**
             * The port to which HTTP GET requests are sent when you use HTTP requests to specify the preStop callback function.
             */
            public Builder lifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
                this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
                return this;
            }

            /**
             * The protocol type of HTTP GET requests when you use HTTP requests to specify the preStop callback function. Valid values:
             * <p>
             * 
             * *   HTTP
             * *   HTTPS
             */
            public Builder lifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
                this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
                return this;
            }

            /**
             * The host IP address of TCP socket probes when you use TCP sockets to specify the preStop callback function.
             */
            public Builder lifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
                this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
                return this;
            }

            /**
             * The port of TCP socket probes when you use TCP sockets to specify the preStop callback function.
             */
            public Builder lifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
                this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
                return this;
            }

            /**
             * The memory size of the container.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The name of the container.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The port to which the system sends an HTTP GET request for a health check.
             */
            public Builder port(java.util.List < Port> port) {
                this.port = port;
                return this;
            }

            /**
             * Specifies whether the container allocates buffer resources to standard input streams when the container is running. If you do not specify this parameter, an end-of-file (EOF) error may occur when standard input streams in the container are read. Default value: false.
             */
            public Builder stdin(Boolean stdin) {
                this.stdin = stdin;
                return this;
            }

            /**
             * Whether the container runtime closes the stdin channel after the stdin channel has been opened by a sing attach. If stdin is true, the stdin stream remains open across multiple attach sessions. If StdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and receive data until the client disconnects. When the client disconnects, stdin is closed and remains closed until the container is restarted.
             */
            public Builder stdinOnce(Boolean stdinOnce) {
                this.stdinOnce = stdinOnce;
                return this;
            }

            /**
             * Specifies whether to enable interaction. Default value: false. If the command is a /bin/bash command, set the value to true.
             */
            public Builder tty(Boolean tty) {
                this.tty = tty;
                return this;
            }

            /**
             * Pod volumes to mount into the filesystem of the container.
             */
            public Builder volumeMount(java.util.List < VolumeMount> volumeMount) {
                this.volumeMount = volumeMount;
                return this;
            }

            /**
             * The working directory of the container.
             */
            public Builder workingDir(String workingDir) {
                this.workingDir = workingDir;
                return this;
            }

            public Container build() {
                return new Container(this);
            } 

        } 

    }
    public static class ImageRegistryCredential extends TeaModel {
        @NameInMap("Password")
        private String password;

        @NameInMap("Server")
        private String server;

        @NameInMap("UserName")
        private String userName;

        private ImageRegistryCredential(Builder builder) {
            this.password = builder.password;
            this.server = builder.server;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageRegistryCredential create() {
            return builder().build();
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String password; 
            private String server; 
            private String userName; 

            /**
             * The password that is used to access the image repository.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * The address of the image repository. This address does not contain `http://` or `https://`.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * The username that is used to access the image repository.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ImageRegistryCredential build() {
                return new ImageRegistryCredential(this);
            } 

        } 

    }
    public static class SecurityContextCapability extends TeaModel {
        @NameInMap("Add")
        private java.util.List < String > add;

        private SecurityContextCapability(Builder builder) {
            this.add = builder.add;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityContextCapability create() {
            return builder().build();
        }

        /**
         * @return add
         */
        public java.util.List < String > getAdd() {
            return this.add;
        }

        public static final class Builder {
            private java.util.List < String > add; 

            /**
             * Add.
             */
            public Builder add(java.util.List < String > add) {
                this.add = add;
                return this;
            }

            public SecurityContextCapability build() {
                return new SecurityContextCapability(this);
            } 

        } 

    }
    public static class InitContainerSecurityContext extends TeaModel {
        @NameInMap("Capability")
        @Validation(required = true)
        private SecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        private Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        private Long runAsUser;

        private InitContainerSecurityContext(Builder builder) {
            this.capability = builder.capability;
            this.readOnlyRootFilesystem = builder.readOnlyRootFilesystem;
            this.runAsUser = builder.runAsUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainerSecurityContext create() {
            return builder().build();
        }

        /**
         * @return capability
         */
        public SecurityContextCapability getCapability() {
            return this.capability;
        }

        /**
         * @return readOnlyRootFilesystem
         */
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        /**
         * @return runAsUser
         */
        public Long getRunAsUser() {
            return this.runAsUser;
        }

        public static final class Builder {
            private SecurityContextCapability capability; 
            private Boolean readOnlyRootFilesystem; 
            private Long runAsUser; 

            /**
             * Capability.
             */
            public Builder capability(SecurityContextCapability capability) {
                this.capability = capability;
                return this;
            }

            /**
             * ReadOnlyRootFilesystem.
             */
            public Builder readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
                this.readOnlyRootFilesystem = readOnlyRootFilesystem;
                return this;
            }

            /**
             * RunAsUser.
             */
            public Builder runAsUser(Long runAsUser) {
                this.runAsUser = runAsUser;
                return this;
            }

            public InitContainerSecurityContext build() {
                return new InitContainerSecurityContext(this);
            } 

        } 

    }
    public static class EnvironmentVarFieldRef extends TeaModel {
        @NameInMap("FieldPath")
        private String fieldPath;

        private EnvironmentVarFieldRef(Builder builder) {
            this.fieldPath = builder.fieldPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentVarFieldRef create() {
            return builder().build();
        }

        /**
         * @return fieldPath
         */
        public String getFieldPath() {
            return this.fieldPath;
        }

        public static final class Builder {
            private String fieldPath; 

            /**
             * FieldPath.
             */
            public Builder fieldPath(String fieldPath) {
                this.fieldPath = fieldPath;
                return this;
            }

            public EnvironmentVarFieldRef build() {
                return new EnvironmentVarFieldRef(this);
            } 

        } 

    }
    public static class InitContainerEnvironmentVar extends TeaModel {
        @NameInMap("FieldRef")
        @Validation(required = true)
        private EnvironmentVarFieldRef fieldRef;

        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private InitContainerEnvironmentVar(Builder builder) {
            this.fieldRef = builder.fieldRef;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainerEnvironmentVar create() {
            return builder().build();
        }

        /**
         * @return fieldRef
         */
        public EnvironmentVarFieldRef getFieldRef() {
            return this.fieldRef;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private EnvironmentVarFieldRef fieldRef; 
            private String key; 
            private String value; 

            /**
             * FieldRef.
             */
            public Builder fieldRef(EnvironmentVarFieldRef fieldRef) {
                this.fieldRef = fieldRef;
                return this;
            }

            /**
             * The name of the environment variable for the init container.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the environment variable for the init container.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InitContainerEnvironmentVar build() {
                return new InitContainerEnvironmentVar(this);
            } 

        } 

    }
    public static class InitContainerPort extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        private InitContainerPort(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainerPort create() {
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
             * The port number of the init container. Valid values: 1 to 65535.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The protocol of the init container. Valid values: TCP and UDP.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public InitContainerPort build() {
                return new InitContainerPort(this);
            } 

        } 

    }
    public static class InitContainerVolumeMount extends TeaModel {
        @NameInMap("MountPath")
        private String mountPath;

        @NameInMap("MountPropagation")
        private String mountPropagation;

        @NameInMap("Name")
        private String name;

        @NameInMap("ReadOnly")
        private Boolean readOnly;

        @NameInMap("SubPath")
        private String subPath;

        private InitContainerVolumeMount(Builder builder) {
            this.mountPath = builder.mountPath;
            this.mountPropagation = builder.mountPropagation;
            this.name = builder.name;
            this.readOnly = builder.readOnly;
            this.subPath = builder.subPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainerVolumeMount create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return mountPropagation
         */
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return subPath
         */
        public String getSubPath() {
            return this.subPath;
        }

        public static final class Builder {
            private String mountPath; 
            private String mountPropagation; 
            private String name; 
            private Boolean readOnly; 
            private String subPath; 

            /**
             * The directory of the volume that is mounted to the init container. The data in this directory is overwritten by the data on the volume. Specify this parameter with caution.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * The mount propagation setting of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:
             * <p>
             * 
             * *   None: This volume mount does not receive subsequent mounts that are mounted to this volume or subdirectories of this volume by the host.
             * *   HostToCotainer: This volume mount receives all subsequent mounts that are mounted to this volume or subdirectories of this volume.
             * *   Bidirectional: The volume mount behaves the same as the HostToCotainer mount. The volume mount receives all subsequent mounts that are mounted to this volume or subdirectories of this volume. In addition, all volume mounts created by the container are propagated back to the host and to all containers of all pods that use the same volume.
             * 
             * Default value: None.
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * The name of the volume that is mounted to the init container. Valid values: the values of Volume.N.Name, which are the names of volumes that are mounted to the elastic container instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Specifies whether the volume is read-only. Default value: false.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * The subdirectory of the volume that is mounted to the init container. The pod can mount different directories of the same volume to different subdirectories of init containers.
             */
            public Builder subPath(String subPath) {
                this.subPath = subPath;
                return this;
            }

            public InitContainerVolumeMount build() {
                return new InitContainerVolumeMount(this);
            } 

        } 

    }
    public static class InitContainer extends TeaModel {
        @NameInMap("SecurityContext")
        @Validation(required = true)
        private InitContainerSecurityContext securityContext;

        @NameInMap("Arg")
        private java.util.List < String > arg;

        @NameInMap("Command")
        private java.util.List < String > command;

        @NameInMap("Cpu")
        private Float cpu;

        @NameInMap("EnvironmentVar")
        private java.util.List < InitContainerEnvironmentVar> environmentVar;

        @NameInMap("Gpu")
        private Integer gpu;

        @NameInMap("Image")
        private String image;

        @NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @NameInMap("Memory")
        private Float memory;

        @NameInMap("Name")
        private String name;

        @NameInMap("Port")
        private java.util.List < InitContainerPort> port;

        @NameInMap("Stdin")
        private Boolean stdin;

        @NameInMap("StdinOnce")
        private Boolean stdinOnce;

        @NameInMap("Tty")
        private Boolean tty;

        @NameInMap("VolumeMount")
        private java.util.List < InitContainerVolumeMount> volumeMount;

        @NameInMap("WorkingDir")
        private String workingDir;

        private InitContainer(Builder builder) {
            this.securityContext = builder.securityContext;
            this.arg = builder.arg;
            this.command = builder.command;
            this.cpu = builder.cpu;
            this.environmentVar = builder.environmentVar;
            this.gpu = builder.gpu;
            this.image = builder.image;
            this.imagePullPolicy = builder.imagePullPolicy;
            this.memory = builder.memory;
            this.name = builder.name;
            this.port = builder.port;
            this.stdin = builder.stdin;
            this.stdinOnce = builder.stdinOnce;
            this.tty = builder.tty;
            this.volumeMount = builder.volumeMount;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainer create() {
            return builder().build();
        }

        /**
         * @return securityContext
         */
        public InitContainerSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        /**
         * @return arg
         */
        public java.util.List < String > getArg() {
            return this.arg;
        }

        /**
         * @return command
         */
        public java.util.List < String > getCommand() {
            return this.command;
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return environmentVar
         */
        public java.util.List < InitContainerEnvironmentVar> getEnvironmentVar() {
            return this.environmentVar;
        }

        /**
         * @return gpu
         */
        public Integer getGpu() {
            return this.gpu;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return imagePullPolicy
         */
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public java.util.List < InitContainerPort> getPort() {
            return this.port;
        }

        /**
         * @return stdin
         */
        public Boolean getStdin() {
            return this.stdin;
        }

        /**
         * @return stdinOnce
         */
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        /**
         * @return tty
         */
        public Boolean getTty() {
            return this.tty;
        }

        /**
         * @return volumeMount
         */
        public java.util.List < InitContainerVolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private InitContainerSecurityContext securityContext; 
            private java.util.List < String > arg; 
            private java.util.List < String > command; 
            private Float cpu; 
            private java.util.List < InitContainerEnvironmentVar> environmentVar; 
            private Integer gpu; 
            private String image; 
            private String imagePullPolicy; 
            private Float memory; 
            private String name; 
            private java.util.List < InitContainerPort> port; 
            private Boolean stdin; 
            private Boolean stdinOnce; 
            private Boolean tty; 
            private java.util.List < InitContainerVolumeMount> volumeMount; 
            private String workingDir; 

            /**
             * SecurityContext.
             */
            public Builder securityContext(InitContainerSecurityContext securityContext) {
                this.securityContext = securityContext;
                return this;
            }

            /**
             * The startup arguments of the init container.
             */
            public Builder arg(java.util.List < String > arg) {
                this.arg = arg;
                return this;
            }

            /**
             * The commands of the init container.
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
                return this;
            }

            /**
             * The number of vCPUs that you want to allocate to the init container.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The environment variables for the init container.
             */
            public Builder environmentVar(java.util.List < InitContainerEnvironmentVar> environmentVar) {
                this.environmentVar = environmentVar;
                return this;
            }

            /**
             * The number of GPUs that you want to allocate to the init container.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * The image of the init container.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The image pulling policy.
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * The size of memory that you want to allocate to the init container.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The name of the init container.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The port number. Valid values: 1 to 65535.
             */
            public Builder port(java.util.List < InitContainerPort> port) {
                this.port = port;
                return this;
            }

            /**
             * Specifies whether the init container allocates buffer resources to standard input streams when the init container is running. If you do not specify this parameter, an EOF error may occur when standard input streams in the init container are read. Default value: false.
             */
            public Builder stdin(Boolean stdin) {
                this.stdin = stdin;
                return this;
            }

            /**
             * Whether the container runtime closes the stdin channel after the stdin channel has been opened by a sing attach. If stdin is true, the stdin stream remains open across multiple attach sessions. If StdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and receive data until the client disconnects. When the client disconnects, stdin is closed and remains closed until the container is restarted.
             */
            public Builder stdinOnce(Boolean stdinOnce) {
                this.stdinOnce = stdinOnce;
                return this;
            }

            /**
             * Specifies whether to enable interaction. Default value: false. If the command is a /bin/bash command, set the value to true.
             */
            public Builder tty(Boolean tty) {
                this.tty = tty;
                return this;
            }

            /**
             * Pod volumes to mount into the filesystem of the init container.
             */
            public Builder volumeMount(java.util.List < InitContainerVolumeMount> volumeMount) {
                this.volumeMount = volumeMount;
                return this;
            }

            /**
             * The working directory of the init container.
             */
            public Builder workingDir(String workingDir) {
                this.workingDir = workingDir;
                return this;
            }

            public InitContainer build() {
                return new InitContainer(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class ConfigFileToPath extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Path")
        private String path;

        private ConfigFileToPath(Builder builder) {
            this.content = builder.content;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigFileToPath create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String content; 
            private String path; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public ConfigFileToPath build() {
                return new ConfigFileToPath(this);
            } 

        } 

    }
    public static class ConfigFileVolume extends TeaModel {
        @NameInMap("ConfigFileToPath")
        private java.util.List < ConfigFileToPath> configFileToPath;

        private ConfigFileVolume(Builder builder) {
            this.configFileToPath = builder.configFileToPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigFileVolume create() {
            return builder().build();
        }

        /**
         * @return configFileToPath
         */
        public java.util.List < ConfigFileToPath> getConfigFileToPath() {
            return this.configFileToPath;
        }

        public static final class Builder {
            private java.util.List < ConfigFileToPath> configFileToPath; 

            /**
             * ConfigFileToPath.
             */
            public Builder configFileToPath(java.util.List < ConfigFileToPath> configFileToPath) {
                this.configFileToPath = configFileToPath;
                return this;
            }

            public ConfigFileVolume build() {
                return new ConfigFileVolume(this);
            } 

        } 

    }
    public static class EmptyDirVolume extends TeaModel {
        @NameInMap("Medium")
        private String medium;

        @NameInMap("SizeLimit")
        private String sizeLimit;

        private EmptyDirVolume(Builder builder) {
            this.medium = builder.medium;
            this.sizeLimit = builder.sizeLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmptyDirVolume create() {
            return builder().build();
        }

        /**
         * @return medium
         */
        public String getMedium() {
            return this.medium;
        }

        /**
         * @return sizeLimit
         */
        public String getSizeLimit() {
            return this.sizeLimit;
        }

        public static final class Builder {
            private String medium; 
            private String sizeLimit; 

            /**
             * Medium.
             */
            public Builder medium(String medium) {
                this.medium = medium;
                return this;
            }

            /**
             * SizeLimit.
             */
            public Builder sizeLimit(String sizeLimit) {
                this.sizeLimit = sizeLimit;
                return this;
            }

            public EmptyDirVolume build() {
                return new EmptyDirVolume(this);
            } 

        } 

    }
    public static class FlexVolume extends TeaModel {
        @NameInMap("Driver")
        private String driver;

        @NameInMap("FsType")
        private String fsType;

        @NameInMap("Options")
        private String options;

        private FlexVolume(Builder builder) {
            this.driver = builder.driver;
            this.fsType = builder.fsType;
            this.options = builder.options;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlexVolume create() {
            return builder().build();
        }

        /**
         * @return driver
         */
        public String getDriver() {
            return this.driver;
        }

        /**
         * @return fsType
         */
        public String getFsType() {
            return this.fsType;
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
        }

        public static final class Builder {
            private String driver; 
            private String fsType; 
            private String options; 

            /**
             * Driver.
             */
            public Builder driver(String driver) {
                this.driver = driver;
                return this;
            }

            /**
             * FsType.
             */
            public Builder fsType(String fsType) {
                this.fsType = fsType;
                return this;
            }

            /**
             * Options.
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            public FlexVolume build() {
                return new FlexVolume(this);
            } 

        } 

    }
    public static class HostPathVolume extends TeaModel {
        @NameInMap("Path")
        private String path;

        @NameInMap("Type")
        private String type;

        private HostPathVolume(Builder builder) {
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostPathVolume create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String path; 
            private String type; 

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public HostPathVolume build() {
                return new HostPathVolume(this);
            } 

        } 

    }
    public static class NFSVolume extends TeaModel {
        @NameInMap("Path")
        private String path;

        @NameInMap("ReadOnly")
        private Boolean readOnly;

        @NameInMap("Server")
        private String server;

        private NFSVolume(Builder builder) {
            this.path = builder.path;
            this.readOnly = builder.readOnly;
            this.server = builder.server;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NFSVolume create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        public static final class Builder {
            private String path; 
            private Boolean readOnly; 
            private String server; 

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Specifies whether the volume is read-only. Default value: false.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * The address of the image repository. This address does not contain `http://` or `https://`.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            public NFSVolume build() {
                return new NFSVolume(this);
            } 

        } 

    }
    public static class Volume extends TeaModel {
        @NameInMap("ConfigFileVolume")
        @Validation(required = true)
        private ConfigFileVolume configFileVolume;

        @NameInMap("EmptyDirVolume")
        @Validation(required = true)
        private EmptyDirVolume emptyDirVolume;

        @NameInMap("FlexVolume")
        @Validation(required = true)
        private FlexVolume flexVolume;

        @NameInMap("HostPathVolume")
        @Validation(required = true)
        private HostPathVolume hostPathVolume;

        @NameInMap("NFSVolume")
        @Validation(required = true)
        private NFSVolume NFSVolume;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        private Volume(Builder builder) {
            this.configFileVolume = builder.configFileVolume;
            this.emptyDirVolume = builder.emptyDirVolume;
            this.flexVolume = builder.flexVolume;
            this.hostPathVolume = builder.hostPathVolume;
            this.NFSVolume = builder.NFSVolume;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Volume create() {
            return builder().build();
        }

        /**
         * @return configFileVolume
         */
        public ConfigFileVolume getConfigFileVolume() {
            return this.configFileVolume;
        }

        /**
         * @return emptyDirVolume
         */
        public EmptyDirVolume getEmptyDirVolume() {
            return this.emptyDirVolume;
        }

        /**
         * @return flexVolume
         */
        public FlexVolume getFlexVolume() {
            return this.flexVolume;
        }

        /**
         * @return hostPathVolume
         */
        public HostPathVolume getHostPathVolume() {
            return this.hostPathVolume;
        }

        /**
         * @return NFSVolume
         */
        public NFSVolume getNFSVolume() {
            return this.NFSVolume;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ConfigFileVolume configFileVolume; 
            private EmptyDirVolume emptyDirVolume; 
            private FlexVolume flexVolume; 
            private HostPathVolume hostPathVolume; 
            private NFSVolume NFSVolume; 
            private String name; 
            private String type; 

            /**
             * ConfigFileVolume.
             */
            public Builder configFileVolume(ConfigFileVolume configFileVolume) {
                this.configFileVolume = configFileVolume;
                return this;
            }

            /**
             * EmptyDirVolume.
             */
            public Builder emptyDirVolume(EmptyDirVolume emptyDirVolume) {
                this.emptyDirVolume = emptyDirVolume;
                return this;
            }

            /**
             * FlexVolume.
             */
            public Builder flexVolume(FlexVolume flexVolume) {
                this.flexVolume = flexVolume;
                return this;
            }

            /**
             * HostPathVolume.
             */
            public Builder hostPathVolume(HostPathVolume hostPathVolume) {
                this.hostPathVolume = hostPathVolume;
                return this;
            }

            /**
             * NFSVolume.
             */
            public Builder NFSVolume(NFSVolume NFSVolume) {
                this.NFSVolume = NFSVolume;
                return this;
            }

            /**
             * The name of the volume.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the HostPath volume. Valid values:
             * <p>
             * 
             * *   Directory
             * *   File
             * 
             * > This parameter is unavailable.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Volume build() {
                return new Volume(this);
            } 

        } 

    }
}
