// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportSessionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ReportSessionStatusResponseBody</p>
 */
public class ReportSessionStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ReportSessionStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportSessionStatusResponseBody create() {
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

        public ReportSessionStatusResponseBody build() {
            return new ReportSessionStatusResponseBody(this);
        } 

    } 

}
