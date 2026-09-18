// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkakopilot20260414.models;

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
 * {@link DataScheduledTaskInfoBySessionIdValue} extends {@link TeaModel}
 *
 * <p>DataScheduledTaskInfoBySessionIdValue</p>
 */
public class DataScheduledTaskInfoBySessionIdValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AsOf")
    private String asOf;

    @com.aliyun.core.annotation.NameInMap("EnabledCount")
    private Long enabledCount;

    @com.aliyun.core.annotation.NameInMap("HasScheduledTask")
    private Boolean hasScheduledTask;

    @com.aliyun.core.annotation.NameInMap("TaskCount")
    private Long taskCount;

    private DataScheduledTaskInfoBySessionIdValue(Builder builder) {
        this.asOf = builder.asOf;
        this.enabledCount = builder.enabledCount;
        this.hasScheduledTask = builder.hasScheduledTask;
        this.taskCount = builder.taskCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataScheduledTaskInfoBySessionIdValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asOf
     */
    public String getAsOf() {
        return this.asOf;
    }

    /**
     * @return enabledCount
     */
    public Long getEnabledCount() {
        return this.enabledCount;
    }

    /**
     * @return hasScheduledTask
     */
    public Boolean getHasScheduledTask() {
        return this.hasScheduledTask;
    }

    /**
     * @return taskCount
     */
    public Long getTaskCount() {
        return this.taskCount;
    }

    public static final class Builder {
        private String asOf; 
        private Long enabledCount; 
        private Boolean hasScheduledTask; 
        private Long taskCount; 

        private Builder() {
        } 

        private Builder(DataScheduledTaskInfoBySessionIdValue model) {
            this.asOf = model.asOf;
            this.enabledCount = model.enabledCount;
            this.hasScheduledTask = model.hasScheduledTask;
            this.taskCount = model.taskCount;
        } 

        /**
         * <p>The time when the overview was generated, in UTC ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T12:00:00Z</p>
         */
        public Builder asOf(String asOf) {
            this.asOf = asOf;
            return this;
        }

        /**
         * <p>The number of associated tasks in the ENABLED status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enabledCount(Long enabledCount) {
            this.enabledCount = enabledCount;
            return this;
        }

        /**
         * <p>Indicates whether the current session has associated scheduled tasks that are in the ENABLED, PAUSED, or NEEDS_AUTH status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasScheduledTask(Boolean hasScheduledTask) {
            this.hasScheduledTask = hasScheduledTask;
            return this;
        }

        /**
         * <p>The total number of associated tasks. Only tasks in the ENABLED, PAUSED, or NEEDS_AUTH status are counted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder taskCount(Long taskCount) {
            this.taskCount = taskCount;
            return this;
        }

        public DataScheduledTaskInfoBySessionIdValue build() {
            return new DataScheduledTaskInfoBySessionIdValue(this);
        } 

    } 

}
