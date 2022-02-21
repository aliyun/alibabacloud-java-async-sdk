// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueueSubmissionStatisticInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetQueueSubmissionStatisticInfoResponseBody</p>
 */
public class GetQueueSubmissionStatisticInfoResponseBody extends TeaModel {
    @NameInMap("QueueSubmissionList")
    private QueueSubmissionList queueSubmissionList;

    @NameInMap("RequestId")
    private String requestId;

    private GetQueueSubmissionStatisticInfoResponseBody(Builder builder) {
        this.queueSubmissionList = builder.queueSubmissionList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueueSubmissionStatisticInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return queueSubmissionList
     */
    public QueueSubmissionList getQueueSubmissionList() {
        return this.queueSubmissionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private QueueSubmissionList queueSubmissionList; 
        private String requestId; 

        /**
         * QueueSubmissionList.
         */
        public Builder queueSubmissionList(QueueSubmissionList queueSubmissionList) {
            this.queueSubmissionList = queueSubmissionList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetQueueSubmissionStatisticInfoResponseBody build() {
            return new GetQueueSubmissionStatisticInfoResponseBody(this);
        } 

    } 

    public static class ClusterStatQueueSubmission extends TeaModel {
        @NameInMap("Queue")
        private String queue;

        @NameInMap("Submission")
        private Long submission;

        private ClusterStatQueueSubmission(Builder builder) {
            this.queue = builder.queue;
            this.submission = builder.submission;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterStatQueueSubmission create() {
            return builder().build();
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return submission
         */
        public Long getSubmission() {
            return this.submission;
        }

        public static final class Builder {
            private String queue; 
            private Long submission; 

            /**
             * Queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * Submission.
             */
            public Builder submission(Long submission) {
                this.submission = submission;
                return this;
            }

            public ClusterStatQueueSubmission build() {
                return new ClusterStatQueueSubmission(this);
            } 

        } 

    }
    public static class QueueSubmissionList extends TeaModel {
        @NameInMap("ClusterStatQueueSubmission")
        private java.util.List < ClusterStatQueueSubmission> clusterStatQueueSubmission;

        private QueueSubmissionList(Builder builder) {
            this.clusterStatQueueSubmission = builder.clusterStatQueueSubmission;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueSubmissionList create() {
            return builder().build();
        }

        /**
         * @return clusterStatQueueSubmission
         */
        public java.util.List < ClusterStatQueueSubmission> getClusterStatQueueSubmission() {
            return this.clusterStatQueueSubmission;
        }

        public static final class Builder {
            private java.util.List < ClusterStatQueueSubmission> clusterStatQueueSubmission; 

            /**
             * ClusterStatQueueSubmission.
             */
            public Builder clusterStatQueueSubmission(java.util.List < ClusterStatQueueSubmission> clusterStatQueueSubmission) {
                this.clusterStatQueueSubmission = clusterStatQueueSubmission;
                return this;
            }

            public QueueSubmissionList build() {
                return new QueueSubmissionList(this);
            } 

        } 

    }
}
