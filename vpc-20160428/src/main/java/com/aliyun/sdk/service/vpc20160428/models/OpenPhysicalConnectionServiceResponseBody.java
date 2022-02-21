// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenPhysicalConnectionServiceResponseBody} extends {@link TeaModel}
 *
 * <p>OpenPhysicalConnectionServiceResponseBody</p>
 */
public class OpenPhysicalConnectionServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private OpenPhysicalConnectionServiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenPhysicalConnectionServiceResponseBody create() {
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

        public OpenPhysicalConnectionServiceResponseBody build() {
            return new OpenPhysicalConnectionServiceResponseBody(this);
        } 

    } 

}
