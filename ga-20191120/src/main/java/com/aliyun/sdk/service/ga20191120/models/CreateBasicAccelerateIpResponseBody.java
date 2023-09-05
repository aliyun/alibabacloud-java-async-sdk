// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicAccelerateIpResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBasicAccelerateIpResponseBody</p>
 */
public class CreateBasicAccelerateIpResponseBody extends TeaModel {
    @NameInMap("AccelerateIpAddress")
    private String accelerateIpAddress;

    @NameInMap("AccelerateIpId")
    private String accelerateIpId;

    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("IpSetId")
    private String ipSetId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
    private String state;

    private CreateBasicAccelerateIpResponseBody(Builder builder) {
        this.accelerateIpAddress = builder.accelerateIpAddress;
        this.accelerateIpId = builder.accelerateIpId;
        this.acceleratorId = builder.acceleratorId;
        this.ipSetId = builder.ipSetId;
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicAccelerateIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return accelerateIpAddress
     */
    public String getAccelerateIpAddress() {
        return this.accelerateIpAddress;
    }

    /**
     * @return accelerateIpId
     */
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return ipSetId
     */
    public String getIpSetId() {
        return this.ipSetId;
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
        private String accelerateIpAddress; 
        private String accelerateIpId; 
        private String acceleratorId; 
        private String ipSetId; 
        private String requestId; 
        private String state; 

        /**
         * The accelerated IP address.
         */
        public Builder accelerateIpAddress(String accelerateIpAddress) {
            this.accelerateIpAddress = accelerateIpAddress;
            return this;
        }

        /**
         * The ID of the accelerated IP address.
         */
        public Builder accelerateIpId(String accelerateIpId) {
            this.accelerateIpId = accelerateIpId;
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
         * The ID of the acceleration region.
         */
        public Builder ipSetId(String ipSetId) {
            this.ipSetId = ipSetId;
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
         * The status of the accelerated IP address.
         * <p>
         * 
         * >  This parameter returns an empty string because the parameter is not in use.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public CreateBasicAccelerateIpResponseBody build() {
            return new CreateBasicAccelerateIpResponseBody(this);
        } 

    } 

}
