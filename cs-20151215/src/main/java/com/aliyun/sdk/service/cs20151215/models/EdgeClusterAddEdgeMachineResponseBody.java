// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link EdgeClusterAddEdgeMachineResponseBody} extends {@link TeaModel}
 *
 * <p>EdgeClusterAddEdgeMachineResponseBody</p>
 */
public class EdgeClusterAddEdgeMachineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("edge_machine_id")
    private String edgeMachineId;

    @com.aliyun.core.annotation.NameInMap("request_id")
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
         * <p>The ID of the cloud-native box.</p>
         * 
         * <strong>example:</strong>
         * <p>0f4bf70a-caff-4b26-a679-fb0188a1****</p>
         */
        public Builder edgeMachineId(String edgeMachineId) {
            this.edgeMachineId = edgeMachineId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0adf3a23-6841-41e8-9f55-7b290216c980</p>
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
