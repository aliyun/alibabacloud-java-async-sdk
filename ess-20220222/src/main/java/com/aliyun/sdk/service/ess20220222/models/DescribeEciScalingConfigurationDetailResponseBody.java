// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
 */
public class DescribeEciScalingConfigurationDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Output")
    private String output;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingConfiguration")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeEciScalingConfigurationDetailResponseBody model) {
            this.output = model.output;
            this.requestId = model.requestId;
            this.scalingConfiguration = model.scalingConfiguration;
        } 

        /**
         * <p>The YAML output content of the scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: apps/v1
         * kind: Deployment
         * metadata:
         *   name: nginx-deployment
         *   labels:
         *     app: nginx
         *   spec:
         *     replicas: 3
         *     selector:
         *        matchLabels:
         *         app: nginx
         *     template:
         *       metadata:
         *         labels:
         *           app: nginx
         *         annotations:
         *           k8s.aliyun.com/eip-bandwidth: 10
         *           k8s.aliyun.com/eci-with-eip: true
         *         spec:
         *           containers:
         *           - name: nginx
         *             image: nginx:1.14.2
         *             ports:
         *             - containerPort: 80</p>
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6EF9BFEE-FE07-4627-B8FB-14326FB9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scaling configuration information.</p>
         */
        public Builder scalingConfiguration(ScalingConfiguration scalingConfiguration) {
            this.scalingConfiguration = scalingConfiguration;
            return this;
        }

        public DescribeEciScalingConfigurationDetailResponseBody build() {
            return new DescribeEciScalingConfigurationDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class AcrRegistryInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domains")
        private java.util.List<String> domains;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
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
        public java.util.List<String> getDomains() {
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
            private java.util.List<String> domains; 
            private String instanceId; 
            private String instanceName; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(AcrRegistryInfos model) {
                this.domains = model.domains;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The domain names of the ACR Enterprise instance. By default, all domain names of the instance are used. You can specify specific domain names and separate multiple domain names with commas (,).</p>
             */
            public Builder domains(java.util.List<String> domains) {
                this.domains = domains;
                return this;
            }

            /**
             * <p>The instance ID of the ACR Enterprise instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-nwj395hgf6f3****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the ACR Enterprise instance.</p>
             * 
             * <strong>example:</strong>
             * <p>acr-test</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The region to which the ACR Enterprise instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class EnvironmentVars extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldRefFieldPath")
        private String fieldRefFieldPath;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(EnvironmentVars model) {
                this.fieldRefFieldPath = model.fieldRefFieldPath;
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <blockquote>
             * <p>This parameter is not available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>fieldPath</p>
             */
            public Builder fieldRefFieldPath(String fieldRefFieldPath) {
                this.fieldRefFieldPath = fieldRefFieldPath;
                return this;
            }

            /**
             * <p>The name of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>PATH</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/bin/</p>
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
    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
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

            private Builder() {
            } 

            private Builder(Ports model) {
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The port number. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>8083</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type. Valid values:</p>
             * <ul>
             * <li>TCP</li>
             * <li>UDP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
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
    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class VolumeMounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("MountPropagation")
        private String mountPropagation;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReadOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("SubPath")
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

            private Builder() {
            } 

            private Builder(VolumeMounts model) {
                this.mountPath = model.mountPath;
                this.mountPropagation = model.mountPropagation;
                this.name = model.name;
                this.readOnly = model.readOnly;
                this.subPath = model.subPath;
            } 

            /**
             * <p>The directory where the data volume is mounted in the container.</p>
             * <blockquote>
             * <p>Notice: The content in the mount directory of the container is directly overwritten by the content of the volume. Use this parameter with caution.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/pod/data</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The mount propagation settings of the data volume. Mount propagation allows volumes mounted by a container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
             * <ul>
             * <li>None: the volume does not perceive any subsequent mount operations performed on the volume or its subdirectories.</li>
             * <li>HostToCotainer: the volume perceives subsequent mount operations performed on the volume or its subdirectories.</li>
             * <li>Bidirectional: similar to HostToCotainer, the volume perceives mount operations. Additionally, the volume is propagated back to the host and to all containers of all pods that use the same volume.
             * Default value: None.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * <p>The name of the mounted data volume.</p>
             * 
             * <strong>example:</strong>
             * <p>default-volume1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether the data volume is read-only.
             * Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>The subpath of the data volume.</p>
             * 
             * <strong>example:</strong>
             * <p>data2/</p>
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
    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class Containers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private java.util.List<String> args;

        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.List<String> commands;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("EnvironmentVars")
        private java.util.List<EnvironmentVars> environmentVars;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerExecs")
        private java.util.List<String> lifecyclePostStartHandlerExecs;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerHttpGetHost")
        private String lifecyclePostStartHandlerHttpGetHost;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerHttpGetPath")
        private String lifecyclePostStartHandlerHttpGetPath;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerHttpGetPort")
        private Integer lifecyclePostStartHandlerHttpGetPort;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerHttpGetScheme")
        private String lifecyclePostStartHandlerHttpGetScheme;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerTcpSocketHost")
        private String lifecyclePostStartHandlerTcpSocketHost;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        private Integer lifecyclePostStartHandlerTcpSocketPort;

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerExecs")
        private java.util.List<String> lifecyclePreStopHandlerExecs;

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerHttpGetHost")
        private String lifecyclePreStopHandlerHttpGetHost;

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerHttpGetPath")
        private String lifecyclePreStopHandlerHttpGetPath;

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerHttpGetPort")
        private Integer lifecyclePreStopHandlerHttpGetPort;

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerHttpGetScheme")
        private String lifecyclePreStopHandlerHttpGetScheme;

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerTcpSocketHost")
        private String lifecyclePreStopHandlerTcpSocketHost;

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerTcpSocketPort")
        private Integer lifecyclePreStopHandlerTcpSocketPort;

        @com.aliyun.core.annotation.NameInMap("LivenessProbeExecCommands")
        private java.util.List<String> livenessProbeExecCommands;

        @com.aliyun.core.annotation.NameInMap("LivenessProbeFailureThreshold")
        private Integer livenessProbeFailureThreshold;

        @com.aliyun.core.annotation.NameInMap("LivenessProbeHttpGetPath")
        private String livenessProbeHttpGetPath;

        @com.aliyun.core.annotation.NameInMap("LivenessProbeHttpGetPort")
        private Integer livenessProbeHttpGetPort;

        @com.aliyun.core.annotation.NameInMap("LivenessProbeHttpGetScheme")
        private String livenessProbeHttpGetScheme;

        @com.aliyun.core.annotation.NameInMap("LivenessProbeInitialDelaySeconds")
        private Integer livenessProbeInitialDelaySeconds;

        @com.aliyun.core.annotation.NameInMap("LivenessProbePeriodSeconds")
        private Integer livenessProbePeriodSeconds;

        @com.aliyun.core.annotation.NameInMap("LivenessProbeSuccessThreshold")
        private Integer livenessProbeSuccessThreshold;

        @com.aliyun.core.annotation.NameInMap("LivenessProbeTcpSocketPort")
        private Integer livenessProbeTcpSocketPort;

        @com.aliyun.core.annotation.NameInMap("LivenessProbeTimeoutSeconds")
        private Integer livenessProbeTimeoutSeconds;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private java.util.List<Ports> ports;

        @com.aliyun.core.annotation.NameInMap("ReadinessProbeExecCommands")
        private java.util.List<String> readinessProbeExecCommands;

        @com.aliyun.core.annotation.NameInMap("ReadinessProbeFailureThreshold")
        private Integer readinessProbeFailureThreshold;

        @com.aliyun.core.annotation.NameInMap("ReadinessProbeHttpGetPath")
        private String readinessProbeHttpGetPath;

        @com.aliyun.core.annotation.NameInMap("ReadinessProbeHttpGetPort")
        private Integer readinessProbeHttpGetPort;

        @com.aliyun.core.annotation.NameInMap("ReadinessProbeHttpGetScheme")
        private String readinessProbeHttpGetScheme;

        @com.aliyun.core.annotation.NameInMap("ReadinessProbeInitialDelaySeconds")
        private Integer readinessProbeInitialDelaySeconds;

        @com.aliyun.core.annotation.NameInMap("ReadinessProbePeriodSeconds")
        private Integer readinessProbePeriodSeconds;

        @com.aliyun.core.annotation.NameInMap("ReadinessProbeSuccessThreshold")
        private Integer readinessProbeSuccessThreshold;

        @com.aliyun.core.annotation.NameInMap("ReadinessProbeTcpSocketPort")
        private Integer readinessProbeTcpSocketPort;

        @com.aliyun.core.annotation.NameInMap("ReadinessProbeTimeoutSeconds")
        private Integer readinessProbeTimeoutSeconds;

        @com.aliyun.core.annotation.NameInMap("SecurityContextCapabilityAdds")
        private java.util.List<String> securityContextCapabilityAdds;

        @com.aliyun.core.annotation.NameInMap("SecurityContextReadOnlyRootFilesystem")
        private Boolean securityContextReadOnlyRootFilesystem;

        @com.aliyun.core.annotation.NameInMap("SecurityContextRunAsUser")
        private Long securityContextRunAsUser;

        @com.aliyun.core.annotation.NameInMap("Stdin")
        private Boolean stdin;

        @com.aliyun.core.annotation.NameInMap("StdinOnce")
        private Boolean stdinOnce;

        @com.aliyun.core.annotation.NameInMap("Tty")
        private Boolean tty;

        @com.aliyun.core.annotation.NameInMap("VolumeMounts")
        private java.util.List<VolumeMounts> volumeMounts;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
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
        public java.util.List<String> getArgs() {
            return this.args;
        }

        /**
         * @return commands
         */
        public java.util.List<String> getCommands() {
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
        public java.util.List<EnvironmentVars> getEnvironmentVars() {
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
        public java.util.List<String> getLifecyclePostStartHandlerExecs() {
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
        public java.util.List<String> getLifecyclePreStopHandlerExecs() {
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
        public java.util.List<String> getLivenessProbeExecCommands() {
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
        public java.util.List<Ports> getPorts() {
            return this.ports;
        }

        /**
         * @return readinessProbeExecCommands
         */
        public java.util.List<String> getReadinessProbeExecCommands() {
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
        public java.util.List<String> getSecurityContextCapabilityAdds() {
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
        public java.util.List<VolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private java.util.List<String> args; 
            private java.util.List<String> commands; 
            private Float cpu; 
            private java.util.List<EnvironmentVars> environmentVars; 
            private Integer gpu; 
            private String image; 
            private String imagePullPolicy; 
            private java.util.List<String> lifecyclePostStartHandlerExecs; 
            private String lifecyclePostStartHandlerHttpGetHost; 
            private String lifecyclePostStartHandlerHttpGetPath; 
            private Integer lifecyclePostStartHandlerHttpGetPort; 
            private String lifecyclePostStartHandlerHttpGetScheme; 
            private String lifecyclePostStartHandlerTcpSocketHost; 
            private Integer lifecyclePostStartHandlerTcpSocketPort; 
            private java.util.List<String> lifecyclePreStopHandlerExecs; 
            private String lifecyclePreStopHandlerHttpGetHost; 
            private String lifecyclePreStopHandlerHttpGetPath; 
            private Integer lifecyclePreStopHandlerHttpGetPort; 
            private String lifecyclePreStopHandlerHttpGetScheme; 
            private String lifecyclePreStopHandlerTcpSocketHost; 
            private Integer lifecyclePreStopHandlerTcpSocketPort; 
            private java.util.List<String> livenessProbeExecCommands; 
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
            private java.util.List<Ports> ports; 
            private java.util.List<String> readinessProbeExecCommands; 
            private Integer readinessProbeFailureThreshold; 
            private String readinessProbeHttpGetPath; 
            private Integer readinessProbeHttpGetPort; 
            private String readinessProbeHttpGetScheme; 
            private Integer readinessProbeInitialDelaySeconds; 
            private Integer readinessProbePeriodSeconds; 
            private Integer readinessProbeSuccessThreshold; 
            private Integer readinessProbeTcpSocketPort; 
            private Integer readinessProbeTimeoutSeconds; 
            private java.util.List<String> securityContextCapabilityAdds; 
            private Boolean securityContextReadOnlyRootFilesystem; 
            private Long securityContextRunAsUser; 
            private Boolean stdin; 
            private Boolean stdinOnce; 
            private Boolean tty; 
            private java.util.List<VolumeMounts> volumeMounts; 
            private String workingDir; 

            private Builder() {
            } 

            private Builder(Containers model) {
                this.args = model.args;
                this.commands = model.commands;
                this.cpu = model.cpu;
                this.environmentVars = model.environmentVars;
                this.gpu = model.gpu;
                this.image = model.image;
                this.imagePullPolicy = model.imagePullPolicy;
                this.lifecyclePostStartHandlerExecs = model.lifecyclePostStartHandlerExecs;
                this.lifecyclePostStartHandlerHttpGetHost = model.lifecyclePostStartHandlerHttpGetHost;
                this.lifecyclePostStartHandlerHttpGetPath = model.lifecyclePostStartHandlerHttpGetPath;
                this.lifecyclePostStartHandlerHttpGetPort = model.lifecyclePostStartHandlerHttpGetPort;
                this.lifecyclePostStartHandlerHttpGetScheme = model.lifecyclePostStartHandlerHttpGetScheme;
                this.lifecyclePostStartHandlerTcpSocketHost = model.lifecyclePostStartHandlerTcpSocketHost;
                this.lifecyclePostStartHandlerTcpSocketPort = model.lifecyclePostStartHandlerTcpSocketPort;
                this.lifecyclePreStopHandlerExecs = model.lifecyclePreStopHandlerExecs;
                this.lifecyclePreStopHandlerHttpGetHost = model.lifecyclePreStopHandlerHttpGetHost;
                this.lifecyclePreStopHandlerHttpGetPath = model.lifecyclePreStopHandlerHttpGetPath;
                this.lifecyclePreStopHandlerHttpGetPort = model.lifecyclePreStopHandlerHttpGetPort;
                this.lifecyclePreStopHandlerHttpGetScheme = model.lifecyclePreStopHandlerHttpGetScheme;
                this.lifecyclePreStopHandlerTcpSocketHost = model.lifecyclePreStopHandlerTcpSocketHost;
                this.lifecyclePreStopHandlerTcpSocketPort = model.lifecyclePreStopHandlerTcpSocketPort;
                this.livenessProbeExecCommands = model.livenessProbeExecCommands;
                this.livenessProbeFailureThreshold = model.livenessProbeFailureThreshold;
                this.livenessProbeHttpGetPath = model.livenessProbeHttpGetPath;
                this.livenessProbeHttpGetPort = model.livenessProbeHttpGetPort;
                this.livenessProbeHttpGetScheme = model.livenessProbeHttpGetScheme;
                this.livenessProbeInitialDelaySeconds = model.livenessProbeInitialDelaySeconds;
                this.livenessProbePeriodSeconds = model.livenessProbePeriodSeconds;
                this.livenessProbeSuccessThreshold = model.livenessProbeSuccessThreshold;
                this.livenessProbeTcpSocketPort = model.livenessProbeTcpSocketPort;
                this.livenessProbeTimeoutSeconds = model.livenessProbeTimeoutSeconds;
                this.memory = model.memory;
                this.name = model.name;
                this.ports = model.ports;
                this.readinessProbeExecCommands = model.readinessProbeExecCommands;
                this.readinessProbeFailureThreshold = model.readinessProbeFailureThreshold;
                this.readinessProbeHttpGetPath = model.readinessProbeHttpGetPath;
                this.readinessProbeHttpGetPort = model.readinessProbeHttpGetPort;
                this.readinessProbeHttpGetScheme = model.readinessProbeHttpGetScheme;
                this.readinessProbeInitialDelaySeconds = model.readinessProbeInitialDelaySeconds;
                this.readinessProbePeriodSeconds = model.readinessProbePeriodSeconds;
                this.readinessProbeSuccessThreshold = model.readinessProbeSuccessThreshold;
                this.readinessProbeTcpSocketPort = model.readinessProbeTcpSocketPort;
                this.readinessProbeTimeoutSeconds = model.readinessProbeTimeoutSeconds;
                this.securityContextCapabilityAdds = model.securityContextCapabilityAdds;
                this.securityContextReadOnlyRootFilesystem = model.securityContextReadOnlyRootFilesystem;
                this.securityContextRunAsUser = model.securityContextRunAsUser;
                this.stdin = model.stdin;
                this.stdinOnce = model.stdinOnce;
                this.tty = model.tty;
                this.volumeMounts = model.volumeMounts;
                this.workingDir = model.workingDir;
            } 

            /**
             * <p>The startup arguments for the container.</p>
             */
            public Builder args(java.util.List<String> args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The startup commands for the container.</p>
             */
            public Builder commands(java.util.List<String> commands) {
                this.commands = commands;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The environment variable information.</p>
             */
            public Builder environmentVars(java.util.List<EnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The container image.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.aliyuncs.com/eci_open/alpine:3.5</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The image pull policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Always</p>
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * <p>The commands executed in the container when the postStart callback function is configured by using the command line.</p>
             */
            public Builder lifecyclePostStartHandlerExecs(java.util.List<String> lifecyclePostStartHandlerExecs) {
                this.lifecyclePostStartHandlerExecs = lifecyclePostStartHandlerExecs;
                return this;
            }

            /**
             * <p>The host address that receives HTTP GET requests when the postStart callback function is configured by using HTTP requests.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder lifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
                this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
                return this;
            }

            /**
             * <p>The path checked by HTTP GET requests when the postStart callback function is configured by using HTTP requests.</p>
             * 
             * <strong>example:</strong>
             * <p>/healthyz</p>
             */
            public Builder lifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
                this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
                return this;
            }

            /**
             * <p>The port number checked by HTTP GET requests when the postStart callback function is configured by using HTTP requests.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder lifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
                this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
                return this;
            }

            /**
             * <p>The protocol type used for HTTP GET requests when the postStart callback function is configured by using HTTP requests.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder lifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
                this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
                return this;
            }

            /**
             * <p>The host address checked by TCP sockets when the postStart callback function is configured by using TCP sockets.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder lifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
                this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
                return this;
            }

            /**
             * <p>The port checked by TCP sockets when the postStart callback function is configured by using TCP sockets.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder lifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
                this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
                return this;
            }

            /**
             * <p>The commands executed in the container when the preStop callback function is configured by using the command line.</p>
             */
            public Builder lifecyclePreStopHandlerExecs(java.util.List<String> lifecyclePreStopHandlerExecs) {
                this.lifecyclePreStopHandlerExecs = lifecyclePreStopHandlerExecs;
                return this;
            }

            /**
             * <p>The host address that receives HTTP GET requests when the preStop callback function is configured by using HTTP requests.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder lifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
                this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
                return this;
            }

            /**
             * <p>The path checked by HTTP GET requests when the preStop callback function is configured by using HTTP requests.</p>
             * 
             * <strong>example:</strong>
             * <p>/healthyz</p>
             */
            public Builder lifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
                this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
                return this;
            }

            /**
             * <p>The port number checked by HTTP GET requests when the preStop callback function is configured by using HTTP requests.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder lifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
                this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
                return this;
            }

            /**
             * <p>The protocol type used for HTTP GET requests when the preStop callback function is configured by using HTTP requests.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder lifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
                this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
                return this;
            }

            /**
             * <p>The host address checked by TCP sockets when the preStop callback function is configured by using TCP sockets.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder lifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
                this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
                return this;
            }

            /**
             * <p>The port checked by TCP sockets when the preStop callback function is configured by using TCP sockets.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder lifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
                this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
                return this;
            }

            /**
             * <p>The commands executed in the container when command-line health checks are performed.</p>
             */
            public Builder livenessProbeExecCommands(java.util.List<String> livenessProbeExecCommands) {
                this.livenessProbeExecCommands = livenessProbeExecCommands;
                return this;
            }

            /**
             * <p>The minimum consecutive failures for the readiness probe to be considered failed after having succeeded.
             * Default value: 3.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder livenessProbeFailureThreshold(Integer livenessProbeFailureThreshold) {
                this.livenessProbeFailureThreshold = livenessProbeFailureThreshold;
                return this;
            }

            /**
             * <p>The path for the HTTP GET readiness probe.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/nginx/</p>
             */
            public Builder livenessProbeHttpGetPath(String livenessProbeHttpGetPath) {
                this.livenessProbeHttpGetPath = livenessProbeHttpGetPath;
                return this;
            }

            /**
             * <p>The port for the HTTP GET liveness probe.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder livenessProbeHttpGetPort(Integer livenessProbeHttpGetPort) {
                this.livenessProbeHttpGetPort = livenessProbeHttpGetPort;
                return this;
            }

            /**
             * <p>The protocol type of the HTTP GET request when HTTP requests are used for health checks. Valid values:</p>
             * <ul>
             * <li>HTTP</li>
             * <li>HTTPS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder livenessProbeHttpGetScheme(String livenessProbeHttpGetScheme) {
                this.livenessProbeHttpGetScheme = livenessProbeHttpGetScheme;
                return this;
            }

            /**
             * <p>The delay before the readiness probe is initiated after the container starts.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder livenessProbeInitialDelaySeconds(Integer livenessProbeInitialDelaySeconds) {
                this.livenessProbeInitialDelaySeconds = livenessProbeInitialDelaySeconds;
                return this;
            }

            /**
             * <p>The interval at which the liveness probe is performed. Default value: 10 seconds. Minimum value: 1 second.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder livenessProbePeriodSeconds(Integer livenessProbePeriodSeconds) {
                this.livenessProbePeriodSeconds = livenessProbePeriodSeconds;
                return this;
            }

            /**
             * <p>The minimum consecutive successes for the probe to be considered successful after having failed. Default value: 1. The current value must be 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder livenessProbeSuccessThreshold(Integer livenessProbeSuccessThreshold) {
                this.livenessProbeSuccessThreshold = livenessProbeSuccessThreshold;
                return this;
            }

            /**
             * <p>The port number for the TCP socket liveness probe.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder livenessProbeTcpSocketPort(Integer livenessProbeTcpSocketPort) {
                this.livenessProbeTcpSocketPort = livenessProbeTcpSocketPort;
                return this;
            }

            /**
             * <p>The timeout period for the liveness probe. Default value: 1 second. Minimum value: 1 second.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder livenessProbeTimeoutSeconds(Integer livenessProbeTimeoutSeconds) {
                this.livenessProbeTimeoutSeconds = livenessProbeTimeoutSeconds;
                return this;
            }

            /**
             * <p>The memory size.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The name of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The exposed ports and protocols.</p>
             */
            public Builder ports(java.util.List<Ports> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * <p>The commands executed in the container when command-line health checks are performed.</p>
             */
            public Builder readinessProbeExecCommands(java.util.List<String> readinessProbeExecCommands) {
                this.readinessProbeExecCommands = readinessProbeExecCommands;
                return this;
            }

            /**
             * <p>The minimum consecutive failures for the readiness probe to be considered failed after having succeeded.
             * Default value: 3.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder readinessProbeFailureThreshold(Integer readinessProbeFailureThreshold) {
                this.readinessProbeFailureThreshold = readinessProbeFailureThreshold;
                return this;
            }

            /**
             * <p>The path for the HTTP GET readiness probe.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local</p>
             */
            public Builder readinessProbeHttpGetPath(String readinessProbeHttpGetPath) {
                this.readinessProbeHttpGetPath = readinessProbeHttpGetPath;
                return this;
            }

            /**
             * <p>The path for the HTTP GET readiness probe.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder readinessProbeHttpGetPort(Integer readinessProbeHttpGetPort) {
                this.readinessProbeHttpGetPort = readinessProbeHttpGetPort;
                return this;
            }

            /**
             * <p>The protocol type of the HTTP GET request when HTTP requests are used for health checks. Valid values:</p>
             * <ul>
             * <li>HTTP</li>
             * <li>HTTPS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder readinessProbeHttpGetScheme(String readinessProbeHttpGetScheme) {
                this.readinessProbeHttpGetScheme = readinessProbeHttpGetScheme;
                return this;
            }

            /**
             * <p>The delay before the readiness probe is initiated after the container starts.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder readinessProbeInitialDelaySeconds(Integer readinessProbeInitialDelaySeconds) {
                this.readinessProbeInitialDelaySeconds = readinessProbeInitialDelaySeconds;
                return this;
            }

            /**
             * <p>The interval at which the readiness probe is performed. Default value: 10 seconds. Minimum value: 1 second.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder readinessProbePeriodSeconds(Integer readinessProbePeriodSeconds) {
                this.readinessProbePeriodSeconds = readinessProbePeriodSeconds;
                return this;
            }

            /**
             * <p>The minimum consecutive successes for the probe to be considered successful after having failed. Default value: 1. The current value must be 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder readinessProbeSuccessThreshold(Integer readinessProbeSuccessThreshold) {
                this.readinessProbeSuccessThreshold = readinessProbeSuccessThreshold;
                return this;
            }

            /**
             * <p>The port number for the TCP socket liveness probe.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder readinessProbeTcpSocketPort(Integer readinessProbeTcpSocketPort) {
                this.readinessProbeTcpSocketPort = readinessProbeTcpSocketPort;
                return this;
            }

            /**
             * <p>The timeout period for the readiness probe. Default value: 1 second. Minimum value: 1 second.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder readinessProbeTimeoutSeconds(Integer readinessProbeTimeoutSeconds) {
                this.readinessProbeTimeoutSeconds = readinessProbeTimeoutSeconds;
                return this;
            }

            /**
             * <p>Grants specific permissions to processes in the container. Currently, only NET_ADMIN and NET_RAW are supported.</p>
             */
            public Builder securityContextCapabilityAdds(java.util.List<String> securityContextCapabilityAdds) {
                this.securityContextCapabilityAdds = securityContextCapabilityAdds;
                return this;
            }

            /**
             * <p>Specifies whether the root file system is read-only. Only true is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder securityContextReadOnlyRootFilesystem(Boolean securityContextReadOnlyRootFilesystem) {
                this.securityContextReadOnlyRootFilesystem = securityContextReadOnlyRootFilesystem;
                return this;
            }

            /**
             * <p>The UID used to run the entrypoint of the container process.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder securityContextRunAsUser(Long securityContextRunAsUser) {
                this.securityContextRunAsUser = securityContextRunAsUser;
                return this;
            }

            /**
             * <p>Specifies whether to allocate a buffer for standard input during container runtime. If this parameter is not set, reading from standard input in the container results in an EOF. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder stdin(Boolean stdin) {
                this.stdin = stdin;
                return this;
            }

            /**
             * <p>Specifies whether the standard input stream remains in the enabling status across multiple attached sessions when standard input is set to true.</p>
             * <p>If StdinOnce is set to true, standard input is opened when the container starts, remains empty until the first client attaches to it, and then stays in the enabling status to accept data until the client disconnects. After the client disconnects, standard input enters shutdown and remains in shutdown until the container is restarted.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder stdinOnce(Boolean stdinOnce) {
                this.stdinOnce = stdinOnce;
                return this;
            }

            /**
             * <p>Specifies whether to enable interaction. Valid values:</p>
             * <ul>
             * <li>true: enabled.</li>
             * <li>false: disabled.
             * For example, if Command is set to /bin/bash, set this parameter to true.
             * Default value: false.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder tty(Boolean tty) {
                this.tty = tty;
                return this;
            }

            /**
             * <p>The volume mounts.</p>
             */
            public Builder volumeMounts(java.util.List<VolumeMounts> volumeMounts) {
                this.volumeMounts = volumeMounts;
                return this;
            }

            /**
             * <p>The working directory in the container.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/nginx</p>
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
    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class DnsConfigOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(DnsConfigOptions model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The variable name of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The variable value of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class HostAliases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hostnames")
        private java.util.List<String> hostnames;

        @com.aliyun.core.annotation.NameInMap("Ip")
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
        public java.util.List<String> getHostnames() {
            return this.hostnames;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List<String> hostnames; 
            private String ip; 

            private Builder() {
            } 

            private Builder(HostAliases model) {
                this.hostnames = model.hostnames;
                this.ip = model.ip;
            } 

            /**
             * <p>The hostnames to add.</p>
             */
            public Builder hostnames(java.util.List<String> hostnames) {
                this.hostnames = hostnames;
                return this;
            }

            /**
             * <p>The IP address to add.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
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
    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class ImageRegistryCredentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Server")
        private String server;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(ImageRegistryCredentials model) {
                this.password = model.password;
                this.server = model.server;
                this.userName = model.userName;
            } 

            /**
             * <p>The password for the image registry.</p>
             * 
             * <strong>example:</strong>
             * <p>yourpaasword</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The server address of the image registry.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-shanghai.aliyuncs.com</p>
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * <p>The username for the image registry.</p>
             * 
             * <strong>example:</strong>
             * <p>yourusername</p>
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
    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class InitContainerEnvironmentVars extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldRefFieldPath")
        private String fieldRefFieldPath;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(InitContainerEnvironmentVars model) {
                this.fieldRefFieldPath = model.fieldRefFieldPath;
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <blockquote>
             * <p>This parameter is not available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>path</p>
             */
            public Builder fieldRefFieldPath(String fieldRefFieldPath) {
                this.fieldRefFieldPath = fieldRefFieldPath;
                return this;
            }

            /**
             * <p>The name of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>PATH</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/bin</p>
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
    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class InitContainerPorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
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

            private Builder() {
            } 

            private Builder(InitContainerPorts model) {
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The port number. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type. Valid values:</p>
             * <ul>
             * <li>TCP</li>
             * <li>UDP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UDP</p>
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
    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class InitContainerVolumeMounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("MountPropagation")
        private String mountPropagation;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReadOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("SubPath")
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

            private Builder() {
            } 

            private Builder(InitContainerVolumeMounts model) {
                this.mountPath = model.mountPath;
                this.mountPropagation = model.mountPropagation;
                this.name = model.name;
                this.readOnly = model.readOnly;
                this.subPath = model.subPath;
            } 

            /**
             * <p>The directory in the container where the volume is mounted.    </p>
             * <blockquote>
             * <p>The content in the mount directory of the container is directly overwritten by the content of the volume. Use this parameter with caution.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/usr/share/</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The mount propagation settings of the data volume. Mount propagation allows volumes mounted by a container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
             * <ul>
             * <li>None: the volume does not perceive any subsequent mount operations performed on the volume or its subdirectories.</li>
             * <li>HostToCotainer: the volume perceives subsequent mount operations performed on the volume or its subdirectories.</li>
             * <li>Bidirectional: similar to HostToCotainer, the volume perceives mount operations. Additionally, the volume is propagated back to the host and to all containers of all pods that use the same volume.
             * Default value: None.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * <p>The name of the mounted data volume.</p>
             * 
             * <strong>example:</strong>
             * <p>test-empty</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether the mount path is read-only.</p>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>The subpath of the data volume.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/sub/</p>
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
    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class InitContainers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @com.aliyun.core.annotation.NameInMap("InitContainerArgs")
        private java.util.List<String> initContainerArgs;

        @com.aliyun.core.annotation.NameInMap("InitContainerCommands")
        private java.util.List<String> initContainerCommands;

        @com.aliyun.core.annotation.NameInMap("InitContainerEnvironmentVars")
        private java.util.List<InitContainerEnvironmentVars> initContainerEnvironmentVars;

        @com.aliyun.core.annotation.NameInMap("InitContainerPorts")
        private java.util.List<InitContainerPorts> initContainerPorts;

        @com.aliyun.core.annotation.NameInMap("InitContainerVolumeMounts")
        private java.util.List<InitContainerVolumeMounts> initContainerVolumeMounts;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SecurityContextCapabilityAdds")
        private java.util.List<String> securityContextCapabilityAdds;

        @com.aliyun.core.annotation.NameInMap("SecurityContextReadOnlyRootFilesystem")
        private Boolean securityContextReadOnlyRootFilesystem;

        @com.aliyun.core.annotation.NameInMap("SecurityContextRunAsUser")
        private String securityContextRunAsUser;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
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
        public java.util.List<String> getInitContainerArgs() {
            return this.initContainerArgs;
        }

        /**
         * @return initContainerCommands
         */
        public java.util.List<String> getInitContainerCommands() {
            return this.initContainerCommands;
        }

        /**
         * @return initContainerEnvironmentVars
         */
        public java.util.List<InitContainerEnvironmentVars> getInitContainerEnvironmentVars() {
            return this.initContainerEnvironmentVars;
        }

        /**
         * @return initContainerPorts
         */
        public java.util.List<InitContainerPorts> getInitContainerPorts() {
            return this.initContainerPorts;
        }

        /**
         * @return initContainerVolumeMounts
         */
        public java.util.List<InitContainerVolumeMounts> getInitContainerVolumeMounts() {
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
        public java.util.List<String> getSecurityContextCapabilityAdds() {
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
            private java.util.List<String> initContainerArgs; 
            private java.util.List<String> initContainerCommands; 
            private java.util.List<InitContainerEnvironmentVars> initContainerEnvironmentVars; 
            private java.util.List<InitContainerPorts> initContainerPorts; 
            private java.util.List<InitContainerVolumeMounts> initContainerVolumeMounts; 
            private Float memory; 
            private String name; 
            private java.util.List<String> securityContextCapabilityAdds; 
            private Boolean securityContextReadOnlyRootFilesystem; 
            private String securityContextRunAsUser; 
            private String workingDir; 

            private Builder() {
            } 

            private Builder(InitContainers model) {
                this.cpu = model.cpu;
                this.gpu = model.gpu;
                this.image = model.image;
                this.imagePullPolicy = model.imagePullPolicy;
                this.initContainerArgs = model.initContainerArgs;
                this.initContainerCommands = model.initContainerCommands;
                this.initContainerEnvironmentVars = model.initContainerEnvironmentVars;
                this.initContainerPorts = model.initContainerPorts;
                this.initContainerVolumeMounts = model.initContainerVolumeMounts;
                this.memory = model.memory;
                this.name = model.name;
                this.securityContextCapabilityAdds = model.securityContextCapabilityAdds;
                this.securityContextReadOnlyRootFilesystem = model.securityContextReadOnlyRootFilesystem;
                this.securityContextRunAsUser = model.securityContextRunAsUser;
                this.workingDir = model.workingDir;
            } 

            /**
             * <p>The number of CPU cores for the container.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The number of GPUs used by the container.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The container image.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-hongkong.aliyuncs.com/eci_open/nginx:alpine</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The image pull policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Always</p>
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * <p>The startup arguments for the container.</p>
             */
            public Builder initContainerArgs(java.util.List<String> initContainerArgs) {
                this.initContainerArgs = initContainerArgs;
                return this;
            }

            /**
             * <p>The startup commands for the container.</p>
             */
            public Builder initContainerCommands(java.util.List<String> initContainerCommands) {
                this.initContainerCommands = initContainerCommands;
                return this;
            }

            /**
             * <p>The environment variables for the init container.</p>
             */
            public Builder initContainerEnvironmentVars(java.util.List<InitContainerEnvironmentVars> initContainerEnvironmentVars) {
                this.initContainerEnvironmentVars = initContainerEnvironmentVars;
                return this;
            }

            /**
             * <p>The port information for the init container.</p>
             */
            public Builder initContainerPorts(java.util.List<InitContainerPorts> initContainerPorts) {
                this.initContainerPorts = initContainerPorts;
                return this;
            }

            /**
             * <p>The array of mount point information for the init container.</p>
             */
            public Builder initContainerVolumeMounts(java.util.List<InitContainerVolumeMounts> initContainerVolumeMounts) {
                this.initContainerVolumeMounts = initContainerVolumeMounts;
                return this;
            }

            /**
             * <p>The memory size.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The name of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>test-init</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Grants specific permissions to processes in the container. Currently, only NET_ADMIN and NET_RAW are supported.</p>
             */
            public Builder securityContextCapabilityAdds(java.util.List<String> securityContextCapabilityAdds) {
                this.securityContextCapabilityAdds = securityContextCapabilityAdds;
                return this;
            }

            /**
             * <p>Specifies whether the root file system is read-only. Only true is supported.</p>
             */
            public Builder securityContextReadOnlyRootFilesystem(Boolean securityContextReadOnlyRootFilesystem) {
                this.securityContextReadOnlyRootFilesystem = securityContextReadOnlyRootFilesystem;
                return this;
            }

            /**
             * <p>The user ID used to run the container.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder securityContextRunAsUser(String securityContextRunAsUser) {
                this.securityContextRunAsUser = securityContextRunAsUser;
                return this;
            }

            /**
             * <p>The working directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/www</p>
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
    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class SecurityContextSysCtls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(SecurityContextSysCtls model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The system control parameter name of the security context in which the instance runs.</p>
             * 
             * <strong>example:</strong>
             * <p>kernel.msgmax</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The variable value of the contextual security context in which the instance runs.</p>
             * 
             * <strong>example:</strong>
             * <p>65536</p>
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
    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>version</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class ConfigFileVolumeConfigFileToPaths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("Path")
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

            private Builder() {
            } 

            private Builder(ConfigFileVolumeConfigFileToPaths model) {
                this.content = model.content;
                this.mode = model.mode;
                this.path = model.path;
            } 

            /**
             * <p>The content of the configuration file.</p>
             * 
             * <strong>example:</strong>
             * <p>bGl1bWk=</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The directory permissions of the ConfigFileVolume.</p>
             * 
             * <strong>example:</strong>
             * <p>0644</p>
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The path.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/bin/</p>
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
    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class Volumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigFileVolumeConfigFileToPaths")
        private java.util.List<ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

        @com.aliyun.core.annotation.NameInMap("ConfigFileVolumeDefaultMode")
        private Integer configFileVolumeDefaultMode;

        @com.aliyun.core.annotation.NameInMap("DiskVolumeDiskId")
        private String diskVolumeDiskId;

        @com.aliyun.core.annotation.NameInMap("DiskVolumeDiskSize")
        private Integer diskVolumeDiskSize;

        @com.aliyun.core.annotation.NameInMap("DiskVolumeFsType")
        private String diskVolumeFsType;

        @com.aliyun.core.annotation.NameInMap("EmptyDirVolumeMedium")
        private String emptyDirVolumeMedium;

        @com.aliyun.core.annotation.NameInMap("EmptyDirVolumeSizeLimit")
        private String emptyDirVolumeSizeLimit;

        @com.aliyun.core.annotation.NameInMap("FlexVolumeDriver")
        private String flexVolumeDriver;

        @com.aliyun.core.annotation.NameInMap("FlexVolumeFsType")
        private String flexVolumeFsType;

        @com.aliyun.core.annotation.NameInMap("FlexVolumeOptions")
        private String flexVolumeOptions;

        @com.aliyun.core.annotation.NameInMap("HostPathVolumePath")
        private String hostPathVolumePath;

        @com.aliyun.core.annotation.NameInMap("HostPathVolumeType")
        private String hostPathVolumeType;

        @com.aliyun.core.annotation.NameInMap("NFSVolumePath")
        private String NFSVolumePath;

        @com.aliyun.core.annotation.NameInMap("NFSVolumeReadOnly")
        private Boolean NFSVolumeReadOnly;

        @com.aliyun.core.annotation.NameInMap("NFSVolumeServer")
        private String NFSVolumeServer;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
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
        public java.util.List<ConfigFileVolumeConfigFileToPaths> getConfigFileVolumeConfigFileToPaths() {
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
            private java.util.List<ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths; 
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

            private Builder() {
            } 

            private Builder(Volumes model) {
                this.configFileVolumeConfigFileToPaths = model.configFileVolumeConfigFileToPaths;
                this.configFileVolumeDefaultMode = model.configFileVolumeDefaultMode;
                this.diskVolumeDiskId = model.diskVolumeDiskId;
                this.diskVolumeDiskSize = model.diskVolumeDiskSize;
                this.diskVolumeFsType = model.diskVolumeFsType;
                this.emptyDirVolumeMedium = model.emptyDirVolumeMedium;
                this.emptyDirVolumeSizeLimit = model.emptyDirVolumeSizeLimit;
                this.flexVolumeDriver = model.flexVolumeDriver;
                this.flexVolumeFsType = model.flexVolumeFsType;
                this.flexVolumeOptions = model.flexVolumeOptions;
                this.hostPathVolumePath = model.hostPathVolumePath;
                this.hostPathVolumeType = model.hostPathVolumeType;
                this.NFSVolumePath = model.NFSVolumePath;
                this.NFSVolumeReadOnly = model.NFSVolumeReadOnly;
                this.NFSVolumeServer = model.NFSVolumeServer;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The list of configuration file paths.</p>
             */
            public Builder configFileVolumeConfigFileToPaths(java.util.List<ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths) {
                this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
                return this;
            }

            /**
             * <p>The default permissions of the ConfigFileVolume.</p>
             * 
             * <strong>example:</strong>
             * <p>0644</p>
             */
            public Builder configFileVolumeDefaultMode(Integer configFileVolumeDefaultMode) {
                this.configFileVolumeDefaultMode = configFileVolumeDefaultMode;
                return this;
            }

            /**
             * <p>The ID of the disk volume.</p>
             * 
             * <strong>example:</strong>
             * <p>d-xx</p>
             */
            public Builder diskVolumeDiskId(String diskVolumeDiskId) {
                this.diskVolumeDiskId = diskVolumeDiskId;
                return this;
            }

            /**
             * <p>The size of the disk volume. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder diskVolumeDiskSize(Integer diskVolumeDiskSize) {
                this.diskVolumeDiskSize = diskVolumeDiskSize;
                return this;
            }

            /**
             * <p>The file system type of the disk volume.</p>
             * 
             * <strong>example:</strong>
             * <p>xfs</p>
             */
            public Builder diskVolumeFsType(String diskVolumeFsType) {
                this.diskVolumeFsType = diskVolumeFsType;
                return this;
            }

            /**
             * <p>The storage medium of the EmptyDirVolume. The default value is empty, which indicates that the node file system is used. If this parameter is set to memory, the memory is used.</p>
             * 
             * <strong>example:</strong>
             * <p>memory</p>
             */
            public Builder emptyDirVolumeMedium(String emptyDirVolumeMedium) {
                this.emptyDirVolumeMedium = emptyDirVolumeMedium;
                return this;
            }

            /**
             * <p>The size of the EmptyDir volume.</p>
             * 
             * <strong>example:</strong>
             * <p>256Mi</p>
             */
            public Builder emptyDirVolumeSizeLimit(String emptyDirVolumeSizeLimit) {
                this.emptyDirVolumeSizeLimit = emptyDirVolumeSizeLimit;
                return this;
            }

            /**
             * <p>The name of the driver used for the FlexVolume.</p>
             * 
             * <strong>example:</strong>
             * <p>flexvolume</p>
             */
            public Builder flexVolumeDriver(String flexVolumeDriver) {
                this.flexVolumeDriver = flexVolumeDriver;
                return this;
            }

            /**
             * <p>The mounted file system type. The default value depends on the script of the FlexVolume.</p>
             * 
             * <strong>example:</strong>
             * <p>ext4</p>
             */
            public Builder flexVolumeFsType(String flexVolumeFsType) {
                this.flexVolumeFsType = flexVolumeFsType;
                return this;
            }

            /**
             * <p>The list of options for the FlexVolume object.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;volumeId&quot;:&quot;d-2zehdahrwoa7srg****&quot;,&quot;performanceLevel&quot;: &quot;PL2&quot;}</p>
             */
            public Builder flexVolumeOptions(String flexVolumeOptions) {
                this.flexVolumeOptions = flexVolumeOptions;
                return this;
            }

            /**
             * <p>The directory path of the HostPath volume on the host.</p>
             * 
             * <strong>example:</strong>
             * <p>/pod/data</p>
             */
            public Builder hostPathVolumePath(String hostPathVolumePath) {
                this.hostPathVolumePath = hostPathVolumePath;
                return this;
            }

            /**
             * <p>The type of the HostPath volume.</p>
             * 
             * <strong>example:</strong>
             * <p>Directory</p>
             */
            public Builder hostPathVolumeType(String hostPathVolumeType) {
                this.hostPathVolumeType = hostPathVolumeType;
                return this;
            }

            /**
             * <p>The path of the NFS volume.</p>
             * 
             * <strong>example:</strong>
             * <p>/share</p>
             */
            public Builder NFSVolumePath(String NFSVolumePath) {
                this.NFSVolumePath = NFSVolumePath;
                return this;
            }

            /**
             * <p>Specifies whether the NFS volume is read-only.</p>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder NFSVolumeReadOnly(Boolean NFSVolumeReadOnly) {
                this.NFSVolumeReadOnly = NFSVolumeReadOnly;
                return this;
            }

            /**
             * <p>The address of the NFS server.</p>
             * 
             * <strong>example:</strong>
             * <p>3f9cd4a596-naw76.cn-shanghai.nas.aliyuncs.com</p>
             */
            public Builder NFSVolumeServer(String NFSVolumeServer) {
                this.NFSVolumeServer = NFSVolumeServer;
                return this;
            }

            /**
             * <p>The name of the volume.</p>
             * 
             * <strong>example:</strong>
             * <p>default-volume1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The volume type. Valid values:</p>
             * <ul>
             * <li>EmptyDirVolume.</li>
             * <li>NFSVolume.</li>
             * <li>ConfigFileVolume.</li>
             * <li>FlexVolume.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EmptyDirVolume</p>
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
    /**
     * 
     * {@link DescribeEciScalingConfigurationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEciScalingConfigurationDetailResponseBody</p>
     */
    public static class ScalingConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcrRegistryInfos")
        private java.util.List<AcrRegistryInfos> acrRegistryInfos;

        @com.aliyun.core.annotation.NameInMap("ActiveDeadlineSeconds")
        private Integer activeDeadlineSeconds;

        @com.aliyun.core.annotation.NameInMap("AutoCreateEip")
        private Boolean autoCreateEip;

        @com.aliyun.core.annotation.NameInMap("AutoMatchImageCache")
        private Boolean autoMatchImageCache;

        @com.aliyun.core.annotation.NameInMap("ComputeCategory")
        private java.util.List<String> computeCategory;

        @com.aliyun.core.annotation.NameInMap("ContainerGroupName")
        private String containerGroupName;

        @com.aliyun.core.annotation.NameInMap("Containers")
        private java.util.List<Containers> containers;

        @com.aliyun.core.annotation.NameInMap("CostOptimization")
        private Boolean costOptimization;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("CpuOptionsCore")
        private Integer cpuOptionsCore;

        @com.aliyun.core.annotation.NameInMap("CpuOptionsThreadsPerCore")
        private Integer cpuOptionsThreadsPerCore;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DataCacheBucket")
        private String dataCacheBucket;

        @com.aliyun.core.annotation.NameInMap("DataCacheBurstingEnabled")
        private Boolean dataCacheBurstingEnabled;

        @com.aliyun.core.annotation.NameInMap("DataCachePL")
        private String dataCachePL;

        @com.aliyun.core.annotation.NameInMap("DataCacheProvisionedIops")
        private Integer dataCacheProvisionedIops;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DnsConfigNameServers")
        private java.util.List<String> dnsConfigNameServers;

        @com.aliyun.core.annotation.NameInMap("DnsConfigOptions")
        private java.util.List<DnsConfigOptions> dnsConfigOptions;

        @com.aliyun.core.annotation.NameInMap("DnsConfigSearches")
        private java.util.List<String> dnsConfigSearches;

        @com.aliyun.core.annotation.NameInMap("DnsPolicy")
        private String dnsPolicy;

        @com.aliyun.core.annotation.NameInMap("EgressBandwidth")
        private Long egressBandwidth;

        @com.aliyun.core.annotation.NameInMap("EipBandwidth")
        private Integer eipBandwidth;

        @com.aliyun.core.annotation.NameInMap("EipCommonBandwidthPackage")
        private String eipCommonBandwidthPackage;

        @com.aliyun.core.annotation.NameInMap("EipISP")
        private String eipISP;

        @com.aliyun.core.annotation.NameInMap("EipPublicIpAddressPoolId")
        private String eipPublicIpAddressPoolId;

        @com.aliyun.core.annotation.NameInMap("EphemeralStorage")
        private Integer ephemeralStorage;

        @com.aliyun.core.annotation.NameInMap("HostAliases")
        private java.util.List<HostAliases> hostAliases;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("ImageRegistryCredentials")
        private java.util.List<ImageRegistryCredentials> imageRegistryCredentials;

        @com.aliyun.core.annotation.NameInMap("ImageSnapshotId")
        private String imageSnapshotId;

        @com.aliyun.core.annotation.NameInMap("IngressBandwidth")
        private Long ingressBandwidth;

        @com.aliyun.core.annotation.NameInMap("InitContainers")
        private java.util.List<InitContainers> initContainers;

        @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @com.aliyun.core.annotation.NameInMap("InstanceTypes")
        private java.util.List<String> instanceTypes;

        @com.aliyun.core.annotation.NameInMap("Ipv6AddressCount")
        private Integer ipv6AddressCount;

        @com.aliyun.core.annotation.NameInMap("LifecycleState")
        private String lifecycleState;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerWeight")
        private Integer loadBalancerWeight;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("NtpServers")
        private java.util.List<String> ntpServers;

        @com.aliyun.core.annotation.NameInMap("RamRoleName")
        private String ramRoleName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RestartPolicy")
        private String restartPolicy;

        @com.aliyun.core.annotation.NameInMap("ScalingConfigurationId")
        private String scalingConfigurationId;

        @com.aliyun.core.annotation.NameInMap("ScalingConfigurationName")
        private String scalingConfigurationName;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityContextSysCtls")
        private java.util.List<SecurityContextSysCtls> securityContextSysCtls;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SlsEnable")
        private Boolean slsEnable;

        @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TerminationGracePeriodSeconds")
        private Integer terminationGracePeriodSeconds;

        @com.aliyun.core.annotation.NameInMap("Volumes")
        private java.util.List<Volumes> volumes;

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
        public java.util.List<AcrRegistryInfos> getAcrRegistryInfos() {
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
        public java.util.List<String> getComputeCategory() {
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
        public java.util.List<Containers> getContainers() {
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
        public java.util.List<String> getDnsConfigNameServers() {
            return this.dnsConfigNameServers;
        }

        /**
         * @return dnsConfigOptions
         */
        public java.util.List<DnsConfigOptions> getDnsConfigOptions() {
            return this.dnsConfigOptions;
        }

        /**
         * @return dnsConfigSearches
         */
        public java.util.List<String> getDnsConfigSearches() {
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
        public java.util.List<HostAliases> getHostAliases() {
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
        public java.util.List<ImageRegistryCredentials> getImageRegistryCredentials() {
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
        public java.util.List<InitContainers> getInitContainers() {
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
        public java.util.List<String> getInstanceTypes() {
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
        public java.util.List<String> getNtpServers() {
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
        public java.util.List<SecurityContextSysCtls> getSecurityContextSysCtls() {
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
        public java.util.List<Tags> getTags() {
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
        public java.util.List<Volumes> getVolumes() {
            return this.volumes;
        }

        public static final class Builder {
            private java.util.List<AcrRegistryInfos> acrRegistryInfos; 
            private Integer activeDeadlineSeconds; 
            private Boolean autoCreateEip; 
            private Boolean autoMatchImageCache; 
            private java.util.List<String> computeCategory; 
            private String containerGroupName; 
            private java.util.List<Containers> containers; 
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
            private java.util.List<String> dnsConfigNameServers; 
            private java.util.List<DnsConfigOptions> dnsConfigOptions; 
            private java.util.List<String> dnsConfigSearches; 
            private String dnsPolicy; 
            private Long egressBandwidth; 
            private Integer eipBandwidth; 
            private String eipCommonBandwidthPackage; 
            private String eipISP; 
            private String eipPublicIpAddressPoolId; 
            private Integer ephemeralStorage; 
            private java.util.List<HostAliases> hostAliases; 
            private String hostName; 
            private java.util.List<ImageRegistryCredentials> imageRegistryCredentials; 
            private String imageSnapshotId; 
            private Long ingressBandwidth; 
            private java.util.List<InitContainers> initContainers; 
            private String instanceFamilyLevel; 
            private java.util.List<String> instanceTypes; 
            private Integer ipv6AddressCount; 
            private String lifecycleState; 
            private Integer loadBalancerWeight; 
            private Float memory; 
            private java.util.List<String> ntpServers; 
            private String ramRoleName; 
            private String regionId; 
            private String resourceGroupId; 
            private String restartPolicy; 
            private String scalingConfigurationId; 
            private String scalingConfigurationName; 
            private String scalingGroupId; 
            private java.util.List<SecurityContextSysCtls> securityContextSysCtls; 
            private String securityGroupId; 
            private Boolean slsEnable; 
            private Float spotPriceLimit; 
            private String spotStrategy; 
            private java.util.List<Tags> tags; 
            private Integer terminationGracePeriodSeconds; 
            private java.util.List<Volumes> volumes; 

            private Builder() {
            } 

            private Builder(ScalingConfiguration model) {
                this.acrRegistryInfos = model.acrRegistryInfos;
                this.activeDeadlineSeconds = model.activeDeadlineSeconds;
                this.autoCreateEip = model.autoCreateEip;
                this.autoMatchImageCache = model.autoMatchImageCache;
                this.computeCategory = model.computeCategory;
                this.containerGroupName = model.containerGroupName;
                this.containers = model.containers;
                this.costOptimization = model.costOptimization;
                this.cpu = model.cpu;
                this.cpuOptionsCore = model.cpuOptionsCore;
                this.cpuOptionsThreadsPerCore = model.cpuOptionsThreadsPerCore;
                this.creationTime = model.creationTime;
                this.dataCacheBucket = model.dataCacheBucket;
                this.dataCacheBurstingEnabled = model.dataCacheBurstingEnabled;
                this.dataCachePL = model.dataCachePL;
                this.dataCacheProvisionedIops = model.dataCacheProvisionedIops;
                this.description = model.description;
                this.dnsConfigNameServers = model.dnsConfigNameServers;
                this.dnsConfigOptions = model.dnsConfigOptions;
                this.dnsConfigSearches = model.dnsConfigSearches;
                this.dnsPolicy = model.dnsPolicy;
                this.egressBandwidth = model.egressBandwidth;
                this.eipBandwidth = model.eipBandwidth;
                this.eipCommonBandwidthPackage = model.eipCommonBandwidthPackage;
                this.eipISP = model.eipISP;
                this.eipPublicIpAddressPoolId = model.eipPublicIpAddressPoolId;
                this.ephemeralStorage = model.ephemeralStorage;
                this.hostAliases = model.hostAliases;
                this.hostName = model.hostName;
                this.imageRegistryCredentials = model.imageRegistryCredentials;
                this.imageSnapshotId = model.imageSnapshotId;
                this.ingressBandwidth = model.ingressBandwidth;
                this.initContainers = model.initContainers;
                this.instanceFamilyLevel = model.instanceFamilyLevel;
                this.instanceTypes = model.instanceTypes;
                this.ipv6AddressCount = model.ipv6AddressCount;
                this.lifecycleState = model.lifecycleState;
                this.loadBalancerWeight = model.loadBalancerWeight;
                this.memory = model.memory;
                this.ntpServers = model.ntpServers;
                this.ramRoleName = model.ramRoleName;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.restartPolicy = model.restartPolicy;
                this.scalingConfigurationId = model.scalingConfigurationId;
                this.scalingConfigurationName = model.scalingConfigurationName;
                this.scalingGroupId = model.scalingGroupId;
                this.securityContextSysCtls = model.securityContextSysCtls;
                this.securityGroupId = model.securityGroupId;
                this.slsEnable = model.slsEnable;
                this.spotPriceLimit = model.spotPriceLimit;
                this.spotStrategy = model.spotStrategy;
                this.tags = model.tags;
                this.terminationGracePeriodSeconds = model.terminationGracePeriodSeconds;
                this.volumes = model.volumes;
            } 

            /**
             * <p>The information about the ACR Enterprise instance.</p>
             */
            public Builder acrRegistryInfos(java.util.List<AcrRegistryInfos> acrRegistryInfos) {
                this.acrRegistryInfos = acrRegistryInfos;
                return this;
            }

            /**
             * <p>The validity period. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder activeDeadlineSeconds(Integer activeDeadlineSeconds) {
                this.activeDeadlineSeconds = activeDeadlineSeconds;
                return this;
            }

            /**
             * <p>Specifies whether the automatic creation of an elastic IP address (EIP) is enabled in order to attach it to the ECI instance.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoCreateEip(Boolean autoCreateEip) {
                this.autoCreateEip = autoCreateEip;
                return this;
            }

            /**
             * <p>Specifies whether to automatically match an image cache.
             * Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoMatchImageCache(Boolean autoMatchImageCache) {
                this.autoMatchImageCache = autoMatchImageCache;
                return this;
            }

            /**
             * <p>The computing power category. A value of economy indicates that instances of economy instance types are queried.</p>
             */
            public Builder computeCategory(java.util.List<String> computeCategory) {
                this.computeCategory = computeCategory;
                return this;
            }

            /**
             * <p>The name of the container group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder containerGroupName(String containerGroupName) {
                this.containerGroupName = containerGroupName;
                return this;
            }

            /**
             * <p>The list of containers included in the instance.</p>
             */
            public Builder containers(java.util.List<Containers> containers) {
                this.containers = containers;
                return this;
            }

            /**
             * <p>Specifies whether to enable cost optimization. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder costOptimization(Boolean costOptimization) {
                this.costOptimization = costOptimization;
                return this;
            }

            /**
             * <p>The number of vCPUs for the instance. Unit: cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The number of physical CPU cores. Only specific instance types support custom settings.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpuOptionsCore(Integer cpuOptionsCore) {
                this.cpuOptionsCore = cpuOptionsCore;
                return this;
            }

            /**
             * <p>The number of threads per core. Only specific instance types support custom settings. A value of 1 indicates that hyper-threading is disabled. For more information, see <a href="https://help.aliyun.com/document_detail/197781.html">Customize CPU options</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
                this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
                return this;
            }

            /**
             * <p>The time when the scaling configuration was created. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-10T02:39:15Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The data cache bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder dataCacheBucket(String dataCacheBucket) {
                this.dataCacheBucket = dataCacheBucket;
                return this;
            }

            /**
             * <p>Specifies whether to enable the burst feature for the ESSD AutoPL cloud disk used for data caching. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
             * </ul>
             * <p>Default value: false.</p>
             * <blockquote>
             * <p>For more information about ESSD AutoPL cloud disks, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD AutoPL cloud disks</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dataCacheBurstingEnabled(Boolean dataCacheBurstingEnabled) {
                this.dataCacheBurstingEnabled = dataCacheBurstingEnabled;
                return this;
            }

            /**
             * <p>The performance level (PL) of the cloud disk used for data caching. We recommend that you use standard SSDs. Valid values for the PL of a standard SSD:</p>
             * <ul>
             * <li>PL0: A single standard SSD can deliver up to 10,000 random read/write IOPS.</li>
             * <li>PL1: A single standard SSD can deliver up to 50,000 random read/write IOPS.</li>
             * <li>PL2: A single standard SSD can deliver up to 100,000 random read/write IOPS.</li>
             * <li>PL3: A single standard SSD can deliver up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * <blockquote>
             * <p>For more information about standard SSDs, see <a href="https://help.aliyun.com/document_detail/122389.html">standard SSDs</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder dataCachePL(String dataCachePL) {
                this.dataCachePL = dataCachePL;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS of the ESSD AutoPL cloud disk used for data caching. Valid values: 0 to min{50000, 1000 × Capacity - Baseline performance}, where Baseline performance = min{1800 + 50 × Capacity, 50000}.</p>
             * <blockquote>
             * <p>For more information about ESSD AutoPL cloud disks, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>40000</p>
             */
            public Builder dataCacheProvisionedIops(Integer dataCacheProvisionedIops) {
                this.dataCacheProvisionedIops = dataCacheProvisionedIops;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>This is an example.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of IP addresses of the DNS servers.</p>
             */
            public Builder dnsConfigNameServers(java.util.List<String> dnsConfigNameServers) {
                this.dnsConfigNameServers = dnsConfigNameServers;
                return this;
            }

            /**
             * <p>The DNS configuration options.</p>
             */
            public Builder dnsConfigOptions(java.util.List<DnsConfigOptions> dnsConfigOptions) {
                this.dnsConfigOptions = dnsConfigOptions;
                return this;
            }

            /**
             * <p>The list of DNS search domains.</p>
             */
            public Builder dnsConfigSearches(java.util.List<String> dnsConfigSearches) {
                this.dnsConfigSearches = dnsConfigSearches;
                return this;
            }

            /**
             * <p>The DNS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder dnsPolicy(String dnsPolicy) {
                this.dnsPolicy = dnsPolicy;
                return this;
            }

            /**
             * <p>The outbound bandwidth limit. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10485760</p>
             */
            public Builder egressBandwidth(Long egressBandwidth) {
                this.egressBandwidth = egressBandwidth;
                return this;
            }

            /**
             * <p>The bandwidth of the EIP. Default value: 5 Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder eipBandwidth(Integer eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * <p>The existing Internet Shared Bandwidth instance to associate.</p>
             * 
             * <strong>example:</strong>
             * <p>cbwp-bp1rxai1z4b1an454xl8m</p>
             */
            public Builder eipCommonBandwidthPackage(String eipCommonBandwidthPackage) {
                this.eipCommonBandwidthPackage = eipCommonBandwidthPackage;
                return this;
            }

            /**
             * <p>The line type of the elastic IP address (EIP). Valid values:</p>
             * <ul>
             * <li>BGP: BGP (Multi-ISP) line. This is the default value.</li>
             * <li>BGP_PRO: BGP (Multi-ISP) Pro line.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
             */
            public Builder eipISP(String eipISP) {
                this.eipISP = eipISP;
                return this;
            }

            /**
             * <p>The ID of the IP address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>pippool-bp187arfugi543y1s****</p>
             */
            public Builder eipPublicIpAddressPoolId(String eipPublicIpAddressPoolId) {
                this.eipPublicIpAddressPoolId = eipPublicIpAddressPoolId;
                return this;
            }

            /**
             * <p>The size of the ephemeral storage space. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder ephemeralStorage(Integer ephemeralStorage) {
                this.ephemeralStorage = ephemeralStorage;
                return this;
            }

            /**
             * <p>The custom hostname mappings for a container in the instance.</p>
             */
            public Builder hostAliases(java.util.List<HostAliases> hostAliases) {
                this.hostAliases = hostAliases;
                return this;
            }

            /**
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>hostname</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The image registry information.</p>
             */
            public Builder imageRegistryCredentials(java.util.List<ImageRegistryCredentials> imageRegistryCredentials) {
                this.imageRegistryCredentials = imageRegistryCredentials;
                return this;
            }

            /**
             * <p>The ID of the image cache.</p>
             * 
             * <strong>example:</strong>
             * <p>imc-2zebxkiifuyzzlhl****</p>
             */
            public Builder imageSnapshotId(String imageSnapshotId) {
                this.imageSnapshotId = imageSnapshotId;
                return this;
            }

            /**
             * <p>The inbound bandwidth limit. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1024000</p>
             */
            public Builder ingressBandwidth(Long ingressBandwidth) {
                this.ingressBandwidth = ingressBandwidth;
                return this;
            }

            /**
             * <p>The list of init containers.</p>
             */
            public Builder initContainers(java.util.List<InitContainers> initContainers) {
                this.initContainers = initContainers;
                return this;
            }

            /**
             * <p>The instance family level, which is used to filter instance types that meet the requirements. This parameter takes effect only when CostOptimization is enabled. Valid values:</p>
             * <ul>
             * <li>EntryLevel: Entry-level, which refers to shared instance types. This level provides lower costs but cannot guarantee stable computing performance. It is suitable for business scenarios with low CPU utilization. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
             * <li>EnterpriseLevel: Enterprise-level. This level provides stable performance and dedicated resources, and is suitable for business scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
             * <li>CreditEntryLevel: Credit-based entry-level, which refers to burstable instances. This level uses CPU credits to maintain computing performance and is suitable for business scenarios with low baseline CPU utilization and occasional CPU usage spikes. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EnterpriseLevel</p>
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * <p>The specified ECS instance types. You can specify up to five instance types.</p>
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The number of IPv6 addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ipv6AddressCount(Integer ipv6AddressCount) {
                this.ipv6AddressCount = ipv6AddressCount;
                return this;
            }

            /**
             * <p>The state of the scaling configuration in the scaling group. Valid values:</p>
             * <ul>
             * <li>Active: Active. The scaling group uses active scaling configurations for the automatic creation of Elastic Container Instance (ECI) instances.</li>
             * <li>Inacitve: Inactive. Inactive scaling configurations exist in the scaling group, but the scaling group does not use them for the automatic creation of ECI instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder lifecycleState(String lifecycleState) {
                this.lifecycleState = lifecycleState;
                return this;
            }

            /**
             * <p>The weight of the ECI instance when it serves as a backend server for load balancing. Valid values: 1 to 100.
             * Default value: 50.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder loadBalancerWeight(Integer loadBalancerWeight) {
                this.loadBalancerWeight = loadBalancerWeight;
                return this;
            }

            /**
             * <p>The memory size. Unit: GiB.
             * You can specify both CPU and Memory to define a range of instance types. For example, CPU=2 and Memory=16 defines all instance types that have 2 vCPUs and 16 GiB of memory. Auto Scaling determines the available instance types based on factors such as I/O optimization and zones, and creates the instance with the lowest price.</p>
             * <blockquote>
             * <p>This configuration takes effect only in cost optimization mode and when no instance type is specified in the scaling configuration.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The NTP servers.</p>
             */
            public Builder ntpServers(java.util.List<String> ntpServers) {
                this.ntpServers = ntpServers;
                return this;
            }

            /**
             * <p>The name of the Resource Access Management (RAM) role for the instance. ECIs and Elastic Compute Service (ECS) instances share the same RAM role. For more information, see <a href="https://help.aliyun.com/document_detail/61178.html">Use an instance RAM role by calling API operations</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ram:PassRole</p>
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * <p>The region ID of the scaling group to which the scaling rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmwozpmmksakq</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The restart policy of the pod. Valid values:</p>
             * <ul>
             * <li>Never: no restart.</li>
             * <li>Always: always restart.</li>
             * <li>OnFailure: restart on failure.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Always</p>
             */
            public Builder restartPolicy(String restartPolicy) {
                this.restartPolicy = restartPolicy;
                return this;
            }

            /**
             * <p>The ID of the scaling configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>asc-2zec39vg84usxdocme6a</p>
             */
            public Builder scalingConfigurationId(String scalingConfigurationId) {
                this.scalingConfigurationId = scalingConfigurationId;
                return this;
            }

            /**
             * <p>The name of the scaling configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>scalingconfi****</p>
             */
            public Builder scalingConfigurationName(String scalingConfigurationName) {
                this.scalingConfigurationName = scalingConfigurationName;
                return this;
            }

            /**
             * <p>The ID of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-bp1frlu04fq4zv65b1bh</p>
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * <p>The system info of the contextual security context in which the instance runs.</p>
             */
            public Builder securityContextSysCtls(java.util.List<SecurityContextSysCtls> securityContextSysCtls) {
                this.securityContextSysCtls = securityContextSysCtls;
                return this;
            }

            /**
             * <p>The ID of the security group to which the Elastic Container Instance (ECI) belongs. ECIs in the same security group can access each other.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp18kz60mefs****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>Specifies whether to enable user log collection. Default value: <strong>false</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder slsEnable(Boolean slsEnable) {
                this.slsEnable = slsEnable;
                return this;
            }

            /**
             * <p>The maximum hourly price of the spot instance.
             * This parameter is returned only when SpotStrategy is set to SpotWithPriceLimit.</p>
             * 
             * <strong>example:</strong>
             * <p>0.025</p>
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * <p>The preemption policy of the instance. Valid values:</p>
             * <ul>
             * <li>NoSpot: regular pay-as-you-go instance.</li>
             * <li>SpotWithPriceLimit: spot instance with a specified maximum price.</li>
             * <li>SpotAsPriceGo: spot instance whose price is automatically offered by the system based on the current market price.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>The tag key-value pairs of the instance.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The buffer time for the program to handle operations before shutdown.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder terminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
                this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
                return this;
            }

            /**
             * <p>The volume information.</p>
             */
            public Builder volumes(java.util.List<Volumes> volumes) {
                this.volumes = volumes;
                return this;
            }

            public ScalingConfiguration build() {
                return new ScalingConfiguration(this);
            } 

        } 

    }
}
