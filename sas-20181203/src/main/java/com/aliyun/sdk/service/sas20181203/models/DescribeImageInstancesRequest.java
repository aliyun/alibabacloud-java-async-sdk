// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The search condition that is used to filter the server. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   **name**: the search condition
         * 
         * *   **name**: the value of the search condition
         * 
         * *   **logicalExp**: the logical relation for multiple search conditions Valid values:
         * 
         *     *   **OR**: The search conditions use a logical **OR**.
         *     *   **AND**: The search conditions use a logical **AND**.
         * 
         * > You can call the [DescribeImageCriteria](~~471822~~) operation to query the supported search conditions.
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page **1**. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The logical relationship that you want to use to evaluate multiple search conditions. Valid values:
         * <p>
         * 
         * *   **OR**: The search conditions are evaluated by using a logical **OR**.
         * *   **AND**: The search conditions are evaluated by using a logical **AND**.
         */
        public Builder logicalExp(String logicalExp) {
            this.putQueryParameter("LogicalExp", logicalExp);
            this.logicalExp = logicalExp;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
         * <p>
         * 
         * > : We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Specifies whether the image is scanned. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
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
