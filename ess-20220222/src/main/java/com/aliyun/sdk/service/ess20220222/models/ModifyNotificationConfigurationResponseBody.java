// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNotificationConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyNotificationConfigurationResponseBody</p>
 */
public class ModifyNotificationConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyNotificationConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNotificationConfigurationResponseBody create() {
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

        public ModifyNotificationConfigurationResponseBody build() {
            return new ModifyNotificationConfigurationResponseBody(this);
        } 

    } 

}
