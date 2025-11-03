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

    private SinkApiDestinationParameters(Builder builder) {
        this.bodyParameters = builder.bodyParameters;
        this.headerParameters = builder.headerParameters;
        this.name = builder.name;
        this.queryStringParameters = builder.queryStringParameters;
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

    public static final class Builder {
        private BodyParameters bodyParameters; 
        private HeaderParameters headerParameters; 
        private String name; 
        private QueryStringParameters queryStringParameters; 

        private Builder() {
        } 

        private Builder(SinkApiDestinationParameters model) {
            this.bodyParameters = model.bodyParameters;
            this.headerParameters = model.headerParameters;
            this.name = model.name;
            this.queryStringParameters = model.queryStringParameters;
        } 

        /**
         * BodyParameters.
         */
        public Builder bodyParameters(BodyParameters bodyParameters) {
            this.bodyParameters = bodyParameters;
            return this;
        }

        /**
         * HeaderParameters.
         */
        public Builder headerParameters(HeaderParameters headerParameters) {
            this.headerParameters = headerParameters;
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
         * QueryStringParameters.
         */
        public Builder queryStringParameters(QueryStringParameters queryStringParameters) {
            this.queryStringParameters = queryStringParameters;
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
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
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
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
