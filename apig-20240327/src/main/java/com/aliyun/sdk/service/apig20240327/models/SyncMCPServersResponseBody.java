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
 * {@link SyncMCPServersResponseBody} extends {@link TeaModel}
 *
 * <p>SyncMCPServersResponseBody</p>
 */
public class SyncMCPServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private SyncMCPServersResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncMCPServersResponseBody create() {
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

        private Builder(SyncMCPServersResponseBody model) {
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
         * 
         * <strong>example:</strong>
         * <p>2F46B9E7-67EF-5C8A-BA52-D38D5B32AF2C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SyncMCPServersResponseBody build() {
            return new SyncMCPServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SyncMCPServersResponseBody} extends {@link TeaModel}
     *
     * <p>SyncMCPServersResponseBody</p>
     */
    public static class FailedMcpServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mcpServerName")
        private String mcpServerName;

        @com.aliyun.core.annotation.NameInMap("protocols")
        private java.util.List<String> protocols;

        private FailedMcpServers(Builder builder) {
            this.mcpServerName = builder.mcpServerName;
            this.protocols = builder.protocols;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedMcpServers create() {
            return builder().build();
        }

        /**
         * @return mcpServerName
         */
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        /**
         * @return protocols
         */
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        public static final class Builder {
            private String mcpServerName; 
            private java.util.List<String> protocols; 

            private Builder() {
            } 

            private Builder(FailedMcpServers model) {
                this.mcpServerName = model.mcpServerName;
                this.protocols = model.protocols;
            } 

            /**
             * mcpServerName.
             */
            public Builder mcpServerName(String mcpServerName) {
                this.mcpServerName = mcpServerName;
                return this;
            }

            /**
             * protocols.
             */
            public Builder protocols(java.util.List<String> protocols) {
                this.protocols = protocols;
                return this;
            }

            public FailedMcpServers build() {
                return new FailedMcpServers(this);
            } 

        } 

    }
    /**
     * 
     * {@link SyncMCPServersResponseBody} extends {@link TeaModel}
     *
     * <p>SyncMCPServersResponseBody</p>
     */
    public static class SucceedMcpServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mcpServerName")
        private String mcpServerName;

        @com.aliyun.core.annotation.NameInMap("protocols")
        private java.util.List<String> protocols;

        private SucceedMcpServers(Builder builder) {
            this.mcpServerName = builder.mcpServerName;
            this.protocols = builder.protocols;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SucceedMcpServers create() {
            return builder().build();
        }

        /**
         * @return mcpServerName
         */
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        /**
         * @return protocols
         */
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        public static final class Builder {
            private String mcpServerName; 
            private java.util.List<String> protocols; 

            private Builder() {
            } 

            private Builder(SucceedMcpServers model) {
                this.mcpServerName = model.mcpServerName;
                this.protocols = model.protocols;
            } 

            /**
             * mcpServerName.
             */
            public Builder mcpServerName(String mcpServerName) {
                this.mcpServerName = mcpServerName;
                return this;
            }

            /**
             * protocols.
             */
            public Builder protocols(java.util.List<String> protocols) {
                this.protocols = protocols;
                return this;
            }

            public SucceedMcpServers build() {
                return new SucceedMcpServers(this);
            } 

        } 

    }
    /**
     * 
     * {@link SyncMCPServersResponseBody} extends {@link TeaModel}
     *
     * <p>SyncMCPServersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("failedMcpServers")
        private java.util.List<FailedMcpServers> failedMcpServers;

        @com.aliyun.core.annotation.NameInMap("succeedMcpServers")
        private java.util.List<SucceedMcpServers> succeedMcpServers;

        private Data(Builder builder) {
            this.failedMcpServers = builder.failedMcpServers;
            this.succeedMcpServers = builder.succeedMcpServers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failedMcpServers
         */
        public java.util.List<FailedMcpServers> getFailedMcpServers() {
            return this.failedMcpServers;
        }

        /**
         * @return succeedMcpServers
         */
        public java.util.List<SucceedMcpServers> getSucceedMcpServers() {
            return this.succeedMcpServers;
        }

        public static final class Builder {
            private java.util.List<FailedMcpServers> failedMcpServers; 
            private java.util.List<SucceedMcpServers> succeedMcpServers; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failedMcpServers = model.failedMcpServers;
                this.succeedMcpServers = model.succeedMcpServers;
            } 

            /**
             * failedMcpServers.
             */
            public Builder failedMcpServers(java.util.List<FailedMcpServers> failedMcpServers) {
                this.failedMcpServers = failedMcpServers;
                return this;
            }

            /**
             * succeedMcpServers.
             */
            public Builder succeedMcpServers(java.util.List<SucceedMcpServers> succeedMcpServers) {
                this.succeedMcpServers = succeedMcpServers;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
