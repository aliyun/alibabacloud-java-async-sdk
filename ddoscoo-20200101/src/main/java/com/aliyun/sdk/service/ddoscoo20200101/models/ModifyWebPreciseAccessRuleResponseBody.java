// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebPreciseAccessRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyWebPreciseAccessRuleResponseBody</p>
 */
public class ModifyWebPreciseAccessRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyWebPreciseAccessRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebPreciseAccessRuleResponseBody create() {
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
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyWebPreciseAccessRuleResponseBody build() {
            return new ModifyWebPreciseAccessRuleResponseBody(this);
        } 

    } 

}
