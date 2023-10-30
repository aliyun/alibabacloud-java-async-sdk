// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptApproveCommandResponseBody} extends {@link TeaModel}
 *
 * <p>AcceptApproveCommandResponseBody</p>
 */
public class AcceptApproveCommandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private AcceptApproveCommandResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptApproveCommandResponseBody create() {
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

        public AcceptApproveCommandResponseBody build() {
            return new AcceptApproveCommandResponseBody(this);
        } 

    } 

}
