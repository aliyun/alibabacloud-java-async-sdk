// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTopicStatusResponseBody} extends {@link TeaModel}
 *
 * <p>OnsTopicStatusResponseBody</p>
 */
public class OnsTopicStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private OnsTopicStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsTopicStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The data structure of the queried topic.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsTopicStatusResponseBody build() {
            return new OnsTopicStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("LastTimeStamp")
        private Long lastTimeStamp;

        @NameInMap("Perm")
        private Integer perm;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.lastTimeStamp = builder.lastTimeStamp;
            this.perm = builder.perm;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return lastTimeStamp
         */
        public Long getLastTimeStamp() {
            return this.lastTimeStamp;
        }

        /**
         * @return perm
         */
        public Integer getPerm() {
            return this.perm;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long lastTimeStamp; 
            private Integer perm; 
            private Long totalCount; 

            /**
             * The point in time when the latest message is ready in the topic. If no message exists in the topic, the return value of this parameter is 0.
             * <p>
             * 
             * The value of this parameter is a UNIX timestamp in milliseconds.
             * 
             * For information about the definition of ready messages and ready time, see [Terms](~~29533~~).
             */
            public Builder lastTimeStamp(Long lastTimeStamp) {
                this.lastTimeStamp = lastTimeStamp;
                return this;
            }

            /**
             * Indicates the operations that you can perform on the topic. Valid values:
             * <p>
             * 
             * *   **2**: You can publish messages to the topic.
             * *   **4**: You can subscribe to the topic.
             * *   **6**: You can publish messages to and subscribe to the topic.
             */
            public Builder perm(Integer perm) {
                this.perm = perm;
                return this;
            }

            /**
             * The total number of messages in all partitions of the topic.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
