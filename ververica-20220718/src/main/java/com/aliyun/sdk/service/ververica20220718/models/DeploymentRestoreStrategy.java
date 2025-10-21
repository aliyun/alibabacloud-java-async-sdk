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
 * {@link DeploymentRestoreStrategy} extends {@link TeaModel}
 *
 * <p>DeploymentRestoreStrategy</p>
 */
public class DeploymentRestoreStrategy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowNonRestoredState")
    private Boolean allowNonRestoredState;

    @com.aliyun.core.annotation.NameInMap("jobStartTimeInMs")
    private Long jobStartTimeInMs;

    @com.aliyun.core.annotation.NameInMap("kind")
    private String kind;

    @com.aliyun.core.annotation.NameInMap("savepointId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeploymentRestoreStrategy model) {
            this.allowNonRestoredState = model.allowNonRestoredState;
            this.jobStartTimeInMs = model.jobStartTimeInMs;
            this.kind = model.kind;
            this.savepointId = model.savepointId;
        } 

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
