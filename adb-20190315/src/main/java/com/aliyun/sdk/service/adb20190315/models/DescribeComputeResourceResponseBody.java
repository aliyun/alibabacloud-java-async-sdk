// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeComputeResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComputeResourceResponseBody</p>
 */
public class DescribeComputeResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComputeResource")
    private java.util.List < ComputeResource> computeResource;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeComputeResourceResponseBody(Builder builder) {
        this.computeResource = builder.computeResource;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComputeResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return computeResource
     */
    public java.util.List < ComputeResource> getComputeResource() {
        return this.computeResource;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ComputeResource> computeResource; 
        private String requestId; 

        /**
         * <p>The queried specifications of computing resources.</p>
         */
        public Builder computeResource(java.util.List < ComputeResource> computeResource) {
            this.computeResource = computeResource;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEAW</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeComputeResourceResponseBody build() {
            return new DescribeComputeResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeComputeResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeComputeResourceResponseBody</p>
     */
    public static class ComputeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayValue")
        private String displayValue;

        @com.aliyun.core.annotation.NameInMap("RealValue")
        private String realValue;

        private ComputeResource(Builder builder) {
            this.displayValue = builder.displayValue;
            this.realValue = builder.realValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComputeResource create() {
            return builder().build();
        }

        /**
         * @return displayValue
         */
        public String getDisplayValue() {
            return this.displayValue;
        }

        /**
         * @return realValue
         */
        public String getRealValue() {
            return this.realValue;
        }

        public static final class Builder {
            private String displayValue; 
            private String realValue; 

            /**
             * <p>The specifications of computing resources displayed in the console.</p>
             * 
             * <strong>example:</strong>
             * <p>8 Core 32 GB（单机版）</p>
             */
            public Builder displayValue(String displayValue) {
                this.displayValue = displayValue;
                return this;
            }

            /**
             * <p>The actual specifications of computing resources.</p>
             * 
             * <strong>example:</strong>
             * <p>8 Core 32 GB</p>
             */
            public Builder realValue(String realValue) {
                this.realValue = realValue;
                return this;
            }

            public ComputeResource build() {
                return new ComputeResource(this);
            } 

        } 

    }
}
