// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySilenceTimeoutConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySilenceTimeoutConfigResponseBody</p>
 */
public class ModifySilenceTimeoutConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifySilenceTimeoutConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySilenceTimeoutConfigResponseBody create() {
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

        public ModifySilenceTimeoutConfigResponseBody build() {
            return new ModifySilenceTimeoutConfigResponseBody(this);
        } 

    } 

}
