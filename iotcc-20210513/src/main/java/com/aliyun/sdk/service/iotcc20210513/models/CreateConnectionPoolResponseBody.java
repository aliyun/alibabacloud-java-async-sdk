// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConnectionPoolResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConnectionPoolResponseBody</p>
 */
public class CreateConnectionPoolResponseBody extends TeaModel {
    @NameInMap("ConnectionPoolId")
    private String connectionPoolId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateConnectionPoolResponseBody(Builder builder) {
        this.connectionPoolId = builder.connectionPoolId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConnectionPoolResponseBody create() {
        return builder().build();
    }

    /**
     * @return connectionPoolId
     */
    public String getConnectionPoolId() {
        return this.connectionPoolId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String connectionPoolId; 
        private String requestId; 

        /**
         * ConnectionPoolId.
         */
        public Builder connectionPoolId(String connectionPoolId) {
            this.connectionPoolId = connectionPoolId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateConnectionPoolResponseBody build() {
            return new CreateConnectionPoolResponseBody(this);
        } 

    } 

}
