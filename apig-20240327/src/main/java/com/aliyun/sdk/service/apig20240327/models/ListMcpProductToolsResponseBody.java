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
 * {@link ListMcpProductToolsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMcpProductToolsResponseBody</p>
 */
public class ListMcpProductToolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListMcpProductToolsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcpProductToolsResponseBody create() {
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

        private Builder(ListMcpProductToolsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMcpProductToolsResponseBody build() {
            return new ListMcpProductToolsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMcpProductToolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcpProductToolsResponseBody</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("annotations")
        private java.util.Map<String, ?> annotations;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("inputSchema")
        private java.util.Map<String, ?> inputSchema;

        @com.aliyun.core.annotation.NameInMap("meta")
        private java.util.Map<String, ?> meta;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outputSchema")
        private java.util.Map<String, ?> outputSchema;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Tools(Builder builder) {
            this.annotations = builder.annotations;
            this.description = builder.description;
            this.inputSchema = builder.inputSchema;
            this.meta = builder.meta;
            this.name = builder.name;
            this.outputSchema = builder.outputSchema;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public java.util.Map<String, ?> getAnnotations() {
            return this.annotations;
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
        public java.util.Map<String, ?> getInputSchema() {
            return this.inputSchema;
        }

        /**
         * @return meta
         */
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputSchema
         */
        public java.util.Map<String, ?> getOutputSchema() {
            return this.outputSchema;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.Map<String, ?> annotations; 
            private String description; 
            private java.util.Map<String, ?> inputSchema; 
            private java.util.Map<String, ?> meta; 
            private String name; 
            private java.util.Map<String, ?> outputSchema; 
            private String title; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.annotations = model.annotations;
                this.description = model.description;
                this.inputSchema = model.inputSchema;
                this.meta = model.meta;
                this.name = model.name;
                this.outputSchema = model.outputSchema;
                this.title = model.title;
            } 

            /**
             * <p>The annotation information of the tool, which is a map structure. The API definition declares it only as map<any> without specifying its members or purposes.</p>
             */
            public Builder annotations(java.util.Map<String, ?> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * <p>The description of the tool.</p>
             * 
             * <strong>example:</strong>
             * <p>Functional description of the sample tool</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The input parameter structure definition of the tool, which is a map structure. The API definition declares it only as map<any> without specifying its members or constraints.</p>
             */
            public Builder inputSchema(java.util.Map<String, ?> inputSchema) {
                this.inputSchema = inputSchema;
                return this;
            }

            /**
             * <p>The metadata information of the tool, which is a map structure. The API definition declares it only as map<any> without specifying its members or purposes.</p>
             */
            public Builder meta(java.util.Map<String, ?> meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The name of the tool.</p>
             * 
             * <strong>example:</strong>
             * <p>test-tool</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The output result structure definition of the tool, which is a map structure. The API definition declares it only as map<any> without specifying its members or constraints.</p>
             */
            public Builder outputSchema(java.util.Map<String, ?> outputSchema) {
                this.outputSchema = outputSchema;
                return this;
            }

            /**
             * <p>The title of the tool.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample tool</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMcpProductToolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcpProductToolsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<Tools> tools;

        private Data(Builder builder) {
            this.tools = builder.tools;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return tools
         */
        public java.util.List<Tools> getTools() {
            return this.tools;
        }

        public static final class Builder {
            private java.util.List<Tools> tools; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.tools = model.tools;
            } 

            /**
             * <p>The list of MCP tools. Each element in the list represents an MCP tool.</p>
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
