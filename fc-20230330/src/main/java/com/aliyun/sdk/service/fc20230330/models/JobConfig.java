// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link JobConfig} extends {@link TeaModel}
 *
 * <p>JobConfig</p>
 */
public class JobConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxRetryTime")
    private Integer maxRetryTime;

    @com.aliyun.core.annotation.NameInMap("triggerInterval")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(JobConfig model) {
            this.maxRetryTime = model.maxRetryTime;
            this.triggerInterval = model.triggerInterval;
        } 

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
