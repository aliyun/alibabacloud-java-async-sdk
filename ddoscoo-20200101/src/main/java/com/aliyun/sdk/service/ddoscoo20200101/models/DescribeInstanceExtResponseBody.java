// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceExtResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceExtResponseBody</p>
 */
public class DescribeInstanceExtResponseBody extends TeaModel {
    @NameInMap("InstanceExtSpecs")
    private java.util.List < InstanceExtSpecs> instanceExtSpecs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The information about the instance.
         */
        public Builder instanceExtSpecs(java.util.List < InstanceExtSpecs> instanceExtSpecs) {
            this.instanceExtSpecs = instanceExtSpecs;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of queried instances.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceExtResponseBody build() {
            return new DescribeInstanceExtResponseBody(this);
        } 

    } 

    public static class InstanceExtSpecs extends TeaModel {
        @NameInMap("FunctionVersion")
        private Long functionVersion;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("NormalBandwidth")
        private Long normalBandwidth;

        @NameInMap("ProductPlan")
        private Long productPlan;

        @NameInMap("ServicePartner")
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
             * The function plan. Valid values:
             * <p>
             * 
             * *   **0**: Standard
             * *   **1**: Enhanced
             */
            public Builder functionVersion(Long functionVersion) {
                this.functionVersion = functionVersion;
                return this;
            }

            /**
             * The instance ID
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The clean bandwidth. Unit: Mbit/s.
             */
            public Builder normalBandwidth(Long normalBandwidth) {
                this.normalBandwidth = normalBandwidth;
                return this;
            }

            /**
             * The type of the instance. Valid value:
             * <p>
             * 
             * *   **0**: Anti-DDoS Premium instance of the Insurance mitigation plan
             * *   **1**: Anti-DDoS Premium instance of the Unlimited mitigation plan
             * *   **2**: Anti-DDoS Premium instance of the CMA mitigation plan
             * *   **3**: Anti-DDoS Premium instance of the Secure Chinese Mainland Acceleration (Sec-CMA) plan
             * *   **9**: Anti-DDoS Pro instance of the Profession mitigation plan
             */
            public Builder productPlan(Long productPlan) {
                this.productPlan = productPlan;
                return this;
            }

            /**
             * The Internet service provider (ISP) line resource of the Anti-DDoS Pro instance.
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
