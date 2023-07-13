// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertLogListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertLogListRequest</p>
 */
public class DescribeAlertLogListRequest extends Request {
    @Query
    @NameInMap("ContactGroup")
    private String contactGroup;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("GroupBy")
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
    @NameInMap("StartTime")
    private Long startTime;

    private DescribeAlertLogListRequest(Builder builder) {
        super(builder);
        this.contactGroup = builder.contactGroup;
        this.endTime = builder.endTime;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeAlertLogListRequest, Builder> {
        private String contactGroup; 
        private Long endTime; 
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
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertLogListRequest request) {
            super(request);
            this.contactGroup = request.contactGroup;
            this.endTime = request.endTime;
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
            this.startTime = request.startTime;
        } 

        /**
         * The start timestamp of the alert logs to be queried. Unit: milliseconds.
         */
        public Builder contactGroup(String contactGroup) {
            this.putQueryParameter("ContactGroup", contactGroup);
            this.contactGroup = contactGroup;
            return this;
        }

        /**
         * The alert contact group.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The alert information in a JSON string.
         */
        public Builder groupBy(String groupBy) {
            this.putQueryParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **DescribeAlertLogList**.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The name of the blacklist policy.
         */
        public Builder lastMin(String lastMin) {
            this.putQueryParameter("LastMin", lastMin);
            this.lastMin = lastMin;
            return this;
        }

        /**
         * The webhook URLs of alert contacts.
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * The message returned for the alert callback.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * Indicates whether the call was successful.
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The severity level and notification methods of the alert. Valid values:
         * <p>
         * 
         * *   P4: Alert notifications are sent by using emails and DingTalk chatbots.
         * 
         * <!---->
         * 
         * *   OK: No alert is generated.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The email addresses of alert contacts.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * The phone numbers of alert contacts that can receive alert text messages.
         * <p>
         * 
         * >  This parameter can be returned only on the China site (aliyun.com).
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The identifier of the cloud service. Valid values:
         * <p>
         * 
         * *   If the cloud service is provided by Alibaba Cloud, the abbreviation of the service name is returned. Example: ECS.
         * *   If the cloud service is not provided by Alibaba Cloud, a value in the `acs_Service keyword` format is returned. Example: acs_networkmonitor.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The ID of the log.
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * The sending results of alert notifications.
         */
        public Builder sendStatus(String sendStatus) {
            this.putQueryParameter("SendStatus", sendStatus);
            this.sendStatus = sendStatus;
            return this;
        }

        /**
         * Indicates whether the alert level was changed. Valid values:
         * <p>
         * 
         * *   `P4->OK`: The alert level was changed from P4 to OK.
         * *   `P4->P4`: The alert level was still P4.
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
