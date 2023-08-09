// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservedInstanceAutoRenewAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReservedInstanceAutoRenewAttributeResponseBody</p>
 */
public class DescribeReservedInstanceAutoRenewAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ReservedInstanceRenewAttributes")
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Details about the auto-renewal settings of the reserved instances.
         */
        public Builder reservedInstanceRenewAttributes(ReservedInstanceRenewAttributes reservedInstanceRenewAttributes) {
            this.reservedInstanceRenewAttributes = reservedInstanceRenewAttributes;
            return this;
        }

        public DescribeReservedInstanceAutoRenewAttributeResponseBody build() {
            return new DescribeReservedInstanceAutoRenewAttributeResponseBody(this);
        } 

    } 

    public static class ReservedInstanceRenewAttribute extends TeaModel {
        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("PeriodUnit")
        private String periodUnit;

        @NameInMap("RenewalStatus")
        private String renewalStatus;

        @NameInMap("ReservedInstanceId")
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
             * The auto-renewal duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The unit of the auto-renewal duration.
             * <p>
             * 
             * Valid values: Year and Month.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * The auto-renewal status of the reserved instance. Valid values:
             * <p>
             * 
             * *   AutoRenewal: The reserved instance is automatically renewed.
             * *   Normal: You must manually renew the reserved instance.
             */
            public Builder renewalStatus(String renewalStatus) {
                this.renewalStatus = renewalStatus;
                return this;
            }

            /**
             * The ID of the reserved instance.
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
    public static class ReservedInstanceRenewAttributes extends TeaModel {
        @NameInMap("ReservedInstanceRenewAttribute")
        private java.util.List < ReservedInstanceRenewAttribute> reservedInstanceRenewAttribute;

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
        public java.util.List < ReservedInstanceRenewAttribute> getReservedInstanceRenewAttribute() {
            return this.reservedInstanceRenewAttribute;
        }

        public static final class Builder {
            private java.util.List < ReservedInstanceRenewAttribute> reservedInstanceRenewAttribute; 

            /**
             * ReservedInstanceRenewAttribute.
             */
            public Builder reservedInstanceRenewAttribute(java.util.List < ReservedInstanceRenewAttribute> reservedInstanceRenewAttribute) {
                this.reservedInstanceRenewAttribute = reservedInstanceRenewAttribute;
                return this;
            }

            public ReservedInstanceRenewAttributes build() {
                return new ReservedInstanceRenewAttributes(this);
            } 

        } 

    }
}
