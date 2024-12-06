// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListApmResponseBody} extends {@link TeaModel}
 *
 * <p>ListApmResponseBody</p>
 */
public class ListApmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private Headers headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private ListApmResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApmResponseBody create() {
        return builder().build();
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
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
        private Headers headers; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * Headers.
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
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
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListApmResponseBody build() {
            return new ListApmResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApmResponseBody} extends {@link TeaModel}
     *
     * <p>ListApmResponseBody</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X-Total-Count")
        private Long xTotalCount;

        private Headers(Builder builder) {
            this.xTotalCount = builder.xTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return xTotalCount
         */
        public Long getXTotalCount() {
            return this.xTotalCount;
        }

        public static final class Builder {
            private Long xTotalCount; 

            /**
             * X-Total-Count.
             */
            public Builder xTotalCount(Long xTotalCount) {
                this.xTotalCount = xTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApmResponseBody} extends {@link TeaModel}
     *
     * <p>ListApmResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("deployedReplica")
        private Long deployedReplica;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("nodeAmount")
        private Long nodeAmount;

        @com.aliyun.core.annotation.NameInMap("outputES")
        private String outputES;

        @com.aliyun.core.annotation.NameInMap("outputESUserName")
        private String outputESUserName;

        @com.aliyun.core.annotation.NameInMap("ownerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("paymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("replica")
        private Long replica;

        @com.aliyun.core.annotation.NameInMap("resourceSpec")
        private String resourceSpec;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("vsArea")
        private String vsArea;

        @com.aliyun.core.annotation.NameInMap("vswitchId")
        private String vswitchId;

        private Result(Builder builder) {
            this.createdAt = builder.createdAt;
            this.deployedReplica = builder.deployedReplica;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.nodeAmount = builder.nodeAmount;
            this.outputES = builder.outputES;
            this.outputESUserName = builder.outputESUserName;
            this.ownerId = builder.ownerId;
            this.paymentType = builder.paymentType;
            this.region = builder.region;
            this.replica = builder.replica;
            this.resourceSpec = builder.resourceSpec;
            this.status = builder.status;
            this.version = builder.version;
            this.vpcId = builder.vpcId;
            this.vsArea = builder.vsArea;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return deployedReplica
         */
        public Long getDeployedReplica() {
            return this.deployedReplica;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return nodeAmount
         */
        public Long getNodeAmount() {
            return this.nodeAmount;
        }

        /**
         * @return outputES
         */
        public String getOutputES() {
            return this.outputES;
        }

        /**
         * @return outputESUserName
         */
        public String getOutputESUserName() {
            return this.outputESUserName;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return replica
         */
        public Long getReplica() {
            return this.replica;
        }

        /**
         * @return resourceSpec
         */
        public String getResourceSpec() {
            return this.resourceSpec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vsArea
         */
        public String getVsArea() {
            return this.vsArea;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String createdAt; 
            private Long deployedReplica; 
            private String description; 
            private String instanceId; 
            private Long nodeAmount; 
            private String outputES; 
            private String outputESUserName; 
            private String ownerId; 
            private String paymentType; 
            private String region; 
            private Long replica; 
            private String resourceSpec; 
            private String status; 
            private String version; 
            private String vpcId; 
            private String vsArea; 
            private String vswitchId; 

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * deployedReplica.
             */
            public Builder deployedReplica(Long deployedReplica) {
                this.deployedReplica = deployedReplica;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * nodeAmount.
             */
            public Builder nodeAmount(Long nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * outputES.
             */
            public Builder outputES(String outputES) {
                this.outputES = outputES;
                return this;
            }

            /**
             * outputESUserName.
             */
            public Builder outputESUserName(String outputESUserName) {
                this.outputESUserName = outputESUserName;
                return this;
            }

            /**
             * ownerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * paymentType.
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * replica.
             */
            public Builder replica(Long replica) {
                this.replica = replica;
                return this;
            }

            /**
             * resourceSpec.
             */
            public Builder resourceSpec(String resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * vsArea.
             */
            public Builder vsArea(String vsArea) {
                this.vsArea = vsArea;
                return this;
            }

            /**
             * vswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
