// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicIpSetResponseBody} extends {@link TeaModel}
 *
 * <p>GetBasicIpSetResponseBody</p>
 */
public class GetBasicIpSetResponseBody extends TeaModel {
    @NameInMap("AccelerateRegionId")
    private String accelerateRegionId;

    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("Bandwidth")
    private Long bandwidth;

    @NameInMap("IpAddress")
    private String ipAddress;

    @NameInMap("IpSetId")
    private String ipSetId;

    @NameInMap("IpVersion")
    private String ipVersion;

    @NameInMap("IspType")
    private String ispType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
    private String state;

    private GetBasicIpSetResponseBody(Builder builder) {
        this.accelerateRegionId = builder.accelerateRegionId;
        this.acceleratorId = builder.acceleratorId;
        this.bandwidth = builder.bandwidth;
        this.ipAddress = builder.ipAddress;
        this.ipSetId = builder.ipSetId;
        this.ipVersion = builder.ipVersion;
        this.ispType = builder.ispType;
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBasicIpSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return accelerateRegionId
     */
    public String getAccelerateRegionId() {
        return this.accelerateRegionId;
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return bandwidth
     */
    public Long getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return ipAddress
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * @return ipSetId
     */
    public String getIpSetId() {
        return this.ipSetId;
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return ispType
     */
    public String getIspType() {
        return this.ispType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String accelerateRegionId; 
        private String acceleratorId; 
        private Long bandwidth; 
        private String ipAddress; 
        private String ipSetId; 
        private String ipVersion; 
        private String ispType; 
        private String requestId; 
        private String state; 

        /**
         * The ID of the region where the basic GA instance is deployed.
         */
        public Builder accelerateRegionId(String accelerateRegionId) {
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }

        /**
         * The ID of the basic GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The bandwidth of the acceleration region of the basic GA instance. Unit: Mbit/s.
         */
        public Builder bandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The accelerated IP address.
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * The ID of the acceleration region of the basic GA instance.
         */
        public Builder ipSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }

        /**
         * The version of the accelerated IP address. Only **IPv4** is returned. This indicates that an IPv4 address is used.
         */
        public Builder ipVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * IspType.
         */
        public Builder ispType(String ispType) {
            this.ispType = ispType;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the acceleration region of the basic GA instance. Valid values:
         * <p>
         * 
         * *   **init**: The acceleration region is being initialized.
         * *   **active**: The acceleration region is in the running state.
         * *   **updating**: The acceleration region is being configured.
         * *   **Deleting**: The acceleration region is being deleted.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public GetBasicIpSetResponseBody build() {
            return new GetBasicIpSetResponseBody(this);
        } 

    } 

}
