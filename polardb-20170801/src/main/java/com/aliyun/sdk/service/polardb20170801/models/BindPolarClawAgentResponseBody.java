// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link BindPolarClawAgentResponseBody} extends {@link TeaModel}
 *
 * <p>BindPolarClawAgentResponseBody</p>
 */
public class BindPolarClawAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Binding")
    private Binding binding;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalBindings")
    private Integer totalBindings;

    private BindPolarClawAgentResponseBody(Builder builder) {
        this.agentId = builder.agentId;
        this.applicationId = builder.applicationId;
        this.binding = builder.binding;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.totalBindings = builder.totalBindings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindPolarClawAgentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return binding
     */
    public Binding getBinding() {
        return this.binding;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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

    /**
     * @return totalBindings
     */
    public Integer getTotalBindings() {
        return this.totalBindings;
    }

    public static final class Builder {
        private String agentId; 
        private String applicationId; 
        private Binding binding; 
        private Integer code; 
        private String message; 
        private String requestId; 
        private Integer totalBindings; 

        private Builder() {
        } 

        private Builder(BindPolarClawAgentResponseBody model) {
            this.agentId = model.agentId;
            this.applicationId = model.applicationId;
            this.binding = model.binding;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.totalBindings = model.totalBindings;
        } 

        /**
         * <p>Agent ID</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Binding.
         */
        public Builder binding(Binding binding) {
            this.binding = binding;
            return this;
        }

        /**
         * <p>200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>successful</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
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

        /**
         * TotalBindings.
         */
        public Builder totalBindings(Integer totalBindings) {
            this.totalBindings = totalBindings;
            return this;
        }

        public BindPolarClawAgentResponseBody build() {
            return new BindPolarClawAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BindPolarClawAgentResponseBody} extends {@link TeaModel}
     *
     * <p>BindPolarClawAgentResponseBody</p>
     */
    public static class Binding extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        private Binding(Builder builder) {
            this.accountId = builder.accountId;
            this.agentId = builder.agentId;
            this.channel = builder.channel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Binding create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        public static final class Builder {
            private String accountId; 
            private String agentId; 
            private String channel; 

            private Builder() {
            } 

            private Builder(Binding model) {
                this.accountId = model.accountId;
                this.agentId = model.agentId;
                this.channel = model.channel;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>Agent ID</p>
             * 
             * <strong>example:</strong>
             * <p>work</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            public Binding build() {
                return new Binding(this);
            } 

        } 

    }
}
