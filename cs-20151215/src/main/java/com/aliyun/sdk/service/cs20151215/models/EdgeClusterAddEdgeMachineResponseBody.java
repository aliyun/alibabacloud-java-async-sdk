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
    @NameInMap("edge_machine_id")
    private String edgeMachineId;

    @NameInMap("request_id")
    private String requestId;

    private EdgeClusterAddEdgeMachineResponseBody(Builder builder) {
        this.edgeMachineId = builder.edgeMachineId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EdgeClusterAddEdgeMachineResponseBody create() {
        return builder().build();
    }

    /**
     * @return edgeMachineId
     */
    public String getEdgeMachineId() {
        return this.edgeMachineId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String edgeMachineId; 
        private String requestId; 

        /**
         * edge machine id
         */
        public Builder edgeMachineId(String edgeMachineId) {
            this.edgeMachineId = edgeMachineId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EdgeClusterAddEdgeMachineResponseBody build() {
            return new EdgeClusterAddEdgeMachineResponseBody(this);
        } 

    } 

}
