// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Resource} extends {@link TeaModel}
 *
 * <p>Resource</p>
 */
public class Resource extends TeaModel {
    @NameInMap("cpu")
    private Cpu cpu;

    @NameInMap("hostname")
    private String hostname;

    @NameInMap("identifier")
    @Validation(required = true)
    private String identifier;

    @NameInMap("image")
    private Image image;

    @NameInMap("instanceType")
    private String instanceType;

    @NameInMap("memory")
    private Memory memory;

    @NameInMap("ports")
    private java.util.List < ExportPort > ports;

    @NameInMap("publicIP")
    private PublicIP publicIP;

    @NameInMap("replica")
    private Integer replica;

    @NameInMap("storage")
    private java.util.List < Storage> storage;

    private Resource(Builder builder) {
        this.cpu = builder.cpu;
        this.hostname = builder.hostname;
        this.identifier = builder.identifier;
        this.image = builder.image;
        this.instanceType = builder.instanceType;
        this.memory = builder.memory;
        this.ports = builder.ports;
        this.publicIP = builder.publicIP;
        this.replica = builder.replica;
        this.storage = builder.storage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Resource create() {
        return builder().build();
    }

    /**
     * @return cpu
     */
    public Cpu getCpu() {
        return this.cpu;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return image
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return memory
     */
    public Memory getMemory() {
        return this.memory;
    }

    /**
     * @return ports
     */
    public java.util.List < ExportPort > getPorts() {
        return this.ports;
    }

    /**
     * @return publicIP
     */
    public PublicIP getPublicIP() {
        return this.publicIP;
    }

    /**
     * @return replica
     */
    public Integer getReplica() {
        return this.replica;
    }

    /**
     * @return storage
     */
    public java.util.List < Storage> getStorage() {
        return this.storage;
    }

    public static final class Builder {
        private Cpu cpu; 
        private String hostname; 
        private String identifier; 
        private Image image; 
        private String instanceType; 
        private Memory memory; 
        private java.util.List < ExportPort > ports; 
        private PublicIP publicIP; 
        private Integer replica; 
        private java.util.List < Storage> storage; 

        /**
         * cpu.
         */
        public Builder cpu(Cpu cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * hostname.
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
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
         * image.
         */
        public Builder image(Image image) {
            this.image = image;
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
         * memory.
         */
        public Builder memory(Memory memory) {
            this.memory = memory;
            return this;
        }

        /**
         * ports.
         */
        public Builder ports(java.util.List < ExportPort > ports) {
            this.ports = ports;
            return this;
        }

        /**
         * publicIP.
         */
        public Builder publicIP(PublicIP publicIP) {
            this.publicIP = publicIP;
            return this;
        }

        /**
         * replica.
         */
        public Builder replica(Integer replica) {
            this.replica = replica;
            return this;
        }

        /**
         * storage.
         */
        public Builder storage(java.util.List < Storage> storage) {
            this.storage = storage;
            return this;
        }

        public Resource build() {
            return new Resource(this);
        } 

    } 

    public static class Cpu extends TeaModel {
        @NameInMap("required")
        private Integer required;

        private Cpu(Builder builder) {
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cpu create() {
            return builder().build();
        }

        /**
         * @return required
         */
        public Integer getRequired() {
            return this.required;
        }

        public static final class Builder {
            private Integer required; 

            /**
             * required.
             */
            public Builder required(Integer required) {
                this.required = required;
                return this;
            }

            public Cpu build() {
                return new Cpu(this);
            } 

        } 

    }
    public static class Image extends TeaModel {
        @NameInMap("id")
        private String id;

        @NameInMap("nameRegex")
        private String nameRegex;

        private Image(Builder builder) {
            this.id = builder.id;
            this.nameRegex = builder.nameRegex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return nameRegex
         */
        public String getNameRegex() {
            return this.nameRegex;
        }

        public static final class Builder {
            private String id; 
            private String nameRegex; 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * nameRegex.
             */
            public Builder nameRegex(String nameRegex) {
                this.nameRegex = nameRegex;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    public static class Memory extends TeaModel {
        @NameInMap("required")
        private Integer required;

        private Memory(Builder builder) {
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Memory create() {
            return builder().build();
        }

        /**
         * @return required
         */
        public Integer getRequired() {
            return this.required;
        }

        public static final class Builder {
            private Integer required; 

            /**
             * required.
             */
            public Builder required(Integer required) {
                this.required = required;
                return this;
            }

            public Memory build() {
                return new Memory(this);
            } 

        } 

    }
    public static class PublicIP extends TeaModel {
        @NameInMap("bandwidth")
        private Integer bandwidth;

        @NameInMap("required")
        private Integer required;

        private PublicIP(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIP create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return required
         */
        public Integer getRequired() {
            return this.required;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private Integer required; 

            /**
             * bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * required.
             */
            public Builder required(Integer required) {
                this.required = required;
                return this;
            }

            public PublicIP build() {
                return new PublicIP(this);
            } 

        } 

    }
    public static class Storage extends TeaModel {
        @NameInMap("required")
        private Integer required;

        private Storage(Builder builder) {
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Storage create() {
            return builder().build();
        }

        /**
         * @return required
         */
        public Integer getRequired() {
            return this.required;
        }

        public static final class Builder {
            private Integer required; 

            /**
             * required.
             */
            public Builder required(Integer required) {
                this.required = required;
                return this;
            }

            public Storage build() {
                return new Storage(this);
            } 

        } 

    }
}
