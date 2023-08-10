// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConsumerChannelResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConsumerChannelResponseBody</p>
 */
public class DescribeConsumerChannelResponseBody extends TeaModel {
    @NameInMap("ConsumerChannels")
    private java.util.List < ConsumerChannels> consumerChannels;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("TotalRecordCount")
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

    /**
     * @return consumerChannels
     */
    public java.util.List < ConsumerChannels> getConsumerChannels() {
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
        private java.util.List < ConsumerChannels> consumerChannels; 
        private String errCode; 
        private String errMessage; 
        private String httpStatusCode; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private String success; 
        private Long totalRecordCount; 

        /**
         * The details of the consumer groups.
         */
        public Builder consumerChannels(java.util.List < ConsumerChannels> consumerChannels) {
            this.consumerChannels = consumerChannels;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The maximum number of consumer groups that can be displayed on one page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of consumer groups.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeConsumerChannelResponseBody build() {
            return new DescribeConsumerChannelResponseBody(this);
        } 

    } 

    public static class ConsumerChannels extends TeaModel {
        @NameInMap("ConsumerGroupId")
        private String consumerGroupId;

        @NameInMap("ConsumerGroupName")
        private String consumerGroupName;

        @NameInMap("ConsumerGroupUserName")
        private String consumerGroupUserName;

        @NameInMap("ConsumptionCheckpoint")
        private String consumptionCheckpoint;

        @NameInMap("MessageDelay")
        private Long messageDelay;

        @NameInMap("UnconsumedData")
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

            /**
             * The ID of the consumer group.
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * The name of the consumer group.
             */
            public Builder consumerGroupName(String consumerGroupName) {
                this.consumerGroupName = consumerGroupName;
                return this;
            }

            /**
             * The username of the consumer group.
             */
            public Builder consumerGroupUserName(String consumerGroupUserName) {
                this.consumerGroupUserName = consumerGroupUserName;
                return this;
            }

            /**
             * The consumption checkpoint, which is the time when the latest data record was consumed by the change tracking client. The time is displayed in the yyyy-MM-ddTHH:mm:ssZ format in UTC.
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * The message latency, which is the timestamp of the latest data consumed by the downstream client minus the timestamp of the latest data tracked by the change tracking task. The value is a UNIX timestamp. Unit: seconds.
             * <p>
             * 
             * For example, the latest data in the source database is generated at 10:00. The change tracking task reads the data generated at 09:55, and the downstream client consumes the data generated at 09:30. In this case, the message latency is the UNIX timestamp difference between 09:55 and 09:30.
             * 
             * >  If the return value of this parameter is **-1**, no client is connected to the consumer group.
             */
            public Builder messageDelay(Long messageDelay) {
                this.messageDelay = messageDelay;
                return this;
            }

            /**
             * The total number of unconsumed messages, which is the number of unconsumed data records plus the number of heartbeat messages.
             * <p>
             * 
             * >  If the return value of this parameter is -1, no client is connected to the consumer group.
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
