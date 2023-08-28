// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourcesResponseBody</p>
 */
public class ListDataSourcesResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * ## Method
         * <p>
         * 
         * `GET`
         * 
         * ## URI
         * 
         * `/openapi/ha3/instances/{instanceId}/data-sources`
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned results.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListDataSourcesResponseBody build() {
            return new ListDataSourcesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("domain")
        private String domain;

        @NameInMap("indexes")
        private java.util.List < String > indexes;

        @NameInMap("lastFulTime")
        private Long lastFulTime;

        @NameInMap("name")
        private String name;

        @NameInMap("status")
        private String status;

        @NameInMap("type")
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
        public java.util.List < String > getIndexes() {
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
            private java.util.List < String > indexes; 
            private Long lastFulTime; 
            private String name; 
            private String status; 
            private String type; 

            /**
             * The data sources deployed in offline mode.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The indexes.
             */
            public Builder indexes(java.util.List < String > indexes) {
                this.indexes = indexes;
                return this;
            }

            /**
             * The time when the full data of the data source was last queried.
             */
            public Builder lastFulTime(Long lastFulTime) {
                this.lastFulTime = lastFulTime;
                return this;
            }

            /**
             * The name of the data source.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of the data source.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the data source.
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
