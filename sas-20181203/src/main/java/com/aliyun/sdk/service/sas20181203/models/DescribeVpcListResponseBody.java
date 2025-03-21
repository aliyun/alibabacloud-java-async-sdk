// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    private java.util.List<VpcList> vpcList;

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
    public java.util.List<VpcList> getVpcList() {
        return this.vpcList;
    }

    public static final class Builder {
        private Integer count; 
        private String requestId; 
        private java.util.List<VpcList> vpcList; 

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of VPCs.</p>
         */
        public Builder vpcList(java.util.List<VpcList> vpcList) {
            this.vpcList = vpcList;
            return this;
        }

        public DescribeVpcListResponseBody build() {
            return new DescribeVpcListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcListResponseBody</p>
     */
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
             * <p>The number of Elastic Compute Service (ECS) instances.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder ecsCount(Integer ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * <p>The information about the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>TestVpcNote</p>
             */
            public Builder instanceDesc(String instanceDesc) {
                this.instanceDesc = instanceDesc;
                return this;
            }

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ins_1321_asedb_ada</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The region in which the server resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
