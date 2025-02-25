// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAlertLogCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertLogCountRequest</p>
 */
public class DescribeAlertLogCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroup")
    private String contactGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupBy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastMin")
    private String lastMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendStatus")
    private String sendStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeAlertLogCountRequest(Builder builder) {
        super(builder);
        this.contactGroup = builder.contactGroup;
        this.endTime = builder.endTime;
        this.eventType = builder.eventType;
        this.groupBy = builder.groupBy;
        this.groupId = builder.groupId;
        this.lastMin = builder.lastMin;
        this.level = builder.level;
        this.metricName = builder.metricName;
        this.namespace = builder.namespace;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.product = builder.product;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.searchKey = builder.searchKey;
        this.sendStatus = builder.sendStatus;
        this.sourceType = builder.sourceType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertLogCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroup
     */
    public String getContactGroup() {
        return this.contactGroup;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return lastMin
     */
    public String getLastMin() {
        return this.lastMin;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
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
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return sendStatus
     */
    public String getSendStatus() {
        return this.sendStatus;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeAlertLogCountRequest, Builder> {
        private String contactGroup; 
        private Long endTime; 
        private String eventType; 
        private String groupBy; 
        private String groupId; 
        private String lastMin; 
        private String level; 
        private String metricName; 
        private String namespace; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String product; 
        private String ruleId; 
        private String ruleName; 
        private String searchKey; 
        private String sendStatus; 
        private String sourceType; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertLogCountRequest request) {
            super(request);
            this.contactGroup = request.contactGroup;
            this.endTime = request.endTime;
            this.eventType = request.eventType;
            this.groupBy = request.groupBy;
            this.groupId = request.groupId;
            this.lastMin = request.lastMin;
            this.level = request.level;
            this.metricName = request.metricName;
            this.namespace = request.namespace;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.product = request.product;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.searchKey = request.searchKey;
            this.sendStatus = request.sendStatus;
            this.sourceType = request.sourceType;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The alert group.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Group</p>
         */
        public Builder contactGroup(String contactGroup) {
            this.putQueryParameter("ContactGroup", contactGroup);
            this.contactGroup = contactGroup;
            return this;
        }

        /**
         * <p>The end timestamp of the alert logs to be queried.</p>
         * <p>Unit: milliseconds.</p>
         * <p>You can query only the alert logs within the last year. If the query time is longer than one year, the return value of the <code>AlertLogCount</code> parameter is empty.</p>
         * <blockquote>
         * <p> The interval between the start time (StartTime) and end time (EndTime) must be less than or equal to 15 days. The start time and end time must be specified or left empty at the same time. If you do not specify the start time and end time, the alert logs within the last 15 minutes are queried by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1610074409694</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The type of the alert event. Valid values:</p>
         * <ul>
         * <li>TRIGGERED: The alert is triggered.</li>
         * <li>RESOLVED: The alert is resolved.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TRIGGERED</p>
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The dimension based on which data is aggregated. This parameter is similar to the Group By clause of SQL statements. Valid values:</p>
         * <ul>
         * <li><code>product</code>: aggregates data by cloud service.</li>
         * <li><code>level</code>: aggregates data by alert level.</li>
         * <li><code>groupId</code>: aggregates data by application group.</li>
         * <li><code>contactGroup</code>: aggregates data by alert group.</li>
         * <li><code>product,metricName</code>: aggregates data both by cloud service and by metric.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        public Builder groupBy(String groupBy) {
            this.putQueryParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * <p>The ID of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>7301****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The statistical period of alert logs. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>360</p>
         */
        public Builder lastMin(String lastMin) {
            this.putQueryParameter("LastMin", lastMin);
            this.lastMin = lastMin;
            return this;
        }

        /**
         * <p>The level and notification method of the alert. Valid values:</p>
         * <ul>
         * <li>P4: Alert notifications are sent by using emails and DingTalk chatbots.</li>
         * <li>OK: No alert is generated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>P4</p>
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The name of the metric.</p>
         * <blockquote>
         * <p> For more information about the metrics of different cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * </blockquote>
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
         * <blockquote>
         * <p> For more information about the namespaces of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * </blockquote>
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
         * <p>The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL. Valid values:</p>
         * <ul>
         * <li><code>product</code>: aggregates data by cloud service.</li>
         * <li><code>level</code>: aggregates data by alert level.</li>
         * <li><code>groupId</code>: aggregates data by application group.</li>
         * <li><code>contactGroup</code>: aggregates data by alert contact group.</li>
         * <li><code>product,metricName</code>: aggregates data both by cloud service and by metric.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 10.</p>
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
         * <p>The abbreviation of the service name.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * <p>The ID of the alert rule.</p>
         * <p>For more information about how to obtain the ID of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>bfae2ca5b4e07d2c7278772e***********</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The name of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The keyword based on which the alert logs to be counted are searched.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * <p>The status of the alert. Valid values:</p>
         * <ul>
         * <li>0: The alert is triggered or cleared.</li>
         * <li>1: The alert is generated not during the effective period.</li>
         * <li>2: The alert is muted and not triggered in a specified period.</li>
         * <li>3: The host is restarting.</li>
         * <li>4: Notifications are not sent for the alert.</li>
         * </ul>
         * <p>When the value of the SendStatus parameter is 0, the value P4 of the Level parameter indicates a triggered alert and the value OK indicates a cleared alert.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder sendStatus(String sendStatus) {
            this.putQueryParameter("SendStatus", sendStatus);
            this.sendStatus = sendStatus;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The start timestamp of the alert logs to be queried.</p>
         * <p>Unit: milliseconds.</p>
         * <p>You can query only the alert logs within the last year. If the query time is longer than one year, the return value of the <code>AlertLogCount</code> parameter is empty.</p>
         * <blockquote>
         * <p> The interval between the start time (StartTime) and end time (EndTime) must be less than or equal to 15 days. The start time and end time must be specified or left empty at the same time. If you do not specify the start time and end time, the alert logs within the last 15 minutes are queried by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1609988009694</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeAlertLogCountRequest build() {
            return new DescribeAlertLogCountRequest(this);
        } 

    } 

}
