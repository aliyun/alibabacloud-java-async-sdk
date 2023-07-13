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
            this.dimensions = request.dimensions;
            this.groupId = request.groupId;
            this.namespace = request.namespace;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.ruleId = request.ruleId;
        } 

        /**
         * The namespace of the cloud service.
         * <p>
         * 
         * For more information about the namespaces of cloud services, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder dimensions(String dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The resources that are monitored.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The timestamp when the last alert was triggered for the resource based on the alert rule.
         * <p>
         * 
         * Unit: milliseconds.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **DescribeAlertingMetricRuleResources**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The operator that is used to compare the metric value with the threshold. Valid values:
         * <p>
         * 
         * *   `>=`
         * *   `=`
         * *   `<=`
         * *   `>`
         * *   `<`
         * *   `!=`
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
