// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableResourceCenterResponseBody} extends {@link TeaModel}
 *
 * <p>DisableResourceCenterResponseBody</p>
 */
public class DisableResourceCenterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DisableResourceCenterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableResourceCenterResponseBody create() {
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

        public DisableResourceCenterResponseBody build() {
            return new DisableResourceCenterResponseBody(this);
        } 

    } 

}
