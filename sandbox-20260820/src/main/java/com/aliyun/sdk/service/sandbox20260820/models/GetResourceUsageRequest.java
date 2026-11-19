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
 * {@link GetResourceUsageRequest} extends {@link RequestModel}
 *
 * <p>GetResourceUsageRequest</p>
 */
public class GetResourceUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("granularity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String granularity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupBy")
    private java.util.List<String> groupBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sandboxPlan")
    private String sandboxPlan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("usageNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> usageNames;

    private GetResourceUsageRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.granularity = builder.granularity;
        this.groupBy = builder.groupBy;
        this.sandboxPlan = builder.sandboxPlan;
        this.startTime = builder.startTime;
        this.teamID = builder.teamID;
        this.templateID = builder.templateID;
        this.usageNames = builder.usageNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceUsageRequest create() {
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
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return groupBy
     */
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
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
     * @return usageNames
     */
    public java.util.List<String> getUsageNames() {
        return this.usageNames;
    }

    public static final class Builder extends Request.Builder<GetResourceUsageRequest, Builder> {
        private String endTime; 
        private String granularity; 
        private java.util.List<String> groupBy; 
        private String sandboxPlan; 
        private String startTime; 
        private String teamID; 
        private String templateID; 
        private java.util.List<String> usageNames; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceUsageRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.granularity = request.granularity;
            this.groupBy = request.groupBy;
            this.sandboxPlan = request.sandboxPlan;
            this.startTime = request.startTime;
            this.teamID = request.teamID;
            this.templateID = request.templateID;
            this.usageNames = request.usageNames;
        } 

        /**
         * <p>The end time of the query. This time is exclusive. Specify the time on the hour in UTC. The latest allowed time is the start of the current hour. You can query data for a maximum of 7 days at a time. The end time must be later than the start time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T02:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The granularity at which usage data is aggregated. Valid values:</p>
         * <ul>
         * <li>All: Aggregates the cumulative usage over the entire query period.</li>
         * <li>Hour: Aggregates the usage by hour.</li>
         * <li>Day: Aggregates the usage every 24 hours starting from the startTime. The last period may be less than 24 hours.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hour</p>
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * <p>The keys used to group the results. You can specify any combination of teamID, templateID, and sandboxPlan. Each key can be specified only once. If you do not specify this parameter, the results are aggregated over the entire query scope.</p>
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
         * <p>The sandbox edition to query. Valid values: eco, std, pro, and ent.</p>
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
         * <p>The start time of the query. This time is inclusive. Specify the time on the hour in UTC, such as 00:00 UTC.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the team to query. If you do not specify this parameter, the usage of the current account is queried.</p>
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
         * <p>The usage items to query. You can specify 1 to 6 different usage items in a single request. CPU usage items include cpuActive and cpuIdle. Memory usage items include memoryActive and memoryIdle. Disk usage items include disk and diskDeepSleep. The disk item includes the usage of deep sleep disks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;cpuActive&quot;]</p>
         */
        public Builder usageNames(java.util.List<String> usageNames) {
            String usageNamesShrink = shrink(usageNames, "usageNames", "json");
            this.putQueryParameter("usageNames", usageNamesShrink);
            this.usageNames = usageNames;
            return this;
        }

        @Override
        public GetResourceUsageRequest build() {
            return new GetResourceUsageRequest(this);
        } 

    } 

}
