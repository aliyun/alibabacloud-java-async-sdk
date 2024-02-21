// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AckConfig} extends {@link TeaModel}
 *
 * <p>AckConfig</p>
 */
public class AckConfig extends TeaModel {
    @NameInMap("AckInstanceId")
    private String ackInstanceId;

    @NameInMap("CustomAnnotations")
    private java.util.List < Tag > customAnnotations;

    @NameInMap("CustomLabels")
    private java.util.List < Tag > customLabels;

    @NameInMap("DataDiskSize")
    private Integer dataDiskSize;

    @NameInMap("DataDiskStorageClass")
    private String dataDiskStorageClass;

    @NameInMap("LimitCpu")
    private Float limitCpu;

    @NameInMap("LimitMemory")
    private Float limitMemory;

    @NameInMap("MountHostCgroup")
    private Boolean mountHostCgroup;

    @NameInMap("Namespace")
    private String namespace;

    @NameInMap("NodeSelectors")
    private java.util.List < Tag > nodeSelectors;

    @NameInMap("RequestCpu")
    private Float requestCpu;

    @NameInMap("RequestMemory")
    private Float requestMemory;

    @NameInMap("Tolerations")
    private java.util.List < Toleration > tolerations;

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
        this.nodeSelectors = builder.nodeSelectors;
        this.requestCpu = builder.requestCpu;
        this.requestMemory = builder.requestMemory;
        this.tolerations = builder.tolerations;
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
    public java.util.List < Tag > getCustomAnnotations() {
        return this.customAnnotations;
    }

    /**
     * @return customLabels
     */
    public java.util.List < Tag > getCustomLabels() {
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
     * @return nodeSelectors
     */
    public java.util.List < Tag > getNodeSelectors() {
        return this.nodeSelectors;
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
    public java.util.List < Toleration > getTolerations() {
        return this.tolerations;
    }

    public static final class Builder {
        private String ackInstanceId; 
        private java.util.List < Tag > customAnnotations; 
        private java.util.List < Tag > customLabels; 
        private Integer dataDiskSize; 
        private String dataDiskStorageClass; 
        private Float limitCpu; 
        private Float limitMemory; 
        private Boolean mountHostCgroup; 
        private String namespace; 
        private java.util.List < Tag > nodeSelectors; 
        private Float requestCpu; 
        private Float requestMemory; 
        private java.util.List < Toleration > tolerations; 

        /**
         * ack集群id
         */
        public Builder ackInstanceId(String ackInstanceId) {
            this.ackInstanceId = ackInstanceId;
            return this;
        }

        /**
         * CustomAnnotations.
         */
        public Builder customAnnotations(java.util.List < Tag > customAnnotations) {
            this.customAnnotations = customAnnotations;
            return this;
        }

        /**
         * CustomLabels.
         */
        public Builder customLabels(java.util.List < Tag > customLabels) {
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
         * Pod的CPU限制值。
         */
        public Builder limitCpu(Float limitCpu) {
            this.limitCpu = limitCpu;
            return this;
        }

        /**
         * Pod的内存限制值。
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
         * ack 命名空间
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * ack的节点标签限制
         */
        public Builder nodeSelectors(java.util.List < Tag > nodeSelectors) {
            this.nodeSelectors = nodeSelectors;
            return this;
        }

        /**
         * Pod的CPU请求值
         */
        public Builder requestCpu(Float requestCpu) {
            this.requestCpu = requestCpu;
            return this;
        }

        /**
         * Pod的内存请求值。
         */
        public Builder requestMemory(Float requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }

        /**
         * ack的节点污点容忍
         */
        public Builder tolerations(java.util.List < Toleration > tolerations) {
            this.tolerations = tolerations;
            return this;
        }

        public AckConfig build() {
            return new AckConfig(this);
        } 

    } 

}
