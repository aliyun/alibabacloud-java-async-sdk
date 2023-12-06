// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddEnvironmentNodesRequest} extends {@link RequestModel}
 *
 * <p>AddEnvironmentNodesRequest</p>
 */
public class AddEnvironmentNodesRequest extends Request {
    @Path
    @NameInMap("uid")
    private String uid;

    @Body
    @NameInMap("applicationDisk")
    private String applicationDisk;

    @Body
    @NameInMap("cpu")
    private Integer cpu;

    @Body
    @NameInMap("dataDisk")
    private java.util.List < DataDisk> dataDisk;

    @Body
    @NameInMap("etcdDisk")
    private String etcdDisk;

    @Body
    @NameInMap("hostName")
    private String hostName;

    @Body
    @NameInMap("labels")
    private java.util.Map < String, ? > labels;

    @Body
    @NameInMap("masterPrivateIPs")
    private java.util.List < String > masterPrivateIPs;

    @Body
    @NameInMap("memory")
    private Integer memory;

    @Body
    @NameInMap("os")
    private String os;

    @Body
    @NameInMap("rootPassword")
    private String rootPassword;

    @Body
    @NameInMap("systemDisk")
    private java.util.List < SystemDisk> systemDisk;

    @Body
    @NameInMap("taints")
    private java.util.List < Taints> taints;

    @Body
    @NameInMap("tridentSystemDisk")
    private String tridentSystemDisk;

    @Body
    @NameInMap("tridentSystemSizeDisk")
    private Integer tridentSystemSizeDisk;

    @Body
    @NameInMap("workerPrivateIPs")
    private java.util.List < String > workerPrivateIPs;

    private AddEnvironmentNodesRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.applicationDisk = builder.applicationDisk;
        this.cpu = builder.cpu;
        this.dataDisk = builder.dataDisk;
        this.etcdDisk = builder.etcdDisk;
        this.hostName = builder.hostName;
        this.labels = builder.labels;
        this.masterPrivateIPs = builder.masterPrivateIPs;
        this.memory = builder.memory;
        this.os = builder.os;
        this.rootPassword = builder.rootPassword;
        this.systemDisk = builder.systemDisk;
        this.taints = builder.taints;
        this.tridentSystemDisk = builder.tridentSystemDisk;
        this.tridentSystemSizeDisk = builder.tridentSystemSizeDisk;
        this.workerPrivateIPs = builder.workerPrivateIPs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddEnvironmentNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return applicationDisk
     */
    public String getApplicationDisk() {
        return this.applicationDisk;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return dataDisk
     */
    public java.util.List < DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return etcdDisk
     */
    public String getEtcdDisk() {
        return this.etcdDisk;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return labels
     */
    public java.util.Map < String, ? > getLabels() {
        return this.labels;
    }

    /**
     * @return masterPrivateIPs
     */
    public java.util.List < String > getMasterPrivateIPs() {
        return this.masterPrivateIPs;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
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
    public java.util.List < SystemDisk> getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return taints
     */
    public java.util.List < Taints> getTaints() {
        return this.taints;
    }

    /**
     * @return tridentSystemDisk
     */
    public String getTridentSystemDisk() {
        return this.tridentSystemDisk;
    }

    /**
     * @return tridentSystemSizeDisk
     */
    public Integer getTridentSystemSizeDisk() {
        return this.tridentSystemSizeDisk;
    }

    /**
     * @return workerPrivateIPs
     */
    public java.util.List < String > getWorkerPrivateIPs() {
        return this.workerPrivateIPs;
    }

    public static final class Builder extends Request.Builder<AddEnvironmentNodesRequest, Builder> {
        private String uid; 
        private String applicationDisk; 
        private Integer cpu; 
        private java.util.List < DataDisk> dataDisk; 
        private String etcdDisk; 
        private String hostName; 
        private java.util.Map < String, ? > labels; 
        private java.util.List < String > masterPrivateIPs; 
        private Integer memory; 
        private String os; 
        private String rootPassword; 
        private java.util.List < SystemDisk> systemDisk; 
        private java.util.List < Taints> taints; 
        private String tridentSystemDisk; 
        private Integer tridentSystemSizeDisk; 
        private java.util.List < String > workerPrivateIPs; 

        private Builder() {
            super();
        } 

        private Builder(AddEnvironmentNodesRequest request) {
            super(request);
            this.uid = request.uid;
            this.applicationDisk = request.applicationDisk;
            this.cpu = request.cpu;
            this.dataDisk = request.dataDisk;
            this.etcdDisk = request.etcdDisk;
            this.hostName = request.hostName;
            this.labels = request.labels;
            this.masterPrivateIPs = request.masterPrivateIPs;
            this.memory = request.memory;
            this.os = request.os;
            this.rootPassword = request.rootPassword;
            this.systemDisk = request.systemDisk;
            this.taints = request.taints;
            this.tridentSystemDisk = request.tridentSystemDisk;
            this.tridentSystemSizeDisk = request.tridentSystemSizeDisk;
            this.workerPrivateIPs = request.workerPrivateIPs;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * applicationDisk.
         */
        public Builder applicationDisk(String applicationDisk) {
            this.putBodyParameter("applicationDisk", applicationDisk);
            this.applicationDisk = applicationDisk;
            return this;
        }

        /**
         * cpu.
         */
        public Builder cpu(Integer cpu) {
            this.putBodyParameter("cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * dataDisk.
         */
        public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
            this.putBodyParameter("dataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * etcdDisk.
         */
        public Builder etcdDisk(String etcdDisk) {
            this.putBodyParameter("etcdDisk", etcdDisk);
            this.etcdDisk = etcdDisk;
            return this;
        }

        /**
         * hostName.
         */
        public Builder hostName(String hostName) {
            this.putBodyParameter("hostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(java.util.Map < String, ? > labels) {
            this.putBodyParameter("labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * masterPrivateIPs.
         */
        public Builder masterPrivateIPs(java.util.List < String > masterPrivateIPs) {
            this.putBodyParameter("masterPrivateIPs", masterPrivateIPs);
            this.masterPrivateIPs = masterPrivateIPs;
            return this;
        }

        /**
         * memory.
         */
        public Builder memory(Integer memory) {
            this.putBodyParameter("memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * os.
         */
        public Builder os(String os) {
            this.putBodyParameter("os", os);
            this.os = os;
            return this;
        }

        /**
         * rootPassword.
         */
        public Builder rootPassword(String rootPassword) {
            this.putBodyParameter("rootPassword", rootPassword);
            this.rootPassword = rootPassword;
            return this;
        }

        /**
         * systemDisk.
         */
        public Builder systemDisk(java.util.List < SystemDisk> systemDisk) {
            this.putBodyParameter("systemDisk", systemDisk);
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * taints.
         */
        public Builder taints(java.util.List < Taints> taints) {
            this.putBodyParameter("taints", taints);
            this.taints = taints;
            return this;
        }

        /**
         * tridentSystemDisk.
         */
        public Builder tridentSystemDisk(String tridentSystemDisk) {
            this.putBodyParameter("tridentSystemDisk", tridentSystemDisk);
            this.tridentSystemDisk = tridentSystemDisk;
            return this;
        }

        /**
         * tridentSystemSizeDisk.
         */
        public Builder tridentSystemSizeDisk(Integer tridentSystemSizeDisk) {
            this.putBodyParameter("tridentSystemSizeDisk", tridentSystemSizeDisk);
            this.tridentSystemSizeDisk = tridentSystemSizeDisk;
            return this;
        }

        /**
         * workerPrivateIPs.
         */
        public Builder workerPrivateIPs(java.util.List < String > workerPrivateIPs) {
            this.putBodyParameter("workerPrivateIPs", workerPrivateIPs);
            this.workerPrivateIPs = workerPrivateIPs;
            return this;
        }

        @Override
        public AddEnvironmentNodesRequest build() {
            return new AddEnvironmentNodesRequest(this);
        } 

    } 

    public static class DataDisk extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("required")
        private Integer required;

        private DataDisk(Builder builder) {
            this.name = builder.name;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return required
         */
        public Integer getRequired() {
            return this.required;
        }

        public static final class Builder {
            private String name; 
            private Integer required; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * required.
             */
            public Builder required(Integer required) {
                this.required = required;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    public static class SystemDisk extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("required")
        private Integer required;

        private SystemDisk(Builder builder) {
            this.name = builder.name;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return required
         */
        public Integer getRequired() {
            return this.required;
        }

        public static final class Builder {
            private String name; 
            private Integer required; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * required.
             */
            public Builder required(Integer required) {
                this.required = required;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
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
