// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link ListAlarmEventRequest} extends {@link RequestModel}
 *
 * <p>ListAlarmEventRequest</p>
 */
public class ListAlarmEventRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmChannel")
    private String alarmChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmStatus")
    private String alarmStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmType")
    private String alarmType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobName")
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private String pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reverse")
    private Boolean reverse;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private ListAlarmEventRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alarmChannel = builder.alarmChannel;
        this.alarmStatus = builder.alarmStatus;
        this.alarmType = builder.alarmType;
        this.appName = builder.appName;
        this.clusterId = builder.clusterId;
        this.endTime = builder.endTime;
        this.jobName = builder.jobName;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.reverse = builder.reverse;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlarmEventRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return alarmChannel
     */
    public String getAlarmChannel() {
        return this.alarmChannel;
    }

    /**
     * @return alarmStatus
     */
    public String getAlarmStatus() {
        return this.alarmStatus;
    }

    /**
     * @return alarmType
     */
    public String getAlarmType() {
        return this.alarmType;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return pageNum
     */
    public String getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListAlarmEventRequest, Builder> {
        private String regionId; 
        private String alarmChannel; 
        private String alarmStatus; 
        private String alarmType; 
        private String appName; 
        private String clusterId; 
        private Long endTime; 
        private String jobName; 
        private String pageNum; 
        private String pageSize; 
        private Boolean reverse; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAlarmEventRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alarmChannel = request.alarmChannel;
            this.alarmStatus = request.alarmStatus;
            this.alarmType = request.alarmType;
            this.appName = request.appName;
            this.clusterId = request.clusterId;
            this.endTime = request.endTime;
            this.jobName = request.jobName;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.reverse = request.reverse;
            this.startTime = request.startTime;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The channel for sending alarm notifications. Valid values:</p>
         * <ul>
         * <li><p><code>sms</code>: SMS</p>
         * </li>
         * <li><p><code>mail</code>: Email</p>
         * </li>
         * <li><p><code>phone</code>: Phone call</p>
         * </li>
         * <li><p><code>webhook</code>: Webhook</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>webhook</p>
         */
        public Builder alarmChannel(String alarmChannel) {
            this.putQueryParameter("AlarmChannel", alarmChannel);
            this.alarmChannel = alarmChannel;
            return this;
        }

        /**
         * <p>The delivery status of the alarm notification. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The notification delivery succeeded.</p>
         * </li>
         * <li><p><code>false</code>: The notification delivery failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder alarmStatus(String alarmStatus) {
            this.putQueryParameter("AlarmStatus", alarmStatus);
            this.alarmStatus = alarmStatus;
            return this;
        }

        /**
         * <p>The type of the alarm. Valid values:</p>
         * <ul>
         * <li><p><strong><code>schedulerx3_no_designate_machine_alarm</code></strong>: The Designated Machine is unavailable.</p>
         * </li>
         * <li><p><strong><code>schedulerx3_all_busy_alarm</code></strong>: All available machines are busy.</p>
         * </li>
         * <li><p><strong><code>schedulerx3_no_machine_alarm</code></strong>: No machines are available to run the job.</p>
         * </li>
         * <li><p><strong><code>schedulerx3_timeout_alarm</code></strong>: The job timed out.</p>
         * </li>
         * <li><p><strong><code>schedulerx3_fail_alarm</code></strong>: The job failed to run.</p>
         * </li>
         * <li><p><strong><code>schedulerx3_job_success_notice</code></strong>: The job ran successfully.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>schedulerx3_fail_alarm</p>
         */
        public Builder alarmType(String alarmType) {
            this.putQueryParameter("AlarmType", alarmType);
            this.alarmType = alarmType;
            return this;
        }

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-b6ec1xxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The end of the time range for querying events. This value is a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1731636011558</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>test-job</p>
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(String pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Set to true to return results in descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * <p>The start of the time range for querying events. This value is a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1690419316000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListAlarmEventRequest build() {
            return new ListAlarmEventRequest(this);
        } 

    } 

}
