// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DedicatedLine} extends {@link TeaModel}
 *
 * <p>DedicatedLine</p>
 */
public class DedicatedLine extends TeaModel {
    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @NameInMap("DeviceId")
    private String deviceId;

    @NameInMap("DevicePort")
    private String devicePort;

    @NameInMap("Isp")
    private String isp;

    @NameInMap("LineGateway")
    private String lineGateway;

    @NameInMap("LineId")
    private String lineId;

    @NameInMap("LineIp")
    private String lineIp;

    @NameInMap("LineRole")
    private String lineRole;

    private DedicatedLine(Builder builder) {
        this.bandwidth = builder.bandwidth;
        this.deviceId = builder.deviceId;
        this.devicePort = builder.devicePort;
        this.isp = builder.isp;
        this.lineGateway = builder.lineGateway;
        this.lineId = builder.lineId;
        this.lineIp = builder.lineIp;
        this.lineRole = builder.lineRole;
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
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
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
     * @return lineGateway
     */
    public String getLineGateway() {
        return this.lineGateway;
    }

    /**
     * @return lineId
     */
    public String getLineId() {
        return this.lineId;
    }

    /**
     * @return lineIp
     */
    public String getLineIp() {
        return this.lineIp;
    }

    /**
     * @return lineRole
     */
    public String getLineRole() {
        return this.lineRole;
    }

    public static final class Builder {
        private Integer bandwidth; 
        private String deviceId; 
        private String devicePort; 
        private String isp; 
        private String lineGateway; 
        private String lineId; 
        private String lineIp; 
        private String lineRole; 

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
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
         * LineGateway.
         */
        public Builder lineGateway(String lineGateway) {
            this.lineGateway = lineGateway;
            return this;
        }

        /**
         * LineId.
         */
        public Builder lineId(String lineId) {
            this.lineId = lineId;
            return this;
        }

        /**
         * LineIp.
         */
        public Builder lineIp(String lineIp) {
            this.lineIp = lineIp;
            return this;
        }

        /**
         * LineRole.
         */
        public Builder lineRole(String lineRole) {
            this.lineRole = lineRole;
            return this;
        }

        public DedicatedLine build() {
            return new DedicatedLine(this);
        } 

    } 

}
