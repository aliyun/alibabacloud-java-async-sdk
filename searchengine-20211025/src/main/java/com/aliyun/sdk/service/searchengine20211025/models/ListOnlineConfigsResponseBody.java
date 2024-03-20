// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOnlineConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOnlineConfigsResponseBody</p>
 */
public class ListOnlineConfigsResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    private ListOnlineConfigsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOnlineConfigsResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * id of request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * List
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListOnlineConfigsResponseBody build() {
            return new ListOnlineConfigsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("config")
        private String config;

        @NameInMap("indexName")
        private String indexName;

        private Result(Builder builder) {
            this.config = builder.config;
            this.indexName = builder.indexName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return indexName
         */
        public String getIndexName() {
            return this.indexName;
        }

        public static final class Builder {
            private String config; 
            private String indexName; 

            /**
             * The configuration information
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The name of the index
             */
            public Builder indexName(String indexName) {
                this.indexName = indexName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
