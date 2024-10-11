// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitSnapshotJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitSnapshotJobResponseBody</p>
 */
public class SubmitSnapshotJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotJob")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-5EB0-4AF6-D7393642****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the snapshot job.</p>
         */
        public Builder snapshotJob(SnapshotJob snapshotJob) {
            this.snapshotJob = snapshotJob;
            return this;
        }

        public SubmitSnapshotJobResponseBody build() {
            return new SubmitSnapshotJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitSnapshotJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitSnapshotJobResponseBody</p>
     */
    public static class SnapshotJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
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
             * <p>The ID of the snapshot job.</p>
             * 
             * <strong>example:</strong>
             * <p>ad90a501b1b94b72374ad0050464****</p>
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
