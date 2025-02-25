// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeReservedInstanceAutoRenewAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReservedInstanceAutoRenewAttributeResponseBody</p>
 */
public class DescribeReservedInstanceAutoRenewAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReservedInstanceRenewAttributes")
    private ReservedInstanceRenewAttributes reservedInstanceRenewAttributes;

    private DescribeReservedInstanceAutoRenewAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.reservedInstanceRenewAttributes = builder.reservedInstanceRenewAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReservedInstanceAutoRenewAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reservedInstanceRenewAttributes
     */
    public ReservedInstanceRenewAttributes getReservedInstanceRenewAttributes() {
        return this.reservedInstanceRenewAttributes;
    }

    public static final class Builder {
        private String requestId; 
        private ReservedInstanceRenewAttributes reservedInstanceRenewAttributes; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details about the auto-renewal settings of the reserved instances.</p>
         */
        public Builder reservedInstanceRenewAttributes(ReservedInstanceRenewAttributes reservedInstanceRenewAttributes) {
            this.reservedInstanceRenewAttributes = reservedInstanceRenewAttributes;
            return this;
        }

        public DescribeReservedInstanceAutoRenewAttributeResponseBody build() {
            return new DescribeReservedInstanceAutoRenewAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeReservedInstanceAutoRenewAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReservedInstanceAutoRenewAttributeResponseBody</p>
     */
    public static class ReservedInstanceRenewAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("RenewalStatus")
        private String renewalStatus;

        @com.aliyun.core.annotation.NameInMap("ReservedInstanceId")
        private String reservedInstanceId;

        private ReservedInstanceRenewAttribute(Builder builder) {
            this.duration = builder.duration;
            this.periodUnit = builder.periodUnit;
            this.renewalStatus = builder.renewalStatus;
            this.reservedInstanceId = builder.reservedInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReservedInstanceRenewAttribute create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return renewalStatus
         */
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

        /**
         * @return reservedInstanceId
         */
        public String getReservedInstanceId() {
            return this.reservedInstanceId;
        }

        public static final class Builder {
            private Integer duration; 
            private String periodUnit; 
            private String renewalStatus; 
            private String reservedInstanceId; 

            /**
             * <p>The auto-renewal duration.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The unit of the auto-renewal duration.</p>
             * <p>Valid values: Year and Month.</p>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The auto-renewal status of the reserved instance. Valid values:</p>
             * <ul>
             * <li>AutoRenewal: automatically renews the reserved instance.</li>
             * <li>Normal: manually renews the reserved instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AutoRenewal</p>
             */
            public Builder renewalStatus(String renewalStatus) {
                this.renewalStatus = renewalStatus;
                return this;
            }

            /**
             * <p>The ID of the reserved instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecsri-ajdfaj****</p>
             */
            public Builder reservedInstanceId(String reservedInstanceId) {
                this.reservedInstanceId = reservedInstanceId;
                return this;
            }

            public ReservedInstanceRenewAttribute build() {
                return new ReservedInstanceRenewAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReservedInstanceAutoRenewAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReservedInstanceAutoRenewAttributeResponseBody</p>
     */
    public static class ReservedInstanceRenewAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReservedInstanceRenewAttribute")
        private java.util.List<ReservedInstanceRenewAttribute> reservedInstanceRenewAttribute;

        private ReservedInstanceRenewAttributes(Builder builder) {
            this.reservedInstanceRenewAttribute = builder.reservedInstanceRenewAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReservedInstanceRenewAttributes create() {
            return builder().build();
        }

        /**
         * @return reservedInstanceRenewAttribute
         */
        public java.util.List<ReservedInstanceRenewAttribute> getReservedInstanceRenewAttribute() {
            return this.reservedInstanceRenewAttribute;
        }

        public static final class Builder {
            private java.util.List<ReservedInstanceRenewAttribute> reservedInstanceRenewAttribute; 

            /**
             * ReservedInstanceRenewAttribute.
             */
            public Builder reservedInstanceRenewAttribute(java.util.List<ReservedInstanceRenewAttribute> reservedInstanceRenewAttribute) {
                this.reservedInstanceRenewAttribute = reservedInstanceRenewAttribute;
                return this;
            }

            public ReservedInstanceRenewAttributes build() {
                return new ReservedInstanceRenewAttributes(this);
            } 

        } 

    }
}
