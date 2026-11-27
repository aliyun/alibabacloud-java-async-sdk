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
         * <p>The end time for a time-series query, exclusive. Specify a UTC time in whole seconds, which must be later than startTime. You can query data for up to 7 days at a time. The time range must include at least one time point aligned with period, and these time points cannot be later than the current time.</p>
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
         * <p>For example, grouping by teamID allows you to view the metrics of each team separately. You can combine up to four different grouping keys. The available keys vary by metric. If not specified, the overall results for the query scope are returned.</p>
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
         * <p>Specifies 1 to 16 different metric names in each request. For available metrics and their applicable scopes, see the monitoring metrics folder.</p>
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
         * <p>Required for both single-point and time-series queries. In a time-series query, this parameter specifies the interval between adjacent data points in seconds. Valid values: 60, 300, 900, 1800, 3600, and 86400.</p>
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
         * <p>The ID of the sandbox to query. You must also specify the teamID and templateID to which the sandbox belongs, and select a metric that supports querying by sandbox.</p>
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
         * <p>Queries the number of sandboxes by sandbox edition. This parameter applies only to sandboxCount. Valid values: eco, std, pro, and ent.</p>
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
         * <p>The start time for a time-series query, inclusive. Specify a UTC time accurate to seconds as shown in the example, and also specify endTime.</p>
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
         * <p>Required when you query by team. If omitted, the metrics of the current account are queried. Account quotas and team quotas must be queried separately.</p>
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
         * <p>The point in time for a single-point query. Specify the current or a past UTC time, accurate to seconds. If time, startTime, and endTime are omitted, the current time is queried.</p>
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
