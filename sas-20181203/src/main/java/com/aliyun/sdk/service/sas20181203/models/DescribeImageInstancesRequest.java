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
         * <p>Specifies the conditions for searching assets. This parameter is in JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>name</strong>: The search criterion.</li>
         * <li><strong>value</strong>: The value of the search criterion.</li>
         * <li><strong>logicalExp</strong>: The logical relationship among multiple search criterion values. Valid values:<ul>
         * <li><strong>OR</strong>: indicates that the logical relationship among multiple search criterion values is <strong>OR</strong>.</li>
         * <li><strong>AND</strong>: indicates that the logical relationship among multiple search criterion values is <strong>AND</strong>.<blockquote>
         * <p>You can call the <a href="~~DescribeImageCriteria~~">DescribeImageCriteria</a> operation to query the supported search criteria.</p>
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
         * <p>Specifies the page number of the page to return. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
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
         * <p>Specifies the logical relationship among multiple search criteria. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong>: indicates that the logical relationship among multiple search criteria is <strong>OR</strong>.</li>
         * <li><strong>AND</strong>: indicates that the logical relationship among multiple search criteria is <strong>AND</strong>.</li>
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
         * <p>Specifies the maximum number of entries to return on each page in a paging query. The default number of entries returned per page is 20. If the PageSize parameter is left empty, 20 entries are returned by default.</p>
         * <blockquote>
         * <p>Specify a value for this parameter.</p>
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
         * <p>Specifies whether the image has been scanned. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The image has been scanned.</li>
         * <li><strong>false</strong>: The image has not been scanned.</li>
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
