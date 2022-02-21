// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveReplyMailAddressResponseBody} extends {@link TeaModel}
 *
 * <p>ApproveReplyMailAddressResponseBody</p>
 */
public class ApproveReplyMailAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ApproveReplyMailAddressResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApproveReplyMailAddressResponseBody create() {
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

        public ApproveReplyMailAddressResponseBody build() {
            return new ApproveReplyMailAddressResponseBody(this);
        } 

    } 

}
