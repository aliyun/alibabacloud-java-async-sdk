// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link GetMetricDataRequest} extends {@link RequestModel}
 *
 * <p>GetMetricDataRequest</p>
 */
public class GetMetricDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupBy")
    private java.util.List<String> groupBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("metricNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> metricNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("period")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sandboxID")
    private String sandboxID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sandboxPlan")
    private String sandboxPlan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private GetMetricDataRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.groupBy = builder.groupBy;
        this.metricNames = builder.metricNames;
        this.period = builder.period;
        this.sandboxID = builder.sandboxID;
        this.sandboxPlan = builder.sandboxPlan;
        this.startTime = builder.startTime;
        this.teamID = builder.teamID;
        this.templateID = builder.templateID;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetricDataRequest create() {
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
     * @return groupBy
     */
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return metricNames
     */
    public java.util.List<String> getMetricNames() {
        return this.metricNames;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return sandboxID
     */
    public String getSandboxID() {
        return this.sandboxID;
    }

    /**
     * @return sandboxPlan
     */
    public String getSandboxPlan() {
        return this.sandboxPlan;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder extends Request.Builder<GetMetricDataRequest, Builder> {
        private String endTime; 
        private java.util.List<String> groupBy; 
        private java.util.List<String> metricNames; 
        private Integer period; 
        private String sandboxID; 
        private String sandboxPlan; 
        private String startTime; 
        private String teamID; 
        private String templateID; 
        private String time; 

        private Builder() {
            super();
        } 

        private Builder(GetMetricDataRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.groupBy = request.groupBy;
            this.metricNames = request.metricNames;
            this.period = request.period;
            this.sandboxID = request.sandboxID;
            this.sandboxPlan = request.sandboxPlan;
            this.startTime = request.startTime;
            this.teamID = request.teamID;
            this.templateID = request.templateID;
            this.time = request.time;
        } 

        /**
         * <p>The end time of the time series query. This time is exclusive. Specify a UTC time accurate to seconds. The end time must be later than the start time. You can query metrics for a maximum of 7 days at a time. The time range must include at least one time point aligned with the period, and these time points cannot be later than the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T00:02:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Groups metrics by a specific key. For example, you can group metrics by teamID to view the metrics of each team separately. You can combine up to four different grouping keys. The available keys vary by metric. If you do not specify this parameter, the overall results within the query scope are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;teamID&quot;]</p>
         */
        public Builder groupBy(java.util.List<String> groupBy) {
            String groupByShrink = shrink(groupBy, "groupBy", "json");
            this.putQueryParameter("groupBy", groupByShrink);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * <p>The names of the metrics to query. You can query 1 to 16 different metrics at a time. For available metrics and query scopes, refer to the metric catalog.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;cpuUsedCores&quot;]</p>
         */
        public Builder metricNames(java.util.List<String> metricNames) {
            String metricNamesShrink = shrink(metricNames, "metricNames", "json");
            this.putQueryParameter("metricNames", metricNamesShrink);
            this.metricNames = metricNames;
            return this;
        }

        /**
         * <p>The time interval for time series queries, in seconds. Valid values: 60, 300, 900, 1800, 3600, and 86400. A value of 60 corresponds to exact minutes, and 86400 corresponds to 00:00:00 UTC every day. The calculation duration of some statistical metrics varies with the interval.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The ID of the sandbox to query. You must also specify the teamID and templateID to which the sandbox belongs, and select a metric that supports sandbox-level queries.</p>
         * 
         * <strong>example:</strong>
         * <p>sbx-62105527-699e-48df-ad3b-7425001ae4f2</p>
         */
        public Builder sandboxID(String sandboxID) {
            this.putQueryParameter("sandboxID", sandboxID);
            this.sandboxID = sandboxID;
            return this;
        }

        /**
         * <p>Queries the number of sandboxes by sandbox plan. This parameter applies only to the sandboxCount metric. Valid values: eco, std, pro, and ent.</p>
         * 
         * <strong>example:</strong>
         * <p>pro</p>
         */
        public Builder sandboxPlan(String sandboxPlan) {
            this.putQueryParameter("sandboxPlan", sandboxPlan);
            this.sandboxPlan = sandboxPlan;
            return this;
        }

        /**
         * <p>The start time of the time series query. This time is inclusive. Specify a UTC time accurate to seconds, and also specify the endTime parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The ID of the team to query. If you leave this parameter empty, the metrics of the current account are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>70d1c834-0333-58d8-97ac-5336eb9179eb</p>
         */
        public Builder teamID(String teamID) {
            this.putQueryParameter("teamID", teamID);
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The ID of the template to query. You must also specify the teamID to which the template belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>4hrtmghh2nzrsdh6yr65</p>
         */
        public Builder templateID(String templateID) {
            this.putQueryParameter("templateID", templateID);
            this.templateID = templateID;
            return this;
        }

        /**
         * <p>The specific point in time to query. If you query metrics at a specific point in time, specify only this parameter. Specify a current or past UTC time accurate to seconds. If you omit all time parameters, the metrics at the current time are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T00:01:00Z</p>
         */
        public Builder time(String time) {
            this.putQueryParameter("time", time);
            this.time = time;
            return this;
        }

        @Override
        public GetMetricDataRequest build() {
            return new GetMetricDataRequest(this);
        } 

    } 

}
