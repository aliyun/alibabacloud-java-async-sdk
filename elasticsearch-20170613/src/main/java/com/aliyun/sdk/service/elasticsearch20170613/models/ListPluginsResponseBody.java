// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPluginsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPluginsResponseBody</p>
 */
public class ListPluginsResponseBody extends TeaModel {
    @NameInMap("Headers")
    private Headers headers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
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
         * The description of the plug-in.
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * The return results.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the plug-in.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListPluginsResponseBody build() {
            return new ListPluginsResponseBody(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @NameInMap("X-Total-Count")
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
             * The address of the plug-in description document.
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
    public static class Result extends TeaModel {
        @NameInMap("description")
        private String description;

        @NameInMap("name")
        private String name;

        @NameInMap("source")
        private String source;

        @NameInMap("specificationUrl")
        private String specificationUrl;

        @NameInMap("state")
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
             * The source type of the plug-in.
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
             * The name of the plug-in.
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
