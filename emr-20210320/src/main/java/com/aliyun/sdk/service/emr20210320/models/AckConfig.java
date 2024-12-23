// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link AckConfig} extends {@link TeaModel}
 *
 * <p>AckConfig</p>
 */
public class AckConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AckInstanceId")
    private String ackInstanceId;

    @com.aliyun.core.annotation.NameInMap("CustomAnnotations")
    private java.util.List<Tag> customAnnotations;

    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.List<Tag> customLabels;

    @com.aliyun.core.annotation.NameInMap("DataDiskSize")
    private Integer dataDiskSize;

    @com.aliyun.core.annotation.NameInMap("DataDiskStorageClass")
    private String dataDiskStorageClass;

    @com.aliyun.core.annotation.NameInMap("LimitCpu")
    private Float limitCpu;

    @com.aliyun.core.annotation.NameInMap("LimitMemory")
    private Float limitMemory;

    @com.aliyun.core.annotation.NameInMap("MountHostCgroup")
    private Boolean mountHostCgroup;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("NodeAffinity")
    private String nodeAffinity;

    @com.aliyun.core.annotation.NameInMap("NodeSelectors")
    private java.util.List<Tag> nodeSelectors;

    @com.aliyun.core.annotation.NameInMap("PodAffinity")
    private String podAffinity;

    @com.aliyun.core.annotation.NameInMap("PodAntiAffinity")
    private String podAntiAffinity;

    @com.aliyun.core.annotation.NameInMap("PreStartCommand")
    private java.util.List<String> preStartCommand;

    @com.aliyun.core.annotation.NameInMap("Pvcs")
    private java.util.List<Pvcs> pvcs;

    @com.aliyun.core.annotation.NameInMap("RequestCpu")
    private Float requestCpu;

    @com.aliyun.core.annotation.NameInMap("RequestMemory")
    private Float requestMemory;

    @com.aliyun.core.annotation.NameInMap("Tolerations")
    private java.util.List<Toleration> tolerations;

    @com.aliyun.core.annotation.NameInMap("VolumeMounts")
    private java.util.List<VolumeMounts> volumeMounts;

    @com.aliyun.core.annotation.NameInMap("Volumes")
    private java.util.List<Volumes> volumes;

    private AckConfig(Builder builder) {
        this.ackInstanceId = builder.ackInstanceId;
        this.customAnnotations = builder.customAnnotations;
        this.customLabels = builder.customLabels;
        this.dataDiskSize = builder.dataDiskSize;
        this.dataDiskStorageClass = builder.dataDiskStorageClass;
        this.limitCpu = builder.limitCpu;
        this.limitMemory = builder.limitMemory;
        this.mountHostCgroup = builder.mountHostCgroup;
        this.namespace = builder.namespace;
        this.nodeAffinity = builder.nodeAffinity;
        this.nodeSelectors = builder.nodeSelectors;
        this.podAffinity = builder.podAffinity;
        this.podAntiAffinity = builder.podAntiAffinity;
        this.preStartCommand = builder.preStartCommand;
        this.pvcs = builder.pvcs;
        this.requestCpu = builder.requestCpu;
        this.requestMemory = builder.requestMemory;
        this.tolerations = builder.tolerations;
        this.volumeMounts = builder.volumeMounts;
        this.volumes = builder.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AckConfig create() {
        return builder().build();
    }

    /**
     * @return ackInstanceId
     */
    public String getAckInstanceId() {
        return this.ackInstanceId;
    }

    /**
     * @return customAnnotations
     */
    public java.util.List<Tag> getCustomAnnotations() {
        return this.customAnnotations;
    }

    /**
     * @return customLabels
     */
    public java.util.List<Tag> getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return dataDiskSize
     */
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    /**
     * @return dataDiskStorageClass
     */
    public String getDataDiskStorageClass() {
        return this.dataDiskStorageClass;
    }

    /**
     * @return limitCpu
     */
    public Float getLimitCpu() {
        return this.limitCpu;
    }

    /**
     * @return limitMemory
     */
    public Float getLimitMemory() {
        return this.limitMemory;
    }

    /**
     * @return mountHostCgroup
     */
    public Boolean getMountHostCgroup() {
        return this.mountHostCgroup;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return nodeAffinity
     */
    public String getNodeAffinity() {
        return this.nodeAffinity;
    }

    /**
     * @return nodeSelectors
     */
    public java.util.List<Tag> getNodeSelectors() {
        return this.nodeSelectors;
    }

    /**
     * @return podAffinity
     */
    public String getPodAffinity() {
        return this.podAffinity;
    }

    /**
     * @return podAntiAffinity
     */
    public String getPodAntiAffinity() {
        return this.podAntiAffinity;
    }

    /**
     * @return preStartCommand
     */
    public java.util.List<String> getPreStartCommand() {
        return this.preStartCommand;
    }

    /**
     * @return pvcs
     */
    public java.util.List<Pvcs> getPvcs() {
        return this.pvcs;
    }

    /**
     * @return requestCpu
     */
    public Float getRequestCpu() {
        return this.requestCpu;
    }

    /**
     * @return requestMemory
     */
    public Float getRequestMemory() {
        return this.requestMemory;
    }

    /**
     * @return tolerations
     */
    public java.util.List<Toleration> getTolerations() {
        return this.tolerations;
    }

    /**
     * @return volumeMounts
     */
    public java.util.List<VolumeMounts> getVolumeMounts() {
        return this.volumeMounts;
    }

    /**
     * @return volumes
     */
    public java.util.List<Volumes> getVolumes() {
        return this.volumes;
    }

    public static final class Builder {
        private String ackInstanceId; 
        private java.util.List<Tag> customAnnotations; 
        private java.util.List<Tag> customLabels; 
        private Integer dataDiskSize; 
        private String dataDiskStorageClass; 
        private Float limitCpu; 
        private Float limitMemory; 
        private Boolean mountHostCgroup; 
        private String namespace; 
        private String nodeAffinity; 
        private java.util.List<Tag> nodeSelectors; 
        private String podAffinity; 
        private String podAntiAffinity; 
        private java.util.List<String> preStartCommand; 
        private java.util.List<Pvcs> pvcs; 
        private Float requestCpu; 
        private Float requestMemory; 
        private java.util.List<Toleration> tolerations; 
        private java.util.List<VolumeMounts> volumeMounts; 
        private java.util.List<Volumes> volumes; 

        /**
         * <p>ack集群id</p>
         */
        public Builder ackInstanceId(String ackInstanceId) {
            this.ackInstanceId = ackInstanceId;
            return this;
        }

        /**
         * CustomAnnotations.
         */
        public Builder customAnnotations(java.util.List<Tag> customAnnotations) {
            this.customAnnotations = customAnnotations;
            return this;
        }

        /**
         * CustomLabels.
         */
        public Builder customLabels(java.util.List<Tag> customLabels) {
            this.customLabels = customLabels;
            return this;
        }

        /**
         * DataDiskSize.
         */
        public Builder dataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }

        /**
         * DataDiskStorageClass.
         */
        public Builder dataDiskStorageClass(String dataDiskStorageClass) {
            this.dataDiskStorageClass = dataDiskStorageClass;
            return this;
        }

        /**
         * <p>Pod的CPU限制值。</p>
         */
        public Builder limitCpu(Float limitCpu) {
            this.limitCpu = limitCpu;
            return this;
        }

        /**
         * <p>Pod的内存限制值。</p>
         */
        public Builder limitMemory(Float limitMemory) {
            this.limitMemory = limitMemory;
            return this;
        }

        /**
         * MountHostCgroup.
         */
        public Builder mountHostCgroup(Boolean mountHostCgroup) {
            this.mountHostCgroup = mountHostCgroup;
            return this;
        }

        /**
         * <p>ack 命名空间</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * NodeAffinity.
         */
        public Builder nodeAffinity(String nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }

        /**
         * <p>ack的节点标签限制</p>
         */
        public Builder nodeSelectors(java.util.List<Tag> nodeSelectors) {
            this.nodeSelectors = nodeSelectors;
            return this;
        }

        /**
         * PodAffinity.
         */
        public Builder podAffinity(String podAffinity) {
            this.podAffinity = podAffinity;
            return this;
        }

        /**
         * PodAntiAffinity.
         */
        public Builder podAntiAffinity(String podAntiAffinity) {
            this.podAntiAffinity = podAntiAffinity;
            return this;
        }

        /**
         * PreStartCommand.
         */
        public Builder preStartCommand(java.util.List<String> preStartCommand) {
            this.preStartCommand = preStartCommand;
            return this;
        }

        /**
         * Pvcs.
         */
        public Builder pvcs(java.util.List<Pvcs> pvcs) {
            this.pvcs = pvcs;
            return this;
        }

        /**
         * <p>Pod的CPU请求值</p>
         */
        public Builder requestCpu(Float requestCpu) {
            this.requestCpu = requestCpu;
            return this;
        }

        /**
         * <p>Pod的内存请求值。</p>
         */
        public Builder requestMemory(Float requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }

        /**
         * <p>ack的节点污点容忍</p>
         */
        public Builder tolerations(java.util.List<Toleration> tolerations) {
            this.tolerations = tolerations;
            return this;
        }

        /**
         * VolumeMounts.
         */
        public Builder volumeMounts(java.util.List<VolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        /**
         * Volumes.
         */
        public Builder volumes(java.util.List<Volumes> volumes) {
            this.volumes = volumes;
            return this;
        }

        public AckConfig build() {
            return new AckConfig(this);
        } 

    } 

    /**
     * 
     * {@link AckConfig} extends {@link TeaModel}
     *
     * <p>AckConfig</p>
     */
    public static class Pvcs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private Long dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("DataDiskStorageClass")
        private String dataDiskStorageClass;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private Pvcs(Builder builder) {
            this.dataDiskSize = builder.dataDiskSize;
            this.dataDiskStorageClass = builder.dataDiskStorageClass;
            this.name = builder.name;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pvcs create() {
            return builder().build();
        }

        /**
         * @return dataDiskSize
         */
        public Long getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return dataDiskStorageClass
         */
        public String getDataDiskStorageClass() {
            return this.dataDiskStorageClass;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private Long dataDiskSize; 
            private String dataDiskStorageClass; 
            private String name; 
            private String path; 

            /**
             * DataDiskSize.
             */
            public Builder dataDiskSize(Long dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * DataDiskStorageClass.
             */
            public Builder dataDiskStorageClass(String dataDiskStorageClass) {
                this.dataDiskStorageClass = dataDiskStorageClass;
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
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Pvcs build() {
                return new Pvcs(this);
            } 

        } 

    }
    /**
     * 
     * {@link AckConfig} extends {@link TeaModel}
     *
     * <p>AckConfig</p>
     */
    public static class VolumeMounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private VolumeMounts(Builder builder) {
            this.name = builder.name;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VolumeMounts create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String name; 
            private String path; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public VolumeMounts build() {
                return new VolumeMounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link AckConfig} extends {@link TeaModel}
     *
     * <p>AckConfig</p>
     */
    public static class Volumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Volumes(Builder builder) {
            this.name = builder.name;
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Volumes create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String path; 
            private String type; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
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
}
