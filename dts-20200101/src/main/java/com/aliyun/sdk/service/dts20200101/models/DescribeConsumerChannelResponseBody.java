// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeConsumerChannelResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConsumerChannelResponseBody</p>
 */
public class DescribeConsumerChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConsumerChannels")
    private java.util.List<ConsumerChannels> consumerChannels;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribeConsumerChannelResponseBody(Builder builder) {
        this.consumerChannels = builder.consumerChannels;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConsumerChannelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerChannels
     */
    public java.util.List<ConsumerChannels> getConsumerChannels() {
        return this.consumerChannels;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<ConsumerChannels> consumerChannels; 
        private String errCode; 
        private String errMessage; 
        private String httpStatusCode; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private String success; 
        private Long totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeConsumerChannelResponseBody model) {
            this.consumerChannels = model.consumerChannels;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The details of the consumer groups.</p>
         */
        public Builder consumerChannels(java.util.List<ConsumerChannels> consumerChannels) {
            this.consumerChannels = consumerChannels;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The maximum number of consumer groups that can be displayed on one page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D66140B3-C747-42B6-8315-BAF6490E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of consumer groups.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeConsumerChannelResponseBody build() {
            return new DescribeConsumerChannelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeConsumerChannelResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConsumerChannelResponseBody</p>
     */
    public static class ConsumerChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("ConsumerGroupName")
        private String consumerGroupName;

        @com.aliyun.core.annotation.NameInMap("ConsumerGroupUserName")
        private String consumerGroupUserName;

        @com.aliyun.core.annotation.NameInMap("ConsumptionCheckpoint")
        private String consumptionCheckpoint;

        @com.aliyun.core.annotation.NameInMap("MessageDelay")
        private Long messageDelay;

        @com.aliyun.core.annotation.NameInMap("UnconsumedData")
        private Long unconsumedData;

        private ConsumerChannels(Builder builder) {
            this.consumerGroupId = builder.consumerGroupId;
            this.consumerGroupName = builder.consumerGroupName;
            this.consumerGroupUserName = builder.consumerGroupUserName;
            this.consumptionCheckpoint = builder.consumptionCheckpoint;
            this.messageDelay = builder.messageDelay;
            this.unconsumedData = builder.unconsumedData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerChannels create() {
            return builder().build();
        }

        /**
         * @return consumerGroupId
         */
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        /**
         * @return consumerGroupName
         */
        public String getConsumerGroupName() {
            return this.consumerGroupName;
        }

        /**
         * @return consumerGroupUserName
         */
        public String getConsumerGroupUserName() {
            return this.consumerGroupUserName;
        }

        /**
         * @return consumptionCheckpoint
         */
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        /**
         * @return messageDelay
         */
        public Long getMessageDelay() {
            return this.messageDelay;
        }

        /**
         * @return unconsumedData
         */
        public Long getUnconsumedData() {
            return this.unconsumedData;
        }

        public static final class Builder {
            private String consumerGroupId; 
            private String consumerGroupName; 
            private String consumerGroupUserName; 
            private String consumptionCheckpoint; 
            private Long messageDelay; 
            private Long unconsumedData; 

            private Builder() {
            } 

            private Builder(ConsumerChannels model) {
                this.consumerGroupId = model.consumerGroupId;
                this.consumerGroupName = model.consumerGroupName;
                this.consumerGroupUserName = model.consumerGroupUserName;
                this.consumptionCheckpoint = model.consumptionCheckpoint;
                this.messageDelay = model.messageDelay;
                this.unconsumedData = model.unconsumedData;
            } 

            /**
             * <p>The ID of the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsor2y66j4219****</p>
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * <p>The name of the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>consumergrouptest</p>
             */
            public Builder consumerGroupName(String consumerGroupName) {
                this.consumerGroupName = consumerGroupName;
                return this;
            }

            /**
             * <p>The username of the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
             */
            public Builder consumerGroupUserName(String consumerGroupUserName) {
                this.consumerGroupUserName = consumerGroupUserName;
                return this;
            }

            /**
             * <p>The consumption checkpoint, which is the time when the latest data record was consumed by the change tracking client. The time is displayed in the yyyy-MM-ddTHH:mm:ssZ format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-20T12:00:00Z</p>
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * <p>The message latency, which is the timestamp of the latest data consumed by the downstream client minus the timestamp of the latest data tracked by the change tracking task. The value is a UNIX timestamp. Unit: seconds.</p>
             * <p>For example, the latest data in the source database is generated at 10:00. The change tracking task reads the data generated at 09:55, and the downstream client consumes the data generated at 09:30. In this case, the message latency is the UNIX timestamp difference between 09:55 and 09:30.</p>
             * <blockquote>
             * <p> If the return value of this parameter is <strong>-1</strong>, no client is connected to the consumer group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1500</p>
             */
            public Builder messageDelay(Long messageDelay) {
                this.messageDelay = messageDelay;
                return this;
            }

            /**
             * <p>The total number of unconsumed messages, which is the number of unconsumed data records plus the number of heartbeat messages.</p>
             * <blockquote>
             * <p> If the return value of this parameter is -1, no client is connected to the consumer group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>186600</p>
             */
            public Builder unconsumedData(Long unconsumedData) {
                this.unconsumedData = unconsumedData;
                return this;
            }

            public ConsumerChannels build() {
                return new ConsumerChannels(this);
            } 

        } 

    }
}
