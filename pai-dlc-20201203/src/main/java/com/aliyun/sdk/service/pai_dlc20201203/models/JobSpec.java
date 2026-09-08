// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link JobSpec} extends {@link TeaModel}
 *
 * <p>JobSpec</p>
 */
public class JobSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssignNodeSpec")
    private AssignNodeSpec assignNodeSpec;

    @com.aliyun.core.annotation.NameInMap("AutoScalingSpec")
    private AutoScalingSpec autoScalingSpec;

    @com.aliyun.core.annotation.NameInMap("ConsiderInSuccessPolicy")
    private Boolean considerInSuccessPolicy;

    @com.aliyun.core.annotation.NameInMap("Driver")
    private String driver;

    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private String ecsSpec;

    @com.aliyun.core.annotation.NameInMap("ElasticSpotSpecs")
    private java.util.List<ElasticSpotSpec> elasticSpotSpecs;

    @com.aliyun.core.annotation.NameInMap("ExtraPodSpec")
    private ExtraPodSpec extraPodSpec;

    @com.aliyun.core.annotation.NameInMap("HyperNodeSchedulingConfig")
    private HyperNodeSchedulingConfig hyperNodeSchedulingConfig;

    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("ImageConfig")
    private ImageConfig imageConfig;

    @com.aliyun.core.annotation.NameInMap("IsCheif")
    @Deprecated
    private Boolean isCheif;

    @com.aliyun.core.annotation.NameInMap("IsChief")
    private Boolean isChief;

    @com.aliyun.core.annotation.NameInMap("LocalMountSpecs")
    private java.util.List<LocalMountSpec> localMountSpecs;

    @com.aliyun.core.annotation.NameInMap("OversoldType")
    private String oversoldType;

    @com.aliyun.core.annotation.NameInMap("PodCount")
    private Long podCount;

    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.NameInMap("ResourceConfig")
    private ResourceConfig resourceConfig;

    @com.aliyun.core.annotation.NameInMap("RestartPolicy")
    private String restartPolicy;

    @com.aliyun.core.annotation.NameInMap("ServiceSpec")
    private ServiceSpec serviceSpec;

    @com.aliyun.core.annotation.NameInMap("SpotSpec")
    private SpotSpec spotSpec;

    @com.aliyun.core.annotation.NameInMap("StartupDependencies")
    private java.util.List<StartupDependency> startupDependencies;

    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UseSpotInstance")
    @Deprecated
    private Boolean useSpotInstance;

    @com.aliyun.core.annotation.NameInMap("UserCommand")
    private String userCommand;

    private JobSpec(Builder builder) {
        this.assignNodeSpec = builder.assignNodeSpec;
        this.autoScalingSpec = builder.autoScalingSpec;
        this.considerInSuccessPolicy = builder.considerInSuccessPolicy;
        this.driver = builder.driver;
        this.ecsSpec = builder.ecsSpec;
        this.elasticSpotSpecs = builder.elasticSpotSpecs;
        this.extraPodSpec = builder.extraPodSpec;
        this.hyperNodeSchedulingConfig = builder.hyperNodeSchedulingConfig;
        this.image = builder.image;
        this.imageConfig = builder.imageConfig;
        this.isCheif = builder.isCheif;
        this.isChief = builder.isChief;
        this.localMountSpecs = builder.localMountSpecs;
        this.oversoldType = builder.oversoldType;
        this.podCount = builder.podCount;
        this.quotaId = builder.quotaId;
        this.resourceConfig = builder.resourceConfig;
        this.restartPolicy = builder.restartPolicy;
        this.serviceSpec = builder.serviceSpec;
        this.spotSpec = builder.spotSpec;
        this.startupDependencies = builder.startupDependencies;
        this.systemDisk = builder.systemDisk;
        this.type = builder.type;
        this.useSpotInstance = builder.useSpotInstance;
        this.userCommand = builder.userCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assignNodeSpec
     */
    public AssignNodeSpec getAssignNodeSpec() {
        return this.assignNodeSpec;
    }

    /**
     * @return autoScalingSpec
     */
    public AutoScalingSpec getAutoScalingSpec() {
        return this.autoScalingSpec;
    }

    /**
     * @return considerInSuccessPolicy
     */
    public Boolean getConsiderInSuccessPolicy() {
        return this.considerInSuccessPolicy;
    }

    /**
     * @return driver
     */
    public String getDriver() {
        return this.driver;
    }

    /**
     * @return ecsSpec
     */
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    /**
     * @return elasticSpotSpecs
     */
    public java.util.List<ElasticSpotSpec> getElasticSpotSpecs() {
        return this.elasticSpotSpecs;
    }

    /**
     * @return extraPodSpec
     */
    public ExtraPodSpec getExtraPodSpec() {
        return this.extraPodSpec;
    }

    /**
     * @return hyperNodeSchedulingConfig
     */
    public HyperNodeSchedulingConfig getHyperNodeSchedulingConfig() {
        return this.hyperNodeSchedulingConfig;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return imageConfig
     */
    public ImageConfig getImageConfig() {
        return this.imageConfig;
    }

    /**
     * @return isCheif
     */
    public Boolean getIsCheif() {
        return this.isCheif;
    }

    /**
     * @return isChief
     */
    public Boolean getIsChief() {
        return this.isChief;
    }

    /**
     * @return localMountSpecs
     */
    public java.util.List<LocalMountSpec> getLocalMountSpecs() {
        return this.localMountSpecs;
    }

    /**
     * @return oversoldType
     */
    public String getOversoldType() {
        return this.oversoldType;
    }

    /**
     * @return podCount
     */
    public Long getPodCount() {
        return this.podCount;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return resourceConfig
     */
    public ResourceConfig getResourceConfig() {
        return this.resourceConfig;
    }

    /**
     * @return restartPolicy
     */
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    /**
     * @return serviceSpec
     */
    public ServiceSpec getServiceSpec() {
        return this.serviceSpec;
    }

    /**
     * @return spotSpec
     */
    public SpotSpec getSpotSpec() {
        return this.spotSpec;
    }

    /**
     * @return startupDependencies
     */
    public java.util.List<StartupDependency> getStartupDependencies() {
        return this.startupDependencies;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return useSpotInstance
     */
    public Boolean getUseSpotInstance() {
        return this.useSpotInstance;
    }

    /**
     * @return userCommand
     */
    public String getUserCommand() {
        return this.userCommand;
    }

    public static final class Builder {
        private AssignNodeSpec assignNodeSpec; 
        private AutoScalingSpec autoScalingSpec; 
        private Boolean considerInSuccessPolicy; 
        private String driver; 
        private String ecsSpec; 
        private java.util.List<ElasticSpotSpec> elasticSpotSpecs; 
        private ExtraPodSpec extraPodSpec; 
        private HyperNodeSchedulingConfig hyperNodeSchedulingConfig; 
        private String image; 
        private ImageConfig imageConfig; 
        private Boolean isCheif; 
        private Boolean isChief; 
        private java.util.List<LocalMountSpec> localMountSpecs; 
        private String oversoldType; 
        private Long podCount; 
        private String quotaId; 
        private ResourceConfig resourceConfig; 
        private String restartPolicy; 
        private ServiceSpec serviceSpec; 
        private SpotSpec spotSpec; 
        private java.util.List<StartupDependency> startupDependencies; 
        private SystemDisk systemDisk; 
        private String type; 
        private Boolean useSpotInstance; 
        private String userCommand; 

        private Builder() {
        } 

        private Builder(JobSpec model) {
            this.assignNodeSpec = model.assignNodeSpec;
            this.autoScalingSpec = model.autoScalingSpec;
            this.considerInSuccessPolicy = model.considerInSuccessPolicy;
            this.driver = model.driver;
            this.ecsSpec = model.ecsSpec;
            this.elasticSpotSpecs = model.elasticSpotSpecs;
            this.extraPodSpec = model.extraPodSpec;
            this.hyperNodeSchedulingConfig = model.hyperNodeSchedulingConfig;
            this.image = model.image;
            this.imageConfig = model.imageConfig;
            this.isCheif = model.isCheif;
            this.isChief = model.isChief;
            this.localMountSpecs = model.localMountSpecs;
            this.oversoldType = model.oversoldType;
            this.podCount = model.podCount;
            this.quotaId = model.quotaId;
            this.resourceConfig = model.resourceConfig;
            this.restartPolicy = model.restartPolicy;
            this.serviceSpec = model.serviceSpec;
            this.spotSpec = model.spotSpec;
            this.startupDependencies = model.startupDependencies;
            this.systemDisk = model.systemDisk;
            this.type = model.type;
            this.useSpotInstance = model.useSpotInstance;
            this.userCommand = model.userCommand;
        } 

        /**
         * <p>The node scheduling configuration.</p>
         */
        public Builder assignNodeSpec(AssignNodeSpec assignNodeSpec) {
            this.assignNodeSpec = assignNodeSpec;
            return this;
        }

        /**
         * <p>The auto scaling configuration.</p>
         */
        public Builder autoScalingSpec(AutoScalingSpec autoScalingSpec) {
            this.autoScalingSpec = autoScalingSpec;
            return this;
        }

        /**
         * <p>Specifies whether to consider this role when determining job success. This parameter takes effect only when the success policy is set to Partial.</p>
         */
        public Builder considerInSuccessPolicy(Boolean considerInSuccessPolicy) {
            this.considerInSuccessPolicy = considerInSuccessPolicy;
            return this;
        }

        /**
         * Driver.
         */
        public Builder driver(String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * <p>The hardware specification of the worker. Visit <a href="https://help.aliyun.com/document_detail/171758.html">PAI-DLC billing</a> for the detailed specification list.&gt;Notice: Prices vary depending on the specification.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        public Builder ecsSpec(String ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * ElasticSpotSpecs.
         */
        public Builder elasticSpotSpecs(java.util.List<ElasticSpotSpec> elasticSpotSpecs) {
            this.elasticSpotSpecs = elasticSpotSpecs;
            return this;
        }

        /**
         * <p>The extra pod configuration.</p>
         */
        public Builder extraPodSpec(ExtraPodSpec extraPodSpec) {
            this.extraPodSpec = extraPodSpec;
            return this;
        }

        /**
         * HyperNodeSchedulingConfig.
         */
        public Builder hyperNodeSchedulingConfig(HyperNodeSchedulingConfig hyperNodeSchedulingConfig) {
            this.hyperNodeSchedulingConfig = hyperNodeSchedulingConfig;
            return this;
        }

        /**
         * <p>The runtime image address for this type of worker. Call <a href="https://help.aliyun.com/document_detail/449118.html">ListImages</a> to retrieve images provided by the PAI platform. You can also specify a third-party public image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/cloud-dsw/tensorflow:1.12PAI-gpu-py36-cu101-ubuntu18.04</p>
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * <p>The private image configuration.</p>
         */
        public Builder imageConfig(ImageConfig imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This field is deprecated due to a spelling error.</p>
         */
        public Builder isCheif(Boolean isCheif) {
            this.isCheif = isCheif;
            return this;
        }

        /**
         * <p>Specifies whether the role is the Chief role. Only one Chief role is allowed.</p>
         */
        public Builder isChief(Boolean isChief) {
            this.isChief = isChief;
            return this;
        }

        /**
         * <p>The list of local mount configurations.</p>
         */
        public Builder localMountSpecs(java.util.List<LocalMountSpec> localMountSpecs) {
            this.localMountSpecs = localMountSpecs;
            return this;
        }

        /**
         * OversoldType.
         */
        public Builder oversoldType(String oversoldType) {
            this.oversoldType = oversoldType;
            return this;
        }

        /**
         * <p>The number of replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder podCount(Long podCount) {
            this.podCount = podCount;
            return this;
        }

        /**
         * QuotaId.
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * <p>The resource configuration.</p>
         */
        public Builder resourceConfig(ResourceConfig resourceConfig) {
            this.resourceConfig = resourceConfig;
            return this;
        }

        /**
         * <p>The restart policy. Valid values: Always, Never, OnFailure, and ExitCode.</p>
         * 
         * <strong>example:</strong>
         * <p>ExitCode</p>
         */
        public Builder restartPolicy(String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }

        /**
         * <p>The service configuration.</p>
         */
        public Builder serviceSpec(ServiceSpec serviceSpec) {
            this.serviceSpec = serviceSpec;
            return this;
        }

        /**
         * <p>The spot instance configuration.</p>
         */
        public Builder spotSpec(SpotSpec spotSpec) {
            this.spotSpec = spotSpec;
            return this;
        }

        /**
         * <p>The dependencies required before this role starts.</p>
         */
        public Builder startupDependencies(java.util.List<StartupDependency> startupDependencies) {
            this.startupDependencies = startupDependencies;
            return this;
        }

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * <p>The type, which is closely related to the job type. Different job types support different worker types.</p>
         * <ul>
         * <li><p><strong>TFJob</strong>: Supports Chief, PS, Worker, Evaluator, and GraphLearn.</p>
         * </li>
         * <li><p><strong>PyTorchJob</strong>: Supports Worker and Master.</p>
         * </li>
         * <li><p><strong>XGBoostJob</strong>: Supports Worker and Master.</p>
         * </li>
         * <li><p><strong>OneFlowJob</strong>: Supports Worker and Master.</p>
         * </li>
         * <li><p><strong>ElasticBatch</strong>: Supports Worker and Master.</p>
         * </li>
         * <li><p><strong>RayJob</strong>: Supports Head, Worker, and Worker[-xxx].</p>
         * </li>
         * </ul>
         * <p>Master is optional in PyTorchJob, XGBoostJob, OneFlowJob, and ElasticBatch. If not specified, the system automatically designates the first Worker node as Master.</p>
         * 
         * <strong>example:</strong>
         * <p>Worker</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>Specifies whether to use spot instances.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useSpotInstance(Boolean useSpotInstance) {
            this.useSpotInstance = useSpotInstance;
            return this;
        }

        /**
         * <p>The role-level startup command.</p>
         * 
         * <strong>example:</strong>
         * <p>python train.py</p>
         */
        public Builder userCommand(String userCommand) {
            this.userCommand = userCommand;
            return this;
        }

        public JobSpec build() {
            return new JobSpec(this);
        } 

    } 

}
