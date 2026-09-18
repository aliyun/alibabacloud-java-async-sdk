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
 * {@link ListJobPlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobPlansResponseBody</p>
 */
public class ListJobPlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobPlans")
    private java.util.List<JobPlan> jobPlans;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListJobPlansResponseBody(Builder builder) {
        this.jobPlans = builder.jobPlans;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobPlansResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobPlans
     */
    public java.util.List<JobPlan> getJobPlans() {
        return this.jobPlans;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<JobPlan> jobPlans; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListJobPlansResponseBody model) {
            this.jobPlans = model.jobPlans;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of job plans.</p>
         */
        public Builder jobPlans(java.util.List<JobPlan> jobPlans) {
            this.jobPlans = jobPlans;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82-9624-EC2B1779848E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobPlansResponseBody build() {
            return new ListJobPlansResponseBody(this);
        } 

    } 

}
