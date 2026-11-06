// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20250630.models;

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
 * {@link CreateJobPlanResponseBody} extends {@link TeaModel}
 *
 * <p>CreateJobPlanResponseBody</p>
 */
public class CreateJobPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobPlanId")
    private String jobPlanId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateJobPlanResponseBody(Builder builder) {
        this.jobPlanId = builder.jobPlanId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobPlanResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobPlanId
     */
    public String getJobPlanId() {
        return this.jobPlanId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String jobPlanId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateJobPlanResponseBody model) {
            this.jobPlanId = model.jobPlanId;
            this.requestId = model.requestId;
        } 

        /**
         * JobPlanId.
         */
        public Builder jobPlanId(String jobPlanId) {
            this.jobPlanId = jobPlanId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateJobPlanResponseBody build() {
            return new CreateJobPlanResponseBody(this);
        } 

    } 

}
