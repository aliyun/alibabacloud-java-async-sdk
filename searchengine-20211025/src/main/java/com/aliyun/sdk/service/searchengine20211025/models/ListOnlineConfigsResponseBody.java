// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link ListOnlineConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOnlineConfigsResponseBody</p>
 */
public class ListOnlineConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        /**
         * <p>id of request</p>
         * 
         * <strong>example:</strong>
         * <p>E45380E8-994A-5402-9806-F114B3295FCF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListOnlineConfigsResponseBody build() {
            return new ListOnlineConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOnlineConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOnlineConfigsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("indexName")
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
             * <p>The configuration information</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;specItems&quot;:[{&quot;specKey&quot;:&quot;YQ_KEYWORD_NUMBER_PLUS&quot;,&quot;value&quot;:&quot;1&quot;}]}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The name of the index</p>
             * 
             * <strong>example:</strong>
             * <p>generation</p>
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
