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
 * {@link DescribeContainerInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeContainerInstancesRequest</p>
 */
public class DescribeContainerInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalExp")
    private String logicalExp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private DescribeContainerInstancesRequest(Builder builder) {
        super(builder);
        this.criteria = builder.criteria;
        this.currentPage = builder.currentPage;
        this.logicalExp = builder.logicalExp;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerInstancesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeContainerInstancesRequest, Builder> {
        private String criteria; 
        private Integer currentPage; 
        private String logicalExp; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContainerInstancesRequest request) {
            super(request);
            this.criteria = request.criteria;
            this.currentPage = request.currentPage;
            this.logicalExp = request.logicalExp;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The search conditions that are used to filter containers. The value of this parameter is in the JSON format and is case-sensitive. The value contains the following fields:</p>
         * <ul>
         * <li><p><strong>name</strong>: the search condition.</p>
         * </li>
         * <li><p><strong>name</strong>: the value of the search condition.</p>
         * </li>
         * <li><p><strong>logicalExp</strong>: the logical relationship among multiple search conditions. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong>: Search conditions are evaluated by using a logical <strong>OR</strong>.</li>
         * <li><strong>AND</strong>: Search conditions are evaluated by using a logical <strong>AND</strong>.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can use search conditions such as the container ID, cluster ID, cluster name, cluster type, risk level, and region. You can call the <a href="~~DescribeContainerCriteria~~">DescribeContainerCriteria</a> operation to query the supported search conditions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;flag&quot;,&quot;value&quot;:&quot;0|8&quot;,&quot;logicalExp&quot;:&quot;AND&quot;},{&quot;name&quot;:&quot;ecsType&quot;,&quot;value&quot;:&quot;!8&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}][{&quot;name&quot;:&quot;clusterType&quot;,&quot;value&quot;:&quot;NotManagedKubernetes&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}]</p>
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
         * <p>The logical operator that you want to use to evaluate multiple search conditions. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong>: Search conditions are evaluated by using a logical <strong>OR</strong>.</li>
         * <li><strong>AND</strong>: Search conditions are evaluated by using a logical <strong>AND</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        public Builder logicalExp(String logicalExp) {
            this.putQueryParameter("LogicalExp", logicalExp);
            this.logicalExp = logicalExp;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * <blockquote>
         * <p>We recommend that you do not leave this parameter empty.</p>
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
        public DescribeContainerInstancesRequest build() {
            return new DescribeContainerInstancesRequest(this);
        } 

    } 

}
