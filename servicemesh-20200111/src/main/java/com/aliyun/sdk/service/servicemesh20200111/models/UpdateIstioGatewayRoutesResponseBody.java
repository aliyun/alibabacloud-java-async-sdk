// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIstioGatewayRoutesResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateIstioGatewayRoutesResponseBody</p>
 */
public class UpdateIstioGatewayRoutesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateIstioGatewayRoutesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIstioGatewayRoutesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateIstioGatewayRoutesResponseBody build() {
            return new UpdateIstioGatewayRoutesResponseBody(this);
        } 

    } 

}
