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
 * {@link ListDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourcesResponseBody</p>
 */
public class ListDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    private ListDataSourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourcesResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>93A9E542-8CF8-5BA6-99AB-94C0FE520429</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The results returned.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListDataSourcesResponseBody build() {
            return new ListDataSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourcesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("indexes")
        private java.util.List<String> indexes;

        @com.aliyun.core.annotation.NameInMap("lastFulTime")
        private Long lastFulTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Result(Builder builder) {
            this.domain = builder.domain;
            this.indexes = builder.indexes;
            this.lastFulTime = builder.lastFulTime;
            this.name = builder.name;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return indexes
         */
        public java.util.List<String> getIndexes() {
            return this.indexes;
        }

        /**
         * @return lastFulTime
         */
        public Long getLastFulTime() {
            return this.lastFulTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String domain; 
            private java.util.List<String> indexes; 
            private Long lastFulTime; 
            private String name; 
            private String status; 
            private String type; 

            /**
             * <p>The data center in which the data source is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The indexes.</p>
             */
            public Builder indexes(java.util.List<String> indexes) {
                this.indexes = indexes;
                return this;
            }

            /**
             * <p>The time when the full data of the data source was last queried.</p>
             * 
             * <strong>example:</strong>
             * <p>1718787785</p>
             */
            public Builder lastFulTime(Long lastFulTime) {
                this.lastFulTime = lastFulTime;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>data_source_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the data source. Valid values: new: The data source is being created. publish: The data source is in the normal state. trash: The data source is being deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>new</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>odps</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
