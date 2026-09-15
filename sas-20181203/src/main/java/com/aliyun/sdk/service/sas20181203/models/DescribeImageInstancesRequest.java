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
 * {@link DescribeImageInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageInstancesRequest</p>
 */
public class DescribeImageInstancesRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scanned")
    private Boolean scanned;

    private DescribeImageInstancesRequest(Builder builder) {
        super(builder);
        this.criteria = builder.criteria;
        this.currentPage = builder.currentPage;
        this.logicalExp = builder.logicalExp;
        this.pageSize = builder.pageSize;
        this.scanned = builder.scanned;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageInstancesRequest create() {
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

    /**
     * @return scanned
     */
    public Boolean getScanned() {
        return this.scanned;
    }

    public static final class Builder extends Request.Builder<DescribeImageInstancesRequest, Builder> {
        private String criteria; 
        private Integer currentPage; 
        private String logicalExp; 
        private Integer pageSize; 
        private Boolean scanned; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageInstancesRequest request) {
            super(request);
            this.criteria = request.criteria;
            this.currentPage = request.currentPage;
            this.logicalExp = request.logicalExp;
            this.pageSize = request.pageSize;
            this.scanned = request.scanned;
        } 

        /**
         * <p>Sets the conditions for searching assets. This parameter is in JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>name</strong>: The search item.</li>
         * <li><strong>value</strong>: The value of the search item.</li>
         * <li><strong>logicalExp</strong>: The logical relationship between multiple search item values. Valid values:<ul>
         * <li><strong>OR</strong>: The multiple search item values are in an <strong>OR</strong> relationship.</li>
         * <li><strong>AND</strong>: The multiple search item values are in an <strong>AND</strong> relationship.<blockquote>
         * <p>You can call the <a href="~~DescribeImageRepoCriteria~~">DescribeImageRepoCriteria</a> operation to query supported search conditions.</p>
         * </blockquote>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;instanceId&quot;,&quot;value&quot;:&quot;390100182&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}]</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>The page number of the returned results to start displaying. The starting value is <strong>1</strong>. Default value: <strong>1</strong>, which indicates that page 1 is displayed.</p>
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
         * <p>Sets the logical relationship between multiple search conditions. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong>: The multiple search conditions are in an <strong>OR</strong> relationship.</li>
         * <li><strong>AND</strong>: The multiple search conditions are in an <strong>AND</strong> relationship.</li>
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
         * <p>The maximum number of entries to return on each page during a paged query. The default number of entries per page is 20. If the PageSize parameter is left empty, 20 entries are returned by default.</p>
         * <blockquote>
         * <p>We recommend that you do not leave the PageSize parameter empty.</p>
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

        /**
         * <p>Indicates whether the image has been scanned. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: processed.</li>
         * <li><strong>false</strong>: not processed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder scanned(Boolean scanned) {
            this.putQueryParameter("Scanned", scanned);
            this.scanned = scanned;
            return this;
        }

        @Override
        public DescribeImageInstancesRequest build() {
            return new DescribeImageInstancesRequest(this);
        } 

    } 

}
