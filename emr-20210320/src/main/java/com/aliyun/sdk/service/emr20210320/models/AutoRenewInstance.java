// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link AutoRenewInstance} extends {@link TeaModel}
 *
 * <p>AutoRenewInstance</p>
 */
public class AutoRenewInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.NameInMap("AutoRenewDuration")
    private Integer autoRenewDuration;

    @com.aliyun.core.annotation.NameInMap("AutoRenewDurationUnit")
    private String autoRenewDurationUnit;

    @com.aliyun.core.annotation.NameInMap("EmrAutoRenewDuration")
    private Integer emrAutoRenewDuration;

    @com.aliyun.core.annotation.NameInMap("EmrAutoRenewDurationUnit")
    private String emrAutoRenewDurationUnit;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private AutoRenewInstance(Builder builder) {
        this.autoRenew = builder.autoRenew;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.autoRenewDurationUnit = builder.autoRenewDurationUnit;
        this.emrAutoRenewDuration = builder.emrAutoRenewDuration;
        this.emrAutoRenewDurationUnit = builder.emrAutoRenewDurationUnit;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AutoRenewInstance create() {
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
     * @return autoRenewDurationUnit
     */
    public String getAutoRenewDurationUnit() {
        return this.autoRenewDurationUnit;
    }

    /**
     * @return emrAutoRenewDuration
     */
    public Integer getEmrAutoRenewDuration() {
        return this.emrAutoRenewDuration;
    }

    /**
     * @return emrAutoRenewDurationUnit
     */
    public String getEmrAutoRenewDurationUnit() {
        return this.emrAutoRenewDurationUnit;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder {
        private Boolean autoRenew; 
        private Integer autoRenewDuration; 
        private String autoRenewDurationUnit; 
        private Integer emrAutoRenewDuration; 
        private String emrAutoRenewDurationUnit; 
        private String instanceId; 

        /**
         * <p>自动续费。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>自动续费时长。</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * <p>自动付费时长单位。</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder autoRenewDurationUnit(String autoRenewDurationUnit) {
            this.autoRenewDurationUnit = autoRenewDurationUnit;
            return this;
        }

        /**
         * <p>emr实例自动续费时长。</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder emrAutoRenewDuration(Integer emrAutoRenewDuration) {
            this.emrAutoRenewDuration = emrAutoRenewDuration;
            return this;
        }

        /**
         * <p>emr实例自动续费时长单位。</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder emrAutoRenewDurationUnit(String emrAutoRenewDurationUnit) {
            this.emrAutoRenewDurationUnit = emrAutoRenewDurationUnit;
            return this;
        }

        /**
         * <p>节点ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1cudc25w2bfwl5****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public AutoRenewInstance build() {
            return new AutoRenewInstance(this);
        } 

    } 

}
