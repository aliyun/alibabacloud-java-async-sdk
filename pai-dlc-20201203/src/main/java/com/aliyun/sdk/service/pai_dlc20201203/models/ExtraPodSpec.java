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
 * {@link ExtraPodSpec} extends {@link TeaModel}
 *
 * <p>ExtraPodSpec</p>
 */
public class ExtraPodSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InitContainers")
    private java.util.List<ContainerSpec> initContainers;

    @com.aliyun.core.annotation.NameInMap("Lifecycle")
    private Lifecycle lifecycle;

    @com.aliyun.core.annotation.NameInMap("MainContainerSecurityContext")
    private SecurityContext mainContainerSecurityContext;

    @com.aliyun.core.annotation.NameInMap("PodAnnotations")
    @Deprecated
    private java.util.Map<String, String> podAnnotations;

    @com.aliyun.core.annotation.NameInMap("PodLabels")
    @Deprecated
    private java.util.Map<String, String> podLabels;

    @com.aliyun.core.annotation.NameInMap("SharedVolumeMountPaths")
    private java.util.List<String> sharedVolumeMountPaths;

    @com.aliyun.core.annotation.NameInMap("SideCarContainers")
    private java.util.List<ContainerSpec> sideCarContainers;

    private ExtraPodSpec(Builder builder) {
        this.initContainers = builder.initContainers;
        this.lifecycle = builder.lifecycle;
        this.mainContainerSecurityContext = builder.mainContainerSecurityContext;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return initContainers
     */
    public java.util.List<ContainerSpec> getInitContainers() {
        return this.initContainers;
    }

    /**
     * @return lifecycle
     */
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    /**
     * @return mainContainerSecurityContext
     */
    public SecurityContext getMainContainerSecurityContext() {
        return this.mainContainerSecurityContext;
    }

    /**
     * @return podAnnotations
     */
    public java.util.Map<String, String> getPodAnnotations() {
        return this.podAnnotations;
    }

    /**
     * @return podLabels
     */
    public java.util.Map<String, String> getPodLabels() {
        return this.podLabels;
    }

    /**
     * @return sharedVolumeMountPaths
     */
    public java.util.List<String> getSharedVolumeMountPaths() {
        return this.sharedVolumeMountPaths;
    }

    /**
     * @return sideCarContainers
     */
    public java.util.List<ContainerSpec> getSideCarContainers() {
        return this.sideCarContainers;
    }

    public static final class Builder {
        private java.util.List<ContainerSpec> initContainers; 
        private Lifecycle lifecycle; 
        private SecurityContext mainContainerSecurityContext; 
        private java.util.Map<String, String> podAnnotations; 
        private java.util.Map<String, String> podLabels; 
        private java.util.List<String> sharedVolumeMountPaths; 
        private java.util.List<ContainerSpec> sideCarContainers; 

        private Builder() {
        } 

        private Builder(ExtraPodSpec model) {
            this.initContainers = model.initContainers;
            this.lifecycle = model.lifecycle;
            this.mainContainerSecurityContext = model.mainContainerSecurityContext;
            this.podAnnotations = model.podAnnotations;
            this.podLabels = model.podLabels;
            this.sharedVolumeMountPaths = model.sharedVolumeMountPaths;
            this.sideCarContainers = model.sideCarContainers;
        } 

        /**
         * <p>A list of init containers that run to completion before the main container starts.</p>
         */
        public Builder initContainers(java.util.List<ContainerSpec> initContainers) {
            this.initContainers = initContainers;
            return this;
        }

        /**
         * <p>Defines lifecycle hooks for the main container.</p>
         */
        public Builder lifecycle(Lifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * <p>Defines the security context for the main container.</p>
         */
        public Builder mainContainerSecurityContext(SecurityContext mainContainerSecurityContext) {
            this.mainContainerSecurityContext = mainContainerSecurityContext;
            return this;
        }

        /**
         * <p>Key-value pairs to apply to the pod as annotations. Use annotations to attach arbitrary, non-identifying metadata.</p>
         */
        public Builder podAnnotations(java.util.Map<String, String> podAnnotations) {
            this.podAnnotations = podAnnotations;
            return this;
        }

        /**
         * <p>Key-value pairs to apply to the pod as labels. Use labels to organize and select pods.</p>
         */
        public Builder podLabels(java.util.Map<String, String> podLabels) {
            this.podLabels = podLabels;
            return this;
        }

        /**
         * <p>A list of local directory paths to mount and share among all containers in the pod.</p>
         */
        public Builder sharedVolumeMountPaths(java.util.List<String> sharedVolumeMountPaths) {
            this.sharedVolumeMountPaths = sharedVolumeMountPaths;
            return this;
        }

        /**
         * <p>A list of sidecar containers.</p>
         */
        public Builder sideCarContainers(java.util.List<ContainerSpec> sideCarContainers) {
            this.sideCarContainers = sideCarContainers;
            return this;
        }

        public ExtraPodSpec build() {
            return new ExtraPodSpec(this);
        } 

    } 

}
