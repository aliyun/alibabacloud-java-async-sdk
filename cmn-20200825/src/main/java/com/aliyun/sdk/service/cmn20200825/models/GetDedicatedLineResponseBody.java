// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDedicatedLineResponseBody} extends {@link TeaModel}
 *
 * <p>GetDedicatedLineResponseBody</p>
 */
public class GetDedicatedLineResponseBody extends TeaModel {
    @NameInMap("DedicatedLine")
    private DedicatedLine dedicatedLine;

    @NameInMap("RequestId")
    private String requestId;

    private GetDedicatedLineResponseBody(Builder builder) {
        this.dedicatedLine = builder.dedicatedLine;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDedicatedLineResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedLine
     */
    public DedicatedLine getDedicatedLine() {
        return this.dedicatedLine;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DedicatedLine dedicatedLine; 
        private String requestId; 

        /**
         * DedicatedLine.
         */
        public Builder dedicatedLine(DedicatedLine dedicatedLine) {
            this.dedicatedLine = dedicatedLine;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDedicatedLineResponseBody build() {
            return new GetDedicatedLineResponseBody(this);
        } 

    } 

    public static class DedicatedLine extends TeaModel {
        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("DedicatedLineGateway")
        private String dedicatedLineGateway;

        @NameInMap("DedicatedLineId")
        private String dedicatedLineId;

        @NameInMap("DedicatedLineIp")
        private String dedicatedLineIp;

        @NameInMap("DedicatedLineRole")
        private String dedicatedLineRole;

        @NameInMap("Description")
        private String description;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("DevicePort")
        private String devicePort;

        @NameInMap("Isp")
        private String isp;

        @NameInMap("PhysicalSpaceId")
        private String physicalSpaceId;

        private DedicatedLine(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.dedicatedLineGateway = builder.dedicatedLineGateway;
            this.dedicatedLineId = builder.dedicatedLineId;
            this.dedicatedLineIp = builder.dedicatedLineIp;
            this.dedicatedLineRole = builder.dedicatedLineRole;
            this.description = builder.description;
            this.deviceId = builder.deviceId;
            this.deviceName = builder.deviceName;
            this.devicePort = builder.devicePort;
            this.isp = builder.isp;
            this.physicalSpaceId = builder.physicalSpaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedLine create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return dedicatedLineGateway
         */
        public String getDedicatedLineGateway() {
            return this.dedicatedLineGateway;
        }

        /**
         * @return dedicatedLineId
         */
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

        /**
         * @return dedicatedLineIp
         */
        public String getDedicatedLineIp() {
            return this.dedicatedLineIp;
        }

        /**
         * @return dedicatedLineRole
         */
        public String getDedicatedLineRole() {
            return this.dedicatedLineRole;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return devicePort
         */
        public String getDevicePort() {
            return this.devicePort;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return physicalSpaceId
         */
        public String getPhysicalSpaceId() {
            return this.physicalSpaceId;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String dedicatedLineGateway; 
            private String dedicatedLineId; 
            private String dedicatedLineIp; 
            private String dedicatedLineRole; 
            private String description; 
            private String deviceId; 
            private String deviceName; 
            private String devicePort; 
            private String isp; 
            private String physicalSpaceId; 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * DedicatedLineGateway.
             */
            public Builder dedicatedLineGateway(String dedicatedLineGateway) {
                this.dedicatedLineGateway = dedicatedLineGateway;
                return this;
            }

            /**
             * DedicatedLineId.
             */
            public Builder dedicatedLineId(String dedicatedLineId) {
                this.dedicatedLineId = dedicatedLineId;
                return this;
            }

            /**
             * DedicatedLineIp.
             */
            public Builder dedicatedLineIp(String dedicatedLineIp) {
                this.dedicatedLineIp = dedicatedLineIp;
                return this;
            }

            /**
             * DedicatedLineRole.
             */
            public Builder dedicatedLineRole(String dedicatedLineRole) {
                this.dedicatedLineRole = dedicatedLineRole;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * DevicePort.
             */
            public Builder devicePort(String devicePort) {
                this.devicePort = devicePort;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * PhysicalSpaceId.
             */
            public Builder physicalSpaceId(String physicalSpaceId) {
                this.physicalSpaceId = physicalSpaceId;
                return this;
            }

            public DedicatedLine build() {
                return new DedicatedLine(this);
            } 

        } 

    }
}
