// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAckClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListAckClustersResponseBody</p>
 */
public class ListAckClustersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListAckClustersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAckClustersResponseBody create() {
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
         * The request ID.
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

        public ListAckClustersResponseBody build() {
            return new ListAckClustersResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("clusterId")
        private String clusterId;

        @NameInMap("clusterType")
        private String clusterType;

        @NameInMap("name")
        private String name;

        @NameInMap("vpcId")
        private String vpcId;

        private Result(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterType = builder.clusterType;
            this.name = builder.name;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterType; 
            private String name; 
            private String vpcId; 

            /**
             * The ID of cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The type of the cluster. The value is fixed as ManagedKubernetes.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the VPC to which the cluster belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
