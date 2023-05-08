// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageRepoDetailListRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageRepoDetailListRequest</p>
 */
public class DescribeImageRepoDetailListRequest extends Request {
    @Query
    @NameInMap("Criteria")
    private String criteria;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("LogicalExp")
    private String logicalExp;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private DescribeImageRepoDetailListRequest(Builder builder) {
        super(builder);
        this.criteria = builder.criteria;
        this.currentPage = builder.currentPage;
        this.logicalExp = builder.logicalExp;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageRepoDetailListRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeImageRepoDetailListRequest, Builder> {
        private String criteria; 
        private Integer currentPage; 
        private String logicalExp; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageRepoDetailListRequest request) {
            super(request);
            this.criteria = request.criteria;
            this.currentPage = request.currentPage;
            this.logicalExp = request.logicalExp;
            this.pageSize = request.pageSize;
        } 

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder logicalExp(String logicalExp) {
            this.putQueryParameter("LogicalExp", logicalExp);
            this.logicalExp = logicalExp;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeImageRepoDetailListRequest build() {
            return new DescribeImageRepoDetailListRequest(this);
        } 

    } 

}
