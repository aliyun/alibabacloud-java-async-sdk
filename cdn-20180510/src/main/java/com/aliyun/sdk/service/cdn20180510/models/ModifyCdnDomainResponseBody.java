// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCdnDomainResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCdnDomainResponseBody</p>
 */
public class ModifyCdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyCdnDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCdnDomainResponseBody create() {
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

        public ModifyCdnDomainResponseBody build() {
            return new ModifyCdnDomainResponseBody(this);
        } 

    } 

}
