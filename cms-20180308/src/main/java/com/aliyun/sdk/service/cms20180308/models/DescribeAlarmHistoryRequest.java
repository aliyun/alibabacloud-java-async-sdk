// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link DescribeAlarmHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlarmHistoryRequest</p>
 */
public class DescribeAlarmHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertName")
    private String alertName;

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
    @com.aliyun.core.annotation.NameInMap("OnlyCount")
    private Boolean onlyCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

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

    private DescribeAlarmHistoryRequest(Builder builder) {
        super(builder);
        this.alertName = builder.alertName;
        this.ascending = builder.ascending;
        this.endTime = builder.endTime;
        this.groupId = builder.groupId;
        this.metricName = builder.metricName;
        this.namespace = builder.namespace;
        this.onlyCount = builder.onlyCount;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.ruleName = builder.ruleName;
        this.startTime = builder.startTime;
        this.state = builder.state;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertName
     */
    public String getAlertName() {
        return this.alertName;
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
     * @return onlyCount
     */
    public Boolean getOnlyCount() {
        return this.onlyCount;
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

    public static final class Builder extends Request.Builder<DescribeAlarmHistoryRequest, Builder> {
        private String alertName; 
        private Boolean ascending; 
        private String endTime; 
        private String groupId; 
        private String metricName; 
        private String namespace; 
        private Boolean onlyCount; 
        private Integer page; 
        private Integer pageSize; 
        private String ruleName; 
        private String startTime; 
        private String state; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlarmHistoryRequest request) {
            super(request);
            this.alertName = request.alertName;
            this.ascending = request.ascending;
            this.endTime = request.endTime;
            this.groupId = request.groupId;
            this.metricName = request.metricName;
            this.namespace = request.namespace;
            this.onlyCount = request.onlyCount;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.ruleName = request.ruleName;
            this.startTime = request.startTime;
            this.state = request.state;
            this.status = request.status;
        } 

        /**
         * AlertName.
         */
        public Builder alertName(String alertName) {
            this.putQueryParameter("AlertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * Ascending.
         */
        public Builder ascending(Boolean ascending) {
            this.putQueryParameter("Ascending", ascending);
            this.ascending = ascending;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * MetricName.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * OnlyCount.
         */
        public Builder onlyCount(Boolean onlyCount) {
            this.putQueryParameter("OnlyCount", onlyCount);
            this.onlyCount = onlyCount;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeAlarmHistoryRequest build() {
            return new DescribeAlarmHistoryRequest(this);
        } 

    } 

}
