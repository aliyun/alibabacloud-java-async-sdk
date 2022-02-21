// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiagnosisResponseBody} extends {@link TeaModel}
 *
 * <p>GetDiagnosisResponseBody</p>
 */
public class GetDiagnosisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private String result;

    @NameInMap("RunAt")
    private String runAt;

    @NameInMap("Status")
    private String status;

    private GetDiagnosisResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.runAt = builder.runAt;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiagnosisResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return runAt
     */
    public String getRunAt() {
        return this.runAt;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private String result; 
        private String runAt; 
        private String status; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * RunAt.
         */
        public Builder runAt(String runAt) {
            this.runAt = runAt;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetDiagnosisResponseBody build() {
            return new GetDiagnosisResponseBody(this);
        } 

    } 

}
