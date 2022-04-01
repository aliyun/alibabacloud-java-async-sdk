// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JobConfig} extends {@link TeaModel}
 *
 * <p>JobConfig</p>
 */
public class JobConfig extends TeaModel {
    @NameInMap("maxRetryTime")
    private Long maxRetryTime;

    @NameInMap("triggerInterval")
    private Long triggerInterval;

    private JobConfig(Builder builder) {
        this.maxRetryTime = builder.maxRetryTime;
        this.triggerInterval = builder.triggerInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobConfig create() {
        return builder().build();
    }

    /**
     * @return maxRetryTime
     */
    public Long getMaxRetryTime() {
        return this.maxRetryTime;
    }

    /**
     * @return triggerInterval
     */
    public Long getTriggerInterval() {
        return this.triggerInterval;
    }

    public static final class Builder {
        private Long maxRetryTime; 
        private Long triggerInterval; 

        /**
         * maxRetryTime
         */
        public Builder maxRetryTime(Long maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }

        /**
         * triggerInterval
         */
        public Builder triggerInterval(Long triggerInterval) {
            this.triggerInterval = triggerInterval;
            return this;
        }

        public JobConfig build() {
            return new JobConfig(this);
        } 

    } 

}
