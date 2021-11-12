// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
         * <p>Count.</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>VpcList.</p>
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

        @NameInMap("MiddleStatus")
        private Integer middleStatus;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private Integer status;


        private VpcList(Builder builder) {
            this.ecsCount = builder.ecsCount;
            this.instanceDesc = builder.instanceDesc;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.middleStatus = builder.middleStatus;
            this.regionId = builder.regionId;
            this.status = builder.status;
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
         * @return middleStatus
         */
        public Integer getMiddleStatus() {
            return this.middleStatus;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer ecsCount; 
            private String instanceDesc; 
            private String instanceId; 
            private String instanceName; 
            private Integer middleStatus; 
            private String regionId; 
            private Integer status; 

            /**
             * <p>EcsCount.</p>
             */
            public Builder ecsCount(Integer ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * <p>InstanceDesc.</p>
             */
            public Builder instanceDesc(String instanceDesc) {
                this.instanceDesc = instanceDesc;
                return this;
            }

            /**
             * <p>InstanceId.</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>InstanceName.</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>MiddleStatus.</p>
             */
            public Builder middleStatus(Integer middleStatus) {
                this.middleStatus = middleStatus;
                return this;
            }

            /**
             * <p>RegionId.</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public VpcList build() {
                return new VpcList(this);
            } 

        } 

    }
}
