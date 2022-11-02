// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMajorProtectionBlackIpResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyMajorProtectionBlackIpResponseBody</p>
 */
public class ModifyMajorProtectionBlackIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyMajorProtectionBlackIpResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMajorProtectionBlackIpResponseBody create() {
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

        public ModifyMajorProtectionBlackIpResponseBody build() {
            return new ModifyMajorProtectionBlackIpResponseBody(this);
        } 

    } 

}
