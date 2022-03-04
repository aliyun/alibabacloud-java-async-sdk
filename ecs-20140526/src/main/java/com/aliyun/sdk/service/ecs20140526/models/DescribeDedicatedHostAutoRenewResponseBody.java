// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedHostAutoRenewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedHostAutoRenewResponseBody</p>
 */
public class DescribeDedicatedHostAutoRenewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("DedicatedHostRenewAttributes")
    private DedicatedHostRenewAttributes dedicatedHostRenewAttributes;

    private DescribeDedicatedHostAutoRenewResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.dedicatedHostRenewAttributes = builder.dedicatedHostRenewAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedHostAutoRenewResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return dedicatedHostRenewAttributes
     */
    public DedicatedHostRenewAttributes getDedicatedHostRenewAttributes() {
        return this.dedicatedHostRenewAttributes;
    }

    public static final class Builder {
        private String requestId; 
        private DedicatedHostRenewAttributes dedicatedHostRenewAttributes; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array of auto-renewal attributes of a dedicated host.
         */
        public Builder dedicatedHostRenewAttributes(DedicatedHostRenewAttributes dedicatedHostRenewAttributes) {
            this.dedicatedHostRenewAttributes = dedicatedHostRenewAttributes;
            return this;
        }

        public DescribeDedicatedHostAutoRenewResponseBody build() {
            return new DescribeDedicatedHostAutoRenewResponseBody(this);
        } 

    } 

    public static class DedicatedHostRenewAttribute extends TeaModel {
        @NameInMap("PeriodUnit")
        private String periodUnit;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        @NameInMap("RenewalStatus")
        private String renewalStatus;

        @NameInMap("AutoRenewEnabled")
        private Boolean autoRenewEnabled;

        @NameInMap("AutoRenewWithEcs")
        private String autoRenewWithEcs;

        private DedicatedHostRenewAttribute(Builder builder) {
            this.periodUnit = builder.periodUnit;
            this.duration = builder.duration;
            this.dedicatedHostId = builder.dedicatedHostId;
            this.renewalStatus = builder.renewalStatus;
            this.autoRenewEnabled = builder.autoRenewEnabled;
            this.autoRenewWithEcs = builder.autoRenewWithEcs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostRenewAttribute create() {
            return builder().build();
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return dedicatedHostId
         */
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        /**
         * @return renewalStatus
         */
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

        /**
         * @return autoRenewEnabled
         */
        public Boolean getAutoRenewEnabled() {
            return this.autoRenewEnabled;
        }

        /**
         * @return autoRenewWithEcs
         */
        public String getAutoRenewWithEcs() {
            return this.autoRenewWithEcs;
        }

        public static final class Builder {
            private String periodUnit; 
            private Integer duration; 
            private String dedicatedHostId; 
            private String renewalStatus; 
            private Boolean autoRenewEnabled; 
            private String autoRenewWithEcs; 

            /**
             * The renewal unit. Possible values:
             * <p>
             * 
             * -Week
             * -Month
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * The automatic renewal period.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The ID of the dedicated host.
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * Specifies whether to automatically renew the subscription dedicated host. Valid values:
             * <p>
             * 
             * -AutoRenewal: auto renewal.
             * -Normal: to be renewed.
             * -NotRenewal: no renewal or expiration notification is sent. Alibaba Cloud sends a non-renewal reminder on the third day before expiration. If you do not renew a dedicated host, you can set it to Normal, and then renew [RenewDedicatedHosts](~~ 93287 ~~) or set it to automatic (AutoRenewal).
             */
            public Builder renewalStatus(String renewalStatus) {
                this.renewalStatus = renewalStatus;
                return this;
            }

            /**
             * Specifies whether to enable automatic renewal. Possible values:
             * <p>
             * -true: auto renewal
             * -false: auto renewal is disabled.
             */
            public Builder autoRenewEnabled(Boolean autoRenewEnabled) {
                this.autoRenewEnabled = autoRenewEnabled;
                return this;
            }

            /**
             * When a subscription ECS instance in a dedicated host is automatically renewed, if the expiration time of the ECS instance after renewal is later than that of the dedicated host, whether the dedicated host is automatically renewed along with the ECS instance. Possible values:
             * <p>
             * 
             * -AutoRenewWithEcs: auto renewal is performed on the ECS instance.
             * -StopRenewWithEcs: the ECS instance is not automatically renewed.
             * 
             */
            public Builder autoRenewWithEcs(String autoRenewWithEcs) {
                this.autoRenewWithEcs = autoRenewWithEcs;
                return this;
            }

            public DedicatedHostRenewAttribute build() {
                return new DedicatedHostRenewAttribute(this);
            } 

        } 

    }
    public static class DedicatedHostRenewAttributes extends TeaModel {
        @NameInMap("DedicatedHostRenewAttribute")
        private java.util.List < DedicatedHostRenewAttribute> dedicatedHostRenewAttribute;

        private DedicatedHostRenewAttributes(Builder builder) {
            this.dedicatedHostRenewAttribute = builder.dedicatedHostRenewAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostRenewAttributes create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostRenewAttribute
         */
        public java.util.List < DedicatedHostRenewAttribute> getDedicatedHostRenewAttribute() {
            return this.dedicatedHostRenewAttribute;
        }

        public static final class Builder {
            private java.util.List < DedicatedHostRenewAttribute> dedicatedHostRenewAttribute; 

            /**
             * DedicatedHostRenewAttribute.
             */
            public Builder dedicatedHostRenewAttribute(java.util.List < DedicatedHostRenewAttribute> dedicatedHostRenewAttribute) {
                this.dedicatedHostRenewAttribute = dedicatedHostRenewAttribute;
                return this;
            }

            public DedicatedHostRenewAttributes build() {
                return new DedicatedHostRenewAttributes(this);
            } 

        } 

    }
}
