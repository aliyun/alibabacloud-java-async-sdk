// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePhysicalConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePhysicalConnectionResponseBody</p>
 */
public class CreatePhysicalConnectionResponseBody extends TeaModel {
    @NameInMap("PhysicalConnectionId")
    private String physicalConnectionId;

    @NameInMap("RequestId")
    private String requestId;

    private CreatePhysicalConnectionResponseBody(Builder builder) {
        this.physicalConnectionId = builder.physicalConnectionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePhysicalConnectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return physicalConnectionId
     */
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String physicalConnectionId; 
        private String requestId; 

        /**
         * The ID of the Express Connect circuit.
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePhysicalConnectionResponseBody build() {
            return new CreatePhysicalConnectionResponseBody(this);
        } 

    } 

}
