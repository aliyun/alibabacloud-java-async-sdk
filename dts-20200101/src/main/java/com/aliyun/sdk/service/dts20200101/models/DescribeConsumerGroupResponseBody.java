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
         * ConsumerChannels.
         */
        public Builder consumerChannels(ConsumerChannels consumerChannels) {
            this.consumerChannels = consumerChannels;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * TotalRecordCount.
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
             * ConsumerGroupID.
             */
            public Builder consumerGroupID(String consumerGroupID) {
                this.consumerGroupID = consumerGroupID;
                return this;
            }

            /**
             * ConsumerGroupName.
             */
            public Builder consumerGroupName(String consumerGroupName) {
                this.consumerGroupName = consumerGroupName;
                return this;
            }

            /**
             * ConsumerGroupUserName.
             */
            public Builder consumerGroupUserName(String consumerGroupUserName) {
                this.consumerGroupUserName = consumerGroupUserName;
                return this;
            }

            /**
             * ConsumptionCheckpoint.
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * MessageDelay.
             */
            public Builder messageDelay(Long messageDelay) {
                this.messageDelay = messageDelay;
                return this;
            }

            /**
             * UnconsumedData.
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
