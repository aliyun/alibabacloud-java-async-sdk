// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAcceleratorAutoRenewAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAcceleratorAutoRenewAttributeResponseBody</p>
 */
public class DescribeAcceleratorAutoRenewAttributeResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @NameInMap("AutoRenewDuration")
    private Integer autoRenewDuration;

    @NameInMap("RenewalStatus")
    private String renewalStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAcceleratorAutoRenewAttributeResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.autoRenew = builder.autoRenew;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.renewalStatus = builder.renewalStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAcceleratorAutoRenewAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
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
        private String acceleratorId; 
        private Boolean autoRenew; 
        private Integer autoRenewDuration; 
        private String renewalStatus; 
        private String requestId; 

        /**
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * AutoRenewDuration.
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * RenewalStatus.
         */
        public Builder renewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAcceleratorAutoRenewAttributeResponseBody build() {
            return new DescribeAcceleratorAutoRenewAttributeResponseBody(this);
        } 

    } 

}
