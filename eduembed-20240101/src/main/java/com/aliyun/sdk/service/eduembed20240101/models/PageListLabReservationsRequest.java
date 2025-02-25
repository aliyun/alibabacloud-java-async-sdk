// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduembed20240101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageListLabReservationsRequest} extends {@link RequestModel}
 *
 * <p>PageListLabReservationsRequest</p>
 */
public class PageListLabReservationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private Long accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    private PageListLabReservationsRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageListLabReservationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<PageListLabReservationsRequest, Builder> {
        private Long accountId; 
        private Long page; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(PageListLabReservationsRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.page = request.page;
            this.pageSize = request.pageSize;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(Long accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public PageListLabReservationsRequest build() {
            return new PageListLabReservationsRequest(this);
        } 

    } 

}
