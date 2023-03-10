// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebAccessModeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyWebAccessModeResponseBody</p>
 */
public class ModifyWebAccessModeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyWebAccessModeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebAccessModeResponseBody create() {
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

        public ModifyWebAccessModeResponseBody build() {
            return new ModifyWebAccessModeResponseBody(this);
        } 

    } 

}
