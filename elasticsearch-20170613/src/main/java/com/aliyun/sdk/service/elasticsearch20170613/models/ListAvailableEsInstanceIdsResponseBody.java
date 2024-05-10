// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableEsInstanceIdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvailableEsInstanceIdsResponseBody</p>
 */
public class ListAvailableEsInstanceIdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListAvailableEsInstanceIdsResponseBody build() {
            return new ListAvailableEsInstanceIdsResponseBody(this);
        } 

    } 

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

            /**
             * The name of the Elasticsearch cluster.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The address that is used to access the Elasticsearch cluster over the Internet.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The ID of the Elasticsearch cluster.
             */
            public Builder esInstanceId(String esInstanceId) {
                this.esInstanceId = esInstanceId;
                return this;
            }

            /**
             * The address that is used to access the Kibana console of the Elasticsearch cluster over the Internet.
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
