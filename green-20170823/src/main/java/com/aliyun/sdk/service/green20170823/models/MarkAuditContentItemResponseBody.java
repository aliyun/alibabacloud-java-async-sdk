// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MarkAuditContentItemResponseBody} extends {@link TeaModel}
 *
 * <p>MarkAuditContentItemResponseBody</p>
 */
public class MarkAuditContentItemResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private MarkAuditContentItemResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarkAuditContentItemResponseBody create() {
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

        public MarkAuditContentItemResponseBody build() {
            return new MarkAuditContentItemResponseBody(this);
        } 

    } 

}
