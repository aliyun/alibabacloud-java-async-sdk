// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertLogCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertLogCountRequest</p>
 */
public class DescribeAlertLogCountRequest extends Request {
    @Query
    @NameInMap("ContactGroup")
    private String contactGroup;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("GroupBy")
    @Validation(required = true)
    private String groupBy;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("LastMin")
    private String lastMin;

    @Query
    @NameInMap("Level")
    private String level;

    @Query
    @NameInMap("MetricName")
    private String metricName;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Product")
    private String product;

    @Query
    @NameInMap("RuleId")
    private String ruleId;

    @Query
    @NameInMap("RuleName")
    private String ruleName;

    @Query
    @NameInMap("SearchKey")
    private String searchKey;

    @Query
    @NameInMap("SendStatus")
    private String sendStatus;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    @Query
    @NameInMap("StartTime")
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
         * The alert group.
         */
        public Builder contactGroup(String contactGroup) {
            this.putQueryParameter("ContactGroup", contactGroup);
            this.contactGroup = contactGroup;
            return this;
        }

        /**
         * The end timestamp of the alert logs to be queried.
         * <p>
         * 
         * Unit: milliseconds.
         * 
         * You can query only the alert logs within the last year. If the query time is longer than one year, the return value of the `AlertLogCount` parameter is empty.
         * 
         * >  The interval between the start time (StartTime) and end time (EndTime) must be less than or equal to 15 days. The start time and end time must be specified or left empty at the same time. If you do not specify the start time and end time, the alert logs within the last 15 minutes are queried by default.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The type of the alert event. Valid values:
         * <p>
         * 
         * *   TRIGGERED: The alert is triggered.
         * *   RESOLVED: The alert is resolved.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * The dimension based on which data is aggregated. This parameter is similar to the Group By clause of SQL statements. Valid values:
         * <p>
         * 
         * *   `product`: aggregates data by cloud service.
         * *   `level`: aggregates data by alert level.
         * *   `groupId`: aggregates data by application group.
         * *   `contactGroup`: aggregates data by alert group.
         * *   `product,metricName`: aggregates data both by cloud service and by metric.
         */
        public Builder groupBy(String groupBy) {
            this.putQueryParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * The ID of the application group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The statistical period of alert logs. Unit: minutes.
         */
        public Builder lastMin(String lastMin) {
            this.putQueryParameter("LastMin", lastMin);
            this.lastMin = lastMin;
            return this;
        }

        /**
         * The level and notification method of the alert. Valid values:
         * <p>
         * 
         * *   P4: Alert notifications are sent by using emails and DingTalk chatbots.
         * *   OK: No alert is generated.
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * The name of the metric.
         * <p>
         * 
         * >  For more information about the metrics of different cloud services, see [Appendix 1: Metrics](~~163515~~).
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
         * >  For more information about the namespaces of cloud services, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL. Valid values:
         * <p>
         * 
         * *   `product`: aggregates data by cloud service.
         * *   `level`: aggregates data by alert level.
         * *   `groupId`: aggregates data by application group.
         * *   `contactGroup`: aggregates data by alert contact group.
         * *   `product,metricName`: aggregates data both by cloud service and by metric.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The abbreviation of the service name.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * The ID of the alert rule.
         * <p>
         * 
         * For more information about how to obtain the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The name of the alert rule.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The keyword based on which the alert logs to be counted are searched.
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * The status of the alert. Valid values:
         * <p>
         * 
         * *   0: The alert is triggered or cleared.
         * *   1: The alert is generated not during the effective period.
         * *   2: The alert is muted and not triggered in a specified period.
         * *   3: The host is restarting.
         * *   4: Notifications are not sent for the alert.
         * 
         * When the value of the SendStatus parameter is 0, the value P4 of the Level parameter indicates a triggered alert and the value OK indicates a cleared alert.
         */
        public Builder sendStatus(String sendStatus) {
            this.putQueryParameter("SendStatus", sendStatus);
            this.sendStatus = sendStatus;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * The start timestamp of the alert logs to be queried.
         * <p>
         * 
         * Unit: milliseconds.
         * 
         * You can query only the alert logs within the last year. If the query time is longer than one year, the return value of the `AlertLogCount` parameter is empty.
         * 
         * >  The interval between the start time (StartTime) and end time (EndTime) must be less than or equal to 15 days. The start time and end time must be specified or left empty at the same time. If you do not specify the start time and end time, the alert logs within the last 15 minutes are queried by default.
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
