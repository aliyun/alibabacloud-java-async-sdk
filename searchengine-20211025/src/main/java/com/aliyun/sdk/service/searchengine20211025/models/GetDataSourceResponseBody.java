// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataSourceResponseBody</p>
 */
public class GetDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GetDataSourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of information about the data source
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetDataSourceResponseBody build() {
            return new GetDataSourceResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("indexes")
        private java.util.List < String > indexes;

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
             * The data center where the data source is deployed in offline mode
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The list of index information
             */
            public Builder indexes(java.util.List < String > indexes) {
                this.indexes = indexes;
                return this;
            }

            /**
             * The time when an index for full data was last built
             */
            public Builder lastFulTime(Long lastFulTime) {
                this.lastFulTime = lastFulTime;
                return this;
            }

            /**
             * The name of the data source
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The state of the data source
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the data source
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
