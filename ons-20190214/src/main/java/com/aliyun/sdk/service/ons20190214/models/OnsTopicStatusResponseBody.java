// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsTopicStatusResponseBody} extends {@link TeaModel}
 *
 * <p>OnsTopicStatusResponseBody</p>
 */
public class OnsTopicStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The data structure of the queried topic.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>427EE49D-D762-41FB-8F3D-9BAC96C3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsTopicStatusResponseBody build() {
            return new OnsTopicStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OnsTopicStatusResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTopicStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LastTimeStamp")
        private Long lastTimeStamp;

        @com.aliyun.core.annotation.NameInMap("Perm")
        private Integer perm;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The point in time when the latest message is ready in the topic. If no message exists in the topic, the return value of this parameter is 0.</p>
             * <p>The value of this parameter is a UNIX timestamp in milliseconds.</p>
             * <p>For information about the definition of ready messages and ready time, see <a href="https://help.aliyun.com/document_detail/29533.html">Terms</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>1570864984364</p>
             */
            public Builder lastTimeStamp(Long lastTimeStamp) {
                this.lastTimeStamp = lastTimeStamp;
                return this;
            }

            /**
             * <p>Indicates the operations that you can perform on the topic. Valid values:</p>
             * <ul>
             * <li><strong>2</strong>: You can publish messages to the topic.</li>
             * <li><strong>4</strong>: You can subscribe to the topic.</li>
             * <li><strong>6</strong>: You can publish messages to and subscribe to the topic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder perm(Integer perm) {
                this.perm = perm;
                return this;
            }

            /**
             * <p>The total number of messages in all partitions of the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>2310</p>
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
