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
 * {@link HttpRouteMatch} extends {@link TeaModel}
 *
 * <p>HttpRouteMatch</p>
 */
public class HttpRouteMatch extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.List<Headers> headers;

    @com.aliyun.core.annotation.NameInMap("ignoreUriCase")
    private Boolean ignoreUriCase;

    @com.aliyun.core.annotation.NameInMap("methods")
    private java.util.List<String> methods;

    @com.aliyun.core.annotation.NameInMap("path")
    private HttpRouteMatchPath path;

    @com.aliyun.core.annotation.NameInMap("queryParams")
    private java.util.List<QueryParams> queryParams;

    private HttpRouteMatch(Builder builder) {
        this.headers = builder.headers;
        this.ignoreUriCase = builder.ignoreUriCase;
        this.methods = builder.methods;
        this.path = builder.path;
        this.queryParams = builder.queryParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpRouteMatch create() {
        return builder().build();
    }

    /**
     * @return headers
     */
    public java.util.List<Headers> getHeaders() {
        return this.headers;
    }

    /**
     * @return ignoreUriCase
     */
    public Boolean getIgnoreUriCase() {
        return this.ignoreUriCase;
    }

    /**
     * @return methods
     */
    public java.util.List<String> getMethods() {
        return this.methods;
    }

    /**
     * @return path
     */
    public HttpRouteMatchPath getPath() {
        return this.path;
    }

    /**
     * @return queryParams
     */
    public java.util.List<QueryParams> getQueryParams() {
        return this.queryParams;
    }

    public static final class Builder {
        private java.util.List<Headers> headers; 
        private Boolean ignoreUriCase; 
        private java.util.List<String> methods; 
        private HttpRouteMatchPath path; 
        private java.util.List<QueryParams> queryParams; 

        /**
         * headers.
         */
        public Builder headers(java.util.List<Headers> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * ignoreUriCase.
         */
        public Builder ignoreUriCase(Boolean ignoreUriCase) {
            this.ignoreUriCase = ignoreUriCase;
            return this;
        }

        /**
         * methods.
         */
        public Builder methods(java.util.List<String> methods) {
            this.methods = methods;
            return this;
        }

        /**
         * path.
         */
        public Builder path(HttpRouteMatchPath path) {
            this.path = path;
            return this;
        }

        /**
         * queryParams.
         */
        public Builder queryParams(java.util.List<QueryParams> queryParams) {
            this.queryParams = queryParams;
            return this;
        }

        public HttpRouteMatch build() {
            return new HttpRouteMatch(this);
        } 

    } 

    /**
     * 
     * {@link HttpRouteMatch} extends {@link TeaModel}
     *
     * <p>HttpRouteMatch</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Headers(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String type; 
            private String value; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpRouteMatch} extends {@link TeaModel}
     *
     * <p>HttpRouteMatch</p>
     */
    public static class HttpRouteMatchPath extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private HttpRouteMatchPath(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpRouteMatchPath create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public HttpRouteMatchPath build() {
                return new HttpRouteMatchPath(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpRouteMatch} extends {@link TeaModel}
     *
     * <p>HttpRouteMatch</p>
     */
    public static class QueryParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private QueryParams(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryParams create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String type; 
            private String value; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QueryParams build() {
                return new QueryParams(this);
            } 

        } 

    }
}
