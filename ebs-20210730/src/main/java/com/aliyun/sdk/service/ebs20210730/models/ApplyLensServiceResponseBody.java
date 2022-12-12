// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyLensServiceResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyLensServiceResponseBody</p>
 */
public class ApplyLensServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ApplyLensServiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyLensServiceResponseBody create() {
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

        public ApplyLensServiceResponseBody build() {
            return new ApplyLensServiceResponseBody(this);
        } 

    } 

}
