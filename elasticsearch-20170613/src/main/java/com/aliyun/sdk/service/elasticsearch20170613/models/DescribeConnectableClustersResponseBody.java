// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConnectableClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConnectableClustersResponseBody</p>
 */
public class DescribeConnectableClustersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private DescribeConnectableClustersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConnectableClustersResponseBody create() {
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
         * The returned data.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public DescribeConnectableClustersResponseBody build() {
            return new DescribeConnectableClustersResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("instances")
        private String instances;

        @NameInMap("networkType")
        private String networkType;

        private Result(Builder builder) {
            this.instances = builder.instances;
            this.networkType = builder.networkType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
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
             * The ID of the instance that can communicate with each other.
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
