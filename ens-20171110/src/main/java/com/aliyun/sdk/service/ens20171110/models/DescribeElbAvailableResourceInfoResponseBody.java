// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElbAvailableResourceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElbAvailableResourceInfoResponseBody</p>
 */
public class DescribeElbAvailableResourceInfoResponseBody extends TeaModel {
    @NameInMap("ElbAvailableResourceInfo")
    private java.util.List < ElbAvailableResourceInfo> elbAvailableResourceInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeElbAvailableResourceInfoResponseBody(Builder builder) {
        this.elbAvailableResourceInfo = builder.elbAvailableResourceInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElbAvailableResourceInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return elbAvailableResourceInfo
     */
    public java.util.List < ElbAvailableResourceInfo> getElbAvailableResourceInfo() {
        return this.elbAvailableResourceInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ElbAvailableResourceInfo> elbAvailableResourceInfo; 
        private String requestId; 

        /**
         * ElbAvailableResourceInfo.
         */
        public Builder elbAvailableResourceInfo(java.util.List < ElbAvailableResourceInfo> elbAvailableResourceInfo) {
            this.elbAvailableResourceInfo = elbAvailableResourceInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeElbAvailableResourceInfoResponseBody build() {
            return new DescribeElbAvailableResourceInfoResponseBody(this);
        } 

    } 

    public static class ElbAvailableResourceInfo extends TeaModel {
        @NameInMap("Area")
        private String area;

        @NameInMap("CanBuyCount")
        private String canBuyCount;

        @NameInMap("EnName")
        private String enName;

        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("LoadBalancerSpec")
        private java.util.List < String > loadBalancerSpec;

        @NameInMap("Name")
        private String name;

        @NameInMap("Province")
        private String province;

        private ElbAvailableResourceInfo(Builder builder) {
            this.area = builder.area;
            this.canBuyCount = builder.canBuyCount;
            this.enName = builder.enName;
            this.ensRegionId = builder.ensRegionId;
            this.loadBalancerSpec = builder.loadBalancerSpec;
            this.name = builder.name;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElbAvailableResourceInfo create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return canBuyCount
         */
        public String getCanBuyCount() {
            return this.canBuyCount;
        }

        /**
         * @return enName
         */
        public String getEnName() {
            return this.enName;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return loadBalancerSpec
         */
        public java.util.List < String > getLoadBalancerSpec() {
            return this.loadBalancerSpec;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        public static final class Builder {
            private String area; 
            private String canBuyCount; 
            private String enName; 
            private String ensRegionId; 
            private java.util.List < String > loadBalancerSpec; 
            private String name; 
            private String province; 

            /**
             * Area.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * CanBuyCount.
             */
            public Builder canBuyCount(String canBuyCount) {
                this.canBuyCount = canBuyCount;
                return this;
            }

            /**
             * EnName.
             */
            public Builder enName(String enName) {
                this.enName = enName;
                return this;
            }

            /**
             * EnsRegionId.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * LoadBalancerSpec.
             */
            public Builder loadBalancerSpec(java.util.List < String > loadBalancerSpec) {
                this.loadBalancerSpec = loadBalancerSpec;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            public ElbAvailableResourceInfo build() {
                return new ElbAvailableResourceInfo(this);
            } 

        } 

    }
}
