// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeploymentRestoreStrategy} extends {@link TeaModel}
 *
 * <p>DeploymentRestoreStrategy</p>
 */
public class DeploymentRestoreStrategy extends TeaModel {
    @NameInMap("allowNonRestoredState")
    private Boolean allowNonRestoredState;

    @NameInMap("jobStartTimeInMs")
    private Long jobStartTimeInMs;

    @NameInMap("kind")
    private String kind;

    @NameInMap("savepointId")
    private String savepointId;

    private DeploymentRestoreStrategy(Builder builder) {
        this.allowNonRestoredState = builder.allowNonRestoredState;
        this.jobStartTimeInMs = builder.jobStartTimeInMs;
        this.kind = builder.kind;
        this.savepointId = builder.savepointId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeploymentRestoreStrategy create() {
        return builder().build();
    }

    /**
     * @return allowNonRestoredState
     */
    public Boolean getAllowNonRestoredState() {
        return this.allowNonRestoredState;
    }

    /**
     * @return jobStartTimeInMs
     */
    public Long getJobStartTimeInMs() {
        return this.jobStartTimeInMs;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return savepointId
     */
    public String getSavepointId() {
        return this.savepointId;
    }

    public static final class Builder {
        private Boolean allowNonRestoredState; 
        private Long jobStartTimeInMs; 
        private String kind; 
        private String savepointId; 

        /**
         * allowNonRestoredState.
         */
        public Builder allowNonRestoredState(Boolean allowNonRestoredState) {
            this.allowNonRestoredState = allowNonRestoredState;
            return this;
        }

        /**
         * jobStartTimeInMs.
         */
        public Builder jobStartTimeInMs(Long jobStartTimeInMs) {
            this.jobStartTimeInMs = jobStartTimeInMs;
            return this;
        }

        /**
         * kind.
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * savepointId.
         */
        public Builder savepointId(String savepointId) {
            this.savepointId = savepointId;
            return this;
        }

        public DeploymentRestoreStrategy build() {
            return new DeploymentRestoreStrategy(this);
        } 

    } 

}
