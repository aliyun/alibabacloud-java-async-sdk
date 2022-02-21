// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RescaleApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>RescaleApplicationResponseBody</p>
 */
public class RescaleApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RescaleApplicationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RescaleApplicationResponseBody create() {
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

        public RescaleApplicationResponseBody build() {
            return new RescaleApplicationResponseBody(this);
        } 

    } 

}
