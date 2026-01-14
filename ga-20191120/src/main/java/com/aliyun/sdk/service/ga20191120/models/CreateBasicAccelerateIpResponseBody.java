// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateBasicAccelerateIpResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBasicAccelerateIpResponseBody</p>
 */
public class CreateBasicAccelerateIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccelerateIpAddress")
    private String accelerateIpAddress;

    @com.aliyun.core.annotation.NameInMap("AccelerateIpId")
    private String accelerateIpId;

    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.NameInMap("IpSetId")
    private String ipSetId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateBasicAccelerateIpResponseBody model) {
            this.accelerateIpAddress = model.accelerateIpAddress;
            this.accelerateIpId = model.accelerateIpId;
            this.acceleratorId = model.acceleratorId;
            this.ipSetId = model.ipSetId;
            this.requestId = model.requestId;
            this.state = model.state;
        } 

        /**
         * <p>The accelerated IP address of the basic GA instance.</p>
         * <blockquote>
         * <p> This parameter is unavailable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>116.132.XX.XX</p>
         */
        public Builder accelerateIpAddress(String accelerateIpAddress) {
            this.accelerateIpAddress = accelerateIpAddress;
            return this;
        }

        /**
         * <p>The ID of the accelerated IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>gaip-bp1****</p>
         */
        public Builder accelerateIpId(String accelerateIpId) {
            this.accelerateIpId = accelerateIpId;
            return this;
        }

        /**
         * <p>The ID of the basic GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp17frjjh0udz4qz****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * <p>The ID of the acceleration region.</p>
         * 
         * <strong>example:</strong>
         * <p>ips-bp11r5jb8ogp122xl****</p>
         */
        public Builder ipSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the accelerated IP address. Valid values:</p>
         * <p><strong>init:</strong> The accelerated IP address is being initialized.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
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
