// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EdgeClusterAddEdgeMachineResponseBody} extends {@link TeaModel}
 *
 * <p>EdgeClusterAddEdgeMachineResponseBody</p>
 */
public class EdgeClusterAddEdgeMachineResponseBody extends TeaModel {
    @NameInMap("request_id")
    private String requestId;

    @NameInMap("edge_machine_id")
    private String edgeMachineId;

    private EdgeClusterAddEdgeMachineResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.edgeMachineId = builder.edgeMachineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EdgeClusterAddEdgeMachineResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return edgeMachineId
     */
    public String getEdgeMachineId() {
        return this.edgeMachineId;
    }

    public static final class Builder {
        private String requestId; 
        private String edgeMachineId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the cloud-native all-in-one machine.
         */
        public Builder edgeMachineId(String edgeMachineId) {
            this.edgeMachineId = edgeMachineId;
            return this;
        }

        public EdgeClusterAddEdgeMachineResponseBody build() {
            return new EdgeClusterAddEdgeMachineResponseBody(this);
        } 

    } 

}
