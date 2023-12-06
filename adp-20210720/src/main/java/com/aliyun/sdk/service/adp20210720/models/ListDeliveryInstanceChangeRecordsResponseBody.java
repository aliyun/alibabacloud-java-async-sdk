// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeliveryInstanceChangeRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeliveryInstanceChangeRecordsResponseBody</p>
 */
public class ListDeliveryInstanceChangeRecordsResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("msg")
    private String msg;

    private ListDeliveryInstanceChangeRecordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeliveryInstanceChangeRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String msg; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public ListDeliveryInstanceChangeRecordsResponseBody build() {
            return new ListDeliveryInstanceChangeRecordsResponseBody(this);
        } 

    } 

    public static class EnvNodeInfo extends TeaModel {
        @NameInMap("capacity")
        private String capacity;

        @NameInMap("cpu")
        private String cpu;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("label")
        private java.util.Map < String, ? > label;

        @NameInMap("memory")
        private String memory;

        @NameInMap("name")
        private String name;

        @NameInMap("privateIP")
        private String privateIP;

        @NameInMap("taints")
        private java.util.Map < String, ? > taints;

        private EnvNodeInfo(Builder builder) {
            this.capacity = builder.capacity;
            this.cpu = builder.cpu;
            this.identifier = builder.identifier;
            this.label = builder.label;
            this.memory = builder.memory;
            this.name = builder.name;
            this.privateIP = builder.privateIP;
            this.taints = builder.taints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvNodeInfo create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public String getCapacity() {
            return this.capacity;
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return label
         */
        public java.util.Map < String, ? > getLabel() {
            return this.label;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return privateIP
         */
        public String getPrivateIP() {
            return this.privateIP;
        }

        /**
         * @return taints
         */
        public java.util.Map < String, ? > getTaints() {
            return this.taints;
        }

        public static final class Builder {
            private String capacity; 
            private String cpu; 
            private String identifier; 
            private java.util.Map < String, ? > label; 
            private String memory; 
            private String name; 
            private String privateIP; 
            private java.util.Map < String, ? > taints; 

            /**
             * capacity.
             */
            public Builder capacity(String capacity) {
                this.capacity = capacity;
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
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * label.
             */
            public Builder label(java.util.Map < String, ? > label) {
                this.label = label;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * taints.
             */
            public Builder taints(java.util.Map < String, ? > taints) {
                this.taints = taints;
                return this;
            }

            public EnvNodeInfo build() {
                return new EnvNodeInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("deliverableUID")
        private String deliverableUID;

        @NameInMap("envChangeRecords")
        private java.util.Map < String, ? > envChangeRecords;

        @NameInMap("envNodeInfo")
        private java.util.List < EnvNodeInfo> envNodeInfo;

        @NameInMap("envPackageConfig")
        private String envPackageConfig;

        @NameInMap("originDeliverableUID")
        private String originDeliverableUID;

        @NameInMap("uid")
        private String uid;

        private Data(Builder builder) {
            this.deliverableUID = builder.deliverableUID;
            this.envChangeRecords = builder.envChangeRecords;
            this.envNodeInfo = builder.envNodeInfo;
            this.envPackageConfig = builder.envPackageConfig;
            this.originDeliverableUID = builder.originDeliverableUID;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deliverableUID
         */
        public String getDeliverableUID() {
            return this.deliverableUID;
        }

        /**
         * @return envChangeRecords
         */
        public java.util.Map < String, ? > getEnvChangeRecords() {
            return this.envChangeRecords;
        }

        /**
         * @return envNodeInfo
         */
        public java.util.List < EnvNodeInfo> getEnvNodeInfo() {
            return this.envNodeInfo;
        }

        /**
         * @return envPackageConfig
         */
        public String getEnvPackageConfig() {
            return this.envPackageConfig;
        }

        /**
         * @return originDeliverableUID
         */
        public String getOriginDeliverableUID() {
            return this.originDeliverableUID;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String deliverableUID; 
            private java.util.Map < String, ? > envChangeRecords; 
            private java.util.List < EnvNodeInfo> envNodeInfo; 
            private String envPackageConfig; 
            private String originDeliverableUID; 
            private String uid; 

            /**
             * deliverableUID.
             */
            public Builder deliverableUID(String deliverableUID) {
                this.deliverableUID = deliverableUID;
                return this;
            }

            /**
             * envChangeRecords.
             */
            public Builder envChangeRecords(java.util.Map < String, ? > envChangeRecords) {
                this.envChangeRecords = envChangeRecords;
                return this;
            }

            /**
             * envNodeInfo.
             */
            public Builder envNodeInfo(java.util.List < EnvNodeInfo> envNodeInfo) {
                this.envNodeInfo = envNodeInfo;
                return this;
            }

            /**
             * envPackageConfig.
             */
            public Builder envPackageConfig(String envPackageConfig) {
                this.envPackageConfig = envPackageConfig;
                return this;
            }

            /**
             * originDeliverableUID.
             */
            public Builder originDeliverableUID(String originDeliverableUID) {
                this.originDeliverableUID = originDeliverableUID;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
