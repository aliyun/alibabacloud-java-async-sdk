// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIoTCloudConnectorBackhaulRouteResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIoTCloudConnectorBackhaulRouteResponseBody</p>
 */
public class CreateIoTCloudConnectorBackhaulRouteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CreateIoTCloudConnectorBackhaulRouteResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIoTCloudConnectorBackhaulRouteResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIoTCloudConnectorBackhaulRouteResponseBody build() {
            return new CreateIoTCloudConnectorBackhaulRouteResponseBody(this);
        } 

    } 

}
