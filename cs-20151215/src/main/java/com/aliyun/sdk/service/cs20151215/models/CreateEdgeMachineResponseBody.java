// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEdgeMachineResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEdgeMachineResponseBody</p>
 */
public class CreateEdgeMachineResponseBody extends TeaModel {
    @NameInMap("edge_machine_id")
    private String edgeMachineId;

    @NameInMap("request_id")
    private String requestId;

    private CreateEdgeMachineResponseBody(Builder builder) {
        this.edgeMachineId = builder.edgeMachineId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeMachineResponseBody create() {
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
         * The ID of the cloud-native box.
         */
        public Builder edgeMachineId(String edgeMachineId) {
            this.edgeMachineId = edgeMachineId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEdgeMachineResponseBody build() {
            return new CreateEdgeMachineResponseBody(this);
        } 

    } 

}
