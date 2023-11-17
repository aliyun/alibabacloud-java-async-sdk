// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchModifyInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>BatchModifyInstanceStatusResponseBody</p>
 */
public class BatchModifyInstanceStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private BatchModifyInstanceStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchModifyInstanceStatusResponseBody create() {
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

        public BatchModifyInstanceStatusResponseBody build() {
            return new BatchModifyInstanceStatusResponseBody(this);
        } 

    } 

}
