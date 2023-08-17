// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcPeerConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpcPeerConnectionResponseBody</p>
 */
public class CreateVpcPeerConnectionResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateVpcPeerConnectionResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcPeerConnectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceId; 
        private String requestId; 

        /**
         * The ID of the VPC peering connection.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateVpcPeerConnectionResponseBody build() {
            return new CreateVpcPeerConnectionResponseBody(this);
        } 

    } 

}
