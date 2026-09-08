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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(HttpRouteMatch model) {
            this.headers = model.headers;
            this.ignoreUriCase = model.ignoreUriCase;
            this.methods = model.methods;
            this.path = model.path;
            this.queryParams = model.queryParams;
        } 

        /**
         * <p>The list of HTTP request header matching rules.</p>
         */
        public Builder headers(java.util.List<Headers> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>Specifies whether the path is case-insensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ignoreUriCase(Boolean ignoreUriCase) {
            this.ignoreUriCase = ignoreUriCase;
            return this;
        }

        /**
         * <p>The list of request methods.</p>
         */
        public Builder methods(java.util.List<String> methods) {
            this.methods = methods;
            return this;
        }

        /**
         * <p>The path rule.</p>
         */
        public Builder path(HttpRouteMatchPath path) {
            this.path = path;
            return this;
        }

        /**
         * <p>The list of query request parameter matching rules.</p>
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

            private Builder() {
            } 

            private Builder(Headers model) {
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The name of the header.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The header matching type. Valid values:</p>
             * <ul>
             * <li>Exact: exact match.</li>
             * <li>Prefix: prefix match. </li>
             * <li>Regex: regular expression match.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Exact</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the header.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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

            private Builder() {
            } 

            private Builder(HttpRouteMatchPath model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The path matching rule. Valid values:</p>
             * <ul>
             * <li>Exact: exact match.</li>
             * <li>Prefix: prefix match. </li>
             * <li>Regex: regular expression match.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prefix</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The path.</p>
             * 
             * <strong>example:</strong>
             * <p>/user</p>
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

            private Builder() {
            } 

            private Builder(QueryParams model) {
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The query parameter matching type. Valid values:</p>
             * <ul>
             * <li>Exact: exact match. </li>
             * <li>Prefix: prefix match. </li>
             * <li>Regex: regular expression match.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Exact</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
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
