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
 * {@link DescribePipelineManagementConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePipelineManagementConfigResponseBody</p>
 */
public class DescribePipelineManagementConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DescribePipelineManagementConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePipelineManagementConfigResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(DescribePipelineManagementConfigResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribePipelineManagementConfigResponseBody build() {
            return new DescribePipelineManagementConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePipelineManagementConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePipelineManagementConfigResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpoints")
        private String endpoints;

        @com.aliyun.core.annotation.NameInMap("esInstanceId")
        private String esInstanceId;

        @com.aliyun.core.annotation.NameInMap("pipelineIds")
        private java.util.List<String> pipelineIds;

        @com.aliyun.core.annotation.NameInMap("pipelineManagementType")
        private String pipelineManagementType;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        private Result(Builder builder) {
            this.endpoints = builder.endpoints;
            this.esInstanceId = builder.esInstanceId;
            this.pipelineIds = builder.pipelineIds;
            this.pipelineManagementType = builder.pipelineManagementType;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return endpoints
         */
        public String getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return esInstanceId
         */
        public String getEsInstanceId() {
            return this.esInstanceId;
        }

        /**
         * @return pipelineIds
         */
        public java.util.List<String> getPipelineIds() {
            return this.pipelineIds;
        }

        /**
         * @return pipelineManagementType
         */
        public String getPipelineManagementType() {
            return this.pipelineManagementType;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String endpoints; 
            private String esInstanceId; 
            private java.util.List<String> pipelineIds; 
            private String pipelineManagementType; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.endpoints = model.endpoints;
                this.esInstanceId = model.esInstanceId;
                this.pipelineIds = model.pipelineIds;
                this.pipelineManagementType = model.pipelineManagementType;
                this.userName = model.userName;
            } 

            /**
             * <p>The access addresses of the Elasticsearch cluster. Specify each address in the <code>http://Endpoint of the Elasticsearch cluster:Port number</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;<a href="http://es-cn-n6w1o1x0w001c****.elasticsearch.aliyuncs.com:9200%22%5D">http://es-cn-n6w1o1x0w001c****.elasticsearch.aliyuncs.com:9200&quot;]</a></p>
             */
            public Builder endpoints(String endpoints) {
                this.endpoints = endpoints;
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
             * pipelineIds.
             */
            public Builder pipelineIds(java.util.List<String> pipelineIds) {
                this.pipelineIds = pipelineIds;
                return this;
            }

            /**
             * <p>The pipeline management method. Valid values: Kibana and MULTIPLE_PIPELINE.</p>
             * 
             * <strong>example:</strong>
             * <p>MULTIPLE_PIPELINE</p>
             */
            public Builder pipelineManagementType(String pipelineManagementType) {
                this.pipelineManagementType = pipelineManagementType;
                return this;
            }

            /**
             * <p>The username that is used to access the Elasticsearch cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>elastic</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
