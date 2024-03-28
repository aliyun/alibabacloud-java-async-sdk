// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandwidthPackageAutoRenewAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBandwidthPackageAutoRenewAttributeResponseBody</p>
 */
public class DescribeBandwidthPackageAutoRenewAttributeResponseBody extends TeaModel {
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @NameInMap("AutoRenewDuration")
    private Integer autoRenewDuration;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RenewalStatus")
    private String renewalStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBandwidthPackageAutoRenewAttributeResponseBody(Builder builder) {
        this.autoRenew = builder.autoRenew;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.instanceId = builder.instanceId;
        this.renewalStatus = builder.renewalStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBandwidthPackageAutoRenewAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewDuration
     */
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return renewalStatus
     */
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean autoRenew; 
        private Integer autoRenewDuration; 
        private String instanceId; 
        private String renewalStatus; 
        private String requestId; 

        /**
         * Indicates whether auto-renewal is enabled.
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The auto-renewal duration. Unit: month. Valid values: **1** to **12**.
         * <p>
         * 
         * >  This parameter is returned only if the value of **AutoRenew** is **true**.
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * The ID of the bandwidth plan.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The auto-renewal status of the bandwidth plan.
         * <p>
         * 
         * *   **AutoRenewal**: The bandwidth plan is automatically renewed.
         * *   **Normal**: You must manually renew the bandwidth plan.
         * *   **NotRenewal**: The bandwidth plan is not renewed after it expires. The system sends a non-renewal reminder three days before the expiration date but no longer sends reminders to renew the bandwidth plan. You can change the auto-renewal status of a bandwidth plan from NotRenewal to **Normal** or **AutoRenewal**.
         * 
         * >  **RenewalStatus** takes precedence over **AutoRenew**. If you do not specify **RenewalStatus**, **AutoRenew** is automatically used.
         */
        public Builder renewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBandwidthPackageAutoRenewAttributeResponseBody build() {
            return new DescribeBandwidthPackageAutoRenewAttributeResponseBody(this);
        } 

    } 

}
