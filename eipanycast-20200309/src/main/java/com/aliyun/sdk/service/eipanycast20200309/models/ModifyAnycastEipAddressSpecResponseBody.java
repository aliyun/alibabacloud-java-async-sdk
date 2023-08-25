// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAnycastEipAddressSpecResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAnycastEipAddressSpecResponseBody</p>
 */
public class ModifyAnycastEipAddressSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyAnycastEipAddressSpecResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAnycastEipAddressSpecResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyAnycastEipAddressSpecResponseBody build() {
            return new ModifyAnycastEipAddressSpecResponseBody(this);
        } 

    } 

}
