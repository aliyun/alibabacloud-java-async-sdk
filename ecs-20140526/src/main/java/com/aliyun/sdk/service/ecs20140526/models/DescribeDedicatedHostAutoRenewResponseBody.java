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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDedicatedHostAutoRenewResponseBody model) {
            this.dedicatedHostRenewAttributes = model.dedicatedHostRenewAttributes;
            this.requestId = model.requestId;
        } 

        /**
         * DedicatedHostRenewAttributes.
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

            private Builder() {
            } 

            private Builder(DedicatedHostRenewAttribute model) {
                this.autoRenewEnabled = model.autoRenewEnabled;
                this.autoRenewWithEcs = model.autoRenewWithEcs;
                this.dedicatedHostId = model.dedicatedHostId;
                this.duration = model.duration;
                this.periodUnit = model.periodUnit;
                this.renewalStatus = model.renewalStatus;
            } 

            /**
             * AutoRenewEnabled.
             */
            public Builder autoRenewEnabled(Boolean autoRenewEnabled) {
                this.autoRenewEnabled = autoRenewEnabled;
                return this;
            }

            /**
             * AutoRenewWithEcs.
             */
            public Builder autoRenewWithEcs(String autoRenewWithEcs) {
                this.autoRenewWithEcs = autoRenewWithEcs;
                return this;
            }

            /**
             * DedicatedHostId.
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * PeriodUnit.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * RenewalStatus.
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

            private Builder() {
            } 

            private Builder(DedicatedHostRenewAttributes model) {
                this.dedicatedHostRenewAttribute = model.dedicatedHostRenewAttribute;
            } 

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
