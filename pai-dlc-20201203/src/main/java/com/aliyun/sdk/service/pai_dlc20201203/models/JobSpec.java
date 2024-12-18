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

    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private String ecsSpec;

    @com.aliyun.core.annotation.NameInMap("ExtraPodSpec")
    private ExtraPodSpec extraPodSpec;

    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("ImageConfig")
    private ImageConfig imageConfig;

    @com.aliyun.core.annotation.NameInMap("PodCount")
    private Long podCount;

    @com.aliyun.core.annotation.NameInMap("ResourceConfig")
    private ResourceConfig resourceConfig;

    @com.aliyun.core.annotation.NameInMap("SpotSpec")
    private SpotSpec spotSpec;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UseSpotInstance")
    @Deprecated
    private Boolean useSpotInstance;

    private JobSpec(Builder builder) {
        this.assignNodeSpec = builder.assignNodeSpec;
        this.ecsSpec = builder.ecsSpec;
        this.extraPodSpec = builder.extraPodSpec;
        this.image = builder.image;
        this.imageConfig = builder.imageConfig;
        this.podCount = builder.podCount;
        this.resourceConfig = builder.resourceConfig;
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

    /**
     * @return assignNodeSpec
     */
    public AssignNodeSpec getAssignNodeSpec() {
        return this.assignNodeSpec;
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
        private String ecsSpec; 
        private ExtraPodSpec extraPodSpec; 
        private String image; 
        private ImageConfig imageConfig; 
        private Long podCount; 
        private ResourceConfig resourceConfig; 
        private SpotSpec spotSpec; 
        private String type; 
        private Boolean useSpotInstance; 

        /**
         * AssignNodeSpec.
         */
        public Builder assignNodeSpec(AssignNodeSpec assignNodeSpec) {
            this.assignNodeSpec = assignNodeSpec;
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
