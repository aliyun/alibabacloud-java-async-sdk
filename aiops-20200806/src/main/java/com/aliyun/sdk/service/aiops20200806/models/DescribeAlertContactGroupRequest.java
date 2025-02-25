// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertContactGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertContactGroupRequest</p>
 */
public class DescribeAlertContactGroupRequest extends Request {
    @Body
    @NameInMap("CurrentPage")
    private Long currentPage;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("PageSize")
    private Long pageSize;

    @Body
    @NameInMap("SearchLike")
    private String searchLike;

    private DescribeAlertContactGroupRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
        this.searchLike = builder.searchLike;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertContactGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
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
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchLike
     */
    public String getSearchLike() {
        return this.searchLike;
    }

    public static final class Builder extends Request.Builder<DescribeAlertContactGroupRequest, Builder> {
        private Long currentPage; 
        private String operaUid; 
        private Long pageSize; 
        private String searchLike; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertContactGroupRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
            this.searchLike = request.searchLike;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
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
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public DescribeAlertContactGroupRequest build() {
            return new DescribeAlertContactGroupRequest(this);
        } 

    } 

}
