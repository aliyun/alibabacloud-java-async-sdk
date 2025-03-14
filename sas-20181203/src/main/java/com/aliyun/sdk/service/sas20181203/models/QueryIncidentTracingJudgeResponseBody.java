// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryIncidentTracingJudgeResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIncidentTracingJudgeResponseBody</p>
 */
public class QueryIncidentTracingJudgeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TracingJudge")
    private java.util.Map<String, Integer> tracingJudge;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.Map<String, Integer> getTracingJudge() {
        return this.tracingJudge;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private java.util.Map<String, Integer> tracingJudge; 

        private Builder() {
        } 

        private Builder(QueryIncidentTracingJudgeResponseBody model) {
            this.requestId = model.requestId;
            this.success = model.success;
            this.tracingJudge = model.tracingJudge;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>73563FEF-BBCB-151C-88AA-8A409CBAF0C6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The request result.</p>
         */
        public Builder tracingJudge(java.util.Map<String, Integer> tracingJudge) {
            this.tracingJudge = tracingJudge;
            return this;
        }

        public QueryIncidentTracingJudgeResponseBody build() {
            return new QueryIncidentTracingJudgeResponseBody(this);
        } 

    } 

}
