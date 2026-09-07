// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link GetYikeJobCreditResponseBody} extends {@link TeaModel}
 *
 * <p>GetYikeJobCreditResponseBody</p>
 */
public class GetYikeJobCreditResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreditStatus")
    private String creditStatus;

    @com.aliyun.core.annotation.NameInMap("JobCreditCost")
    private Double jobCreditCost;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetYikeJobCreditResponseBody(Builder builder) {
        this.creditStatus = builder.creditStatus;
        this.jobCreditCost = builder.jobCreditCost;
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetYikeJobCreditResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creditStatus
     */
    public String getCreditStatus() {
        return this.creditStatus;
    }

    /**
     * @return jobCreditCost
     */
    public Double getJobCreditCost() {
        return this.jobCreditCost;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String creditStatus; 
        private Double jobCreditCost; 
        private String jobId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetYikeJobCreditResponseBody model) {
            this.creditStatus = model.creditStatus;
            this.jobCreditCost = model.jobCreditCost;
            this.jobId = model.jobId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The credit deduction status.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder creditStatus(String creditStatus) {
            this.creditStatus = creditStatus;
            return this;
        }

        /**
         * <p>The actual credits consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder jobCreditCost(Double jobCreditCost) {
            this.jobCreditCost = jobCreditCost;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ag_12412424****</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetYikeJobCreditResponseBody build() {
            return new GetYikeJobCreditResponseBody(this);
        } 

    } 

}
