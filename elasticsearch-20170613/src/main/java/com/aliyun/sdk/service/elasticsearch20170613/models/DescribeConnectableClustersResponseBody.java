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
 * {@link DescribeConnectableClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConnectableClustersResponseBody</p>
 */
public class DescribeConnectableClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

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

        private Builder(DescribeConnectableClustersResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public DescribeConnectableClustersResponseBody build() {
            return new DescribeConnectableClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeConnectableClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConnectableClustersResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instances")
        private String instances;

        @com.aliyun.core.annotation.NameInMap("networkType")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.instances = model.instances;
                this.networkType = model.networkType;
            } 

            /**
             * instances.
             */
            public Builder instances(String instances) {
                this.instances = instances;
                return this;
            }

            /**
             * networkType.
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
