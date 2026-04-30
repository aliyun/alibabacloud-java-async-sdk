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
 * {@link ListPolarClawBindingsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPolarClawBindingsResponseBody</p>
 */
public class ListPolarClawBindingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Bindings")
    private java.util.List<Bindings> bindings;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPolarClawBindingsResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.bindings = builder.bindings;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolarClawBindingsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return bindings
     */
    public java.util.List<Bindings> getBindings() {
        return this.bindings;
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

    public static final class Builder {
        private String applicationId; 
        private java.util.List<Bindings> bindings; 
        private Integer code; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPolarClawBindingsResponseBody model) {
            this.applicationId = model.applicationId;
            this.bindings = model.bindings;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Bindings.
         */
        public Builder bindings(java.util.List<Bindings> bindings) {
            this.bindings = bindings;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7F2007D3-7E74-4ECB-89A8-BF130D******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPolarClawBindingsResponseBody build() {
            return new ListPolarClawBindingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPolarClawBindingsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolarClawBindingsResponseBody</p>
     */
    public static class Bindings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("ChannelAccountId")
        private String channelAccountId;

        private Bindings(Builder builder) {
            this.agentId = builder.agentId;
            this.channel = builder.channel;
            this.channelAccountId = builder.channelAccountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bindings create() {
            return builder().build();
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

        /**
         * @return channelAccountId
         */
        public String getChannelAccountId() {
            return this.channelAccountId;
        }

        public static final class Builder {
            private String agentId; 
            private String channel; 
            private String channelAccountId; 

            private Builder() {
            } 

            private Builder(Bindings model) {
                this.agentId = model.agentId;
                this.channel = model.channel;
                this.channelAccountId = model.channelAccountId;
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
             * <p>Channel ID</p>
             * 
             * <strong>example:</strong>
             * <p>feishu</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>Account ID</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder channelAccountId(String channelAccountId) {
                this.channelAccountId = channelAccountId;
                return this;
            }

            public Bindings build() {
                return new Bindings(this);
            } 

        } 

    }
}
