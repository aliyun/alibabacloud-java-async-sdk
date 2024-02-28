// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
 */
public class DescribeEciScalingConfigurationDetailResponseBody extends TeaModel {
    @NameInMap("Output")
    private String output;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingConfiguration")
    private ScalingConfiguration scalingConfiguration;

    private DescribeEciScalingConfigurationDetailResponseBody(Builder builder) {
        this.output = builder.output;
        this.requestId = builder.requestId;
        this.scalingConfiguration = builder.scalingConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEciScalingConfigurationDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingConfiguration
     */
    public ScalingConfiguration getScalingConfiguration() {
        return this.scalingConfiguration;
    }

    public static final class Builder {
        private String output; 
        private String requestId; 
        private ScalingConfiguration scalingConfiguration; 

        /**
         * Output.
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScalingConfiguration.
         */
        public Builder scalingConfiguration(ScalingConfiguration scalingConfiguration) {
            this.scalingConfiguration = scalingConfiguration;
            return this;
        }

        public DescribeEciScalingConfigurationDetailResponseBody build() {
            return new DescribeEciScalingConfigurationDetailResponseBody(this);
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
             * Domains.
             */
            public Builder domains(java.util.List < String > domains) {
                this.domains = domains;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * RegionId.
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
             * FieldRefFieldPath.
             */
            public Builder fieldRefFieldPath(String fieldRefFieldPath) {
                this.fieldRefFieldPath = fieldRefFieldPath;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * MountPropagation.
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
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
             * ReadOnly.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * SubPath.
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

        @NameInMap("LifecyclePostStartHandlerExecs")
        private java.util.List < String > lifecyclePostStartHandlerExecs;

        @NameInMap("LifecyclePostStartHandlerHttpGetHost")
        private String lifecyclePostStartHandlerHttpGetHost;

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

        @NameInMap("LifecyclePreStopHandlerExecs")
        private java.util.List < String > lifecyclePreStopHandlerExecs;

        @NameInMap("LifecyclePreStopHandlerHttpGetHost")
        private String lifecyclePreStopHandlerHttpGetHost;

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
            this.lifecyclePostStartHandlerExecs = builder.lifecyclePostStartHandlerExecs;
            this.lifecyclePostStartHandlerHttpGetHost = builder.lifecyclePostStartHandlerHttpGetHost;
            this.lifecyclePostStartHandlerHttpGetPath = builder.lifecyclePostStartHandlerHttpGetPath;
            this.lifecyclePostStartHandlerHttpGetPort = builder.lifecyclePostStartHandlerHttpGetPort;
            this.lifecyclePostStartHandlerHttpGetScheme = builder.lifecyclePostStartHandlerHttpGetScheme;
            this.lifecyclePostStartHandlerTcpSocketHost = builder.lifecyclePostStartHandlerTcpSocketHost;
            this.lifecyclePostStartHandlerTcpSocketPort = builder.lifecyclePostStartHandlerTcpSocketPort;
            this.lifecyclePreStopHandlerExecs = builder.lifecyclePreStopHandlerExecs;
            this.lifecyclePreStopHandlerHttpGetHost = builder.lifecyclePreStopHandlerHttpGetHost;
            this.lifecyclePreStopHandlerHttpGetPath = builder.lifecyclePreStopHandlerHttpGetPath;
            this.lifecyclePreStopHandlerHttpGetPort = builder.lifecyclePreStopHandlerHttpGetPort;
            this.lifecyclePreStopHandlerHttpGetScheme = builder.lifecyclePreStopHandlerHttpGetScheme;
            this.lifecyclePreStopHandlerTcpSocketHost = builder.lifecyclePreStopHandlerTcpSocketHost;
            this.lifecyclePreStopHandlerTcpSocketPort = builder.lifecyclePreStopHandlerTcpSocketPort;
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
         * @return lifecyclePostStartHandlerExecs
         */
        public java.util.List < String > getLifecyclePostStartHandlerExecs() {
            return this.lifecyclePostStartHandlerExecs;
        }

        /**
         * @return lifecyclePostStartHandlerHttpGetHost
         */
        public String getLifecyclePostStartHandlerHttpGetHost() {
            return this.lifecyclePostStartHandlerHttpGetHost;
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
         * @return lifecyclePreStopHandlerExecs
         */
        public java.util.List < String > getLifecyclePreStopHandlerExecs() {
            return this.lifecyclePreStopHandlerExecs;
        }

        /**
         * @return lifecyclePreStopHandlerHttpGetHost
         */
        public String getLifecyclePreStopHandlerHttpGetHost() {
            return this.lifecyclePreStopHandlerHttpGetHost;
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
            private java.util.List < String > lifecyclePostStartHandlerExecs; 
            private String lifecyclePostStartHandlerHttpGetHost; 
            private String lifecyclePostStartHandlerHttpGetPath; 
            private Integer lifecyclePostStartHandlerHttpGetPort; 
            private String lifecyclePostStartHandlerHttpGetScheme; 
            private String lifecyclePostStartHandlerTcpSocketHost; 
            private Integer lifecyclePostStartHandlerTcpSocketPort; 
            private java.util.List < String > lifecyclePreStopHandlerExecs; 
            private String lifecyclePreStopHandlerHttpGetHost; 
            private String lifecyclePreStopHandlerHttpGetPath; 
            private Integer lifecyclePreStopHandlerHttpGetPort; 
            private String lifecyclePreStopHandlerHttpGetScheme; 
            private String lifecyclePreStopHandlerTcpSocketHost; 
            private Integer lifecyclePreStopHandlerTcpSocketPort; 
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
             * Args.
             */
            public Builder args(java.util.List < String > args) {
                this.args = args;
                return this;
            }

            /**
             * Commands.
             */
            public Builder commands(java.util.List < String > commands) {
                this.commands = commands;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * EnvironmentVars.
             */
            public Builder environmentVars(java.util.List < EnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * Gpu.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * ImagePullPolicy.
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * LifecyclePostStartHandlerExecs.
             */
            public Builder lifecyclePostStartHandlerExecs(java.util.List < String > lifecyclePostStartHandlerExecs) {
                this.lifecyclePostStartHandlerExecs = lifecyclePostStartHandlerExecs;
                return this;
            }

            /**
             * LifecyclePostStartHandlerHttpGetHost.
             */
            public Builder lifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
                this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
                return this;
            }

            /**
             * LifecyclePostStartHandlerHttpGetPath.
             */
            public Builder lifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
                this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
                return this;
            }

            /**
             * LifecyclePostStartHandlerHttpGetPort.
             */
            public Builder lifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
                this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
                return this;
            }

            /**
             * LifecyclePostStartHandlerHttpGetScheme.
             */
            public Builder lifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
                this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
                return this;
            }

            /**
             * LifecyclePostStartHandlerTcpSocketHost.
             */
            public Builder lifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
                this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
                return this;
            }

            /**
             * LifecyclePostStartHandlerTcpSocketPort.
             */
            public Builder lifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
                this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
                return this;
            }

            /**
             * LifecyclePreStopHandlerExecs.
             */
            public Builder lifecyclePreStopHandlerExecs(java.util.List < String > lifecyclePreStopHandlerExecs) {
                this.lifecyclePreStopHandlerExecs = lifecyclePreStopHandlerExecs;
                return this;
            }

            /**
             * LifecyclePreStopHandlerHttpGetHost.
             */
            public Builder lifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
                this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
                return this;
            }

            /**
             * LifecyclePreStopHandlerHttpGetPath.
             */
            public Builder lifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
                this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
                return this;
            }

            /**
             * LifecyclePreStopHandlerHttpGetPort.
             */
            public Builder lifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
                this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
                return this;
            }

            /**
             * LifecyclePreStopHandlerHttpGetScheme.
             */
            public Builder lifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
                this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
                return this;
            }

            /**
             * LifecyclePreStopHandlerTcpSocketHost.
             */
            public Builder lifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
                this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
                return this;
            }

            /**
             * LifecyclePreStopHandlerTcpSocketPort.
             */
            public Builder lifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
                this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
                return this;
            }

            /**
             * LivenessProbeExecCommands.
             */
            public Builder livenessProbeExecCommands(java.util.List < String > livenessProbeExecCommands) {
                this.livenessProbeExecCommands = livenessProbeExecCommands;
                return this;
            }

            /**
             * LivenessProbeFailureThreshold.
             */
            public Builder livenessProbeFailureThreshold(Integer livenessProbeFailureThreshold) {
                this.livenessProbeFailureThreshold = livenessProbeFailureThreshold;
                return this;
            }

            /**
             * LivenessProbeHttpGetPath.
             */
            public Builder livenessProbeHttpGetPath(String livenessProbeHttpGetPath) {
                this.livenessProbeHttpGetPath = livenessProbeHttpGetPath;
                return this;
            }

            /**
             * LivenessProbeHttpGetPort.
             */
            public Builder livenessProbeHttpGetPort(Integer livenessProbeHttpGetPort) {
                this.livenessProbeHttpGetPort = livenessProbeHttpGetPort;
                return this;
            }

            /**
             * LivenessProbeHttpGetScheme.
             */
            public Builder livenessProbeHttpGetScheme(String livenessProbeHttpGetScheme) {
                this.livenessProbeHttpGetScheme = livenessProbeHttpGetScheme;
                return this;
            }

            /**
             * LivenessProbeInitialDelaySeconds.
             */
            public Builder livenessProbeInitialDelaySeconds(Integer livenessProbeInitialDelaySeconds) {
                this.livenessProbeInitialDelaySeconds = livenessProbeInitialDelaySeconds;
                return this;
            }

            /**
             * LivenessProbePeriodSeconds.
             */
            public Builder livenessProbePeriodSeconds(Integer livenessProbePeriodSeconds) {
                this.livenessProbePeriodSeconds = livenessProbePeriodSeconds;
                return this;
            }

            /**
             * LivenessProbeSuccessThreshold.
             */
            public Builder livenessProbeSuccessThreshold(Integer livenessProbeSuccessThreshold) {
                this.livenessProbeSuccessThreshold = livenessProbeSuccessThreshold;
                return this;
            }

            /**
             * LivenessProbeTcpSocketPort.
             */
            public Builder livenessProbeTcpSocketPort(Integer livenessProbeTcpSocketPort) {
                this.livenessProbeTcpSocketPort = livenessProbeTcpSocketPort;
                return this;
            }

            /**
             * LivenessProbeTimeoutSeconds.
             */
            public Builder livenessProbeTimeoutSeconds(Integer livenessProbeTimeoutSeconds) {
                this.livenessProbeTimeoutSeconds = livenessProbeTimeoutSeconds;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
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
             * Ports.
             */
            public Builder ports(java.util.List < Ports> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * ReadinessProbeExecCommands.
             */
            public Builder readinessProbeExecCommands(java.util.List < String > readinessProbeExecCommands) {
                this.readinessProbeExecCommands = readinessProbeExecCommands;
                return this;
            }

            /**
             * ReadinessProbeFailureThreshold.
             */
            public Builder readinessProbeFailureThreshold(Integer readinessProbeFailureThreshold) {
                this.readinessProbeFailureThreshold = readinessProbeFailureThreshold;
                return this;
            }

            /**
             * ReadinessProbeHttpGetPath.
             */
            public Builder readinessProbeHttpGetPath(String readinessProbeHttpGetPath) {
                this.readinessProbeHttpGetPath = readinessProbeHttpGetPath;
                return this;
            }

            /**
             * ReadinessProbeHttpGetPort.
             */
            public Builder readinessProbeHttpGetPort(Integer readinessProbeHttpGetPort) {
                this.readinessProbeHttpGetPort = readinessProbeHttpGetPort;
                return this;
            }

            /**
             * ReadinessProbeHttpGetScheme.
             */
            public Builder readinessProbeHttpGetScheme(String readinessProbeHttpGetScheme) {
                this.readinessProbeHttpGetScheme = readinessProbeHttpGetScheme;
                return this;
            }

            /**
             * ReadinessProbeInitialDelaySeconds.
             */
            public Builder readinessProbeInitialDelaySeconds(Integer readinessProbeInitialDelaySeconds) {
                this.readinessProbeInitialDelaySeconds = readinessProbeInitialDelaySeconds;
                return this;
            }

            /**
             * ReadinessProbePeriodSeconds.
             */
            public Builder readinessProbePeriodSeconds(Integer readinessProbePeriodSeconds) {
                this.readinessProbePeriodSeconds = readinessProbePeriodSeconds;
                return this;
            }

            /**
             * ReadinessProbeSuccessThreshold.
             */
            public Builder readinessProbeSuccessThreshold(Integer readinessProbeSuccessThreshold) {
                this.readinessProbeSuccessThreshold = readinessProbeSuccessThreshold;
                return this;
            }

            /**
             * ReadinessProbeTcpSocketPort.
             */
            public Builder readinessProbeTcpSocketPort(Integer readinessProbeTcpSocketPort) {
                this.readinessProbeTcpSocketPort = readinessProbeTcpSocketPort;
                return this;
            }

            /**
             * ReadinessProbeTimeoutSeconds.
             */
            public Builder readinessProbeTimeoutSeconds(Integer readinessProbeTimeoutSeconds) {
                this.readinessProbeTimeoutSeconds = readinessProbeTimeoutSeconds;
                return this;
            }

            /**
             * SecurityContextCapabilityAdds.
             */
            public Builder securityContextCapabilityAdds(java.util.List < String > securityContextCapabilityAdds) {
                this.securityContextCapabilityAdds = securityContextCapabilityAdds;
                return this;
            }

            /**
             * SecurityContextReadOnlyRootFilesystem.
             */
            public Builder securityContextReadOnlyRootFilesystem(Boolean securityContextReadOnlyRootFilesystem) {
                this.securityContextReadOnlyRootFilesystem = securityContextReadOnlyRootFilesystem;
                return this;
            }

            /**
             * SecurityContextRunAsUser.
             */
            public Builder securityContextRunAsUser(Long securityContextRunAsUser) {
                this.securityContextRunAsUser = securityContextRunAsUser;
                return this;
            }

            /**
             * Stdin.
             */
            public Builder stdin(Boolean stdin) {
                this.stdin = stdin;
                return this;
            }

            /**
             * StdinOnce.
             */
            public Builder stdinOnce(Boolean stdinOnce) {
                this.stdinOnce = stdinOnce;
                return this;
            }

            /**
             * Tty.
             */
            public Builder tty(Boolean tty) {
                this.tty = tty;
                return this;
            }

            /**
             * VolumeMounts.
             */
            public Builder volumeMounts(java.util.List < VolumeMounts> volumeMounts) {
                this.volumeMounts = volumeMounts;
                return this;
            }

            /**
             * WorkingDir.
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
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
             * Hostnames.
             */
            public Builder hostnames(java.util.List < String > hostnames) {
                this.hostnames = hostnames;
                return this;
            }

            /**
             * Ip.
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
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Server.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * UserName.
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
             * FieldRefFieldPath.
             */
            public Builder fieldRefFieldPath(String fieldRefFieldPath) {
                this.fieldRefFieldPath = fieldRefFieldPath;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * MountPropagation.
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
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
             * ReadOnly.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * SubPath.
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
             * Cpu.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Gpu.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * ImagePullPolicy.
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * InitContainerArgs.
             */
            public Builder initContainerArgs(java.util.List < String > initContainerArgs) {
                this.initContainerArgs = initContainerArgs;
                return this;
            }

            /**
             * InitContainerCommands.
             */
            public Builder initContainerCommands(java.util.List < String > initContainerCommands) {
                this.initContainerCommands = initContainerCommands;
                return this;
            }

            /**
             * InitContainerEnvironmentVars.
             */
            public Builder initContainerEnvironmentVars(java.util.List < InitContainerEnvironmentVars> initContainerEnvironmentVars) {
                this.initContainerEnvironmentVars = initContainerEnvironmentVars;
                return this;
            }

            /**
             * InitContainerPorts.
             */
            public Builder initContainerPorts(java.util.List < InitContainerPorts> initContainerPorts) {
                this.initContainerPorts = initContainerPorts;
                return this;
            }

            /**
             * InitContainerVolumeMounts.
             */
            public Builder initContainerVolumeMounts(java.util.List < InitContainerVolumeMounts> initContainerVolumeMounts) {
                this.initContainerVolumeMounts = initContainerVolumeMounts;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
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
             * SecurityContextCapabilityAdds.
             */
            public Builder securityContextCapabilityAdds(java.util.List < String > securityContextCapabilityAdds) {
                this.securityContextCapabilityAdds = securityContextCapabilityAdds;
                return this;
            }

            /**
             * SecurityContextReadOnlyRootFilesystem.
             */
            public Builder securityContextReadOnlyRootFilesystem(Boolean securityContextReadOnlyRootFilesystem) {
                this.securityContextReadOnlyRootFilesystem = securityContextReadOnlyRootFilesystem;
                return this;
            }

            /**
             * SecurityContextRunAsUser.
             */
            public Builder securityContextRunAsUser(String securityContextRunAsUser) {
                this.securityContextRunAsUser = securityContextRunAsUser;
                return this;
            }

            /**
             * WorkingDir.
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Path.
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

        @NameInMap("HostPathVolumePath")
        private String hostPathVolumePath;

        @NameInMap("HostPathVolumeType")
        private String hostPathVolumeType;

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
            this.hostPathVolumePath = builder.hostPathVolumePath;
            this.hostPathVolumeType = builder.hostPathVolumeType;
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
         * @return hostPathVolumePath
         */
        public String getHostPathVolumePath() {
            return this.hostPathVolumePath;
        }

        /**
         * @return hostPathVolumeType
         */
        public String getHostPathVolumeType() {
            return this.hostPathVolumeType;
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
            private String hostPathVolumePath; 
            private String hostPathVolumeType; 
            private String NFSVolumePath; 
            private Boolean NFSVolumeReadOnly; 
            private String NFSVolumeServer; 
            private String name; 
            private String type; 

            /**
             * ConfigFileVolumeConfigFileToPaths.
             */
            public Builder configFileVolumeConfigFileToPaths(java.util.List < ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths) {
                this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
                return this;
            }

            /**
             * ConfigFileVolumeDefaultMode.
             */
            public Builder configFileVolumeDefaultMode(Integer configFileVolumeDefaultMode) {
                this.configFileVolumeDefaultMode = configFileVolumeDefaultMode;
                return this;
            }

            /**
             * DiskVolumeDiskId.
             */
            public Builder diskVolumeDiskId(String diskVolumeDiskId) {
                this.diskVolumeDiskId = diskVolumeDiskId;
                return this;
            }

            /**
             * DiskVolumeDiskSize.
             */
            public Builder diskVolumeDiskSize(Integer diskVolumeDiskSize) {
                this.diskVolumeDiskSize = diskVolumeDiskSize;
                return this;
            }

            /**
             * DiskVolumeFsType.
             */
            public Builder diskVolumeFsType(String diskVolumeFsType) {
                this.diskVolumeFsType = diskVolumeFsType;
                return this;
            }

            /**
             * EmptyDirVolumeMedium.
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
             * FlexVolumeDriver.
             */
            public Builder flexVolumeDriver(String flexVolumeDriver) {
                this.flexVolumeDriver = flexVolumeDriver;
                return this;
            }

            /**
             * FlexVolumeFsType.
             */
            public Builder flexVolumeFsType(String flexVolumeFsType) {
                this.flexVolumeFsType = flexVolumeFsType;
                return this;
            }

            /**
             * FlexVolumeOptions.
             */
            public Builder flexVolumeOptions(String flexVolumeOptions) {
                this.flexVolumeOptions = flexVolumeOptions;
                return this;
            }

            /**
             * HostPathVolumePath.
             */
            public Builder hostPathVolumePath(String hostPathVolumePath) {
                this.hostPathVolumePath = hostPathVolumePath;
                return this;
            }

            /**
             * HostPathVolumeType.
             */
            public Builder hostPathVolumeType(String hostPathVolumeType) {
                this.hostPathVolumeType = hostPathVolumeType;
                return this;
            }

            /**
             * NFSVolumePath.
             */
            public Builder NFSVolumePath(String NFSVolumePath) {
                this.NFSVolumePath = NFSVolumePath;
                return this;
            }

            /**
             * NFSVolumeReadOnly.
             */
            public Builder NFSVolumeReadOnly(Boolean NFSVolumeReadOnly) {
                this.NFSVolumeReadOnly = NFSVolumeReadOnly;
                return this;
            }

            /**
             * NFSVolumeServer.
             */
            public Builder NFSVolumeServer(String NFSVolumeServer) {
                this.NFSVolumeServer = NFSVolumeServer;
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
             * Type.
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
    public static class ScalingConfiguration extends TeaModel {
        @NameInMap("AcrRegistryInfos")
        private java.util.List < AcrRegistryInfos> acrRegistryInfos;

        @NameInMap("ActiveDeadlineSeconds")
        private Integer activeDeadlineSeconds;

        @NameInMap("AutoCreateEip")
        private Boolean autoCreateEip;

        @NameInMap("AutoMatchImageCache")
        private Boolean autoMatchImageCache;

        @NameInMap("ComputeCategory")
        private java.util.List < String > computeCategory;

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

        @NameInMap("DataCacheBucket")
        private String dataCacheBucket;

        @NameInMap("DataCacheBurstingEnabled")
        private Boolean dataCacheBurstingEnabled;

        @NameInMap("DataCachePL")
        private String dataCachePL;

        @NameInMap("DataCacheProvisionedIops")
        private Integer dataCacheProvisionedIops;

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

        @NameInMap("EipCommonBandwidthPackage")
        private String eipCommonBandwidthPackage;

        @NameInMap("EipISP")
        private String eipISP;

        @NameInMap("EipPublicIpAddressPoolId")
        private String eipPublicIpAddressPoolId;

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

        @NameInMap("InstanceTypes")
        private java.util.List < String > instanceTypes;

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

        private ScalingConfiguration(Builder builder) {
            this.acrRegistryInfos = builder.acrRegistryInfos;
            this.activeDeadlineSeconds = builder.activeDeadlineSeconds;
            this.autoCreateEip = builder.autoCreateEip;
            this.autoMatchImageCache = builder.autoMatchImageCache;
            this.computeCategory = builder.computeCategory;
            this.containerGroupName = builder.containerGroupName;
            this.containers = builder.containers;
            this.costOptimization = builder.costOptimization;
            this.cpu = builder.cpu;
            this.cpuOptionsCore = builder.cpuOptionsCore;
            this.cpuOptionsThreadsPerCore = builder.cpuOptionsThreadsPerCore;
            this.creationTime = builder.creationTime;
            this.dataCacheBucket = builder.dataCacheBucket;
            this.dataCacheBurstingEnabled = builder.dataCacheBurstingEnabled;
            this.dataCachePL = builder.dataCachePL;
            this.dataCacheProvisionedIops = builder.dataCacheProvisionedIops;
            this.description = builder.description;
            this.dnsConfigNameServers = builder.dnsConfigNameServers;
            this.dnsConfigOptions = builder.dnsConfigOptions;
            this.dnsConfigSearches = builder.dnsConfigSearches;
            this.dnsPolicy = builder.dnsPolicy;
            this.egressBandwidth = builder.egressBandwidth;
            this.eipBandwidth = builder.eipBandwidth;
            this.eipCommonBandwidthPackage = builder.eipCommonBandwidthPackage;
            this.eipISP = builder.eipISP;
            this.eipPublicIpAddressPoolId = builder.eipPublicIpAddressPoolId;
            this.ephemeralStorage = builder.ephemeralStorage;
            this.hostAliases = builder.hostAliases;
            this.hostName = builder.hostName;
            this.imageRegistryCredentials = builder.imageRegistryCredentials;
            this.imageSnapshotId = builder.imageSnapshotId;
            this.ingressBandwidth = builder.ingressBandwidth;
            this.initContainers = builder.initContainers;
            this.instanceFamilyLevel = builder.instanceFamilyLevel;
            this.instanceTypes = builder.instanceTypes;
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

        public static ScalingConfiguration create() {
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
         * @return computeCategory
         */
        public java.util.List < String > getComputeCategory() {
            return this.computeCategory;
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
         * @return dataCacheBucket
         */
        public String getDataCacheBucket() {
            return this.dataCacheBucket;
        }

        /**
         * @return dataCacheBurstingEnabled
         */
        public Boolean getDataCacheBurstingEnabled() {
            return this.dataCacheBurstingEnabled;
        }

        /**
         * @return dataCachePL
         */
        public String getDataCachePL() {
            return this.dataCachePL;
        }

        /**
         * @return dataCacheProvisionedIops
         */
        public Integer getDataCacheProvisionedIops() {
            return this.dataCacheProvisionedIops;
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
         * @return eipCommonBandwidthPackage
         */
        public String getEipCommonBandwidthPackage() {
            return this.eipCommonBandwidthPackage;
        }

        /**
         * @return eipISP
         */
        public String getEipISP() {
            return this.eipISP;
        }

        /**
         * @return eipPublicIpAddressPoolId
         */
        public String getEipPublicIpAddressPoolId() {
            return this.eipPublicIpAddressPoolId;
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
         * @return instanceTypes
         */
        public java.util.List < String > getInstanceTypes() {
            return this.instanceTypes;
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
            private java.util.List < String > computeCategory; 
            private String containerGroupName; 
            private java.util.List < Containers> containers; 
            private Boolean costOptimization; 
            private Float cpu; 
            private Integer cpuOptionsCore; 
            private Integer cpuOptionsThreadsPerCore; 
            private String creationTime; 
            private String dataCacheBucket; 
            private Boolean dataCacheBurstingEnabled; 
            private String dataCachePL; 
            private Integer dataCacheProvisionedIops; 
            private String description; 
            private java.util.List < String > dnsConfigNameServers; 
            private java.util.List < DnsConfigOptions> dnsConfigOptions; 
            private java.util.List < String > dnsConfigSearches; 
            private String dnsPolicy; 
            private Long egressBandwidth; 
            private Integer eipBandwidth; 
            private String eipCommonBandwidthPackage; 
            private String eipISP; 
            private String eipPublicIpAddressPoolId; 
            private Integer ephemeralStorage; 
            private java.util.List < HostAliases> hostAliases; 
            private String hostName; 
            private java.util.List < ImageRegistryCredentials> imageRegistryCredentials; 
            private String imageSnapshotId; 
            private Long ingressBandwidth; 
            private java.util.List < InitContainers> initContainers; 
            private String instanceFamilyLevel; 
            private java.util.List < String > instanceTypes; 
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
             * AcrRegistryInfos.
             */
            public Builder acrRegistryInfos(java.util.List < AcrRegistryInfos> acrRegistryInfos) {
                this.acrRegistryInfos = acrRegistryInfos;
                return this;
            }

            /**
             * ActiveDeadlineSeconds.
             */
            public Builder activeDeadlineSeconds(Integer activeDeadlineSeconds) {
                this.activeDeadlineSeconds = activeDeadlineSeconds;
                return this;
            }

            /**
             * AutoCreateEip.
             */
            public Builder autoCreateEip(Boolean autoCreateEip) {
                this.autoCreateEip = autoCreateEip;
                return this;
            }

            /**
             * AutoMatchImageCache.
             */
            public Builder autoMatchImageCache(Boolean autoMatchImageCache) {
                this.autoMatchImageCache = autoMatchImageCache;
                return this;
            }

            /**
             * ComputeCategory.
             */
            public Builder computeCategory(java.util.List < String > computeCategory) {
                this.computeCategory = computeCategory;
                return this;
            }

            /**
             * ContainerGroupName.
             */
            public Builder containerGroupName(String containerGroupName) {
                this.containerGroupName = containerGroupName;
                return this;
            }

            /**
             * Containers.
             */
            public Builder containers(java.util.List < Containers> containers) {
                this.containers = containers;
                return this;
            }

            /**
             * CostOptimization.
             */
            public Builder costOptimization(Boolean costOptimization) {
                this.costOptimization = costOptimization;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * CpuOptionsCore.
             */
            public Builder cpuOptionsCore(Integer cpuOptionsCore) {
                this.cpuOptionsCore = cpuOptionsCore;
                return this;
            }

            /**
             * CpuOptionsThreadsPerCore.
             */
            public Builder cpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
                this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DataCacheBucket.
             */
            public Builder dataCacheBucket(String dataCacheBucket) {
                this.dataCacheBucket = dataCacheBucket;
                return this;
            }

            /**
             * DataCacheBurstingEnabled.
             */
            public Builder dataCacheBurstingEnabled(Boolean dataCacheBurstingEnabled) {
                this.dataCacheBurstingEnabled = dataCacheBurstingEnabled;
                return this;
            }

            /**
             * DataCachePL.
             */
            public Builder dataCachePL(String dataCachePL) {
                this.dataCachePL = dataCachePL;
                return this;
            }

            /**
             * DataCacheProvisionedIops.
             */
            public Builder dataCacheProvisionedIops(Integer dataCacheProvisionedIops) {
                this.dataCacheProvisionedIops = dataCacheProvisionedIops;
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
             * DnsConfigNameServers.
             */
            public Builder dnsConfigNameServers(java.util.List < String > dnsConfigNameServers) {
                this.dnsConfigNameServers = dnsConfigNameServers;
                return this;
            }

            /**
             * DnsConfigOptions.
             */
            public Builder dnsConfigOptions(java.util.List < DnsConfigOptions> dnsConfigOptions) {
                this.dnsConfigOptions = dnsConfigOptions;
                return this;
            }

            /**
             * DnsConfigSearches.
             */
            public Builder dnsConfigSearches(java.util.List < String > dnsConfigSearches) {
                this.dnsConfigSearches = dnsConfigSearches;
                return this;
            }

            /**
             * DnsPolicy.
             */
            public Builder dnsPolicy(String dnsPolicy) {
                this.dnsPolicy = dnsPolicy;
                return this;
            }

            /**
             * EgressBandwidth.
             */
            public Builder egressBandwidth(Long egressBandwidth) {
                this.egressBandwidth = egressBandwidth;
                return this;
            }

            /**
             * EipBandwidth.
             */
            public Builder eipBandwidth(Integer eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * EipCommonBandwidthPackage.
             */
            public Builder eipCommonBandwidthPackage(String eipCommonBandwidthPackage) {
                this.eipCommonBandwidthPackage = eipCommonBandwidthPackage;
                return this;
            }

            /**
             * EipISP.
             */
            public Builder eipISP(String eipISP) {
                this.eipISP = eipISP;
                return this;
            }

            /**
             * EipPublicIpAddressPoolId.
             */
            public Builder eipPublicIpAddressPoolId(String eipPublicIpAddressPoolId) {
                this.eipPublicIpAddressPoolId = eipPublicIpAddressPoolId;
                return this;
            }

            /**
             * EphemeralStorage.
             */
            public Builder ephemeralStorage(Integer ephemeralStorage) {
                this.ephemeralStorage = ephemeralStorage;
                return this;
            }

            /**
             * HostAliases.
             */
            public Builder hostAliases(java.util.List < HostAliases> hostAliases) {
                this.hostAliases = hostAliases;
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
             * ImageRegistryCredentials.
             */
            public Builder imageRegistryCredentials(java.util.List < ImageRegistryCredentials> imageRegistryCredentials) {
                this.imageRegistryCredentials = imageRegistryCredentials;
                return this;
            }

            /**
             * ImageSnapshotId.
             */
            public Builder imageSnapshotId(String imageSnapshotId) {
                this.imageSnapshotId = imageSnapshotId;
                return this;
            }

            /**
             * IngressBandwidth.
             */
            public Builder ingressBandwidth(Long ingressBandwidth) {
                this.ingressBandwidth = ingressBandwidth;
                return this;
            }

            /**
             * InitContainers.
             */
            public Builder initContainers(java.util.List < InitContainers> initContainers) {
                this.initContainers = initContainers;
                return this;
            }

            /**
             * InstanceFamilyLevel.
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * InstanceTypes.
             */
            public Builder instanceTypes(java.util.List < String > instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * Ipv6AddressCount.
             */
            public Builder ipv6AddressCount(Integer ipv6AddressCount) {
                this.ipv6AddressCount = ipv6AddressCount;
                return this;
            }

            /**
             * LifecycleState.
             */
            public Builder lifecycleState(String lifecycleState) {
                this.lifecycleState = lifecycleState;
                return this;
            }

            /**
             * LoadBalancerWeight.
             */
            public Builder loadBalancerWeight(Integer loadBalancerWeight) {
                this.loadBalancerWeight = loadBalancerWeight;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * NtpServers.
             */
            public Builder ntpServers(java.util.List < String > ntpServers) {
                this.ntpServers = ntpServers;
                return this;
            }

            /**
             * RamRoleName.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * RestartPolicy.
             */
            public Builder restartPolicy(String restartPolicy) {
                this.restartPolicy = restartPolicy;
                return this;
            }

            /**
             * ScalingConfigurationId.
             */
            public Builder scalingConfigurationId(String scalingConfigurationId) {
                this.scalingConfigurationId = scalingConfigurationId;
                return this;
            }

            /**
             * ScalingConfigurationName.
             */
            public Builder scalingConfigurationName(String scalingConfigurationName) {
                this.scalingConfigurationName = scalingConfigurationName;
                return this;
            }

            /**
             * ScalingGroupId.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * SecurityContextSysCtls.
             */
            public Builder securityContextSysCtls(java.util.List < SecurityContextSysCtls> securityContextSysCtls) {
                this.securityContextSysCtls = securityContextSysCtls;
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
             * SlsEnable.
             */
            public Builder slsEnable(Boolean slsEnable) {
                this.slsEnable = slsEnable;
                return this;
            }

            /**
             * SpotPriceLimit.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TerminationGracePeriodSeconds.
             */
            public Builder terminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
                this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
                return this;
            }

            /**
             * Volumes.
             */
            public Builder volumes(java.util.List < Volumes> volumes) {
                this.volumes = volumes;
                return this;
            }

            public ScalingConfiguration build() {
                return new ScalingConfiguration(this);
            } 

        } 

    }
}
