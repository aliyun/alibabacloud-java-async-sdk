// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBuiltinEnvoyFilterResponseBody} extends {@link TeaModel}
 *
 * <p>GetBuiltinEnvoyFilterResponseBody</p>
 */
public class GetBuiltinEnvoyFilterResponseBody extends TeaModel {
    @NameInMap("Parameters")
    private String parameters;

    @NameInMap("RequestId")
    private String requestId;

    private GetBuiltinEnvoyFilterResponseBody(Builder builder) {
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBuiltinEnvoyFilterResponseBody create() {
        return builder().build();
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String parameters; 
        private String requestId; 

        /**
         * Parameters.
         */
        public Builder parameters(String parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBuiltinEnvoyFilterResponseBody build() {
            return new GetBuiltinEnvoyFilterResponseBody(this);
        } 

    } 

}
