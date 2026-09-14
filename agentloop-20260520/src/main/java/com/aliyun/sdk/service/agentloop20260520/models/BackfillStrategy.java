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

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    private BackfillStrategy(Builder builder) {
        this.enabled = builder.enabled;
        this.endTime = builder.endTime;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private Boolean enabled; 
        private Long endTime; 
        private Long startTime; 

        private Builder() {
        } 

        private Builder(BackfillStrategy model) {
            this.enabled = model.enabled;
            this.endTime = model.endTime;
            this.startTime = model.startTime;
        } 

        /**
         * <p>Specifies whether the backfill policy is enabled. If this parameter is not specified or is set to true, the policy is enabled. If this parameter is set to false, the policy is disabled but the configuration is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The end of the backfill time range, in UNIX millisecond timestamp. Provide a complete time range when you need to manually start a backfill.</p>
         * 
         * <strong>example:</strong>
         * <p>1782902400000</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The start of the backfill time range, in UNIX millisecond timestamp. Provide a complete time range when you need to manually start a backfill.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816000000</p>
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
