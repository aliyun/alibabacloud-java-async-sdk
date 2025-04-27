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
 * {@link ListAckClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListAckClustersResponseBody</p>
 */
public class ListAckClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

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

        private Builder(ListAckClustersResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F93EAA49-284F-4FCE-9E67-FA23FB4BB512</p>
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

        public ListAckClustersResponseBody build() {
            return new ListAckClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAckClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListAckClustersResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("clusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("vpcId")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.clusterId = model.clusterId;
                this.clusterType = model.clusterType;
                this.name = model.name;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ID of cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c5ea2c2d9a3cf499481292f60425d****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The type of the cluster. The value is fixed as ManagedKubernetes.</p>
             * 
             * <strong>example:</strong>
             * <p>ManagedKubernetes</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the cluster belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp12nu14urf0upaf4****</p>
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
