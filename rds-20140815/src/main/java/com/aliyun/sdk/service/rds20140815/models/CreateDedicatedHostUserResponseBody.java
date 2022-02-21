// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedHostUserResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDedicatedHostUserResponseBody</p>
 */
public class CreateDedicatedHostUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CreateDedicatedHostUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedHostUserResponseBody create() {
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

        public CreateDedicatedHostUserResponseBody build() {
            return new CreateDedicatedHostUserResponseBody(this);
        } 

    } 

}
