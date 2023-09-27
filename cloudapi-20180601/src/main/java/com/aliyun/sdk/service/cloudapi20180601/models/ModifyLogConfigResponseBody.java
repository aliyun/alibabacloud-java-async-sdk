// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyLogConfigResponseBody</p>
 */
public class ModifyLogConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyLogConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLogConfigResponseBody create() {
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

        public ModifyLogConfigResponseBody build() {
            return new ModifyLogConfigResponseBody(this);
        } 

    } 

}
