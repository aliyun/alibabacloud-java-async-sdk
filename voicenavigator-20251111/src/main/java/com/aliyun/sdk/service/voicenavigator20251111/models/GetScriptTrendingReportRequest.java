// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link GetScriptTrendingReportRequest} extends {@link RequestModel}
 *
 * <p>GetScriptTrendingReportRequest</p>
 */
public class GetScriptTrendingReportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeInterval")
    private String timeInterval;

    private GetScriptTrendingReportRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.scriptId = builder.scriptId;
        this.startTime = builder.startTime;
        this.timeInterval = builder.timeInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScriptTrendingReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeInterval
     */
    public String getTimeInterval() {
        return this.timeInterval;
    }

    public static final class Builder extends Request.Builder<GetScriptTrendingReportRequest, Builder> {
        private Long endTime; 
        private String instanceId; 
        private String scriptId; 
        private Long startTime; 
        private String timeInterval; 

        private Builder() {
            super();
        } 

        private Builder(GetScriptTrendingReportRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.scriptId = request.scriptId;
            this.startTime = request.startTime;
            this.timeInterval = request.timeInterval;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putBodyParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TimeInterval.
         */
        public Builder timeInterval(String timeInterval) {
            this.putBodyParameter("TimeInterval", timeInterval);
            this.timeInterval = timeInterval;
            return this;
        }

        @Override
        public GetScriptTrendingReportRequest build() {
            return new GetScriptTrendingReportRequest(this);
        } 

    } 

}
