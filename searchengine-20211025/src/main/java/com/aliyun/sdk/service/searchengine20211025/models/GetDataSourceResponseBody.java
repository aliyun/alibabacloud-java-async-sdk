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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FE03180A-0E29-5474-8A86-33F0683294A4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the data source.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetDataSourceResponseBody build() {
            return new GetDataSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataSourceResponseBody</p>
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
             * <p>The data center where the data source is deployed in offline mode</p>
             * 
             * <strong>example:</strong>
             * <p>vpc_hz_domain_1</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The list of index information</p>
             */
            public Builder indexes(java.util.List<String> indexes) {
                this.indexes = indexes;
                return this;
            }

            /**
             * <p>The time when the full data of the data source was last queried.</p>
             * 
             * <strong>example:</strong>
             * <p>1718787219</p>
             */
            public Builder lastFulTime(Long lastFulTime) {
                this.lastFulTime = lastFulTime;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>my_index</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the data source. Valid values: new: The data source is being created. publish: The data source is in the normal state. trash: The data source is being deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>NEW</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the data source</p>
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
