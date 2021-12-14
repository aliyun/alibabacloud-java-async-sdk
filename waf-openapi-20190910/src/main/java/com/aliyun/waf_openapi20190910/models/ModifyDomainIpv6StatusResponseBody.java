// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyDomainIpv6StatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDomainIpv6StatusResponseBody</p>
 */
public class ModifyDomainIpv6StatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private ModifyDomainIpv6StatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDomainIpv6StatusResponseBody create() {
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

        public ModifyDomainIpv6StatusResponseBody build() {
            return new ModifyDomainIpv6StatusResponseBody(this);
        } 

    } 

}
