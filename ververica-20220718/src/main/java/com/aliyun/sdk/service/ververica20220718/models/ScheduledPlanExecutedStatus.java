// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ScheduledPlanExecutedStatus} extends {@link TeaModel}
 *
 * <p>ScheduledPlanExecutedStatus</p>
 */
public class ScheduledPlanExecutedStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("restartType")
    private String restartType;

    @com.aliyun.core.annotation.NameInMap("statusState")
    private String statusState;

    private ScheduledPlanExecutedStatus(Builder builder) {
        this.restartType = builder.restartType;
        this.statusState = builder.statusState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScheduledPlanExecutedStatus create() {
        return builder().build();
    }

    /**
     * @return restartType
     */
    public String getRestartType() {
        return this.restartType;
    }

    /**
     * @return statusState
     */
    public String getStatusState() {
        return this.statusState;
    }

    public static final class Builder {
        private String restartType; 
        private String statusState; 

        /**
         * restartType.
         */
        public Builder restartType(String restartType) {
            this.restartType = restartType;
            return this;
        }

        /**
         * statusState.
         */
        public Builder statusState(String statusState) {
            this.statusState = statusState;
            return this;
        }

        public ScheduledPlanExecutedStatus build() {
            return new ScheduledPlanExecutedStatus(this);
        } 

    } 

}
