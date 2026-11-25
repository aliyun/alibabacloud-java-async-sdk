// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarClawSkillAssessmentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarClawSkillAssessmentResponseBody</p>
 */
public class DescribePolarClawSkillAssessmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssessmentResult")
    private String assessmentResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePolarClawSkillAssessmentResponseBody(Builder builder) {
        this.assessmentResult = builder.assessmentResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawSkillAssessmentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assessmentResult
     */
    public String getAssessmentResult() {
        return this.assessmentResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String assessmentResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePolarClawSkillAssessmentResponseBody model) {
            this.assessmentResult = model.assessmentResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The assessment result.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;zhReportContent&quot;:&quot;# Skill Security Assessment Report\n\n&gt; <strong>Risk level:</strong> ...}</p>
         */
        public Builder assessmentResult(String assessmentResult) {
            this.assessmentResult = assessmentResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CD3FA5F3-FAF3-44CA-AFFF-BAF869******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePolarClawSkillAssessmentResponseBody build() {
            return new DescribePolarClawSkillAssessmentResponseBody(this);
        } 

    } 

}
