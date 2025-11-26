// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link RepeatNotifySetting} extends {@link TeaModel}
 *
 * <p>RepeatNotifySetting</p>
 */
public class RepeatNotifySetting extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endIncidentState")
    private String endIncidentState;

    @com.aliyun.core.annotation.NameInMap("repeatInterval")
    private String repeatInterval;

    private RepeatNotifySetting(Builder builder) {
        this.endIncidentState = builder.endIncidentState;
        this.repeatInterval = builder.repeatInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RepeatNotifySetting create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endIncidentState
     */
    public String getEndIncidentState() {
        return this.endIncidentState;
    }

    /**
     * @return repeatInterval
     */
    public String getRepeatInterval() {
        return this.repeatInterval;
    }

    public static final class Builder {
        private String endIncidentState; 
        private String repeatInterval; 

        private Builder() {
        } 

        private Builder(RepeatNotifySetting model) {
            this.endIncidentState = model.endIncidentState;
            this.repeatInterval = model.repeatInterval;
        } 

        /**
         * endIncidentState.
         */
        public Builder endIncidentState(String endIncidentState) {
            this.endIncidentState = endIncidentState;
            return this;
        }

        /**
         * repeatInterval.
         */
        public Builder repeatInterval(String repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }

        public RepeatNotifySetting build() {
            return new RepeatNotifySetting(this);
        } 

    } 

}
