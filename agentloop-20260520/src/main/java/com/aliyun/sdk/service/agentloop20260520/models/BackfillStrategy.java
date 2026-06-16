// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link BackfillStrategy} extends {@link TeaModel}
 *
 * <p>BackfillStrategy</p>
 */
public class BackfillStrategy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("immediate")
    private Boolean immediate;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    private BackfillStrategy(Builder builder) {
        this.enabled = builder.enabled;
        this.endTime = builder.endTime;
        this.immediate = builder.immediate;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BackfillStrategy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return immediate
     */
    public Boolean getImmediate() {
        return this.immediate;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private Boolean enabled; 
        private Long endTime; 
        private Boolean immediate; 
        private Long startTime; 

        private Builder() {
        } 

        private Builder(BackfillStrategy model) {
            this.enabled = model.enabled;
            this.endTime = model.endTime;
            this.immediate = model.immediate;
            this.startTime = model.startTime;
        } 

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * immediate.
         */
        public Builder immediate(Boolean immediate) {
            this.immediate = immediate;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        public BackfillStrategy build() {
            return new BackfillStrategy(this);
        } 

    } 

}
