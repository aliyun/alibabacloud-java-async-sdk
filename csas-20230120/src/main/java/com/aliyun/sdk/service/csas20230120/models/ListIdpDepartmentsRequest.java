// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIdpDepartmentsRequest} extends {@link RequestModel}
 *
 * <p>ListIdpDepartmentsRequest</p>
 */
public class ListIdpDepartmentsRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Long currentPage;

    @Query
    @NameInMap("IdpConfigId")
    @Validation(required = true)
    private String idpConfigId;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Long pageSize;

    private ListIdpDepartmentsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.idpConfigId = builder.idpConfigId;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdpDepartmentsRequest create() {
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
     * @return idpConfigId
     */
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListIdpDepartmentsRequest, Builder> {
        private Long currentPage; 
        private String idpConfigId; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListIdpDepartmentsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.idpConfigId = request.idpConfigId;
            this.pageSize = request.pageSize;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * IdpConfigId.
         */
        public Builder idpConfigId(String idpConfigId) {
            this.putQueryParameter("IdpConfigId", idpConfigId);
            this.idpConfigId = idpConfigId;
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
        public ListIdpDepartmentsRequest build() {
            return new ListIdpDepartmentsRequest(this);
        } 

    } 

}
