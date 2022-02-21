// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVirtualPhysicalConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVirtualPhysicalConnectionResponseBody</p>
 */
public class CreateVirtualPhysicalConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VirtualPhysicalConnection")
    private String virtualPhysicalConnection;

    private CreateVirtualPhysicalConnectionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.virtualPhysicalConnection = builder.virtualPhysicalConnection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirtualPhysicalConnectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return virtualPhysicalConnection
     */
    public String getVirtualPhysicalConnection() {
        return this.virtualPhysicalConnection;
    }

    public static final class Builder {
        private String requestId; 
        private String virtualPhysicalConnection; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Vpconn的实例ID
         */
        public Builder virtualPhysicalConnection(String virtualPhysicalConnection) {
            this.virtualPhysicalConnection = virtualPhysicalConnection;
            return this;
        }

        public CreateVirtualPhysicalConnectionResponseBody build() {
            return new CreateVirtualPhysicalConnectionResponseBody(this);
        } 

    } 

}
