// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLogServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyLogServiceStatusResponseBody</p>
 */
public class ModifyLogServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyLogServiceStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLogServiceStatusResponseBody create() {
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

        public ModifyLogServiceStatusResponseBody build() {
            return new ModifyLogServiceStatusResponseBody(this);
        } 

    } 

}
