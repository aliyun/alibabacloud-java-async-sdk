// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConferenceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateConferenceResponseBody</p>
 */
public class UpdateConferenceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateConferenceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConferenceResponseBody create() {
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
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateConferenceResponseBody build() {
            return new UpdateConferenceResponseBody(this);
        } 

    } 

}
