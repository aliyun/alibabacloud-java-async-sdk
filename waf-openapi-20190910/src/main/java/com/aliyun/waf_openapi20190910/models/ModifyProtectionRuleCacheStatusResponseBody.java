// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyProtectionRuleCacheStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyProtectionRuleCacheStatusResponseBody</p>
 */
public class ModifyProtectionRuleCacheStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private ModifyProtectionRuleCacheStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyProtectionRuleCacheStatusResponseBody create() {
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyProtectionRuleCacheStatusResponseBody build() {
            return new ModifyProtectionRuleCacheStatusResponseBody(this);
        } 

    } 

}
