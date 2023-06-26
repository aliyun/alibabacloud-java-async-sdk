// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelLensServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CancelLensServiceResponseBody</p>
 */
public class CancelLensServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CancelLensServiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelLensServiceResponseBody create() {
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

        public CancelLensServiceResponseBody build() {
            return new CancelLensServiceResponseBody(this);
        } 

    } 

}
