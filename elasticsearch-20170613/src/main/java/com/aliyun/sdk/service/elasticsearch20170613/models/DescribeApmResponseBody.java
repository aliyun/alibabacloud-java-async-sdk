// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApmResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApmResponseBody</p>
 */
public class DescribeApmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DescribeApmResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApmResponseBody create() {
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
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>97597D87-8066-5493-B692-5C50DA236D68</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Request result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeApmResponseBody build() {
            return new DescribeApmResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApmResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApmResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apmServerDomain")
        private String apmServerDomain;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("deployedReplica")
        private Long deployedReplica;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

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
        private Integer replica;

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
            this.apmServerDomain = builder.apmServerDomain;
            this.createdAt = builder.createdAt;
            this.deployedReplica = builder.deployedReplica;
            this.description = builder.description;
            this.endTime = builder.endTime;
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
         * @return apmServerDomain
         */
        public String getApmServerDomain() {
            return this.apmServerDomain;
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
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
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
        public Integer getReplica() {
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
            private String apmServerDomain; 
            private String createdAt; 
            private Long deployedReplica; 
            private String description; 
            private Long endTime; 
            private String instanceId; 
            private Long nodeAmount; 
            private String outputES; 
            private String outputESUserName; 
            private String ownerId; 
            private String paymentType; 
            private String region; 
            private Integer replica; 
            private String resourceSpec; 
            private String status; 
            private String version; 
            private String vpcId; 
            private String vsArea; 
            private String vswitchId; 

            /**
             * <p>Instance domain.</p>
             * 
             * <strong>example:</strong>
             * <p>apm-cn-i7m2fuae****.apm.elasticsearch.aliyuncs.com:8200</p>
             */
            public Builder apmServerDomain(String apmServerDomain) {
                this.apmServerDomain = apmServerDomain;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-16T07:15:51.967Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>Deployed replica count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder deployedReplica(Long deployedReplica) {
                this.deployedReplica = deployedReplica;
                return this;
            }

            /**
             * <p>Instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>APMtest</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Instance expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>4792752000000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>apm-cn-i7m2fuae****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeAmount(Long nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * <p>Associated Elasticsearch instance.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-i7m2fsfhc001x****</p>
             */
            public Builder outputES(String outputES) {
                this.outputES = outputES;
                return this;
            }

            /**
             * <p>Username of the associated Elasticsearch instance.</p>
             * 
             * <strong>example:</strong>
             * <p>elastic</p>
             */
            public Builder outputESUserName(String outputESUserName) {
                this.outputESUserName = outputESUserName;
                return this;
            }

            /**
             * <p>User account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>133071096032****</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>Payment method, with the following values:</p>
             * <ul>
             * <li><p>postpaid: Pay-as-you-go.</p>
             * </li>
             * <li><p>prepaid: Subscription.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>postpaid</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>Region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Replica count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * <p>Specification, with the following values:</p>
             * <ul>
             * <li><p>C1M2 (1 core, 2 GB)</p>
             * </li>
             * <li><p>C2M4 (2 cores, 4 GB)</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>C1M2</p>
             */
            public Builder resourceSpec(String resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            /**
             * <p>Lifecycle status, with the following values:</p>
             * <ul>
             * <li><p>CREATING: Creating.</p>
             * </li>
             * <li><p>ACTIVATING: Activating.</p>
             * </li>
             * <li><p>ACTIVE: Active.</p>
             * </li>
             * <li><p>INACTIVE: Frozen.</p>
             * </li>
             * <li><p>INVALID: Invalid.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Version information.</p>
             * 
             * <strong>example:</strong>
             * <p>7.10.2</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1530vdhqkamm9s0****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>Availability zone where the switch is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder vsArea(String vsArea) {
                this.vsArea = vsArea;
                return this;
            }

            /**
             * <p>Switch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1j1mql6r9g5vfb4****</p>
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
