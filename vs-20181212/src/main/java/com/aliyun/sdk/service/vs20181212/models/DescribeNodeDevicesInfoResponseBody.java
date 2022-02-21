// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeDevicesInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeDevicesInfoResponseBody</p>
 */
public class DescribeNodeDevicesInfoResponseBody extends TeaModel {
    @NameInMap("NodeDevices")
    private java.util.List < NodeDevices> nodeDevices;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeNodeDevicesInfoResponseBody(Builder builder) {
        this.nodeDevices = builder.nodeDevices;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeDevicesInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodeDevices
     */
    public java.util.List < NodeDevices> getNodeDevices() {
        return this.nodeDevices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < NodeDevices> nodeDevices; 
        private String requestId; 

        /**
         * NodeDevices.
         */
        public Builder nodeDevices(java.util.List < NodeDevices> nodeDevices) {
            this.nodeDevices = nodeDevices;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNodeDevicesInfoResponseBody build() {
            return new DescribeNodeDevicesInfoResponseBody(this);
        } 

    } 

    public static class DeviceInfos extends TeaModel {
        @NameInMap("IP")
        private String IP;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Server")
        private String server;

        private DeviceInfos(Builder builder) {
            this.IP = builder.IP;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.server = builder.server;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfos create() {
            return builder().build();
        }

        /**
         * @return IP
         */
        public String getIP() {
            return this.IP;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        public static final class Builder {
            private String IP; 
            private String instanceId; 
            private String name; 
            private String server; 

            /**
             * IP.
             */
            public Builder IP(String IP) {
                this.IP = IP;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * Server.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            public DeviceInfos build() {
                return new DeviceInfos(this);
            } 

        } 

    }
    public static class NodeDevices extends TeaModel {
        @NameInMap("DeviceInfos")
        private java.util.List < DeviceInfos> deviceInfos;

        @NameInMap("NodeName")
        private String nodeName;

        private NodeDevices(Builder builder) {
            this.deviceInfos = builder.deviceInfos;
            this.nodeName = builder.nodeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeDevices create() {
            return builder().build();
        }

        /**
         * @return deviceInfos
         */
        public java.util.List < DeviceInfos> getDeviceInfos() {
            return this.deviceInfos;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        public static final class Builder {
            private java.util.List < DeviceInfos> deviceInfos; 
            private String nodeName; 

            /**
             * DeviceInfos.
             */
            public Builder deviceInfos(java.util.List < DeviceInfos> deviceInfos) {
                this.deviceInfos = deviceInfos;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            public NodeDevices build() {
                return new NodeDevices(this);
            } 

        } 

    }
}
