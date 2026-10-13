// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link UpdateContextDatabaseSyncJobScheduleRequest} extends {@link RequestModel}
 *
 * <p>UpdateContextDatabaseSyncJobScheduleRequest</p>
 */
public class UpdateContextDatabaseSyncJobScheduleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DailyTimes")
    private java.util.List<String> dailyTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalMinutes")
    private Integer intervalMinutes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MissedPolicy")
    private String missedPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateContextDatabaseSyncJobScheduleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dailyTimes = builder.dailyTimes;
        this.intervalMinutes = builder.intervalMinutes;
        this.jobId = builder.jobId;
        this.missedPolicy = builder.missedPolicy;
        this.type = builder.type;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContextDatabaseSyncJobScheduleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dailyTimes
     */
    public java.util.List<String> getDailyTimes() {
        return this.dailyTimes;
    }

    /**
     * @return intervalMinutes
     */
    public Integer getIntervalMinutes() {
        return this.intervalMinutes;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return missedPolicy
     */
    public String getMissedPolicy() {
        return this.missedPolicy;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateContextDatabaseSyncJobScheduleRequest, Builder> {
        private String clientToken; 
        private java.util.List<String> dailyTimes; 
        private Integer intervalMinutes; 
        private String jobId; 
        private String missedPolicy; 
        private String type; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateContextDatabaseSyncJobScheduleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dailyTimes = request.dailyTimes;
            this.intervalMinutes = request.intervalMinutes;
            this.jobId = request.jobId;
            this.missedPolicy = request.missedPolicy;
            this.type = request.type;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DailyTimes.
         */
        public Builder dailyTimes(java.util.List<String> dailyTimes) {
            String dailyTimesShrink = shrink(dailyTimes, "DailyTimes", "json");
            this.putQueryParameter("DailyTimes", dailyTimesShrink);
            this.dailyTimes = dailyTimes;
            return this;
        }

        /**
         * IntervalMinutes.
         */
        public Builder intervalMinutes(Integer intervalMinutes) {
            this.putQueryParameter("IntervalMinutes", intervalMinutes);
            this.intervalMinutes = intervalMinutes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * MissedPolicy.
         */
        public Builder missedPolicy(String missedPolicy) {
            this.putQueryParameter("MissedPolicy", missedPolicy);
            this.missedPolicy = missedPolicy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>daily-times</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-as1llqmkol****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateContextDatabaseSyncJobScheduleRequest build() {
            return new UpdateContextDatabaseSyncJobScheduleRequest(this);
        } 

    } 

}
