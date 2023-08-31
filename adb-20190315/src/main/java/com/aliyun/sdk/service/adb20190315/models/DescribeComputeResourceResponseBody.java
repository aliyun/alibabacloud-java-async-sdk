// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComputeResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComputeResourceResponseBody</p>
 */
public class DescribeComputeResourceResponseBody extends TeaModel {
    @NameInMap("ComputeResource")
    private java.util.List < ComputeResource> computeResource;

    @NameInMap("RequestId")
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
         * Details of computing resource specifications.
         */
        public Builder computeResource(java.util.List < ComputeResource> computeResource) {
            this.computeResource = computeResource;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeComputeResourceResponseBody build() {
            return new DescribeComputeResourceResponseBody(this);
        } 

    } 

    public static class ComputeResource extends TeaModel {
        @NameInMap("DisplayValue")
        private String displayValue;

        @NameInMap("RealValue")
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
             * The specifications of computing resources displayed in the console.
             */
            public Builder displayValue(String displayValue) {
                this.displayValue = displayValue;
                return this;
            }

            /**
             * The actual specifications of computing resources.
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
