// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiUtilizationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiUtilizationResponseBody</p>
 */
public class DescribeRiUtilizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Utilizations")
    private Utilizations utilizations;

    private DescribeRiUtilizationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.utilizations = builder.utilizations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiUtilizationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return utilizations
     */
    public Utilizations getUtilizations() {
        return this.utilizations;
    }

    public static final class Builder {
        private String requestId; 
        private Utilizations utilizations; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Utilizations.
         */
        public Builder utilizations(Utilizations utilizations) {
            this.utilizations = utilizations;
            return this;
        }

        public DescribeRiUtilizationResponseBody build() {
            return new DescribeRiUtilizationResponseBody(this);
        } 

    } 

    public static class Utilization extends TeaModel {
        @NameInMap("ReservedInstanceId")
        private String reservedInstanceId;

        @NameInMap("Utilization")
        private String utilization;

        private Utilization(Builder builder) {
            this.reservedInstanceId = builder.reservedInstanceId;
            this.utilization = builder.utilization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Utilization create() {
            return builder().build();
        }

        /**
         * @return reservedInstanceId
         */
        public String getReservedInstanceId() {
            return this.reservedInstanceId;
        }

        /**
         * @return utilization
         */
        public String getUtilization() {
            return this.utilization;
        }

        public static final class Builder {
            private String reservedInstanceId; 
            private String utilization; 

            /**
             * ReservedInstanceId.
             */
            public Builder reservedInstanceId(String reservedInstanceId) {
                this.reservedInstanceId = reservedInstanceId;
                return this;
            }

            /**
             * Utilization.
             */
            public Builder utilization(String utilization) {
                this.utilization = utilization;
                return this;
            }

            public Utilization build() {
                return new Utilization(this);
            } 

        } 

    }
    public static class Utilizations extends TeaModel {
        @NameInMap("Utilization")
        private java.util.List < Utilization> utilization;

        private Utilizations(Builder builder) {
            this.utilization = builder.utilization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Utilizations create() {
            return builder().build();
        }

        /**
         * @return utilization
         */
        public java.util.List < Utilization> getUtilization() {
            return this.utilization;
        }

        public static final class Builder {
            private java.util.List < Utilization> utilization; 

            /**
             * Utilization.
             */
            public Builder utilization(java.util.List < Utilization> utilization) {
                this.utilization = utilization;
                return this;
            }

            public Utilizations build() {
                return new Utilizations(this);
            } 

        } 

    }
}
