// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCasterTimedEventResponseBody} extends {@link TeaModel}
 *
 * <p>SetCasterTimedEventResponseBody</p>
 */
public class SetCasterTimedEventResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetCasterTimedEventResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCasterTimedEventResponseBody create() {
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

        public SetCasterTimedEventResponseBody build() {
            return new SetCasterTimedEventResponseBody(this);
        } 

    } 

}
