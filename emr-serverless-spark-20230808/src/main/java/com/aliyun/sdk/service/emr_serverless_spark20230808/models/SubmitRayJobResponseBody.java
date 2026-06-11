// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link SubmitRayJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitRayJobResponseBody</p>
 */
public class SubmitRayJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("submissionId")
    private String submissionId;

    private SubmitRayJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.submissionId = builder.submissionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitRayJobResponseBody create() {
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
     * @return submissionId
     */
    public String getSubmissionId() {
        return this.submissionId;
    }

    public static final class Builder {
        private String requestId; 
        private String submissionId; 

        private Builder() {
        } 

        private Builder(SubmitRayJobResponseBody model) {
            this.requestId = model.requestId;
            this.submissionId = model.submissionId;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Ray Job ID。</p>
         * 
         * <strong>example:</strong>
         * <p>rj-k7nm8ahl5te4tg91</p>
         */
        public Builder submissionId(String submissionId) {
            this.submissionId = submissionId;
            return this;
        }

        public SubmitRayJobResponseBody build() {
            return new SubmitRayJobResponseBody(this);
        } 

    } 

}
