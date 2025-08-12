// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeAlertHistoryListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertHistoryListRequest</p>
 */
public class DescribeAlertHistoryListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ascending")
    private Boolean ascending;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
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
         * <p>The order of alerts. Valid values:</p>
         * <ul>
         * <li>true (default value): reverse chronological order</li>
         * <li>false: chronological order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ascending(Boolean ascending) {
            this.putQueryParameter("Ascending", ascending);
            this.ascending = ascending;
            return this;
        }

        /**
         * <p>The end timestamp of the historical alerts that you want to query.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640608200000</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the application group.</p>
         * <p>For information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>7671****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The metric that is used to monitor the cloud service.</p>
         * <p>For information about how to query the name of a metric, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The namespace of the cloud service.</p>
         * <p>For information about how to query the namespace of a cloud service, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the alert rule.</p>
         * <p>For information about how to obtain the ID of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>applyTemplate61dc81b5-d357-4cf6-a9b7-9f83c1d5****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The name of the alert rule.</p>
         * <p>For information about how to query the name of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Rule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The start timestamp of the historical alerts that you want to query.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640237400000</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the alert. Valid values:</p>
         * <ul>
         * <li>ALARM (default value): Alerts are triggered.</li>
         * <li>OK: No alerts are triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALARM</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * <p>Specifies whether alerts are muted. Valid values:</p>
         * <ul>
         * <li>2 (default value): Alerts are muted and are not triggered within the mute period, even if the condition specified in the alert rule is met.</li>
         * <li>0: Alerts are triggered or cleared.</li>
         * <li>1: The alert rule is ineffective.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
