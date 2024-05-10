// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListComponentIndicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListComponentIndicesResponseBody</p>
 */
public class ListComponentIndicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private Headers headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private ListComponentIndicesResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComponentIndicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * Headers.
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
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
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListComponentIndicesResponseBody build() {
            return new ListComponentIndicesResponseBody(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X-Total-Count")
        private Long xTotalCount;

        private Headers(Builder builder) {
            this.xTotalCount = builder.xTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return xTotalCount
         */
        public Long getXTotalCount() {
            return this.xTotalCount;
        }

        public static final class Builder {
            private Long xTotalCount; 

            /**
             * X-Total-Count.
             */
            public Builder xTotalCount(Long xTotalCount) {
                this.xTotalCount = xTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    public static class Lifecycle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Lifecycle(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Lifecycle create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Lifecycle build() {
                return new Lifecycle(this);
            } 

        } 

    }
    public static class Index extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("lifecycle")
        private Lifecycle lifecycle;

        private Index(Builder builder) {
            this.codec = builder.codec;
            this.lifecycle = builder.lifecycle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Index create() {
            return builder().build();
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return lifecycle
         */
        public Lifecycle getLifecycle() {
            return this.lifecycle;
        }

        public static final class Builder {
            private String codec; 
            private Lifecycle lifecycle; 

            /**
             * codec.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * lifecycle.
             */
            public Builder lifecycle(Lifecycle lifecycle) {
                this.lifecycle = lifecycle;
                return this;
            }

            public Index build() {
                return new Index(this);
            } 

        } 

    }
    public static class Settings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("index")
        private Index index;

        private Settings(Builder builder) {
            this.index = builder.index;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Settings create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Index getIndex() {
            return this.index;
        }

        public static final class Builder {
            private Index index; 

            /**
             * index.
             */
            public Builder index(Index index) {
                this.index = index;
                return this;
            }

            public Settings build() {
                return new Settings(this);
            } 

        } 

    }
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("settings")
        private Settings settings;

        private Template(Builder builder) {
            this.settings = builder.settings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return settings
         */
        public Settings getSettings() {
            return this.settings;
        }

        public static final class Builder {
            private Settings settings; 

            /**
             * settings.
             */
            public Builder settings(Settings settings) {
                this.settings = settings;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("_meta")
        private java.util.Map < String, ? > meta;

        @com.aliyun.core.annotation.NameInMap("template")
        private Template template;

        @com.aliyun.core.annotation.NameInMap("version")
        private Long version;

        private Content(Builder builder) {
            this.meta = builder.meta;
            this.template = builder.template;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
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

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.Map < String, ? > meta; 
            private Template template; 
            private Long version; 

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

            /**
             * version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("composed")
        private java.util.List < String > composed;

        @com.aliyun.core.annotation.NameInMap("content")
        private Content content;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Result(Builder builder) {
            this.composed = builder.composed;
            this.content = builder.content;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return composed
         */
        public java.util.List < String > getComposed() {
            return this.composed;
        }

        /**
         * @return content
         */
        public Content getContent() {
            return this.content;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < String > composed; 
            private Content content; 
            private String name; 

            /**
             * composed.
             */
            public Builder composed(java.util.List < String > composed) {
                this.composed = composed;
                return this;
            }

            /**
             * content.
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
