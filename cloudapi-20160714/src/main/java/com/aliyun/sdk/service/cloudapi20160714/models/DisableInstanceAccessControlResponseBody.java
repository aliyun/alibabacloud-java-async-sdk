// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableInstanceAccessControlResponseBody} extends {@link TeaModel}
 *
 * <p>DisableInstanceAccessControlResponseBody</p>
 */
public class DisableInstanceAccessControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DisableInstanceAccessControlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableInstanceAccessControlResponseBody create() {
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

        public DisableInstanceAccessControlResponseBody build() {
            return new DisableInstanceAccessControlResponseBody(this);
        } 

    } 

}
