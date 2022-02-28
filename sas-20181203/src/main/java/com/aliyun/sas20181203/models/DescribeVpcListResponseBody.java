// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcListResponseBody</p>
 */
public class DescribeVpcListResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpcList")
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
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
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
         * VpcList.
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
        @NameInMap("EcsCount")
        private Integer ecsCount;

        @NameInMap("InstanceDesc")
        private String instanceDesc;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("RegionId")
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
             * EcsCount.
             */
            public Builder ecsCount(Integer ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * InstanceDesc.
             */
            public Builder instanceDesc(String instanceDesc) {
                this.instanceDesc = instanceDesc;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * RegionId.
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
