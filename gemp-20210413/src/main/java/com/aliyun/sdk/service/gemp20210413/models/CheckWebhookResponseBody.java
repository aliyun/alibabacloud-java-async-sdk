// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckWebhookResponseBody} extends {@link TeaModel}
 *
 * <p>CheckWebhookResponseBody</p>
 */
public class CheckWebhookResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    private CheckWebhookResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckWebhookResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckWebhookResponseBody build() {
            return new CheckWebhookResponseBody(this);
        } 

    } 

}
