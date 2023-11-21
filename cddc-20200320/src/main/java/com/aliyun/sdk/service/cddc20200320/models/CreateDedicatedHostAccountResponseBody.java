// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedHostAccountResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDedicatedHostAccountResponseBody</p>
 */
public class CreateDedicatedHostAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CreateDedicatedHostAccountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedHostAccountResponseBody create() {
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

        public CreateDedicatedHostAccountResponseBody build() {
            return new CreateDedicatedHostAccountResponseBody(this);
        } 

    } 

}
