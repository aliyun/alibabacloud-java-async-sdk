// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConsumerGroupStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryConsumerGroupStatusResponseBody</p>
 */
public class QueryConsumerGroupStatusResponseBody extends TeaModel {
    @NameInMap("AccumulatedConsumeCountPerMinute")
    private Integer accumulatedConsumeCountPerMinute;

    @NameInMap("AccumulationCount")
    private Integer accumulationCount;

    @NameInMap("ClientConnectionStatusList")
    private ClientConnectionStatusList clientConnectionStatusList;

    @NameInMap("Code")
    private String code;

    @NameInMap("ConsumerSpeed")
    private Integer consumerSpeed;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("LastConsumerTime")
    private String lastConsumerTime;

    @NameInMap("RealTimeConsumeCountPerMinute")
    private Integer realTimeConsumeCountPerMinute;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * AccumulatedConsumeCountPerMinute.
         */
        public Builder accumulatedConsumeCountPerMinute(Integer accumulatedConsumeCountPerMinute) {
            this.accumulatedConsumeCountPerMinute = accumulatedConsumeCountPerMinute;
            return this;
        }

        /**
         * AccumulationCount.
         */
        public Builder accumulationCount(Integer accumulationCount) {
            this.accumulationCount = accumulationCount;
            return this;
        }

        /**
         * ClientConnectionStatusList.
         */
        public Builder clientConnectionStatusList(ClientConnectionStatusList clientConnectionStatusList) {
            this.clientConnectionStatusList = clientConnectionStatusList;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ConsumerSpeed.
         */
        public Builder consumerSpeed(Integer consumerSpeed) {
            this.consumerSpeed = consumerSpeed;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * LastConsumerTime.
         */
        public Builder lastConsumerTime(String lastConsumerTime) {
            this.lastConsumerTime = lastConsumerTime;
            return this;
        }

        /**
         * RealTimeConsumeCountPerMinute.
         */
        public Builder realTimeConsumeCountPerMinute(Integer realTimeConsumeCountPerMinute) {
            this.realTimeConsumeCountPerMinute = realTimeConsumeCountPerMinute;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryConsumerGroupStatusResponseBody build() {
            return new QueryConsumerGroupStatusResponseBody(this);
        } 

    } 

    public static class ConsumerGroupClientConnectionInfo extends TeaModel {
        @NameInMap("AccumulatedConsumeCountPerMinute")
        private Integer accumulatedConsumeCountPerMinute;

        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("ClientIpPort")
        private String clientIpPort;

        @NameInMap("OnlineTime")
        private Long onlineTime;

        @NameInMap("RealTimeConsumeCountPerMinute")
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

            /**
             * AccumulatedConsumeCountPerMinute.
             */
            public Builder accumulatedConsumeCountPerMinute(Integer accumulatedConsumeCountPerMinute) {
                this.accumulatedConsumeCountPerMinute = accumulatedConsumeCountPerMinute;
                return this;
            }

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * ClientIpPort.
             */
            public Builder clientIpPort(String clientIpPort) {
                this.clientIpPort = clientIpPort;
                return this;
            }

            /**
             * OnlineTime.
             */
            public Builder onlineTime(Long onlineTime) {
                this.onlineTime = onlineTime;
                return this;
            }

            /**
             * RealTimeConsumeCountPerMinute.
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
    public static class ClientConnectionStatusList extends TeaModel {
        @NameInMap("ConsumerGroupClientConnectionInfo")
        private java.util.List < ConsumerGroupClientConnectionInfo> consumerGroupClientConnectionInfo;

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
        public java.util.List < ConsumerGroupClientConnectionInfo> getConsumerGroupClientConnectionInfo() {
            return this.consumerGroupClientConnectionInfo;
        }

        public static final class Builder {
            private java.util.List < ConsumerGroupClientConnectionInfo> consumerGroupClientConnectionInfo; 

            /**
             * ConsumerGroupClientConnectionInfo.
             */
            public Builder consumerGroupClientConnectionInfo(java.util.List < ConsumerGroupClientConnectionInfo> consumerGroupClientConnectionInfo) {
                this.consumerGroupClientConnectionInfo = consumerGroupClientConnectionInfo;
                return this;
            }

            public ClientConnectionStatusList build() {
                return new ClientConnectionStatusList(this);
            } 

        } 

    }
}
