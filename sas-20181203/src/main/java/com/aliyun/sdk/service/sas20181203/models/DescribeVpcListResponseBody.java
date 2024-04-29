// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcListResponseBody</p>
 */
public class DescribeVpcListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VpcList")
    private java.util.List < VpcList> vpcList;

    private DescribeVpcListResponseBody(Builder builder) {
        this.count = builder.count;
        this.requestId = builder.requestId;
        this.vpcList = builder.vpcList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcListResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpcList
     */
    public java.util.List < VpcList> getVpcList() {
        return this.vpcList;
    }

    public static final class Builder {
        private Integer count; 
        private String requestId; 
        private java.util.List < VpcList> vpcList; 

        /**
         * The total number of entries returned.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of VPCs.
         */
        public Builder vpcList(java.util.List < VpcList> vpcList) {
            this.vpcList = vpcList;
            return this;
        }

        public DescribeVpcListResponseBody build() {
            return new DescribeVpcListResponseBody(this);
        } 

    } 

    public static class VpcList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsCount")
        private Integer ecsCount;

        @com.aliyun.core.annotation.NameInMap("InstanceDesc")
        private String instanceDesc;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private VpcList(Builder builder) {
            this.ecsCount = builder.ecsCount;
            this.instanceDesc = builder.instanceDesc;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcList create() {
            return builder().build();
        }

        /**
         * @return ecsCount
         */
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        /**
         * @return instanceDesc
         */
        public String getInstanceDesc() {
            return this.instanceDesc;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private Integer ecsCount; 
            private String instanceDesc; 
            private String instanceId; 
            private String instanceName; 
            private String regionId; 

            /**
             * The number of Elastic Compute Service (ECS) instances.
             */
            public Builder ecsCount(Integer ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * The information about the virtual private cloud (VPC).
             */
            public Builder instanceDesc(String instanceDesc) {
                this.instanceDesc = instanceDesc;
                return this;
            }

            /**
             * The ID of the ECS instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the VPC.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The region in which the server resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public VpcList build() {
                return new VpcList(this);
            } 

        } 

    }
}
