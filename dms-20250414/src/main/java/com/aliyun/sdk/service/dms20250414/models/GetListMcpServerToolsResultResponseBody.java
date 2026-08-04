// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetListMcpServerToolsResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetListMcpServerToolsResultResponseBody</p>
 */
public class GetListMcpServerToolsResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetListMcpServerToolsResultResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetListMcpServerToolsResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetListMcpServerToolsResultResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetListMcpServerToolsResultResponseBody build() {
            return new GetListMcpServerToolsResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetListMcpServerToolsResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetListMcpServerToolsResultResponseBody</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InputSchema")
        private String inputSchema;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Tools(Builder builder) {
            this.description = builder.description;
            this.inputSchema = builder.inputSchema;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return inputSchema
         */
        public String getInputSchema() {
            return this.inputSchema;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private String inputSchema; 
            private String name; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.description = model.description;
                this.inputSchema = model.inputSchema;
                this.name = model.name;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * InputSchema.
             */
            public Builder inputSchema(String inputSchema) {
                this.inputSchema = inputSchema;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetListMcpServerToolsResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetListMcpServerToolsResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accessible")
        private Boolean accessible;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Tools")
        private java.util.List<Tools> tools;

        private Data(Builder builder) {
            this.accessible = builder.accessible;
            this.state = builder.state;
            this.tools = builder.tools;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessible
         */
        public Boolean getAccessible() {
            return this.accessible;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return tools
         */
        public java.util.List<Tools> getTools() {
            return this.tools;
        }

        public static final class Builder {
            private Boolean accessible; 
            private String state; 
            private java.util.List<Tools> tools; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessible = model.accessible;
                this.state = model.state;
                this.tools = model.tools;
            } 

            /**
             * Accessible.
             */
            public Builder accessible(Boolean accessible) {
                this.accessible = accessible;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Tools.
             */
            public Builder tools(java.util.List<Tools> tools) {
                this.tools = tools;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
