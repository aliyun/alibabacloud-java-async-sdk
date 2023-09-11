// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobStatusResponseBody</p>
 */
public class GetJobStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private GetJobStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The state of the task. Valid values:
         * <p>
         * 
         * *   **Succeeded**: The task is successful.
         * *   **processing**: The ticket is being executed.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetJobStatusResponseBody build() {
            return new GetJobStatusResponseBody(this);
        } 

    } 

}
