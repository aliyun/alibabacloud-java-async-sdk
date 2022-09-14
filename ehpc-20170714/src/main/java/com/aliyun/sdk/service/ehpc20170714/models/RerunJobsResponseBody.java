// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RerunJobsResponseBody} extends {@link TeaModel}
 *
 * <p>RerunJobsResponseBody</p>
 */
public class RerunJobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RerunJobsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RerunJobsResponseBody create() {
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

        public RerunJobsResponseBody build() {
            return new RerunJobsResponseBody(this);
        } 

    } 

}
