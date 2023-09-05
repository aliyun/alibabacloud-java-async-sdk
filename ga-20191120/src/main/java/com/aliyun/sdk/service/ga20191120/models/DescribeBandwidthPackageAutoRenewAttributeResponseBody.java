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
         * Indicates whether auto-renewal is enabled. Valid values:
         * <p>
         * 
         * *   **true**: enabled
         * *   **false** (default): disabled
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The auto-renewal period. Unit: months. Valid values: **1** to **12**.
         * <p>
         * 
         * > : This parameter takes effect only if **AutoRenew** is set to **true**.
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
         * The auto-renewal status of the bandwidth plan. Valid values:
         * <p>
         * 
         * *   **AutoRenewal**: The bandwidth plan is automatically renewed.
         * *   **Normal**: You must manually renew the bandwidth plan.
         * *   **NotRenewal**: Choose this option if you do not want to renew the bandwidth plan after it expires. The system sends only a non-renewal reminder three days before the expiration date. The system no longer sends notifications to remind you to renew the bandwidth plan. You can change the value of this parameter from NotRenewal to Normal for a bandwidth plan, and then manually renew the bandwidth plan. You can also set the RenewalStatus parameter to **AutoRenewal**.
         * 
         * > The **RenewalStatus** parameter takes precedence over the **AutoRenew** parameter. If you do not set **RenewalStatus**, the **AutoRenew** parameter is used by default.
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
