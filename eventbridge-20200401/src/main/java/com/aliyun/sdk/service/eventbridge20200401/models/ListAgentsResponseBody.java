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
         * <p>The API status code or POP error code. Valid values: Success: The operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to list agents</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud generates a unique identifier for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7DA60DED-CD36-5837-B848-C01A23D2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returns true if the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The list of agents.</p>
             */
            public Builder agents(java.util.List<Agent> agents) {
                this.agents = agents;
                return this;
            }

            /**
             * <p>The ID of the first record.</p>
             * 
             * <strong>example:</strong>
             * <p>uat-agent</p>
             */
            public Builder firstId(String firstId) {
                this.firstId = firstId;
                return this;
            }

            /**
             * <p>Indicates whether more pages are available. Valid values:</p>
             * <ul>
             * <li><p>true: More pages are available.</p>
             * </li>
             * <li><p>false: No more pages are available.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasMore(String hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * <p>The ID of the last record.</p>
             * 
             * <strong>example:</strong>
             * <p>last-agent</p>
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
