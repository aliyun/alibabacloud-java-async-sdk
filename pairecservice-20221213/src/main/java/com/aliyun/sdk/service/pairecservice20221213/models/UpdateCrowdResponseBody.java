// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCrowdResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCrowdResponseBody</p>
 */
public class UpdateCrowdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateCrowdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCrowdResponseBody create() {
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

        public UpdateCrowdResponseBody build() {
            return new UpdateCrowdResponseBody(this);
        } 

    } 

}
