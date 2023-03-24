// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachApplication2ConnectorResponseBody} extends {@link TeaModel}
 *
 * <p>DetachApplication2ConnectorResponseBody</p>
 */
public class DetachApplication2ConnectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DetachApplication2ConnectorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachApplication2ConnectorResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetachApplication2ConnectorResponseBody build() {
            return new DetachApplication2ConnectorResponseBody(this);
        } 

    } 

}
