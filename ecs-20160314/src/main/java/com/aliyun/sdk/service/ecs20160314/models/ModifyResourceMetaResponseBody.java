// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyResourceMetaResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyResourceMetaResponseBody</p>
 */
public class ModifyResourceMetaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyResourceMetaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyResourceMetaResponseBody create() {
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

        public ModifyResourceMetaResponseBody build() {
            return new ModifyResourceMetaResponseBody(this);
        } 

    } 

}
