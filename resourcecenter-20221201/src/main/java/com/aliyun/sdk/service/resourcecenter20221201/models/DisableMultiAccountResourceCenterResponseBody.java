// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableMultiAccountResourceCenterResponseBody} extends {@link TeaModel}
 *
 * <p>DisableMultiAccountResourceCenterResponseBody</p>
 */
public class DisableMultiAccountResourceCenterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DisableMultiAccountResourceCenterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableMultiAccountResourceCenterResponseBody create() {
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

        public DisableMultiAccountResourceCenterResponseBody build() {
            return new DisableMultiAccountResourceCenterResponseBody(this);
        } 

    } 

}
