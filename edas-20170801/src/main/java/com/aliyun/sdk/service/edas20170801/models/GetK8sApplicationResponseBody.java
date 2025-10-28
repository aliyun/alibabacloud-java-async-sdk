// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetK8sApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetK8sApplicationResponseBody</p>
 */
public class GetK8sApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applcation")
    private Applcation applcation;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetK8sApplicationResponseBody model) {
            this.applcation = model.applcation;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the application.</p>
         */
        public Builder applcation(Applcation applcation) {
            this.applcation = applcation;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1053-08e4-47a5-b2ab-5c0323de7b5a</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetK8sApplicationResponseBody build() {
            return new GetK8sApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetK8sApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sApplicationResponseBody</p>
     */
    public static class CmdArgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CmdArg")
        private java.util.List<String> cmdArg;

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
        public java.util.List<String> getCmdArg() {
            return this.cmdArg;
        }

        public static final class Builder {
            private java.util.List<String> cmdArg; 

            private Builder() {
            } 

            private Builder(CmdArgs model) {
                this.cmdArg = model.cmdArg;
            } 

            /**
             * CmdArg.
             */
            public Builder cmdArg(java.util.List<String> cmdArg) {
                this.cmdArg = cmdArg;
                return this;
            }

            public CmdArgs build() {
                return new CmdArgs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetK8sApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sApplicationResponseBody</p>
     */
    public static class Env extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Env model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>CATALINA_OPTS</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>-Xmx 1024m -Dhsf.default.tid=false $(EDAS_CATALINA_OPTS)</p>
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
    /**
     * 
     * {@link GetK8sApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sApplicationResponseBody</p>
     */
    public static class EnvList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Env")
        private java.util.List<Env> env;

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
        public java.util.List<Env> getEnv() {
            return this.env;
        }

        public static final class Builder {
            private java.util.List<Env> env; 

            private Builder() {
            } 

            private Builder(EnvList model) {
                this.env = model.env;
            } 

            /**
             * Env.
             */
            public Builder env(java.util.List<Env> env) {
                this.env = env;
                return this;
            }

            public EnvList build() {
                return new EnvList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetK8sApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sApplicationResponseBody</p>
     */
    public static class App extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Annotations")
        private String annotations;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ApplicationType")
        private String applicationType;

        @com.aliyun.core.annotation.NameInMap("BuildpackId")
        private Integer buildpackId;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Cmd")
        private String cmd;

        @com.aliyun.core.annotation.NameInMap("CmdArgs")
        private CmdArgs cmdArgs;

        @com.aliyun.core.annotation.NameInMap("CsClusterId")
        private String csClusterId;

        @com.aliyun.core.annotation.NameInMap("DeployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("DevelopType")
        private String developType;

        @com.aliyun.core.annotation.NameInMap("EdasContainerVersion")
        private String edasContainerVersion;

        @com.aliyun.core.annotation.NameInMap("EnableEmptyPushReject")
        private Boolean enableEmptyPushReject;

        @com.aliyun.core.annotation.NameInMap("EnableLosslessRule")
        private Boolean enableLosslessRule;

        @com.aliyun.core.annotation.NameInMap("EnvList")
        private EnvList envList;

        @com.aliyun.core.annotation.NameInMap("FeatureAnnotations")
        private String featureAnnotations;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private Integer instances;

        @com.aliyun.core.annotation.NameInMap("InstancesBeforeScaling")
        private Integer instancesBeforeScaling;

        @com.aliyun.core.annotation.NameInMap("K8sNamespace")
        private String k8sNamespace;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("LimitCpuM")
        private Integer limitCpuM;

        @com.aliyun.core.annotation.NameInMap("LimitEphemeralStorage")
        private String limitEphemeralStorage;

        @com.aliyun.core.annotation.NameInMap("LimitMem")
        private Integer limitMem;

        @com.aliyun.core.annotation.NameInMap("LosslessRuleAligned")
        private Boolean losslessRuleAligned;

        @com.aliyun.core.annotation.NameInMap("LosslessRuleDelayTime")
        private Integer losslessRuleDelayTime;

        @com.aliyun.core.annotation.NameInMap("LosslessRuleFuncType")
        private Integer losslessRuleFuncType;

        @com.aliyun.core.annotation.NameInMap("LosslessRuleRelated")
        private Boolean losslessRuleRelated;

        @com.aliyun.core.annotation.NameInMap("LosslessRuleWarmupTime")
        private Integer losslessRuleWarmupTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RequestCpuM")
        private Integer requestCpuM;

        @com.aliyun.core.annotation.NameInMap("RequestEphemeralStorage")
        private String requestEphemeralStorage;

        @com.aliyun.core.annotation.NameInMap("RequestMem")
        private Integer requestMem;

        @com.aliyun.core.annotation.NameInMap("SlbInfo")
        private String slbInfo;

        @com.aliyun.core.annotation.NameInMap("TomcatVersion")
        private String tomcatVersion;

        @com.aliyun.core.annotation.NameInMap("WorkloadType")
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

            private Builder() {
            } 

            private Builder(App model) {
                this.annotations = model.annotations;
                this.appId = model.appId;
                this.applicationName = model.applicationName;
                this.applicationType = model.applicationType;
                this.buildpackId = model.buildpackId;
                this.clusterId = model.clusterId;
                this.cmd = model.cmd;
                this.cmdArgs = model.cmdArgs;
                this.csClusterId = model.csClusterId;
                this.deployType = model.deployType;
                this.developType = model.developType;
                this.edasContainerVersion = model.edasContainerVersion;
                this.enableEmptyPushReject = model.enableEmptyPushReject;
                this.enableLosslessRule = model.enableLosslessRule;
                this.envList = model.envList;
                this.featureAnnotations = model.featureAnnotations;
                this.instances = model.instances;
                this.instancesBeforeScaling = model.instancesBeforeScaling;
                this.k8sNamespace = model.k8sNamespace;
                this.labels = model.labels;
                this.limitCpuM = model.limitCpuM;
                this.limitEphemeralStorage = model.limitEphemeralStorage;
                this.limitMem = model.limitMem;
                this.losslessRuleAligned = model.losslessRuleAligned;
                this.losslessRuleDelayTime = model.losslessRuleDelayTime;
                this.losslessRuleFuncType = model.losslessRuleFuncType;
                this.losslessRuleRelated = model.losslessRuleRelated;
                this.losslessRuleWarmupTime = model.losslessRuleWarmupTime;
                this.regionId = model.regionId;
                this.requestCpuM = model.requestCpuM;
                this.requestEphemeralStorage = model.requestEphemeralStorage;
                this.requestMem = model.requestMem;
                this.slbInfo = model.slbInfo;
                this.tomcatVersion = model.tomcatVersion;
                this.workloadType = model.workloadType;
            } 

            /**
             * <p>The annotation of an application pod.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;test-annokey&quot;:&quot;test-annovalue&quot;}</p>
             */
            public Builder annotations(String annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>00ee517d-dd7d-4d4e-<strong><strong>-</strong></strong></p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The type of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>War</p>
             */
            public Builder applicationType(String applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * <p>The build package number of Enterprise Distributed Application Service (EDAS) Container.</p>
             * 
             * <strong>example:</strong>
             * <p>57</p>
             */
            public Builder buildpackId(Integer buildpackId) {
                this.buildpackId = buildpackId;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c37aec2a-bcca-4ec1-<strong><strong>-</strong></strong></p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The startup command.</p>
             * 
             * <strong>example:</strong>
             * <p>ls</p>
             */
            public Builder cmd(String cmd) {
                this.cmd = cmd;
                return this;
            }

            /**
             * <p>The list of commands.</p>
             */
            public Builder cmdArgs(CmdArgs cmdArgs) {
                this.cmdArgs = cmdArgs;
                return this;
            }

            /**
             * <p>The ID of the cluster to which the container belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>c383bc813c1974e<strong><strong>451b50c0c8</strong></strong></p>
             */
            public Builder csClusterId(String csClusterId) {
                this.csClusterId = csClusterId;
                return this;
            }

            /**
             * <p>The deployment type of the application. Example: Image.</p>
             * 
             * <strong>example:</strong>
             * <p>Image</p>
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * <p>The application type. Valid values:</p>
             * <ul>
             * <li>General: native Java application</li>
             * <li>Pandora: Pandora application</li>
             * <li>Multilingual: multilingual application</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>General</p>
             */
            public Builder developType(String developType) {
                this.developType = developType;
                return this;
            }

            /**
             * <p>The version of EDAS Container.</p>
             * 
             * <strong>example:</strong>
             * <p>3.60.0</p>
             */
            public Builder edasContainerVersion(String edasContainerVersion) {
                this.edasContainerVersion = edasContainerVersion;
                return this;
            }

            /**
             * <p>Indicates whether the Empty List Protection feature is enabled for the application.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableEmptyPushReject(Boolean enableEmptyPushReject) {
                this.enableEmptyPushReject = enableEmptyPushReject;
                return this;
            }

            /**
             * <p>Indicates whether the Graceful Release feature is enabled for the application.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableLosslessRule(Boolean enableLosslessRule) {
                this.enableLosslessRule = enableLosslessRule;
                return this;
            }

            /**
             * <p>The list of environment variables.</p>
             */
            public Builder envList(EnvList envList) {
                this.envList = envList;
                return this;
            }

            /**
             * <p>The feature annotations. Possible values:</p>
             * <ul>
             * <li>base.combination.edas: enables EDAS integrated management solution.</li>
             * <li>base.combination.arms: enables ARMS monitoring.</li>
             * <li>base.combination.mse: enables MSE microservices governance.</li>
             * <li>base.combination.none: enables lifecycle management.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>base.combination.edas</p>
             */
            public Builder featureAnnotations(String featureAnnotations) {
                this.featureAnnotations = featureAnnotations;
                return this;
            }

            /**
             * <p>The number of application instances.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder instances(Integer instances) {
                this.instances = instances;
                return this;
            }

            /**
             * <p>The number of application instances before the last auto scaling operation.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder instancesBeforeScaling(Integer instancesBeforeScaling) {
                this.instancesBeforeScaling = instancesBeforeScaling;
                return this;
            }

            /**
             * <p>The namespace of the Kubernetes cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder k8sNamespace(String k8sNamespace) {
                this.k8sNamespace = k8sNamespace;
                return this;
            }

            /**
             * <p>The label of an application pod.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;test-labelkey&quot;:&quot;test-labelvalue&quot;}</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The maximum number of CPU cores allowed. Unit: millicores. 1,000 millicores equal one CPU core.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder limitCpuM(Integer limitCpuM) {
                this.limitCpuM = limitCpuM;
                return this;
            }

            /**
             * <p>The maximum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the space size.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder limitEphemeralStorage(String limitEphemeralStorage) {
                this.limitEphemeralStorage = limitEphemeralStorage;
                return this;
            }

            /**
             * <p>The maximum size of the memory allowed. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder limitMem(Integer limitMem) {
                this.limitMem = limitMem;
                return this;
            }

            /**
             * <p>Indicates whether the Graceful Rolling Release and Configure Complete Service Registration before Readiness Probing feature is enabled for the application.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder losslessRuleAligned(Boolean losslessRuleAligned) {
                this.losslessRuleAligned = losslessRuleAligned;
                return this;
            }

            /**
             * <p>The delay of service registration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder losslessRuleDelayTime(Integer losslessRuleDelayTime) {
                this.losslessRuleDelayTime = losslessRuleDelayTime;
                return this;
            }

            /**
             * <p>The number of prefetching curves.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder losslessRuleFuncType(Integer losslessRuleFuncType) {
                this.losslessRuleFuncType = losslessRuleFuncType;
                return this;
            }

            /**
             * <p>Indicates whether the Graceful Rolling Release and Configure Complete Service Prefetching before Readiness Probing feature is enabled for the application.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder losslessRuleRelated(Boolean losslessRuleRelated) {
                this.losslessRuleRelated = losslessRuleRelated;
                return this;
            }

            /**
             * <p>The service prefetching duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder losslessRuleWarmupTime(Integer losslessRuleWarmupTime) {
                this.losslessRuleWarmupTime = losslessRuleWarmupTime;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of requested CPU cores. Unit: millicores. 1,000 millicores equal one CPU core.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder requestCpuM(Integer requestCpuM) {
                this.requestCpuM = requestCpuM;
                return this;
            }

            /**
             * <p>The size of space reserved for ephemeral storage resources. Unit: GB. Value 0 indicates that no limit is set on the space size.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder requestEphemeralStorage(String requestEphemeralStorage) {
                this.requestEphemeralStorage = requestEphemeralStorage;
                return this;
            }

            /**
             * <p>The size of the reserved memory. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder requestMem(Integer requestMem) {
                this.requestMem = requestMem;
                return this;
            }

            /**
             * <p>The configuration information about the Server Load Balancer (SLB).</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *   {
             *     &quot;addressType&quot;: &quot;intranet&quot;,
             *     &quot;externalTrafficPolicy&quot;: &quot;Local&quot;,
             *     &quot;ip&quot;: &quot;192.168.254.<em><strong>&quot;,
             *     &quot;name&quot;: &quot;intranet-testapp&quot;,
             *     &quot;portMappings&quot;: [
             *       {
             *         &quot;loadBalancerProtocol&quot;: &quot;TCP&quot;,
             *         &quot;servicePort&quot;: {
             *           &quot;port&quot;: 8080,
             *           &quot;protocol&quot;: &quot;TCP&quot;,
             *           &quot;targetPort&quot;: 18081,
             *           &quot;vServerGroupName&quot;: &quot;k8s/31414/intranet-testapp/default/cc90e0c9508a44667bdae2e83d3</strong></em><em><strong>&quot;
             *         }
             *       }
             *     ],
             *     &quot;scheduler&quot;: &quot;rr&quot;,
             *     &quot;serviceType&quot;: &quot;LoadBalancer&quot;,
             *     &quot;slbId&quot;: &quot;lb-bp1ikoh3nrpgqsm</strong></em>***&quot;,
             *     &quot;source&quot;: &quot;create&quot;,
             *     &quot;specification&quot;: &quot;slb.s3.large&quot;
             *   }
             * ]</p>
             */
            public Builder slbInfo(String slbInfo) {
                this.slbInfo = slbInfo;
                return this;
            }

            /**
             * <p>The version of Apache Tomcat.</p>
             * 
             * <strong>example:</strong>
             * <p>8.5.55</p>
             */
            public Builder tomcatVersion(String tomcatVersion) {
                this.tomcatVersion = tomcatVersion;
                return this;
            }

            /**
             * <p>The workload type. Valid values: Deployment and StatefulSet. If you do not specify this parameter, Deployment is used.</p>
             * 
             * <strong>example:</strong>
             * <p>Deployment</p>
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
    /**
     * 
     * {@link GetK8sApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sApplicationResponseBody</p>
     */
    public static class Conf extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Affinity")
        private String affinity;

        @com.aliyun.core.annotation.NameInMap("AhasEnabled")
        private Boolean ahasEnabled;

        @com.aliyun.core.annotation.NameInMap("DeployAcrossNodes")
        private String deployAcrossNodes;

        @com.aliyun.core.annotation.NameInMap("DeployAcrossZones")
        private String deployAcrossZones;

        @com.aliyun.core.annotation.NameInMap("JarStartArgs")
        private String jarStartArgs;

        @com.aliyun.core.annotation.NameInMap("JarStartOptions")
        private String jarStartOptions;

        @com.aliyun.core.annotation.NameInMap("K8sCmd")
        private String k8sCmd;

        @com.aliyun.core.annotation.NameInMap("K8sCmdArgs")
        private String k8sCmdArgs;

        @com.aliyun.core.annotation.NameInMap("K8sLocalvolumeInfo")
        private String k8sLocalvolumeInfo;

        @com.aliyun.core.annotation.NameInMap("K8sNasInfo")
        private String k8sNasInfo;

        @com.aliyun.core.annotation.NameInMap("K8sVolumeInfo")
        private String k8sVolumeInfo;

        @com.aliyun.core.annotation.NameInMap("Liveness")
        private String liveness;

        @com.aliyun.core.annotation.NameInMap("PostStart")
        private String postStart;

        @com.aliyun.core.annotation.NameInMap("PreStop")
        private String preStop;

        @com.aliyun.core.annotation.NameInMap("Readiness")
        private String readiness;

        @com.aliyun.core.annotation.NameInMap("RuntimeClassName")
        private String runtimeClassName;

        @com.aliyun.core.annotation.NameInMap("Tolerations")
        private String tolerations;

        @com.aliyun.core.annotation.NameInMap("UserBaseImageUrl")
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

            private Builder() {
            } 

            private Builder(Conf model) {
                this.affinity = model.affinity;
                this.ahasEnabled = model.ahasEnabled;
                this.deployAcrossNodes = model.deployAcrossNodes;
                this.deployAcrossZones = model.deployAcrossZones;
                this.jarStartArgs = model.jarStartArgs;
                this.jarStartOptions = model.jarStartOptions;
                this.k8sCmd = model.k8sCmd;
                this.k8sCmdArgs = model.k8sCmdArgs;
                this.k8sLocalvolumeInfo = model.k8sLocalvolumeInfo;
                this.k8sNasInfo = model.k8sNasInfo;
                this.k8sVolumeInfo = model.k8sVolumeInfo;
                this.liveness = model.liveness;
                this.postStart = model.postStart;
                this.preStop = model.preStop;
                this.readiness = model.readiness;
                this.runtimeClassName = model.runtimeClassName;
                this.tolerations = model.tolerations;
                this.userBaseImageUrl = model.userBaseImageUrl;
            } 

            /**
             * <p>The affinity configuration of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{&quot;nodeAffinity&quot;:{&quot;requiredDuringSchedulingIgnoredDuringExecution&quot;:{&quot;nodeSelectorTerms&quot;:[{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;beta.kubernetes.io/arch&quot;,&quot;operator&quot;:&quot;NotIn&quot;,&quot;values&quot;:[&quot;arm64&quot;,&quot;arm32&quot;]}]}]},&quot;preferredDuringSchedulingIgnoredDuringExecution&quot;:[{&quot;weight&quot;:5,&quot;preference&quot;:{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;kubernetes.io/os&quot;,&quot;operator&quot;:&quot;In&quot;,&quot;values&quot;:[&quot;linux&quot;]}]}}]},&quot;podAffinity&quot;:{&quot;requiredDuringSchedulingIgnoredDuringExecution&quot;:[{&quot;labelSelector&quot;:{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;edas.oam.acname&quot;,&quot;operator&quot;:&quot;NotIn&quot;,&quot;values&quot;:[&quot;edas-test-app&quot;]}]},&quot;namespaces&quot;:[&quot;default&quot;],&quot;topologyKey&quot;:&quot;kubernetes.io/hostname&quot;}]},&quot;podAntiAffinity&quot;:{&quot;preferredDuringSchedulingIgnoredDuringExecution&quot;:[{&quot;weight&quot;:15,&quot;podAffinityTerm&quot;:{&quot;labelSelector&quot;:{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;edas.oam.acname&quot;,&quot;operator&quot;:&quot;In&quot;,&quot;values&quot;:[&quot;edas-test-app-2&quot;]}]},&quot;namespaces&quot;:[&quot;default&quot;],&quot;topologyKey&quot;:&quot;failure-domain.beta.kubernetes.io/zone&quot;}}]}}&quot;</p>
             */
            public Builder affinity(String affinity) {
                this.affinity = affinity;
                return this;
            }

            /**
             * <p>Indicates whether the application is connected to Application High Availability Service (AHAS).</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ahasEnabled(Boolean ahasEnabled) {
                this.ahasEnabled = ahasEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the application instances are deployed across nodes.</p>
             * <ul>
             * <li>Value <code>true</code> indicates that the application instances are deployed across nodes.</li>
             * <li>Other values indicate that the application instances are not deployed across nodes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deployAcrossNodes(String deployAcrossNodes) {
                this.deployAcrossNodes = deployAcrossNodes;
                return this;
            }

            /**
             * <p>Indicates whether the application instances are deployed across zones.</p>
             * <ul>
             * <li>Value <code>true</code> indicates that the application instances are deployed across zones.</li>
             * <li>Other values indicate that the application instances are not deployed across zones.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deployAcrossZones(String deployAcrossZones) {
                this.deployAcrossZones = deployAcrossZones;
                return this;
            }

            /**
             * <p>The startup parameters for a JAR application. This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>-lh</p>
             */
            public Builder jarStartArgs(String jarStartArgs) {
                this.jarStartArgs = jarStartArgs;
                return this;
            }

            /**
             * <p>The startup options for a JAR application. This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>-h</p>
             */
            public Builder jarStartOptions(String jarStartOptions) {
                this.jarStartOptions = jarStartOptions;
                return this;
            }

            /**
             * <p>The startup command.</p>
             * 
             * <strong>example:</strong>
             * <p>ls</p>
             */
            public Builder k8sCmd(String k8sCmd) {
                this.k8sCmd = k8sCmd;
                return this;
            }

            /**
             * <p>The parameters of the startup command.</p>
             * 
             * <strong>example:</strong>
             * <p>-lh</p>
             */
            public Builder k8sCmdArgs(String k8sCmdArgs) {
                this.k8sCmdArgs = k8sCmdArgs;
                return this;
            }

            /**
             * <p>The information about the local storage.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;type&quot;:&quot;&quot;,&quot;nodePath&quot;:&quot;/mnt/&quot;,&quot;mountPath&quot;:&quot;/mnt/&quot;}]</p>
             */
            public Builder k8sLocalvolumeInfo(String k8sLocalvolumeInfo) {
                this.k8sLocalvolumeInfo = k8sLocalvolumeInfo;
                return this;
            }

            /**
             * <p>The information about the File Storage NAS (NAS) storage.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;nasPath&quot;:&quot;/mnt/&quot;,&quot;mountPath&quot;:&quot;/mnt/&quot;}]</p>
             */
            public Builder k8sNasInfo(String k8sNasInfo) {
                this.k8sNasInfo = k8sNasInfo;
                return this;
            }

            /**
             * <p>The information about the storage.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{&quot;hostPaths&quot;:&quot;[]&quot;,&quot;emptyDirs&quot;:&quot;[]&quot;}&quot;</p>
             */
            public Builder k8sVolumeInfo(String k8sVolumeInfo) {
                this.k8sVolumeInfo = k8sVolumeInfo;
                return this;
            }

            /**
             * <p>The information about the liveness check on the container.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</p>
             */
            public Builder liveness(String liveness) {
                this.liveness = liveness;
                return this;
            }

            /**
             * <p>The script executed after the container is started.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;ls&quot;,&quot;/&quot;]}}&quot;</p>
             */
            public Builder postStart(String postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * <p>The script executed before the container is stopped.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;ls&quot;,&quot;/&quot;]}}&quot;</p>
             */
            public Builder preStop(String preStop) {
                this.preStop = preStop;
                return this;
            }

            /**
             * <p>The information about the readiness check on the container.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;httpGet&quot;: {&quot;path&quot;: &quot;/consumer&quot;,&quot;port&quot;: 8080,&quot;scheme&quot;: &quot;HTTP&quot;,&quot;httpHeaders&quot;: [{&quot;name&quot;: &quot;test&quot;,&quot;value&quot;: &quot;testvalue&quot;}]}}</p>
             */
            public Builder readiness(String readiness) {
                this.readiness = readiness;
                return this;
            }

            /**
             * <p>The type of the container runtime. This parameter is applicable only to clusters that use sandboxed containers.</p>
             * 
             * <strong>example:</strong>
             * <p>runc</p>
             */
            public Builder runtimeClassName(String runtimeClassName) {
                this.runtimeClassName = runtimeClassName;
                return this;
            }

            /**
             * <p>The scheduling tolerance configuration of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;[{&quot;key&quot;:&quot;edas-taint-key2&quot;,&quot;operator&quot;:&quot;Exists&quot;,&quot;effect&quot;:&quot;NoExecute&quot;,&quot;tolerationSeconds&quot;:50},{&quot;key&quot;:&quot;edas-taint-key&quot;,&quot;operator&quot;:&quot;Equal&quot;,&quot;value&quot;:&quot;edas-taint-value&quot;,&quot;effect&quot;:&quot;PreferNoSchedule&quot;}]&quot;</p>
             */
            public Builder tolerations(String tolerations) {
                this.tolerations = tolerations;
                return this;
            }

            /**
             * <p>The URL of the base image. If you use a custom Java Development Kit (JDK) runtime, you must specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>openjdk:8u302</p>
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
    /**
     * 
     * {@link GetK8sApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sApplicationResponseBody</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentId")
        private String componentId;

        @com.aliyun.core.annotation.NameInMap("ComponentKey")
        private String componentKey;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(Components model) {
                this.componentId = model.componentId;
                this.componentKey = model.componentKey;
                this.type = model.type;
            } 

            /**
             * <p>The component ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * <p>The keyword that is included in the component name.</p>
             * 
             * <strong>example:</strong>
             * <p>Open JDK 8</p>
             */
            public Builder componentKey(String componentKey) {
                this.componentKey = componentKey;
                return this;
            }

            /**
             * <p>The component type. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>JDK</p>
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
    /**
     * 
     * {@link GetK8sApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sApplicationResponseBody</p>
     */
    public static class DeployGroupComponents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Components")
        private java.util.List<Components> components;

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
        public java.util.List<Components> getComponents() {
            return this.components;
        }

        public static final class Builder {
            private java.util.List<Components> components; 

            private Builder() {
            } 

            private Builder(DeployGroupComponents model) {
                this.components = model.components;
            } 

            /**
             * Components.
             */
            public Builder components(java.util.List<Components> components) {
                this.components = components;
                return this;
            }

            public DeployGroupComponents build() {
                return new DeployGroupComponents(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetK8sApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sApplicationResponseBody</p>
     */
    public static class DeployGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Components")
        private DeployGroupComponents components;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("EnvFrom")
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

            private Builder() {
            } 

            private Builder(DeployGroup model) {
                this.components = model.components;
                this.env = model.env;
                this.envFrom = model.envFrom;
            } 

            /**
             * <p>The information about the component.</p>
             */
            public Builder components(DeployGroupComponents components) {
                this.components = components;
                return this;
            }

            /**
             * <p>The environment variable. This parameter is different from the EnvList parameter. This parameter specifies the referenced configuration of the ConfigMap or Secret.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;[&quot;{&quot;name&quot;:&quot;test1&quot;,&quot;valueFrom&quot;:{&quot;configMapKeyRef&quot;:{&quot;name&quot;:&quot;edas-demo-configmap&quot;,&quot;key&quot;:&quot;key1&quot;}}}&quot;,&quot;{&quot;name&quot;:&quot;k2&quot;,&quot;value&quot;:&quot;v2&quot;}&quot;,&quot;{&quot;name&quot;:&quot;s1&quot;,&quot;valueFrom&quot;:{&quot;secretKeyRef&quot;:{&quot;name&quot;:&quot;edas-demo-secret&quot;,&quot;key&quot;:&quot;k1&quot;}}}&quot;]&quot;</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>The source of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;configMapRef&quot;:{&quot;name&quot;:&quot;test-cm&quot;}}]</p>
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
    /**
     * 
     * {@link GetK8sApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sApplicationResponseBody</p>
     */
    public static class DeployGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeployGroup")
        private java.util.List<DeployGroup> deployGroup;

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
        public java.util.List<DeployGroup> getDeployGroup() {
            return this.deployGroup;
        }

        public static final class Builder {
            private java.util.List<DeployGroup> deployGroup; 

            private Builder() {
            } 

            private Builder(DeployGroups model) {
                this.deployGroup = model.deployGroup;
            } 

            /**
             * DeployGroup.
             */
            public Builder deployGroup(java.util.List<DeployGroup> deployGroup) {
                this.deployGroup = deployGroup;
                return this;
            }

            public DeployGroups build() {
                return new DeployGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetK8sApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sApplicationResponseBody</p>
     */
    public static class ImageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespace")
        private String repoNamespace;

        @com.aliyun.core.annotation.NameInMap("RepoOriginType")
        private String repoOriginType;

        @com.aliyun.core.annotation.NameInMap("Tag")
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

            private Builder() {
            } 

            private Builder(ImageInfo model) {
                this.imageUrl = model.imageUrl;
                this.regionId = model.regionId;
                this.repoId = model.repoId;
                this.repoName = model.repoName;
                this.repoNamespace = model.repoNamespace;
                this.repoOriginType = model.repoOriginType;
                this.tag = model.tag;
            } 

            /**
             * <p>The URL of the image.</p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The region ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>131****067006888_shared_repo</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The namespace to which the image repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>edas-server****-user</p>
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * <p>The source type of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>ALI_HUB</p>
             */
            public Builder repoOriginType(String repoOriginType) {
                this.repoOriginType = repoOriginType;
                return this;
            }

            /**
             * <p>The tag of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>5a166fbd-9d76-4f98-****-781659d9f54c_1572485443282</p>
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
    /**
     * 
     * {@link GetK8sApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sApplicationResponseBody</p>
     */
    public static class LatestVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PackageVersion")
        private String packageVersion;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("WarUrl")
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

            private Builder() {
            } 

            private Builder(LatestVersion model) {
                this.packageVersion = model.packageVersion;
                this.url = model.url;
                this.warUrl = model.warUrl;
            } 

            /**
             * <p>The version of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>20200720</p>
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * <p>The URL of the deployment package. This parameter is required if you use a FatJar or WAR package to deploy the application.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://e***.oss-cn-beijing.aliyuncs.com/s***-1.0-SNAPSHOT-spring-boot.jar">https://e***.oss-cn-beijing.aliyuncs.com/s***-1.0-SNAPSHOT-spring-boot.jar</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The URL of the deployment package. This parameter is required if you use a FatJar or WAR package to deploy the application.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://e***.oss-cn-beijing.aliyuncs.com/s***-1.0-SNAPSHOT-spring-boot.jar">https://e***.oss-cn-beijing.aliyuncs.com/s***-1.0-SNAPSHOT-spring-boot.jar</a></p>
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
    /**
     * 
     * {@link GetK8sApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sApplicationResponseBody</p>
     */
    public static class Applcation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("App")
        private App app;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Conf")
        private Conf conf;

        @com.aliyun.core.annotation.NameInMap("DeployGroups")
        private DeployGroups deployGroups;

        @com.aliyun.core.annotation.NameInMap("ImageInfo")
        private ImageInfo imageInfo;

        @com.aliyun.core.annotation.NameInMap("LatestVersion")
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

            private Builder() {
            } 

            private Builder(Applcation model) {
                this.app = model.app;
                this.appId = model.appId;
                this.conf = model.conf;
                this.deployGroups = model.deployGroups;
                this.imageInfo = model.imageInfo;
                this.latestVersion = model.latestVersion;
            } 

            /**
             * <p>The basic information about the application.</p>
             */
            public Builder app(App app) {
                this.app = app;
                return this;
            }

            /**
             * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>a5281053-<strong><strong>-47a5-b2ab-5c0323de</strong></strong></p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The configurations.</p>
             */
            public Builder conf(Conf conf) {
                this.conf = conf;
                return this;
            }

            /**
             * <p>The information about the instance group in which the application is deployed.</p>
             */
            public Builder deployGroups(DeployGroups deployGroups) {
                this.deployGroups = deployGroups;
                return this;
            }

            /**
             * <p>The information about the image.</p>
             */
            public Builder imageInfo(ImageInfo imageInfo) {
                this.imageInfo = imageInfo;
                return this;
            }

            /**
             * <p>The information about the latest version.</p>
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
