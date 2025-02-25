// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPluginsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPluginsResponseBody</p>
 */
public class ListPluginsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private Headers headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private ListPluginsResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPluginsResponseBody create() {
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
         * <p>The description of the plug-in.</p>
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>The return results.</p>
         * 
         * <strong>example:</strong>
         * <p>5A5D8E74-565C-43DC-B031-29289FA9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the plug-in.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListPluginsResponseBody build() {
            return new ListPluginsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPluginsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginsResponseBody</p>
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

            /**
             * <p>The address of the plug-in description document.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
     * {@link ListPluginsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginsResponseBody</p>
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

            /**
             * <p>The source type of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>IK analysis plug-in for Elasticsearch.</p>
             */
            public Builder description(String description) {
                this.description = description;
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
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The name of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxx.html">https://xxxx.html</a></p>
             */
            public Builder specificationUrl(String specificationUrl) {
                this.specificationUrl = specificationUrl;
                return this;
            }

            /**
             * state.
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
