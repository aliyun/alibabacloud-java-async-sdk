// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEciScalingConfigurationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEciScalingConfigurationsResponseBody</p>
 */
public class DescribeEciScalingConfigurationsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingConfigurations")
    private java.util.List < ScalingConfigurations> scalingConfigurations;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEciScalingConfigurationsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scalingConfigurations = builder.scalingConfigurations;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEciScalingConfigurationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingConfigurations
     */
    public java.util.List < ScalingConfigurations> getScalingConfigurations() {
        return this.scalingConfigurations;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < ScalingConfigurations> scalingConfigurations; 
        private Integer totalCount; 

        /**
         * The ID of the request.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of scaling configurations.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Details of the scaling configurations.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time when the scaling configuration was created.
         */
        public Builder scalingConfigurations(java.util.List < ScalingConfigurations> scalingConfigurations) {
            this.scalingConfigurations = scalingConfigurations;
            return this;
        }

        /**
         * Details of the scaling configurations.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEciScalingConfigurationsResponseBody build() {
            return new DescribeEciScalingConfigurationsResponseBody(this);
        } 

    } 

    public static class AcrRegistryInfos extends TeaModel {
        @NameInMap("Domains")
        private java.util.List < String > domains;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("RegionId")
        private String regionId;

        private AcrRegistryInfos(Builder builder) {
            this.domains = builder.domains;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AcrRegistryInfos create() {
            return builder().build();
        }

        /**
         * @return domains
         */
        public java.util.List < String > getDomains() {
            return this.domains;
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
            private java.util.List < String > domains; 
            private String instanceId; 
            private String instanceName; 
            private String regionId; 

            /**
             * The IP addresses of the DNS servers.
             */
            public Builder domains(java.util.List < String > domains) {
                this.domains = domains;
                return this;
            }

            /**
             * The region ID of the Container Registry Enterprise Edition instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The domain name of the Container Registry Enterprise Edition instance. By default, all domain names of the Container Registry Enterprise Edition instance are displayed. You can specify one or more domain names. Separate multiple domain names with commas (,).
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The domain name of the Container Registry Enterprise Edition instance. By default, all domain names of the Container Registry Enterprise Edition instance are displayed. You can specify one or more domain names. Separate multiple domain names with commas (,).
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public AcrRegistryInfos build() {
                return new AcrRegistryInfos(this);
            } 

        } 

    }
    public static class EnvironmentVars extends TeaModel {
        @NameInMap("FieldRefFieldPath")
        private String fieldRefFieldPath;

        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private EnvironmentVars(Builder builder) {
            this.fieldRefFieldPath = builder.fieldRefFieldPath;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentVars create() {
            return builder().build();
        }

        /**
         * @return fieldRefFieldPath
         */
        public String getFieldRefFieldPath() {
            return this.fieldRefFieldPath;
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
            private String fieldRefFieldPath; 
            private String key; 
            private String value; 

            /**
             * The container startup commands. You can specify up to 20 commands. Each command can contain up to 256 characters.
             */
            public Builder fieldRefFieldPath(String fieldRefFieldPath) {
                this.fieldRefFieldPath = fieldRefFieldPath;
                return this;
            }

            /**
             * > This parameter is unavailable.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The container startup commands. You can specify up to 20 commands. Each command can contain up to 256 characters.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public EnvironmentVars build() {
                return new EnvironmentVars(this);
            } 

        } 

    }
    public static class Ports extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        private Ports(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ports create() {
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
             * The volumes that are mounted on the container.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The volumes that are mounted on the container.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Ports build() {
                return new Ports(this);
            } 

        } 

    }
    public static class VolumeMounts extends TeaModel {
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

        private VolumeMounts(Builder builder) {
            this.mountPath = builder.mountPath;
            this.mountPropagation = builder.mountPropagation;
            this.name = builder.name;
            this.readOnly = builder.readOnly;
            this.subPath = builder.subPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VolumeMounts create() {
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
             * Details of the environment variables.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * Details of the environment variables.
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * The directory in which the container mounts the volume.
             * <p>
             * 
             * > Data in this directory is overwritten by the data on the volume.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name of the volume. The value of this parameter is the same as the value of the Volumes.Name parameter.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * The mount propagation setting of the volume. Mount propagation allows the sharing of volumes that are mounted on one container with other containers in the same pod, or even with other pods on the same node. Valid values:
             * <p>
             * 
             * *   None: The volume mount does not receive subsequent mounts that are mounted to this volume or its subdirectories.
             * *   HostToCotainer: The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories.
             * *   Bidirectional: This value is similar to HostToCotainer. The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories. In addition, all volume mounts that are created by the container are propagated back to the instance and to all containers of all pods that use the same volume.
             * 
             * Default value: None.
             */
            public Builder subPath(String subPath) {
                this.subPath = subPath;
                return this;
            }

            public VolumeMounts build() {
                return new VolumeMounts(this);
            } 

        } 

    }
    public static class Containers extends TeaModel {
        @NameInMap("Args")
        private java.util.List < String > args;

        @NameInMap("Commands")
        private java.util.List < String > commands;

        @NameInMap("Cpu")
        private Float cpu;

        @NameInMap("EnvironmentVars")
        private java.util.List < EnvironmentVars> environmentVars;

        @NameInMap("Gpu")
        private Integer gpu;

        @NameInMap("Image")
        private String image;

        @NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @NameInMap("LivenessProbeExecCommands")
        private java.util.List < String > livenessProbeExecCommands;

        @NameInMap("LivenessProbeFailureThreshold")
        private Integer livenessProbeFailureThreshold;

        @NameInMap("LivenessProbeHttpGetPath")
        private String livenessProbeHttpGetPath;

        @NameInMap("LivenessProbeHttpGetPort")
        private Integer livenessProbeHttpGetPort;

        @NameInMap("LivenessProbeHttpGetScheme")
        private String livenessProbeHttpGetScheme;

        @NameInMap("LivenessProbeInitialDelaySeconds")
        private Integer livenessProbeInitialDelaySeconds;

        @NameInMap("LivenessProbePeriodSeconds")
        private Integer livenessProbePeriodSeconds;

        @NameInMap("LivenessProbeSuccessThreshold")
        private Integer livenessProbeSuccessThreshold;

        @NameInMap("LivenessProbeTcpSocketPort")
        private Integer livenessProbeTcpSocketPort;

        @NameInMap("LivenessProbeTimeoutSeconds")
        private Integer livenessProbeTimeoutSeconds;

        @NameInMap("Memory")
        private Float memory;

        @NameInMap("Name")
        private String name;

        @NameInMap("Ports")
        private java.util.List < Ports> ports;

        @NameInMap("ReadinessProbeExecCommands")
        private java.util.List < String > readinessProbeExecCommands;

        @NameInMap("ReadinessProbeFailureThreshold")
        private Integer readinessProbeFailureThreshold;

        @NameInMap("ReadinessProbeHttpGetPath")
        private String readinessProbeHttpGetPath;

        @NameInMap("ReadinessProbeHttpGetPort")
        private Integer readinessProbeHttpGetPort;

        @NameInMap("ReadinessProbeHttpGetScheme")
        private String readinessProbeHttpGetScheme;

        @NameInMap("ReadinessProbeInitialDelaySeconds")
        private Integer readinessProbeInitialDelaySeconds;

        @NameInMap("ReadinessProbePeriodSeconds")
        private Integer readinessProbePeriodSeconds;

        @NameInMap("ReadinessProbeSuccessThreshold")
        private Integer readinessProbeSuccessThreshold;

        @NameInMap("ReadinessProbeTcpSocketPort")
        private Integer readinessProbeTcpSocketPort;

        @NameInMap("ReadinessProbeTimeoutSeconds")
        private Integer readinessProbeTimeoutSeconds;

        @NameInMap("SecurityContextCapabilityAdds")
        private java.util.List < String > securityContextCapabilityAdds;

        @NameInMap("SecurityContextReadOnlyRootFilesystem")
        private Boolean securityContextReadOnlyRootFilesystem;

        @NameInMap("SecurityContextRunAsUser")
        private Long securityContextRunAsUser;

        @NameInMap("Stdin")
        private Boolean stdin;

        @NameInMap("StdinOnce")
        private Boolean stdinOnce;

        @NameInMap("Tty")
        private Boolean tty;

        @NameInMap("VolumeMounts")
        private java.util.List < VolumeMounts> volumeMounts;

        @NameInMap("WorkingDir")
        private String workingDir;

        private Containers(Builder builder) {
            this.args = builder.args;
            this.commands = builder.commands;
            this.cpu = builder.cpu;
            this.environmentVars = builder.environmentVars;
            this.gpu = builder.gpu;
            this.image = builder.image;
            this.imagePullPolicy = builder.imagePullPolicy;
            this.livenessProbeExecCommands = builder.livenessProbeExecCommands;
            this.livenessProbeFailureThreshold = builder.livenessProbeFailureThreshold;
            this.livenessProbeHttpGetPath = builder.livenessProbeHttpGetPath;
            this.livenessProbeHttpGetPort = builder.livenessProbeHttpGetPort;
            this.livenessProbeHttpGetScheme = builder.livenessProbeHttpGetScheme;
            this.livenessProbeInitialDelaySeconds = builder.livenessProbeInitialDelaySeconds;
            this.livenessProbePeriodSeconds = builder.livenessProbePeriodSeconds;
            this.livenessProbeSuccessThreshold = builder.livenessProbeSuccessThreshold;
            this.livenessProbeTcpSocketPort = builder.livenessProbeTcpSocketPort;
            this.livenessProbeTimeoutSeconds = builder.livenessProbeTimeoutSeconds;
            this.memory = builder.memory;
            this.name = builder.name;
            this.ports = builder.ports;
            this.readinessProbeExecCommands = builder.readinessProbeExecCommands;
            this.readinessProbeFailureThreshold = builder.readinessProbeFailureThreshold;
            this.readinessProbeHttpGetPath = builder.readinessProbeHttpGetPath;
            this.readinessProbeHttpGetPort = builder.readinessProbeHttpGetPort;
            this.readinessProbeHttpGetScheme = builder.readinessProbeHttpGetScheme;
            this.readinessProbeInitialDelaySeconds = builder.readinessProbeInitialDelaySeconds;
            this.readinessProbePeriodSeconds = builder.readinessProbePeriodSeconds;
            this.readinessProbeSuccessThreshold = builder.readinessProbeSuccessThreshold;
            this.readinessProbeTcpSocketPort = builder.readinessProbeTcpSocketPort;
            this.readinessProbeTimeoutSeconds = builder.readinessProbeTimeoutSeconds;
            this.securityContextCapabilityAdds = builder.securityContextCapabilityAdds;
            this.securityContextReadOnlyRootFilesystem = builder.securityContextReadOnlyRootFilesystem;
            this.securityContextRunAsUser = builder.securityContextRunAsUser;
            this.stdin = builder.stdin;
            this.stdinOnce = builder.stdinOnce;
            this.tty = builder.tty;
            this.volumeMounts = builder.volumeMounts;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Containers create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public java.util.List < String > getArgs() {
            return this.args;
        }

        /**
         * @return commands
         */
        public java.util.List < String > getCommands() {
            return this.commands;
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return environmentVars
         */
        public java.util.List < EnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
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
         * @return livenessProbeExecCommands
         */
        public java.util.List < String > getLivenessProbeExecCommands() {
            return this.livenessProbeExecCommands;
        }

        /**
         * @return livenessProbeFailureThreshold
         */
        public Integer getLivenessProbeFailureThreshold() {
            return this.livenessProbeFailureThreshold;
        }

        /**
         * @return livenessProbeHttpGetPath
         */
        public String getLivenessProbeHttpGetPath() {
            return this.livenessProbeHttpGetPath;
        }

        /**
         * @return livenessProbeHttpGetPort
         */
        public Integer getLivenessProbeHttpGetPort() {
            return this.livenessProbeHttpGetPort;
        }

        /**
         * @return livenessProbeHttpGetScheme
         */
        public String getLivenessProbeHttpGetScheme() {
            return this.livenessProbeHttpGetScheme;
        }

        /**
         * @return livenessProbeInitialDelaySeconds
         */
        public Integer getLivenessProbeInitialDelaySeconds() {
            return this.livenessProbeInitialDelaySeconds;
        }

        /**
         * @return livenessProbePeriodSeconds
         */
        public Integer getLivenessProbePeriodSeconds() {
            return this.livenessProbePeriodSeconds;
        }

        /**
         * @return livenessProbeSuccessThreshold
         */
        public Integer getLivenessProbeSuccessThreshold() {
            return this.livenessProbeSuccessThreshold;
        }

        /**
         * @return livenessProbeTcpSocketPort
         */
        public Integer getLivenessProbeTcpSocketPort() {
            return this.livenessProbeTcpSocketPort;
        }

        /**
         * @return livenessProbeTimeoutSeconds
         */
        public Integer getLivenessProbeTimeoutSeconds() {
            return this.livenessProbeTimeoutSeconds;
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
         * @return ports
         */
        public java.util.List < Ports> getPorts() {
            return this.ports;
        }

        /**
         * @return readinessProbeExecCommands
         */
        public java.util.List < String > getReadinessProbeExecCommands() {
            return this.readinessProbeExecCommands;
        }

        /**
         * @return readinessProbeFailureThreshold
         */
        public Integer getReadinessProbeFailureThreshold() {
            return this.readinessProbeFailureThreshold;
        }

        /**
         * @return readinessProbeHttpGetPath
         */
        public String getReadinessProbeHttpGetPath() {
            return this.readinessProbeHttpGetPath;
        }

        /**
         * @return readinessProbeHttpGetPort
         */
        public Integer getReadinessProbeHttpGetPort() {
            return this.readinessProbeHttpGetPort;
        }

        /**
         * @return readinessProbeHttpGetScheme
         */
        public String getReadinessProbeHttpGetScheme() {
            return this.readinessProbeHttpGetScheme;
        }

        /**
         * @return readinessProbeInitialDelaySeconds
         */
        public Integer getReadinessProbeInitialDelaySeconds() {
            return this.readinessProbeInitialDelaySeconds;
        }

        /**
         * @return readinessProbePeriodSeconds
         */
        public Integer getReadinessProbePeriodSeconds() {
            return this.readinessProbePeriodSeconds;
        }

        /**
         * @return readinessProbeSuccessThreshold
         */
        public Integer getReadinessProbeSuccessThreshold() {
            return this.readinessProbeSuccessThreshold;
        }

        /**
         * @return readinessProbeTcpSocketPort
         */
        public Integer getReadinessProbeTcpSocketPort() {
            return this.readinessProbeTcpSocketPort;
        }

        /**
         * @return readinessProbeTimeoutSeconds
         */
        public Integer getReadinessProbeTimeoutSeconds() {
            return this.readinessProbeTimeoutSeconds;
        }

        /**
         * @return securityContextCapabilityAdds
         */
        public java.util.List < String > getSecurityContextCapabilityAdds() {
            return this.securityContextCapabilityAdds;
        }

        /**
         * @return securityContextReadOnlyRootFilesystem
         */
        public Boolean getSecurityContextReadOnlyRootFilesystem() {
            return this.securityContextReadOnlyRootFilesystem;
        }

        /**
         * @return securityContextRunAsUser
         */
        public Long getSecurityContextRunAsUser() {
            return this.securityContextRunAsUser;
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
         * @return volumeMounts
         */
        public java.util.List < VolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private java.util.List < String > args; 
            private java.util.List < String > commands; 
            private Float cpu; 
            private java.util.List < EnvironmentVars> environmentVars; 
            private Integer gpu; 
            private String image; 
            private String imagePullPolicy; 
            private java.util.List < String > livenessProbeExecCommands; 
            private Integer livenessProbeFailureThreshold; 
            private String livenessProbeHttpGetPath; 
            private Integer livenessProbeHttpGetPort; 
            private String livenessProbeHttpGetScheme; 
            private Integer livenessProbeInitialDelaySeconds; 
            private Integer livenessProbePeriodSeconds; 
            private Integer livenessProbeSuccessThreshold; 
            private Integer livenessProbeTcpSocketPort; 
            private Integer livenessProbeTimeoutSeconds; 
            private Float memory; 
            private String name; 
            private java.util.List < Ports> ports; 
            private java.util.List < String > readinessProbeExecCommands; 
            private Integer readinessProbeFailureThreshold; 
            private String readinessProbeHttpGetPath; 
            private Integer readinessProbeHttpGetPort; 
            private String readinessProbeHttpGetScheme; 
            private Integer readinessProbeInitialDelaySeconds; 
            private Integer readinessProbePeriodSeconds; 
            private Integer readinessProbeSuccessThreshold; 
            private Integer readinessProbeTcpSocketPort; 
            private Integer readinessProbeTimeoutSeconds; 
            private java.util.List < String > securityContextCapabilityAdds; 
            private Boolean securityContextReadOnlyRootFilesystem; 
            private Long securityContextRunAsUser; 
            private Boolean stdin; 
            private Boolean stdinOnce; 
            private Boolean tty; 
            private java.util.List < VolumeMounts> volumeMounts; 
            private String workingDir; 

            /**
             * The commands that are run in the container when you use the CLI to perform probes.
             */
            public Builder args(java.util.List < String > args) {
                this.args = args;
                return this;
            }

            /**
             * The commands that are run in the container when you use the CLI to perform probes.
             */
            public Builder commands(java.util.List < String > commands) {
                this.commands = commands;
                return this;
            }

            /**
             * The minimum number of consecutive failures for a probe to be considered failed after having been successful.
             * <p>
             * 
             * Default value: 3.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The name of the environment variable.
             */
            public Builder environmentVars(java.util.List < EnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * Indicates whether the container allocates buffer resources to standard input streams when the container runs. If you do not specify this parameter, an end-of-file (EOF) error may occur. Default value: false.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * The protocol type of HTTP GET requests when you use HTTP requests to perform probes. Valid values:
             * <p>
             * 
             * *   HTTP
             * *   HTTPS
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The number of vCPUs that are allocated to the container.
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * The arguments that are passed to the container startup commands. You can specify up to 10 arguments.
             */
            public Builder livenessProbeExecCommands(java.util.List < String > livenessProbeExecCommands) {
                this.livenessProbeExecCommands = livenessProbeExecCommands;
                return this;
            }

            /**
             * The exposed ports and protocols of the container.
             */
            public Builder livenessProbeFailureThreshold(Integer livenessProbeFailureThreshold) {
                this.livenessProbeFailureThreshold = livenessProbeFailureThreshold;
                return this;
            }

            /**
             * The port number of TcpSocket.
             */
            public Builder livenessProbeHttpGetPath(String livenessProbeHttpGetPath) {
                this.livenessProbeHttpGetPath = livenessProbeHttpGetPath;
                return this;
            }

            /**
             * The number of seconds between the time when the startup of the container ends and the time when the probe starts.
             */
            public Builder livenessProbeHttpGetPort(Integer livenessProbeHttpGetPort) {
                this.livenessProbeHttpGetPort = livenessProbeHttpGetPort;
                return this;
            }

            /**
             * Indicates whether interaction is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * If the value of the Command parameter is /bin/bash, the value of this parameter is true.
             * 
             * Default value: false.
             */
            public Builder livenessProbeHttpGetScheme(String livenessProbeHttpGetScheme) {
                this.livenessProbeHttpGetScheme = livenessProbeHttpGetScheme;
                return this;
            }

            /**
             * The image pulling policy. Valid values:
             * <p>
             * 
             * *   Always: Image pulling is performed each time.
             * *   IfNotPresent: Image pulling is performed only if on-premises images are unavailable. On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.
             * *   Never: On-premises images are always used. Image pulling is not performed.
             */
            public Builder livenessProbeInitialDelaySeconds(Integer livenessProbeInitialDelaySeconds) {
                this.livenessProbeInitialDelaySeconds = livenessProbeInitialDelaySeconds;
                return this;
            }

            /**
             * The protocol type of HTTP GET requests when you use HTTP requests to perform probes. Valid values:
             * <p>
             * 
             * *   HTTP
             * *   HTTPS
             */
            public Builder livenessProbePeriodSeconds(Integer livenessProbePeriodSeconds) {
                this.livenessProbePeriodSeconds = livenessProbePeriodSeconds;
                return this;
            }

            /**
             * The user ID (UID) that is used to run the entry point of the container process.
             */
            public Builder livenessProbeSuccessThreshold(Integer livenessProbeSuccessThreshold) {
                this.livenessProbeSuccessThreshold = livenessProbeSuccessThreshold;
                return this;
            }

            /**
             * The working directory of the container.
             */
            public Builder livenessProbeTcpSocketPort(Integer livenessProbeTcpSocketPort) {
                this.livenessProbeTcpSocketPort = livenessProbeTcpSocketPort;
                return this;
            }

            /**
             * The minimum number of consecutive failures for a probe to be considered failed after having been successful.
             * <p>
             * 
             * Default value: 3.
             */
            public Builder livenessProbeTimeoutSeconds(Integer livenessProbeTimeoutSeconds) {
                this.livenessProbeTimeoutSeconds = livenessProbeTimeoutSeconds;
                return this;
            }

            /**
             * Indicates whether the root file system is set to the read-only mode. The only valid value is true.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The path to which the system sends an HTTP GET request for a probe.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The port number. Valid values: 1 to 65535.
             */
            public Builder ports(java.util.List < Ports> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * The permissions granted to processes in the container. Valid values: NET_ADMIN and NET_RAW.
             * <p>
             * 
             * > To use NET_RAW, you need to submit a ticket.
             */
            public Builder readinessProbeExecCommands(java.util.List < String > readinessProbeExecCommands) {
                this.readinessProbeExecCommands = readinessProbeExecCommands;
                return this;
            }

            /**
             * The exposed ports and protocols of the container.
             */
            public Builder readinessProbeFailureThreshold(Integer readinessProbeFailureThreshold) {
                this.readinessProbeFailureThreshold = readinessProbeFailureThreshold;
                return this;
            }

            /**
             * The interval at which probes are performed. Default value: 10. Minimum value: 1. Unit: seconds.
             */
            public Builder readinessProbeHttpGetPath(String readinessProbeHttpGetPath) {
                this.readinessProbeHttpGetPath = readinessProbeHttpGetPath;
                return this;
            }

            /**
             * The timeout period of a probe. Default value: 1. Minimum value: 1. Unit: seconds.
             */
            public Builder readinessProbeHttpGetPort(Integer readinessProbeHttpGetPort) {
                this.readinessProbeHttpGetPort = readinessProbeHttpGetPort;
                return this;
            }

            /**
             * The minimum number of consecutive successes for a probe to be considered successful after having failed. Default value: 1. Valid value: 1.
             */
            public Builder readinessProbeHttpGetScheme(String readinessProbeHttpGetScheme) {
                this.readinessProbeHttpGetScheme = readinessProbeHttpGetScheme;
                return this;
            }

            /**
             * The memory size of the container.
             */
            public Builder readinessProbeInitialDelaySeconds(Integer readinessProbeInitialDelaySeconds) {
                this.readinessProbeInitialDelaySeconds = readinessProbeInitialDelaySeconds;
                return this;
            }

            /**
             * Indicates whether standard input streams are disconnected after a client is disconnected. If Stdin is set to true, standard input streams remain connected during multiple sessions.
             * <p>
             * 
             * If StdinOnce is set to true, standard input streams are connected after the container is started and remain idle until a client is connected to receive data. After the client is disconnected, streams are also disconnected and remain in the disconnected state until the container is started again.
             */
            public Builder readinessProbePeriodSeconds(Integer readinessProbePeriodSeconds) {
                this.readinessProbePeriodSeconds = readinessProbePeriodSeconds;
                return this;
            }

            /**
             * The port number of TcpSocket.
             */
            public Builder readinessProbeSuccessThreshold(Integer readinessProbeSuccessThreshold) {
                this.readinessProbeSuccessThreshold = readinessProbeSuccessThreshold;
                return this;
            }

            /**
             * The path to which the system sends an HTTP GET request for a probe.
             */
            public Builder readinessProbeTcpSocketPort(Integer readinessProbeTcpSocketPort) {
                this.readinessProbeTcpSocketPort = readinessProbeTcpSocketPort;
                return this;
            }

            /**
             * The number of seconds between the time when the startup of the container ends and the time when the probe starts.
             */
            public Builder readinessProbeTimeoutSeconds(Integer readinessProbeTimeoutSeconds) {
                this.readinessProbeTimeoutSeconds = readinessProbeTimeoutSeconds;
                return this;
            }

            /**
             * The init containers.
             */
            public Builder securityContextCapabilityAdds(java.util.List < String > securityContextCapabilityAdds) {
                this.securityContextCapabilityAdds = securityContextCapabilityAdds;
                return this;
            }

            /**
             * The image of the container.
             */
            public Builder securityContextReadOnlyRootFilesystem(Boolean securityContextReadOnlyRootFilesystem) {
                this.securityContextReadOnlyRootFilesystem = securityContextReadOnlyRootFilesystem;
                return this;
            }

            /**
             * The interval at which probes are performed. Default value: 10. Minimum value: 1. Unit: seconds.
             */
            public Builder securityContextRunAsUser(Long securityContextRunAsUser) {
                this.securityContextRunAsUser = securityContextRunAsUser;
                return this;
            }

            /**
             * The name of the container.
             */
            public Builder stdin(Boolean stdin) {
                this.stdin = stdin;
                return this;
            }

            /**
             * The timeout period of a probe. Default value: 1. Minimum value: 1. Unit: seconds.
             */
            public Builder stdinOnce(Boolean stdinOnce) {
                this.stdinOnce = stdinOnce;
                return this;
            }

            /**
             * The number of GPUs.
             */
            public Builder tty(Boolean tty) {
                this.tty = tty;
                return this;
            }

            /**
             * Indicates whether the volume is read-only.
             * <p>
             * 
             * Default value: false.
             */
            public Builder volumeMounts(java.util.List < VolumeMounts> volumeMounts) {
                this.volumeMounts = volumeMounts;
                return this;
            }

            /**
             * The port to which HTTP GET requests were sent.
             */
            public Builder workingDir(String workingDir) {
                this.workingDir = workingDir;
                return this;
            }

            public Containers build() {
                return new Containers(this);
            } 

        } 

    }
    public static class DnsConfigOptions extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private DnsConfigOptions(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsConfigOptions create() {
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
             * The hostname aliases of a container.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The hostname aliases of a container.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DnsConfigOptions build() {
                return new DnsConfigOptions(this);
            } 

        } 

    }
    public static class HostAliases extends TeaModel {
        @NameInMap("Hostnames")
        private java.util.List < String > hostnames;

        @NameInMap("Ip")
        private String ip;

        private HostAliases(Builder builder) {
            this.hostnames = builder.hostnames;
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostAliases create() {
            return builder().build();
        }

        /**
         * @return hostnames
         */
        public java.util.List < String > getHostnames() {
            return this.hostnames;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List < String > hostnames; 
            private String ip; 

            /**
             * The system information of the security context in which the elastic container instance runs.
             */
            public Builder hostnames(java.util.List < String > hostnames) {
                this.hostnames = hostnames;
                return this;
            }

            /**
             * The hostnames that are added.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public HostAliases build() {
                return new HostAliases(this);
            } 

        } 

    }
    public static class ImageRegistryCredentials extends TeaModel {
        @NameInMap("Password")
        private String password;

        @NameInMap("Server")
        private String server;

        @NameInMap("UserName")
        private String userName;

        private ImageRegistryCredentials(Builder builder) {
            this.password = builder.password;
            this.server = builder.server;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageRegistryCredentials create() {
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
             * The username that is used to access the image repository.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * The options. Each option is a name-value pair. The value in the name-value pair is optional.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * The options. Each option is a name-value pair. The value in the name-value pair is optional.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ImageRegistryCredentials build() {
                return new ImageRegistryCredentials(this);
            } 

        } 

    }
    public static class InitContainerEnvironmentVars extends TeaModel {
        @NameInMap("FieldRefFieldPath")
        private String fieldRefFieldPath;

        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private InitContainerEnvironmentVars(Builder builder) {
            this.fieldRefFieldPath = builder.fieldRefFieldPath;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainerEnvironmentVars create() {
            return builder().build();
        }

        /**
         * @return fieldRefFieldPath
         */
        public String getFieldRefFieldPath() {
            return this.fieldRefFieldPath;
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
            private String fieldRefFieldPath; 
            private String key; 
            private String value; 

            /**
             * Details of the init container ports.
             */
            public Builder fieldRefFieldPath(String fieldRefFieldPath) {
                this.fieldRefFieldPath = fieldRefFieldPath;
                return this;
            }

            /**
             * > This parameter is unavailable.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Details of the init container ports.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InitContainerEnvironmentVars build() {
                return new InitContainerEnvironmentVars(this);
            } 

        } 

    }
    public static class InitContainerPorts extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        private InitContainerPorts(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainerPorts create() {
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
             * The volumes that are mounted on the container.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The volumes that are mounted on the container.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public InitContainerPorts build() {
                return new InitContainerPorts(this);
            } 

        } 

    }
    public static class InitContainerVolumeMounts extends TeaModel {
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

        private InitContainerVolumeMounts(Builder builder) {
            this.mountPath = builder.mountPath;
            this.mountPropagation = builder.mountPropagation;
            this.name = builder.name;
            this.readOnly = builder.readOnly;
            this.subPath = builder.subPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainerVolumeMounts create() {
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
             * The permissions that are granted to the processes in the container. Valid values: NET_ADMIN and NET_RAW.
             * <p>
             * 
             * > To use NET_RAW, you need to submit a ticket.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * The permissions that are granted to the processes in the container. Valid values: NET_ADMIN and NET_RAW.
             * <p>
             * 
             * > To use NET_RAW, you need to submit a ticket.
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * The directory to which the volume is mounted. Data under this directory is overwritten by the data on the volume.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name of the volume.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * The mount propagation setting of the volume. Mount propagation allows the sharing of volumes that are mounted on one container with other containers in the same pod, or even with other pods on the same node. Valid values:
             * <p>
             * 
             * *   None: The volume mount does not receive subsequent mounts that are mounted to this volume or its subdirectories.
             * *   HostToCotainer: The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories.
             * *   Bidirectional: This value is similar to HostToCotainer. The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories. In addition, all volume mounts that are created by the container are propagated back to the instance and to all containers of all pods that use the same volume.
             * 
             * Default value: None.
             */
            public Builder subPath(String subPath) {
                this.subPath = subPath;
                return this;
            }

            public InitContainerVolumeMounts build() {
                return new InitContainerVolumeMounts(this);
            } 

        } 

    }
    public static class InitContainers extends TeaModel {
        @NameInMap("Cpu")
        private Float cpu;

        @NameInMap("Gpu")
        private Integer gpu;

        @NameInMap("Image")
        private String image;

        @NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @NameInMap("InitContainerArgs")
        private java.util.List < String > initContainerArgs;

        @NameInMap("InitContainerCommands")
        private java.util.List < String > initContainerCommands;

        @NameInMap("InitContainerEnvironmentVars")
        private java.util.List < InitContainerEnvironmentVars> initContainerEnvironmentVars;

        @NameInMap("InitContainerPorts")
        private java.util.List < InitContainerPorts> initContainerPorts;

        @NameInMap("InitContainerVolumeMounts")
        private java.util.List < InitContainerVolumeMounts> initContainerVolumeMounts;

        @NameInMap("Memory")
        private Float memory;

        @NameInMap("Name")
        private String name;

        @NameInMap("SecurityContextCapabilityAdds")
        private java.util.List < String > securityContextCapabilityAdds;

        @NameInMap("SecurityContextReadOnlyRootFilesystem")
        private Boolean securityContextReadOnlyRootFilesystem;

        @NameInMap("SecurityContextRunAsUser")
        private String securityContextRunAsUser;

        @NameInMap("WorkingDir")
        private String workingDir;

        private InitContainers(Builder builder) {
            this.cpu = builder.cpu;
            this.gpu = builder.gpu;
            this.image = builder.image;
            this.imagePullPolicy = builder.imagePullPolicy;
            this.initContainerArgs = builder.initContainerArgs;
            this.initContainerCommands = builder.initContainerCommands;
            this.initContainerEnvironmentVars = builder.initContainerEnvironmentVars;
            this.initContainerPorts = builder.initContainerPorts;
            this.initContainerVolumeMounts = builder.initContainerVolumeMounts;
            this.memory = builder.memory;
            this.name = builder.name;
            this.securityContextCapabilityAdds = builder.securityContextCapabilityAdds;
            this.securityContextReadOnlyRootFilesystem = builder.securityContextReadOnlyRootFilesystem;
            this.securityContextRunAsUser = builder.securityContextRunAsUser;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainers create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
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
         * @return initContainerArgs
         */
        public java.util.List < String > getInitContainerArgs() {
            return this.initContainerArgs;
        }

        /**
         * @return initContainerCommands
         */
        public java.util.List < String > getInitContainerCommands() {
            return this.initContainerCommands;
        }

        /**
         * @return initContainerEnvironmentVars
         */
        public java.util.List < InitContainerEnvironmentVars> getInitContainerEnvironmentVars() {
            return this.initContainerEnvironmentVars;
        }

        /**
         * @return initContainerPorts
         */
        public java.util.List < InitContainerPorts> getInitContainerPorts() {
            return this.initContainerPorts;
        }

        /**
         * @return initContainerVolumeMounts
         */
        public java.util.List < InitContainerVolumeMounts> getInitContainerVolumeMounts() {
            return this.initContainerVolumeMounts;
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
         * @return securityContextCapabilityAdds
         */
        public java.util.List < String > getSecurityContextCapabilityAdds() {
            return this.securityContextCapabilityAdds;
        }

        /**
         * @return securityContextReadOnlyRootFilesystem
         */
        public Boolean getSecurityContextReadOnlyRootFilesystem() {
            return this.securityContextReadOnlyRootFilesystem;
        }

        /**
         * @return securityContextRunAsUser
         */
        public String getSecurityContextRunAsUser() {
            return this.securityContextRunAsUser;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private Float cpu; 
            private Integer gpu; 
            private String image; 
            private String imagePullPolicy; 
            private java.util.List < String > initContainerArgs; 
            private java.util.List < String > initContainerCommands; 
            private java.util.List < InitContainerEnvironmentVars> initContainerEnvironmentVars; 
            private java.util.List < InitContainerPorts> initContainerPorts; 
            private java.util.List < InitContainerVolumeMounts> initContainerVolumeMounts; 
            private Float memory; 
            private String name; 
            private java.util.List < String > securityContextCapabilityAdds; 
            private Boolean securityContextReadOnlyRootFilesystem; 
            private String securityContextRunAsUser; 
            private String workingDir; 

            /**
             * The number of GPUs that are allocated to the container.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The size of the memory.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * The ID of the user that runs the container.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The number of vCPUs.
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * The tags of the elastic container instance. The tags are specified in the key-value pair format.
             */
            public Builder initContainerArgs(java.util.List < String > initContainerArgs) {
                this.initContainerArgs = initContainerArgs;
                return this;
            }

            /**
             * The container startup arguments.
             */
            public Builder initContainerCommands(java.util.List < String > initContainerCommands) {
                this.initContainerCommands = initContainerCommands;
                return this;
            }

            /**
             * The name of the environment variable.
             */
            public Builder initContainerEnvironmentVars(java.util.List < InitContainerEnvironmentVars> initContainerEnvironmentVars) {
                this.initContainerEnvironmentVars = initContainerEnvironmentVars;
                return this;
            }

            /**
             * The port number. Valid values: 1 to 65535.
             */
            public Builder initContainerPorts(java.util.List < InitContainerPorts> initContainerPorts) {
                this.initContainerPorts = initContainerPorts;
                return this;
            }

            /**
             * Indicates whether the mount path is read-only.
             * <p>
             * 
             * Default value: false.
             */
            public Builder initContainerVolumeMounts(java.util.List < InitContainerVolumeMounts> initContainerVolumeMounts) {
                this.initContainerVolumeMounts = initContainerVolumeMounts;
                return this;
            }

            /**
             * Details of the environment variables.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * Details of the environment variables.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The container startup commands.
             */
            public Builder securityContextCapabilityAdds(java.util.List < String > securityContextCapabilityAdds) {
                this.securityContextCapabilityAdds = securityContextCapabilityAdds;
                return this;
            }

            /**
             * The working directory.
             */
            public Builder securityContextReadOnlyRootFilesystem(Boolean securityContextReadOnlyRootFilesystem) {
                this.securityContextReadOnlyRootFilesystem = securityContextReadOnlyRootFilesystem;
                return this;
            }

            /**
             * The name of the container.
             */
            public Builder securityContextRunAsUser(String securityContextRunAsUser) {
                this.securityContextRunAsUser = securityContextRunAsUser;
                return this;
            }

            /**
             * The container image.
             */
            public Builder workingDir(String workingDir) {
                this.workingDir = workingDir;
                return this;
            }

            public InitContainers build() {
                return new InitContainers(this);
            } 

        } 

    }
    public static class SecurityContextSysCtls extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private SecurityContextSysCtls(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityContextSysCtls create() {
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
             * Details of the Container Registry Enterprise Edition instances.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Details of the Container Registry Enterprise Edition instances.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SecurityContextSysCtls build() {
                return new SecurityContextSysCtls(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * Details of the volumes.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Details of the volumes.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class ConfigFileVolumeConfigFileToPaths extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Mode")
        private Integer mode;

        @NameInMap("Path")
        private String path;

        private ConfigFileVolumeConfigFileToPaths(Builder builder) {
            this.content = builder.content;
            this.mode = builder.mode;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigFileVolumeConfigFileToPaths create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String content; 
            private Integer mode; 
            private String path; 

            /**
             * The information about the image repository.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The information about the image repository.
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The content of the configuration file (32 KB).
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public ConfigFileVolumeConfigFileToPaths build() {
                return new ConfigFileVolumeConfigFileToPaths(this);
            } 

        } 

    }
    public static class Volumes extends TeaModel {
        @NameInMap("ConfigFileVolumeConfigFileToPaths")
        private java.util.List < ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

        @NameInMap("ConfigFileVolumeDefaultMode")
        private Integer configFileVolumeDefaultMode;

        @NameInMap("DiskVolumeDiskId")
        private String diskVolumeDiskId;

        @NameInMap("DiskVolumeDiskSize")
        private Integer diskVolumeDiskSize;

        @NameInMap("DiskVolumeFsType")
        private String diskVolumeFsType;

        @NameInMap("EmptyDirVolumeMedium")
        private String emptyDirVolumeMedium;

        @NameInMap("EmptyDirVolumeSizeLimit")
        private String emptyDirVolumeSizeLimit;

        @NameInMap("FlexVolumeDriver")
        private String flexVolumeDriver;

        @NameInMap("FlexVolumeFsType")
        private String flexVolumeFsType;

        @NameInMap("FlexVolumeOptions")
        private String flexVolumeOptions;

        @NameInMap("NFSVolumePath")
        private String NFSVolumePath;

        @NameInMap("NFSVolumeReadOnly")
        private Boolean NFSVolumeReadOnly;

        @NameInMap("NFSVolumeServer")
        private String NFSVolumeServer;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        private Volumes(Builder builder) {
            this.configFileVolumeConfigFileToPaths = builder.configFileVolumeConfigFileToPaths;
            this.configFileVolumeDefaultMode = builder.configFileVolumeDefaultMode;
            this.diskVolumeDiskId = builder.diskVolumeDiskId;
            this.diskVolumeDiskSize = builder.diskVolumeDiskSize;
            this.diskVolumeFsType = builder.diskVolumeFsType;
            this.emptyDirVolumeMedium = builder.emptyDirVolumeMedium;
            this.emptyDirVolumeSizeLimit = builder.emptyDirVolumeSizeLimit;
            this.flexVolumeDriver = builder.flexVolumeDriver;
            this.flexVolumeFsType = builder.flexVolumeFsType;
            this.flexVolumeOptions = builder.flexVolumeOptions;
            this.NFSVolumePath = builder.NFSVolumePath;
            this.NFSVolumeReadOnly = builder.NFSVolumeReadOnly;
            this.NFSVolumeServer = builder.NFSVolumeServer;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Volumes create() {
            return builder().build();
        }

        /**
         * @return configFileVolumeConfigFileToPaths
         */
        public java.util.List < ConfigFileVolumeConfigFileToPaths> getConfigFileVolumeConfigFileToPaths() {
            return this.configFileVolumeConfigFileToPaths;
        }

        /**
         * @return configFileVolumeDefaultMode
         */
        public Integer getConfigFileVolumeDefaultMode() {
            return this.configFileVolumeDefaultMode;
        }

        /**
         * @return diskVolumeDiskId
         */
        public String getDiskVolumeDiskId() {
            return this.diskVolumeDiskId;
        }

        /**
         * @return diskVolumeDiskSize
         */
        public Integer getDiskVolumeDiskSize() {
            return this.diskVolumeDiskSize;
        }

        /**
         * @return diskVolumeFsType
         */
        public String getDiskVolumeFsType() {
            return this.diskVolumeFsType;
        }

        /**
         * @return emptyDirVolumeMedium
         */
        public String getEmptyDirVolumeMedium() {
            return this.emptyDirVolumeMedium;
        }

        /**
         * @return emptyDirVolumeSizeLimit
         */
        public String getEmptyDirVolumeSizeLimit() {
            return this.emptyDirVolumeSizeLimit;
        }

        /**
         * @return flexVolumeDriver
         */
        public String getFlexVolumeDriver() {
            return this.flexVolumeDriver;
        }

        /**
         * @return flexVolumeFsType
         */
        public String getFlexVolumeFsType() {
            return this.flexVolumeFsType;
        }

        /**
         * @return flexVolumeOptions
         */
        public String getFlexVolumeOptions() {
            return this.flexVolumeOptions;
        }

        /**
         * @return NFSVolumePath
         */
        public String getNFSVolumePath() {
            return this.NFSVolumePath;
        }

        /**
         * @return NFSVolumeReadOnly
         */
        public Boolean getNFSVolumeReadOnly() {
            return this.NFSVolumeReadOnly;
        }

        /**
         * @return NFSVolumeServer
         */
        public String getNFSVolumeServer() {
            return this.NFSVolumeServer;
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
            private java.util.List < ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths; 
            private Integer configFileVolumeDefaultMode; 
            private String diskVolumeDiskId; 
            private Integer diskVolumeDiskSize; 
            private String diskVolumeFsType; 
            private String emptyDirVolumeMedium; 
            private String emptyDirVolumeSizeLimit; 
            private String flexVolumeDriver; 
            private String flexVolumeFsType; 
            private String flexVolumeOptions; 
            private String NFSVolumePath; 
            private Boolean NFSVolumeReadOnly; 
            private String NFSVolumeServer; 
            private String name; 
            private String type; 

            /**
             * The relative path to the configuration file.
             */
            public Builder configFileVolumeConfigFileToPaths(java.util.List < ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths) {
                this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
                return this;
            }

            /**
             * The FlexVolume options. Each option is a key-value pair in a JSON string.
             * <p>
             * 
             * For example, when you use FlexVolume to mount a disk, the format of options is `{"volumeId":"d-2zehdahrwoa7srg****","performanceLevel": "PL2"}`.
             */
            public Builder configFileVolumeDefaultMode(Integer configFileVolumeDefaultMode) {
                this.configFileVolumeDefaultMode = configFileVolumeDefaultMode;
                return this;
            }

            /**
             * The storage medium of EmptyDirVolume. If this parameter is left empty, the file system that backs the node is used as the storage medium. If this parameter is set to memory, the memory is used as the storage medium.
             */
            public Builder diskVolumeDiskId(String diskVolumeDiskId) {
                this.diskVolumeDiskId = diskVolumeDiskId;
                return this;
            }

            /**
             * The file system type of the volume. The default value is determined by the script of FlexVolume.
             */
            public Builder diskVolumeDiskSize(Integer diskVolumeDiskSize) {
                this.diskVolumeDiskSize = diskVolumeDiskSize;
                return this;
            }

            /**
             * The path to the Network File System (NFS) volume.
             */
            public Builder diskVolumeFsType(String diskVolumeFsType) {
                this.diskVolumeFsType = diskVolumeFsType;
                return this;
            }

            /**
             * The storage size of a disk volume. Unit: GiB.
             */
            public Builder emptyDirVolumeMedium(String emptyDirVolumeMedium) {
                this.emptyDirVolumeMedium = emptyDirVolumeMedium;
                return this;
            }

            /**
             * EmptyDirVolumeSizeLimit.
             */
            public Builder emptyDirVolumeSizeLimit(String emptyDirVolumeSizeLimit) {
                this.emptyDirVolumeSizeLimit = emptyDirVolumeSizeLimit;
                return this;
            }

            /**
             * The endpoint of the NFS server.
             */
            public Builder flexVolumeDriver(String flexVolumeDriver) {
                this.flexVolumeDriver = flexVolumeDriver;
                return this;
            }

            /**
             * The FlexVolume driver name of the volume.
             */
            public Builder flexVolumeFsType(String flexVolumeFsType) {
                this.flexVolumeFsType = flexVolumeFsType;
                return this;
            }

            /**
             * The name of the volume.
             */
            public Builder flexVolumeOptions(String flexVolumeOptions) {
                this.flexVolumeOptions = flexVolumeOptions;
                return this;
            }

            /**
             * Indicates whether the NFS volume is read-only.
             * <p>
             * 
             * Default value: false.
             */
            public Builder NFSVolumePath(String NFSVolumePath) {
                this.NFSVolumePath = NFSVolumePath;
                return this;
            }

            /**
             * The default permissions on the ConfigFile volume.
             */
            public Builder NFSVolumeReadOnly(Boolean NFSVolumeReadOnly) {
                this.NFSVolumeReadOnly = NFSVolumeReadOnly;
                return this;
            }

            /**
             * The paths to configuration files.
             */
            public Builder NFSVolumeServer(String NFSVolumeServer) {
                this.NFSVolumeServer = NFSVolumeServer;
                return this;
            }

            /**
             * The paths to configuration files.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The file system type of a disk volume.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Volumes build() {
                return new Volumes(this);
            } 

        } 

    }
    public static class ScalingConfigurations extends TeaModel {
        @NameInMap("AcrRegistryInfos")
        private java.util.List < AcrRegistryInfos> acrRegistryInfos;

        @NameInMap("ActiveDeadlineSeconds")
        private Integer activeDeadlineSeconds;

        @NameInMap("AutoCreateEip")
        private Boolean autoCreateEip;

        @NameInMap("AutoMatchImageCache")
        private Boolean autoMatchImageCache;

        @NameInMap("ContainerGroupName")
        private String containerGroupName;

        @NameInMap("Containers")
        private java.util.List < Containers> containers;

        @NameInMap("CostOptimization")
        private Boolean costOptimization;

        @NameInMap("Cpu")
        private Float cpu;

        @NameInMap("CpuOptionsCore")
        private Integer cpuOptionsCore;

        @NameInMap("CpuOptionsThreadsPerCore")
        private Integer cpuOptionsThreadsPerCore;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DnsConfigNameServers")
        private java.util.List < String > dnsConfigNameServers;

        @NameInMap("DnsConfigOptions")
        private java.util.List < DnsConfigOptions> dnsConfigOptions;

        @NameInMap("DnsConfigSearches")
        private java.util.List < String > dnsConfigSearches;

        @NameInMap("DnsPolicy")
        private String dnsPolicy;

        @NameInMap("EgressBandwidth")
        private Long egressBandwidth;

        @NameInMap("EipBandwidth")
        private Integer eipBandwidth;

        @NameInMap("EphemeralStorage")
        private Integer ephemeralStorage;

        @NameInMap("HostAliases")
        private java.util.List < HostAliases> hostAliases;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("ImageRegistryCredentials")
        private java.util.List < ImageRegistryCredentials> imageRegistryCredentials;

        @NameInMap("ImageSnapshotId")
        private String imageSnapshotId;

        @NameInMap("IngressBandwidth")
        private Long ingressBandwidth;

        @NameInMap("InitContainers")
        private java.util.List < InitContainers> initContainers;

        @NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @NameInMap("Ipv6AddressCount")
        private Integer ipv6AddressCount;

        @NameInMap("LifecycleState")
        private String lifecycleState;

        @NameInMap("LoadBalancerWeight")
        private Integer loadBalancerWeight;

        @NameInMap("Memory")
        private Float memory;

        @NameInMap("NtpServers")
        private java.util.List < String > ntpServers;

        @NameInMap("RamRoleName")
        private String ramRoleName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("RestartPolicy")
        private String restartPolicy;

        @NameInMap("ScalingConfigurationId")
        private String scalingConfigurationId;

        @NameInMap("ScalingConfigurationName")
        private String scalingConfigurationName;

        @NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @NameInMap("SecurityContextSysCtls")
        private java.util.List < SecurityContextSysCtls> securityContextSysCtls;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SlsEnable")
        private Boolean slsEnable;

        @NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TerminationGracePeriodSeconds")
        private Integer terminationGracePeriodSeconds;

        @NameInMap("Volumes")
        private java.util.List < Volumes> volumes;

        private ScalingConfigurations(Builder builder) {
            this.acrRegistryInfos = builder.acrRegistryInfos;
            this.activeDeadlineSeconds = builder.activeDeadlineSeconds;
            this.autoCreateEip = builder.autoCreateEip;
            this.autoMatchImageCache = builder.autoMatchImageCache;
            this.containerGroupName = builder.containerGroupName;
            this.containers = builder.containers;
            this.costOptimization = builder.costOptimization;
            this.cpu = builder.cpu;
            this.cpuOptionsCore = builder.cpuOptionsCore;
            this.cpuOptionsThreadsPerCore = builder.cpuOptionsThreadsPerCore;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.dnsConfigNameServers = builder.dnsConfigNameServers;
            this.dnsConfigOptions = builder.dnsConfigOptions;
            this.dnsConfigSearches = builder.dnsConfigSearches;
            this.dnsPolicy = builder.dnsPolicy;
            this.egressBandwidth = builder.egressBandwidth;
            this.eipBandwidth = builder.eipBandwidth;
            this.ephemeralStorage = builder.ephemeralStorage;
            this.hostAliases = builder.hostAliases;
            this.hostName = builder.hostName;
            this.imageRegistryCredentials = builder.imageRegistryCredentials;
            this.imageSnapshotId = builder.imageSnapshotId;
            this.ingressBandwidth = builder.ingressBandwidth;
            this.initContainers = builder.initContainers;
            this.instanceFamilyLevel = builder.instanceFamilyLevel;
            this.ipv6AddressCount = builder.ipv6AddressCount;
            this.lifecycleState = builder.lifecycleState;
            this.loadBalancerWeight = builder.loadBalancerWeight;
            this.memory = builder.memory;
            this.ntpServers = builder.ntpServers;
            this.ramRoleName = builder.ramRoleName;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.restartPolicy = builder.restartPolicy;
            this.scalingConfigurationId = builder.scalingConfigurationId;
            this.scalingConfigurationName = builder.scalingConfigurationName;
            this.scalingGroupId = builder.scalingGroupId;
            this.securityContextSysCtls = builder.securityContextSysCtls;
            this.securityGroupId = builder.securityGroupId;
            this.slsEnable = builder.slsEnable;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.spotStrategy = builder.spotStrategy;
            this.tags = builder.tags;
            this.terminationGracePeriodSeconds = builder.terminationGracePeriodSeconds;
            this.volumes = builder.volumes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingConfigurations create() {
            return builder().build();
        }

        /**
         * @return acrRegistryInfos
         */
        public java.util.List < AcrRegistryInfos> getAcrRegistryInfos() {
            return this.acrRegistryInfos;
        }

        /**
         * @return activeDeadlineSeconds
         */
        public Integer getActiveDeadlineSeconds() {
            return this.activeDeadlineSeconds;
        }

        /**
         * @return autoCreateEip
         */
        public Boolean getAutoCreateEip() {
            return this.autoCreateEip;
        }

        /**
         * @return autoMatchImageCache
         */
        public Boolean getAutoMatchImageCache() {
            return this.autoMatchImageCache;
        }

        /**
         * @return containerGroupName
         */
        public String getContainerGroupName() {
            return this.containerGroupName;
        }

        /**
         * @return containers
         */
        public java.util.List < Containers> getContainers() {
            return this.containers;
        }

        /**
         * @return costOptimization
         */
        public Boolean getCostOptimization() {
            return this.costOptimization;
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return cpuOptionsCore
         */
        public Integer getCpuOptionsCore() {
            return this.cpuOptionsCore;
        }

        /**
         * @return cpuOptionsThreadsPerCore
         */
        public Integer getCpuOptionsThreadsPerCore() {
            return this.cpuOptionsThreadsPerCore;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dnsConfigNameServers
         */
        public java.util.List < String > getDnsConfigNameServers() {
            return this.dnsConfigNameServers;
        }

        /**
         * @return dnsConfigOptions
         */
        public java.util.List < DnsConfigOptions> getDnsConfigOptions() {
            return this.dnsConfigOptions;
        }

        /**
         * @return dnsConfigSearches
         */
        public java.util.List < String > getDnsConfigSearches() {
            return this.dnsConfigSearches;
        }

        /**
         * @return dnsPolicy
         */
        public String getDnsPolicy() {
            return this.dnsPolicy;
        }

        /**
         * @return egressBandwidth
         */
        public Long getEgressBandwidth() {
            return this.egressBandwidth;
        }

        /**
         * @return eipBandwidth
         */
        public Integer getEipBandwidth() {
            return this.eipBandwidth;
        }

        /**
         * @return ephemeralStorage
         */
        public Integer getEphemeralStorage() {
            return this.ephemeralStorage;
        }

        /**
         * @return hostAliases
         */
        public java.util.List < HostAliases> getHostAliases() {
            return this.hostAliases;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return imageRegistryCredentials
         */
        public java.util.List < ImageRegistryCredentials> getImageRegistryCredentials() {
            return this.imageRegistryCredentials;
        }

        /**
         * @return imageSnapshotId
         */
        public String getImageSnapshotId() {
            return this.imageSnapshotId;
        }

        /**
         * @return ingressBandwidth
         */
        public Long getIngressBandwidth() {
            return this.ingressBandwidth;
        }

        /**
         * @return initContainers
         */
        public java.util.List < InitContainers> getInitContainers() {
            return this.initContainers;
        }

        /**
         * @return instanceFamilyLevel
         */
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        /**
         * @return ipv6AddressCount
         */
        public Integer getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        /**
         * @return lifecycleState
         */
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        /**
         * @return loadBalancerWeight
         */
        public Integer getLoadBalancerWeight() {
            return this.loadBalancerWeight;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        /**
         * @return ntpServers
         */
        public java.util.List < String > getNtpServers() {
            return this.ntpServers;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return restartPolicy
         */
        public String getRestartPolicy() {
            return this.restartPolicy;
        }

        /**
         * @return scalingConfigurationId
         */
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        /**
         * @return scalingConfigurationName
         */
        public String getScalingConfigurationName() {
            return this.scalingConfigurationName;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return securityContextSysCtls
         */
        public java.util.List < SecurityContextSysCtls> getSecurityContextSysCtls() {
            return this.securityContextSysCtls;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return slsEnable
         */
        public Boolean getSlsEnable() {
            return this.slsEnable;
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return terminationGracePeriodSeconds
         */
        public Integer getTerminationGracePeriodSeconds() {
            return this.terminationGracePeriodSeconds;
        }

        /**
         * @return volumes
         */
        public java.util.List < Volumes> getVolumes() {
            return this.volumes;
        }

        public static final class Builder {
            private java.util.List < AcrRegistryInfos> acrRegistryInfos; 
            private Integer activeDeadlineSeconds; 
            private Boolean autoCreateEip; 
            private Boolean autoMatchImageCache; 
            private String containerGroupName; 
            private java.util.List < Containers> containers; 
            private Boolean costOptimization; 
            private Float cpu; 
            private Integer cpuOptionsCore; 
            private Integer cpuOptionsThreadsPerCore; 
            private String creationTime; 
            private String description; 
            private java.util.List < String > dnsConfigNameServers; 
            private java.util.List < DnsConfigOptions> dnsConfigOptions; 
            private java.util.List < String > dnsConfigSearches; 
            private String dnsPolicy; 
            private Long egressBandwidth; 
            private Integer eipBandwidth; 
            private Integer ephemeralStorage; 
            private java.util.List < HostAliases> hostAliases; 
            private String hostName; 
            private java.util.List < ImageRegistryCredentials> imageRegistryCredentials; 
            private String imageSnapshotId; 
            private Long ingressBandwidth; 
            private java.util.List < InitContainers> initContainers; 
            private String instanceFamilyLevel; 
            private Integer ipv6AddressCount; 
            private String lifecycleState; 
            private Integer loadBalancerWeight; 
            private Float memory; 
            private java.util.List < String > ntpServers; 
            private String ramRoleName; 
            private String regionId; 
            private String resourceGroupId; 
            private String restartPolicy; 
            private String scalingConfigurationId; 
            private String scalingConfigurationName; 
            private String scalingGroupId; 
            private java.util.List < SecurityContextSysCtls> securityContextSysCtls; 
            private String securityGroupId; 
            private Boolean slsEnable; 
            private Float spotPriceLimit; 
            private String spotStrategy; 
            private java.util.List < Tags> tags; 
            private Integer terminationGracePeriodSeconds; 
            private java.util.List < Volumes> volumes; 

            /**
             * The ID of the Container Registry Enterprise Edition instance.
             */
            public Builder acrRegistryInfos(java.util.List < AcrRegistryInfos> acrRegistryInfos) {
                this.acrRegistryInfos = acrRegistryInfos;
                return this;
            }

            /**
             * Indicates whether an elastic IP address (EIP) is automatically created, and then bound to the elastic container instance.
             */
            public Builder activeDeadlineSeconds(Integer activeDeadlineSeconds) {
                this.activeDeadlineSeconds = activeDeadlineSeconds;
                return this;
            }

            /**
             * The size of the temporary storage space. Unit: GiB.
             */
            public Builder autoCreateEip(Boolean autoCreateEip) {
                this.autoCreateEip = autoCreateEip;
                return this;
            }

            /**
             * The name of the elastic container instance.
             */
            public Builder autoMatchImageCache(Boolean autoMatchImageCache) {
                this.autoMatchImageCache = autoMatchImageCache;
                return this;
            }

            /**
             * The number of physical CPU cores. This parameter can be specified for only some instance types. For more information, see [Specify custom CPU options](~~197781~~).
             */
            public Builder containerGroupName(String containerGroupName) {
                this.containerGroupName = containerGroupName;
                return this;
            }

            /**
             * The path to which the system sends an HTTP GET request for a probe.
             */
            public Builder containers(java.util.List < Containers> containers) {
                this.containers = containers;
                return this;
            }

            /**
             * auditing
             */
            public Builder costOptimization(Boolean costOptimization) {
                this.costOptimization = costOptimization;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The containers in the elastic container instance.
             */
            public Builder cpuOptionsCore(Integer cpuOptionsCore) {
                this.cpuOptionsCore = cpuOptionsCore;
                return this;
            }

            /**
             * The weight of the elastic container instance as a backend server. Valid values: 1 to 100.
             */
            public Builder cpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
                this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
                return this;
            }

            /**
             * The ID of the security group with which the elastic container instance is associated. Elastic container instances that are associated with the same security group can access each other.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the image cache snapshot.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The DNS lookup domains.
             */
            public Builder dnsConfigNameServers(java.util.List < String > dnsConfigNameServers) {
                this.dnsConfigNameServers = dnsConfigNameServers;
                return this;
            }

            /**
             * The variable name of the option.
             */
            public Builder dnsConfigOptions(java.util.List < DnsConfigOptions> dnsConfigOptions) {
                this.dnsConfigOptions = dnsConfigOptions;
                return this;
            }

            /**
             * The domain names of the Network Time Protocol (NTP) servers.
             */
            public Builder dnsConfigSearches(java.util.List < String > dnsConfigSearches) {
                this.dnsConfigSearches = dnsConfigSearches;
                return this;
            }

            /**
             * The maximum outbound bandwidth. Unit: bytes.
             */
            public Builder dnsPolicy(String dnsPolicy) {
                this.dnsPolicy = dnsPolicy;
                return this;
            }

            /**
             * The name of the instance RAM role. You can use an instance RAM role to access both elastic container instances and Elastic Compute Service (ECS) instances. For more information, see [Use the instance RAM role by calling APIs](~~61178~~).
             */
            public Builder egressBandwidth(Long egressBandwidth) {
                this.egressBandwidth = egressBandwidth;
                return this;
            }

            /**
             * The size of the memory.
             * <p>
             * 
             * You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set the Cpu parameter to 2 and the Memory parameter to 16 to specify the instance types that have 2 vCPUs and 16 GiB of memory. If you specify the Cpu and Memory parameters, Auto Scaling determines available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances of the instance type that is provided at the lowest price.
             * 
             * > You can specify CPU and memory specifications to determine the range of instance types only if the Scaling Policy parameter is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.
             */
            public Builder eipBandwidth(Integer eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * > This parameter is unavailable.
             */
            public Builder ephemeralStorage(Integer ephemeralStorage) {
                this.ephemeralStorage = ephemeralStorage;
                return this;
            }

            /**
             * The IP address that is added.
             */
            public Builder hostAliases(java.util.List < HostAliases> hostAliases) {
                this.hostAliases = hostAliases;
                return this;
            }

            /**
             * The region ID of the elastic container instance.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The password that is used to access the image repository.
             */
            public Builder imageRegistryCredentials(java.util.List < ImageRegistryCredentials> imageRegistryCredentials) {
                this.imageRegistryCredentials = imageRegistryCredentials;
                return this;
            }

            /**
             * The restart policy of the elastic container instance. Valid values:
             * <p>
             * 
             * *   Never: never restarts the elastic container instance.
             * *   Always: always restarts the elastic container instance.
             * *   OnFailure: restarts the elastic container instance upon failures.
             */
            public Builder imageSnapshotId(String imageSnapshotId) {
                this.imageSnapshotId = imageSnapshotId;
                return this;
            }

            /**
             * The buffer time in which the program handles operations before the program stops.
             */
            public Builder ingressBandwidth(Long ingressBandwidth) {
                this.ingressBandwidth = ingressBandwidth;
                return this;
            }

            /**
             * Indicates whether the root file system is read-only. The only valid value is true.
             */
            public Builder initContainers(java.util.List < InitContainers> initContainers) {
                this.initContainers = initContainers;
                return this;
            }

            /**
             * 5292
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * The bandwidth of the EIP. Default value: 5 Mbit/s.
             */
            public Builder ipv6AddressCount(Integer ipv6AddressCount) {
                this.ipv6AddressCount = ipv6AddressCount;
                return this;
            }

            /**
             * The instance family level, which is used to filter the range of instance types that meet the requirements. This parameter takes effect when the `CostOptimization` parameter is set to true. Valid values:
             * <p>
             * 
             * *   EntryLevel: shared instance type. Instances of this level are the most cost-effective but may not provide stable computing performance in a consistent manner. Instances of this level are suitable for business scenarios in which the CPU utilization is low. For more information, see [Shared instance families](~~108489~~).
             * *   EnterpriseLevel: Instances of this level provide stable performance and dedicated resources, and are suitable for business scenarios that require high stability. For more information, see [Instance family](~~25378~~).
             * *   CreditEntryLevel: This value is valid only for burstable instances. CPU credits are used to ensure computing performance. Instances of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see [Overview](~~59977~~) of burstable instances.
             */
            public Builder lifecycleState(String lifecycleState) {
                this.lifecycleState = lifecycleState;
                return this;
            }

            /**
             * The hostname.
             */
            public Builder loadBalancerWeight(Integer loadBalancerWeight) {
                this.loadBalancerWeight = loadBalancerWeight;
                return this;
            }

            /**
             * The maximum hourly price for the preemptible instance.
             * <p>
             * 
             * This parameter is returned only if you set the SpotStrategy parameter to SpotWithPriceLimit.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The state of the scaling configuration in the scaling group. Valid values:
             * <p>
             * 
             * *   Active: The scaling configuration is active in the scaling group. Auto Scaling uses active scaling configurations to automatically create ECS instances.
             * *   Inactive: The scaling configuration is inactive in the scaling group. Auto Scaling does not use inactive scaling configurations to automatically create ECS instances. Inactive scaling configurations are retained in the scaling group.
             */
            public Builder ntpServers(java.util.List < String > ntpServers) {
                this.ntpServers = ntpServers;
                return this;
            }

            /**
             * Indicates whether the image cache is automatically matched. Default value: false.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * The number of vCPUs of the elastic container instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the scaling configuration.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The maximum inbound bandwidth. Unit: bit/s.
             */
            public Builder restartPolicy(String restartPolicy) {
                this.restartPolicy = restartPolicy;
                return this;
            }

            /**
             * > This parameter is unavailable.
             */
            public Builder scalingConfigurationId(String scalingConfigurationId) {
                this.scalingConfigurationId = scalingConfigurationId;
                return this;
            }

            /**
             * The validity period. Unit: seconds.
             */
            public Builder scalingConfigurationName(String scalingConfigurationName) {
                this.scalingConfigurationName = scalingConfigurationName;
                return this;
            }

            /**
             * The number of IPv6 addresses.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * The name of the security context in which the elastic container instance runs.
             */
            public Builder securityContextSysCtls(java.util.List < SecurityContextSysCtls> securityContextSysCtls) {
                this.securityContextSysCtls = securityContextSysCtls;
                return this;
            }

            /**
             * The preemption policy of the instance. Valid values:
             * <p>
             * 
             * *   NoSpot: The instance is created as a regular pay-as-you-go instance.
             * *   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.
             * *   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The containers in the elastic container instance.
             */
            public Builder slsEnable(Boolean slsEnable) {
                this.slsEnable = slsEnable;
                return this;
            }

            /**
             * The number of threads per core. This parameter can be specified for only some instance types. If you set this parameter to 1, Hyper-Threading is disabled. For more information, see [Specify custom CPU options](~~197781~~).
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * The scaling group ID of the scaling configuration.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The key of the tag.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The Domain Name System (DNS) policy.
             */
            public Builder terminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
                this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
                return this;
            }

            /**
             * The type of the volume. Valid values:
             * <p>
             * 
             * *   EmptyDirVolume
             * *   NFSVolume
             * *   ConfigFileVolume
             * *   FlexVolume
             */
            public Builder volumes(java.util.List < Volumes> volumes) {
                this.volumes = volumes;
                return this;
            }

            public ScalingConfigurations build() {
                return new ScalingConfigurations(this);
            } 

        } 

    }
}
