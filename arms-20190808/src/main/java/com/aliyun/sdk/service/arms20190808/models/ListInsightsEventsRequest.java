// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInsightsEventsRequest} extends {@link RequestModel}
 *
 * <p>ListInsightsEventsRequest</p>
 */
public class ListInsightsEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InsightsTypes")
    private String insightsTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private ListInsightsEventsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.insightsTypes = builder.insightsTypes;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInsightsEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return insightsTypes
     */
    public String getInsightsTypes() {
        return this.insightsTypes;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListInsightsEventsRequest, Builder> {
        private String endTime; 
        private String insightsTypes; 
        private String pid; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListInsightsEventsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.insightsTypes = request.insightsTypes;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end of the time range to query. The value is a timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1480607940000</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The types of the events that you want to query. Separate multiple event types with commas (,). If you do not specify this parameter, all events are queried.</p>
         * <ul>
         * <li>errorIncrease: API error-rate spike events. Examples: HTTP API error-rate spike events and Dubbo API error-rate spike events.</li>
         * <li>topErrorIncrease: the top five API error-rate spike events with the highest traffic.</li>
         * <li>topRtIncrease: API response-time spike events. Examples: HTTP API response-time spike events and Dubbo API response-time spike events.</li>
         * <li>rtIncrease: the top five API response-time spike events with the highest traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>errorIncrease,topErrorIncrease,topExceptionIncrease,topRtIncrease,rtIncrease</p>
         */
        public Builder insightsTypes(String insightsTypes) {
            this.putQueryParameter("InsightsTypes", insightsTypes);
            this.insightsTypes = insightsTypes;
            return this;
        }

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>aokcdqn3ly@a195c6d6421****</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The start of the time range to query. The value is a timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1595174400000</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListInsightsEventsRequest build() {
            return new ListInsightsEventsRequest(this);
        } 

    } 

}
