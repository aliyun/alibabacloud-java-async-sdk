// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
    private Integer maxRetryTime;

    @NameInMap("triggerInterval")
    private Integer triggerInterval;

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
    public Integer getMaxRetryTime() {
        return this.maxRetryTime;
    }

    /**
     * @return triggerInterval
     */
    public Integer getTriggerInterval() {
        return this.triggerInterval;
    }

    public static final class Builder {
        private Integer maxRetryTime; 
        private Integer triggerInterval; 

        /**
         * maxRetryTime.
         */
        public Builder maxRetryTime(Integer maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }

        /**
         * triggerInterval.
         */
        public Builder triggerInterval(Integer triggerInterval) {
            this.triggerInterval = triggerInterval;
            return this;
        }

        public JobConfig build() {
            return new JobConfig(this);
        } 

    } 

}
