// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ListAiToolsResponse} extends {@link TeaModel}
 *
 * <p>ListAiToolsResponse</p>
 */
public class ListAiToolsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<ListAiToolsResponseBody> body;

    private ListAiToolsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAiToolsResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public java.util.List<ListAiToolsResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAiToolsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List<ListAiToolsResponseBody> body);

        @Override
        ListAiToolsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAiToolsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private java.util.List<ListAiToolsResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAiToolsResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List<ListAiToolsResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAiToolsResponse build() {
            return new ListAiToolsResponse(this);
        } 

    } 

    /**
     * 
     * {@link ListAiToolsResponse} extends {@link TeaModel}
     *
     * <p>ListAiToolsResponse</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("option")
        private java.util.List<String> option;

        @com.aliyun.core.annotation.NameInMap("required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("example")
        private String example;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        private Fields(Builder builder) {
            this.name = builder.name;
            this.option = builder.option;
            this.required = builder.required;
            this.type = builder.type;
            this.example = builder.example;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return option
         */
        public java.util.List<String> getOption() {
            return this.option;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return example
         */
        public String getExample() {
            return this.example;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> option; 
            private Boolean required; 
            private String type; 
            private String example; 
            private String description; 

            private Builder() {
            } 

            private Builder(Fields model) {
                this.name = model.name;
                this.option = model.option;
                this.required = model.required;
                this.type = model.type;
                this.example = model.example;
                this.description = model.description;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * option.
             */
            public Builder option(java.util.List<String> option) {
                this.option = option;
                return this;
            }

            /**
             * required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * example.
             */
            public Builder example(String example) {
                this.example = example;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAiToolsResponse} extends {@link TeaModel}
     *
     * <p>ListAiToolsResponse</p>
     */
    public static class ListAiToolsResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fields")
        private java.util.List<Fields> fields;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        private ListAiToolsResponseBody(Builder builder) {
            this.fields = builder.fields;
            this.name = builder.name;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListAiToolsResponseBody create() {
            return builder().build();
        }

        /**
         * @return fields
         */
        public java.util.List<Fields> getFields() {
            return this.fields;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private java.util.List<Fields> fields; 
            private String name; 
            private String description; 

            private Builder() {
            } 

            private Builder(ListAiToolsResponseBody model) {
                this.fields = model.fields;
                this.name = model.name;
                this.description = model.description;
            } 

            /**
             * fields.
             */
            public Builder fields(java.util.List<Fields> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public ListAiToolsResponseBody build() {
                return new ListAiToolsResponseBody(this);
            } 

        } 

    }
}
