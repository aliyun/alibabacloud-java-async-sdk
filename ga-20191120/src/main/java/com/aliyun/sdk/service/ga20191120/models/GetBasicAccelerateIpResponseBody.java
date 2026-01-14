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
 * {@link GetBasicAccelerateIpResponseBody} extends {@link TeaModel}
 *
 * <p>GetBasicAccelerateIpResponseBody</p>
 */
public class GetBasicAccelerateIpResponseBody extends TeaModel {
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

    private GetBasicAccelerateIpResponseBody(Builder builder) {
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

    public static GetBasicAccelerateIpResponseBody create() {
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

        private Builder(GetBasicAccelerateIpResponseBody model) {
            this.accelerateIpAddress = model.accelerateIpAddress;
            this.accelerateIpId = model.accelerateIpId;
            this.acceleratorId = model.acceleratorId;
            this.ipSetId = model.ipSetId;
            this.requestId = model.requestId;
            this.state = model.state;
        } 

        /**
         * <p>The accelerated IP address of the basic GA instance.</p>
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
         * <p>The ID of the basic GA instance to which the queried accelerated IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp17frjjh0udz4qz****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * <p>The ID of the acceleration region of the basic GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ips-bp11r5jb8ogp122xl****</p>
         */
        public Builder ipSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
         * <ul>
         * <li><strong>active</strong>: The accelerated IP address is available.</li>
         * <li><strong>binding</strong>: The accelerated IP address is being associated.</li>
         * <li><strong>bound</strong>: The accelerated IP address is associated.</li>
         * <li><strong>unbinding</strong>: The accelerated IP address is being disassociated.</li>
         * <li><strong>deleting</strong>: The GA instance is being deleted.</li>
         * </ul>
         * <blockquote>
         * <p> If the accelerated IP address is being created, this parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public GetBasicAccelerateIpResponseBody build() {
            return new GetBasicAccelerateIpResponseBody(this);
        } 

    } 

}
