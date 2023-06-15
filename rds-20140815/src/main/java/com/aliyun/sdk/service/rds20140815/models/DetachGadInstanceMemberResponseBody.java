// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachGadInstanceMemberResponseBody} extends {@link TeaModel}
 *
 * <p>DetachGadInstanceMemberResponseBody</p>
 */
public class DetachGadInstanceMemberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DetachGadInstanceMemberResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachGadInstanceMemberResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetachGadInstanceMemberResponseBody build() {
            return new DetachGadInstanceMemberResponseBody(this);
        } 

    } 

}
