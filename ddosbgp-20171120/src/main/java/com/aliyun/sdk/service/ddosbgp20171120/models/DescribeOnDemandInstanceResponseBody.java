// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOnDemandInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOnDemandInstanceResponseBody</p>
 */
public class DescribeOnDemandInstanceResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private String total;

    private DescribeOnDemandInstanceResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOnDemandInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private String requestId; 
        private String total; 

        /**
         * The details of the on-demand instance.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries that were returned.
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeOnDemandInstanceResponseBody build() {
            return new DescribeOnDemandInstanceResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("DefenseStatus")
        private String defenseStatus;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Ipnet")
        private java.util.List < String > ipnet;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Remark")
        private String remark;

        private Instances(Builder builder) {
            this.defenseStatus = builder.defenseStatus;
            this.instanceId = builder.instanceId;
            this.ipnet = builder.ipnet;
            this.regionId = builder.regionId;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return defenseStatus
         */
        public String getDefenseStatus() {
            return this.defenseStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ipnet
         */
        public java.util.List < String > getIpnet() {
            return this.ipnet;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String defenseStatus; 
            private String instanceId; 
            private java.util.List < String > ipnet; 
            private String regionId; 
            private String remark; 

            /**
             * The protection status of the on-demand instance. Valid values:
             * <p>
             * 
             * - **Defense**: The on-demand instance is protecting your assets, which indicates that traffic is routed to the on-demand instance.
             * - **UnDefense**: The on-demand instance does not protect your assets.
             */
            public Builder defenseStatus(String defenseStatus) {
                this.defenseStatus = defenseStatus;
                return this;
            }

            /**
             * The ID of the on-demand instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The CIDR block of the on-demand instance.
             */
            public Builder ipnet(java.util.List < String > ipnet) {
                this.ipnet = ipnet;
                return this;
            }

            /**
             * The region ID of the on-demand instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The description of the on-demand instance.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
