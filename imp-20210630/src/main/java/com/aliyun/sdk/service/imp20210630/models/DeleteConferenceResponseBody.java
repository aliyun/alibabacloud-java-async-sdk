// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConferenceResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteConferenceResponseBody</p>
 */
public class DeleteConferenceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteConferenceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConferenceResponseBody create() {
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

        public DeleteConferenceResponseBody build() {
            return new DeleteConferenceResponseBody(this);
        } 

    } 

}
