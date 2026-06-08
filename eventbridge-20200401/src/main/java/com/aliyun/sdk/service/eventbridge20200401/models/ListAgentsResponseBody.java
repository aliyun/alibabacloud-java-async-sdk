// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link ListAgentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentsResponseBody</p>
 */
public class ListAgentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAgentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentsResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAgentsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAgentsResponseBody build() {
            return new ListAgentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agents")
        private java.util.List<Agent> agents;

        @com.aliyun.core.annotation.NameInMap("FirstId")
        private String firstId;

        @com.aliyun.core.annotation.NameInMap("HasMore")
        private String hasMore;

        @com.aliyun.core.annotation.NameInMap("LastId")
        private String lastId;

        private Data(Builder builder) {
            this.agents = builder.agents;
            this.firstId = builder.firstId;
            this.hasMore = builder.hasMore;
            this.lastId = builder.lastId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agents
         */
        public java.util.List<Agent> getAgents() {
            return this.agents;
        }

        /**
         * @return firstId
         */
        public String getFirstId() {
            return this.firstId;
        }

        /**
         * @return hasMore
         */
        public String getHasMore() {
            return this.hasMore;
        }

        /**
         * @return lastId
         */
        public String getLastId() {
            return this.lastId;
        }

        public static final class Builder {
            private java.util.List<Agent> agents; 
            private String firstId; 
            private String hasMore; 
            private String lastId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agents = model.agents;
                this.firstId = model.firstId;
                this.hasMore = model.hasMore;
                this.lastId = model.lastId;
            } 

            /**
             * Agents.
             */
            public Builder agents(java.util.List<Agent> agents) {
                this.agents = agents;
                return this;
            }

            /**
             * FirstId.
             */
            public Builder firstId(String firstId) {
                this.firstId = firstId;
                return this;
            }

            /**
             * HasMore.
             */
            public Builder hasMore(String hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * LastId.
             */
            public Builder lastId(String lastId) {
                this.lastId = lastId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
