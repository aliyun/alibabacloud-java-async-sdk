// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableLayer7CCResponseBody} extends {@link TeaModel}
 *
 * <p>EnableLayer7CCResponseBody</p>
 */
public class EnableLayer7CCResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private EnableLayer7CCResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableLayer7CCResponseBody create() {
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

        public EnableLayer7CCResponseBody build() {
            return new EnableLayer7CCResponseBody(this);
        } 

    } 

}
