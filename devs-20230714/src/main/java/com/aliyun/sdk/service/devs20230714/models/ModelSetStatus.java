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
 * {@link ModelSetStatus} extends {@link TeaModel}
 *
 * <p>ModelSetStatus</p>
 */
public class ModelSetStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("observedGeneration")
    private Long observedGeneration;

    @com.aliyun.core.annotation.NameInMap("observedTime")
    private String observedTime;

    @com.aliyun.core.annotation.NameInMap("phase")
    private String phase;

    private ModelSetStatus(Builder builder) {
        this.observedGeneration = builder.observedGeneration;
        this.observedTime = builder.observedTime;
        this.phase = builder.phase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelSetStatus create() {
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
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    public static final class Builder {
        private Long observedGeneration; 
        private String observedTime; 
        private String phase; 

        private Builder() {
        } 

        private Builder(ModelSetStatus model) {
            this.observedGeneration = model.observedGeneration;
            this.observedTime = model.observedTime;
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
         * phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        public ModelSetStatus build() {
            return new ModelSetStatus(this);
        } 

    } 

}
