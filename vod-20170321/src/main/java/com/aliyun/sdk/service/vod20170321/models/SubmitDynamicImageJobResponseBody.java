// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SubmitDynamicImageJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitDynamicImageJobResponseBody</p>
 */
public class SubmitDynamicImageJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DynamicImageJob")
    private DynamicImageJob dynamicImageJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SubmitDynamicImageJobResponseBody(Builder builder) {
        this.dynamicImageJob = builder.dynamicImageJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitDynamicImageJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicImageJob
     */
    public DynamicImageJob getDynamicImageJob() {
        return this.dynamicImageJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DynamicImageJob dynamicImageJob; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SubmitDynamicImageJobResponseBody model) {
            this.dynamicImageJob = model.dynamicImageJob;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the animated image job.</p>
         */
        public Builder dynamicImageJob(DynamicImageJob dynamicImageJob) {
            this.dynamicImageJob = dynamicImageJob;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-74A6-BEF6-D7393642****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitDynamicImageJobResponseBody build() {
            return new SubmitDynamicImageJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitDynamicImageJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitDynamicImageJobResponseBody</p>
     */
    public static class DynamicImageJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        private DynamicImageJob(Builder builder) {
            this.jobId = builder.jobId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DynamicImageJob create() {
            return builder().build();
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        public static final class Builder {
            private String jobId; 

            private Builder() {
            } 

            private Builder(DynamicImageJob model) {
                this.jobId = model.jobId;
            } 

            /**
             * <p>The ID of the animated image job.</p>
             * 
             * <strong>example:</strong>
             * <p>ad90a501b1bfb72374ad0050746****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            public DynamicImageJob build() {
                return new DynamicImageJob(this);
            } 

        } 

    }
}
