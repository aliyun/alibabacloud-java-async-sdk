// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetK8sApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetK8sApplicationResponseBody</p>
 */
public class GetK8sApplicationResponseBody extends TeaModel {
    @NameInMap("Applcation")
    private Applcation applcation;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetK8sApplicationResponseBody(Builder builder) {
        this.applcation = builder.applcation;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetK8sApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return applcation
     */
    public Applcation getApplcation() {
        return this.applcation;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
        private Applcation applcation; 
        private Integer code; 
        private String message; 
        private String requestId; 

        /**
         * The information about the application.
         */
        public Builder applcation(Applcation applcation) {
            this.applcation = applcation;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetK8sApplicationResponseBody build() {
            return new GetK8sApplicationResponseBody(this);
        } 

    } 

    public static class CmdArgs extends TeaModel {
        @NameInMap("CmdArg")
        private java.util.List < String > cmdArg;

        private CmdArgs(Builder builder) {
            this.cmdArg = builder.cmdArg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CmdArgs create() {
            return builder().build();
        }

        /**
         * @return cmdArg
         */
        public java.util.List < String > getCmdArg() {
            return this.cmdArg;
        }

        public static final class Builder {
            private java.util.List < String > cmdArg; 

            /**
             * CmdArg.
             */
            public Builder cmdArg(java.util.List < String > cmdArg) {
                this.cmdArg = cmdArg;
                return this;
            }

            public CmdArgs build() {
                return new CmdArgs(this);
            } 

        } 

    }
    public static class Env extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private Env(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Env create() {
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
             * The name of the environment variable.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the environment variable.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Env build() {
                return new Env(this);
            } 

        } 

    }
    public static class EnvList extends TeaModel {
        @NameInMap("Env")
        private java.util.List < Env> env;

        private EnvList(Builder builder) {
            this.env = builder.env;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvList create() {
            return builder().build();
        }

        /**
         * @return env
         */
        public java.util.List < Env> getEnv() {
            return this.env;
        }

        public static final class Builder {
            private java.util.List < Env> env; 

            /**
             * Env.
             */
            public Builder env(java.util.List < Env> env) {
                this.env = env;
                return this;
            }

            public EnvList build() {
                return new EnvList(this);
            } 

        } 

    }
    public static class App extends TeaModel {
        @NameInMap("Annotations")
        private String annotations;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("ApplicationName")
        private String applicationName;

        @NameInMap("ApplicationType")
        private String applicationType;

        @NameInMap("BuildpackId")
        private Integer buildpackId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Cmd")
        private String cmd;

        @NameInMap("CmdArgs")
        private CmdArgs cmdArgs;

        @NameInMap("CsClusterId")
        private String csClusterId;

        @NameInMap("DeployType")
        private String deployType;

        @NameInMap("DevelopType")
        private String developType;

        @NameInMap("EdasContainerVersion")
        private String edasContainerVersion;

        @NameInMap("EnableEmptyPushReject")
        private Boolean enableEmptyPushReject;

        @NameInMap("EnableLosslessRule")
        private Boolean enableLosslessRule;

        @NameInMap("EnvList")
        private EnvList envList;

        @NameInMap("FeatureAnnotations")
        private String featureAnnotations;

        @NameInMap("Instances")
        private Integer instances;

        @NameInMap("InstancesBeforeScaling")
        private Integer instancesBeforeScaling;

        @NameInMap("K8sNamespace")
        private String k8sNamespace;

        @NameInMap("Labels")
        private String labels;

        @NameInMap("LimitCpuM")
        private Integer limitCpuM;

        @NameInMap("LimitEphemeralStorage")
        private String limitEphemeralStorage;

        @NameInMap("LimitMem")
        private Integer limitMem;

        @NameInMap("LosslessRuleAligned")
        private Boolean losslessRuleAligned;

        @NameInMap("LosslessRuleDelayTime")
        private Integer losslessRuleDelayTime;

        @NameInMap("LosslessRuleFuncType")
        private Integer losslessRuleFuncType;

        @NameInMap("LosslessRuleRelated")
        private Boolean losslessRuleRelated;

        @NameInMap("LosslessRuleWarmupTime")
        private Integer losslessRuleWarmupTime;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RequestCpuM")
        private Integer requestCpuM;

        @NameInMap("RequestEphemeralStorage")
        private String requestEphemeralStorage;

        @NameInMap("RequestMem")
        private Integer requestMem;

        @NameInMap("SlbInfo")
        private String slbInfo;

        @NameInMap("TomcatVersion")
        private String tomcatVersion;

        @NameInMap("WorkloadType")
        private String workloadType;

        private App(Builder builder) {
            this.annotations = builder.annotations;
            this.appId = builder.appId;
            this.applicationName = builder.applicationName;
            this.applicationType = builder.applicationType;
            this.buildpackId = builder.buildpackId;
            this.clusterId = builder.clusterId;
            this.cmd = builder.cmd;
            this.cmdArgs = builder.cmdArgs;
            this.csClusterId = builder.csClusterId;
            this.deployType = builder.deployType;
            this.developType = builder.developType;
            this.edasContainerVersion = builder.edasContainerVersion;
            this.enableEmptyPushReject = builder.enableEmptyPushReject;
            this.enableLosslessRule = builder.enableLosslessRule;
            this.envList = builder.envList;
            this.featureAnnotations = builder.featureAnnotations;
            this.instances = builder.instances;
            this.instancesBeforeScaling = builder.instancesBeforeScaling;
            this.k8sNamespace = builder.k8sNamespace;
            this.labels = builder.labels;
            this.limitCpuM = builder.limitCpuM;
            this.limitEphemeralStorage = builder.limitEphemeralStorage;
            this.limitMem = builder.limitMem;
            this.losslessRuleAligned = builder.losslessRuleAligned;
            this.losslessRuleDelayTime = builder.losslessRuleDelayTime;
            this.losslessRuleFuncType = builder.losslessRuleFuncType;
            this.losslessRuleRelated = builder.losslessRuleRelated;
            this.losslessRuleWarmupTime = builder.losslessRuleWarmupTime;
            this.regionId = builder.regionId;
            this.requestCpuM = builder.requestCpuM;
            this.requestEphemeralStorage = builder.requestEphemeralStorage;
            this.requestMem = builder.requestMem;
            this.slbInfo = builder.slbInfo;
            this.tomcatVersion = builder.tomcatVersion;
            this.workloadType = builder.workloadType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static App create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public String getAnnotations() {
            return this.annotations;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return applicationType
         */
        public String getApplicationType() {
            return this.applicationType;
        }

        /**
         * @return buildpackId
         */
        public Integer getBuildpackId() {
            return this.buildpackId;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return cmd
         */
        public String getCmd() {
            return this.cmd;
        }

        /**
         * @return cmdArgs
         */
        public CmdArgs getCmdArgs() {
            return this.cmdArgs;
        }

        /**
         * @return csClusterId
         */
        public String getCsClusterId() {
            return this.csClusterId;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return developType
         */
        public String getDevelopType() {
            return this.developType;
        }

        /**
         * @return edasContainerVersion
         */
        public String getEdasContainerVersion() {
            return this.edasContainerVersion;
        }

        /**
         * @return enableEmptyPushReject
         */
        public Boolean getEnableEmptyPushReject() {
            return this.enableEmptyPushReject;
        }

        /**
         * @return enableLosslessRule
         */
        public Boolean getEnableLosslessRule() {
            return this.enableLosslessRule;
        }

        /**
         * @return envList
         */
        public EnvList getEnvList() {
            return this.envList;
        }

        /**
         * @return featureAnnotations
         */
        public String getFeatureAnnotations() {
            return this.featureAnnotations;
        }

        /**
         * @return instances
         */
        public Integer getInstances() {
            return this.instances;
        }

        /**
         * @return instancesBeforeScaling
         */
        public Integer getInstancesBeforeScaling() {
            return this.instancesBeforeScaling;
        }

        /**
         * @return k8sNamespace
         */
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return limitCpuM
         */
        public Integer getLimitCpuM() {
            return this.limitCpuM;
        }

        /**
         * @return limitEphemeralStorage
         */
        public String getLimitEphemeralStorage() {
            return this.limitEphemeralStorage;
        }

        /**
         * @return limitMem
         */
        public Integer getLimitMem() {
            return this.limitMem;
        }

        /**
         * @return losslessRuleAligned
         */
        public Boolean getLosslessRuleAligned() {
            return this.losslessRuleAligned;
        }

        /**
         * @return losslessRuleDelayTime
         */
        public Integer getLosslessRuleDelayTime() {
            return this.losslessRuleDelayTime;
        }

        /**
         * @return losslessRuleFuncType
         */
        public Integer getLosslessRuleFuncType() {
            return this.losslessRuleFuncType;
        }

        /**
         * @return losslessRuleRelated
         */
        public Boolean getLosslessRuleRelated() {
            return this.losslessRuleRelated;
        }

        /**
         * @return losslessRuleWarmupTime
         */
        public Integer getLosslessRuleWarmupTime() {
            return this.losslessRuleWarmupTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return requestCpuM
         */
        public Integer getRequestCpuM() {
            return this.requestCpuM;
        }

        /**
         * @return requestEphemeralStorage
         */
        public String getRequestEphemeralStorage() {
            return this.requestEphemeralStorage;
        }

        /**
         * @return requestMem
         */
        public Integer getRequestMem() {
            return this.requestMem;
        }

        /**
         * @return slbInfo
         */
        public String getSlbInfo() {
            return this.slbInfo;
        }

        /**
         * @return tomcatVersion
         */
        public String getTomcatVersion() {
            return this.tomcatVersion;
        }

        /**
         * @return workloadType
         */
        public String getWorkloadType() {
            return this.workloadType;
        }

        public static final class Builder {
            private String annotations; 
            private String appId; 
            private String applicationName; 
            private String applicationType; 
            private Integer buildpackId; 
            private String clusterId; 
            private String cmd; 
            private CmdArgs cmdArgs; 
            private String csClusterId; 
            private String deployType; 
            private String developType; 
            private String edasContainerVersion; 
            private Boolean enableEmptyPushReject; 
            private Boolean enableLosslessRule; 
            private EnvList envList; 
            private String featureAnnotations; 
            private Integer instances; 
            private Integer instancesBeforeScaling; 
            private String k8sNamespace; 
            private String labels; 
            private Integer limitCpuM; 
            private String limitEphemeralStorage; 
            private Integer limitMem; 
            private Boolean losslessRuleAligned; 
            private Integer losslessRuleDelayTime; 
            private Integer losslessRuleFuncType; 
            private Boolean losslessRuleRelated; 
            private Integer losslessRuleWarmupTime; 
            private String regionId; 
            private Integer requestCpuM; 
            private String requestEphemeralStorage; 
            private Integer requestMem; 
            private String slbInfo; 
            private String tomcatVersion; 
            private String workloadType; 

            /**
             * The annotation of an application pod.
             */
            public Builder annotations(String annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * The type of the application.
             */
            public Builder applicationType(String applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * The build package number of Enterprise Distributed Application Service (EDAS) Container.
             */
            public Builder buildpackId(Integer buildpackId) {
                this.buildpackId = buildpackId;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The startup command.
             */
            public Builder cmd(String cmd) {
                this.cmd = cmd;
                return this;
            }

            /**
             * The list of commands.
             */
            public Builder cmdArgs(CmdArgs cmdArgs) {
                this.cmdArgs = cmdArgs;
                return this;
            }

            /**
             * The ID of the cluster to which the container belongs.
             */
            public Builder csClusterId(String csClusterId) {
                this.csClusterId = csClusterId;
                return this;
            }

            /**
             * The deployment type of the application. Example: Image.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * The application type. Valid values:
             * <p>
             * 
             * *   General: native Java application
             * *   Pandora: Pandora application
             * *   Multilingual: multilingual application
             */
            public Builder developType(String developType) {
                this.developType = developType;
                return this;
            }

            /**
             * The version of EDAS Container.
             */
            public Builder edasContainerVersion(String edasContainerVersion) {
                this.edasContainerVersion = edasContainerVersion;
                return this;
            }

            /**
             * Indicates whether the Empty List Protection feature is enabled for the application.
             */
            public Builder enableEmptyPushReject(Boolean enableEmptyPushReject) {
                this.enableEmptyPushReject = enableEmptyPushReject;
                return this;
            }

            /**
             * Indicates whether the Graceful Release feature is enabled for the application.
             */
            public Builder enableLosslessRule(Boolean enableLosslessRule) {
                this.enableLosslessRule = enableLosslessRule;
                return this;
            }

            /**
             * The list of environment variables.
             */
            public Builder envList(EnvList envList) {
                this.envList = envList;
                return this;
            }

            /**
             * The feature annotations. Possible values:
             * <p>
             * 
             * *   base.combination.edas: enables EDAS integrated management solution.
             * *   base.combination.arms: enables ARMS monitoring.
             * *   base.combination.mse: enables MSE microservices governance.
             * *   base.combination.none: enables lifecycle management.
             */
            public Builder featureAnnotations(String featureAnnotations) {
                this.featureAnnotations = featureAnnotations;
                return this;
            }

            /**
             * The number of application instances.
             */
            public Builder instances(Integer instances) {
                this.instances = instances;
                return this;
            }

            /**
             * The number of application instances before the last auto scaling operation.
             */
            public Builder instancesBeforeScaling(Integer instancesBeforeScaling) {
                this.instancesBeforeScaling = instancesBeforeScaling;
                return this;
            }

            /**
             * The namespace of the Kubernetes cluster.
             */
            public Builder k8sNamespace(String k8sNamespace) {
                this.k8sNamespace = k8sNamespace;
                return this;
            }

            /**
             * The label of an application pod.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * The maximum number of CPU cores allowed. Unit: millicores. 1,000 millicores equal one CPU core.
             */
            public Builder limitCpuM(Integer limitCpuM) {
                this.limitCpuM = limitCpuM;
                return this;
            }

            /**
             * The maximum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the space size.
             */
            public Builder limitEphemeralStorage(String limitEphemeralStorage) {
                this.limitEphemeralStorage = limitEphemeralStorage;
                return this;
            }

            /**
             * The maximum size of the memory allowed. Unit: MiB.
             */
            public Builder limitMem(Integer limitMem) {
                this.limitMem = limitMem;
                return this;
            }

            /**
             * Indicates whether the Graceful Rolling Release and Configure Complete Service Registration before Readiness Probing feature is enabled for the application.
             */
            public Builder losslessRuleAligned(Boolean losslessRuleAligned) {
                this.losslessRuleAligned = losslessRuleAligned;
                return this;
            }

            /**
             * The delay of service registration. Unit: seconds.
             */
            public Builder losslessRuleDelayTime(Integer losslessRuleDelayTime) {
                this.losslessRuleDelayTime = losslessRuleDelayTime;
                return this;
            }

            /**
             * The number of prefetching curves.
             */
            public Builder losslessRuleFuncType(Integer losslessRuleFuncType) {
                this.losslessRuleFuncType = losslessRuleFuncType;
                return this;
            }

            /**
             * Indicates whether the Graceful Rolling Release and Configure Complete Service Prefetching before Readiness Probing feature is enabled for the application.
             */
            public Builder losslessRuleRelated(Boolean losslessRuleRelated) {
                this.losslessRuleRelated = losslessRuleRelated;
                return this;
            }

            /**
             * The service prefetching duration. Unit: seconds.
             */
            public Builder losslessRuleWarmupTime(Integer losslessRuleWarmupTime) {
                this.losslessRuleWarmupTime = losslessRuleWarmupTime;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The number of requested CPU cores. Unit: millicores. 1,000 millicores equal one CPU core.
             */
            public Builder requestCpuM(Integer requestCpuM) {
                this.requestCpuM = requestCpuM;
                return this;
            }

            /**
             * The size of space reserved for ephemeral storage resources. Unit: GB. Value 0 indicates that no limit is set on the space size.
             */
            public Builder requestEphemeralStorage(String requestEphemeralStorage) {
                this.requestEphemeralStorage = requestEphemeralStorage;
                return this;
            }

            /**
             * The size of the reserved memory. Unit: MiB.
             */
            public Builder requestMem(Integer requestMem) {
                this.requestMem = requestMem;
                return this;
            }

            /**
             * The configuration information about the Server Load Balancer (SLB).
             */
            public Builder slbInfo(String slbInfo) {
                this.slbInfo = slbInfo;
                return this;
            }

            /**
             * The version of Apache Tomcat.
             */
            public Builder tomcatVersion(String tomcatVersion) {
                this.tomcatVersion = tomcatVersion;
                return this;
            }

            /**
             * The workload type. Valid values: Deployment and StatefulSet. If you do not specify this parameter, Deployment is used.
             */
            public Builder workloadType(String workloadType) {
                this.workloadType = workloadType;
                return this;
            }

            public App build() {
                return new App(this);
            } 

        } 

    }
    public static class Conf extends TeaModel {
        @NameInMap("Affinity")
        private String affinity;

        @NameInMap("AhasEnabled")
        private Boolean ahasEnabled;

        @NameInMap("DeployAcrossNodes")
        private String deployAcrossNodes;

        @NameInMap("DeployAcrossZones")
        private String deployAcrossZones;

        @NameInMap("JarStartArgs")
        private String jarStartArgs;

        @NameInMap("JarStartOptions")
        private String jarStartOptions;

        @NameInMap("K8sCmd")
        private String k8sCmd;

        @NameInMap("K8sCmdArgs")
        private String k8sCmdArgs;

        @NameInMap("K8sLocalvolumeInfo")
        private String k8sLocalvolumeInfo;

        @NameInMap("K8sNasInfo")
        private String k8sNasInfo;

        @NameInMap("K8sVolumeInfo")
        private String k8sVolumeInfo;

        @NameInMap("Liveness")
        private String liveness;

        @NameInMap("PostStart")
        private String postStart;

        @NameInMap("PreStop")
        private String preStop;

        @NameInMap("Readiness")
        private String readiness;

        @NameInMap("RuntimeClassName")
        private String runtimeClassName;

        @NameInMap("Tolerations")
        private String tolerations;

        @NameInMap("UserBaseImageUrl")
        private String userBaseImageUrl;

        private Conf(Builder builder) {
            this.affinity = builder.affinity;
            this.ahasEnabled = builder.ahasEnabled;
            this.deployAcrossNodes = builder.deployAcrossNodes;
            this.deployAcrossZones = builder.deployAcrossZones;
            this.jarStartArgs = builder.jarStartArgs;
            this.jarStartOptions = builder.jarStartOptions;
            this.k8sCmd = builder.k8sCmd;
            this.k8sCmdArgs = builder.k8sCmdArgs;
            this.k8sLocalvolumeInfo = builder.k8sLocalvolumeInfo;
            this.k8sNasInfo = builder.k8sNasInfo;
            this.k8sVolumeInfo = builder.k8sVolumeInfo;
            this.liveness = builder.liveness;
            this.postStart = builder.postStart;
            this.preStop = builder.preStop;
            this.readiness = builder.readiness;
            this.runtimeClassName = builder.runtimeClassName;
            this.tolerations = builder.tolerations;
            this.userBaseImageUrl = builder.userBaseImageUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conf create() {
            return builder().build();
        }

        /**
         * @return affinity
         */
        public String getAffinity() {
            return this.affinity;
        }

        /**
         * @return ahasEnabled
         */
        public Boolean getAhasEnabled() {
            return this.ahasEnabled;
        }

        /**
         * @return deployAcrossNodes
         */
        public String getDeployAcrossNodes() {
            return this.deployAcrossNodes;
        }

        /**
         * @return deployAcrossZones
         */
        public String getDeployAcrossZones() {
            return this.deployAcrossZones;
        }

        /**
         * @return jarStartArgs
         */
        public String getJarStartArgs() {
            return this.jarStartArgs;
        }

        /**
         * @return jarStartOptions
         */
        public String getJarStartOptions() {
            return this.jarStartOptions;
        }

        /**
         * @return k8sCmd
         */
        public String getK8sCmd() {
            return this.k8sCmd;
        }

        /**
         * @return k8sCmdArgs
         */
        public String getK8sCmdArgs() {
            return this.k8sCmdArgs;
        }

        /**
         * @return k8sLocalvolumeInfo
         */
        public String getK8sLocalvolumeInfo() {
            return this.k8sLocalvolumeInfo;
        }

        /**
         * @return k8sNasInfo
         */
        public String getK8sNasInfo() {
            return this.k8sNasInfo;
        }

        /**
         * @return k8sVolumeInfo
         */
        public String getK8sVolumeInfo() {
            return this.k8sVolumeInfo;
        }

        /**
         * @return liveness
         */
        public String getLiveness() {
            return this.liveness;
        }

        /**
         * @return postStart
         */
        public String getPostStart() {
            return this.postStart;
        }

        /**
         * @return preStop
         */
        public String getPreStop() {
            return this.preStop;
        }

        /**
         * @return readiness
         */
        public String getReadiness() {
            return this.readiness;
        }

        /**
         * @return runtimeClassName
         */
        public String getRuntimeClassName() {
            return this.runtimeClassName;
        }

        /**
         * @return tolerations
         */
        public String getTolerations() {
            return this.tolerations;
        }

        /**
         * @return userBaseImageUrl
         */
        public String getUserBaseImageUrl() {
            return this.userBaseImageUrl;
        }

        public static final class Builder {
            private String affinity; 
            private Boolean ahasEnabled; 
            private String deployAcrossNodes; 
            private String deployAcrossZones; 
            private String jarStartArgs; 
            private String jarStartOptions; 
            private String k8sCmd; 
            private String k8sCmdArgs; 
            private String k8sLocalvolumeInfo; 
            private String k8sNasInfo; 
            private String k8sVolumeInfo; 
            private String liveness; 
            private String postStart; 
            private String preStop; 
            private String readiness; 
            private String runtimeClassName; 
            private String tolerations; 
            private String userBaseImageUrl; 

            /**
             * The affinity configuration of the pod.
             */
            public Builder affinity(String affinity) {
                this.affinity = affinity;
                return this;
            }

            /**
             * Indicates whether the application is connected to Application High Availability Service (AHAS).
             */
            public Builder ahasEnabled(Boolean ahasEnabled) {
                this.ahasEnabled = ahasEnabled;
                return this;
            }

            /**
             * Indicates whether the application instances are deployed across nodes.
             * <p>
             * 
             * *   Value `true` indicates that the application instances are deployed across nodes.
             * *   Other values indicate that the application instances are not deployed across nodes.
             */
            public Builder deployAcrossNodes(String deployAcrossNodes) {
                this.deployAcrossNodes = deployAcrossNodes;
                return this;
            }

            /**
             * Indicates whether the application instances are deployed across zones.
             * <p>
             * 
             * *   Value `true` indicates that the application instances are deployed across zones.
             * *   Other values indicate that the application instances are not deployed across zones.
             */
            public Builder deployAcrossZones(String deployAcrossZones) {
                this.deployAcrossZones = deployAcrossZones;
                return this;
            }

            /**
             * The startup parameters for a JAR application. This parameter is deprecated.
             */
            public Builder jarStartArgs(String jarStartArgs) {
                this.jarStartArgs = jarStartArgs;
                return this;
            }

            /**
             * The startup options for a JAR application. This parameter is deprecated.
             */
            public Builder jarStartOptions(String jarStartOptions) {
                this.jarStartOptions = jarStartOptions;
                return this;
            }

            /**
             * The startup command.
             */
            public Builder k8sCmd(String k8sCmd) {
                this.k8sCmd = k8sCmd;
                return this;
            }

            /**
             * The parameters of the startup command.
             */
            public Builder k8sCmdArgs(String k8sCmdArgs) {
                this.k8sCmdArgs = k8sCmdArgs;
                return this;
            }

            /**
             * The information about the local storage.
             */
            public Builder k8sLocalvolumeInfo(String k8sLocalvolumeInfo) {
                this.k8sLocalvolumeInfo = k8sLocalvolumeInfo;
                return this;
            }

            /**
             * The information about the Apsara File Storage NAS (NAS) storage.
             */
            public Builder k8sNasInfo(String k8sNasInfo) {
                this.k8sNasInfo = k8sNasInfo;
                return this;
            }

            /**
             * The information about the storage.
             */
            public Builder k8sVolumeInfo(String k8sVolumeInfo) {
                this.k8sVolumeInfo = k8sVolumeInfo;
                return this;
            }

            /**
             * The information about the liveness check on the container.
             */
            public Builder liveness(String liveness) {
                this.liveness = liveness;
                return this;
            }

            /**
             * The script executed after the container is started.
             */
            public Builder postStart(String postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * The script executed before the container is stopped.
             */
            public Builder preStop(String preStop) {
                this.preStop = preStop;
                return this;
            }

            /**
             * The information about the readiness check on the container.
             */
            public Builder readiness(String readiness) {
                this.readiness = readiness;
                return this;
            }

            /**
             * The type of the container runtime. This parameter is applicable only to clusters that use sandboxed containers.
             */
            public Builder runtimeClassName(String runtimeClassName) {
                this.runtimeClassName = runtimeClassName;
                return this;
            }

            /**
             * The scheduling tolerance configuration of the pod.
             */
            public Builder tolerations(String tolerations) {
                this.tolerations = tolerations;
                return this;
            }

            /**
             * The URL of the base image. If you use a custom Java Development Kit (JDK) runtime, you must specify this parameter.
             */
            public Builder userBaseImageUrl(String userBaseImageUrl) {
                this.userBaseImageUrl = userBaseImageUrl;
                return this;
            }

            public Conf build() {
                return new Conf(this);
            } 

        } 

    }
    public static class Components extends TeaModel {
        @NameInMap("ComponentId")
        private String componentId;

        @NameInMap("ComponentKey")
        private String componentKey;

        @NameInMap("Type")
        private String type;

        private Components(Builder builder) {
            this.componentId = builder.componentId;
            this.componentKey = builder.componentKey;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return componentId
         */
        public String getComponentId() {
            return this.componentId;
        }

        /**
         * @return componentKey
         */
        public String getComponentKey() {
            return this.componentKey;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String componentId; 
            private String componentKey; 
            private String type; 

            /**
             * The component ID.
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * The keyword that is included in the component name.
             */
            public Builder componentKey(String componentKey) {
                this.componentKey = componentKey;
                return this;
            }

            /**
             * The component type. Valid values:
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    public static class DeployGroupComponents extends TeaModel {
        @NameInMap("Components")
        private java.util.List < Components> components;

        private DeployGroupComponents(Builder builder) {
            this.components = builder.components;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployGroupComponents create() {
            return builder().build();
        }

        /**
         * @return components
         */
        public java.util.List < Components> getComponents() {
            return this.components;
        }

        public static final class Builder {
            private java.util.List < Components> components; 

            /**
             * Components.
             */
            public Builder components(java.util.List < Components> components) {
                this.components = components;
                return this;
            }

            public DeployGroupComponents build() {
                return new DeployGroupComponents(this);
            } 

        } 

    }
    public static class DeployGroup extends TeaModel {
        @NameInMap("Components")
        private DeployGroupComponents components;

        @NameInMap("Env")
        private String env;

        @NameInMap("EnvFrom")
        private String envFrom;

        private DeployGroup(Builder builder) {
            this.components = builder.components;
            this.env = builder.env;
            this.envFrom = builder.envFrom;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployGroup create() {
            return builder().build();
        }

        /**
         * @return components
         */
        public DeployGroupComponents getComponents() {
            return this.components;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return envFrom
         */
        public String getEnvFrom() {
            return this.envFrom;
        }

        public static final class Builder {
            private DeployGroupComponents components; 
            private String env; 
            private String envFrom; 

            /**
             * The information about the component.
             */
            public Builder components(DeployGroupComponents components) {
                this.components = components;
                return this;
            }

            /**
             * The environment variable. This parameter is different from the EnvList parameter. This parameter specifies the referenced configuration of the ConfigMap or Secret.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * The source of the environment variable.
             */
            public Builder envFrom(String envFrom) {
                this.envFrom = envFrom;
                return this;
            }

            public DeployGroup build() {
                return new DeployGroup(this);
            } 

        } 

    }
    public static class DeployGroups extends TeaModel {
        @NameInMap("DeployGroup")
        private java.util.List < DeployGroup> deployGroup;

        private DeployGroups(Builder builder) {
            this.deployGroup = builder.deployGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployGroups create() {
            return builder().build();
        }

        /**
         * @return deployGroup
         */
        public java.util.List < DeployGroup> getDeployGroup() {
            return this.deployGroup;
        }

        public static final class Builder {
            private java.util.List < DeployGroup> deployGroup; 

            /**
             * DeployGroup.
             */
            public Builder deployGroup(java.util.List < DeployGroup> deployGroup) {
                this.deployGroup = deployGroup;
                return this;
            }

            public DeployGroups build() {
                return new DeployGroups(this);
            } 

        } 

    }
    public static class ImageInfo extends TeaModel {
        @NameInMap("ImageUrl")
        private String imageUrl;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RepoId")
        private String repoId;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RepoNamespace")
        private String repoNamespace;

        @NameInMap("RepoOriginType")
        private String repoOriginType;

        @NameInMap("Tag")
        private String tag;

        private ImageInfo(Builder builder) {
            this.imageUrl = builder.imageUrl;
            this.regionId = builder.regionId;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.repoOriginType = builder.repoOriginType;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageInfo create() {
            return builder().build();
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespace
         */
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        /**
         * @return repoOriginType
         */
        public String getRepoOriginType() {
            return this.repoOriginType;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String imageUrl; 
            private String regionId; 
            private String repoId; 
            private String repoName; 
            private String repoNamespace; 
            private String repoOriginType; 
            private String tag; 

            /**
             * The URL of the image.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * The region ID of the image repository.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the image repository.
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * The name of the image repository.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * The namespace to which the image repository belongs.
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * The source type of the image repository.
             */
            public Builder repoOriginType(String repoOriginType) {
                this.repoOriginType = repoOriginType;
                return this;
            }

            /**
             * The tag of the image.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public ImageInfo build() {
                return new ImageInfo(this);
            } 

        } 

    }
    public static class LatestVersion extends TeaModel {
        @NameInMap("PackageVersion")
        private String packageVersion;

        @NameInMap("Url")
        private String url;

        @NameInMap("WarUrl")
        private String warUrl;

        private LatestVersion(Builder builder) {
            this.packageVersion = builder.packageVersion;
            this.url = builder.url;
            this.warUrl = builder.warUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatestVersion create() {
            return builder().build();
        }

        /**
         * @return packageVersion
         */
        public String getPackageVersion() {
            return this.packageVersion;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return warUrl
         */
        public String getWarUrl() {
            return this.warUrl;
        }

        public static final class Builder {
            private String packageVersion; 
            private String url; 
            private String warUrl; 

            /**
             * The version of the deployment package.
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * The URL of the deployment package. This parameter is required if you use a FatJar or WAR package to deploy the application.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * The URL of the deployment package. This parameter is required if you use a FatJar or WAR package to deploy the application.
             */
            public Builder warUrl(String warUrl) {
                this.warUrl = warUrl;
                return this;
            }

            public LatestVersion build() {
                return new LatestVersion(this);
            } 

        } 

    }
    public static class Applcation extends TeaModel {
        @NameInMap("App")
        private App app;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("Conf")
        private Conf conf;

        @NameInMap("DeployGroups")
        private DeployGroups deployGroups;

        @NameInMap("ImageInfo")
        private ImageInfo imageInfo;

        @NameInMap("LatestVersion")
        private LatestVersion latestVersion;

        private Applcation(Builder builder) {
            this.app = builder.app;
            this.appId = builder.appId;
            this.conf = builder.conf;
            this.deployGroups = builder.deployGroups;
            this.imageInfo = builder.imageInfo;
            this.latestVersion = builder.latestVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applcation create() {
            return builder().build();
        }

        /**
         * @return app
         */
        public App getApp() {
            return this.app;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return conf
         */
        public Conf getConf() {
            return this.conf;
        }

        /**
         * @return deployGroups
         */
        public DeployGroups getDeployGroups() {
            return this.deployGroups;
        }

        /**
         * @return imageInfo
         */
        public ImageInfo getImageInfo() {
            return this.imageInfo;
        }

        /**
         * @return latestVersion
         */
        public LatestVersion getLatestVersion() {
            return this.latestVersion;
        }

        public static final class Builder {
            private App app; 
            private String appId; 
            private Conf conf; 
            private DeployGroups deployGroups; 
            private ImageInfo imageInfo; 
            private LatestVersion latestVersion; 

            /**
             * The basic information about the application.
             */
            public Builder app(App app) {
                this.app = app;
                return this;
            }

            /**
             * The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The configurations.
             */
            public Builder conf(Conf conf) {
                this.conf = conf;
                return this;
            }

            /**
             * The information about the instance group in which the application is deployed.
             */
            public Builder deployGroups(DeployGroups deployGroups) {
                this.deployGroups = deployGroups;
                return this;
            }

            /**
             * The information about the image.
             */
            public Builder imageInfo(ImageInfo imageInfo) {
                this.imageInfo = imageInfo;
                return this;
            }

            /**
             * The information about the latest version.
             */
            public Builder latestVersion(LatestVersion latestVersion) {
                this.latestVersion = latestVersion;
                return this;
            }

            public Applcation build() {
                return new Applcation(this);
            } 

        } 

    }
}
