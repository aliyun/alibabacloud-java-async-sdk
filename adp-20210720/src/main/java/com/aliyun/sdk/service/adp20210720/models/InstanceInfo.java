// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstanceInfo} extends {@link TeaModel}
 *
 * <p>InstanceInfo</p>
 */
public class InstanceInfo extends TeaModel {
    @NameInMap("annotations")
    private java.util.Map < String, String > annotations;

    @NameInMap("arch")
    private String arch;

    @NameInMap("clusterLabels")
    private java.util.Map < String, String > clusterLabels;

    @NameInMap("clusterTaints")
    private java.util.List < ClusterTaints> clusterTaints;

    @NameInMap("clusterUID")
    private String clusterUID;

    @NameInMap("cpu")
    private String cpu;

    @NameInMap("createdAt")
    private String createdAt;

    @NameInMap("dataDisk")
    private java.util.List < Disk > dataDisk;

    @NameInMap("diskConfigAnnotations")
    private java.util.Map < String, String > diskConfigAnnotations;

    @NameInMap("hostName")
    private String hostName;

    @NameInMap("identifier")
    private String identifier;

    @NameInMap("imageID")
    private String imageID;

    @NameInMap("instanceType")
    private String instanceType;

    @NameInMap("internetBandwidth")
    private Integer internetBandwidth;

    @NameInMap("kernel")
    private String kernel;

    @NameInMap("labels")
    private java.util.Map < String, String > labels;

    @NameInMap("macAddress")
    private String macAddress;

    @NameInMap("memory")
    private String memory;

    @NameInMap("networkCards")
    private java.util.List < NetworkCards> networkCards;

    @NameInMap("os")
    private String os;

    @NameInMap("osVersion")
    private String osVersion;

    @NameInMap("privateIP")
    private String privateIP;

    @NameInMap("publicIP")
    private String publicIP;

    @NameInMap("rootPassword")
    private String rootPassword;

    @NameInMap("systemDisk")
    private java.util.List < Disk > systemDisk;

    @NameInMap("systemInfo")
    private String systemInfo;

    @NameInMap("taints")
    private java.util.List < Taints> taints;

    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    private InstanceInfo(Builder builder) {
        this.annotations = builder.annotations;
        this.arch = builder.arch;
        this.clusterLabels = builder.clusterLabels;
        this.clusterTaints = builder.clusterTaints;
        this.clusterUID = builder.clusterUID;
        this.cpu = builder.cpu;
        this.createdAt = builder.createdAt;
        this.dataDisk = builder.dataDisk;
        this.diskConfigAnnotations = builder.diskConfigAnnotations;
        this.hostName = builder.hostName;
        this.identifier = builder.identifier;
        this.imageID = builder.imageID;
        this.instanceType = builder.instanceType;
        this.internetBandwidth = builder.internetBandwidth;
        this.kernel = builder.kernel;
        this.labels = builder.labels;
        this.macAddress = builder.macAddress;
        this.memory = builder.memory;
        this.networkCards = builder.networkCards;
        this.os = builder.os;
        this.osVersion = builder.osVersion;
        this.privateIP = builder.privateIP;
        this.publicIP = builder.publicIP;
        this.rootPassword = builder.rootPassword;
        this.systemDisk = builder.systemDisk;
        this.systemInfo = builder.systemInfo;
        this.taints = builder.taints;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceInfo create() {
        return builder().build();
    }

    /**
     * @return annotations
     */
    public java.util.Map < String, String > getAnnotations() {
        return this.annotations;
    }

    /**
     * @return arch
     */
    public String getArch() {
        return this.arch;
    }

    /**
     * @return clusterLabels
     */
    public java.util.Map < String, String > getClusterLabels() {
        return this.clusterLabels;
    }

    /**
     * @return clusterTaints
     */
    public java.util.List < ClusterTaints> getClusterTaints() {
        return this.clusterTaints;
    }

    /**
     * @return clusterUID
     */
    public String getClusterUID() {
        return this.clusterUID;
    }

    /**
     * @return cpu
     */
    public String getCpu() {
        return this.cpu;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return dataDisk
     */
    public java.util.List < Disk > getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return diskConfigAnnotations
     */
    public java.util.Map < String, String > getDiskConfigAnnotations() {
        return this.diskConfigAnnotations;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return imageID
     */
    public String getImageID() {
        return this.imageID;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetBandwidth
     */
    public Integer getInternetBandwidth() {
        return this.internetBandwidth;
    }

    /**
     * @return kernel
     */
    public String getKernel() {
        return this.kernel;
    }

    /**
     * @return labels
     */
    public java.util.Map < String, String > getLabels() {
        return this.labels;
    }

    /**
     * @return macAddress
     */
    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * @return memory
     */
    public String getMemory() {
        return this.memory;
    }

    /**
     * @return networkCards
     */
    public java.util.List < NetworkCards> getNetworkCards() {
        return this.networkCards;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return osVersion
     */
    public String getOsVersion() {
        return this.osVersion;
    }

    /**
     * @return privateIP
     */
    public String getPrivateIP() {
        return this.privateIP;
    }

    /**
     * @return publicIP
     */
    public String getPublicIP() {
        return this.publicIP;
    }

    /**
     * @return rootPassword
     */
    public String getRootPassword() {
        return this.rootPassword;
    }

    /**
     * @return systemDisk
     */
    public java.util.List < Disk > getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return systemInfo
     */
    public String getSystemInfo() {
        return this.systemInfo;
    }

    /**
     * @return taints
     */
    public java.util.List < Taints> getTaints() {
        return this.taints;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder {
        private java.util.Map < String, String > annotations; 
        private String arch; 
        private java.util.Map < String, String > clusterLabels; 
        private java.util.List < ClusterTaints> clusterTaints; 
        private String clusterUID; 
        private String cpu; 
        private String createdAt; 
        private java.util.List < Disk > dataDisk; 
        private java.util.Map < String, String > diskConfigAnnotations; 
        private String hostName; 
        private String identifier; 
        private String imageID; 
        private String instanceType; 
        private Integer internetBandwidth; 
        private String kernel; 
        private java.util.Map < String, String > labels; 
        private String macAddress; 
        private String memory; 
        private java.util.List < NetworkCards> networkCards; 
        private String os; 
        private String osVersion; 
        private String privateIP; 
        private String publicIP; 
        private String rootPassword; 
        private java.util.List < Disk > systemDisk; 
        private String systemInfo; 
        private java.util.List < Taints> taints; 
        private String uid; 

        /**
         * annotations.
         */
        public Builder annotations(java.util.Map < String, String > annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * arch.
         */
        public Builder arch(String arch) {
            this.arch = arch;
            return this;
        }

        /**
         * clusterLabels.
         */
        public Builder clusterLabels(java.util.Map < String, String > clusterLabels) {
            this.clusterLabels = clusterLabels;
            return this;
        }

        /**
         * clusterTaints.
         */
        public Builder clusterTaints(java.util.List < ClusterTaints> clusterTaints) {
            this.clusterTaints = clusterTaints;
            return this;
        }

        /**
         * clusterUID.
         */
        public Builder clusterUID(String clusterUID) {
            this.clusterUID = clusterUID;
            return this;
        }

        /**
         * cpu.
         */
        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * dataDisk.
         */
        public Builder dataDisk(java.util.List < Disk > dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * diskConfigAnnotations.
         */
        public Builder diskConfigAnnotations(java.util.Map < String, String > diskConfigAnnotations) {
            this.diskConfigAnnotations = diskConfigAnnotations;
            return this;
        }

        /**
         * hostName.
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * identifier.
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * imageID.
         */
        public Builder imageID(String imageID) {
            this.imageID = imageID;
            return this;
        }

        /**
         * instanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * internetBandwidth.
         */
        public Builder internetBandwidth(Integer internetBandwidth) {
            this.internetBandwidth = internetBandwidth;
            return this;
        }

        /**
         * kernel.
         */
        public Builder kernel(String kernel) {
            this.kernel = kernel;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(java.util.Map < String, String > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * macAddress.
         */
        public Builder macAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }

        /**
         * memory.
         */
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        /**
         * networkCards.
         */
        public Builder networkCards(java.util.List < NetworkCards> networkCards) {
            this.networkCards = networkCards;
            return this;
        }

        /**
         * os.
         */
        public Builder os(String os) {
            this.os = os;
            return this;
        }

        /**
         * osVersion.
         */
        public Builder osVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }

        /**
         * privateIP.
         */
        public Builder privateIP(String privateIP) {
            this.privateIP = privateIP;
            return this;
        }

        /**
         * publicIP.
         */
        public Builder publicIP(String publicIP) {
            this.publicIP = publicIP;
            return this;
        }

        /**
         * rootPassword.
         */
        public Builder rootPassword(String rootPassword) {
            this.rootPassword = rootPassword;
            return this;
        }

        /**
         * systemDisk.
         */
        public Builder systemDisk(java.util.List < Disk > systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * systemInfo.
         */
        public Builder systemInfo(String systemInfo) {
            this.systemInfo = systemInfo;
            return this;
        }

        /**
         * taints.
         */
        public Builder taints(java.util.List < Taints> taints) {
            this.taints = taints;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public InstanceInfo build() {
            return new InstanceInfo(this);
        } 

    } 

    public static class ClusterTaints extends TeaModel {
        @NameInMap("effect")
        private String effect;

        @NameInMap("key")
        private String key;

        @NameInMap("value")
        private String value;

        private ClusterTaints(Builder builder) {
            this.effect = builder.effect;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterTaints create() {
            return builder().build();
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String effect; 
            private String key; 
            private String value; 

            /**
             * effect.
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ClusterTaints build() {
                return new ClusterTaints(this);
            } 

        } 

    }
    public static class NetworkCards extends TeaModel {
        @NameInMap("ip")
        private String ip;

        @NameInMap("name")
        private String name;

        private NetworkCards(Builder builder) {
            this.ip = builder.ip;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkCards create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String ip; 
            private String name; 

            /**
             * ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public NetworkCards build() {
                return new NetworkCards(this);
            } 

        } 

    }
    public static class Taints extends TeaModel {
        @NameInMap("effect")
        private String effect;

        @NameInMap("key")
        private String key;

        @NameInMap("value")
        private String value;

        private Taints(Builder builder) {
            this.effect = builder.effect;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Taints create() {
            return builder().build();
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String effect; 
            private String key; 
            private String value; 

            /**
             * effect.
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Taints build() {
                return new Taints(this);
            } 

        } 

    }
}
