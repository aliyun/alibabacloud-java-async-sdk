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
         * <p>The MCP Server connectivity detection result. The business status is distinguished by the State field.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The return code. The value success is returned if the request succeeds. An error code is returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when a system-level request failure occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>no mcp connect test record for session</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate this API call.</p>
         * 
         * <strong>example:</strong>
         * <p>550***544</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The description of the MCP tool functionality.</p>
             * 
             * <strong>example:</strong>
             * <p>query user information by user ID</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The JSON Schema string of the tool input parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;userId&quot;:{&quot;type&quot;:&quot;string&quot;}}}</p>
             */
            public Builder inputSchema(String inputSchema) {
                this.inputSchema = inputSchema;
                return this;
            }

            /**
             * <p>The MCP tool name.</p>
             * 
             * <strong>example:</strong>
             * <p>query_user</p>
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
             * <p>Indicates whether the MCP Server is accessible. The value is true only when State is success.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder accessible(Boolean accessible) {
                this.accessible = accessible;
                return this;
            }

            /**
             * <p>The detection status. Valid values:</p>
             * <ul>
             * <li>pending: The detection is in progress.</li>
             * <li>success: The detection succeeded.</li>
             * <li>failed: The detection failed or timed out.</li>
             * </ul>
             * <p>The top-level Success field can be true in all three business states.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The list of detected MCP tools. A non-empty list is returned only when State is success.</p>
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
