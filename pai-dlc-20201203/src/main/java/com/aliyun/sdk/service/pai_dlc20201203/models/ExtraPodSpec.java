// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExtraPodSpec} extends {@link TeaModel}
 *
 * <p>ExtraPodSpec</p>
 */
public class ExtraPodSpec extends TeaModel {
    @NameInMap("InitContainers")
    private java.util.List < ContainerSpec > initContainers;

    @NameInMap("PodAnnotations")
    private java.util.Map < String, String > podAnnotations;

    @NameInMap("PodLabels")
    private java.util.Map < String, String > podLabels;

    @NameInMap("SharedVolumeMountPaths")
    private java.util.List < String > sharedVolumeMountPaths;

    @NameInMap("SideCarContainers")
    private java.util.List < ContainerSpec > sideCarContainers;

    private ExtraPodSpec(Builder builder) {
        this.initContainers = builder.initContainers;
        this.podAnnotations = builder.podAnnotations;
        this.podLabels = builder.podLabels;
        this.sharedVolumeMountPaths = builder.sharedVolumeMountPaths;
        this.sideCarContainers = builder.sideCarContainers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExtraPodSpec create() {
        return builder().build();
    }

    /**
     * @return initContainers
     */
    public java.util.List < ContainerSpec > getInitContainers() {
        return this.initContainers;
    }

    /**
     * @return podAnnotations
     */
    public java.util.Map < String, String > getPodAnnotations() {
        return this.podAnnotations;
    }

    /**
     * @return podLabels
     */
    public java.util.Map < String, String > getPodLabels() {
        return this.podLabels;
    }

    /**
     * @return sharedVolumeMountPaths
     */
    public java.util.List < String > getSharedVolumeMountPaths() {
        return this.sharedVolumeMountPaths;
    }

    /**
     * @return sideCarContainers
     */
    public java.util.List < ContainerSpec > getSideCarContainers() {
        return this.sideCarContainers;
    }

    public static final class Builder {
        private java.util.List < ContainerSpec > initContainers; 
        private java.util.Map < String, String > podAnnotations; 
        private java.util.Map < String, String > podLabels; 
        private java.util.List < String > sharedVolumeMountPaths; 
        private java.util.List < ContainerSpec > sideCarContainers; 

        /**
         * 初始化容器
         */
        public Builder initContainers(java.util.List < ContainerSpec > initContainers) {
            this.initContainers = initContainers;
            return this;
        }

        /**
         * Pod注解
         */
        public Builder podAnnotations(java.util.Map < String, String > podAnnotations) {
            this.podAnnotations = podAnnotations;
            return this;
        }

        /**
         * Pod标签
         */
        public Builder podLabels(java.util.Map < String, String > podLabels) {
            this.podLabels = podLabels;
            return this;
        }

        /**
         * 容器间共享的本地目录
         */
        public Builder sharedVolumeMountPaths(java.util.List < String > sharedVolumeMountPaths) {
            this.sharedVolumeMountPaths = sharedVolumeMountPaths;
            return this;
        }

        /**
         * 伴随容器
         */
        public Builder sideCarContainers(java.util.List < ContainerSpec > sideCarContainers) {
            this.sideCarContainers = sideCarContainers;
            return this;
        }

        public ExtraPodSpec build() {
            return new ExtraPodSpec(this);
        } 

    } 

}
