// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link SessionClusterStatus} extends {@link TeaModel}
 *
 * <p>SessionClusterStatus</p>
 */
public class SessionClusterStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentSessionClusterStatus")
    private String currentSessionClusterStatus;

    @com.aliyun.core.annotation.NameInMap("failure")
    private SessionClusterFailureInfo failure;

    @com.aliyun.core.annotation.NameInMap("running")
    private SessionClusterRunningInfo running;

    private SessionClusterStatus(Builder builder) {
        this.currentSessionClusterStatus = builder.currentSessionClusterStatus;
        this.failure = builder.failure;
        this.running = builder.running;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SessionClusterStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentSessionClusterStatus
     */
    public String getCurrentSessionClusterStatus() {
        return this.currentSessionClusterStatus;
    }

    /**
     * @return failure
     */
    public SessionClusterFailureInfo getFailure() {
        return this.failure;
    }

    /**
     * @return running
     */
    public SessionClusterRunningInfo getRunning() {
        return this.running;
    }

    public static final class Builder {
        private String currentSessionClusterStatus; 
        private SessionClusterFailureInfo failure; 
        private SessionClusterRunningInfo running; 

        private Builder() {
        } 

        private Builder(SessionClusterStatus model) {
            this.currentSessionClusterStatus = model.currentSessionClusterStatus;
            this.failure = model.failure;
            this.running = model.running;
        } 

        /**
         * currentSessionClusterStatus.
         */
        public Builder currentSessionClusterStatus(String currentSessionClusterStatus) {
            this.currentSessionClusterStatus = currentSessionClusterStatus;
            return this;
        }

        /**
         * failure.
         */
        public Builder failure(SessionClusterFailureInfo failure) {
            this.failure = failure;
            return this;
        }

        /**
         * running.
         */
        public Builder running(SessionClusterRunningInfo running) {
            this.running = running;
            return this;
        }

        public SessionClusterStatus build() {
            return new SessionClusterStatus(this);
        } 

    } 

}
