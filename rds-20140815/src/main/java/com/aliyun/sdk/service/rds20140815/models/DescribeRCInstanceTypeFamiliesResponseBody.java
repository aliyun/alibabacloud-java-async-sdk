// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCInstanceTypeFamiliesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCInstanceTypeFamiliesResponseBody</p>
 */
public class DescribeRCInstanceTypeFamiliesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilies")
    private InstanceTypeFamilies instanceTypeFamilies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRCInstanceTypeFamiliesResponseBody(Builder builder) {
        this.instanceTypeFamilies = builder.instanceTypeFamilies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCInstanceTypeFamiliesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRCInstanceTypeFamiliesResponseBody model) {
            this.instanceTypeFamilies = model.instanceTypeFamilies;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance families.</p>
         */
        public Builder instanceTypeFamilies(InstanceTypeFamilies instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F2911788-25E8-42E5-A3A3-1B38D263F01E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRCInstanceTypeFamiliesResponseBody build() {
            return new DescribeRCInstanceTypeFamiliesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCInstanceTypeFamiliesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceTypeFamiliesResponseBody</p>
     */
    public static class InstanceTypeFamily extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilyDesc")
        private String instanceTypeFamilyDesc;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilyId")
        private String instanceTypeFamilyId;

        private InstanceTypeFamily(Builder builder) {
            this.instanceTypeFamilyDesc = builder.instanceTypeFamilyDesc;
            this.instanceTypeFamilyId = builder.instanceTypeFamilyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeFamily create() {
            return builder().build();
        }

        /**
         * @return instanceTypeFamilyDesc
         */
        public String getInstanceTypeFamilyDesc() {
            return this.instanceTypeFamilyDesc;
        }

        /**
         * @return instanceTypeFamilyId
         */
        public String getInstanceTypeFamilyId() {
            return this.instanceTypeFamilyId;
        }

        public static final class Builder {
            private String instanceTypeFamilyDesc; 
            private String instanceTypeFamilyId; 

            private Builder() {
            } 

            private Builder(InstanceTypeFamily model) {
                this.instanceTypeFamilyDesc = model.instanceTypeFamilyDesc;
                this.instanceTypeFamilyId = model.instanceTypeFamilyId;
            } 

            /**
             * <p>The description of the instance family.</p>
             */
            public Builder instanceTypeFamilyDesc(String instanceTypeFamilyDesc) {
                this.instanceTypeFamilyDesc = instanceTypeFamilyDesc;
                return this;
            }

            /**
             * <p>The ID of the instance family.</p>
             * 
             * <strong>example:</strong>
             * <p>x.6cm</p>
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
     * {@link DescribeRCInstanceTypeFamiliesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceTypeFamiliesResponseBody</p>
     */
    public static class InstanceTypeFamilies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
        private java.util.List<InstanceTypeFamily> instanceTypeFamily;

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
        public java.util.List<InstanceTypeFamily> getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public static final class Builder {
            private java.util.List<InstanceTypeFamily> instanceTypeFamily; 

            private Builder() {
            } 

            private Builder(InstanceTypeFamilies model) {
                this.instanceTypeFamily = model.instanceTypeFamily;
            } 

            /**
             * <p>The instance family.</p>
             */
            public Builder instanceTypeFamily(java.util.List<InstanceTypeFamily> instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            public InstanceTypeFamilies build() {
                return new InstanceTypeFamilies(this);
            } 

        } 

    }
}
