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
    @NameInMap("DedicatedHostRenewAttributes")
    private DedicatedHostRenewAttributes dedicatedHostRenewAttributes;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDedicatedHostAutoRenewResponseBody(Builder builder) {
        this.dedicatedHostRenewAttributes = builder.dedicatedHostRenewAttributes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedHostAutoRenewResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedHostRenewAttributes
     */
    public DedicatedHostRenewAttributes getDedicatedHostRenewAttributes() {
        return this.dedicatedHostRenewAttributes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DedicatedHostRenewAttributes dedicatedHostRenewAttributes; 
        private String requestId; 

        /**
         * Details about the auto-renewal attributes of the dedicated hosts.
         */
        public Builder dedicatedHostRenewAttributes(DedicatedHostRenewAttributes dedicatedHostRenewAttributes) {
            this.dedicatedHostRenewAttributes = dedicatedHostRenewAttributes;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDedicatedHostAutoRenewResponseBody build() {
            return new DescribeDedicatedHostAutoRenewResponseBody(this);
        } 

    } 

    public static class DedicatedHostRenewAttribute extends TeaModel {
        @NameInMap("AutoRenewEnabled")
        private Boolean autoRenewEnabled;

        @NameInMap("AutoRenewWithEcs")
        private String autoRenewWithEcs;

        @NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("PeriodUnit")
        private String periodUnit;

        @NameInMap("RenewalStatus")
        private String renewalStatus;

        private DedicatedHostRenewAttribute(Builder builder) {
            this.autoRenewEnabled = builder.autoRenewEnabled;
            this.autoRenewWithEcs = builder.autoRenewWithEcs;
            this.dedicatedHostId = builder.dedicatedHostId;
            this.duration = builder.duration;
            this.periodUnit = builder.periodUnit;
            this.renewalStatus = builder.renewalStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostRenewAttribute create() {
            return builder().build();
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

        /**
         * @return dedicatedHostId
         */
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
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

        public static final class Builder {
            private Boolean autoRenewEnabled; 
            private String autoRenewWithEcs; 
            private String dedicatedHostId; 
            private Integer duration; 
            private String periodUnit; 
            private String renewalStatus; 

            /**
             * Indicates whether the subscription dedicated host is automatically renewed. Valid values:
             * <p>
             * 
             * *   true: The dedicated host is automatically renewed.
             * *   false: The dedicated host is not automatically renewed.
             */
            public Builder autoRenewEnabled(Boolean autoRenewEnabled) {
                this.autoRenewEnabled = autoRenewEnabled;
                return this;
            }

            /**
             * Indicates whether the subscription dedicated host is automatically renewed along with the subscription Elastic Compute Service (ECS) instances hosted on it if the new expiration time of the renewed instances is later than the expiration time of the dedicated host. Valid values:
             * <p>
             * 
             * *   AutoRenewWithEcs: The subscription dedicated host is automatically renewed along with the subscription ECS instances hosted on it.
             * *   StopRenewWithEcs: The subscription dedicated host is not automatically renewed along with the subscription ECS instances hosted on it.
             */
            public Builder autoRenewWithEcs(String autoRenewWithEcs) {
                this.autoRenewWithEcs = autoRenewWithEcs;
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
             * The auto-renewal period.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The unit of the auto-renewal period. Valid values:
             * <p>
             * 
             * *   Week
             * *   Month
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * Indicates whether the subscription dedicated host is automatically renewed. Valid values:
             * <p>
             * 
             * *   AutoRenewal: The dedicated host is automatically renewed.
             * *   Normal: The dedicated host is not automatically renewed, and you will receive notifications for renewal.
             * *   NotRenewal: The dedicated host is not renewed, and no expiration notification is sent. Notifications for renewal are automatically sent three days before the dedicated host expires. You can change the value of this parameter from NotRenewal to Normal for the dedicated host and manually renew it by calling the [RenewDedicatedHosts](~~93287~~) operation. Alternatively, you can set this parameter to AutoRenewal to configure the dedicated host to be automatically renewed.
             */
            public Builder renewalStatus(String renewalStatus) {
                this.renewalStatus = renewalStatus;
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
