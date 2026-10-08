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
         * <p>The maximum number of retries. Valid values: 0 to 100. This parameter specifies the maximum number of retries allowed when Simple Log Service triggers a function based on the trigger interval if an error occurs, such as insufficient permissions, network failures, and function execution exceptions. If the trigger fails after the maximum number of retries is reached, Simple Log Service triggers the function again when the next trigger interval arrives.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder maxRetryTime(Integer maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }

        /**
         * <p>The time interval at which Simple Log Service triggers function execution. For example, you can retrieve data from the Logstore within the last 120 seconds to Function Compute every 120 seconds to perform custom computing.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
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
