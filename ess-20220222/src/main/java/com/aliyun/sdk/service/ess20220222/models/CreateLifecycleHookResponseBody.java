// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateLifecycleHookResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLifecycleHookResponseBody</p>
 */
public class CreateLifecycleHookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LifecycleHookId")
    private String lifecycleHookId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the lifecycle hook.</p>
         * 
         * <strong>example:</strong>
         * <p>ash-bp1at9ufhmcf9cmy****</p>
         */
        public Builder lifecycleHookId(String lifecycleHookId) {
            this.lifecycleHookId = lifecycleHookId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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
