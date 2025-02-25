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
 * {@link AutoRenewInstanceParam} extends {@link TeaModel}
 *
 * <p>AutoRenewInstanceParam</p>
 */
public class AutoRenewInstanceParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private String autoRenew;

    @com.aliyun.core.annotation.NameInMap("AutoRenewDuration")
    private String autoRenewDuration;

    @com.aliyun.core.annotation.NameInMap("AutoRenewDurationUnit")
    private String autoRenewDurationUnit;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private AutoRenewInstanceParam(Builder builder) {
        this.autoRenew = builder.autoRenew;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.autoRenewDurationUnit = builder.autoRenewDurationUnit;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AutoRenewInstanceParam create() {
        return builder().build();
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewDuration
     */
    public String getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    /**
     * @return autoRenewDurationUnit
     */
    public String getAutoRenewDurationUnit() {
        return this.autoRenewDurationUnit;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder {
        private String autoRenew; 
        private String autoRenewDuration; 
        private String autoRenewDurationUnit; 
        private String instanceId; 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * AutoRenewDuration.
         */
        public Builder autoRenewDuration(String autoRenewDuration) {
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * AutoRenewDurationUnit.
         */
        public Builder autoRenewDurationUnit(String autoRenewDurationUnit) {
            this.autoRenewDurationUnit = autoRenewDurationUnit;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public AutoRenewInstanceParam build() {
            return new AutoRenewInstanceParam(this);
        } 

    } 

}
