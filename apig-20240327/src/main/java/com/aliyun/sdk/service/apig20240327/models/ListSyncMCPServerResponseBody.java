// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListSyncMCPServerResponseBody} extends {@link TeaModel}
 *
 * <p>ListSyncMCPServerResponseBody</p>
 */
public class ListSyncMCPServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListSyncMCPServerResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSyncMCPServerResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSyncMCPServerResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSyncMCPServerResponseBody build() {
            return new ListSyncMCPServerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSyncMCPServerResponseBody} extends {@link TeaModel}
     *
     * <p>ListSyncMCPServerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domainIds")
        private java.util.List<String> domainIds;

        @com.aliyun.core.annotation.NameInMap("mcpServers")
        private java.util.List<String> mcpServers;

        private Data(Builder builder) {
            this.domainIds = builder.domainIds;
            this.mcpServers = builder.mcpServers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return domainIds
         */
        public java.util.List<String> getDomainIds() {
            return this.domainIds;
        }

        /**
         * @return mcpServers
         */
        public java.util.List<String> getMcpServers() {
            return this.mcpServers;
        }

        public static final class Builder {
            private java.util.List<String> domainIds; 
            private java.util.List<String> mcpServers; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.domainIds = model.domainIds;
                this.mcpServers = model.mcpServers;
            } 

            /**
             * domainIds.
             */
            public Builder domainIds(java.util.List<String> domainIds) {
                this.domainIds = domainIds;
                return this;
            }

            /**
             * mcpServers.
             */
            public Builder mcpServers(java.util.List<String> mcpServers) {
                this.mcpServers = mcpServers;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
