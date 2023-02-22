// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelChangeAccountEmailResponseBody} extends {@link TeaModel}
 *
 * <p>CancelChangeAccountEmailResponseBody</p>
 */
public class CancelChangeAccountEmailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CancelChangeAccountEmailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelChangeAccountEmailResponseBody create() {
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

        public CancelChangeAccountEmailResponseBody build() {
            return new CancelChangeAccountEmailResponseBody(this);
        } 

    } 

}
