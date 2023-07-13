// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertHistoryListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertHistoryListRequest</p>
 */
public class DescribeAlertHistoryListRequest extends Request {
    @Query
    @NameInMap("Ascending")
    private Boolean ascending;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("MetricName")
    private String metricName;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("Page")
    private Integer page;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RuleId")
    private String ruleId;

    @Query
    @NameInMap("RuleName")
    private String ruleName;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("State")
    private String state;

    @Query
    @NameInMap("Status")
    private String status;

    private DescribeAlertHistoryListRequest(Builder builder) {
        super(builder);
        this.ascending = builder.ascending;
        this.endTime = builder.endTime;
        this.groupId = builder.groupId;
        this.metricName = builder.metricName;
        this.namespace = builder.namespace;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.startTime = builder.startTime;
        this.state = builder.state;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertHistoryListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ascending
     */
    public Boolean getAscending() {
        return this.ascending;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeAlertHistoryListRequest, Builder> {
        private Boolean ascending; 
        private String endTime; 
        private String groupId; 
        private String metricName; 
        private String namespace; 
        private Integer page; 
        private Integer pageSize; 
        private String ruleId; 
        private String ruleName; 
        private String startTime; 
        private String state; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertHistoryListRequest request) {
            super(request);
            this.ascending = request.ascending;
            this.endTime = request.endTime;
            this.groupId = request.groupId;
            this.metricName = request.metricName;
            this.namespace = request.namespace;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.startTime = request.startTime;
            this.state = request.state;
            this.status = request.status;
        } 

        /**
         * The order of alerts. Valid values:
         * <p>
         * 
         * *   true (default value): reverse chronological order
         * *   false: chronological order
         */
        public Builder ascending(Boolean ascending) {
            this.putQueryParameter("Ascending", ascending);
            this.ascending = ascending;
            return this;
        }

        /**
         * The end timestamp of the historical alerts that you want to query.
         * <p>
         * 
         * Unit: milliseconds.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the application group.
         * <p>
         * 
         * For information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The metric that is used to monitor the cloud service.
         * <p>
         * 
         * For information about how to query the name of a metric, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The namespace of the cloud service.
         * <p>
         * 
         * For information about how to query the namespace of a cloud service, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the alert rule.
         * <p>
         * 
         * For information about how to obtain the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The name of the alert rule.
         * <p>
         * 
         * For information about how to query the name of an alert rule, see [DescribeMetricRuleList](~~114941~~).
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The start timestamp of the historical alerts that you want to query.
         * <p>
         * 
         * Unit: milliseconds.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The status of the alert. Valid values:
         * <p>
         * 
         * *   ALARM (default value): Alerts are triggered.
         * *   OK: No alerts are triggered.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * Specifies whether alerts are muted. Valid values:
         * <p>
         * 
         * *   2 (default value): Alerts are muted and are not triggered within the mute period, even if the condition specified in the alert rule is met.
         * *   0: Alerts are triggered or cleared.
         * *   1: The alert rule is ineffective.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeAlertHistoryListRequest build() {
            return new DescribeAlertHistoryListRequest(this);
        } 

    } 

}
