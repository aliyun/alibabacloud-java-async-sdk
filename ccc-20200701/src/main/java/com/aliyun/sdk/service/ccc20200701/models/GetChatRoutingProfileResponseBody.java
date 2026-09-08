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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetChatRoutingProfileResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30C7D235-DDCF-4C7F-A462-5E2598252C2B</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentConcurrencySettings = model.agentConcurrencySettings;
                this.chatSettings = model.chatSettings;
                this.distributionSettings = model.distributionSettings;
                this.routingType = model.routingType;
            } 

            /**
             * <p>Agent session concurrent configuration.</p>
             * <ul>
             * <li><p>AllowExceedingLimitWhenTransferring: Allow exceeding the limit when transferring. When transferring sessions to other agents, exceeding the recipient\&quot;s limit is allowed, but the total cannot exceed 30.</p>
             * </li>
             * <li><p>AllowExceedingLimitWhenClaiming: Allow exceeding the limit when claiming. When an agent actively claims sessions from the queue, exceeding the limit is allowed, but the total cannot exceed 30.</p>
             * </li>
             * <li><p>ConcurrencyLimit: The number of network business sessions an agent can process simultaneously.</p>
             * </li>
             * <li><p>Enabled: Enable this configuration.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;AllowExceedingLimitWhenTransferring&quot;: false,
             *     &quot;ConcurrencyLimit&quot;: 4,
             *     &quot;AllowExceedingLimitWhenClaiming&quot;: true,
             *     &quot;Enabled&quot;: true
             * }</p>
             */
            public Builder agentConcurrencySettings(String agentConcurrencySettings) {
                this.agentConcurrencySettings = agentConcurrencySettings;
                return this;
            }

            /**
             * <p>Session configuration.</p>
             * <ul>
             * <li>IdleChatTimeoutSeconds: Automatic session end time. If no customer response is received within a specific period, the system ends the session. Unit: seconds.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;IdleChatTimeoutSeconds&quot;:300}</p>
             */
            public Builder chatSettings(String chatSettings) {
                this.chatSettings = chatSettings;
                return this;
            }

            /**
             * <p>Agent session allocation configuration.</p>
             * <ul>
             * <li><p>AgentRingTimeoutSeconds: Agent processing timeout limit.</p>
             * </li>
             * <li><p>MaxNumberOfConversationsAgentCanMiss: The maximum number of consecutive unanswered sessions an agent can miss.</p>
             * </li>
             * <li><p>PostAgentMissingConversionsAction: After an agent misses more than the set number of consecutive responses, the system sets the agent\&quot;s status, such as Break, Invisible, or Nothing (remain unchanged).</p>
             * </li>
             * <li><p>Enabled: Enable.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;AgentRingTimeoutSeconds&quot;: 30,
             *     &quot;Enabled&quot;: true,
             *     &quot;MaxNumberOfConversationsAgentCanMiss&quot;: 5,
             *     &quot;PostAgentMissingConversionsAction&quot;: &quot;Nothing&quot;
             * }</p>
             */
            public Builder distributionSettings(String distributionSettings) {
                this.distributionSettings = distributionSettings;
                return this;
            }

            /**
             * <p>Call distribution type.</p>
             * <ul>
             * <li><p>Automatic distribution (Automatic).</p>
             * </li>
             * <li><p>Manual distribution (Manual).</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Automatic</p>
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
