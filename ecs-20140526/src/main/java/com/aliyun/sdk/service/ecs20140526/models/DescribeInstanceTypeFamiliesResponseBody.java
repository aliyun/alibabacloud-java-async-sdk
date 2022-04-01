// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTypeFamiliesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTypeFamiliesResponseBody</p>
 */
public class DescribeInstanceTypeFamiliesResponseBody extends TeaModel {
    @NameInMap("InstanceTypeFamilies")
    private InstanceTypeFamilies instanceTypeFamilies;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceTypeFamiliesResponseBody(Builder builder) {
        this.instanceTypeFamilies = builder.instanceTypeFamilies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTypeFamiliesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceTypeFamilies
     */
    public InstanceTypeFamilies getInstanceTypeFamilies() {
        return this.instanceTypeFamilies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceTypeFamilies instanceTypeFamilies; 
        private String requestId; 

        /**
         * InstanceTypeFamilies.
         */
        public Builder instanceTypeFamilies(InstanceTypeFamilies instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceTypeFamiliesResponseBody build() {
            return new DescribeInstanceTypeFamiliesResponseBody(this);
        } 

    } 

    public static class InstanceTypeFamily extends TeaModel {
        @NameInMap("Generation")
        private String generation;

        @NameInMap("InstanceTypeFamilyId")
        private String instanceTypeFamilyId;

        private InstanceTypeFamily(Builder builder) {
            this.generation = builder.generation;
            this.instanceTypeFamilyId = builder.instanceTypeFamilyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeFamily create() {
            return builder().build();
        }

        /**
         * @return generation
         */
        public String getGeneration() {
            return this.generation;
        }

        /**
         * @return instanceTypeFamilyId
         */
        public String getInstanceTypeFamilyId() {
            return this.instanceTypeFamilyId;
        }

        public static final class Builder {
            private String generation; 
            private String instanceTypeFamilyId; 

            /**
             * Generation.
             */
            public Builder generation(String generation) {
                this.generation = generation;
                return this;
            }

            /**
             * InstanceTypeFamilyId.
             */
            public Builder instanceTypeFamilyId(String instanceTypeFamilyId) {
                this.instanceTypeFamilyId = instanceTypeFamilyId;
                return this;
            }

            public InstanceTypeFamily build() {
                return new InstanceTypeFamily(this);
            } 

        } 

    }
    public static class InstanceTypeFamilies extends TeaModel {
        @NameInMap("InstanceTypeFamily")
        private java.util.List < InstanceTypeFamily> instanceTypeFamily;

        private InstanceTypeFamilies(Builder builder) {
            this.instanceTypeFamily = builder.instanceTypeFamily;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeFamilies create() {
            return builder().build();
        }

        /**
         * @return instanceTypeFamily
         */
        public java.util.List < InstanceTypeFamily> getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public static final class Builder {
            private java.util.List < InstanceTypeFamily> instanceTypeFamily; 

            /**
             * InstanceTypeFamily.
             */
            public Builder instanceTypeFamily(java.util.List < InstanceTypeFamily> instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            public InstanceTypeFamilies build() {
                return new InstanceTypeFamilies(this);
            } 

        } 

    }
}
