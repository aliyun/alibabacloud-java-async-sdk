// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryConsumerGroupStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryConsumerGroupStatusResponseBody</p>
 */
public class QueryConsumerGroupStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccumulatedConsumeCountPerMinute")
    private Integer accumulatedConsumeCountPerMinute;

    @com.aliyun.core.annotation.NameInMap("AccumulationCount")
    private Integer accumulationCount;

    @com.aliyun.core.annotation.NameInMap("ClientConnectionStatusList")
    private ClientConnectionStatusList clientConnectionStatusList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ConsumerSpeed")
    private Integer consumerSpeed;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("LastConsumerTime")
    private String lastConsumerTime;

    @com.aliyun.core.annotation.NameInMap("RealTimeConsumeCountPerMinute")
    private Integer realTimeConsumeCountPerMinute;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryConsumerGroupStatusResponseBody(Builder builder) {
        this.accumulatedConsumeCountPerMinute = builder.accumulatedConsumeCountPerMinute;
        this.accumulationCount = builder.accumulationCount;
        this.clientConnectionStatusList = builder.clientConnectionStatusList;
        this.code = builder.code;
        this.consumerSpeed = builder.consumerSpeed;
        this.errorMessage = builder.errorMessage;
        this.lastConsumerTime = builder.lastConsumerTime;
        this.realTimeConsumeCountPerMinute = builder.realTimeConsumeCountPerMinute;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConsumerGroupStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accumulatedConsumeCountPerMinute
     */
    public Integer getAccumulatedConsumeCountPerMinute() {
        return this.accumulatedConsumeCountPerMinute;
    }

    /**
     * @return accumulationCount
     */
    public Integer getAccumulationCount() {
        return this.accumulationCount;
    }

    /**
     * @return clientConnectionStatusList
     */
    public ClientConnectionStatusList getClientConnectionStatusList() {
        return this.clientConnectionStatusList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return consumerSpeed
     */
    public Integer getConsumerSpeed() {
        return this.consumerSpeed;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return lastConsumerTime
     */
    public String getLastConsumerTime() {
        return this.lastConsumerTime;
    }

    /**
     * @return realTimeConsumeCountPerMinute
     */
    public Integer getRealTimeConsumeCountPerMinute() {
        return this.realTimeConsumeCountPerMinute;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer accumulatedConsumeCountPerMinute; 
        private Integer accumulationCount; 
        private ClientConnectionStatusList clientConnectionStatusList; 
        private String code; 
        private Integer consumerSpeed; 
        private String errorMessage; 
        private String lastConsumerTime; 
        private Integer realTimeConsumeCountPerMinute; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryConsumerGroupStatusResponseBody model) {
            this.accumulatedConsumeCountPerMinute = model.accumulatedConsumeCountPerMinute;
            this.accumulationCount = model.accumulationCount;
            this.clientConnectionStatusList = model.clientConnectionStatusList;
            this.code = model.code;
            this.consumerSpeed = model.consumerSpeed;
            this.errorMessage = model.errorMessage;
            this.lastConsumerTime = model.lastConsumerTime;
            this.realTimeConsumeCountPerMinute = model.realTimeConsumeCountPerMinute;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The message consumption rate. Unit: messages/minute.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder accumulatedConsumeCountPerMinute(Integer accumulatedConsumeCountPerMinute) {
            this.accumulatedConsumeCountPerMinute = accumulatedConsumeCountPerMinute;
            return this;
        }

        /**
         * <p>The number of accumulated messages.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        public Builder accumulationCount(Integer accumulationCount) {
            this.accumulationCount = accumulationCount;
            return this;
        }

        /**
         * <p>The details about the client. For more information, see <strong>ConsumerGroupClientConnectionInfo</strong>.</p>
         */
        public Builder clientConnectionStatusList(ClientConnectionStatusList clientConnectionStatusList) {
            this.clientConnectionStatusList = clientConnectionStatusList;
            return this;
        }

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="/help/en/iot-platform/latest/bce100">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message consumption rate of the consumer group. Unit: messages/minute.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        public Builder consumerSpeed(Integer consumerSpeed) {
            this.consumerSpeed = consumerSpeed;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The time when the last message was consumed. The time is in the yyyy-MM-dd&quot;T&quot;HH:mm:ss.SSSZ format. The time is displayed in UTC and accurate to milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-29T03:37:56.000Z</p>
         */
        public Builder lastConsumerTime(String lastConsumerTime) {
            this.lastConsumerTime = lastConsumerTime;
            return this;
        }

        /**
         * <p>The consumption rate of real-time messages in the consumer group. Unit: messages/minute.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        public Builder realTimeConsumeCountPerMinute(Integer realTimeConsumeCountPerMinute) {
            this.realTimeConsumeCountPerMinute = realTimeConsumeCountPerMinute;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryConsumerGroupStatusResponseBody build() {
            return new QueryConsumerGroupStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryConsumerGroupStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConsumerGroupStatusResponseBody</p>
     */
    public static class ConsumerGroupClientConnectionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccumulatedConsumeCountPerMinute")
        private Integer accumulatedConsumeCountPerMinute;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientIpPort")
        private String clientIpPort;

        @com.aliyun.core.annotation.NameInMap("OnlineTime")
        private Long onlineTime;

        @com.aliyun.core.annotation.NameInMap("RealTimeConsumeCountPerMinute")
        private Integer realTimeConsumeCountPerMinute;

        private ConsumerGroupClientConnectionInfo(Builder builder) {
            this.accumulatedConsumeCountPerMinute = builder.accumulatedConsumeCountPerMinute;
            this.clientId = builder.clientId;
            this.clientIpPort = builder.clientIpPort;
            this.onlineTime = builder.onlineTime;
            this.realTimeConsumeCountPerMinute = builder.realTimeConsumeCountPerMinute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerGroupClientConnectionInfo create() {
            return builder().build();
        }

        /**
         * @return accumulatedConsumeCountPerMinute
         */
        public Integer getAccumulatedConsumeCountPerMinute() {
            return this.accumulatedConsumeCountPerMinute;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientIpPort
         */
        public String getClientIpPort() {
            return this.clientIpPort;
        }

        /**
         * @return onlineTime
         */
        public Long getOnlineTime() {
            return this.onlineTime;
        }

        /**
         * @return realTimeConsumeCountPerMinute
         */
        public Integer getRealTimeConsumeCountPerMinute() {
            return this.realTimeConsumeCountPerMinute;
        }

        public static final class Builder {
            private Integer accumulatedConsumeCountPerMinute; 
            private String clientId; 
            private String clientIpPort; 
            private Long onlineTime; 
            private Integer realTimeConsumeCountPerMinute; 

            private Builder() {
            } 

            private Builder(ConsumerGroupClientConnectionInfo model) {
                this.accumulatedConsumeCountPerMinute = model.accumulatedConsumeCountPerMinute;
                this.clientId = model.clientId;
                this.clientIpPort = model.clientIpPort;
                this.onlineTime = model.onlineTime;
                this.realTimeConsumeCountPerMinute = model.realTimeConsumeCountPerMinute;
            } 

            /**
             * <p>The consumption rate of accumulated messages on a single client of the consumer group. Unit: messages/minute.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder accumulatedConsumeCountPerMinute(Integer accumulatedConsumeCountPerMinute) {
                this.accumulatedConsumeCountPerMinute = accumulatedConsumeCountPerMinute;
                return this;
            }

            /**
             * <p>The ID of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>868575026******</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The IP address and port of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.2:36918</p>
             */
            public Builder clientIpPort(String clientIpPort) {
                this.clientIpPort = clientIpPort;
                return this;
            }

            /**
             * <p>The last time when the client was online. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1591240546649</p>
             */
            public Builder onlineTime(Long onlineTime) {
                this.onlineTime = onlineTime;
                return this;
            }

            /**
             * <p>The consumption rate of real-time messages on a single client of the consumer group. Unit: messages/minute.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder realTimeConsumeCountPerMinute(Integer realTimeConsumeCountPerMinute) {
                this.realTimeConsumeCountPerMinute = realTimeConsumeCountPerMinute;
                return this;
            }

            public ConsumerGroupClientConnectionInfo build() {
                return new ConsumerGroupClientConnectionInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryConsumerGroupStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConsumerGroupStatusResponseBody</p>
     */
    public static class ClientConnectionStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumerGroupClientConnectionInfo")
        private java.util.List<ConsumerGroupClientConnectionInfo> consumerGroupClientConnectionInfo;

        private ClientConnectionStatusList(Builder builder) {
            this.consumerGroupClientConnectionInfo = builder.consumerGroupClientConnectionInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientConnectionStatusList create() {
            return builder().build();
        }

        /**
         * @return consumerGroupClientConnectionInfo
         */
        public java.util.List<ConsumerGroupClientConnectionInfo> getConsumerGroupClientConnectionInfo() {
            return this.consumerGroupClientConnectionInfo;
        }

        public static final class Builder {
            private java.util.List<ConsumerGroupClientConnectionInfo> consumerGroupClientConnectionInfo; 

            private Builder() {
            } 

            private Builder(ClientConnectionStatusList model) {
                this.consumerGroupClientConnectionInfo = model.consumerGroupClientConnectionInfo;
            } 

            /**
             * ConsumerGroupClientConnectionInfo.
             */
            public Builder consumerGroupClientConnectionInfo(java.util.List<ConsumerGroupClientConnectionInfo> consumerGroupClientConnectionInfo) {
                this.consumerGroupClientConnectionInfo = consumerGroupClientConnectionInfo;
                return this;
            }

            public ClientConnectionStatusList build() {
                return new ClientConnectionStatusList(this);
            } 

        } 

    }
}
