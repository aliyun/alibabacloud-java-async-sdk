// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMetricRuleListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricRuleListRequest</p>
 */
public class DescribeMetricRuleListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertState")
    private String alertState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private String dimensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableState")
    private Boolean enableState;

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
    @com.aliyun.core.annotation.NameInMap("RuleIds")
    private String ruleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
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
         * <p>The status of the alert rule. Valid values:</p>
         * <ul>
         * <li>OK: The alert rule has no active alerts.</li>
         * <li>ALARM: The alert rule has active alerts.</li>
         * <li>INSUFFICIENT_DATA: No data is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder alertState(String alertState) {
            this.putQueryParameter("AlertState", alertState);
            this.alertState = alertState;
            return this;
        }

        /**
         * <p>The monitoring dimensions of the specified resource.</p>
         * <p>Set the value to a collection of <code>key:value</code> pairs. Example: <code>{&quot;userId&quot;:&quot;120886317861****&quot;}</code> or <code>{&quot;instanceId&quot;:&quot;i-2ze2d6j5uhg20x47****&quot;}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;instanceId&quot;:&quot;i-2ze2d6j5uhg20x47****&quot;}</p>
         */
        public Builder dimensions(String dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>Specifies whether to query enabled or disabled alert rules. Valid values:</p>
         * <ul>
         * <li>true: queries enabled alert rules.</li>
         * <li>false: queries disabled alert rules.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableState(Boolean enableState) {
            this.putQueryParameter("EnableState", enableState);
            this.enableState = enableState;
            return this;
        }

        /**
         * <p>The ID of the application group.</p>
         * <p>For information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
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
         * <p>The name of the metric.</p>
         * <p>For information about how to obtain the name of a metric, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
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
         * <p>For information about how to obtain the namespace of a cloud service, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
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
         * <p>The page number of the page to return.</p>
         * <p>Minimum value: 1. Default value: 1.</p>
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
         * <p>Minimum value: 1. Default value: 10.</p>
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
         * <p>The ID of the alert rule. You can specify up to 20 IDs at a time. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>applyTemplate344cfd42-0f32-4fd6-805a-88d7908a****</p>
         */
        public Builder ruleIds(String ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        /**
         * <p>The name of the alert rule.</p>
         * <p>This parameter supports fuzzy match.</p>
         * 
         * <strong>example:</strong>
         * <p>Rule_01</p>
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
