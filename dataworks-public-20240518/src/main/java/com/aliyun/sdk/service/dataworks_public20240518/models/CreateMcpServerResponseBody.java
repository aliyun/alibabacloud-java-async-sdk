// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateMcpServerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMcpServerResponseBody</p>
 */
public class CreateMcpServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("McpServer")
    private McpServer mcpServer;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateMcpServerResponseBody(Builder builder) {
        this.mcpServer = builder.mcpServer;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcpServerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mcpServer
     */
    public McpServer getMcpServer() {
        return this.mcpServer;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private McpServer mcpServer; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateMcpServerResponseBody model) {
            this.mcpServer = model.mcpServer;
            this.requestId = model.requestId;
        } 

        /**
         * McpServer.
         */
        public Builder mcpServer(McpServer mcpServer) {
            this.mcpServer = mcpServer;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMcpServerResponseBody build() {
            return new CreateMcpServerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMcpServerResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpServerResponseBody</p>
     */
    public static class McpServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private McpServer(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpServer create() {
            return builder().build();
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private String name; 

            private Builder() {
            } 

            private Builder(McpServer model) {
                this.gmtCreateTime = model.gmtCreateTime;
                this.name = model.name;
            } 

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>1780555634000</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public McpServer build() {
                return new McpServer(this);
            } 

        } 

    }
}
