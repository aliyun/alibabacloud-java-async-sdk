// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachUserENIResponseBody} extends {@link TeaModel}
 *
 * <p>DetachUserENIResponseBody</p>
 */
public class DetachUserENIResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DetachUserENIResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachUserENIResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetachUserENIResponseBody build() {
            return new DetachUserENIResponseBody(this);
        } 

    } 

}
