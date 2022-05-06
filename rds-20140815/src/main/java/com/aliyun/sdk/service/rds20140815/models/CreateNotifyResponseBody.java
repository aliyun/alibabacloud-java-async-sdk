// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNotifyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNotifyResponseBody</p>
 */
public class CreateNotifyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CreateNotifyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNotifyResponseBody create() {
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

        public CreateNotifyResponseBody build() {
            return new CreateNotifyResponseBody(this);
        } 

    } 

}
