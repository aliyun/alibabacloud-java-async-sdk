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
 * {@link DescribeDedicatedHostAutoRenewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedHostAutoRenewResponseBody</p>
 */
public class DescribeDedicatedHostAutoRenewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DedicatedHostRenewAttributes")
    private DedicatedHostRenewAttributes dedicatedHostRenewAttributes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The array that consists of dedicated host auto-renewal attributes.</p>
         */
        public Builder dedicatedHostRenewAttributes(DedicatedHostRenewAttributes dedicatedHostRenewAttributes) {
            this.dedicatedHostRenewAttributes = dedicatedHostRenewAttributes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDedicatedHostAutoRenewResponseBody build() {
            return new DescribeDedicatedHostAutoRenewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDedicatedHostAutoRenewResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostAutoRenewResponseBody</p>
     */
    public static class DedicatedHostRenewAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenewEnabled")
        private Boolean autoRenewEnabled;

        @com.aliyun.core.annotation.NameInMap("AutoRenewWithEcs")
        private String autoRenewWithEcs;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("RenewalStatus")
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
             * <p>Indicates whether auto-renewal is enabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRenewEnabled(Boolean autoRenewEnabled) {
                this.autoRenewEnabled = autoRenewEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the dedicated host is automatically renewed if a subscription ECS instance it hosts, after being automatically renewed, has a new expiration time that is later than that of the dedicated host. Valid values:</p>
             * <ul>
             * <li>AutoRenewWithEcs: The dedicated host is automatically renewed along with the ECS instance.</li>
             * <li>StopRenewWithEcs: The dedicated host is not automatically renewed along with the ECS instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>StopRenewWithEcs</p>
             */
            public Builder autoRenewWithEcs(String autoRenewWithEcs) {
                this.autoRenewWithEcs = autoRenewWithEcs;
                return this;
            }

            /**
             * <p>The ID of the dedicated host.</p>
             * 
             * <strong>example:</strong>
             * <p>dh-bp165p6xk2tlw61e****</p>
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * <p>The auto-renewal period.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The unit of the auto-renewal duration. Valid values:</p>
             * <ul>
             * <li>Week</li>
             * <li>Month</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>Indicates whether the subscription dedicated host is automatically renewed. Valid values:</p>
             * <ul>
             * <li>AutoRenewal: The dedicated host is automatically renewed.</li>
             * <li>Normal: The dedicated host is not automatically renewed, but renewal notifications are sent.</li>
             * <li>NotRenewal: The dedicated host is not automatically renewed, and no expiration notification is sent. Alibaba Cloud sends only a non-renewal notice three days before the host expires. If the renewal status of a dedicated host is NotRenewal, you can change the value to Normal and then call <a href="https://help.aliyun.com/document_detail/93287.html">RenewDedicatedHosts</a> to manually renew the dedicated host, or directly change the value to AutoRenewal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
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
    /**
     * 
     * {@link DescribeDedicatedHostAutoRenewResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostAutoRenewResponseBody</p>
     */
    public static class DedicatedHostRenewAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHostRenewAttribute")
        private java.util.List<DedicatedHostRenewAttribute> dedicatedHostRenewAttribute;

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
        public java.util.List<DedicatedHostRenewAttribute> getDedicatedHostRenewAttribute() {
            return this.dedicatedHostRenewAttribute;
        }

        public static final class Builder {
            private java.util.List<DedicatedHostRenewAttribute> dedicatedHostRenewAttribute; 

            /**
             * DedicatedHostRenewAttribute.
             */
            public Builder dedicatedHostRenewAttribute(java.util.List<DedicatedHostRenewAttribute> dedicatedHostRenewAttribute) {
                this.dedicatedHostRenewAttribute = dedicatedHostRenewAttribute;
                return this;
            }

            public DedicatedHostRenewAttributes build() {
                return new DedicatedHostRenewAttributes(this);
            } 

        } 

    }
}
