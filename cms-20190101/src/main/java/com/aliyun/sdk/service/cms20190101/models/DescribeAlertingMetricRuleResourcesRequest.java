// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAlertingMetricRuleResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertingMetricRuleResourcesRequest</p>
 */
public class DescribeAlertingMetricRuleResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertBeforeTime")
    private String alertBeforeTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private String dimensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

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

    private DescribeAlertingMetricRuleResourcesRequest(Builder builder) {
        super(builder);
        this.alertBeforeTime = builder.alertBeforeTime;
        this.dimensions = builder.dimensions;
        this.groupId = builder.groupId;
        this.namespace = builder.namespace;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertingMetricRuleResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertBeforeTime
     */
    public String getAlertBeforeTime() {
        return this.alertBeforeTime;
    }

    /**
     * @return dimensions
     */
    public String getDimensions() {
        return this.dimensions;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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

    public static final class Builder extends Request.Builder<DescribeAlertingMetricRuleResourcesRequest, Builder> {
        private String alertBeforeTime; 
        private String dimensions; 
        private String groupId; 
        private String namespace; 
        private Integer page; 
        private Integer pageSize; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertingMetricRuleResourcesRequest request) {
            super(request);
            this.alertBeforeTime = request.alertBeforeTime;
            this.dimensions = request.dimensions;
            this.groupId = request.groupId;
            this.namespace = request.namespace;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>Queries the alerts that were triggered before the specified time. Timestamps in milliseconds are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1698827400000</p>
         */
        public Builder alertBeforeTime(String alertBeforeTime) {
            this.putQueryParameter("AlertBeforeTime", alertBeforeTime);
            this.alertBeforeTime = alertBeforeTime;
            return this;
        }

        /**
         * <p>The dimensions that specify the resources whose monitoring data you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;userId&quot;:&quot;120886317861****&quot;,&quot;region&quot;:&quot;cn-huhehaote&quot;,&quot;queue&quot;:&quot;test-0128&quot;}</p>
         */
        public Builder dimensions(String dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The ID of the application group. For information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
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
         * <p>The namespace of the cloud service.</p>
         * <p>For more information about the namespaces of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_mns_new</p>
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
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
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
         * <p>The ID of the alert rule. For information about how to obtain the ID of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>putNewAlarm_user_7e78d765-0e3e-4671-ba6d-7ce39108****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DescribeAlertingMetricRuleResourcesRequest build() {
            return new DescribeAlertingMetricRuleResourcesRequest(this);
        } 

    } 

}
