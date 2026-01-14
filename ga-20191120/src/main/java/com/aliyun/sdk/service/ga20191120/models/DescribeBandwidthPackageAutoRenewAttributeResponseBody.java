// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link DescribeBandwidthPackageAutoRenewAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBandwidthPackageAutoRenewAttributeResponseBody</p>
 */
public class DescribeBandwidthPackageAutoRenewAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.NameInMap("AutoRenewDuration")
    private Integer autoRenewDuration;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RenewalStatus")
    private String renewalStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeBandwidthPackageAutoRenewAttributeResponseBody model) {
            this.autoRenew = model.autoRenew;
            this.autoRenewDuration = model.autoRenewDuration;
            this.instanceId = model.instanceId;
            this.renewalStatus = model.renewalStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether auto-renewal is enabled.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The auto-renewal duration. Unit: month. Valid values: <strong>1</strong> to <strong>12</strong>.</p>
         * <blockquote>
         * <p> This parameter is returned only if the value of <strong>AutoRenew</strong> is <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * <p>The ID of the bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>gbwp-bp1iquvlp8khla5emb3ia</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The auto-renewal status of the bandwidth plan.</p>
         * <ul>
         * <li><strong>AutoRenewal</strong>: The bandwidth plan is automatically renewed.</li>
         * <li><strong>Normal</strong>: You must manually renew the bandwidth plan.</li>
         * <li><strong>NotRenewal</strong>: The bandwidth plan is not renewed after it expires. The system sends a non-renewal reminder three days before the expiration date but no longer sends reminders to renew the bandwidth plan. You can change the auto-renewal status of a bandwidth plan from NotRenewal to <strong>Normal</strong> or <strong>AutoRenewal</strong>.</li>
         * </ul>
         * <blockquote>
         * <p> <strong>RenewalStatus</strong> takes precedence over <strong>AutoRenew</strong>. If you do not specify <strong>RenewalStatus</strong>, <strong>AutoRenew</strong> is automatically used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder renewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B820E9F9-D459-5AE7-8F08-A368B53C1AC3</p>
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
