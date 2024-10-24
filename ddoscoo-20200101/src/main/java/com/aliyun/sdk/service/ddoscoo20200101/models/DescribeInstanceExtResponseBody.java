// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstanceExtResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceExtResponseBody</p>
 */
public class DescribeInstanceExtResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceExtSpecs")
    private java.util.List < InstanceExtSpecs> instanceExtSpecs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeInstanceExtResponseBody(Builder builder) {
        this.instanceExtSpecs = builder.instanceExtSpecs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceExtResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceExtSpecs
     */
    public java.util.List < InstanceExtSpecs> getInstanceExtSpecs() {
        return this.instanceExtSpecs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < InstanceExtSpecs> instanceExtSpecs; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The extended information about the Anti-DDoS Proxy instance.</p>
         */
        public Builder instanceExtSpecs(java.util.List < InstanceExtSpecs> instanceExtSpecs) {
            this.instanceExtSpecs = instanceExtSpecs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of queried instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceExtResponseBody build() {
            return new DescribeInstanceExtResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceExtResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceExtResponseBody</p>
     */
    public static class InstanceExtSpecs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FunctionVersion")
        private Long functionVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NormalBandwidth")
        private Long normalBandwidth;

        @com.aliyun.core.annotation.NameInMap("ProductPlan")
        private Long productPlan;

        @com.aliyun.core.annotation.NameInMap("ServicePartner")
        private String servicePartner;

        private InstanceExtSpecs(Builder builder) {
            this.functionVersion = builder.functionVersion;
            this.instanceId = builder.instanceId;
            this.normalBandwidth = builder.normalBandwidth;
            this.productPlan = builder.productPlan;
            this.servicePartner = builder.servicePartner;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceExtSpecs create() {
            return builder().build();
        }

        /**
         * @return functionVersion
         */
        public Long getFunctionVersion() {
            return this.functionVersion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return normalBandwidth
         */
        public Long getNormalBandwidth() {
            return this.normalBandwidth;
        }

        /**
         * @return productPlan
         */
        public Long getProductPlan() {
            return this.productPlan;
        }

        /**
         * @return servicePartner
         */
        public String getServicePartner() {
            return this.servicePartner;
        }

        public static final class Builder {
            private Long functionVersion; 
            private String instanceId; 
            private Long normalBandwidth; 
            private Long productPlan; 
            private String servicePartner; 

            /**
             * <p>The function plan. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Standard</li>
             * <li><strong>1</strong>: Enhanced</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder functionVersion(Long functionVersion) {
                this.functionVersion = functionVersion;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddoscoo-cn-i7m25564****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The clean bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder normalBandwidth(Long normalBandwidth) {
                this.normalBandwidth = normalBandwidth;
                return this;
            }

            /**
             * <p>The type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Insurance mitigation plan</li>
             * <li><strong>1</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Unlimited mitigation plan</li>
             * <li><strong>2</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Chinese Mainland Acceleration (CMA) mitigation plan</li>
             * <li><strong>3</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Secure Chinese Mainland Acceleration (Sec-CMA) mitigation plan</li>
             * <li><strong>9</strong>: Anti-DDoS Proxy (Chinese Mainland) instance of the Profession mitigation plan</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder productPlan(Long productPlan) {
                this.productPlan = productPlan;
                return this;
            }

            /**
             * <p>The Internet service provider (ISP) line of the Anti-DDoS Proxy (Chinese Mainland) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>coop-line-001</p>
             */
            public Builder servicePartner(String servicePartner) {
                this.servicePartner = servicePartner;
                return this;
            }

            public InstanceExtSpecs build() {
                return new InstanceExtSpecs(this);
            } 

        } 

    }
}
