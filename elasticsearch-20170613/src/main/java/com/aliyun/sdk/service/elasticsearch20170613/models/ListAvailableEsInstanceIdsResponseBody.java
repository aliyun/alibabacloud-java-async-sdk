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
 * {@link ListAvailableEsInstanceIdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvailableEsInstanceIdsResponseBody</p>
 */
public class ListAvailableEsInstanceIdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private ListAvailableEsInstanceIdsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableEsInstanceIdsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListAvailableEsInstanceIdsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListAvailableEsInstanceIdsResponseBody build() {
            return new ListAvailableEsInstanceIdsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAvailableEsInstanceIdsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvailableEsInstanceIdsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("esInstanceId")
        private String esInstanceId;

        @com.aliyun.core.annotation.NameInMap("kibanaEndpoint")
        private String kibanaEndpoint;

        private Result(Builder builder) {
            this.description = builder.description;
            this.endpoint = builder.endpoint;
            this.esInstanceId = builder.esInstanceId;
            this.kibanaEndpoint = builder.kibanaEndpoint;
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
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return esInstanceId
         */
        public String getEsInstanceId() {
            return this.esInstanceId;
        }

        /**
         * @return kibanaEndpoint
         */
        public String getKibanaEndpoint() {
            return this.kibanaEndpoint;
        }

        public static final class Builder {
            private String description; 
            private String endpoint; 
            private String esInstanceId; 
            private String kibanaEndpoint; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.description = model.description;
                this.endpoint = model.endpoint;
                this.esInstanceId = model.esInstanceId;
                this.kibanaEndpoint = model.kibanaEndpoint;
            } 

            /**
             * <p>The name of the Elasticsearch cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>instanceName</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The address that is used to access the Elasticsearch cluster over the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://es-cn-n6w1o1x0w001c****.elasticsearch.aliyuncs.com:9200">http://es-cn-n6w1o1x0w001c****.elasticsearch.aliyuncs.com:9200</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The ID of the Elasticsearch cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-n6w1o1x0w001c****</p>
             */
            public Builder esInstanceId(String esInstanceId) {
                this.esInstanceId = esInstanceId;
                return this;
            }

            /**
             * <p>The address that is used to access the Kibana console of the Elasticsearch cluster over the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://es-cn-n6w1o1x0w001c****.kibana.elasticsearch.aliyuncs.com:5601">https://es-cn-n6w1o1x0w001c****.kibana.elasticsearch.aliyuncs.com:5601</a></p>
             */
            public Builder kibanaEndpoint(String kibanaEndpoint) {
                this.kibanaEndpoint = kibanaEndpoint;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
