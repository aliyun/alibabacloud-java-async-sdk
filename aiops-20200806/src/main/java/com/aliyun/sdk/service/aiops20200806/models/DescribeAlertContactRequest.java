// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertContactRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertContactRequest</p>
 */
public class DescribeAlertContactRequest extends Request {
    @Body
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("SearchBy")
    private String searchBy;

    @Body
    @NameInMap("SearchLike")
    private String searchLike;

    private DescribeAlertContactRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
        this.searchBy = builder.searchBy;
        this.searchLike = builder.searchLike;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertContactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchBy
     */
    public String getSearchBy() {
        return this.searchBy;
    }

    /**
     * @return searchLike
     */
    public String getSearchLike() {
        return this.searchLike;
    }

    public static final class Builder extends Request.Builder<DescribeAlertContactRequest, Builder> {
        private Integer currentPage; 
        private String operaUid; 
        private Integer pageSize; 
        private String searchBy; 
        private String searchLike; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertContactRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
            this.searchBy = request.searchBy;
            this.searchLike = request.searchLike;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SearchBy.
         */
        public Builder searchBy(String searchBy) {
            this.putBodyParameter("SearchBy", searchBy);
            this.searchBy = searchBy;
            return this;
        }

        /**
         * SearchLike.
         */
        public Builder searchLike(String searchLike) {
            this.putBodyParameter("SearchLike", searchLike);
            this.searchLike = searchLike;
            return this;
        }

        @Override
        public DescribeAlertContactRequest build() {
            return new DescribeAlertContactRequest(this);
        } 

    } 

}
