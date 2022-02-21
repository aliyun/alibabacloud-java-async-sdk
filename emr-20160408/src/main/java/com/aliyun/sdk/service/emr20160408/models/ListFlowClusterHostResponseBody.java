// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowClusterHostResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowClusterHostResponseBody</p>
 */
public class ListFlowClusterHostResponseBody extends TeaModel {
    @NameInMap("HostList")
    private HostList hostList;

    @NameInMap("RequestId")
    private String requestId;

    private ListFlowClusterHostResponseBody(Builder builder) {
        this.hostList = builder.hostList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowClusterHostResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostList
     */
    public HostList getHostList() {
        return this.hostList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private HostList hostList; 
        private String requestId; 

        /**
         * HostList.
         */
        public Builder hostList(HostList hostList) {
            this.hostList = hostList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFlowClusterHostResponseBody build() {
            return new ListFlowClusterHostResponseBody(this);
        } 

    } 

    public static class HostListHost extends TeaModel {
        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("HostId")
        private String hostId;

        @NameInMap("HostInstanceId")
        private String hostInstanceId;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("PrivateIp")
        private String privateIp;

        @NameInMap("PublicIp")
        private String publicIp;

        @NameInMap("Role")
        private String role;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private HostListHost(Builder builder) {
            this.cpu = builder.cpu;
            this.hostId = builder.hostId;
            this.hostInstanceId = builder.hostInstanceId;
            this.hostName = builder.hostName;
            this.instanceType = builder.instanceType;
            this.memory = builder.memory;
            this.privateIp = builder.privateIp;
            this.publicIp = builder.publicIp;
            this.role = builder.role;
            this.serialNumber = builder.serialNumber;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostListHost create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return hostInstanceId
         */
        public String getHostInstanceId() {
            return this.hostInstanceId;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
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
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer cpu; 
            private String hostId; 
            private String hostInstanceId; 
            private String hostName; 
            private String instanceType; 
            private Integer memory; 
            private String privateIp; 
            private String publicIp; 
            private String role; 
            private String serialNumber; 
            private String status; 
            private String type; 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * HostId.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * HostInstanceId.
             */
            public Builder hostInstanceId(String hostInstanceId) {
                this.hostInstanceId = hostInstanceId;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * PrivateIp.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * PublicIp.
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public HostListHost build() {
                return new HostListHost(this);
            } 

        } 

    }
    public static class HostList extends TeaModel {
        @NameInMap("Host")
        private java.util.List < HostListHost> host;

        private HostList(Builder builder) {
            this.host = builder.host;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostList create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public java.util.List < HostListHost> getHost() {
            return this.host;
        }

        public static final class Builder {
            private java.util.List < HostListHost> host; 

            /**
             * Host.
             */
            public Builder host(java.util.List < HostListHost> host) {
                this.host = host;
                return this;
            }

            public HostList build() {
                return new HostList(this);
            } 

        } 

    }
}
