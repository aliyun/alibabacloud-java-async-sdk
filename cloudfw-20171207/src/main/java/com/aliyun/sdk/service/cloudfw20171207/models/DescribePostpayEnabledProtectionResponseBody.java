// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribePostpayEnabledProtectionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePostpayEnabledProtectionResponseBody</p>
 */
public class DescribePostpayEnabledProtectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DisabledDays")
    private Long disabledDays;

    @com.aliyun.core.annotation.NameInMap("DisabledType")
    private String disabledType;

    @com.aliyun.core.annotation.NameInMap("IsEnabledProtection")
    private Boolean isEnabledProtection;

    @com.aliyun.core.annotation.NameInMap("IsOpenButDisabled")
    private Boolean isOpenButDisabled;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePostpayEnabledProtectionResponseBody(Builder builder) {
        this.disabledDays = builder.disabledDays;
        this.disabledType = builder.disabledType;
        this.isEnabledProtection = builder.isEnabledProtection;
        this.isOpenButDisabled = builder.isOpenButDisabled;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePostpayEnabledProtectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return disabledDays
     */
    public Long getDisabledDays() {
        return this.disabledDays;
    }

    /**
     * @return disabledType
     */
    public String getDisabledType() {
        return this.disabledType;
    }

    /**
     * @return isEnabledProtection
     */
    public Boolean getIsEnabledProtection() {
        return this.isEnabledProtection;
    }

    /**
     * @return isOpenButDisabled
     */
    public Boolean getIsOpenButDisabled() {
        return this.isOpenButDisabled;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long disabledDays; 
        private String disabledType; 
        private Boolean isEnabledProtection; 
        private Boolean isOpenButDisabled; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePostpayEnabledProtectionResponseBody model) {
            this.disabledDays = model.disabledDays;
            this.disabledType = model.disabledType;
            this.isEnabledProtection = model.isEnabledProtection;
            this.isOpenButDisabled = model.isOpenButDisabled;
            this.requestId = model.requestId;
        } 

        /**
         * DisabledDays.
         */
        public Builder disabledDays(Long disabledDays) {
            this.disabledDays = disabledDays;
            return this;
        }

        /**
         * DisabledType.
         */
        public Builder disabledType(String disabledType) {
            this.disabledType = disabledType;
            return this;
        }

        /**
         * IsEnabledProtection.
         */
        public Builder isEnabledProtection(Boolean isEnabledProtection) {
            this.isEnabledProtection = isEnabledProtection;
            return this;
        }

        /**
         * IsOpenButDisabled.
         */
        public Builder isOpenButDisabled(Boolean isOpenButDisabled) {
            this.isOpenButDisabled = isOpenButDisabled;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePostpayEnabledProtectionResponseBody build() {
            return new DescribePostpayEnabledProtectionResponseBody(this);
        } 

    } 

}
