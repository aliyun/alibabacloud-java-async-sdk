// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComponentIndexResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComponentIndexResponseBody</p>
 */
public class DescribeComponentIndexResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeComponentIndexResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComponentIndexResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeComponentIndexResponseBody build() {
            return new DescribeComponentIndexResponseBody(this);
        } 

    } 

    public static class Template extends TeaModel {
        @NameInMap("aliases")
        private java.util.Map < String, ? > aliases;

        @NameInMap("mappings")
        private java.util.Map < String, ? > mappings;

        @NameInMap("settings")
        private java.util.Map < String, ? > settings;

        private Template(Builder builder) {
            this.aliases = builder.aliases;
            this.mappings = builder.mappings;
            this.settings = builder.settings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return aliases
         */
        public java.util.Map < String, ? > getAliases() {
            return this.aliases;
        }

        /**
         * @return mappings
         */
        public java.util.Map < String, ? > getMappings() {
            return this.mappings;
        }

        /**
         * @return settings
         */
        public java.util.Map < String, ? > getSettings() {
            return this.settings;
        }

        public static final class Builder {
            private java.util.Map < String, ? > aliases; 
            private java.util.Map < String, ? > mappings; 
            private java.util.Map < String, ? > settings; 

            /**
             * aliases.
             */
            public Builder aliases(java.util.Map < String, ? > aliases) {
                this.aliases = aliases;
                return this;
            }

            /**
             * mappings.
             */
            public Builder mappings(java.util.Map < String, ? > mappings) {
                this.mappings = mappings;
                return this;
            }

            /**
             * settings.
             */
            public Builder settings(java.util.Map < String, ? > settings) {
                this.settings = settings;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("_meta")
        private java.util.Map < String, ? > meta;

        @NameInMap("template")
        private Template template;

        private Result(Builder builder) {
            this.meta = builder.meta;
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return meta
         */
        public java.util.Map < String, ? > getMeta() {
            return this.meta;
        }

        /**
         * @return template
         */
        public Template getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private java.util.Map < String, ? > meta; 
            private Template template; 

            /**
             * _meta.
             */
            public Builder meta(java.util.Map < String, ? > meta) {
                this.meta = meta;
                return this;
            }

            /**
             * template.
             */
            public Builder template(Template template) {
                this.template = template;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
