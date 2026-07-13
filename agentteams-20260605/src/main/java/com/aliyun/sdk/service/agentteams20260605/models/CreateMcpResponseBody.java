// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link CreateMcpResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMcpResponseBody</p>
 */
public class CreateMcpResponseBody extends TeaModel {
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

    private CreateMcpResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcpResponseBody create() {
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

        private Builder(CreateMcpResponseBody model) {
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

        public CreateMcpResponseBody build() {
            return new CreateMcpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Addresses")
        private java.util.List<String> addresses;

        @com.aliyun.core.annotation.NameInMap("CreateType")
        private String createType;

        @com.aliyun.core.annotation.NameInMap("DeployStatus")
        private String deployStatus;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("McpServerConfig")
        private String mcpServerConfig;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private Data(Builder builder) {
            this.addresses = builder.addresses;
            this.createType = builder.createType;
            this.deployStatus = builder.deployStatus;
            this.description = builder.description;
            this.id = builder.id;
            this.mcpServerConfig = builder.mcpServerConfig;
            this.name = builder.name;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return addresses
         */
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        /**
         * @return createType
         */
        public String getCreateType() {
            return this.createType;
        }

        /**
         * @return deployStatus
         */
        public String getDeployStatus() {
            return this.deployStatus;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mcpServerConfig
         */
        public String getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private java.util.List<String> addresses; 
            private String createType; 
            private String deployStatus; 
            private String description; 
            private String id; 
            private String mcpServerConfig; 
            private String name; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.addresses = model.addresses;
                this.createType = model.createType;
                this.deployStatus = model.deployStatus;
                this.description = model.description;
                this.id = model.id;
                this.mcpServerConfig = model.mcpServerConfig;
                this.name = model.name;
                this.protocol = model.protocol;
            } 

            /**
             * Addresses.
             */
            public Builder addresses(java.util.List<String> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * CreateType.
             */
            public Builder createType(String createType) {
                this.createType = createType;
                return this;
            }

            /**
             * DeployStatus.
             */
            public Builder deployStatus(String deployStatus) {
                this.deployStatus = deployStatus;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * McpServerConfig.
             */
            public Builder mcpServerConfig(String mcpServerConfig) {
                this.mcpServerConfig = mcpServerConfig;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
