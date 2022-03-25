// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVirtualNodeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVirtualNodeResponseBody</p>
 */
public class CreateVirtualNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VirtualNodeId")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VirtualNodeId.
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
