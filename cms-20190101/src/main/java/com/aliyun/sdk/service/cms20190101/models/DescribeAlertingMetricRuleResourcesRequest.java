// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertingMetricRuleResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertingMetricRuleResourcesRequest</p>
 */
public class DescribeAlertingMetricRuleResourcesRequest extends Request {
    @Query
    @NameInMap("AlertBeforeTime")
    private String alertBeforeTime;

    @Query
    @NameInMap("Dimensions")
    private String dimensions;

    @Query
    @NameInMap("GroupId")
    private String groupId;

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
    @NameInMap("RuleId")
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
         * Queries the alerts that were triggered before the specified time. Timestamps in milliseconds are supported.
         */
        public Builder alertBeforeTime(String alertBeforeTime) {
            this.putQueryParameter("AlertBeforeTime", alertBeforeTime);
            this.alertBeforeTime = alertBeforeTime;
            return this;
        }

        /**
         * The dimensions that specify the resources whose monitoring data you want to query.
         */
        public Builder dimensions(String dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * The ID of the application group. For information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The namespace of the cloud service.
         * <p>
         * 
         * For more information about the namespaces of cloud services, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The page number.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the alert rule. For information about how to obtain the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).
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
