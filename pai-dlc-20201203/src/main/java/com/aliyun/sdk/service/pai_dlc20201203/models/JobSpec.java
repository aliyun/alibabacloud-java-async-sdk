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

    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private String ecsSpec;

    @com.aliyun.core.annotation.NameInMap("ExtraPodSpec")
    private ExtraPodSpec extraPodSpec;

    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("ImageConfig")
    private ImageConfig imageConfig;

    @com.aliyun.core.annotation.NameInMap("IsCheif")
    private Boolean isCheif;

    @com.aliyun.core.annotation.NameInMap("LocalMountSpecs")
    private java.util.List<LocalMountSpec> localMountSpecs;

    @com.aliyun.core.annotation.NameInMap("PodCount")
    private Long podCount;

    @com.aliyun.core.annotation.NameInMap("ResourceConfig")
    private ResourceConfig resourceConfig;

    @com.aliyun.core.annotation.NameInMap("RestartPolicy")
    private String restartPolicy;

    @com.aliyun.core.annotation.NameInMap("ServiceSpec")
    private ServiceSpec serviceSpec;

    @com.aliyun.core.annotation.NameInMap("SpotSpec")
    private SpotSpec spotSpec;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UseSpotInstance")
    @Deprecated
    private Boolean useSpotInstance;

    private JobSpec(Builder builder) {
        this.assignNodeSpec = builder.assignNodeSpec;
        this.autoScalingSpec = builder.autoScalingSpec;
        this.ecsSpec = builder.ecsSpec;
        this.extraPodSpec = builder.extraPodSpec;
        this.image = builder.image;
        this.imageConfig = builder.imageConfig;
        this.isCheif = builder.isCheif;
        this.localMountSpecs = builder.localMountSpecs;
        this.podCount = builder.podCount;
        this.resourceConfig = builder.resourceConfig;
        this.restartPolicy = builder.restartPolicy;
        this.serviceSpec = builder.serviceSpec;
        this.spotSpec = builder.spotSpec;
        this.type = builder.type;
        this.useSpotInstance = builder.useSpotInstance;
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
     * @return ecsSpec
     */
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    /**
     * @return extraPodSpec
     */
    public ExtraPodSpec getExtraPodSpec() {
        return this.extraPodSpec;
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
     * @return localMountSpecs
     */
    public java.util.List<LocalMountSpec> getLocalMountSpecs() {
        return this.localMountSpecs;
    }

    /**
     * @return podCount
     */
    public Long getPodCount() {
        return this.podCount;
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

    public static final class Builder {
        private AssignNodeSpec assignNodeSpec; 
        private AutoScalingSpec autoScalingSpec; 
        private String ecsSpec; 
        private ExtraPodSpec extraPodSpec; 
        private String image; 
        private ImageConfig imageConfig; 
        private Boolean isCheif; 
        private java.util.List<LocalMountSpec> localMountSpecs; 
        private Long podCount; 
        private ResourceConfig resourceConfig; 
        private String restartPolicy; 
        private ServiceSpec serviceSpec; 
        private SpotSpec spotSpec; 
        private String type; 
        private Boolean useSpotInstance; 

        private Builder() {
        } 

        private Builder(JobSpec model) {
            this.assignNodeSpec = model.assignNodeSpec;
            this.autoScalingSpec = model.autoScalingSpec;
            this.ecsSpec = model.ecsSpec;
            this.extraPodSpec = model.extraPodSpec;
            this.image = model.image;
            this.imageConfig = model.imageConfig;
            this.isCheif = model.isCheif;
            this.localMountSpecs = model.localMountSpecs;
            this.podCount = model.podCount;
            this.resourceConfig = model.resourceConfig;
            this.restartPolicy = model.restartPolicy;
            this.serviceSpec = model.serviceSpec;
            this.spotSpec = model.spotSpec;
            this.type = model.type;
            this.useSpotInstance = model.useSpotInstance;
        } 

        /**
         * AssignNodeSpec.
         */
        public Builder assignNodeSpec(AssignNodeSpec assignNodeSpec) {
            this.assignNodeSpec = assignNodeSpec;
            return this;
        }

        /**
         * AutoScalingSpec.
         */
        public Builder autoScalingSpec(AutoScalingSpec autoScalingSpec) {
            this.autoScalingSpec = autoScalingSpec;
            return this;
        }

        /**
         * EcsSpec.
         */
        public Builder ecsSpec(String ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * ExtraPodSpec.
         */
        public Builder extraPodSpec(ExtraPodSpec extraPodSpec) {
            this.extraPodSpec = extraPodSpec;
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
         * ImageConfig.
         */
        public Builder imageConfig(ImageConfig imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }

        /**
         * IsCheif.
         */
        public Builder isCheif(Boolean isCheif) {
            this.isCheif = isCheif;
            return this;
        }

        /**
         * LocalMountSpecs.
         */
        public Builder localMountSpecs(java.util.List<LocalMountSpec> localMountSpecs) {
            this.localMountSpecs = localMountSpecs;
            return this;
        }

        /**
         * PodCount.
         */
        public Builder podCount(Long podCount) {
            this.podCount = podCount;
            return this;
        }

        /**
         * ResourceConfig.
         */
        public Builder resourceConfig(ResourceConfig resourceConfig) {
            this.resourceConfig = resourceConfig;
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
         * ServiceSpec.
         */
        public Builder serviceSpec(ServiceSpec serviceSpec) {
            this.serviceSpec = serviceSpec;
            return this;
        }

        /**
         * SpotSpec.
         */
        public Builder spotSpec(SpotSpec spotSpec) {
            this.spotSpec = spotSpec;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * UseSpotInstance.
         */
        public Builder useSpotInstance(Boolean useSpotInstance) {
            this.useSpotInstance = useSpotInstance;
            return this;
        }

        public JobSpec build() {
            return new JobSpec(this);
        } 

    } 

}
