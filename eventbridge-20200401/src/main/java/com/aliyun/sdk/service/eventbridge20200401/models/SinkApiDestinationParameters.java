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
 * {@link SinkApiDestinationParameters} extends {@link TeaModel}
 *
 * <p>SinkApiDestinationParameters</p>
 */
public class SinkApiDestinationParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BodyParameters")
    private BodyParameters bodyParameters;

    @com.aliyun.core.annotation.NameInMap("HeaderParameters")
    private HeaderParameters headerParameters;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("QueryStringParameters")
    private QueryStringParameters queryStringParameters;

    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    private SinkApiDestinationParameters(Builder builder) {
        this.bodyParameters = builder.bodyParameters;
        this.headerParameters = builder.headerParameters;
        this.name = builder.name;
        this.queryStringParameters = builder.queryStringParameters;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SinkApiDestinationParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bodyParameters
     */
    public BodyParameters getBodyParameters() {
        return this.bodyParameters;
    }

    /**
     * @return headerParameters
     */
    public HeaderParameters getHeaderParameters() {
        return this.headerParameters;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return queryStringParameters
     */
    public QueryStringParameters getQueryStringParameters() {
        return this.queryStringParameters;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder {
        private BodyParameters bodyParameters; 
        private HeaderParameters headerParameters; 
        private String name; 
        private QueryStringParameters queryStringParameters; 
        private Integer timeout; 

        private Builder() {
        } 

        private Builder(SinkApiDestinationParameters model) {
            this.bodyParameters = model.bodyParameters;
            this.headerParameters = model.headerParameters;
            this.name = model.name;
            this.queryStringParameters = model.queryStringParameters;
            this.timeout = model.timeout;
        } 

        /**
         * <p>The parameters for the HTTP request body, specified as key-value pairs.</p>
         */
        public Builder bodyParameters(BodyParameters bodyParameters) {
            this.bodyParameters = bodyParameters;
            return this;
        }

        /**
         * <p>The custom HTTP header parameters to add to the request, specified as key-value pairs.</p>
         */
        public Builder headerParameters(HeaderParameters headerParameters) {
            this.headerParameters = headerParameters;
            return this;
        }

        /**
         * <p>The name of the API destination.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The query string parameters to add to the endpoint URL, specified as key-value pairs.</p>
         */
        public Builder queryStringParameters(QueryStringParameters queryStringParameters) {
            this.queryStringParameters = queryStringParameters;
            return this;
        }

        /**
         * <p>The timeout for the API call, in seconds. If the endpoint does not respond within this period, the call fails. The valid range is 1 to 60.</p>
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public SinkApiDestinationParameters build() {
            return new SinkApiDestinationParameters(this);
        } 

    } 

    /**
     * 
     * {@link SinkApiDestinationParameters} extends {@link TeaModel}
     *
     * <p>SinkApiDestinationParameters</p>
     */
    public static class BodyParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private BodyParameters(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BodyParameters create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(BodyParameters model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>Defines how the parameter\&quot;s value is created. Use <code>CONSTANT</code> to specify a static string in the <code>value</code> field. Use <code>JSONPATH</code> to extract data from the event payload with a JSONPath expression in the <code>value</code> field. Use <code>TEMPLATE</code> to build the value from the <code>template</code> field.</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template to use to build the parameter value. This field is used only when the <code>form</code> is set to <code>TEMPLATE</code>. You can use variables, such as <code>${event.id}</code>, in the template to reference event data.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The static value or JSONPath expression for the parameter. This field applies only when the <code>form</code> is set to <code>CONSTANT</code> or <code>JSONPATH</code>.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public BodyParameters build() {
                return new BodyParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link SinkApiDestinationParameters} extends {@link TeaModel}
     *
     * <p>SinkApiDestinationParameters</p>
     */
    public static class HeaderParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private HeaderParameters(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderParameters create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(HeaderParameters model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>Defines how the parameter\&quot;s value is created. Use <code>CONSTANT</code> to specify a static string in the <code>value</code> field. Use <code>JSONPATH</code> to extract data from the event payload with a JSONPath expression in the <code>value</code> field. Use <code>TEMPLATE</code> to build the value from the <code>template</code> field.</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template to use to build the parameter value. This field is used only when the <code>form</code> is set to <code>TEMPLATE</code>. You can use variables, such as <code>${event.id}</code>, in the template to reference event data.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The static value or JSONPath expression for the parameter. This field applies only when the <code>form</code> is set to <code>CONSTANT</code> or <code>JSONPATH</code>.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public HeaderParameters build() {
                return new HeaderParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link SinkApiDestinationParameters} extends {@link TeaModel}
     *
     * <p>SinkApiDestinationParameters</p>
     */
    public static class QueryStringParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private QueryStringParameters(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryStringParameters create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(QueryStringParameters model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>Defines how the parameter\&quot;s value is created. Use <code>CONSTANT</code> to specify a static string in the <code>value</code> field. Use <code>JSONPATH</code> to extract data from the event payload with a JSONPath expression in the <code>value</code> field. Use <code>TEMPLATE</code> to build the value from the <code>template</code> field.</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template to use to build the parameter value. This field is used only when the <code>form</code> is set to <code>TEMPLATE</code>. You can use variables, such as <code>${event.id}</code>, in the template to reference event data.</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The static value or JSONPath expression for the parameter. This field applies only when the <code>form</code> is set to <code>CONSTANT</code> or <code>JSONPATH</code>.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QueryStringParameters build() {
                return new QueryStringParameters(this);
            } 

        } 

    }
}
