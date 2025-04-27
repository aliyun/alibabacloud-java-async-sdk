// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListKibanaPluginsResponseBody} extends {@link TeaModel}
 *
 * <p>ListKibanaPluginsResponseBody</p>
 */
public class ListKibanaPluginsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private Headers headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private ListKibanaPluginsResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKibanaPluginsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListKibanaPluginsResponseBody model) {
            this.headers = model.headers;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request header.</p>
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11234B4A-34CE-473B-8E61-AD95702E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the plug-ins.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListKibanaPluginsResponseBody build() {
            return new ListKibanaPluginsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKibanaPluginsResponseBody} extends {@link TeaModel}
     *
     * <p>ListKibanaPluginsResponseBody</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X-Total-Count")
        private Integer xTotalCount;

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
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

        public static final class Builder {
            private Integer xTotalCount; 

            private Builder() {
            } 

            private Builder(Headers model) {
                this.xTotalCount = model.xTotalCount;
            } 

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder xTotalCount(Integer xTotalCount) {
                this.xTotalCount = xTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKibanaPluginsResponseBody} extends {@link TeaModel}
     *
     * <p>ListKibanaPluginsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("specificationUrl")
        private String specificationUrl;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        private Result(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.source = builder.source;
            this.specificationUrl = builder.specificationUrl;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return specificationUrl
         */
        public String getSpecificationUrl() {
            return this.specificationUrl;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String source; 
            private String specificationUrl; 
            private String state; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.description = model.description;
                this.name = model.name;
                this.source = model.source;
                this.specificationUrl = model.specificationUrl;
                this.state = model.state;
            } 

            /**
             * <p>The description of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>Customize DSL statements to query data.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>bsearch_querybuilder</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The source of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The URL of the introduction to the plug-in. The value null is supported.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxx">https://xxxx</a></p>
             */
            public Builder specificationUrl(String specificationUrl) {
                this.specificationUrl = specificationUrl;
                return this;
            }

            /**
             * <p>The installation status of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>INSTALLED</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
