// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstanceTypeFamiliesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTypeFamiliesResponseBody</p>
 */
public class DescribeInstanceTypeFamiliesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilies")
    private InstanceTypeFamilies instanceTypeFamilies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The instance families.</p>
         */
        public Builder instanceTypeFamilies(InstanceTypeFamilies instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceTypeFamiliesResponseBody build() {
            return new DescribeInstanceTypeFamiliesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceTypeFamiliesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypeFamiliesResponseBody</p>
     */
    public static class InstanceTypeFamily extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Generation")
        private String generation;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilyId")
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
             * <p>The generation of the instance family.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs-5</p>
             */
            public Builder generation(String generation) {
                this.generation = generation;
                return this;
            }

            /**
             * <p>The ID of the instance family.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g6</p>
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
    /**
     * 
     * {@link DescribeInstanceTypeFamiliesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypeFamiliesResponseBody</p>
     */
    public static class InstanceTypeFamilies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
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
