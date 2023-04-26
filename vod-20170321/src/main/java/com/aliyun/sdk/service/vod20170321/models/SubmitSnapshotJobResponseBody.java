// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSnapshotJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitSnapshotJobResponseBody</p>
 */
public class SubmitSnapshotJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnapshotJob")
    private SnapshotJob snapshotJob;

    private SubmitSnapshotJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.snapshotJob = builder.snapshotJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSnapshotJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotJob
     */
    public SnapshotJob getSnapshotJob() {
        return this.snapshotJob;
    }

    public static final class Builder {
        private String requestId; 
        private SnapshotJob snapshotJob; 

        /**
         * Submits a snapshot job for a video and starts asynchronous snapshot processing.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SnapshotJob.
         */
        public Builder snapshotJob(SnapshotJob snapshotJob) {
            this.snapshotJob = snapshotJob;
            return this;
        }

        public SubmitSnapshotJobResponseBody build() {
            return new SubmitSnapshotJobResponseBody(this);
        } 

    } 

    public static class SnapshotJob extends TeaModel {
        @NameInMap("JobId")
        private String jobId;

        private SnapshotJob(Builder builder) {
            this.jobId = builder.jobId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotJob create() {
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
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            public SnapshotJob build() {
                return new SnapshotJob(this);
            } 

        } 

    }
}
