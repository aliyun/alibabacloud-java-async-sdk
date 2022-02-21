// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueueOutputStatisticInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetQueueOutputStatisticInfoResponseBody</p>
 */
public class GetQueueOutputStatisticInfoResponseBody extends TeaModel {
    @NameInMap("QueueOutputList")
    private QueueOutputList queueOutputList;

    @NameInMap("RequestId")
    private String requestId;

    private GetQueueOutputStatisticInfoResponseBody(Builder builder) {
        this.queueOutputList = builder.queueOutputList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueueOutputStatisticInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return queueOutputList
     */
    public QueueOutputList getQueueOutputList() {
        return this.queueOutputList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private QueueOutputList queueOutputList; 
        private String requestId; 

        /**
         * QueueOutputList.
         */
        public Builder queueOutputList(QueueOutputList queueOutputList) {
            this.queueOutputList = queueOutputList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetQueueOutputStatisticInfoResponseBody build() {
            return new GetQueueOutputStatisticInfoResponseBody(this);
        } 

    } 

    public static class ClusterStatQueueOutput extends TeaModel {
        @NameInMap("BytesOutput")
        private Long bytesOutput;

        @NameInMap("Queue")
        private String queue;

        private ClusterStatQueueOutput(Builder builder) {
            this.bytesOutput = builder.bytesOutput;
            this.queue = builder.queue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterStatQueueOutput create() {
            return builder().build();
        }

        /**
         * @return bytesOutput
         */
        public Long getBytesOutput() {
            return this.bytesOutput;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        public static final class Builder {
            private Long bytesOutput; 
            private String queue; 

            /**
             * BytesOutput.
             */
            public Builder bytesOutput(Long bytesOutput) {
                this.bytesOutput = bytesOutput;
                return this;
            }

            /**
             * Queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            public ClusterStatQueueOutput build() {
                return new ClusterStatQueueOutput(this);
            } 

        } 

    }
    public static class QueueOutputList extends TeaModel {
        @NameInMap("ClusterStatQueueOutput")
        private java.util.List < ClusterStatQueueOutput> clusterStatQueueOutput;

        private QueueOutputList(Builder builder) {
            this.clusterStatQueueOutput = builder.clusterStatQueueOutput;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueOutputList create() {
            return builder().build();
        }

        /**
         * @return clusterStatQueueOutput
         */
        public java.util.List < ClusterStatQueueOutput> getClusterStatQueueOutput() {
            return this.clusterStatQueueOutput;
        }

        public static final class Builder {
            private java.util.List < ClusterStatQueueOutput> clusterStatQueueOutput; 

            /**
             * ClusterStatQueueOutput.
             */
            public Builder clusterStatQueueOutput(java.util.List < ClusterStatQueueOutput> clusterStatQueueOutput) {
                this.clusterStatQueueOutput = clusterStatQueueOutput;
                return this;
            }

            public QueueOutputList build() {
                return new QueueOutputList(this);
            } 

        } 

    }
}
