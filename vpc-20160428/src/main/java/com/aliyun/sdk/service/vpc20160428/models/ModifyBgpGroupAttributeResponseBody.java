// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBgpGroupAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyBgpGroupAttributeResponseBody</p>
 */
public class ModifyBgpGroupAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyBgpGroupAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBgpGroupAttributeResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyBgpGroupAttributeResponseBody build() {
            return new ModifyBgpGroupAttributeResponseBody(this);
        } 

    } 

}
