// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeElbAvailableResourceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElbAvailableResourceInfoResponseBody</p>
 */
public class DescribeElbAvailableResourceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElbAvailableResourceInfo")
    private java.util.List<ElbAvailableResourceInfo> elbAvailableResourceInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<ElbAvailableResourceInfo> getElbAvailableResourceInfo() {
        return this.elbAvailableResourceInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ElbAvailableResourceInfo> elbAvailableResourceInfo; 
        private String requestId; 

        /**
         * <p>The information about resources.</p>
         */
        public Builder elbAvailableResourceInfo(java.util.List<ElbAvailableResourceInfo> elbAvailableResourceInfo) {
            this.elbAvailableResourceInfo = elbAvailableResourceInfo;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>25AAD194-4A37-51CF-B1CA-1E86FDAC23A6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeElbAvailableResourceInfoResponseBody build() {
            return new DescribeElbAvailableResourceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeElbAvailableResourceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElbAvailableResourceInfoResponseBody</p>
     */
    public static class ElbAvailableResourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("CanBuyCount")
        private String canBuyCount;

        @com.aliyun.core.annotation.NameInMap("EnName")
        private String enName;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerSpec")
        private java.util.List<String> loadBalancerSpec;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Province")
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
        public java.util.List<String> getLoadBalancerSpec() {
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
            private java.util.List<String> loadBalancerSpec; 
            private String name; 
            private String province; 

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>SouthEast</p>
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * <p>The number of resources that you can purchase.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder canBuyCount(String canBuyCount) {
                this.canBuyCount = canBuyCount;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-guangdong-10</p>
             */
            public Builder enName(String enName) {
                this.enName = enName;
                return this;
            }

            /**
             * <p>The ID of the Edge Node Service (ENS) node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-guangdong-10</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The specifications of the ELB instances.</p>
             */
            public Builder loadBalancerSpec(java.util.List<String> loadBalancerSpec) {
                this.loadBalancerSpec = loadBalancerSpec;
                return this;
            }

            /**
             * <p>The Chinese name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The province where the node is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>Shanghai</p>
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
