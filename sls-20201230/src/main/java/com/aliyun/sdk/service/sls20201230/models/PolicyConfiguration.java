// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link PolicyConfiguration} extends {@link TeaModel}
 *
 * <p>PolicyConfiguration</p>
 */
public class PolicyConfiguration extends TeaModel {
    @NameInMap("actionPolicyId")
    private String actionPolicyId;

    @NameInMap("alertPolicyId")
    private String alertPolicyId;

    @NameInMap("repeatInterval")
    private String repeatInterval;

    private PolicyConfiguration(Builder builder) {
        this.actionPolicyId = builder.actionPolicyId;
        this.alertPolicyId = builder.alertPolicyId;
        this.repeatInterval = builder.repeatInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PolicyConfiguration create() {
        return builder().build();
    }

    /**
     * @return actionPolicyId
     */
    public String getActionPolicyId() {
        return this.actionPolicyId;
    }

    /**
     * @return alertPolicyId
     */
    public String getAlertPolicyId() {
        return this.alertPolicyId;
    }

    /**
     * @return repeatInterval
     */
    public String getRepeatInterval() {
        return this.repeatInterval;
    }

    public static final class Builder {
        private String actionPolicyId; 
        private String alertPolicyId; 
        private String repeatInterval; 

        /**
         * actionPolicyId.
         */
        public Builder actionPolicyId(String actionPolicyId) {
            this.actionPolicyId = actionPolicyId;
            return this;
        }

        /**
         * alertPolicyId.
         */
        public Builder alertPolicyId(String alertPolicyId) {
            this.alertPolicyId = alertPolicyId;
            return this;
        }

        /**
         * repeatInterval.
         */
        public Builder repeatInterval(String repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }

        public PolicyConfiguration build() {
            return new PolicyConfiguration(this);
        } 

    } 

}
