// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLifecycleHookResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLifecycleHookResponseBody</p>
 */
public class CreateLifecycleHookResponseBody extends TeaModel {
    @NameInMap("LifecycleHookId")
    private String lifecycleHookId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateLifecycleHookResponseBody(Builder builder) {
        this.lifecycleHookId = builder.lifecycleHookId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLifecycleHookResponseBody create() {
        return builder().build();
    }

    /**
     * @return lifecycleHookId
     */
    public String getLifecycleHookId() {
        return this.lifecycleHookId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String lifecycleHookId; 
        private String requestId; 

        /**
         * The ID of the lifecycle hook.
         */
        public Builder lifecycleHookId(String lifecycleHookId) {
            this.lifecycleHookId = lifecycleHookId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLifecycleHookResponseBody build() {
            return new CreateLifecycleHookResponseBody(this);
        } 

    } 

}
