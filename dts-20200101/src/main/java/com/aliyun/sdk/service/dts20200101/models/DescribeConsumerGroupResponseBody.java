// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConsumerGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConsumerGroupResponseBody</p>
 */
public class DescribeConsumerGroupResponseBody extends TeaModel {
    @NameInMap("ConsumerChannels")
    private ConsumerChannels consumerChannels;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeConsumerGroupResponseBody(Builder builder) {
        this.consumerChannels = builder.consumerChannels;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConsumerGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return consumerChannels
     */
    public ConsumerChannels getConsumerChannels() {
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
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private ConsumerChannels consumerChannels; 
        private String errCode; 
        private String errMessage; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private String success; 
        private Integer totalRecordCount; 

        /**
         * The list of consumer groups.
         */
        public Builder consumerChannels(ConsumerChannels consumerChannels) {
            this.consumerChannels = consumerChannels;
            return this;
        }

        /**
         * The error code returned if the call failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the call failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The page number of the returned page.
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
         * Indicates whether the call was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of consumer groups.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeConsumerGroupResponseBody build() {
            return new DescribeConsumerGroupResponseBody(this);
        } 

    } 

    public static class DescribeConsumerChannel extends TeaModel {
        @NameInMap("ConsumerGroupID")
        private String consumerGroupID;

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

        private DescribeConsumerChannel(Builder builder) {
            this.consumerGroupID = builder.consumerGroupID;
            this.consumerGroupName = builder.consumerGroupName;
            this.consumerGroupUserName = builder.consumerGroupUserName;
            this.consumptionCheckpoint = builder.consumptionCheckpoint;
            this.messageDelay = builder.messageDelay;
            this.unconsumedData = builder.unconsumedData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeConsumerChannel create() {
            return builder().build();
        }

        /**
         * @return consumerGroupID
         */
        public String getConsumerGroupID() {
            return this.consumerGroupID;
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
            private String consumerGroupID; 
            private String consumerGroupName; 
            private String consumerGroupUserName; 
            private String consumptionCheckpoint; 
            private Long messageDelay; 
            private Long unconsumedData; 

            /**
             * The ID of the consumer group.
             */
            public Builder consumerGroupID(String consumerGroupID) {
                this.consumerGroupID = consumerGroupID;
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
             * The consumption checkpoint, which is the time when the latest data record was consumed by the change tracking client. The format is *yyyy-MM-dd*T*HH:mm:ss*Z. The time is displayed in UTC.
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * The message delay, which is the current time minus the timestamp of the earliest unconsumed message in the change tracking instance. Unit: seconds.
             * <p>
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
             * >  If the return value of this parameter is **-1**, no client is connected to the consumer group.
             */
            public Builder unconsumedData(Long unconsumedData) {
                this.unconsumedData = unconsumedData;
                return this;
            }

            public DescribeConsumerChannel build() {
                return new DescribeConsumerChannel(this);
            } 

        } 

    }
    public static class ConsumerChannels extends TeaModel {
        @NameInMap("DescribeConsumerChannel")
        private java.util.List < DescribeConsumerChannel> describeConsumerChannel;

        private ConsumerChannels(Builder builder) {
            this.describeConsumerChannel = builder.describeConsumerChannel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerChannels create() {
            return builder().build();
        }

        /**
         * @return describeConsumerChannel
         */
        public java.util.List < DescribeConsumerChannel> getDescribeConsumerChannel() {
            return this.describeConsumerChannel;
        }

        public static final class Builder {
            private java.util.List < DescribeConsumerChannel> describeConsumerChannel; 

            /**
             * DescribeConsumerChannel.
             */
            public Builder describeConsumerChannel(java.util.List < DescribeConsumerChannel> describeConsumerChannel) {
                this.describeConsumerChannel = describeConsumerChannel;
                return this;
            }

            public ConsumerChannels build() {
                return new ConsumerChannels(this);
            } 

        } 

    }
}
