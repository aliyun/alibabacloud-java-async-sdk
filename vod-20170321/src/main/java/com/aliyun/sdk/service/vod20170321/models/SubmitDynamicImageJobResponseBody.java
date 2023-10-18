// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitDynamicImageJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitDynamicImageJobResponseBody</p>
 */
public class SubmitDynamicImageJobResponseBody extends TeaModel {
    @NameInMap("DynamicImageJob")
    private DynamicImageJob dynamicImageJob;

    @NameInMap("RequestId")
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

        /**
         * The information about the animated image job.
         */
        public Builder dynamicImageJob(DynamicImageJob dynamicImageJob) {
            this.dynamicImageJob = dynamicImageJob;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitDynamicImageJobResponseBody build() {
            return new SubmitDynamicImageJobResponseBody(this);
        } 

    } 

    public static class DynamicImageJob extends TeaModel {
        @NameInMap("JobId")
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

            /**
             * The ID of the animated image job.
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
