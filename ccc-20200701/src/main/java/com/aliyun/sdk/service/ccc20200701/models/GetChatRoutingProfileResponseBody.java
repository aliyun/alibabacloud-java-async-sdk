// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link GetChatRoutingProfileResponseBody} extends {@link TeaModel}
 *
 * <p>GetChatRoutingProfileResponseBody</p>
 */
public class GetChatRoutingProfileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetChatRoutingProfileResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatRoutingProfileResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetChatRoutingProfileResponseBody build() {
            return new GetChatRoutingProfileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetChatRoutingProfileResponseBody} extends {@link TeaModel}
     *
     * <p>GetChatRoutingProfileResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentConcurrencySettings")
        private String agentConcurrencySettings;

        @com.aliyun.core.annotation.NameInMap("ChatSettings")
        private String chatSettings;

        @com.aliyun.core.annotation.NameInMap("DistributionSettings")
        private String distributionSettings;

        @com.aliyun.core.annotation.NameInMap("RoutingType")
        private String routingType;

        private Data(Builder builder) {
            this.agentConcurrencySettings = builder.agentConcurrencySettings;
            this.chatSettings = builder.chatSettings;
            this.distributionSettings = builder.distributionSettings;
            this.routingType = builder.routingType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentConcurrencySettings
         */
        public String getAgentConcurrencySettings() {
            return this.agentConcurrencySettings;
        }

        /**
         * @return chatSettings
         */
        public String getChatSettings() {
            return this.chatSettings;
        }

        /**
         * @return distributionSettings
         */
        public String getDistributionSettings() {
            return this.distributionSettings;
        }

        /**
         * @return routingType
         */
        public String getRoutingType() {
            return this.routingType;
        }

        public static final class Builder {
            private String agentConcurrencySettings; 
            private String chatSettings; 
            private String distributionSettings; 
            private String routingType; 

            /**
             * AgentConcurrencySettings.
             */
            public Builder agentConcurrencySettings(String agentConcurrencySettings) {
                this.agentConcurrencySettings = agentConcurrencySettings;
                return this;
            }

            /**
             * ChatSettings.
             */
            public Builder chatSettings(String chatSettings) {
                this.chatSettings = chatSettings;
                return this;
            }

            /**
             * DistributionSettings.
             */
            public Builder distributionSettings(String distributionSettings) {
                this.distributionSettings = distributionSettings;
                return this;
            }

            /**
             * RoutingType.
             */
            public Builder routingType(String routingType) {
                this.routingType = routingType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
