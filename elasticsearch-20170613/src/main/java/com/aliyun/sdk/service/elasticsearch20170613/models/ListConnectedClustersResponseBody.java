// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectedClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListConnectedClustersResponseBody</p>
 */
public class ListConnectedClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private ListConnectedClustersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectedClustersResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The return results.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListConnectedClustersResponseBody build() {
            return new ListConnectedClustersResponseBody(this);
        } 

    } 

    public static class ResultResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instances")
        private String instances;

        @com.aliyun.core.annotation.NameInMap("networkType")
        private String networkType;

        private ResultResult(Builder builder) {
            this.instances = builder.instances;
            this.networkType = builder.networkType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultResult create() {
            return builder().build();
        }

        /**
         * @return instances
         */
        public String getInstances() {
            return this.instances;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        public static final class Builder {
            private String instances; 
            private String networkType; 

            /**
             * The ID of the remote instance that is connected to the network of the current instance.
             */
            public Builder instances(String instances) {
                this.instances = instances;
                return this;
            }

            /**
             * The network type of the instance.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            public ResultResult build() {
                return new ResultResult(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < ResultResult> result;

        private Result(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List < ResultResult> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List < ResultResult> result; 

            /**
             * The return results.
             */
            public Builder result(java.util.List < ResultResult> result) {
                this.result = result;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
