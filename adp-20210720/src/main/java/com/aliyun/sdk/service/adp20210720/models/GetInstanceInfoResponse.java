// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceInfoResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceInfoResponse</p>
 */
public class GetInstanceInfoResponse extends Response {
    @NameInMap("annotations")
    private java.util.Map < String, String > annotations;

    @NameInMap("arch")
    private String arch;

    @NameInMap("clusterLabels")
    private java.util.Map < String, String > clusterLabels;

    @NameInMap("clusterTaints")
    private java.util.List < ClusterTaints> clusterTaints;

    @NameInMap("cpu")
    private String cpu;

    @NameInMap("dataDisk")
    private java.util.List < Disk > dataDisk;

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
    private String uid;

    private GetInstanceInfoResponse(BuilderImpl builder) {
        super(builder);
        this.annotations = builder.annotations;
        this.arch = builder.arch;
        this.clusterLabels = builder.clusterLabels;
        this.clusterTaints = builder.clusterTaints;
        this.cpu = builder.cpu;
        this.dataDisk = builder.dataDisk;
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

    public static GetInstanceInfoResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
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
     * @return cpu
     */
    public String getCpu() {
        return this.cpu;
    }

    /**
     * @return dataDisk
     */
    public java.util.List < Disk > getDataDisk() {
        return this.dataDisk;
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

    public interface Builder extends Response.Builder<GetInstanceInfoResponse, Builder> {

        Builder annotations(java.util.Map < String, String > annotations);

        Builder arch(String arch);

        Builder clusterLabels(java.util.Map < String, String > clusterLabels);

        Builder clusterTaints(java.util.List < ClusterTaints> clusterTaints);

        Builder cpu(String cpu);

        Builder dataDisk(java.util.List < Disk > dataDisk);

        Builder hostName(String hostName);

        Builder identifier(String identifier);

        Builder imageID(String imageID);

        Builder instanceType(String instanceType);

        Builder internetBandwidth(Integer internetBandwidth);

        Builder kernel(String kernel);

        Builder labels(java.util.Map < String, String > labels);

        Builder macAddress(String macAddress);

        Builder memory(String memory);

        Builder networkCards(java.util.List < NetworkCards> networkCards);

        Builder os(String os);

        Builder osVersion(String osVersion);

        Builder privateIP(String privateIP);

        Builder publicIP(String publicIP);

        Builder rootPassword(String rootPassword);

        Builder systemDisk(java.util.List < Disk > systemDisk);

        Builder systemInfo(String systemInfo);

        Builder taints(java.util.List < Taints> taints);

        Builder uid(String uid);

        @Override
        GetInstanceInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > annotations; 
        private String arch; 
        private java.util.Map < String, String > clusterLabels; 
        private java.util.List < ClusterTaints> clusterTaints; 
        private String cpu; 
        private java.util.List < Disk > dataDisk; 
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

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceInfoResponse response) {
            super(response);
            this.annotations = response.annotations;
            this.arch = response.arch;
            this.clusterLabels = response.clusterLabels;
            this.clusterTaints = response.clusterTaints;
            this.cpu = response.cpu;
            this.dataDisk = response.dataDisk;
            this.hostName = response.hostName;
            this.identifier = response.identifier;
            this.imageID = response.imageID;
            this.instanceType = response.instanceType;
            this.internetBandwidth = response.internetBandwidth;
            this.kernel = response.kernel;
            this.labels = response.labels;
            this.macAddress = response.macAddress;
            this.memory = response.memory;
            this.networkCards = response.networkCards;
            this.os = response.os;
            this.osVersion = response.osVersion;
            this.privateIP = response.privateIP;
            this.publicIP = response.publicIP;
            this.rootPassword = response.rootPassword;
            this.systemDisk = response.systemDisk;
            this.systemInfo = response.systemInfo;
            this.taints = response.taints;
            this.uid = response.uid;
        } 

        /**
         * annotations.
         */
        @Override
        public Builder annotations(java.util.Map < String, String > annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * arch.
         */
        @Override
        public Builder arch(String arch) {
            this.arch = arch;
            return this;
        }

        /**
         * clusterLabels.
         */
        @Override
        public Builder clusterLabels(java.util.Map < String, String > clusterLabels) {
            this.clusterLabels = clusterLabels;
            return this;
        }

        /**
         * clusterTaints.
         */
        @Override
        public Builder clusterTaints(java.util.List < ClusterTaints> clusterTaints) {
            this.clusterTaints = clusterTaints;
            return this;
        }

        /**
         * cpu.
         */
        @Override
        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * dataDisk.
         */
        @Override
        public Builder dataDisk(java.util.List < Disk > dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * hostName.
         */
        @Override
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * identifier.
         */
        @Override
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * imageID.
         */
        @Override
        public Builder imageID(String imageID) {
            this.imageID = imageID;
            return this;
        }

        /**
         * instanceType.
         */
        @Override
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * internetBandwidth.
         */
        @Override
        public Builder internetBandwidth(Integer internetBandwidth) {
            this.internetBandwidth = internetBandwidth;
            return this;
        }

        /**
         * kernel.
         */
        @Override
        public Builder kernel(String kernel) {
            this.kernel = kernel;
            return this;
        }

        /**
         * labels.
         */
        @Override
        public Builder labels(java.util.Map < String, String > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * macAddress.
         */
        @Override
        public Builder macAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }

        /**
         * memory.
         */
        @Override
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        /**
         * networkCards.
         */
        @Override
        public Builder networkCards(java.util.List < NetworkCards> networkCards) {
            this.networkCards = networkCards;
            return this;
        }

        /**
         * os.
         */
        @Override
        public Builder os(String os) {
            this.os = os;
            return this;
        }

        /**
         * osVersion.
         */
        @Override
        public Builder osVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }

        /**
         * privateIP.
         */
        @Override
        public Builder privateIP(String privateIP) {
            this.privateIP = privateIP;
            return this;
        }

        /**
         * publicIP.
         */
        @Override
        public Builder publicIP(String publicIP) {
            this.publicIP = publicIP;
            return this;
        }

        /**
         * rootPassword.
         */
        @Override
        public Builder rootPassword(String rootPassword) {
            this.rootPassword = rootPassword;
            return this;
        }

        /**
         * systemDisk.
         */
        @Override
        public Builder systemDisk(java.util.List < Disk > systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * systemInfo.
         */
        @Override
        public Builder systemInfo(String systemInfo) {
            this.systemInfo = systemInfo;
            return this;
        }

        /**
         * taints.
         */
        @Override
        public Builder taints(java.util.List < Taints> taints) {
            this.taints = taints;
            return this;
        }

        /**
         * uid.
         */
        @Override
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        @Override
        public GetInstanceInfoResponse build() {
            return new GetInstanceInfoResponse(this);
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
