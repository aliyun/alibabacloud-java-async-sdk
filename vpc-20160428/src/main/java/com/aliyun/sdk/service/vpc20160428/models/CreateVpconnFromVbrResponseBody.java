// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpconnFromVbrResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpconnFromVbrResponseBody</p>
 */
public class CreateVpconnFromVbrResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VirtualPhysicalConnection")
    private String virtualPhysicalConnection;

    private CreateVpconnFromVbrResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.virtualPhysicalConnection = builder.virtualPhysicalConnection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpconnFromVbrResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VirtualPhysicalConnection.
         */
        public Builder virtualPhysicalConnection(String virtualPhysicalConnection) {
            this.virtualPhysicalConnection = virtualPhysicalConnection;
            return this;
        }

        public CreateVpconnFromVbrResponseBody build() {
            return new CreateVpconnFromVbrResponseBody(this);
        } 

    } 

}
