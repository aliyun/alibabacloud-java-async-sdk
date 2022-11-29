// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PipelineStatus} extends {@link TeaModel}
 *
 * <p>PipelineStatus</p>
 */
public class PipelineStatus extends TeaModel {
    @NameInMap("phase")
    private String phase;

    private PipelineStatus(Builder builder) {
        this.phase = builder.phase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PipelineStatus create() {
        return builder().build();
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    public static final class Builder {
        private String phase; 

        /**
         * current pipeline execution phase.
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
