// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPhysicalSpaceTopoResponseBody} extends {@link TeaModel}
 *
 * <p>GetPhysicalSpaceTopoResponseBody</p>
 */
public class GetPhysicalSpaceTopoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TopoData")
    private TopoData topoData;

    private GetPhysicalSpaceTopoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.topoData = builder.topoData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhysicalSpaceTopoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return topoData
     */
    public TopoData getTopoData() {
        return this.topoData;
    }

    public static final class Builder {
        private String requestId; 
        private TopoData topoData; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TopoData.
         */
        public Builder topoData(TopoData topoData) {
            this.topoData = topoData;
            return this;
        }

        public GetPhysicalSpaceTopoResponseBody build() {
            return new GetPhysicalSpaceTopoResponseBody(this);
        } 

    } 

    public static class Devices extends TeaModel {
        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceRole")
        private String deviceRole;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("Ip")
        private String ip;

        private Devices(Builder builder) {
            this.deviceId = builder.deviceId;
            this.deviceRole = builder.deviceRole;
            this.hostName = builder.hostName;
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceRole
         */
        public String getDeviceRole() {
            return this.deviceRole;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private String deviceId; 
            private String deviceRole; 
            private String hostName; 
            private String ip; 

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceRole.
             */
            public Builder deviceRole(String deviceRole) {
                this.deviceRole = deviceRole;
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
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
    public static class Links extends TeaModel {
        @NameInMap("SourceDeviceId")
        private String sourceDeviceId;

        @NameInMap("SourceDeviceName")
        private String sourceDeviceName;

        @NameInMap("SourcePort")
        private String sourcePort;

        @NameInMap("TargetDeviceId")
        private String targetDeviceId;

        @NameInMap("TargetDeviceName")
        private String targetDeviceName;

        @NameInMap("TargetPort")
        private String targetPort;

        private Links(Builder builder) {
            this.sourceDeviceId = builder.sourceDeviceId;
            this.sourceDeviceName = builder.sourceDeviceName;
            this.sourcePort = builder.sourcePort;
            this.targetDeviceId = builder.targetDeviceId;
            this.targetDeviceName = builder.targetDeviceName;
            this.targetPort = builder.targetPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Links create() {
            return builder().build();
        }

        /**
         * @return sourceDeviceId
         */
        public String getSourceDeviceId() {
            return this.sourceDeviceId;
        }

        /**
         * @return sourceDeviceName
         */
        public String getSourceDeviceName() {
            return this.sourceDeviceName;
        }

        /**
         * @return sourcePort
         */
        public String getSourcePort() {
            return this.sourcePort;
        }

        /**
         * @return targetDeviceId
         */
        public String getTargetDeviceId() {
            return this.targetDeviceId;
        }

        /**
         * @return targetDeviceName
         */
        public String getTargetDeviceName() {
            return this.targetDeviceName;
        }

        /**
         * @return targetPort
         */
        public String getTargetPort() {
            return this.targetPort;
        }

        public static final class Builder {
            private String sourceDeviceId; 
            private String sourceDeviceName; 
            private String sourcePort; 
            private String targetDeviceId; 
            private String targetDeviceName; 
            private String targetPort; 

            /**
             * SourceDeviceId.
             */
            public Builder sourceDeviceId(String sourceDeviceId) {
                this.sourceDeviceId = sourceDeviceId;
                return this;
            }

            /**
             * SourceDeviceName.
             */
            public Builder sourceDeviceName(String sourceDeviceName) {
                this.sourceDeviceName = sourceDeviceName;
                return this;
            }

            /**
             * SourcePort.
             */
            public Builder sourcePort(String sourcePort) {
                this.sourcePort = sourcePort;
                return this;
            }

            /**
             * TargetDeviceId.
             */
            public Builder targetDeviceId(String targetDeviceId) {
                this.targetDeviceId = targetDeviceId;
                return this;
            }

            /**
             * TargetDeviceName.
             */
            public Builder targetDeviceName(String targetDeviceName) {
                this.targetDeviceName = targetDeviceName;
                return this;
            }

            /**
             * TargetPort.
             */
            public Builder targetPort(String targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            public Links build() {
                return new Links(this);
            } 

        } 

    }
    public static class TopoData extends TeaModel {
        @NameInMap("Devices")
        private java.util.List < Devices> devices;

        @NameInMap("Links")
        private java.util.List < Links> links;

        @NameInMap("UpdateTime")
        private String updateTime;

        private TopoData(Builder builder) {
            this.devices = builder.devices;
            this.links = builder.links;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopoData create() {
            return builder().build();
        }

        /**
         * @return devices
         */
        public java.util.List < Devices> getDevices() {
            return this.devices;
        }

        /**
         * @return links
         */
        public java.util.List < Links> getLinks() {
            return this.links;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List < Devices> devices; 
            private java.util.List < Links> links; 
            private String updateTime; 

            /**
             * Devices.
             */
            public Builder devices(java.util.List < Devices> devices) {
                this.devices = devices;
                return this;
            }

            /**
             * Links.
             */
            public Builder links(java.util.List < Links> links) {
                this.links = links;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public TopoData build() {
                return new TopoData(this);
            } 

        } 

    }
}
