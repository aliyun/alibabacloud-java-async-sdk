// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsMessagePushResponseBody} extends {@link TeaModel}
 *
 * <p>OnsMessagePushResponseBody</p>
 */
public class OnsMessagePushResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private OnsMessagePushResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsMessagePushResponseBody create() {
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
         * The ID of the request. The system generates a unique ID for each request. You can troubleshoot issues based on the request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsMessagePushResponseBody build() {
            return new OnsMessagePushResponseBody(this);
        } 

    } 

}
