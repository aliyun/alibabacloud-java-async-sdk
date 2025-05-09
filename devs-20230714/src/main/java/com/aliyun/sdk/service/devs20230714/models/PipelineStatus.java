// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link PipelineStatus} extends {@link TeaModel}
 *
 * <p>PipelineStatus</p>
 */
public class PipelineStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latestExecError")
    private TaskExecError latestExecError;

    @com.aliyun.core.annotation.NameInMap("phase")
    private String phase;

    private PipelineStatus(Builder builder) {
        this.latestExecError = builder.latestExecError;
        this.phase = builder.phase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PipelineStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latestExecError
     */
    public TaskExecError getLatestExecError() {
        return this.latestExecError;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    public static final class Builder {
        private TaskExecError latestExecError; 
        private String phase; 

        private Builder() {
        } 

        private Builder(PipelineStatus model) {
            this.latestExecError = model.latestExecError;
            this.phase = model.phase;
        } 

        /**
         * latestExecError.
         */
        public Builder latestExecError(TaskExecError latestExecError) {
            this.latestExecError = latestExecError;
            return this;
        }

        /**
         * phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        public PipelineStatus build() {
            return new PipelineStatus(this);
        } 

    } 

}
