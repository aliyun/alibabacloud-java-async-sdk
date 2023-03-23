// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JobSpec} extends {@link TeaModel}
 *
 * <p>JobSpec</p>
 */
public class JobSpec extends TeaModel {
    @NameInMap("EcsSpec")
    private String ecsSpec;

    @NameInMap("ExtraPodSpec")
    private ExtraPodSpec extraPodSpec;

    @NameInMap("Image")
    private String image;

    @NameInMap("ImageConfig")
    private ImageConfig imageConfig;

    @NameInMap("PodCount")
    private Long podCount;

    @NameInMap("ResourceConfig")
    private ResourceConfig resourceConfig;

    @NameInMap("Type")
    private String type;

    @NameInMap("UseSpotInstance")
    private Boolean useSpotInstance;

    private JobSpec(Builder builder) {
        this.ecsSpec = builder.ecsSpec;
        this.extraPodSpec = builder.extraPodSpec;
        this.image = builder.image;
        this.imageConfig = builder.imageConfig;
        this.podCount = builder.podCount;
        this.resourceConfig = builder.resourceConfig;
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
        private String ecsSpec; 
        private ExtraPodSpec extraPodSpec; 
        private String image; 
        private ImageConfig imageConfig; 
        private Long podCount; 
        private ResourceConfig resourceConfig; 
        private String type; 
        private Boolean useSpotInstance; 

        /**
         * Ecs实例规格
         */
        public Builder ecsSpec(String ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * 额外的Pod配置
         */
        public Builder extraPodSpec(ExtraPodSpec extraPodSpec) {
            this.extraPodSpec = extraPodSpec;
            return this;
        }

        /**
         * 镜像
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * 私有镜像配置
         */
        public Builder imageConfig(ImageConfig imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }

        /**
         * 实例数量
         */
        public Builder podCount(Long podCount) {
            this.podCount = podCount;
            return this;
        }

        /**
         * 资源配置
         */
        public Builder resourceConfig(ResourceConfig resourceConfig) {
            this.resourceConfig = resourceConfig;
            return this;
        }

        /**
         * 类型
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 是否使用竞价实例
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
