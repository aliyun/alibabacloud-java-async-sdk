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
 * {@link DescribeAlertLogHistogramRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertLogHistogramRequest</p>
 */
public class DescribeAlertLogHistogramRequest extends Request {
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
    @Deprecated
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeAlertLogHistogramRequest(Builder builder) {
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

    public static DescribeAlertLogHistogramRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAlertLogHistogramRequest, Builder> {
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

        private Builder(DescribeAlertLogHistogramRequest request) {
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
         * <p>The end timestamp for querying alert history.</p>
         * <p>Unit: milliseconds.</p>
         * <blockquote>
         * <ul>
         * <li>You can query only the alert history within the last year.</li>
         * <li>The interval between the start time (StartTime) and end time (EndTime) must be less than or equal to 15 days.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1609989009694</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The alert type. Valid values:</p>
         * <ul>
         * <li>TRIGGERED: The alert is triggered.</li>
         * <li>RESOLVED: The alert recovers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RESOLVED</p>
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>Aggregates data by spatial dimension, equivalent to Group By in SQL. Valid values:</p>
         * <ul>
         * <li><code>product</code>: aggregates by Alibaba Cloud service.</li>
         * <li><code>level</code>: aggregates by alert level.</li>
         * <li><code>groupId</code>: aggregates by application group.</li>
         * <li><code>contactGroup</code>: aggregates by alert contact group.</li>
         * <li><code>product,metricName</code>: aggregates by Alibaba Cloud service and metric.</li>
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
         * <p>The application group ID.</p>
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
         * <p>The period for obtaining logs. Unit: minutes.</p>
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
         * <p>The alert level and notification method. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;- P2: phone call + text message + email + DingTalk chatbot.</p>
         * <p>&lt;props=&quot;china&quot;&gt;- P3: text message + email + DingTalk chatbot.</p>
         * <p>&lt;props=&quot;china&quot;&gt;- P4: email + DingTalk chatbot.</p>
         * <p>&lt;props=&quot;china&quot;&gt;- OK: no alert.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;- P4: email + DingTalk chatbot.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;- OK: no alert.</p>
         * <p>&lt;props=&quot;partner&quot;&gt;- P4: email + DingTalk chatbot.</p>
         * <p>&lt;props=&quot;partner&quot;&gt;- OK: no alert.</p>
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
         * <p>The metric name.</p>
         * <blockquote>
         * <p>For information about the metrics of Alibaba Cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Metrics</a>.</p>
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
         * <p>The namespace of the Alibaba Cloud service.</p>
         * <blockquote>
         * <p>For information about the namespaces of Alibaba Cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Metrics</a>.</p>
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
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
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
         * <p>The alert rule ID.</p>
         * <p>For information about how to obtain the alert rule ID, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ae06917_75a8c43178ab66****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The alert rule name.</p>
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
         * <p>The keyword for searching alert history.</p>
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
         * <li>0: An alert is triggered or the alert recovers to Normal.</li>
         * <li>1: The alert is not in the effective period.</li>
         * <li>2: The mute for epoch.</li>
         * <li>3: The host is restarting.</li>
         * <li>4: Alerts are not send.</li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;When the alert status is 0, if the value of Level is P2, P3, or P4, an alert is triggered. If the value of Level is OK, the alert recovers to Normal.
         * &lt;props=&quot;intl&quot;&gt;When the alert status is 0, if the value of Level is P4, an alert is triggered. If the value of Level is OK, the alert recovers to Normal.
         * &lt;props=&quot;partner&quot;&gt;When the alert status is 0, if the value of Level is P4, an alert is triggered. If the value of Level is OK, the alert recovers to Normal.</p>
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
         * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not need to be specified.</p>
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
         * <p>The start timestamp for querying alert history.</p>
         * <p>Unit: milliseconds.</p>
         * <blockquote>
         * <ul>
         * <li>You can query only the alert history within the last year.</li>
         * <li>The interval between the start time (StartTime) and end time (EndTime) must be less than or equal to 15 days.</li>
         * </ul>
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
        public DescribeAlertLogHistogramRequest build() {
            return new DescribeAlertLogHistogramRequest(this);
        } 

    } 

}
