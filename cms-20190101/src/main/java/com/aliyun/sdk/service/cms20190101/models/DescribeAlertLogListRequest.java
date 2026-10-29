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
 * {@link DescribeAlertLogListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertLogListRequest</p>
 */
public class DescribeAlertLogListRequest extends Request {
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

    private DescribeAlertLogListRequest(Builder builder) {
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

    public static DescribeAlertLogListRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAlertLogListRequest, Builder> {
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

        private Builder(DescribeAlertLogListRequest request) {
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
         * <p>The alert contact group.</p>
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
         * <p>The end of the time range to query the alert history.</p>
         * <p>Unit: milliseconds.</p>
         * <p>You can query only the alert history within the last year. If the query time range exceeds one year, the return value of the <code>AlertLogList</code> parameter is empty.</p>
         * <blockquote>
         * <p>The interval between the start time (<code>StartTime</code>) and end time (<code>EndTime</code>) must be less than or equal to 15 days. Both parameters must be specified or unspecified at the same time. If they are not specified, the alert history within the last 15 minutes is queried by default.</p>
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
         * <p>The alert type. Valid values:</p>
         * <ul>
         * <li><p>TRIGGERED: The alert is triggered.</p>
         * </li>
         * <li><p>RESOLVED: The alert is cleared.</p>
         * </li>
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
         * <p>The spatial dimension by which the data is aggregated, which is equivalent to Group By in SQL. Valid values:</p>
         * <ul>
         * <li><code>product</code>: aggregates data by cloud service.</li>
         * <li><code>level</code>: aggregates data by alert level.</li>
         * <li><code>groupId</code>: aggregates data by application group.</li>
         * <li><code>contactGroup</code>: aggregates data by alert contact group.</li>
         * <li><code>product,metricName</code>: aggregates data by cloud service and metric.</li>
         * </ul>
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
         * <p>The interval at which logs are obtained. Unit: minutes.</p>
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
         * <p>The alert level and notification methods. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;- P2: phone calls, text messages, emails, and DingTalk chatbots.</p>
         * <p>&lt;props=&quot;china&quot;&gt;- P3: text messages, emails, and DingTalk chatbots.</p>
         * <p>&lt;props=&quot;china&quot;&gt;- P4: emails and DingTalk chatbots.</p>
         * <p>&lt;props=&quot;china&quot;&gt;- OK: no alerts.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;- P4: emails and DingTalk chatbots.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;- OK: no alerts.</p>
         * <p>&lt;props=&quot;partner&quot;&gt;- P4: emails and DingTalk chatbots.</p>
         * <p>&lt;props=&quot;partner&quot;&gt;- OK: no alerts.</p>
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
         * <p>For more information about the metrics of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Metrics</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>IntranetInRate</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The namespace of the cloud service.</p>
         * <blockquote>
         * <p>For more information about the namespaces of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Metrics</a>.</p>
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
         * <p>The page number.</p>
         * <p>Default value: 1.</p>
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
         * <p>The number of entries per page.</p>
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
         * <p>The abbreviation of the cloud service name.</p>
         * <p>For more information about how to obtain the abbreviation of a cloud service name, see <a href="https://help.aliyun.com/document_detail/114930.html">DescribeProductsOfActiveMetricRule</a>.</p>
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
         * <p>For more information about how to query the ID of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>bc369e8_30f87e517ed2fc****</p>
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
         * <p>The keyword used to query the alert history.</p>
         * 
         * <strong>example:</strong>
         * <p>alert</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * <p>The alert status. Valid values:</p>
         * <ul>
         * <li>0: An alert is triggered or cleared.</li>
         * <li>1: The current time is not within the effective period of the alert.</li>
         * <li>2: The current time is within the channel silence period.</li>
         * <li>3: The host is being restarted.</li>
         * <li>4: No alerts are sent.</li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;When the alert status is 0, an alert is triggered if Level is set to P2, P3, or P4; the alert is cleared if Level is set to OK.
         * &lt;props=&quot;intl&quot;&gt;When the alert status is 0, an alert is triggered if Level is set to P4; the alert is cleared if Level is set to OK.
         * &lt;props=&quot;partner&quot;&gt;When the alert status is 0, an alert is triggered if Level is set to P4; the alert is cleared if Level is set to OK.</p>
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
         * <p>The type of the alert rule. Valid value: METRIC, which indicates a time series metric alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>METRIC</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The beginning of the time range to query the alert history.</p>
         * <p>Unit: milliseconds.</p>
         * <p>You can query only the alert history within the last year. If the query time range exceeds one year, the return value of the <code>AlertLogList</code> parameter is empty.</p>
         * <blockquote>
         * <p>The interval between the start time (<code>StartTime</code>) and end time (<code>EndTime</code>) must be less than or equal to 15 days. Both parameters must be specified or unspecified at the same time. If they are not specified, the alert history within the last 15 minutes is queried by default.</p>
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
        public DescribeAlertLogListRequest build() {
            return new DescribeAlertLogListRequest(this);
        } 

    } 

}
