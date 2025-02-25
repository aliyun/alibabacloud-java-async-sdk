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
 * {@link DescribeConsumerGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConsumerGroupResponseBody</p>
 */
public class DescribeConsumerGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConsumerChannels")
    private ConsumerChannels consumerChannels;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
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
         * <p>The list of consumer groups.</p>
         */
        public Builder consumerChannels(ConsumerChannels consumerChannels) {
            this.consumerChannels = consumerChannels;
            return this;
        }

        /**
         * <p>The error code returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
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
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4204E899-8193-4D7D-A4FB-3A7F9063****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
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
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeConsumerGroupResponseBody build() {
            return new DescribeConsumerGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeConsumerGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConsumerGroupResponseBody</p>
     */
    public static class DescribeConsumerChannel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumerGroupID")
        private String consumerGroupID;

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
             * <p>The ID of the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>dtspis1110z232****</p>
             */
            public Builder consumerGroupID(String consumerGroupID) {
                this.consumerGroupID = consumerGroupID;
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
             * <p>test</p>
             */
            public Builder consumerGroupUserName(String consumerGroupUserName) {
                this.consumerGroupUserName = consumerGroupUserName;
                return this;
            }

            /**
             * <p>The consumption checkpoint, which is the time when the latest data record was consumed by the change tracking client. The format is <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-02T12:00:00Z</p>
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * <p>The message delay, which is the current time minus the timestamp of the earliest unconsumed message in the change tracking instance. Unit: seconds.</p>
             * <blockquote>
             * <p> If the return value of this parameter is <strong>-1</strong>, no client is connected to the consumer group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>172714</p>
             */
            public Builder messageDelay(Long messageDelay) {
                this.messageDelay = messageDelay;
                return this;
            }

            /**
             * <p>The total number of unconsumed messages, which is the number of unconsumed data records plus the number of heartbeat messages.</p>
             * <blockquote>
             * <p> If the return value of this parameter is <strong>-1</strong>, no client is connected to the consumer group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>186600</p>
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
    /**
     * 
     * {@link DescribeConsumerGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConsumerGroupResponseBody</p>
     */
    public static class ConsumerChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DescribeConsumerChannel")
        private java.util.List<DescribeConsumerChannel> describeConsumerChannel;

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
        public java.util.List<DescribeConsumerChannel> getDescribeConsumerChannel() {
            return this.describeConsumerChannel;
        }

        public static final class Builder {
            private java.util.List<DescribeConsumerChannel> describeConsumerChannel; 

            /**
             * DescribeConsumerChannel.
             */
            public Builder describeConsumerChannel(java.util.List<DescribeConsumerChannel> describeConsumerChannel) {
                this.describeConsumerChannel = describeConsumerChannel;
                return this;
            }

            public ConsumerChannels build() {
                return new ConsumerChannels(this);
            } 

        } 

    }
}
