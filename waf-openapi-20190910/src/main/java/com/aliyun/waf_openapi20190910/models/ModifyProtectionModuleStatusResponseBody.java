// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyProtectionModuleStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyProtectionModuleStatusResponseBody</p>
 */
public class ModifyProtectionModuleStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private ModifyProtectionModuleStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyProtectionModuleStatusResponseBody create() {
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

        public ModifyProtectionModuleStatusResponseBody build() {
            return new ModifyProtectionModuleStatusResponseBody(this);
        } 

    } 

}
