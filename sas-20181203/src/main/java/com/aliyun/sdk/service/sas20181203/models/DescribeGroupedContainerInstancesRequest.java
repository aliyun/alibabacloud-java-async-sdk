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
    @com.aliyun.core.annotation.NameInMap("IncludeMulticloud")
    private Boolean includeMulticloud;

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
        this.includeMulticloud = builder.includeMulticloud;
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
     * @return includeMulticloud
     */
    public Boolean getIncludeMulticloud() {
        return this.includeMulticloud;
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
        private Boolean includeMulticloud; 
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
            this.includeMulticloud = request.includeMulticloud;
            this.logicalExp = request.logicalExp;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The conditions for searching assets. The value is in JSON format. Separate multiple conditions with commas (,). Example: <code>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;riskLevel&quot;,&quot;value&quot;:&quot;2&quot;}]</code>.</p>
         * <blockquote>
         * <p>You can search for assets by using conditions such as the instance ID, instance name, VPC ID, region, and public IP address. You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported search conditions.</p>
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
         * <p>The page number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>The search condition for different group types. Specify the search condition based on the value of GroupField:</p>
         * <ul>
         * <li>If <strong>GroupField</strong> is set to <strong>pod</strong>, specify the name of the pod to query.</li>
         * <li>If <strong>GroupField</strong> is set to <strong>appName</strong>, specify the name of the application to query.</li>
         * <li>If <strong>GroupField</strong> is set to <strong>namespace</strong>, specify the namespace to query.</li>
         * <li>If <strong>GroupField</strong> is set to <strong>clusterId</strong>, specify the ID of the cluster to query.</li>
         * <li>If <strong>GroupField</strong> is set to <strong>image</strong>, specify the name of the image to query.<blockquote>
         * <p>Fuzzy search is supported for all the preceding search conditions.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The group type to query. Valid values:</p>
         * <ul>
         * <li><strong>pod</strong>: pod.</li>
         * <li><strong>appName</strong>: application name.</li>
         * <li><strong>namespace</strong>: namespace.</li>
         * <li><strong>clusterId</strong>: cluster ID.</li>
         * <li><strong>image</strong>: image.</li>
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
         * <p>Specifies whether to enable the unified multi-cloud directory. This parameter takes effect only when GroupField is set to clusterId. If this parameter is omitted or set to false, the historical query logic is used.</p>
         */
        public Builder includeMulticloud(Boolean includeMulticloud) {
            this.putQueryParameter("IncludeMulticloud", includeMulticloud);
            this.includeMulticloud = includeMulticloud;
            return this;
        }

        /**
         * <p>The logical relationship among multiple search conditions. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong>: The logical relationship among multiple conditions is <strong>OR</strong>.</li>
         * <li><strong>AND</strong>: The logical relationship among multiple conditions is <strong>AND</strong>.</li>
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
         * <p>Settings for paging in a paged query, specifying the number of container assets to return on each page. Default value: <strong>20</strong>, which indicates that 20 container asset entries are displayed on each page.</p>
         * <blockquote>
         * <p>Do not leave PageSize empty.</p>
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
