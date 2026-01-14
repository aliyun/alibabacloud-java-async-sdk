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
 * {@link DeleteBasicAccelerateIpEndpointRelationResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBasicAccelerateIpEndpointRelationResponseBody</p>
 */
public class DeleteBasicAccelerateIpEndpointRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccelerateIpId")
    private String accelerateIpId;

    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.NameInMap("EndpointId")
    private String endpointId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private DeleteBasicAccelerateIpEndpointRelationResponseBody(Builder builder) {
        this.accelerateIpId = builder.accelerateIpId;
        this.acceleratorId = builder.acceleratorId;
        this.endpointId = builder.endpointId;
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBasicAccelerateIpEndpointRelationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
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
        private String accelerateIpId; 
        private String acceleratorId; 
        private String endpointId; 
        private String requestId; 
        private String state; 

        private Builder() {
        } 

        private Builder(DeleteBasicAccelerateIpEndpointRelationResponseBody model) {
            this.accelerateIpId = model.accelerateIpId;
            this.acceleratorId = model.acceleratorId;
            this.endpointId = model.endpointId;
            this.requestId = model.requestId;
            this.state = model.state;
        } 

        /**
         * <p>The ID of the accelerated IP address of the basic GA instance.</p>
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
         * <p>The ID of the endpoint that is associated with the basic GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-bp14sz7ftcwwjgrdm****</p>
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
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
         * <p>The status of the mapping between the accelerated IP address and endpoint.</p>
         * <blockquote>
         * <p> This parameter is not in use and empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public DeleteBasicAccelerateIpEndpointRelationResponseBody build() {
            return new DeleteBasicAccelerateIpEndpointRelationResponseBody(this);
        } 

    } 

}
