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
         * <p>The end time of the statistics. The parameter value must be a UNIX timestamp in milliseconds. It indicates the number of milliseconds that have elapsed since 00:00:00 UTC on January 1, 1970. The following limits apply:</p>
         * <ol>
         * <li><p>Time range: You can query data by hour for up to 7 days or by day for up to 180 days.</p>
         * </li>
         * <li><p>Alignment with time granularity: If you query data by hour, the minutes, seconds, and milliseconds must be 0. If you query data by day, the hours, minutes, seconds, and milliseconds must be 0. If the specified timestamp is not aligned with the time granularity, the system automatically rounds it up to the next valid time.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>1582103299434</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12f407b22cbe4890ac595f09985848d5</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>891264b9-5883-4068-94a6-241ceb8d51e4</p>
         */
        public Builder scriptId(String scriptId) {
            this.putBodyParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>The start time of the statistics. The parameter value is a UNIX timestamp in milliseconds. It indicates the number of milliseconds that have elapsed since 00:00:00 UTC on January 1, 1970. The following limits apply:</p>
         * <ol>
         * <li><p>Valid start time: You can query data collected within the last 365 days from the current date.</p>
         * </li>
         * <li><p>Alignment with time granularity: If you query data by hour, the minutes, seconds, and milliseconds must be 0. If you query data by day, the hours, minutes, seconds, and milliseconds must be 0.</p>
         * </li>
         * <li><p>If the specified timestamp is not aligned with the time granularity, the system automatically rounds it up to the next valid time.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>1582267398628</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The time interval.</p>
         * 
         * <strong>example:</strong>
         * <p>1d</p>
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
