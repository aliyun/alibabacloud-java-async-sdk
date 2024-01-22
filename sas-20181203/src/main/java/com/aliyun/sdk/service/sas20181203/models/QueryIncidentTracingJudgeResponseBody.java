// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIncidentTracingJudgeResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIncidentTracingJudgeResponseBody</p>
 */
public class QueryIncidentTracingJudgeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TracingJudge")
    private java.util.Map < String, Integer > tracingJudge;

    private QueryIncidentTracingJudgeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tracingJudge = builder.tracingJudge;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIncidentTracingJudgeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tracingJudge
     */
    public java.util.Map < String, Integer > getTracingJudge() {
        return this.tracingJudge;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private java.util.Map < String, Integer > tracingJudge; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The request result.
         */
        public Builder tracingJudge(java.util.Map < String, Integer > tracingJudge) {
            this.tracingJudge = tracingJudge;
            return this;
        }

        public QueryIncidentTracingJudgeResponseBody build() {
            return new QueryIncidentTracingJudgeResponseBody(this);
        } 

    } 

}
