// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueueInputStatisticInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetQueueInputStatisticInfoResponseBody</p>
 */
public class GetQueueInputStatisticInfoResponseBody extends TeaModel {
    @NameInMap("QueueInputList")
    private QueueInputList queueInputList;

    @NameInMap("RequestId")
    private String requestId;

    private GetQueueInputStatisticInfoResponseBody(Builder builder) {
        this.queueInputList = builder.queueInputList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueueInputStatisticInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return queueInputList
     */
    public QueueInputList getQueueInputList() {
        return this.queueInputList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private QueueInputList queueInputList; 
        private String requestId; 

        /**
         * QueueInputList.
         */
        public Builder queueInputList(QueueInputList queueInputList) {
            this.queueInputList = queueInputList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetQueueInputStatisticInfoResponseBody build() {
            return new GetQueueInputStatisticInfoResponseBody(this);
        } 

    } 

    public static class ClusterStatQueueInput extends TeaModel {
        @NameInMap("BytesInput")
        private Long bytesInput;

        @NameInMap("Queue")
        private String queue;

        private ClusterStatQueueInput(Builder builder) {
            this.bytesInput = builder.bytesInput;
            this.queue = builder.queue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterStatQueueInput create() {
            return builder().build();
        }

        /**
         * @return bytesInput
         */
        public Long getBytesInput() {
            return this.bytesInput;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        public static final class Builder {
            private Long bytesInput; 
            private String queue; 

            /**
             * BytesInput.
             */
            public Builder bytesInput(Long bytesInput) {
                this.bytesInput = bytesInput;
                return this;
            }

            /**
             * Queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            public ClusterStatQueueInput build() {
                return new ClusterStatQueueInput(this);
            } 

        } 

    }
    public static class QueueInputList extends TeaModel {
        @NameInMap("ClusterStatQueueInput")
        private java.util.List < ClusterStatQueueInput> clusterStatQueueInput;

        private QueueInputList(Builder builder) {
            this.clusterStatQueueInput = builder.clusterStatQueueInput;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueInputList create() {
            return builder().build();
        }

        /**
         * @return clusterStatQueueInput
         */
        public java.util.List < ClusterStatQueueInput> getClusterStatQueueInput() {
            return this.clusterStatQueueInput;
        }

        public static final class Builder {
            private java.util.List < ClusterStatQueueInput> clusterStatQueueInput; 

            /**
             * ClusterStatQueueInput.
             */
            public Builder clusterStatQueueInput(java.util.List < ClusterStatQueueInput> clusterStatQueueInput) {
                this.clusterStatQueueInput = clusterStatQueueInput;
                return this;
            }

            public QueueInputList build() {
                return new QueueInputList(this);
            } 

        } 

    }
}
