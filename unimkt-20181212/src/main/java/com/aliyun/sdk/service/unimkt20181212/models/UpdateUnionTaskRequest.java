// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.unimkt20181212.models;

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
 * {@link UpdateUnionTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateUnionTaskRequest</p>
 */
public class UpdateUnionTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargePloy")
    private Integer chargePloy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OptimizationSwitch")
    private Integer optimizationSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long proxyUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quota")
    private Integer quota;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaDay")
    private Integer quotaDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private UpdateUnionTaskRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.chargePloy = builder.chargePloy;
        this.endTime = builder.endTime;
        this.optimizationSwitch = builder.optimizationSwitch;
        this.proxyUserId = builder.proxyUserId;
        this.quota = builder.quota;
        this.quotaDay = builder.quotaDay;
        this.startTime = builder.startTime;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUnionTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return chargePloy
     */
    public Integer getChargePloy() {
        return this.chargePloy;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return optimizationSwitch
     */
    public Integer getOptimizationSwitch() {
        return this.optimizationSwitch;
    }

    /**
     * @return proxyUserId
     */
    public Long getProxyUserId() {
        return this.proxyUserId;
    }

    /**
     * @return quota
     */
    public Integer getQuota() {
        return this.quota;
    }

    /**
     * @return quotaDay
     */
    public Integer getQuotaDay() {
        return this.quotaDay;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<UpdateUnionTaskRequest, Builder> {
        private String channelId; 
        private Integer chargePloy; 
        private String endTime; 
        private Integer optimizationSwitch; 
        private Long proxyUserId; 
        private Integer quota; 
        private Integer quotaDay; 
        private String startTime; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUnionTaskRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.chargePloy = request.chargePloy;
            this.endTime = request.endTime;
            this.optimizationSwitch = request.optimizationSwitch;
            this.proxyUserId = request.proxyUserId;
            this.quota = request.quota;
            this.quotaDay = request.quotaDay;
            this.startTime = request.startTime;
            this.taskId = request.taskId;
        } 

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * ChargePloy.
         */
        public Builder chargePloy(Integer chargePloy) {
            this.putQueryParameter("ChargePloy", chargePloy);
            this.chargePloy = chargePloy;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * OptimizationSwitch.
         */
        public Builder optimizationSwitch(Integer optimizationSwitch) {
            this.putQueryParameter("OptimizationSwitch", optimizationSwitch);
            this.optimizationSwitch = optimizationSwitch;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        public Builder proxyUserId(Long proxyUserId) {
            this.putQueryParameter("ProxyUserId", proxyUserId);
            this.proxyUserId = proxyUserId;
            return this;
        }

        /**
         * Quota.
         */
        public Builder quota(Integer quota) {
            this.putQueryParameter("Quota", quota);
            this.quota = quota;
            return this;
        }

        /**
         * QuotaDay.
         */
        public Builder quotaDay(Integer quotaDay) {
            this.putQueryParameter("QuotaDay", quotaDay);
            this.quotaDay = quotaDay;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1687154040871094</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public UpdateUnionTaskRequest build() {
            return new UpdateUnionTaskRequest(this);
        } 

    } 

}
