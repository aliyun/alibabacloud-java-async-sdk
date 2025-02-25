// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateVirtualNodeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVirtualNodeResponseBody</p>
 */
public class CreateVirtualNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VirtualNodeId")
    private String virtualNodeId;

    private CreateVirtualNodeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.virtualNodeId = builder.virtualNodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirtualNodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return virtualNodeId
     */
    public String getVirtualNodeId() {
        return this.virtualNodeId;
    }

    public static final class Builder {
        private String requestId; 
        private String virtualNodeId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>89164E78-FC82-4684-BE97-DCDD85D26546</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the VNode.</p>
         * 
         * <strong>example:</strong>
         * <p>vnd-2ze960zkdqrldeaw****</p>
         */
        public Builder virtualNodeId(String virtualNodeId) {
            this.virtualNodeId = virtualNodeId;
            return this;
        }

        public CreateVirtualNodeResponseBody build() {
            return new CreateVirtualNodeResponseBody(this);
        } 

    } 

}
