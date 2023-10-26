// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteScheduleResponseBody</p>
 */
public class DeleteScheduleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteScheduleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScheduleResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteScheduleResponseBody build() {
            return new DeleteScheduleResponseBody(this);
        } 

    } 

}
