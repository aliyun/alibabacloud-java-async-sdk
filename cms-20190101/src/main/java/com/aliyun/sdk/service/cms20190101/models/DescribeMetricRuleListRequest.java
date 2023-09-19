// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricRuleListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricRuleListRequest</p>
 */
public class DescribeMetricRuleListRequest extends Request {
    @Query
    @NameInMap("AlertState")
    private String alertState;

    @Query
    @NameInMap("Dimensions")
    private String dimensions;

    @Query
    @NameInMap("EnableState")
    private Boolean enableState;

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
    @NameInMap("RuleIds")
    private String ruleIds;

    @Query
    @NameInMap("RuleName")
    private String ruleName;

    private DescribeMetricRuleListRequest(Builder builder) {
        super(builder);
        this.alertState = builder.alertState;
        this.dimensions = builder.dimensions;
        this.enableState = builder.enableState;
        this.groupId = builder.groupId;
        this.metricName = builder.metricName;
        this.namespace = builder.namespace;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.ruleIds = builder.ruleIds;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricRuleListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertState
     */
    public String getAlertState() {
        return this.alertState;
    }

    /**
     * @return dimensions
     */
    public String getDimensions() {
        return this.dimensions;
    }

    /**
     * @return enableState
     */
    public Boolean getEnableState() {
        return this.enableState;
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
     * @return ruleIds
     */
    public String getRuleIds() {
        return this.ruleIds;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<DescribeMetricRuleListRequest, Builder> {
        private String alertState; 
        private String dimensions; 
        private Boolean enableState; 
        private String groupId; 
        private String metricName; 
        private String namespace; 
        private Integer page; 
        private Integer pageSize; 
        private String ruleIds; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricRuleListRequest request) {
            super(request);
            this.alertState = request.alertState;
            this.dimensions = request.dimensions;
            this.enableState = request.enableState;
            this.groupId = request.groupId;
            this.metricName = request.metricName;
            this.namespace = request.namespace;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.ruleIds = request.ruleIds;
            this.ruleName = request.ruleName;
        } 

        /**
         * The status of the alert rule. Valid values:
         * <p>
         * 
         * *   OK: The alert rule has no active alerts.
         * *   ALARM: The alert rule has active alerts.
         * *   INSUFFICIENT_DATA: No data is available.
         */
        public Builder alertState(String alertState) {
            this.putQueryParameter("AlertState", alertState);
            this.alertState = alertState;
            return this;
        }

        /**
         * The monitoring dimensions of the specified resource.
         * <p>
         * 
         * Set the value to a collection of `key:value` pairs. Example: `{"userId":"120886317861****"}` or `{"instanceId":"i-2ze2d6j5uhg20x47****"}`.
         */
        public Builder dimensions(String dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * Specifies whether to query enabled or disabled alert rules. Valid values:
         * <p>
         * 
         * *   true: queries enabled alert rules.
         * *   false: queries disabled alert rules.
         */
        public Builder enableState(Boolean enableState) {
            this.putQueryParameter("EnableState", enableState);
            this.enableState = enableState;
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
         * The name of the metric.
         * <p>
         * 
         * For information about how to obtain the name of a metric, see [DescribeMetricMetaList](~~98846~~) or [Appendix 1: Metrics](~~163515~~).
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
         * For information about how to obtain the namespace of a cloud service, see [DescribeMetricMetaList](~~98846~~) or [Appendix 1: Metrics](~~163515~~).
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The page number of the page to return.
         * <p>
         * 
         * Minimum value: 1. Default value: 1.
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
         * Minimum value: 1. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the alert rule. You can specify up to 20 IDs at a time. Separate multiple IDs with commas (,).
         */
        public Builder ruleIds(String ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        /**
         * The name of the alert rule.
         * <p>
         * 
         * This parameter supports fuzzy match.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public DescribeMetricRuleListRequest build() {
            return new DescribeMetricRuleListRequest(this);
        } 

    } 

}
