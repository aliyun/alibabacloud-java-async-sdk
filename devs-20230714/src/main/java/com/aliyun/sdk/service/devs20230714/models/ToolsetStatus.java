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
 * {@link ToolsetStatus} extends {@link TeaModel}
 *
 * <p>ToolsetStatus</p>
 */
public class ToolsetStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("observedGeneration")
    private Long observedGeneration;

    @com.aliyun.core.annotation.NameInMap("observedTime")
    private String observedTime;

    @com.aliyun.core.annotation.NameInMap("outputs")
    private java.util.Map<String, ?> outputs;

    @com.aliyun.core.annotation.NameInMap("phase")
    private String phase;

    private ToolsetStatus(Builder builder) {
        this.observedGeneration = builder.observedGeneration;
        this.observedTime = builder.observedTime;
        this.outputs = builder.outputs;
        this.phase = builder.phase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ToolsetStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return observedGeneration
     */
    public Long getObservedGeneration() {
        return this.observedGeneration;
    }

    /**
     * @return observedTime
     */
    public String getObservedTime() {
        return this.observedTime;
    }

    /**
     * @return outputs
     */
    public java.util.Map<String, ?> getOutputs() {
        return this.outputs;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    public static final class Builder {
        private Long observedGeneration; 
        private String observedTime; 
        private java.util.Map<String, ?> outputs; 
        private String phase; 

        private Builder() {
        } 

        private Builder(ToolsetStatus model) {
            this.observedGeneration = model.observedGeneration;
            this.observedTime = model.observedTime;
            this.outputs = model.outputs;
            this.phase = model.phase;
        } 

        /**
         * observedGeneration.
         */
        public Builder observedGeneration(Long observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        /**
         * observedTime.
         */
        public Builder observedTime(String observedTime) {
            this.observedTime = observedTime;
            return this;
        }

        /**
         * outputs.
         */
        public Builder outputs(java.util.Map<String, ?> outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        public ToolsetStatus build() {
            return new ToolsetStatus(this);
        } 

    } 

}
