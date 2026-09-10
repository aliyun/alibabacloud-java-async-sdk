// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateCronJobPolicyServerlessResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCronJobPolicyServerlessResponseBody</p>
 */
public class CreateCronJobPolicyServerlessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("CronExpression")
    private String cronExpression;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateCronJobPolicyServerlessResponseBody(Builder builder) {
        this.action = builder.action;
        this.cronExpression = builder.cronExpression;
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.jobId = builder.jobId;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCronJobPolicyServerlessResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String action; 
        private String cronExpression; 
        private String DBClusterId; 
        private String endTime; 
        private String jobId; 
        private String regionId; 
        private String requestId; 
        private String startTime; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateCronJobPolicyServerlessResponseBody model) {
            this.action = model.action;
            this.cronExpression = model.cronExpression;
            this.DBClusterId = model.DBClusterId;
            this.endTime = model.endTime;
            this.jobId = model.jobId;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.status = model.status;
        } 

        /**
         * <p>The action of the scheduled task. The value is fixed as <code>ModifyDBClusterServerlessConf</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ModifyDBClusterServerlessConf</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * <p>The Cron expression.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 8 * * ?</p>
         */
        public Builder cronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end time of the task. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-07T04:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>1fa3c0e7-b568-4f41-b703-463c96a91bd8</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>45D24263-7E3A-4140-9472-************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the task. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-01T00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><p><code>working</code>: The scheduled task is running.</p>
         * </li>
         * <li><p><code>finish</code>: The scheduled task is complete.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>working</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateCronJobPolicyServerlessResponseBody build() {
            return new CreateCronJobPolicyServerlessResponseBody(this);
        } 

    } 

}
