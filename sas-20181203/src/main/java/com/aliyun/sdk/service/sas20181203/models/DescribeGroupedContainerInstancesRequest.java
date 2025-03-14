// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeGroupedContainerInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupedContainerInstancesRequest</p>
 */
public class DescribeGroupedContainerInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldValue")
    private String fieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupField")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalExp")
    private String logicalExp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private DescribeGroupedContainerInstancesRequest(Builder builder) {
        super(builder);
        this.criteria = builder.criteria;
        this.currentPage = builder.currentPage;
        this.fieldValue = builder.fieldValue;
        this.groupField = builder.groupField;
        this.logicalExp = builder.logicalExp;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupedContainerInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return fieldValue
     */
    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * @return groupField
     */
    public String getGroupField() {
        return this.groupField;
    }

    /**
     * @return logicalExp
     */
    public String getLogicalExp() {
        return this.logicalExp;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeGroupedContainerInstancesRequest, Builder> {
        private String criteria; 
        private Integer currentPage; 
        private String fieldValue; 
        private String groupField; 
        private String logicalExp; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupedContainerInstancesRequest request) {
            super(request);
            this.criteria = request.criteria;
            this.currentPage = request.currentPage;
            this.fieldValue = request.fieldValue;
            this.groupField = request.groupField;
            this.logicalExp = request.logicalExp;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The search conditions for assets. Specify the value in the JSON format. Separate multiple search conditions with commas (,). Example: <code>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;riskLevel&quot;,&quot;value&quot;:&quot;2&quot;}]</code>.</p>
         * <blockquote>
         * <p> Supported search conditions include the instance ID, instance name, virtual private cloud (VPC) ID, region, and public IP address. You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported search conditions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;riskLevel&quot;,&quot;value&quot;:&quot;2&quot;}]</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The keyword that you want to use to query containers. This parameter depends on the value of the GroupField parameter.</p>
         * <ul>
         * <li>If the <strong>GroupField</strong> parameter is set to <strong>pod</strong>, set this parameter to the name of the pod that you want to query.</li>
         * <li>If the <strong>GroupField</strong> parameter is set to <strong>appName</strong>, set this parameter to the name of the application that you want to query.</li>
         * <li>If the <strong>GroupField</strong> parameter is set to <strong>namespace</strong>, set this parameter to the namespace that you want to query.</li>
         * <li>If the <strong>GroupField</strong> parameter is set to <strong>clusterId</strong>, set this parameter to the ID of the cluster that you want to query.</li>
         * <li>If the <strong>GroupField</strong> parameter is set to <strong>image</strong>, set this parameter to the name of the image that you want to query.</li>
         * </ul>
         * <blockquote>
         * <p> Fuzzy match is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cas-adad-qeqwe</p>
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("FieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * <p>The group type that you want to use to query containers. Valid values:</p>
         * <ul>
         * <li><strong>pod</strong></li>
         * <li><strong>appName</strong></li>
         * <li><strong>namespace</strong></li>
         * <li><strong>clusterId</strong></li>
         * <li><strong>image</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pod</p>
         */
        public Builder groupField(String groupField) {
            this.putQueryParameter("GroupField", groupField);
            this.groupField = groupField;
            return this;
        }

        /**
         * <p>The logical relationship that you want to use to evaluate multiple search conditions. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong>: Search conditions are evaluated by using a logical <strong>OR</strong>.</li>
         * <li><strong>AND</strong>: Search conditions are evaluated by using a logical <strong>AND</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        public Builder logicalExp(String logicalExp) {
            this.putQueryParameter("LogicalExp", logicalExp);
            this.logicalExp = logicalExp;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
         * <blockquote>
         * <p> We recommend that you do not leave this parameter empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeGroupedContainerInstancesRequest build() {
            return new DescribeGroupedContainerInstancesRequest(this);
        } 

    } 

}
