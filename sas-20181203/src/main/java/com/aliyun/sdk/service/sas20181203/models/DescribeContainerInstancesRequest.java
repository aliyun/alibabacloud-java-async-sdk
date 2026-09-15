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
         * <p>The search conditions for assets. This parameter is in JSON format. Note that field names are case-sensitive. The following fields are included:</p>
         * <ul>
         * <li><strong>name</strong>: the search item.</li>
         * <li><strong>value</strong>: the value of the search item.</li>
         * <li><strong>logicalExp</strong>: the logical relationship between multiple conditions. Valid values:<ul>
         * <li><strong>OR</strong>: The conditions are in an OR relationship.</li>
         * <li><strong>AND</strong>: The conditions are in an AND relationship.<blockquote>
         * <p>You can search for assets by container ID, cluster ID, cluster name, cluster type, risk level, region, and other conditions. Call the <a href="~~DescribeContainerCriteria~~">DescribeContainerCriteria</a> operation to query the supported search conditions.</p>
         * </blockquote>
         * </li>
         * </ul>
         * </li>
         * </ul>
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
         * <p>The logical relationship between multiple search conditions. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong>: The conditions are in an OR relationship.</li>
         * <li><strong>AND</strong>: The conditions are in an AND relationship.</li>
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
         * <p>The maximum number of entries per page in a paging query. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.</p>
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
        public DescribeContainerInstancesRequest build() {
            return new DescribeContainerInstancesRequest(this);
        } 

    } 

}
