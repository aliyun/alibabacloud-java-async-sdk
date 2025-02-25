// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeXpackMonitorConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeXpackMonitorConfigResponseBody</p>
 */
public class DescribeXpackMonitorConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DescribeXpackMonitorConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeXpackMonitorConfigResponseBody create() {
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
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeXpackMonitorConfigResponseBody build() {
            return new DescribeXpackMonitorConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeXpackMonitorConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeXpackMonitorConfigResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("endpoints")
        private java.util.List < String > endpoints;

        @com.aliyun.core.annotation.NameInMap("esInstanceId")
        private String esInstanceId;

        @com.aliyun.core.annotation.NameInMap("pipelineIds")
        private java.util.List < String > pipelineIds;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        private Result(Builder builder) {
            this.enable = builder.enable;
            this.endpoints = builder.endpoints;
            this.esInstanceId = builder.esInstanceId;
            this.pipelineIds = builder.pipelineIds;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return endpoints
         */
        public java.util.List < String > getEndpoints() {
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
        public java.util.List < String > getPipelineIds() {
            return this.pipelineIds;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Boolean enable; 
            private java.util.List < String > endpoints; 
            private String esInstanceId; 
            private java.util.List < String > pipelineIds; 
            private String userName; 

            /**
             * <p>Indicates whether the X-Pack Monitoring feature is enabled. Valid values:</p>
             * <ul>
             * <li>true: enabled</li>
             * <li>false: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * endpoints.
             */
            public Builder endpoints(java.util.List < String > endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * <p>The ID of the associated Elasticsearch cluster.</p>
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
            public Builder pipelineIds(java.util.List < String > pipelineIds) {
                this.pipelineIds = pipelineIds;
                return this;
            }

            /**
             * <p>The username that is used to access the associated Elasticsearch cluster.</p>
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
